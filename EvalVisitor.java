import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends javaBaseVisitor<Object> {

    private Map<String, Object> memory = new HashMap<>();

    // ------------------------
    // Literais / primário
    // ------------------------
    @Override
    public Object visitPrimario(javaParser.PrimarioContext ctx) {

        if (ctx.NUMERO() != null) {
            return Double.parseDouble(ctx.NUMERO().getText());
        }

        if (ctx.STRING() != null) {
            String text = ctx.STRING().getText();
            return text.substring(1, text.length() - 1);
        }

        if (ctx.ID() != null) {
            String id = ctx.ID().getText();
            if (!memory.containsKey(id)) {
                throw new RuntimeException("Variável não definida: " + id);
            }
            return memory.get(id);
        }

        if (ctx.getText().equals("true")) return true;
        if (ctx.getText().equals("false")) return false;
        if (ctx.getText().equals("null")) return null;

        if (ctx.expressao() != null) {
            return visit(ctx.expressao());
        }

        return null;
    }

    // ------------------------
    // Variáveis
    // ------------------------
    @Override
    public Object visitVariavel(javaParser.VariavelContext ctx) {
        String tipo = ctx.tipo().getText();

        for (javaParser.DeclaracaoVariavelContext v : ctx.declaracaoVariavel()) {
            String nome = v.ID().getText();

            Object valor = null;

            if (v.expressao() != null) {
                valor = visit(v.expressao());
            }

            memory.put(nome, valor);
        }

        return null;
    }

    // ------------------------
    // Atribuição
    // ------------------------
    @Override
    public Object visitAtribuicao(javaParser.AtribuicaoContext ctx) {
        String id = ctx.ID().getText();

        Object valor = visit(ctx.expressao());

        if (!memory.containsKey(id)) {
            throw new RuntimeException("Variável não definida: " + id);
        }

        memory.put(id, valor);
        return valor;
    }

    // ------------------------
    // PRINT (🔥 importante)
    // ------------------------
    @Override
    public Object visitPrintInstrucao(javaParser.PrintInstrucaoContext ctx) {

        if (ctx.argumentoLista() != null) {
            for (javaParser.ExpressaoContext exp : ctx.argumentoLista().expressao()) {
                Object val = visit(exp);
                System.out.print(val);
            }
        }

        System.out.println();
        return null;
    }

    // ------------------------
    // EXPRESSÕES
    // ------------------------
    @Override
    public Object visitExpressaoAditiva(javaParser.ExpressaoAditivaContext ctx) {

        if (ctx.expressaoAditiva() != null) {
            Object left = visit(ctx.expressaoAditiva());
            Object right = visit(ctx.expressaoMultiplicativa());

            if (ctx.getChild(1).getText().equals("+")) {
                return toNumber(left) + toNumber(right);
            } else {
                return toNumber(left) - toNumber(right);
            }
        }

        return visit(ctx.expressaoMultiplicativa());
    }

    @Override
    public Object visitExpressaoMultiplicativa(javaParser.ExpressaoMultiplicativaContext ctx) {

        if (ctx.expressaoMultiplicativa() != null) {
            Object left = visit(ctx.expressaoMultiplicativa());
            Object right = visit(ctx.expressaoUnaria());

            if (ctx.getChild(1).getText().equals("*")) {
                return toNumber(left) * toNumber(right);
            } else {
                return toNumber(left) / toNumber(right);
            }
        }

        return visit(ctx.expressaoUnaria());
    }

    @Override
    public Object visitExpressaoRelacional(javaParser.ExpressaoRelacionalContext ctx) {

        if (ctx.expressaoRelacional() != null) {
            double left = toNumber(visit(ctx.expressaoRelacional()));
            double right = toNumber(visit(ctx.expressaoAditiva()));

            String op = ctx.getChild(1).getText();

            switch (op) {
                case "<": return left < right;
                case ">": return left > right;
                case "<=": return left <= right;
                case ">=": return left >= right;
            }
        }

        return visit(ctx.expressaoAditiva());
    }

    @Override
    public Object visitExpressaoIgualdade(javaParser.ExpressaoIgualdadeContext ctx) {

        if (ctx.expressaoIgualdade() != null) {
            Object left = visit(ctx.expressaoIgualdade());
            Object right = visit(ctx.expressaoRelacional());

            String op = ctx.getChild(1).getText();

            if (op.equals("==")) return left.equals(right);
            if (op.equals("!=")) return !left.equals(right);
        }

        return visit(ctx.expressaoRelacional());
    }

    @Override
    public Object visitExpressaoAnd(javaParser.ExpressaoAndContext ctx) {

        if (ctx.expressaoAnd() != null) {
            boolean left = (boolean) visit(ctx.expressaoAnd());
            boolean right = (boolean) visit(ctx.expressaoIgualdade());
            return left && right;
        }

        return visit(ctx.expressaoIgualdade());
    }

    @Override
    public Object visitExpressaoLogica(javaParser.ExpressaoLogicaContext ctx) {

        if (ctx.expressaoLogica() != null) {
            boolean left = (boolean) visit(ctx.expressaoLogica());
            boolean right = (boolean) visit(ctx.expressaoAnd());
            return left || right;
        }

        return visit(ctx.expressaoAnd());
    }

    // ------------------------
    // IF
    // ------------------------
    @Override
    public Object visitIfInstrucao(javaParser.IfInstrucaoContext ctx) {

        boolean cond = (boolean) visit(ctx.expressao());

        if (cond) {
            visit(ctx.instrucao(0));
        } else if (ctx.instrucao().size() > 1) {
            visit(ctx.instrucao(1));
        }

        return null;
    }

    // ------------------------
    // WHILE
    // ------------------------
    @Override
    public Object visitWhileInstrucao(javaParser.WhileInstrucaoContext ctx) {

        while ((boolean) visit(ctx.expressao())) {
            visit(ctx.instrucao());
        }

        return null;
    }

    // ------------------------
    // UTIL
    // ------------------------
    private double toNumber(Object o) {
        if (o instanceof Double) return (Double) o;
        if (o instanceof Integer) return ((Integer) o).doubleValue();
        throw new RuntimeException("Não é número: " + o);
    }
}
