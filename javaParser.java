// Generated from java.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class javaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		ID=39, NUMERO=40, STRING=41, LINE_COMMENT=42, BLOCK_COMMENT=43, WS=44;
	public static final int
		RULE_program = 0, RULE_classe = 1, RULE_membroClasse = 2, RULE_metodo = 3, 
		RULE_tipoMetodo = 4, RULE_variavel = 5, RULE_declaracaoVariavel = 6, RULE_parametroLista = 7, 
		RULE_parametro = 8, RULE_bloco = 9, RULE_instrucao = 10, RULE_printInstrucao = 11, 
		RULE_atribuicao = 12, RULE_ifInstrucao = 13, RULE_whileInstrucao = 14, 
		RULE_forInstrucao = 15, RULE_retorno = 16, RULE_chamadaMetodo = 17, RULE_argumentoLista = 18, 
		RULE_expressao = 19, RULE_expressaoLogica = 20, RULE_expressaoAnd = 21, 
		RULE_expressaoIgualdade = 22, RULE_expressaoRelacional = 23, RULE_expressaoAditiva = 24, 
		RULE_expressaoMultiplicativa = 25, RULE_expressaoUnaria = 26, RULE_primario = 27, 
		RULE_tipo = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classe", "membroClasse", "metodo", "tipoMetodo", "variavel", 
			"declaracaoVariavel", "parametroLista", "parametro", "bloco", "instrucao", 
			"printInstrucao", "atribuicao", "ifInstrucao", "whileInstrucao", "forInstrucao", 
			"retorno", "chamadaMetodo", "argumentoLista", "expressao", "expressaoLogica", 
			"expressaoAnd", "expressaoIgualdade", "expressaoRelacional", "expressaoAditiva", 
			"expressaoMultiplicativa", "expressaoUnaria", "primario", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'('", "')'", "'void'", "','", "';'", 
			"'='", "'print'", "'if'", "'else'", "'while'", "'for'", "'return'", "'||'", 
			"'&&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", 
			"'/'", "'!'", "'++'", "'--'", "'true'", "'false'", "'null'", "'this'", 
			"'int'", "'float'", "'boolean'", "'String'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "NUMERO", "STRING", "LINE_COMMENT", "BLOCK_COMMENT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public javaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(javaParser.EOF, 0); }
		public List<ClasseContext> classe() {
			return getRuleContexts(ClasseContext.class);
		}
		public ClasseContext classe(int i) {
			return getRuleContext(ClasseContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(58);
				classe();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClasseContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public List<MembroClasseContext> membroClasse() {
			return getRuleContexts(MembroClasseContext.class);
		}
		public MembroClasseContext membroClasse(int i) {
			return getRuleContext(MembroClasseContext.class,i);
		}
		public ClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitClasse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitClasse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasseContext classe() throws RecognitionException {
		ClasseContext _localctx = new ClasseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__0);
			setState(67);
			match(ID);
			setState(68);
			match(T__1);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << ID))) != 0)) {
				{
				{
				setState(69);
				membroClasse();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MembroClasseContext extends ParserRuleContext {
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public MembroClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membroClasse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMembroClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMembroClasse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMembroClasse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembroClasseContext membroClasse() throws RecognitionException {
		MembroClasseContext _localctx = new MembroClasseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_membroClasse);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				metodo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				variavel();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetodoContext extends ParserRuleContext {
		public TipoMetodoContext tipoMetodo() {
			return getRuleContext(TipoMetodoContext.class,0);
		}
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ParametroListaContext parametroLista() {
			return getRuleContext(ParametroListaContext.class,0);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			tipoMetodo();
			setState(82);
			match(ID);
			setState(83);
			match(T__3);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << ID))) != 0)) {
				{
				setState(84);
				parametroLista();
				}
			}

			setState(87);
			match(T__4);
			setState(88);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoMetodoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoMetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoMetodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterTipoMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitTipoMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitTipoMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoMetodoContext tipoMetodo() throws RecognitionException {
		TipoMetodoContext _localctx = new TipoMetodoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipoMetodo);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				tipo();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariavelContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<DeclaracaoVariavelContext> declaracaoVariavel() {
			return getRuleContexts(DeclaracaoVariavelContext.class);
		}
		public DeclaracaoVariavelContext declaracaoVariavel(int i) {
			return getRuleContext(DeclaracaoVariavelContext.class,i);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			tipo();
			setState(95);
			declaracaoVariavel();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(96);
				match(T__6);
				setState(97);
				declaracaoVariavel();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoVariavelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclaracaoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterDeclaracaoVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitDeclaracaoVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitDeclaracaoVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoVariavelContext declaracaoVariavel() throws RecognitionException {
		DeclaracaoVariavelContext _localctx = new DeclaracaoVariavelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracaoVariavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ID);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(106);
				match(T__8);
				setState(107);
				expressao();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroListaContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametroListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterParametroLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitParametroLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitParametroLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroListaContext parametroLista() throws RecognitionException {
		ParametroListaContext _localctx = new ParametroListaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametroLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			parametro();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(111);
				match(T__6);
				setState(112);
				parametro();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			tipo();
			setState(119);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__1);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << ID))) != 0)) {
				{
				{
				setState(122);
				instrucao();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstrucaoContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ChamadaMetodoContext chamadaMetodo() {
			return getRuleContext(ChamadaMetodoContext.class,0);
		}
		public PrintInstrucaoContext printInstrucao() {
			return getRuleContext(PrintInstrucaoContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public IfInstrucaoContext ifInstrucao() {
			return getRuleContext(IfInstrucaoContext.class,0);
		}
		public WhileInstrucaoContext whileInstrucao() {
			return getRuleContext(WhileInstrucaoContext.class,0);
		}
		public ForInstrucaoContext forInstrucao() {
			return getRuleContext(ForInstrucaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitInstrucao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitInstrucao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instrucao);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				variavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				atribuicao();
				setState(132);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				chamadaMetodo();
				setState(135);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				printInstrucao();
				setState(138);
				match(T__7);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				retorno();
				setState(141);
				match(T__7);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				ifInstrucao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(144);
				whileInstrucao();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(145);
				forInstrucao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(146);
				bloco();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintInstrucaoContext extends ParserRuleContext {
		public ArgumentoListaContext argumentoLista() {
			return getRuleContext(ArgumentoListaContext.class,0);
		}
		public PrintInstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printInstrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPrintInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPrintInstrucao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPrintInstrucao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintInstrucaoContext printInstrucao() throws RecognitionException {
		PrintInstrucaoContext _localctx = new PrintInstrucaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printInstrucao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__9);
			setState(150);
			match(T__3);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << ID) | (1L << NUMERO) | (1L << STRING))) != 0)) {
				{
				setState(151);
				argumentoLista();
				}
			}

			setState(154);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ID);
			setState(157);
			match(T__8);
			setState(158);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfInstrucaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public IfInstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifInstrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterIfInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitIfInstrucao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitIfInstrucao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfInstrucaoContext ifInstrucao() throws RecognitionException {
		IfInstrucaoContext _localctx = new IfInstrucaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifInstrucao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__10);
			setState(161);
			match(T__3);
			setState(162);
			expressao();
			setState(163);
			match(T__4);
			setState(164);
			instrucao();
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(165);
				match(T__11);
				setState(166);
				instrucao();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileInstrucaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public InstrucaoContext instrucao() {
			return getRuleContext(InstrucaoContext.class,0);
		}
		public WhileInstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileInstrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterWhileInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitWhileInstrucao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitWhileInstrucao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileInstrucaoContext whileInstrucao() throws RecognitionException {
		WhileInstrucaoContext _localctx = new WhileInstrucaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileInstrucao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__12);
			setState(170);
			match(T__3);
			setState(171);
			expressao();
			setState(172);
			match(T__4);
			setState(173);
			instrucao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInstrucaoContext extends ParserRuleContext {
		public InstrucaoContext instrucao() {
			return getRuleContext(InstrucaoContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public List<AtribuicaoContext> atribuicao() {
			return getRuleContexts(AtribuicaoContext.class);
		}
		public AtribuicaoContext atribuicao(int i) {
			return getRuleContext(AtribuicaoContext.class,i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ForInstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInstrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterForInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitForInstrucao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitForInstrucao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInstrucaoContext forInstrucao() throws RecognitionException {
		ForInstrucaoContext _localctx = new ForInstrucaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forInstrucao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__13);
			setState(176);
			match(T__3);
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(177);
				variavel();
				}
				break;
			case 2:
				{
				setState(178);
				atribuicao();
				}
				break;
			}
			setState(181);
			match(T__7);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << ID) | (1L << NUMERO) | (1L << STRING))) != 0)) {
				{
				setState(182);
				expressao();
				}
			}

			setState(185);
			match(T__7);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(186);
				atribuicao();
				}
			}

			setState(189);
			match(T__4);
			setState(190);
			instrucao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__14);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << ID) | (1L << NUMERO) | (1L << STRING))) != 0)) {
				{
				setState(193);
				expressao();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChamadaMetodoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public ArgumentoListaContext argumentoLista() {
			return getRuleContext(ArgumentoListaContext.class,0);
		}
		public ChamadaMetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaMetodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterChamadaMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitChamadaMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitChamadaMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaMetodoContext chamadaMetodo() throws RecognitionException {
		ChamadaMetodoContext _localctx = new ChamadaMetodoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chamadaMetodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ID);
			setState(197);
			match(T__3);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << ID) | (1L << NUMERO) | (1L << STRING))) != 0)) {
				{
				setState(198);
				argumentoLista();
				}
			}

			setState(201);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentoListaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ArgumentoListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentoLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterArgumentoLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitArgumentoLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitArgumentoLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentoListaContext argumentoLista() throws RecognitionException {
		ArgumentoListaContext _localctx = new ArgumentoListaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_argumentoLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			expressao();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(204);
				match(T__6);
				setState(205);
				expressao();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			expressaoLogica(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoLogicaContext extends ParserRuleContext {
		public ExpressaoAndContext expressaoAnd() {
			return getRuleContext(ExpressaoAndContext.class,0);
		}
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public ExpressaoLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterExpressaoLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitExpressaoLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitExpressaoLogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoLogicaContext expressaoLogica() throws RecognitionException {
		return expressaoLogica(0);
	}

	private ExpressaoLogicaContext expressaoLogica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoLogicaContext _localctx = new ExpressaoLogicaContext(_ctx, _parentState);
		ExpressaoLogicaContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expressaoLogica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(214);
			expressaoAnd(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoLogicaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoLogica);
					setState(216);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(217);
					match(T__15);
					setState(218);
					expressaoAnd(0);
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoAndContext extends ParserRuleContext {
		public ExpressaoIgualdadeContext expressaoIgualdade() {
			return getRuleContext(ExpressaoIgualdadeContext.class,0);
		}
		public ExpressaoAndContext expressaoAnd() {
			return getRuleContext(ExpressaoAndContext.class,0);
		}
		public ExpressaoAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterExpressaoAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitExpressaoAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitExpressaoAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoAndContext expressaoAnd() throws RecognitionException {
		return expressaoAnd(0);
	}

	private ExpressaoAndContext expressaoAnd(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoAndContext _localctx = new ExpressaoAndContext(_ctx, _parentState);
		ExpressaoAndContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expressaoAnd, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(225);
			expressaoIgualdade(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoAndContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoAnd);
					setState(227);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(228);
					match(T__16);
					setState(229);
					expressaoIgualdade(0);
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoIgualdadeContext extends ParserRuleContext {
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public ExpressaoIgualdadeContext expressaoIgualdade() {
			return getRuleContext(ExpressaoIgualdadeContext.class,0);
		}
		public ExpressaoIgualdadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoIgualdade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterExpressaoIgualdade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitExpressaoIgualdade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitExpressaoIgualdade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoIgualdadeContext expressaoIgualdade() throws RecognitionException {
		return expressaoIgualdade(0);
	}

	private ExpressaoIgualdadeContext expressaoIgualdade(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoIgualdadeContext _localctx = new ExpressaoIgualdadeContext(_ctx, _parentState);
		ExpressaoIgualdadeContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expressaoIgualdade, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(236);
			expressaoRelacional(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoIgualdadeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoIgualdade);
					setState(238);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(239);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==T__18) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(240);
					expressaoRelacional(0);
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public ExpressaoAditivaContext expressaoAditiva() {
			return getRuleContext(ExpressaoAditivaContext.class,0);
		}
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitExpressaoRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitExpressaoRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		return expressaoRelacional(0);
	}

	private ExpressaoRelacionalContext expressaoRelacional(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, _parentState);
		ExpressaoRelacionalContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expressaoRelacional, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(247);
			expressaoAditiva(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoRelacionalContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoRelacional);
					setState(249);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(250);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(251);
					expressaoAditiva(0);
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoAditivaContext extends ParserRuleContext {
		public ExpressaoMultiplicativaContext expressaoMultiplicativa() {
			return getRuleContext(ExpressaoMultiplicativaContext.class,0);
		}
		public ExpressaoAditivaContext expressaoAditiva() {
			return getRuleContext(ExpressaoAditivaContext.class,0);
		}
		public ExpressaoAditivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAditiva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterExpressaoAditiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitExpressaoAditiva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitExpressaoAditiva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoAditivaContext expressaoAditiva() throws RecognitionException {
		return expressaoAditiva(0);
	}

	private ExpressaoAditivaContext expressaoAditiva(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoAditivaContext _localctx = new ExpressaoAditivaContext(_ctx, _parentState);
		ExpressaoAditivaContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expressaoAditiva, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(258);
			expressaoMultiplicativa(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoAditivaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoAditiva);
					setState(260);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(261);
					_la = _input.LA(1);
					if ( !(_la==T__23 || _la==T__24) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(262);
					expressaoMultiplicativa(0);
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoMultiplicativaContext extends ParserRuleContext {
		public ExpressaoUnariaContext expressaoUnaria() {
			return getRuleContext(ExpressaoUnariaContext.class,0);
		}
		public ExpressaoMultiplicativaContext expressaoMultiplicativa() {
			return getRuleContext(ExpressaoMultiplicativaContext.class,0);
		}
		public ExpressaoMultiplicativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoMultiplicativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterExpressaoMultiplicativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitExpressaoMultiplicativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitExpressaoMultiplicativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoMultiplicativaContext expressaoMultiplicativa() throws RecognitionException {
		return expressaoMultiplicativa(0);
	}

	private ExpressaoMultiplicativaContext expressaoMultiplicativa(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoMultiplicativaContext _localctx = new ExpressaoMultiplicativaContext(_ctx, _parentState);
		ExpressaoMultiplicativaContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expressaoMultiplicativa, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(269);
			expressaoUnaria();
			}
			_ctx.stop = _input.LT(-1);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoMultiplicativaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoMultiplicativa);
					setState(271);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(272);
					_la = _input.LA(1);
					if ( !(_la==T__25 || _la==T__26) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(273);
					expressaoUnaria();
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoUnariaContext extends ParserRuleContext {
		public ExpressaoUnariaContext expressaoUnaria() {
			return getRuleContext(ExpressaoUnariaContext.class,0);
		}
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public PrimarioContext primario() {
			return getRuleContext(PrimarioContext.class,0);
		}
		public ExpressaoUnariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoUnaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterExpressaoUnaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitExpressaoUnaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitExpressaoUnaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoUnariaContext expressaoUnaria() throws RecognitionException {
		ExpressaoUnariaContext _localctx = new ExpressaoUnariaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressaoUnaria);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(T__27);
				setState(280);
				expressaoUnaria();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(T__24);
				setState(282);
				expressaoUnaria();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(T__28);
				setState(284);
				match(ID);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(T__29);
				setState(286);
				match(ID);
				}
				break;
			case T__3:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case ID:
			case NUMERO:
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				primario();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimarioContext extends ParserRuleContext {
		public ChamadaMetodoContext chamadaMetodo() {
			return getRuleContext(ChamadaMetodoContext.class,0);
		}
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public TerminalNode NUMERO() { return getToken(javaParser.NUMERO, 0); }
		public TerminalNode STRING() { return getToken(javaParser.STRING, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public PrimarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPrimario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPrimario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPrimario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimarioContext primario() throws RecognitionException {
		PrimarioContext _localctx = new PrimarioContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primario);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				chamadaMetodo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(NUMERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(294);
				match(T__30);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(295);
				match(T__31);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(296);
				match(T__32);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(297);
				match(T__33);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(298);
				match(T__3);
				setState(299);
				expressao();
				setState(300);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expressaoLogica_sempred((ExpressaoLogicaContext)_localctx, predIndex);
		case 21:
			return expressaoAnd_sempred((ExpressaoAndContext)_localctx, predIndex);
		case 22:
			return expressaoIgualdade_sempred((ExpressaoIgualdadeContext)_localctx, predIndex);
		case 23:
			return expressaoRelacional_sempred((ExpressaoRelacionalContext)_localctx, predIndex);
		case 24:
			return expressaoAditiva_sempred((ExpressaoAditivaContext)_localctx, predIndex);
		case 25:
			return expressaoMultiplicativa_sempred((ExpressaoMultiplicativaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressaoLogica_sempred(ExpressaoLogicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoAnd_sempred(ExpressaoAndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoIgualdade_sempred(ExpressaoIgualdadeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoRelacional_sempred(ExpressaoRelacionalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoAditiva_sempred(ExpressaoAditivaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoMultiplicativa_sempred(ExpressaoMultiplicativaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0135\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\3\3\3\3\4\3"+
		"\4\5\4R\n\4\3\5\3\5\3\5\3\5\5\5X\n\5\3\5\3\5\3\5\3\6\3\6\5\6_\n\6\3\7"+
		"\3\7\3\7\3\7\7\7e\n\7\f\7\16\7h\13\7\3\7\3\7\3\b\3\b\3\b\5\bo\n\b\3\t"+
		"\3\t\3\t\7\tt\n\t\f\t\16\tw\13\t\3\n\3\n\3\n\3\13\3\13\7\13~\n\13\f\13"+
		"\16\13\u0081\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0096\n\f\3\r\3\r\3\r\5\r\u009b\n\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00aa"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00b6\n\21"+
		"\3\21\3\21\5\21\u00ba\n\21\3\21\3\21\5\21\u00be\n\21\3\21\3\21\3\21\3"+
		"\22\3\22\5\22\u00c5\n\22\3\23\3\23\3\23\5\23\u00ca\n\23\3\23\3\23\3\24"+
		"\3\24\3\24\7\24\u00d1\n\24\f\24\16\24\u00d4\13\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u00de\n\26\f\26\16\26\u00e1\13\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u00e9\n\27\f\27\16\27\u00ec\13\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u00f4\n\30\f\30\16\30\u00f7\13\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\7\31\u00ff\n\31\f\31\16\31\u0102\13\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\7\32\u010a\n\32\f\32\16\32\u010d\13\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\7\33\u0115\n\33\f\33\16\33\u0118\13\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0123\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0131\n\35\3\36\3\36\3\36"+
		"\2\b*,.\60\62\64\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:\2\7\3\2\24\25\3\2\26\31\3\2\32\33\3\2\34\35\3\2%)\2\u0143"+
		"\2?\3\2\2\2\4D\3\2\2\2\6Q\3\2\2\2\bS\3\2\2\2\n^\3\2\2\2\f`\3\2\2\2\16"+
		"k\3\2\2\2\20p\3\2\2\2\22x\3\2\2\2\24{\3\2\2\2\26\u0095\3\2\2\2\30\u0097"+
		"\3\2\2\2\32\u009e\3\2\2\2\34\u00a2\3\2\2\2\36\u00ab\3\2\2\2 \u00b1\3\2"+
		"\2\2\"\u00c2\3\2\2\2$\u00c6\3\2\2\2&\u00cd\3\2\2\2(\u00d5\3\2\2\2*\u00d7"+
		"\3\2\2\2,\u00e2\3\2\2\2.\u00ed\3\2\2\2\60\u00f8\3\2\2\2\62\u0103\3\2\2"+
		"\2\64\u010e\3\2\2\2\66\u0122\3\2\2\28\u0130\3\2\2\2:\u0132\3\2\2\2<>\5"+
		"\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7"+
		"\2\2\3C\3\3\2\2\2DE\7\3\2\2EF\7)\2\2FJ\7\4\2\2GI\5\6\4\2HG\3\2\2\2IL\3"+
		"\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\5\2\2N\5\3\2\2\2OR"+
		"\5\b\5\2PR\5\f\7\2QO\3\2\2\2QP\3\2\2\2R\7\3\2\2\2ST\5\n\6\2TU\7)\2\2U"+
		"W\7\6\2\2VX\5\20\t\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\7\2\2Z[\5\24\13"+
		"\2[\t\3\2\2\2\\_\5:\36\2]_\7\b\2\2^\\\3\2\2\2^]\3\2\2\2_\13\3\2\2\2`a"+
		"\5:\36\2af\5\16\b\2bc\7\t\2\2ce\5\16\b\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2"+
		"fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\n\2\2j\r\3\2\2\2kn\7)\2\2lm\7\13\2"+
		"\2mo\5(\25\2nl\3\2\2\2no\3\2\2\2o\17\3\2\2\2pu\5\22\n\2qr\7\t\2\2rt\5"+
		"\22\n\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\21\3\2\2\2wu\3\2\2\2"+
		"xy\5:\36\2yz\7)\2\2z\23\3\2\2\2{\177\7\4\2\2|~\5\26\f\2}|\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0082\u0083\7\5\2\2\u0083\25\3\2\2\2\u0084\u0096\5\f\7\2\u0085"+
		"\u0086\5\32\16\2\u0086\u0087\7\n\2\2\u0087\u0096\3\2\2\2\u0088\u0089\5"+
		"$\23\2\u0089\u008a\7\n\2\2\u008a\u0096\3\2\2\2\u008b\u008c\5\30\r\2\u008c"+
		"\u008d\7\n\2\2\u008d\u0096\3\2\2\2\u008e\u008f\5\"\22\2\u008f\u0090\7"+
		"\n\2\2\u0090\u0096\3\2\2\2\u0091\u0096\5\34\17\2\u0092\u0096\5\36\20\2"+
		"\u0093\u0096\5 \21\2\u0094\u0096\5\24\13\2\u0095\u0084\3\2\2\2\u0095\u0085"+
		"\3\2\2\2\u0095\u0088\3\2\2\2\u0095\u008b\3\2\2\2\u0095\u008e\3\2\2\2\u0095"+
		"\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2"+
		"\2\2\u0096\27\3\2\2\2\u0097\u0098\7\f\2\2\u0098\u009a\7\6\2\2\u0099\u009b"+
		"\5&\24\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\7\7\2\2\u009d\31\3\2\2\2\u009e\u009f\7)\2\2\u009f\u00a0\7\13\2"+
		"\2\u00a0\u00a1\5(\25\2\u00a1\33\3\2\2\2\u00a2\u00a3\7\r\2\2\u00a3\u00a4"+
		"\7\6\2\2\u00a4\u00a5\5(\25\2\u00a5\u00a6\7\7\2\2\u00a6\u00a9\5\26\f\2"+
		"\u00a7\u00a8\7\16\2\2\u00a8\u00aa\5\26\f\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\35\3\2\2\2\u00ab\u00ac\7\17\2\2\u00ac\u00ad\7\6\2\2\u00ad"+
		"\u00ae\5(\25\2\u00ae\u00af\7\7\2\2\u00af\u00b0\5\26\f\2\u00b0\37\3\2\2"+
		"\2\u00b1\u00b2\7\20\2\2\u00b2\u00b5\7\6\2\2\u00b3\u00b6\5\f\7\2\u00b4"+
		"\u00b6\5\32\16\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\7\n\2\2\u00b8\u00ba\5(\25\2\u00b9"+
		"\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\7\n"+
		"\2\2\u00bc\u00be\5\32\16\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\7\7\2\2\u00c0\u00c1\5\26\f\2\u00c1!\3\2\2\2"+
		"\u00c2\u00c4\7\21\2\2\u00c3\u00c5\5(\25\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5#\3\2\2\2\u00c6\u00c7\7)\2\2\u00c7\u00c9\7\6\2\2\u00c8\u00ca"+
		"\5&\24\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\7\7\2\2\u00cc%\3\2\2\2\u00cd\u00d2\5(\25\2\u00ce\u00cf\7\t\2\2"+
		"\u00cf\u00d1\5(\25\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\'\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d6\5*\26\2\u00d6)\3\2\2\2\u00d7\u00d8\b\26\1\2\u00d8\u00d9\5,\27\2"+
		"\u00d9\u00df\3\2\2\2\u00da\u00db\f\4\2\2\u00db\u00dc\7\22\2\2\u00dc\u00de"+
		"\5,\27\2\u00dd\u00da\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0+\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\b\27\1\2"+
		"\u00e3\u00e4\5.\30\2\u00e4\u00ea\3\2\2\2\u00e5\u00e6\f\4\2\2\u00e6\u00e7"+
		"\7\23\2\2\u00e7\u00e9\5.\30\2\u00e8\u00e5\3\2\2\2\u00e9\u00ec\3\2\2\2"+
		"\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb-\3\2\2\2\u00ec\u00ea\3"+
		"\2\2\2\u00ed\u00ee\b\30\1\2\u00ee\u00ef\5\60\31\2\u00ef\u00f5\3\2\2\2"+
		"\u00f0\u00f1\f\4\2\2\u00f1\u00f2\t\2\2\2\u00f2\u00f4\5\60\31\2\u00f3\u00f0"+
		"\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"/\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\b\31\1\2\u00f9\u00fa\5\62\32"+
		"\2\u00fa\u0100\3\2\2\2\u00fb\u00fc\f\4\2\2\u00fc\u00fd\t\3\2\2\u00fd\u00ff"+
		"\5\62\32\2\u00fe\u00fb\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2"+
		"\u0100\u0101\3\2\2\2\u0101\61\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104"+
		"\b\32\1\2\u0104\u0105\5\64\33\2\u0105\u010b\3\2\2\2\u0106\u0107\f\4\2"+
		"\2\u0107\u0108\t\4\2\2\u0108\u010a\5\64\33\2\u0109\u0106\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\63\3\2\2"+
		"\2\u010d\u010b\3\2\2\2\u010e\u010f\b\33\1\2\u010f\u0110\5\66\34\2\u0110"+
		"\u0116\3\2\2\2\u0111\u0112\f\4\2\2\u0112\u0113\t\5\2\2\u0113\u0115\5\66"+
		"\34\2\u0114\u0111\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\65\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7\36\2"+
		"\2\u011a\u0123\5\66\34\2\u011b\u011c\7\33\2\2\u011c\u0123\5\66\34\2\u011d"+
		"\u011e\7\37\2\2\u011e\u0123\7)\2\2\u011f\u0120\7 \2\2\u0120\u0123\7)\2"+
		"\2\u0121\u0123\58\35\2\u0122\u0119\3\2\2\2\u0122\u011b\3\2\2\2\u0122\u011d"+
		"\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0121\3\2\2\2\u0123\67\3\2\2\2\u0124"+
		"\u0131\5$\23\2\u0125\u0131\7)\2\2\u0126\u0131\7*\2\2\u0127\u0131\7+\2"+
		"\2\u0128\u0131\7!\2\2\u0129\u0131\7\"\2\2\u012a\u0131\7#\2\2\u012b\u0131"+
		"\7$\2\2\u012c\u012d\7\6\2\2\u012d\u012e\5(\25\2\u012e\u012f\7\7\2\2\u012f"+
		"\u0131\3\2\2\2\u0130\u0124\3\2\2\2\u0130\u0125\3\2\2\2\u0130\u0126\3\2"+
		"\2\2\u0130\u0127\3\2\2\2\u0130\u0128\3\2\2\2\u0130\u0129\3\2\2\2\u0130"+
		"\u012a\3\2\2\2\u0130\u012b\3\2\2\2\u0130\u012c\3\2\2\2\u01319\3\2\2\2"+
		"\u0132\u0133\t\6\2\2\u0133;\3\2\2\2\34?JQW^fnu\177\u0095\u009a\u00a9\u00b5"+
		"\u00b9\u00bd\u00c4\u00c9\u00d2\u00df\u00ea\u00f5\u0100\u010b\u0116\u0122"+
		"\u0130";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}