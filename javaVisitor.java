// Generated from java.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link javaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface javaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link javaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(javaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#classe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasse(javaParser.ClasseContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#membroClasse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembroClasse(javaParser.MembroClasseContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#metodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodo(javaParser.MetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#tipoMetodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoMetodo(javaParser.TipoMetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(javaParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoVariavel(javaParser.DeclaracaoVariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#parametroLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametroLista(javaParser.ParametroListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(javaParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(javaParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#instrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao(javaParser.InstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#printInstrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintInstrucao(javaParser.PrintInstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(javaParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#ifInstrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfInstrucao(javaParser.IfInstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#whileInstrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileInstrucao(javaParser.WhileInstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#forInstrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInstrucao(javaParser.ForInstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(javaParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#chamadaMetodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaMetodo(javaParser.ChamadaMetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#argumentoLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentoLista(javaParser.ArgumentoListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(javaParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#expressaoLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoLogica(javaParser.ExpressaoLogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#expressaoAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAnd(javaParser.ExpressaoAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#expressaoIgualdade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoIgualdade(javaParser.ExpressaoIgualdadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoRelacional(javaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#expressaoAditiva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAditiva(javaParser.ExpressaoAditivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoMultiplicativa(javaParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#expressaoUnaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoUnaria(javaParser.ExpressaoUnariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimario(javaParser.PrimarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(javaParser.TipoContext ctx);
}