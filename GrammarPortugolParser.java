// Generated from GrammarPortugol.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarPortugolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, INTEIRO=49, REAL=50, CARACTERE=51, LITERAL=52, 
		LOGICO=53, INTEIROS=54, REAIS=55, CARACTERES=56, LITERAIS=57, LOGICOS=58, 
		T_INT_LIT=59, T_DEC_LIT=60, T_OCTAL_LIT=61, T_HEX_LIT=62, T_BIN_LIT=63, 
		T_REAL_LIT=64, T_CARAC_LIT=65, T_STRING_LIT=66, SL_COMMENT=67, ML_COMMENT=68, 
		ESC_SEQ=69, OCTAL_ESC=70, UNICODE_ESC=71, T_IDENTIFICADOR=72, T_KW_VERDADEIRO=73, 
		T_KW_FALSO=74, WS=75;
	public static final int
		RULE_algoritmo = 0, RULE_declaracao_algoritmo = 1, RULE_var_decl_block = 2, 
		RULE_var_decl = 3, RULE_tp_primitivo = 4, RULE_tp_matriz = 5, RULE_tp_prim_pl = 6, 
		RULE_stm_block = 7, RULE_statementList = 8, RULE_statement = 9, RULE_stm_ret = 10, 
		RULE_lvalue = 11, RULE_stm_attr = 12, RULE_stm_se = 13, RULE_stm_enquanto = 14, 
		RULE_stm_para = 15, RULE_passo = 16, RULE_expr = 17, RULE_termo = 18, 
		RULE_fcall = 19, RULE_fargs = 20, RULE_literal = 21, RULE_func_decls = 22, 
		RULE_fvar_decl = 23, RULE_fparams = 24, RULE_fparam = 25;
	public static final String[] ruleNames = {
		"algoritmo", "declaracao_algoritmo", "var_decl_block", "var_decl", "tp_primitivo", 
		"tp_matriz", "tp_prim_pl", "stm_block", "statementList", "statement", 
		"stm_ret", "lvalue", "stm_attr", "stm_se", "stm_enquanto", "stm_para", 
		"passo", "expr", "termo", "fcall", "fargs", "literal", "func_decls", "fvar_decl", 
		"fparams", "fparam"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'algoritmo'", "';'", "'variáveis'", "'fim-variáveis'", "','", 
		"':'", "'matriz'", "'['", "']'", "'de'", "'início'", "'fim'", "'retorne'", 
		"':='", "'se'", "'então'", "'senão'", "'fim-se'", "'enquanto'", "'faça'", 
		"'fim-enquanto'", "'para'", "'até'", "'fim-para'", "'passo'", "'+'", 
		"'-'", "'ou'", "'||'", "'e'", "'&&'", "'|'", "'^'", "'&'", "'='", "'<>'", 
		"'>'", "'>='", "'<'", "'<='", "'/'", "'*'", "'%'", "'~'", "'não'", "'('", 
		"')'", "'função'", "'inteiro'", "'real'", "'caractere'", "'literal'", 
		"'lógico'", "'inteiros'", "'reais'", "'caracteres'", "'literais'", "'lógicos'", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'verdadeiro'", "'falso'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "INTEIRO", "REAL", "CARACTERE", "LITERAL", "LOGICO", "INTEIROS", 
		"REAIS", "CARACTERES", "LITERAIS", "LOGICOS", "T_INT_LIT", "T_DEC_LIT", 
		"T_OCTAL_LIT", "T_HEX_LIT", "T_BIN_LIT", "T_REAL_LIT", "T_CARAC_LIT", 
		"T_STRING_LIT", "SL_COMMENT", "ML_COMMENT", "ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC", 
		"T_IDENTIFICADOR", "T_KW_VERDADEIRO", "T_KW_FALSO", "WS"
	};
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
	public String getGrammarFileName() { return "GrammarPortugol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarPortugolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AlgoritmoContext extends ParserRuleContext {
		public Declaracao_algoritmoContext declaracao_algoritmo() {
			return getRuleContext(Declaracao_algoritmoContext.class,0);
		}
		public Stm_blockContext stm_block() {
			return getRuleContext(Stm_blockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarPortugolParser.EOF, 0); }
		public Var_decl_blockContext var_decl_block() {
			return getRuleContext(Var_decl_blockContext.class,0);
		}
		public List<Func_declsContext> func_decls() {
			return getRuleContexts(Func_declsContext.class);
		}
		public Func_declsContext func_decls(int i) {
			return getRuleContext(Func_declsContext.class,i);
		}
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitAlgoritmo(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_algoritmo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			declaracao_algoritmo();
			setState(54);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(53);
				var_decl_block();
				}
			}

			setState(56);
			stm_block();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47) {
				{
				{
				setState(57);
				func_decls();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
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

	public static class Declaracao_algoritmoContext extends ParserRuleContext {
		public TerminalNode T_IDENTIFICADOR() { return getToken(GrammarPortugolParser.T_IDENTIFICADOR, 0); }
		public Declaracao_algoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterDeclaracao_algoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitDeclaracao_algoritmo(this);
		}
	}

	public final Declaracao_algoritmoContext declaracao_algoritmo() throws RecognitionException {
		Declaracao_algoritmoContext _localctx = new Declaracao_algoritmoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao_algoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__0);
			setState(66);
			match(T_IDENTIFICADOR);
			setState(67);
			match(T__1);
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

	public static class Var_decl_blockContext extends ParserRuleContext {
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public Var_decl_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterVar_decl_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitVar_decl_block(this);
		}
	}

	public final Var_decl_blockContext var_decl_block() throws RecognitionException {
		Var_decl_blockContext _localctx = new Var_decl_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__2);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				var_decl();
				setState(71);
				match(T__1);
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_IDENTIFICADOR );
			setState(77);
			match(T__3);
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

	public static class Var_declContext extends ParserRuleContext {
		public List<TerminalNode> T_IDENTIFICADOR() { return getTokens(GrammarPortugolParser.T_IDENTIFICADOR); }
		public TerminalNode T_IDENTIFICADOR(int i) {
			return getToken(GrammarPortugolParser.T_IDENTIFICADOR, i);
		}
		public Tp_primitivoContext tp_primitivo() {
			return getRuleContext(Tp_primitivoContext.class,0);
		}
		public Tp_matrizContext tp_matriz() {
			return getRuleContext(Tp_matrizContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T_IDENTIFICADOR);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(80);
				match(T__4);
				setState(81);
				match(T_IDENTIFICADOR);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(T__5);
			setState(90);
			switch (_input.LA(1)) {
			case INTEIRO:
			case REAL:
			case CARACTERE:
			case LITERAL:
			case LOGICO:
				{
				setState(88);
				tp_primitivo();
				}
				break;
			case T__6:
				{
				setState(89);
				tp_matriz();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Tp_primitivoContext extends ParserRuleContext {
		public Tp_primitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tp_primitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterTp_primitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitTp_primitivo(this);
		}
	}

	public final Tp_primitivoContext tp_primitivo() throws RecognitionException {
		Tp_primitivoContext _localctx = new Tp_primitivoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tp_primitivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO) | (1L << REAL) | (1L << CARACTERE) | (1L << LITERAL) | (1L << LOGICO))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Tp_matrizContext extends ParserRuleContext {
		public Tp_prim_plContext tp_prim_pl() {
			return getRuleContext(Tp_prim_plContext.class,0);
		}
		public List<TerminalNode> T_INT_LIT() { return getTokens(GrammarPortugolParser.T_INT_LIT); }
		public TerminalNode T_INT_LIT(int i) {
			return getToken(GrammarPortugolParser.T_INT_LIT, i);
		}
		public Tp_matrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tp_matriz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterTp_matriz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitTp_matriz(this);
		}
	}

	public final Tp_matrizContext tp_matriz() throws RecognitionException {
		Tp_matrizContext _localctx = new Tp_matrizContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tp_matriz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__6);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95);
				match(T__7);
				setState(96);
				match(T_INT_LIT);
				setState(97);
				match(T__8);
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
			setState(102);
			match(T__9);
			setState(103);
			tp_prim_pl();
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

	public static class Tp_prim_plContext extends ParserRuleContext {
		public Tp_prim_plContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tp_prim_pl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterTp_prim_pl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitTp_prim_pl(this);
		}
	}

	public final Tp_prim_plContext tp_prim_pl() throws RecognitionException {
		Tp_prim_plContext _localctx = new Tp_prim_plContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tp_prim_pl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIROS) | (1L << REAIS) | (1L << CARACTERES) | (1L << LITERAIS) | (1L << LOGICOS))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Stm_blockContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public Stm_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterStm_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitStm_block(this);
		}
	}

	public final Stm_blockContext stm_block() throws RecognitionException {
		Stm_blockContext _localctx = new Stm_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stm_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__10);
			setState(108);
			statementList();
			setState(109);
			match(T__11);
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

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__14 - 13)) | (1L << (T__18 - 13)) | (1L << (T__21 - 13)) | (1L << (T_IDENTIFICADOR - 13)))) != 0)) {
				{
				{
				setState(111);
				statement();
				}
				}
				setState(116);
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

	public static class StatementContext extends ParserRuleContext {
		public Stm_attrContext stm_attr() {
			return getRuleContext(Stm_attrContext.class,0);
		}
		public FcallContext fcall() {
			return getRuleContext(FcallContext.class,0);
		}
		public Stm_retContext stm_ret() {
			return getRuleContext(Stm_retContext.class,0);
		}
		public Stm_seContext stm_se() {
			return getRuleContext(Stm_seContext.class,0);
		}
		public Stm_enquantoContext stm_enquanto() {
			return getRuleContext(Stm_enquantoContext.class,0);
		}
		public Stm_paraContext stm_para() {
			return getRuleContext(Stm_paraContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				stm_attr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				fcall();
				setState(119);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				stm_ret();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				stm_se();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				stm_enquanto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				stm_para();
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

	public static class Stm_retContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stm_retContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterStm_ret(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitStm_ret(this);
		}
	}

	public final Stm_retContext stm_ret() throws RecognitionException {
		Stm_retContext _localctx = new Stm_retContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stm_ret);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__12);
			setState(129);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (T__25 - 26)) | (1L << (T__26 - 26)) | (1L << (T__43 - 26)) | (1L << (T__44 - 26)) | (1L << (T__45 - 26)) | (1L << (T_INT_LIT - 26)) | (1L << (T_REAL_LIT - 26)) | (1L << (T_CARAC_LIT - 26)) | (1L << (T_STRING_LIT - 26)) | (1L << (T_IDENTIFICADOR - 26)) | (1L << (T_KW_VERDADEIRO - 26)) | (1L << (T_KW_FALSO - 26)))) != 0)) {
				{
				setState(128);
				expr(0);
				}
			}

			setState(131);
			match(T__1);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode T_IDENTIFICADOR() { return getToken(GrammarPortugolParser.T_IDENTIFICADOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lvalue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T_IDENTIFICADOR);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					match(T__7);
					setState(135);
					expr(0);
					setState(136);
					match(T__8);
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Stm_attrContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stm_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterStm_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitStm_attr(this);
		}
	}

	public final Stm_attrContext stm_attr() throws RecognitionException {
		Stm_attrContext _localctx = new Stm_attrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stm_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			lvalue();
			setState(144);
			match(T__13);
			setState(145);
			expr(0);
			setState(146);
			match(T__1);
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

	public static class Stm_seContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
		}
		public Stm_seContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterStm_se(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitStm_se(this);
		}
	}

	public final Stm_seContext stm_se() throws RecognitionException {
		Stm_seContext _localctx = new Stm_seContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stm_se);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__14);
			setState(149);
			expr(0);
			setState(150);
			match(T__15);
			setState(151);
			statementList();
			setState(154);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(152);
				match(T__16);
				setState(153);
				statementList();
				}
			}

			setState(156);
			match(T__17);
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

	public static class Stm_enquantoContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public Stm_enquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterStm_enquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitStm_enquanto(this);
		}
	}

	public final Stm_enquantoContext stm_enquanto() throws RecognitionException {
		Stm_enquantoContext _localctx = new Stm_enquantoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stm_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__18);
			setState(159);
			expr(0);
			setState(160);
			match(T__19);
			setState(161);
			statementList();
			setState(162);
			match(T__20);
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

	public static class Stm_paraContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public PassoContext passo() {
			return getRuleContext(PassoContext.class,0);
		}
		public Stm_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterStm_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitStm_para(this);
		}
	}

	public final Stm_paraContext stm_para() throws RecognitionException {
		Stm_paraContext _localctx = new Stm_paraContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stm_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__21);
			setState(165);
			lvalue();
			setState(166);
			match(T__9);
			setState(167);
			expr(0);
			setState(168);
			match(T__22);
			setState(169);
			expr(0);
			setState(171);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(170);
				passo();
				}
			}

			setState(173);
			match(T__19);
			setState(174);
			statementList();
			setState(175);
			match(T__23);
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

	public static class PassoContext extends ParserRuleContext {
		public TerminalNode T_INT_LIT() { return getToken(GrammarPortugolParser.T_INT_LIT, 0); }
		public PassoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterPasso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitPasso(this);
		}
	}

	public final PassoContext passo() throws RecognitionException {
		PassoContext _localctx = new PassoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_passo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__24);
			setState(179);
			_la = _input.LA(1);
			if (_la==T__25 || _la==T__26) {
				{
				setState(178);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(181);
			match(T_INT_LIT);
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

	public static class ExprContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(185);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__43) | (1L << T__44))) != 0)) {
				{
				setState(184);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__43) | (1L << T__44))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(187);
			termo();
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(190);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(191);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(193);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(194);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(196);
						match(T__31);
						setState(197);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(199);
						match(T__32);
						setState(200);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(202);
						match(T__33);
						setState(203);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(205);
						_la = _input.LA(1);
						if ( !(_la==T__34 || _la==T__35) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(206);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(208);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(209);
						expr(5);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(211);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(212);
						expr(4);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(214);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(215);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class TermoContext extends ParserRuleContext {
		public FcallContext fcall() {
			return getRuleContext(FcallContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_termo);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				fcall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				lvalue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(T__45);
				setState(225);
				expr(0);
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

	public static class FcallContext extends ParserRuleContext {
		public TerminalNode T_IDENTIFICADOR() { return getToken(GrammarPortugolParser.T_IDENTIFICADOR, 0); }
		public FargsContext fargs() {
			return getRuleContext(FargsContext.class,0);
		}
		public FcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterFcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitFcall(this);
		}
	}

	public final FcallContext fcall() throws RecognitionException {
		FcallContext _localctx = new FcallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T_IDENTIFICADOR);
			setState(229);
			match(T__45);
			setState(231);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (T__25 - 26)) | (1L << (T__26 - 26)) | (1L << (T__43 - 26)) | (1L << (T__44 - 26)) | (1L << (T__45 - 26)) | (1L << (T_INT_LIT - 26)) | (1L << (T_REAL_LIT - 26)) | (1L << (T_CARAC_LIT - 26)) | (1L << (T_STRING_LIT - 26)) | (1L << (T_IDENTIFICADOR - 26)) | (1L << (T_KW_VERDADEIRO - 26)) | (1L << (T_KW_FALSO - 26)))) != 0)) {
				{
				setState(230);
				fargs();
				}
			}

			setState(233);
			match(T__46);
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

	public static class FargsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterFargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitFargs(this);
		}
	}

	public final FargsContext fargs() throws RecognitionException {
		FargsContext _localctx = new FargsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			expr(0);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(236);
				match(T__4);
				setState(237);
				expr(0);
				}
				}
				setState(242);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode T_STRING_LIT() { return getToken(GrammarPortugolParser.T_STRING_LIT, 0); }
		public TerminalNode T_INT_LIT() { return getToken(GrammarPortugolParser.T_INT_LIT, 0); }
		public TerminalNode T_REAL_LIT() { return getToken(GrammarPortugolParser.T_REAL_LIT, 0); }
		public TerminalNode T_CARAC_LIT() { return getToken(GrammarPortugolParser.T_CARAC_LIT, 0); }
		public TerminalNode T_KW_VERDADEIRO() { return getToken(GrammarPortugolParser.T_KW_VERDADEIRO, 0); }
		public TerminalNode T_KW_FALSO() { return getToken(GrammarPortugolParser.T_KW_FALSO, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (T_INT_LIT - 59)) | (1L << (T_REAL_LIT - 59)) | (1L << (T_CARAC_LIT - 59)) | (1L << (T_STRING_LIT - 59)) | (1L << (T_KW_VERDADEIRO - 59)) | (1L << (T_KW_FALSO - 59)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Func_declsContext extends ParserRuleContext {
		public TerminalNode T_IDENTIFICADOR() { return getToken(GrammarPortugolParser.T_IDENTIFICADOR, 0); }
		public Fvar_declContext fvar_decl() {
			return getRuleContext(Fvar_declContext.class,0);
		}
		public Stm_blockContext stm_block() {
			return getRuleContext(Stm_blockContext.class,0);
		}
		public FparamsContext fparams() {
			return getRuleContext(FparamsContext.class,0);
		}
		public Tp_primitivoContext tp_primitivo() {
			return getRuleContext(Tp_primitivoContext.class,0);
		}
		public Func_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterFunc_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitFunc_decls(this);
		}
	}

	public final Func_declsContext func_decls() throws RecognitionException {
		Func_declsContext _localctx = new Func_declsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_func_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__47);
			setState(246);
			match(T_IDENTIFICADOR);
			setState(247);
			match(T__45);
			setState(249);
			_la = _input.LA(1);
			if (_la==T_IDENTIFICADOR) {
				{
				setState(248);
				fparams();
				}
			}

			setState(251);
			match(T__46);
			setState(254);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(252);
				match(T__5);
				setState(253);
				tp_primitivo();
				}
			}

			setState(256);
			fvar_decl();
			setState(257);
			stm_block();
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

	public static class Fvar_declContext extends ParserRuleContext {
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public Fvar_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fvar_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterFvar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitFvar_decl(this);
		}
	}

	public final Fvar_declContext fvar_decl() throws RecognitionException {
		Fvar_declContext _localctx = new Fvar_declContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fvar_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_IDENTIFICADOR) {
				{
				{
				setState(259);
				var_decl();
				setState(260);
				match(T__1);
				}
				}
				setState(266);
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

	public static class FparamsContext extends ParserRuleContext {
		public List<FparamContext> fparam() {
			return getRuleContexts(FparamContext.class);
		}
		public FparamContext fparam(int i) {
			return getRuleContext(FparamContext.class,i);
		}
		public FparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterFparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitFparams(this);
		}
	}

	public final FparamsContext fparams() throws RecognitionException {
		FparamsContext _localctx = new FparamsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			fparam();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(268);
				match(T__4);
				setState(269);
				fparam();
				}
				}
				setState(274);
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

	public static class FparamContext extends ParserRuleContext {
		public TerminalNode T_IDENTIFICADOR() { return getToken(GrammarPortugolParser.T_IDENTIFICADOR, 0); }
		public Tp_primitivoContext tp_primitivo() {
			return getRuleContext(Tp_primitivoContext.class,0);
		}
		public Tp_matrizContext tp_matriz() {
			return getRuleContext(Tp_matrizContext.class,0);
		}
		public FparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterFparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitFparam(this);
		}
	}

	public final FparamContext fparam() throws RecognitionException {
		FparamContext _localctx = new FparamContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T_IDENTIFICADOR);
			setState(276);
			match(T__5);
			setState(279);
			switch (_input.LA(1)) {
			case INTEIRO:
			case REAL:
			case CARACTERE:
			case LITERAL:
			case LOGICO:
				{
				setState(277);
				tp_primitivo();
				}
				break;
			case T__6:
				{
				setState(278);
				tp_matriz();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3M\u011c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\5\29\n\2\3\2\3\2\7\2=\n\2\f\2\16\2@\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4L\n\4\r\4\16\4M\3\4\3\4\3"+
		"\5\3\5\3\5\7\5U\n\5\f\5\16\5X\13\5\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\6\7e\n\7\r\7\16\7f\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\7\ns\n\n\f\n\16\nv\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0080\n\13\3\f\3\f\5\f\u0084\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u008d"+
		"\n\r\f\r\16\r\u0090\13\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u009d\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ae\n\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\5\22\u00b6\n\22\3\22\3\22\3\23\3\23\5\23\u00bc\n\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00db"+
		"\n\23\f\23\16\23\u00de\13\23\3\24\3\24\3\24\3\24\3\24\5\24\u00e5\n\24"+
		"\3\25\3\25\3\25\5\25\u00ea\n\25\3\25\3\25\3\26\3\26\3\26\7\26\u00f1\n"+
		"\26\f\26\16\26\u00f4\13\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u00fc\n"+
		"\30\3\30\3\30\3\30\5\30\u0101\n\30\3\30\3\30\3\30\3\31\3\31\3\31\7\31"+
		"\u0109\n\31\f\31\16\31\u010c\13\31\3\32\3\32\3\32\7\32\u0111\n\32\f\32"+
		"\16\32\u0114\13\32\3\33\3\33\3\33\3\33\5\33\u011a\n\33\3\33\2\3$\34\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\f\3\2\63\67"+
		"\3\28<\3\2\34\35\4\2\34\35./\3\2\36\37\3\2 !\3\2%&\3\2\'*\3\2+-\5\2=="+
		"BDKL\u0126\2\66\3\2\2\2\4C\3\2\2\2\6G\3\2\2\2\bQ\3\2\2\2\n^\3\2\2\2\f"+
		"`\3\2\2\2\16k\3\2\2\2\20m\3\2\2\2\22t\3\2\2\2\24\177\3\2\2\2\26\u0081"+
		"\3\2\2\2\30\u0087\3\2\2\2\32\u0091\3\2\2\2\34\u0096\3\2\2\2\36\u00a0\3"+
		"\2\2\2 \u00a6\3\2\2\2\"\u00b3\3\2\2\2$\u00b9\3\2\2\2&\u00e4\3\2\2\2(\u00e6"+
		"\3\2\2\2*\u00ed\3\2\2\2,\u00f5\3\2\2\2.\u00f7\3\2\2\2\60\u010a\3\2\2\2"+
		"\62\u010d\3\2\2\2\64\u0115\3\2\2\2\668\5\4\3\2\679\5\6\4\28\67\3\2\2\2"+
		"89\3\2\2\29:\3\2\2\2:>\5\20\t\2;=\5.\30\2<;\3\2\2\2=@\3\2\2\2><\3\2\2"+
		"\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\2\2\3B\3\3\2\2\2CD\7\3\2\2DE\7J\2"+
		"\2EF\7\4\2\2F\5\3\2\2\2GK\7\5\2\2HI\5\b\5\2IJ\7\4\2\2JL\3\2\2\2KH\3\2"+
		"\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\6\2\2P\7\3\2\2\2QV\7"+
		"J\2\2RS\7\7\2\2SU\7J\2\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2"+
		"\2\2XV\3\2\2\2Y\\\7\b\2\2Z]\5\n\6\2[]\5\f\7\2\\Z\3\2\2\2\\[\3\2\2\2]\t"+
		"\3\2\2\2^_\t\2\2\2_\13\3\2\2\2`d\7\t\2\2ab\7\n\2\2bc\7=\2\2ce\7\13\2\2"+
		"da\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\f\2\2ij\5\16\b"+
		"\2j\r\3\2\2\2kl\t\3\2\2l\17\3\2\2\2mn\7\r\2\2no\5\22\n\2op\7\16\2\2p\21"+
		"\3\2\2\2qs\5\24\13\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\23\3\2\2"+
		"\2vt\3\2\2\2w\u0080\5\32\16\2xy\5(\25\2yz\7\4\2\2z\u0080\3\2\2\2{\u0080"+
		"\5\26\f\2|\u0080\5\34\17\2}\u0080\5\36\20\2~\u0080\5 \21\2\177w\3\2\2"+
		"\2\177x\3\2\2\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080"+
		"\25\3\2\2\2\u0081\u0083\7\17\2\2\u0082\u0084\5$\23\2\u0083\u0082\3\2\2"+
		"\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\4\2\2\u0086\27"+
		"\3\2\2\2\u0087\u008e\7J\2\2\u0088\u0089\7\n\2\2\u0089\u008a\5$\23\2\u008a"+
		"\u008b\7\13\2\2\u008b\u008d\3\2\2\2\u008c\u0088\3\2\2\2\u008d\u0090\3"+
		"\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\31\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0092\5\30\r\2\u0092\u0093\7\20\2\2\u0093\u0094\5"+
		"$\23\2\u0094\u0095\7\4\2\2\u0095\33\3\2\2\2\u0096\u0097\7\21\2\2\u0097"+
		"\u0098\5$\23\2\u0098\u0099\7\22\2\2\u0099\u009c\5\22\n\2\u009a\u009b\7"+
		"\23\2\2\u009b\u009d\5\22\n\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\7\24\2\2\u009f\35\3\2\2\2\u00a0\u00a1\7\25"+
		"\2\2\u00a1\u00a2\5$\23\2\u00a2\u00a3\7\26\2\2\u00a3\u00a4\5\22\n\2\u00a4"+
		"\u00a5\7\27\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\7\30\2\2\u00a7\u00a8\5\30"+
		"\r\2\u00a8\u00a9\7\f\2\2\u00a9\u00aa\5$\23\2\u00aa\u00ab\7\31\2\2\u00ab"+
		"\u00ad\5$\23\2\u00ac\u00ae\5\"\22\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7\26\2\2\u00b0\u00b1\5\22\n\2\u00b1"+
		"\u00b2\7\32\2\2\u00b2!\3\2\2\2\u00b3\u00b5\7\33\2\2\u00b4\u00b6\t\4\2"+
		"\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8"+
		"\7=\2\2\u00b8#\3\2\2\2\u00b9\u00bb\b\23\1\2\u00ba\u00bc\t\5\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\5&"+
		"\24\2\u00be\u00dc\3\2\2\2\u00bf\u00c0\f\f\2\2\u00c0\u00c1\t\6\2\2\u00c1"+
		"\u00db\5$\23\r\u00c2\u00c3\f\13\2\2\u00c3\u00c4\t\7\2\2\u00c4\u00db\5"+
		"$\23\f\u00c5\u00c6\f\n\2\2\u00c6\u00c7\7\"\2\2\u00c7\u00db\5$\23\13\u00c8"+
		"\u00c9\f\t\2\2\u00c9\u00ca\7#\2\2\u00ca\u00db\5$\23\n\u00cb\u00cc\f\b"+
		"\2\2\u00cc\u00cd\7$\2\2\u00cd\u00db\5$\23\t\u00ce\u00cf\f\7\2\2\u00cf"+
		"\u00d0\t\b\2\2\u00d0\u00db\5$\23\b\u00d1\u00d2\f\6\2\2\u00d2\u00d3\t\t"+
		"\2\2\u00d3\u00db\5$\23\7\u00d4\u00d5\f\5\2\2\u00d5\u00d6\t\4\2\2\u00d6"+
		"\u00db\5$\23\6\u00d7\u00d8\f\4\2\2\u00d8\u00d9\t\n\2\2\u00d9\u00db\5$"+
		"\23\5\u00da\u00bf\3\2\2\2\u00da\u00c2\3\2\2\2\u00da\u00c5\3\2\2\2\u00da"+
		"\u00c8\3\2\2\2\u00da\u00cb\3\2\2\2\u00da\u00ce\3\2\2\2\u00da\u00d1\3\2"+
		"\2\2\u00da\u00d4\3\2\2\2\u00da\u00d7\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd%\3\2\2\2\u00de\u00dc\3\2\2\2"+
		"\u00df\u00e5\5(\25\2\u00e0\u00e5\5\30\r\2\u00e1\u00e5\5,\27\2\u00e2\u00e3"+
		"\7\60\2\2\u00e3\u00e5\5$\23\2\u00e4\u00df\3\2\2\2\u00e4\u00e0\3\2\2\2"+
		"\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\'\3\2\2\2\u00e6\u00e7\7"+
		"J\2\2\u00e7\u00e9\7\60\2\2\u00e8\u00ea\5*\26\2\u00e9\u00e8\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7\61\2\2\u00ec)\3\2\2\2"+
		"\u00ed\u00f2\5$\23\2\u00ee\u00ef\7\7\2\2\u00ef\u00f1\5$\23\2\u00f0\u00ee"+
		"\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"+\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\t\13\2\2\u00f6-\3\2\2\2\u00f7"+
		"\u00f8\7\62\2\2\u00f8\u00f9\7J\2\2\u00f9\u00fb\7\60\2\2\u00fa\u00fc\5"+
		"\62\32\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u0100\7\61\2\2\u00fe\u00ff\7\b\2\2\u00ff\u0101\5\n\6\2\u0100\u00fe\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\5\60\31\2\u0103"+
		"\u0104\5\20\t\2\u0104/\3\2\2\2\u0105\u0106\5\b\5\2\u0106\u0107\7\4\2\2"+
		"\u0107\u0109\3\2\2\2\u0108\u0105\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\61\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u0112\5\64\33\2\u010e\u010f\7\7\2\2\u010f\u0111\5\64\33\2\u0110\u010e"+
		"\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\63\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7J\2\2\u0116\u0119\7\b\2\2"+
		"\u0117\u011a\5\n\6\2\u0118\u011a\5\f\7\2\u0119\u0117\3\2\2\2\u0119\u0118"+
		"\3\2\2\2\u011a\65\3\2\2\2\328>MV\\ft\177\u0083\u008e\u009c\u00ad\u00b5"+
		"\u00bb\u00da\u00dc\u00e4\u00e9\u00f2\u00fb\u0100\u010a\u0112\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}