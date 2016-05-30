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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T_INT_LIT=59, 
		T_DEC_LIT=60, T_OCTAL_LIT=61, T_HEX_LIT=62, T_BIN_LIT=63, T_REAL_LIT=64, 
		T_CARAC_LIT=65, T_STRING_LIT=66, SL_COMMENT=67, ML_COMMENT=68, T_IDENTIFICADOR=69, 
		T_KW_VERDADEIRO=70, T_KW_FALSO=71, WS=72;
	public static final int
		RULE_algoritmo = 0, RULE_declaracao_algoritmo = 1, RULE_var_decl_block = 2, 
		RULE_var_decl = 3, RULE_tp_primitivo = 4, RULE_tp_matriz = 5, RULE_tp_prim_pl = 6, 
		RULE_stm_block = 7, RULE_stm_list = 8, RULE_stm_ret = 9, RULE_lvalue = 10, 
		RULE_stm_attr = 11, RULE_stm_se = 12, RULE_stm_enquanto = 13, RULE_stm_para = 14, 
		RULE_passo = 15, RULE_expr = 16, RULE_termo = 17, RULE_fcall = 18, RULE_fargs = 19, 
		RULE_literal = 20, RULE_func_decls = 21, RULE_fvar_decl = 22, RULE_fparams = 23, 
		RULE_fparam = 24;
	public static final String[] ruleNames = {
		"algoritmo", "declaracao_algoritmo", "var_decl_block", "var_decl", "tp_primitivo", 
		"tp_matriz", "tp_prim_pl", "stm_block", "stm_list", "stm_ret", "lvalue", 
		"stm_attr", "stm_se", "stm_enquanto", "stm_para", "passo", "expr", "termo", 
		"fcall", "fargs", "literal", "func_decls", "fvar_decl", "fparams", "fparam"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'algoritmo'", "';'", "'variáveis'", "'fim-variáveis'", "','", 
		"':'", "'inteiro'", "'real'", "'caractere'", "'literal'", "'lógico'", 
		"'matriz'", "'['", "']'", "'de'", "'inteiros'", "'reais'", "'caracteres'", 
		"'literais'", "'lógicos'", "'início'", "'fim'", "'retorne'", "':='", 
		"'se'", "'então'", "'senão'", "'fim-se'", "'enquanto'", "'faça'", "'fim-enquanto'", 
		"'para'", "'até'", "'fim-para'", "'passo'", "'+'", "'-'", "'ou'", "'||'", 
		"'e'", "'&&'", "'|'", "'^'", "'&'", "'='", "'<>'", "'>'", "'>='", "'<'", 
		"'<='", "'/'", "'*'", "'%'", "'~'", "'não'", "'('", "')'", "'função'", 
		null, null, null, null, null, null, null, null, null, null, null, "'verdadeiro'", 
		"'falso'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "T_INT_LIT", 
		"T_DEC_LIT", "T_OCTAL_LIT", "T_HEX_LIT", "T_BIN_LIT", "T_REAL_LIT", "T_CARAC_LIT", 
		"T_STRING_LIT", "SL_COMMENT", "ML_COMMENT", "T_IDENTIFICADOR", "T_KW_VERDADEIRO", 
		"T_KW_FALSO", "WS"
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
			setState(50);
			declaracao_algoritmo();
			setState(52);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(51);
				var_decl_block();
				}
			}

			setState(54);
			stm_block();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__57) {
				{
				{
				setState(55);
				func_decls();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
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
			setState(63);
			match(T__0);
			setState(64);
			match(T_IDENTIFICADOR);
			setState(65);
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
			setState(67);
			match(T__2);
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				var_decl();
				setState(69);
				match(T__1);
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_IDENTIFICADOR );
			setState(75);
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
			setState(77);
			match(T_IDENTIFICADOR);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(78);
				match(T__4);
				setState(79);
				match(T_IDENTIFICADOR);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(T__5);
			setState(88);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
				{
				setState(86);
				tp_primitivo();
				}
				break;
			case T__11:
				{
				setState(87);
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
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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
			setState(92);
			match(T__11);
			setState(96); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				match(T__12);
				setState(94);
				match(T_INT_LIT);
				setState(95);
				match(T__13);
				}
				}
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__12 );
			setState(100);
			match(T__14);
			setState(101);
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
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
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
		public List<Stm_listContext> stm_list() {
			return getRuleContexts(Stm_listContext.class);
		}
		public Stm_listContext stm_list(int i) {
			return getRuleContext(Stm_listContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__20);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (T__22 - 23)) | (1L << (T__24 - 23)) | (1L << (T__28 - 23)) | (1L << (T__31 - 23)) | (1L << (T_IDENTIFICADOR - 23)))) != 0)) {
				{
				{
				setState(106);
				stm_list();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(T__21);
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

	public static class Stm_listContext extends ParserRuleContext {
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
		public Stm_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).enterStm_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPortugolListener ) ((GrammarPortugolListener)listener).exitStm_list(this);
		}
	}

	public final Stm_listContext stm_list() throws RecognitionException {
		Stm_listContext _localctx = new Stm_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stm_list);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				stm_attr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				fcall();
				setState(116);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				stm_ret();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				stm_se();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				stm_enquanto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
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
		enterRule(_localctx, 18, RULE_stm_ret);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__22);
			setState(126);
			_la = _input.LA(1);
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (T__35 - 36)) | (1L << (T__36 - 36)) | (1L << (T__53 - 36)) | (1L << (T__54 - 36)) | (1L << (T__55 - 36)) | (1L << (T_INT_LIT - 36)) | (1L << (T_REAL_LIT - 36)) | (1L << (T_CARAC_LIT - 36)) | (1L << (T_STRING_LIT - 36)) | (1L << (T_IDENTIFICADOR - 36)) | (1L << (T_KW_VERDADEIRO - 36)) | (1L << (T_KW_FALSO - 36)))) != 0)) {
				{
				setState(125);
				expr(0);
				}
			}

			setState(128);
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
		enterRule(_localctx, 20, RULE_lvalue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T_IDENTIFICADOR);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(131);
					match(T__12);
					setState(132);
					expr(0);
					setState(133);
					match(T__13);
					}
					} 
				}
				setState(139);
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
		enterRule(_localctx, 22, RULE_stm_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			lvalue();
			setState(141);
			match(T__23);
			setState(142);
			expr(0);
			setState(143);
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
		public List<Stm_listContext> stm_list() {
			return getRuleContexts(Stm_listContext.class);
		}
		public Stm_listContext stm_list(int i) {
			return getRuleContext(Stm_listContext.class,i);
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
		enterRule(_localctx, 24, RULE_stm_se);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__24);
			setState(146);
			expr(0);
			setState(147);
			match(T__25);
			setState(148);
			stm_list();
			setState(151);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(149);
				match(T__26);
				setState(150);
				stm_list();
				}
			}

			setState(153);
			match(T__27);
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
		public Stm_listContext stm_list() {
			return getRuleContext(Stm_listContext.class,0);
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
		enterRule(_localctx, 26, RULE_stm_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__28);
			setState(156);
			expr(0);
			setState(157);
			match(T__29);
			setState(158);
			stm_list();
			setState(159);
			match(T__30);
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
		public Stm_listContext stm_list() {
			return getRuleContext(Stm_listContext.class,0);
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
		enterRule(_localctx, 28, RULE_stm_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__31);
			setState(162);
			lvalue();
			setState(163);
			match(T__14);
			setState(164);
			expr(0);
			setState(165);
			match(T__32);
			setState(166);
			expr(0);
			setState(168);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(167);
				passo();
				}
			}

			setState(170);
			match(T__29);
			setState(171);
			stm_list();
			setState(172);
			match(T__33);
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
		enterRule(_localctx, 30, RULE_passo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__34);
			setState(176);
			_la = _input.LA(1);
			if (_la==T__35 || _la==T__36) {
				{
				setState(175);
				_la = _input.LA(1);
				if ( !(_la==T__35 || _la==T__36) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(178);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(182);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__53) | (1L << T__54))) != 0)) {
				{
				setState(181);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__53) | (1L << T__54))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(184);
			termo();
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(187);
						_la = _input.LA(1);
						if ( !(_la==T__37 || _la==T__38) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(188);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(190);
						_la = _input.LA(1);
						if ( !(_la==T__39 || _la==T__40) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(191);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(193);
						match(T__41);
						setState(194);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(196);
						match(T__42);
						setState(197);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(199);
						match(T__43);
						setState(200);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(202);
						_la = _input.LA(1);
						if ( !(_la==T__44 || _la==T__45) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(203);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(205);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(206);
						expr(5);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(208);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(209);
						expr(4);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(211);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__51) | (1L << T__52))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(212);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(217);
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
		enterRule(_localctx, 34, RULE_termo);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				fcall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				lvalue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				match(T__55);
				setState(222);
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
		enterRule(_localctx, 36, RULE_fcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T_IDENTIFICADOR);
			setState(226);
			match(T__55);
			setState(228);
			_la = _input.LA(1);
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (T__35 - 36)) | (1L << (T__36 - 36)) | (1L << (T__53 - 36)) | (1L << (T__54 - 36)) | (1L << (T__55 - 36)) | (1L << (T_INT_LIT - 36)) | (1L << (T_REAL_LIT - 36)) | (1L << (T_CARAC_LIT - 36)) | (1L << (T_STRING_LIT - 36)) | (1L << (T_IDENTIFICADOR - 36)) | (1L << (T_KW_VERDADEIRO - 36)) | (1L << (T_KW_FALSO - 36)))) != 0)) {
				{
				setState(227);
				fargs();
				}
			}

			setState(230);
			match(T__56);
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
		enterRule(_localctx, 38, RULE_fargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			expr(0);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(233);
				match(T__4);
				setState(234);
				expr(0);
				}
				}
				setState(239);
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
		enterRule(_localctx, 40, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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
		enterRule(_localctx, 42, RULE_func_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__57);
			setState(243);
			match(T_IDENTIFICADOR);
			setState(244);
			match(T__55);
			setState(246);
			_la = _input.LA(1);
			if (_la==T_IDENTIFICADOR) {
				{
				setState(245);
				fparams();
				}
			}

			setState(248);
			match(T__56);
			setState(251);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(249);
				match(T__5);
				setState(250);
				tp_primitivo();
				}
			}

			setState(253);
			fvar_decl();
			setState(254);
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
		enterRule(_localctx, 44, RULE_fvar_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_IDENTIFICADOR) {
				{
				{
				setState(256);
				var_decl();
				setState(257);
				match(T__1);
				}
				}
				setState(263);
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
		enterRule(_localctx, 46, RULE_fparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			fparam();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(265);
				match(T__4);
				setState(266);
				fparam();
				}
				}
				setState(271);
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
		enterRule(_localctx, 48, RULE_fparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T_IDENTIFICADOR);
			setState(273);
			match(T__5);
			setState(276);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
				{
				setState(274);
				tp_primitivo();
				}
				break;
			case T__11:
				{
				setState(275);
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
		case 16:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3J\u0119\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\5\2\67\n\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4J\n\4\r\4\16\4K\3\4\3\4\3\5\3\5\3"+
		"\5\7\5S\n\5\f\5\16\5V\13\5\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\6\7c\n\7\r\7\16\7d\3\7\3\7\3\7\3\b\3\b\3\t\3\t\7\tn\n\t\f\t\16\tq\13"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n}\n\n\3\13\3\13\5\13\u0081"+
		"\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u008a\n\f\f\f\16\f\u008d\13\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009a\n\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00ab\n\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00b3\n\21\3\21\3"+
		"\21\3\22\3\22\5\22\u00b9\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00d8\n\22\f\22\16\22\u00db\13"+
		"\22\3\23\3\23\3\23\3\23\3\23\5\23\u00e2\n\23\3\24\3\24\3\24\5\24\u00e7"+
		"\n\24\3\24\3\24\3\25\3\25\3\25\7\25\u00ee\n\25\f\25\16\25\u00f1\13\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u00f9\n\27\3\27\3\27\3\27\5\27\u00fe"+
		"\n\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u0106\n\30\f\30\16\30\u0109\13"+
		"\30\3\31\3\31\3\31\7\31\u010e\n\31\f\31\16\31\u0111\13\31\3\32\3\32\3"+
		"\32\3\32\5\32\u0117\n\32\3\32\2\3\"\33\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\2\f\3\2\t\r\3\2\22\26\3\2&\'\4\2&\'89\3\2()\3\2"+
		"*+\3\2/\60\3\2\61\64\3\2\65\67\5\2==BDHI\u0124\2\64\3\2\2\2\4A\3\2\2\2"+
		"\6E\3\2\2\2\bO\3\2\2\2\n\\\3\2\2\2\f^\3\2\2\2\16i\3\2\2\2\20k\3\2\2\2"+
		"\22|\3\2\2\2\24~\3\2\2\2\26\u0084\3\2\2\2\30\u008e\3\2\2\2\32\u0093\3"+
		"\2\2\2\34\u009d\3\2\2\2\36\u00a3\3\2\2\2 \u00b0\3\2\2\2\"\u00b6\3\2\2"+
		"\2$\u00e1\3\2\2\2&\u00e3\3\2\2\2(\u00ea\3\2\2\2*\u00f2\3\2\2\2,\u00f4"+
		"\3\2\2\2.\u0107\3\2\2\2\60\u010a\3\2\2\2\62\u0112\3\2\2\2\64\66\5\4\3"+
		"\2\65\67\5\6\4\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3\2\2\28<\5\20\t\29;"+
		"\5,\27\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?"+
		"@\7\2\2\3@\3\3\2\2\2AB\7\3\2\2BC\7G\2\2CD\7\4\2\2D\5\3\2\2\2EI\7\5\2\2"+
		"FG\5\b\5\2GH\7\4\2\2HJ\3\2\2\2IF\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2"+
		"LM\3\2\2\2MN\7\6\2\2N\7\3\2\2\2OT\7G\2\2PQ\7\7\2\2QS\7G\2\2RP\3\2\2\2"+
		"SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WZ\7\b\2\2X[\5\n\6\2"+
		"Y[\5\f\7\2ZX\3\2\2\2ZY\3\2\2\2[\t\3\2\2\2\\]\t\2\2\2]\13\3\2\2\2^b\7\16"+
		"\2\2_`\7\17\2\2`a\7=\2\2ac\7\20\2\2b_\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3"+
		"\2\2\2ef\3\2\2\2fg\7\21\2\2gh\5\16\b\2h\r\3\2\2\2ij\t\3\2\2j\17\3\2\2"+
		"\2ko\7\27\2\2ln\5\22\n\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2"+
		"\2\2qo\3\2\2\2rs\7\30\2\2s\21\3\2\2\2t}\5\30\r\2uv\5&\24\2vw\7\4\2\2w"+
		"}\3\2\2\2x}\5\24\13\2y}\5\32\16\2z}\5\34\17\2{}\5\36\20\2|t\3\2\2\2|u"+
		"\3\2\2\2|x\3\2\2\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\23\3\2\2\2~\u0080\7"+
		"\31\2\2\177\u0081\5\"\22\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\7\4\2\2\u0083\25\3\2\2\2\u0084\u008b\7G\2\2"+
		"\u0085\u0086\7\17\2\2\u0086\u0087\5\"\22\2\u0087\u0088\7\20\2\2\u0088"+
		"\u008a\3\2\2\2\u0089\u0085\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\27\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f"+
		"\5\26\f\2\u008f\u0090\7\32\2\2\u0090\u0091\5\"\22\2\u0091\u0092\7\4\2"+
		"\2\u0092\31\3\2\2\2\u0093\u0094\7\33\2\2\u0094\u0095\5\"\22\2\u0095\u0096"+
		"\7\34\2\2\u0096\u0099\5\22\n\2\u0097\u0098\7\35\2\2\u0098\u009a\5\22\n"+
		"\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c"+
		"\7\36\2\2\u009c\33\3\2\2\2\u009d\u009e\7\37\2\2\u009e\u009f\5\"\22\2\u009f"+
		"\u00a0\7 \2\2\u00a0\u00a1\5\22\n\2\u00a1\u00a2\7!\2\2\u00a2\35\3\2\2\2"+
		"\u00a3\u00a4\7\"\2\2\u00a4\u00a5\5\26\f\2\u00a5\u00a6\7\21\2\2\u00a6\u00a7"+
		"\5\"\22\2\u00a7\u00a8\7#\2\2\u00a8\u00aa\5\"\22\2\u00a9\u00ab\5 \21\2"+
		"\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad"+
		"\7 \2\2\u00ad\u00ae\5\22\n\2\u00ae\u00af\7$\2\2\u00af\37\3\2\2\2\u00b0"+
		"\u00b2\7%\2\2\u00b1\u00b3\t\4\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7=\2\2\u00b5!\3\2\2\2\u00b6\u00b8"+
		"\b\22\1\2\u00b7\u00b9\t\5\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2"+
		"\u00b9\u00ba\3\2\2\2\u00ba\u00bb\5$\23\2\u00bb\u00d9\3\2\2\2\u00bc\u00bd"+
		"\f\f\2\2\u00bd\u00be\t\6\2\2\u00be\u00d8\5\"\22\r\u00bf\u00c0\f\13\2\2"+
		"\u00c0\u00c1\t\7\2\2\u00c1\u00d8\5\"\22\f\u00c2\u00c3\f\n\2\2\u00c3\u00c4"+
		"\7,\2\2\u00c4\u00d8\5\"\22\13\u00c5\u00c6\f\t\2\2\u00c6\u00c7\7-\2\2\u00c7"+
		"\u00d8\5\"\22\n\u00c8\u00c9\f\b\2\2\u00c9\u00ca\7.\2\2\u00ca\u00d8\5\""+
		"\22\t\u00cb\u00cc\f\7\2\2\u00cc\u00cd\t\b\2\2\u00cd\u00d8\5\"\22\b\u00ce"+
		"\u00cf\f\6\2\2\u00cf\u00d0\t\t\2\2\u00d0\u00d8\5\"\22\7\u00d1\u00d2\f"+
		"\5\2\2\u00d2\u00d3\t\4\2\2\u00d3\u00d8\5\"\22\6\u00d4\u00d5\f\4\2\2\u00d5"+
		"\u00d6\t\n\2\2\u00d6\u00d8\5\"\22\5\u00d7\u00bc\3\2\2\2\u00d7\u00bf\3"+
		"\2\2\2\u00d7\u00c2\3\2\2\2\u00d7\u00c5\3\2\2\2\u00d7\u00c8\3\2\2\2\u00d7"+
		"\u00cb\3\2\2\2\u00d7\u00ce\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d4\3\2"+
		"\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"#\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00e2\5&\24\2\u00dd\u00e2\5\26\f\2"+
		"\u00de\u00e2\5*\26\2\u00df\u00e0\7:\2\2\u00e0\u00e2\5\"\22\2\u00e1\u00dc"+
		"\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"%\3\2\2\2\u00e3\u00e4\7G\2\2\u00e4\u00e6\7:\2\2\u00e5\u00e7\5(\25\2\u00e6"+
		"\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7;"+
		"\2\2\u00e9\'\3\2\2\2\u00ea\u00ef\5\"\22\2\u00eb\u00ec\7\7\2\2\u00ec\u00ee"+
		"\5\"\22\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2"+
		"\u00ef\u00f0\3\2\2\2\u00f0)\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\t"+
		"\13\2\2\u00f3+\3\2\2\2\u00f4\u00f5\7<\2\2\u00f5\u00f6\7G\2\2\u00f6\u00f8"+
		"\7:\2\2\u00f7\u00f9\5\60\31\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2"+
		"\u00f9\u00fa\3\2\2\2\u00fa\u00fd\7;\2\2\u00fb\u00fc\7\b\2\2\u00fc\u00fe"+
		"\5\n\6\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\5.\30\2\u0100\u0101\5\20\t\2\u0101-\3\2\2\2\u0102\u0103\5\b\5\2"+
		"\u0103\u0104\7\4\2\2\u0104\u0106\3\2\2\2\u0105\u0102\3\2\2\2\u0106\u0109"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108/\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u010a\u010f\5\62\32\2\u010b\u010c\7\7\2\2\u010c\u010e\5"+
		"\62\32\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\61\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7G\2\2"+
		"\u0113\u0116\7\b\2\2\u0114\u0117\5\n\6\2\u0115\u0117\5\f\7\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0115\3\2\2\2\u0117\63\3\2\2\2\32\66<KTZdo|\u0080\u008b"+
		"\u0099\u00aa\u00b2\u00b8\u00d7\u00d9\u00e1\u00e6\u00ef\u00f8\u00fd\u0107"+
		"\u010f\u0116";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}