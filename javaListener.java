// Generated from java.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link javaParser}.
 */
public interface javaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link javaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(javaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(javaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#classe}.
	 * @param ctx the parse tree
	 */
	void enterClasse(javaParser.ClasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#classe}.
	 * @param ctx the parse tree
	 */
	void exitClasse(javaParser.ClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#membroClasse}.
	 * @param ctx the parse tree
	 */
	void enterMembroClasse(javaParser.MembroClasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#membroClasse}.
	 * @param ctx the parse tree
	 */
	void exitMembroClasse(javaParser.MembroClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(javaParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(javaParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#tipoMetodo}.
	 * @param ctx the parse tree
	 */
	void enterTipoMetodo(javaParser.TipoMetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#tipoMetodo}.
	 * @param ctx the parse tree
	 */
	void exitTipoMetodo(javaParser.TipoMetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(javaParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(javaParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVariavel(javaParser.DeclaracaoVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVariavel(javaParser.DeclaracaoVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#parametroLista}.
	 * @param ctx the parse tree
	 */
	void enterParametroLista(javaParser.ParametroListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#parametroLista}.
	 * @param ctx the parse tree
	 */
	void exitParametroLista(javaParser.ParametroListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(javaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(javaParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(javaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(javaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(javaParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(javaParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#printInstrucao}.
	 * @param ctx the parse tree
	 */
	void enterPrintInstrucao(javaParser.PrintInstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#printInstrucao}.
	 * @param ctx the parse tree
	 */
	void exitPrintInstrucao(javaParser.PrintInstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(javaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(javaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#ifInstrucao}.
	 * @param ctx the parse tree
	 */
	void enterIfInstrucao(javaParser.IfInstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#ifInstrucao}.
	 * @param ctx the parse tree
	 */
	void exitIfInstrucao(javaParser.IfInstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#whileInstrucao}.
	 * @param ctx the parse tree
	 */
	void enterWhileInstrucao(javaParser.WhileInstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#whileInstrucao}.
	 * @param ctx the parse tree
	 */
	void exitWhileInstrucao(javaParser.WhileInstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#forInstrucao}.
	 * @param ctx the parse tree
	 */
	void enterForInstrucao(javaParser.ForInstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#forInstrucao}.
	 * @param ctx the parse tree
	 */
	void exitForInstrucao(javaParser.ForInstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(javaParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(javaParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#chamadaMetodo}.
	 * @param ctx the parse tree
	 */
	void enterChamadaMetodo(javaParser.ChamadaMetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#chamadaMetodo}.
	 * @param ctx the parse tree
	 */
	void exitChamadaMetodo(javaParser.ChamadaMetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#argumentoLista}.
	 * @param ctx the parse tree
	 */
	void enterArgumentoLista(javaParser.ArgumentoListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#argumentoLista}.
	 * @param ctx the parse tree
	 */
	void exitArgumentoLista(javaParser.ArgumentoListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(javaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(javaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogica(javaParser.ExpressaoLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogica(javaParser.ExpressaoLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#expressaoAnd}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAnd(javaParser.ExpressaoAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#expressaoAnd}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAnd(javaParser.ExpressaoAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#expressaoIgualdade}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoIgualdade(javaParser.ExpressaoIgualdadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#expressaoIgualdade}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoIgualdade(javaParser.ExpressaoIgualdadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(javaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(javaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#expressaoAditiva}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAditiva(javaParser.ExpressaoAditivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#expressaoAditiva}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAditiva(javaParser.ExpressaoAditivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoMultiplicativa(javaParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoMultiplicativa(javaParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#expressaoUnaria}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoUnaria(javaParser.ExpressaoUnariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#expressaoUnaria}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoUnaria(javaParser.ExpressaoUnariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#primario}.
	 * @param ctx the parse tree
	 */
	void enterPrimario(javaParser.PrimarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#primario}.
	 * @param ctx the parse tree
	 */
	void exitPrimario(javaParser.PrimarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(javaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(javaParser.TipoContext ctx);
}