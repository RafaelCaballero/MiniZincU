package minizinc.antlr4;
// Generated from MiniZincGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniZincGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__85=1, T__84=2, T__83=3, T__82=4, T__81=5, T__80=6, T__79=7, T__78=8, 
		T__77=9, T__76=10, T__75=11, T__74=12, T__73=13, T__72=14, T__71=15, T__70=16, 
		T__69=17, T__68=18, T__67=19, T__66=20, T__65=21, T__64=22, T__63=23, 
		T__62=24, T__61=25, T__60=26, T__59=27, T__58=28, T__57=29, T__56=30, 
		T__55=31, T__54=32, T__53=33, T__52=34, T__51=35, T__50=36, T__49=37, 
		T__48=38, T__47=39, T__46=40, T__45=41, T__44=42, T__43=43, T__42=44, 
		T__41=45, T__40=46, T__39=47, T__38=48, T__37=49, T__36=50, T__35=51, 
		T__34=52, T__33=53, T__32=54, T__31=55, T__30=56, T__29=57, T__28=58, 
		T__27=59, T__26=60, T__25=61, T__24=62, T__23=63, T__22=64, T__21=65, 
		T__20=66, T__19=67, T__18=68, T__17=69, T__16=70, T__15=71, T__14=72, 
		T__13=73, T__12=74, T__11=75, T__10=76, T__9=77, T__8=78, T__7=79, T__6=80, 
		T__5=81, T__4=82, T__3=83, T__2=84, T__1=85, T__0=86, ESC=87, SINGLE_LINE_COMMENT=88, 
		ID=89, NAT=90, WS=91, BOOL=92;
	public static final String[] tokenNames = {
		"<INVALID>", "'endif'", "'maximize'", "'int_search'", "'minimize'", "'set'", 
		"'!='", "'float'", "'{'", "'..'", "'::'", "'='", "'^'", "'int'", "'bool_search'", 
		"'include'", "'union'", "'('", "','", "'extended'", "'output'", "'indomain'", 
		"'<-'", "'var'", "'first_fail'", "'indomain_split'", "'smallest'", "'complete'", 
		"'endcase'", "'mod'", "'>='", "'<'", "'++'", "']'", "'indomain_random'", 
		"'|]'", "'#'", "'let'", "'-->'", "'function'", "'seq_search'", "'then'", 
		"'+'", "'array'", "'<->'", "'/'", "'of'", "'elseif'", "'indomain_min'", 
		"';'", "'predicate'", "'set_search'", "'}'", "'if'", "'solve'", "'\\/'", 
		"'enum'", "'`'", "'<='", "'[|'", "'\"'", "'constraint'", "'*'", "'.'", 
		"'case'", "'->'", "'par'", "':'", "'['", "'|'", "'=='", "'bool'", "'>'", 
		"'_'", "'xor'", "'where'", "'satisfy'", "'indomain_median'", "'div'", 
		"'else'", "'in'", "'intersect'", "')'", "'/\\'", "'not'", "'input_order'", 
		"'-'", "ESC", "SINGLE_LINE_COMMENT", "ID", "NAT", "WS", "BOOL"
	};
	public static final int
		RULE_model = 0, RULE_stat = 1, RULE_decl = 2, RULE_vardecl = 3, RULE_pardecl = 4, 
		RULE_data = 5, RULE_extended = 6, RULE_listExtended = 7, RULE_preExt = 8, 
		RULE_postExt = 9, RULE_constraint = 10, RULE_var = 11, RULE_output = 12, 
		RULE_solve = 13, RULE_parameter = 14, RULE_include = 15, RULE_init = 16, 
		RULE_predicate = 17, RULE_function = 18, RULE_qualName = 19, RULE_satisfy = 20, 
		RULE_optimize = 21, RULE_maximize = 22, RULE_minimize = 23, RULE_annotation = 24, 
		RULE_modeAnnotation = 25, RULE_intS = 26, RULE_boolS = 27, RULE_setS = 28, 
		RULE_seqS = 29, RULE_restS = 30, RULE_varchoice = 31, RULE_constrainchoice = 32, 
		RULE_constr = 33, RULE_scons = 34, RULE_tcons = 35, RULE_arg = 36, RULE_argint = 37, 
		RULE_argfloat = 38, RULE_argbool = 39, RULE_argunion = 40, RULE_argrange = 41, 
		RULE_typename = 42, RULE_typeset = 43, RULE_vararray = 44, RULE_pararray = 45, 
		RULE_dimensions = 46, RULE_typedata = 47, RULE_expr = 48, RULE_boolVal = 49, 
		RULE_op = 50, RULE_boolOp = 51, RULE_arithOp = 52, RULE_arithOp2 = 53, 
		RULE_qualBoolOp = 54, RULE_qualArithOp = 55, RULE_boolComplexExpr = 56, 
		RULE_boolExpr = 57, RULE_operand = 58, RULE_arithComplexExpr = 59, RULE_arithExpr = 60, 
		RULE_notExpr = 61, RULE_minusExpr = 62, RULE_predOrUnionExpr = 63, RULE_onesection = 64, 
		RULE_twosections = 65, RULE_rbracketExpr = 66, RULE_idexpr = 67, RULE_stringExpr = 68, 
		RULE_infixOp = 69, RULE_infixSetOp = 70, RULE_arrayaccess = 71, RULE_caseExpr = 72, 
		RULE_caseBranch = 73, RULE_listExpr = 74, RULE_oneDimList = 75, RULE_simpleList = 76, 
		RULE_simpleNonEmptyList = 77, RULE_guardedList = 78, RULE_multiDimList = 79, 
		RULE_listValue = 80, RULE_inDecl = 81, RULE_whereCond = 82, RULE_letExpr = 83, 
		RULE_letDecl = 84, RULE_ifExpr = 85, RULE_bodyIf = 86, RULE_elseS = 87, 
		RULE_elseifS = 88, RULE_setVal = 89, RULE_setExpr = 90, RULE_bracketExpr = 91, 
		RULE_guardedSet = 92, RULE_commaList = 93, RULE_guard = 94, RULE_range = 95, 
		RULE_fromR = 96, RULE_toR = 97, RULE_rint = 98, RULE_rfloat = 99, RULE_rbool = 100, 
		RULE_integer = 101, RULE_real = 102, RULE_string = 103;
	public static final String[] ruleNames = {
		"model", "stat", "decl", "vardecl", "pardecl", "data", "extended", "listExtended", 
		"preExt", "postExt", "constraint", "var", "output", "solve", "parameter", 
		"include", "init", "predicate", "function", "qualName", "satisfy", "optimize", 
		"maximize", "minimize", "annotation", "modeAnnotation", "intS", "boolS", 
		"setS", "seqS", "restS", "varchoice", "constrainchoice", "constr", "scons", 
		"tcons", "arg", "argint", "argfloat", "argbool", "argunion", "argrange", 
		"typename", "typeset", "vararray", "pararray", "dimensions", "typedata", 
		"expr", "boolVal", "op", "boolOp", "arithOp", "arithOp2", "qualBoolOp", 
		"qualArithOp", "boolComplexExpr", "boolExpr", "operand", "arithComplexExpr", 
		"arithExpr", "notExpr", "minusExpr", "predOrUnionExpr", "onesection", 
		"twosections", "rbracketExpr", "idexpr", "stringExpr", "infixOp", "infixSetOp", 
		"arrayaccess", "caseExpr", "caseBranch", "listExpr", "oneDimList", "simpleList", 
		"simpleNonEmptyList", "guardedList", "multiDimList", "listValue", "inDecl", 
		"whereCond", "letExpr", "letDecl", "ifExpr", "bodyIf", "elseS", "elseifS", 
		"setVal", "setExpr", "bracketExpr", "guardedSet", "commaList", "guard", 
		"range", "fromR", "toR", "rint", "rfloat", "rbool", "integer", "real", 
		"string"
	};

	@Override
	public String getGrammarFileName() { return "MiniZincGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniZincGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModelContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitModel(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208); stat();
				setState(209); match(T__37);
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__81) | (1L << T__79) | (1L << T__73) | (1L << T__71) | (1L << T__69) | (1L << T__67) | (1L << T__66) | (1L << T__63) | (1L << T__49) | (1L << T__47) | (1L << T__43) | (1L << T__36) | (1L << T__33) | (1L << T__32) | (1L << T__30) | (1L << T__25))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__15 - 66)) | (1L << (T__0 - 66)) | (1L << (ID - 66)) | (1L << (NAT - 66)))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public SolveContext solve() {
			return getRuleContext(SolveContext.class,0);
		}
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public ExtendedContext extended() {
			return getRuleContext(ExtendedContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(225);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215); data();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216); extended();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217); constraint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(218); decl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(219); solve();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(220); output();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(221); predicate();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(222); function();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(223); include();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(224); init();
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

	public static class DeclContext extends ParserRuleContext {
		public PardeclContext pardecl() {
			return getRuleContext(PardeclContext.class,0);
		}
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(229);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227); vardecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228); pardecl();
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

	public static class VardeclContext extends ParserRuleContext {
		public VararrayContext vararray() {
			return getRuleContext(VararrayContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitVardecl(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			switch (_input.LA(1)) {
			case T__63:
				{
				setState(231); var();
				}
				break;
			case T__43:
				{
				setState(232); vararray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(237);
			_la = _input.LA(1);
			if (_la==T__75) {
				{
				setState(235); match(T__75);
				setState(236); expr(0);
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

	public static class PardeclContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public PararrayContext pararray() {
			return getRuleContext(PararrayContext.class,0);
		}
		public PardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterPardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitPardecl(this);
		}
	}

	public final PardeclContext pardecl() throws RecognitionException {
		PardeclContext _localctx = new PardeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pardecl);
		try {
			setState(241);
			switch (_input.LA(1)) {
			case T__81:
			case T__79:
			case T__73:
			case T__69:
			case T__49:
			case T__33:
			case T__20:
			case T__18:
			case T__15:
			case T__0:
			case ID:
			case NAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); parameter();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(240); pararray();
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

	public static class DataContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public ConstrContext constr(int i) {
			return getRuleContext(ConstrContext.class,i);
		}
		public List<ConstrContext> constr() {
			return getRuleContexts(ConstrContext.class);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitData(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(T__30);
			setState(244); match(ID);
			setState(245); match(T__75);
			setState(246); match(T__78);
			setState(247); constr();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(248); match(T__68);
				setState(249); constr();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255); match(T__34);
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

	public static class ExtendedContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public PostExtContext postExt() {
			return getRuleContext(PostExtContext.class,0);
		}
		public PreExtContext preExt() {
			return getRuleContext(PreExtContext.class,0);
		}
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public ExtendedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extended; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterExtended(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitExtended(this);
		}
	}

	public final ExtendedContext extended() throws RecognitionException {
		ExtendedContext _localctx = new ExtendedContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_extended);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); match(T__67);
			setState(258); match(ID);
			setState(259); match(T__75);
			setState(263);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(260); preExt();
				setState(261); match(T__54);
				}
				break;
			}
			setState(265); typename();
			setState(268);
			_la = _input.LA(1);
			if (_la==T__54) {
				{
				setState(266); match(T__54);
				setState(267); postExt();
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

	public static class ListExtendedContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniZincGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniZincGrammarParser.ID, i);
		}
		public ListExtendedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExtended; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterListExtended(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitListExtended(this);
		}
	}

	public final ListExtendedContext listExtended() throws RecognitionException {
		ListExtendedContext _localctx = new ListExtendedContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listExtended);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(T__18);
			setState(271); match(ID);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(272); match(T__68);
				setState(273); match(ID);
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279); match(T__53);
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

	public static class PreExtContext extends ParserRuleContext {
		public ListExtendedContext listExtended() {
			return getRuleContext(ListExtendedContext.class,0);
		}
		public PreExtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preExt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterPreExt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitPreExt(this);
		}
	}

	public final PreExtContext preExt() throws RecognitionException {
		PreExtContext _localctx = new PreExtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_preExt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); listExtended();
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

	public static class PostExtContext extends ParserRuleContext {
		public ListExtendedContext listExtended() {
			return getRuleContext(ListExtendedContext.class,0);
		}
		public PostExtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postExt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterPostExt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitPostExt(this);
		}
	}

	public final PostExtContext postExt() throws RecognitionException {
		PostExtContext _localctx = new PostExtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_postExt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283); listExtended();
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

	public static class ConstraintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitConstraint(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(T__25);
			setState(286); expr(0);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288); match(T__63);
			setState(289); typename();
			setState(290); match(T__19);
			setState(291); match(ID);
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

	public static class OutputContext extends ParserRuleContext {
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_output);
		try {
			setState(300);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293); match(T__66);
				setState(294); match(T__69);
				setState(295); listExpr(0);
				setState(296); match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298); match(T__66);
				setState(299); listExpr(0);
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

	public static class SolveContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public OptimizeContext optimize() {
			return getRuleContext(OptimizeContext.class,0);
		}
		public SatisfyContext satisfy() {
			return getRuleContext(SatisfyContext.class,0);
		}
		public SolveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterSolve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitSolve(this);
		}
	}

	public final SolveContext solve() throws RecognitionException {
		SolveContext _localctx = new SolveContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_solve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302); match(T__32);
			setState(304);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(303); annotation();
				}
			}

			setState(308);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(306); satisfy();
				}
				break;
			case T__84:
			case T__82:
				{
				setState(307); optimize();
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(310); match(T__20);
				}
			}

			setState(313); typename();
			setState(314); match(T__19);
			setState(315); match(ID);
			setState(318);
			_la = _input.LA(1);
			if (_la==T__75) {
				{
				setState(316); match(T__75);
				setState(317); expr(0);
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

	public static class IncludeContext extends ParserRuleContext {
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitInclude(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); match(T__71);
			setState(321); stringExpr();
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

	public static class InitContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); match(ID);
			setState(324); match(T__75);
			setState(325); expr(0);
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

	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); match(T__36);
			setState(328); match(ID);
			setState(329); match(T__69);
			setState(338);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__81) | (1L << T__79) | (1L << T__73) | (1L << T__69) | (1L << T__63) | (1L << T__49) | (1L << T__43) | (1L << T__33))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__15 - 66)) | (1L << (T__0 - 66)) | (1L << (ID - 66)) | (1L << (NAT - 66)))) != 0)) {
				{
				setState(330); decl();
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__68) {
					{
					{
					setState(331); match(T__68);
					setState(332); decl();
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(340); match(T__4);
			setState(341); match(T__75);
			setState(342); expr(0);
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

	public static class FunctionContext extends ParserRuleContext {
		public QualNameContext qualName() {
			return getRuleContext(QualNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344); match(T__47);
			setState(346);
			_la = _input.LA(1);
			if (_la==T__63) {
				{
				setState(345); match(T__63);
				}
			}

			setState(348); qualName();
			setState(349); match(T__69);
			setState(358);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__81) | (1L << T__79) | (1L << T__73) | (1L << T__69) | (1L << T__63) | (1L << T__49) | (1L << T__43) | (1L << T__33))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__15 - 66)) | (1L << (T__0 - 66)) | (1L << (ID - 66)) | (1L << (NAT - 66)))) != 0)) {
				{
				setState(350); decl();
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__68) {
					{
					{
					setState(351); match(T__68);
					setState(352); decl();
					}
					}
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(360); match(T__4);
			setState(361); match(T__75);
			setState(362); expr(0);
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

	public static class QualNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public QualNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterQualName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitQualName(this);
		}
	}

	public final QualNameContext qualName() throws RecognitionException {
		QualNameContext _localctx = new QualNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_qualName);
		try {
			setState(368);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365); match(ID);
				setState(366); match(T__19);
				setState(367); op();
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

	public static class SatisfyContext extends ParserRuleContext {
		public SatisfyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_satisfy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterSatisfy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitSatisfy(this);
		}
	}

	public final SatisfyContext satisfy() throws RecognitionException {
		SatisfyContext _localctx = new SatisfyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_satisfy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); match(T__10);
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

	public static class OptimizeContext extends ParserRuleContext {
		public MinimizeContext minimize() {
			return getRuleContext(MinimizeContext.class,0);
		}
		public MaximizeContext maximize() {
			return getRuleContext(MaximizeContext.class,0);
		}
		public OptimizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterOptimize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitOptimize(this);
		}
	}

	public final OptimizeContext optimize() throws RecognitionException {
		OptimizeContext _localctx = new OptimizeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_optimize);
		try {
			setState(374);
			switch (_input.LA(1)) {
			case T__84:
				enterOuterAlt(_localctx, 1);
				{
				setState(372); maximize();
				}
				break;
			case T__82:
				enterOuterAlt(_localctx, 2);
				{
				setState(373); minimize();
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

	public static class MaximizeContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MaximizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maximize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterMaximize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitMaximize(this);
		}
	}

	public final MaximizeContext maximize() throws RecognitionException {
		MaximizeContext _localctx = new MaximizeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_maximize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376); match(T__84);
			setState(377); expr(0);
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

	public static class MinimizeContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MinimizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minimize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterMinimize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitMinimize(this);
		}
	}

	public final MinimizeContext minimize() throws RecognitionException {
		MinimizeContext _localctx = new MinimizeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_minimize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); match(T__82);
			setState(380); expr(0);
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

	public static class AnnotationContext extends ParserRuleContext {
		public ModeAnnotationContext modeAnnotation() {
			return getRuleContext(ModeAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382); match(T__76);
			setState(383); modeAnnotation();
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

	public static class ModeAnnotationContext extends ParserRuleContext {
		public SetSContext setS() {
			return getRuleContext(SetSContext.class,0);
		}
		public IntSContext intS() {
			return getRuleContext(IntSContext.class,0);
		}
		public BoolSContext boolS() {
			return getRuleContext(BoolSContext.class,0);
		}
		public SeqSContext seqS() {
			return getRuleContext(SeqSContext.class,0);
		}
		public ModeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterModeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitModeAnnotation(this);
		}
	}

	public final ModeAnnotationContext modeAnnotation() throws RecognitionException {
		ModeAnnotationContext _localctx = new ModeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_modeAnnotation);
		try {
			setState(389);
			switch (_input.LA(1)) {
			case T__83:
				enterOuterAlt(_localctx, 1);
				{
				setState(385); intS();
				}
				break;
			case T__72:
				enterOuterAlt(_localctx, 2);
				{
				setState(386); boolS();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(387); setS();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 4);
				{
				setState(388); seqS();
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

	public static class IntSContext extends ParserRuleContext {
		public RestSContext restS() {
			return getRuleContext(RestSContext.class,0);
		}
		public IntSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterIntS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitIntS(this);
		}
	}

	public final IntSContext intS() throws RecognitionException {
		IntSContext _localctx = new IntSContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_intS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391); match(T__83);
			setState(392); restS();
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

	public static class BoolSContext extends ParserRuleContext {
		public RestSContext restS() {
			return getRuleContext(RestSContext.class,0);
		}
		public BoolSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterBoolS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitBoolS(this);
		}
	}

	public final BoolSContext boolS() throws RecognitionException {
		BoolSContext _localctx = new BoolSContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_boolS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394); match(T__72);
			setState(395); restS();
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

	public static class SetSContext extends ParserRuleContext {
		public RestSContext restS() {
			return getRuleContext(RestSContext.class,0);
		}
		public SetSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterSetS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitSetS(this);
		}
	}

	public final SetSContext setS() throws RecognitionException {
		SetSContext _localctx = new SetSContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_setS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); match(T__35);
			setState(398); restS();
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

	public static class SeqSContext extends ParserRuleContext {
		public List<ModeAnnotationContext> modeAnnotation() {
			return getRuleContexts(ModeAnnotationContext.class);
		}
		public ModeAnnotationContext modeAnnotation(int i) {
			return getRuleContext(ModeAnnotationContext.class,i);
		}
		public SeqSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterSeqS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitSeqS(this);
		}
	}

	public final SeqSContext seqS() throws RecognitionException {
		SeqSContext _localctx = new SeqSContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_seqS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400); match(T__46);
			setState(402);
			_la = _input.LA(1);
			if (_la==T__69) {
				{
				setState(401); match(T__69);
				}
			}

			setState(404); match(T__18);
			setState(405); modeAnnotation();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(406); match(T__68);
				setState(407); modeAnnotation();
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(413); match(T__53);
			setState(415);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(414); match(T__4);
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

	public static class RestSContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarchoiceContext varchoice() {
			return getRuleContext(VarchoiceContext.class,0);
		}
		public ConstrainchoiceContext constrainchoice() {
			return getRuleContext(ConstrainchoiceContext.class,0);
		}
		public RestSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterRestS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitRestS(this);
		}
	}

	public final RestSContext restS() throws RecognitionException {
		RestSContext _localctx = new RestSContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_restS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417); match(T__69);
			setState(418); expr(0);
			setState(419); match(T__68);
			setState(420); varchoice();
			setState(421); match(T__68);
			setState(422); constrainchoice();
			setState(423); match(T__68);
			setState(424); match(T__59);
			setState(425); match(T__4);
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

	public static class VarchoiceContext extends ParserRuleContext {
		public VarchoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varchoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterVarchoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitVarchoice(this);
		}
	}

	public final VarchoiceContext varchoice() throws RecognitionException {
		VarchoiceContext _localctx = new VarchoiceContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_varchoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_la = _input.LA(1);
			if ( !(((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (T__62 - 24)) | (1L << (T__60 - 24)) | (1L << (T__1 - 24)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ConstrainchoiceContext extends ParserRuleContext {
		public ConstrainchoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrainchoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterConstrainchoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitConstrainchoice(this);
		}
	}

	public final ConstrainchoiceContext constrainchoice() throws RecognitionException {
		ConstrainchoiceContext _localctx = new ConstrainchoiceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constrainchoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !(((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__65 - 21)) | (1L << (T__61 - 21)) | (1L << (T__52 - 21)) | (1L << (T__38 - 21)) | (1L << (T__9 - 21)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ConstrContext extends ParserRuleContext {
		public TconsContext tcons() {
			return getRuleContext(TconsContext.class,0);
		}
		public SconsContext scons() {
			return getRuleContext(SconsContext.class,0);
		}
		public ConstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterConstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitConstr(this);
		}
	}

	public final ConstrContext constr() throws RecognitionException {
		ConstrContext _localctx = new ConstrContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constr);
		try {
			setState(433);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431); scons();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432); tcons();
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

	public static class SconsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public SconsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterScons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitScons(this);
		}
	}

	public final SconsContext scons() throws RecognitionException {
		SconsContext _localctx = new SconsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_scons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); match(ID);
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

	public static class TconsContext extends ParserRuleContext {
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public TconsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tcons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterTcons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitTcons(this);
		}
	}

	public final TconsContext tcons() throws RecognitionException {
		TconsContext _localctx = new TconsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tcons);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); match(ID);
			setState(438); match(T__69);
			setState(439); arg();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(440); match(T__68);
				setState(441); arg();
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(447); match(T__4);
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

	public static class ArgContext extends ParserRuleContext {
		public ArgrangeContext argrange() {
			return getRuleContext(ArgrangeContext.class,0);
		}
		public ArgintContext argint() {
			return getRuleContext(ArgintContext.class,0);
		}
		public ArgfloatContext argfloat() {
			return getRuleContext(ArgfloatContext.class,0);
		}
		public ArgboolContext argbool() {
			return getRuleContext(ArgboolContext.class,0);
		}
		public ArgunionContext argunion() {
			return getRuleContext(ArgunionContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arg);
		try {
			setState(454);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449); argint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450); argfloat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(451); argbool();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(452); argunion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(453); argrange();
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

	public static class ArgintContext extends ParserRuleContext {
		public RintContext rint() {
			return getRuleContext(RintContext.class,0);
		}
		public ArgintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterArgint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitArgint(this);
		}
	}

	public final ArgintContext argint() throws RecognitionException {
		ArgintContext _localctx = new ArgintContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_argint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456); rint();
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

	public static class ArgfloatContext extends ParserRuleContext {
		public RfloatContext rfloat() {
			return getRuleContext(RfloatContext.class,0);
		}
		public ArgfloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argfloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterArgfloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitArgfloat(this);
		}
	}

	public final ArgfloatContext argfloat() throws RecognitionException {
		ArgfloatContext _localctx = new ArgfloatContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_argfloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458); rfloat();
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

	public static class ArgboolContext extends ParserRuleContext {
		public RboolContext rbool() {
			return getRuleContext(RboolContext.class,0);
		}
		public ArgboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argbool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterArgbool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitArgbool(this);
		}
	}

	public final ArgboolContext argbool() throws RecognitionException {
		ArgboolContext _localctx = new ArgboolContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_argbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460); rbool();
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

	public static class ArgunionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public ArgunionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argunion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterArgunion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitArgunion(this);
		}
	}

	public final ArgunionContext argunion() throws RecognitionException {
		ArgunionContext _localctx = new ArgunionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_argunion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462); match(ID);
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

	public static class ArgrangeContext extends ParserRuleContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public ArgrangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argrange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterArgrange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitArgrange(this);
		}
	}

	public final ArgrangeContext argrange() throws RecognitionException {
		ArgrangeContext _localctx = new ArgrangeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_argrange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); range();
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

	public static class TypenameContext extends ParserRuleContext {
		public RboolContext rbool() {
			return getRuleContext(RboolContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public TypedataContext typedata() {
			return getRuleContext(TypedataContext.class,0);
		}
		public RintContext rint() {
			return getRuleContext(RintContext.class,0);
		}
		public RfloatContext rfloat() {
			return getRuleContext(RfloatContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TypesetContext typeset() {
			return getRuleContext(TypesetContext.class,0);
		}
		public TypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterTypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitTypename(this);
		}
	}

	public final TypenameContext typename() throws RecognitionException {
		TypenameContext _localctx = new TypenameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typename);
		try {
			setState(473);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466); rint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467); rbool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(468); rfloat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(469); match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(470); typedata();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(471); range();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(472); typeset();
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

	public static class TypesetContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public TypesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterTypeset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitTypeset(this);
		}
	}

	public final TypesetContext typeset() throws RecognitionException {
		TypesetContext _localctx = new TypesetContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475); match(T__81);
			setState(476); match(T__40);
			setState(477); typename();
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

	public static class VararrayContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public DimensionsContext dimensions() {
			return getRuleContext(DimensionsContext.class,0);
		}
		public VararrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vararray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterVararray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitVararray(this);
		}
	}

	public final VararrayContext vararray() throws RecognitionException {
		VararrayContext _localctx = new VararrayContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_vararray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479); match(T__43);
			setState(480); dimensions();
			setState(481); match(T__40);
			setState(482); var();
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

	public static class PararrayContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public DimensionsContext dimensions() {
			return getRuleContext(DimensionsContext.class,0);
		}
		public PararrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pararray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterPararray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitPararray(this);
		}
	}

	public final PararrayContext pararray() throws RecognitionException {
		PararrayContext _localctx = new PararrayContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_pararray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484); match(T__43);
			setState(485); dimensions();
			setState(486); match(T__40);
			setState(487); parameter();
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

	public static class DimensionsContext extends ParserRuleContext {
		public RangeContext range(int i) {
			return getRuleContext(RangeContext.class,i);
		}
		public List<RangeContext> range() {
			return getRuleContexts(RangeContext.class);
		}
		public DimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterDimensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitDimensions(this);
		}
	}

	public final DimensionsContext dimensions() throws RecognitionException {
		DimensionsContext _localctx = new DimensionsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_dimensions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489); match(T__18);
			setState(499);
			switch (_input.LA(1)) {
			case T__69:
			case T__49:
			case T__33:
			case T__18:
			case T__0:
			case ID:
			case NAT:
				{
				{
				setState(490); range();
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__68) {
					{
					{
					setState(491); match(T__68);
					setState(492); range();
					}
					}
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case T__73:
				{
				setState(498); match(T__73);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(501); match(T__53);
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

	public static class TypedataContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public TypedataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterTypedata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitTypedata(this);
		}
	}

	public final TypedataContext typedata() throws RecognitionException {
		TypedataContext _localctx = new TypedataContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_typedata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503); match(ID);
			setState(504); match(T__69);
			setState(505); arithExpr(0);
			setState(506); match(T__4);
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
		public TerminalNode BOOL() { return getToken(MiniZincGrammarParser.BOOL, 0); }
		public SetExprContext setExpr() {
			return getRuleContext(SetExprContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InfixOpContext infixOp() {
			return getRuleContext(InfixOpContext.class,0);
		}
		public RbracketExprContext rbracketExpr() {
			return getRuleContext(RbracketExprContext.class,0);
		}
		public LetExprContext letExpr() {
			return getRuleContext(LetExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public BoolComplexExprContext boolComplexExpr() {
			return getRuleContext(BoolComplexExprContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public PredOrUnionExprContext predOrUnionExpr() {
			return getRuleContext(PredOrUnionExprContext.class,0);
		}
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public ArithComplexExprContext arithComplexExpr() {
			return getRuleContext(ArithComplexExprContext.class,0);
		}
		public CaseExprContext caseExpr() {
			return getRuleContext(CaseExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitExpr(this);
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(509); rbracketExpr();
				}
				break;
			case 3:
				{
				setState(510); boolComplexExpr();
				}
				break;
			case 4:
				{
				setState(511); arithComplexExpr();
				}
				break;
			case 5:
				{
				setState(512); setExpr(0);
				}
				break;
			case 6:
				{
				setState(513); listExpr(0);
				}
				break;
			case 7:
				{
				setState(514); ifExpr();
				}
				break;
			case 8:
				{
				setState(515); letExpr();
				}
				break;
			case 9:
				{
				setState(516); predOrUnionExpr();
				}
				break;
			case 10:
				{
				setState(517); stringExpr();
				}
				break;
			case 11:
				{
				setState(518); caseExpr();
				}
				break;
			case 12:
				{
				setState(519); match(BOOL);
				}
				break;
			case 13:
				{
				setState(520); real();
				}
				break;
			case 14:
				{
				setState(521); integer();
				}
				break;
			case 15:
				{
				setState(522); match(ID);
				}
				break;
			case 16:
				{
				setState(523); match(T__13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(526);
					if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
					setState(527); infixOp();
					setState(528); expr(12);
					}
					} 
				}
				setState(534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class BoolValContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(MiniZincGrammarParser.BOOL, 0); }
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public PredOrUnionExprContext predOrUnionExpr() {
			return getRuleContext(PredOrUnionExprContext.class,0);
		}
		public ArrayaccessContext arrayaccess() {
			return getRuleContext(ArrayaccessContext.class,0);
		}
		public LetExprContext letExpr() {
			return getRuleContext(LetExprContext.class,0);
		}
		public BoolValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterBoolVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitBoolVal(this);
		}
	}

	public final BoolValContext boolVal() throws RecognitionException {
		BoolValContext _localctx = new BoolValContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_boolVal);
		try {
			setState(546);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(536); match(T__69);
				setState(537); boolExpr(0);
				setState(538); match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(540); match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(541); match(BOOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(542); arrayaccess();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(543); ifExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(544); letExpr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(545); predOrUnionExpr();
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

	public static class OpContext extends ParserRuleContext {
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public ArithOpContext arithOp() {
			return getRuleContext(ArithOpContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_op);
		try {
			setState(550);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548); boolOp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549); arithOp();
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

	public static class BoolOpContext extends ParserRuleContext {
		public BoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitBoolOp(this);
		}
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__80) | (1L << T__75) | (1L << T__64) | (1L << T__42) | (1L << T__31))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__21 - 65)) | (1L << (T__16 - 65)) | (1L << (T__12 - 65)) | (1L << (T__3 - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ArithOpContext extends ParserRuleContext {
		public ArithOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterArithOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitArithOp(this);
		}
	}

	public final ArithOpContext arithOp() throws RecognitionException {
		ArithOpContext _localctx = new ArithOpContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_arithOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__80) | (1L << T__75) | (1L << T__56) | (1L << T__55) | (1L << T__28))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__16 - 70)) | (1L << (T__14 - 70)) | (1L << (T__6 - 70)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ArithOp2Context extends ParserRuleContext {
		public ArithOp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithOp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterArithOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitArithOp2(this);
		}
	}

	public final ArithOp2Context arithOp2() throws RecognitionException {
		ArithOp2Context _localctx = new ArithOp2Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_arithOp2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_la = _input.LA(1);
			if ( !(((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (T__57 - 29)) | (1L << (T__44 - 29)) | (1L << (T__41 - 29)) | (1L << (T__24 - 29)) | (1L << (T__8 - 29)) | (1L << (T__0 - 29)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class QualBoolOpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public QualBoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualBoolOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterQualBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitQualBoolOp(this);
		}
	}

	public final QualBoolOpContext qualBoolOp() throws RecognitionException {
		QualBoolOpContext _localctx = new QualBoolOpContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_qualBoolOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558); match(ID);
			setState(559); match(T__19);
			setState(560); boolOp();
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

	public static class QualArithOpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public ArithOpContext arithOp() {
			return getRuleContext(ArithOpContext.class,0);
		}
		public QualArithOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualArithOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterQualArithOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitQualArithOp(this);
		}
	}

	public final QualArithOpContext qualArithOp() throws RecognitionException {
		QualArithOpContext _localctx = new QualArithOpContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_qualArithOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562); match(ID);
			setState(563); match(T__19);
			setState(564); arithOp();
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

	public static class BoolComplexExprContext extends ParserRuleContext {
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public QualArithOpContext qualArithOp() {
			return getRuleContext(QualArithOpContext.class,0);
		}
		public QualBoolOpContext qualBoolOp() {
			return getRuleContext(QualBoolOpContext.class,0);
		}
		public ArithExprContext arithExpr(int i) {
			return getRuleContext(ArithExprContext.class,i);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public List<ArithExprContext> arithExpr() {
			return getRuleContexts(ArithExprContext.class);
		}
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public ArithOpContext arithOp() {
			return getRuleContext(ArithOpContext.class,0);
		}
		public BoolComplexExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolComplexExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterBoolComplexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitBoolComplexExpr(this);
		}
	}

	public final BoolComplexExprContext boolComplexExpr() throws RecognitionException {
		BoolComplexExprContext _localctx = new BoolComplexExprContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_boolComplexExpr);
		try {
			setState(581);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(566); boolExpr(0);
				setState(569);
				switch (_input.LA(1)) {
				case T__80:
				case T__75:
				case T__64:
				case T__42:
				case T__31:
				case T__21:
				case T__16:
				case T__12:
				case T__3:
					{
					setState(567); boolOp();
					}
					break;
				case ID:
					{
					setState(568); qualBoolOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(571); boolExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(573); arithExpr(0);
				setState(576);
				switch (_input.LA(1)) {
				case T__80:
				case T__75:
				case T__56:
				case T__55:
				case T__28:
				case T__16:
				case T__14:
				case T__6:
					{
					setState(574); arithOp();
					}
					break;
				case ID:
					{
					setState(575); qualArithOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(578); arithExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(580); notExpr();
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

	public static class BoolExprContext extends ParserRuleContext {
		public QualArithOpContext qualArithOp() {
			return getRuleContext(QualArithOpContext.class,0);
		}
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public ArithExprContext arithExpr(int i) {
			return getRuleContext(ArithExprContext.class,i);
		}
		public QualBoolOpContext qualBoolOp() {
			return getRuleContext(QualBoolOpContext.class,0);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public List<ArithExprContext> arithExpr() {
			return getRuleContexts(ArithExprContext.class);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public BoolValContext boolVal() {
			return getRuleContext(BoolValContext.class,0);
		}
		public ArithOpContext arithOp() {
			return getRuleContext(ArithOpContext.class,0);
		}
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitBoolExpr(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		return boolExpr(0);
	}

	private BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState);
		BoolExprContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(584); arithExpr(0);
				setState(587);
				switch (_input.LA(1)) {
				case T__80:
				case T__75:
				case T__56:
				case T__55:
				case T__28:
				case T__16:
				case T__14:
				case T__6:
					{
					setState(585); arithOp();
					}
					break;
				case ID:
					{
					setState(586); qualArithOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(589); arithExpr(0);
				}
				break;
			case 2:
				{
				setState(591); notExpr();
				}
				break;
			case 3:
				{
				setState(592); boolVal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
					setState(595);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(598);
					switch (_input.LA(1)) {
					case T__80:
					case T__75:
					case T__64:
					case T__42:
					case T__31:
					case T__21:
					case T__16:
					case T__12:
					case T__3:
						{
						setState(596); boolOp();
						}
						break;
					case ID:
						{
						setState(597); qualBoolOp();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(600); boolExpr(5);
					}
					} 
				}
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class OperandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public PredOrUnionExprContext predOrUnionExpr() {
			return getRuleContext(PredOrUnionExprContext.class,0);
		}
		public ArrayaccessContext arrayaccess() {
			return getRuleContext(ArrayaccessContext.class,0);
		}
		public LetExprContext letExpr() {
			return getRuleContext(LetExprContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_operand);
		try {
			setState(618);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(608); integer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(609); real();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(610); arrayaccess();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(611); ifExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(612); letExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(613); match(T__69);
				setState(614); arithExpr(0);
				setState(615); match(T__4);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(617); predOrUnionExpr();
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

	public static class ArithComplexExprContext extends ParserRuleContext {
		public ArithExprContext arithExpr(int i) {
			return getRuleContext(ArithExprContext.class,i);
		}
		public List<ArithExprContext> arithExpr() {
			return getRuleContexts(ArithExprContext.class);
		}
		public ArithOp2Context arithOp2() {
			return getRuleContext(ArithOp2Context.class,0);
		}
		public MinusExprContext minusExpr() {
			return getRuleContext(MinusExprContext.class,0);
		}
		public ArithComplexExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithComplexExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterArithComplexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitArithComplexExpr(this);
		}
	}

	public final ArithComplexExprContext arithComplexExpr() throws RecognitionException {
		ArithComplexExprContext _localctx = new ArithComplexExprContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_arithComplexExpr);
		try {
			setState(625);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620); minusExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(621); arithExpr(0);
				setState(622); arithOp2();
				setState(623); arithExpr(0);
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

	public static class ArithExprContext extends ParserRuleContext {
		public ArithExprContext arithExpr(int i) {
			return getRuleContext(ArithExprContext.class,i);
		}
		public List<ArithExprContext> arithExpr() {
			return getRuleContexts(ArithExprContext.class);
		}
		public ArithOp2Context arithOp2() {
			return getRuleContext(ArithOp2Context.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public MinusExprContext minusExpr() {
			return getRuleContext(MinusExprContext.class,0);
		}
		public ArithExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterArithExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitArithExpr(this);
		}
	}

	public final ArithExprContext arithExpr() throws RecognitionException {
		return arithExpr(0);
	}

	private ArithExprContext arithExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithExprContext _localctx = new ArithExprContext(_ctx, _parentState);
		ArithExprContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_arithExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(628); minusExpr();
				}
				break;
			case 2:
				{
				setState(629); operand();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithExpr);
					setState(632);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(633); arithOp2();
					setState(634); arithExpr(3);
					}
					} 
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public static class NotExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitNotExpr(this);
		}
	}

	public final NotExprContext notExpr() throws RecognitionException {
		NotExprContext _localctx = new NotExprContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_notExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641); match(T__2);
			setState(642); expr(0);
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

	public static class MinusExprContext extends ParserRuleContext {
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public MinusExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitMinusExpr(this);
		}
	}

	public final MinusExprContext minusExpr() throws RecognitionException {
		MinusExprContext _localctx = new MinusExprContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_minusExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644); match(T__0);
			setState(645); arithExpr(0);
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

	public static class PredOrUnionExprContext extends ParserRuleContext {
		public OnesectionContext onesection() {
			return getRuleContext(OnesectionContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public TwosectionsContext twosections() {
			return getRuleContext(TwosectionsContext.class,0);
		}
		public PredOrUnionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predOrUnionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterPredOrUnionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitPredOrUnionExpr(this);
		}
	}

	public final PredOrUnionExprContext predOrUnionExpr() throws RecognitionException {
		PredOrUnionExprContext _localctx = new PredOrUnionExprContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_predOrUnionExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647); match(ID);
			setState(650);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(648); twosections();
				}
				break;
			case 2:
				{
				setState(649); onesection();
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

	public static class OnesectionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OnesectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onesection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterOnesection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitOnesection(this);
		}
	}

	public final OnesectionContext onesection() throws RecognitionException {
		OnesectionContext _localctx = new OnesectionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_onesection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(652); match(T__69);
				setState(653); expr(0);
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__68) {
					{
					{
					setState(654); match(T__68);
					setState(655); expr(0);
					}
					}
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(661); match(T__4);
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

	public static class TwosectionsContext extends ParserRuleContext {
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TwosectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twosections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterTwosections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitTwosections(this);
		}
	}

	public final TwosectionsContext twosections() throws RecognitionException {
		TwosectionsContext _localctx = new TwosectionsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_twosections);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665); match(T__69);
			setState(666); guard();
			setState(667); match(T__4);
			setState(668); match(T__69);
			setState(669); expr(0);
			setState(670); match(T__4);
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

	public static class RbracketExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RbracketExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rbracketExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterRbracketExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitRbracketExpr(this);
		}
	}

	public final RbracketExprContext rbracketExpr() throws RecognitionException {
		RbracketExprContext _localctx = new RbracketExprContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_rbracketExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672); match(T__69);
			setState(673); expr(0);
			setState(674); match(T__4);
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

	public static class IdexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public IdexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterIdexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitIdexpr(this);
		}
	}

	public final IdexprContext idexpr() throws RecognitionException {
		IdexprContext _localctx = new IdexprContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_idexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676); match(ID);
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

	public static class StringExprContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitStringExpr(this);
		}
	}

	public final StringExprContext stringExpr() throws RecognitionException {
		StringExprContext _localctx = new StringExprContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_stringExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678); match(T__26);
			setState(679); string();
			setState(680); match(T__26);
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

	public static class InfixOpContext extends ParserRuleContext {
		public InfixSetOpContext infixSetOp() {
			return getRuleContext(InfixSetOpContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public InfixOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterInfixOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitInfixOp(this);
		}
	}

	public final InfixOpContext infixOp() throws RecognitionException {
		InfixOpContext _localctx = new InfixOpContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_infixOp);
		try {
			setState(686);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(682); match(T__29);
				setState(683); match(ID);
				setState(684); match(T__29);
				}
				break;
			case T__70:
			case T__6:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(685); infixSetOp();
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

	public static class InfixSetOpContext extends ParserRuleContext {
		public InfixSetOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixSetOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterInfixSetOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitInfixSetOp(this);
		}
	}

	public final InfixSetOpContext infixSetOp() throws RecognitionException {
		InfixSetOpContext _localctx = new InfixSetOpContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_infixSetOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_la = _input.LA(1);
			if ( !(_la==T__70 || _la==T__6 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ArrayaccessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public SimpleNonEmptyListContext simpleNonEmptyList(int i) {
			return getRuleContext(SimpleNonEmptyListContext.class,i);
		}
		public List<SimpleNonEmptyListContext> simpleNonEmptyList() {
			return getRuleContexts(SimpleNonEmptyListContext.class);
		}
		public ArrayaccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayaccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterArrayaccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitArrayaccess(this);
		}
	}

	public final ArrayaccessContext arrayaccess() throws RecognitionException {
		ArrayaccessContext _localctx = new ArrayaccessContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_arrayaccess);
		try {
			setState(695);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(690); match(ID);
				setState(691); simpleNonEmptyList();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(692); simpleNonEmptyList();
				setState(693); simpleNonEmptyList();
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

	public static class CaseExprContext extends ParserRuleContext {
		public List<CaseBranchContext> caseBranch() {
			return getRuleContexts(CaseBranchContext.class);
		}
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public CaseBranchContext caseBranch(int i) {
			return getRuleContext(CaseBranchContext.class,i);
		}
		public CaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterCaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitCaseExpr(this);
		}
	}

	public final CaseExprContext caseExpr() throws RecognitionException {
		CaseExprContext _localctx = new CaseExprContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_caseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697); match(T__22);
			setState(698); match(ID);
			setState(699); match(T__40);
			setState(703); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(700); caseBranch();
				setState(701); match(T__37);
				}
				}
				setState(705); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(707); match(T__58);
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

	public static class CaseBranchContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PredOrUnionExprContext predOrUnionExpr() {
			return getRuleContext(PredOrUnionExprContext.class,0);
		}
		public CaseBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterCaseBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitCaseBranch(this);
		}
	}

	public final CaseBranchContext caseBranch() throws RecognitionException {
		CaseBranchContext _localctx = new CaseBranchContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_caseBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709); predOrUnionExpr();
			setState(710); match(T__48);
			setState(711); expr(0);
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

	public static class ListExprContext extends ParserRuleContext {
		public MultiDimListContext multiDimList() {
			return getRuleContext(MultiDimListContext.class,0);
		}
		public ListValueContext listValue() {
			return getRuleContext(ListValueContext.class,0);
		}
		public OneDimListContext oneDimList() {
			return getRuleContext(OneDimListContext.class,0);
		}
		public List<ListExprContext> listExpr() {
			return getRuleContexts(ListExprContext.class);
		}
		public ListExprContext listExpr(int i) {
			return getRuleContext(ListExprContext.class,i);
		}
		public ListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitListExpr(this);
		}
	}

	public final ListExprContext listExpr() throws RecognitionException {
		return listExpr(0);
	}

	private ListExprContext listExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListExprContext _localctx = new ListExprContext(_ctx, _parentState);
		ListExprContext _prevctx = _localctx;
		int _startState = 148;
		enterRecursionRule(_localctx, 148, RULE_listExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(714); listValue();
				}
				break;
			case 2:
				{
				setState(715); oneDimList();
				}
				break;
			case 3:
				{
				setState(716); multiDimList();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(724);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_listExpr);
					setState(719);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(720); match(T__54);
					setState(721); listExpr(4);
					}
					} 
				}
				setState(726);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class OneDimListContext extends ParserRuleContext {
		public SimpleListContext simpleList() {
			return getRuleContext(SimpleListContext.class,0);
		}
		public GuardedListContext guardedList() {
			return getRuleContext(GuardedListContext.class,0);
		}
		public OneDimListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneDimList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterOneDimList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitOneDimList(this);
		}
	}

	public final OneDimListContext oneDimList() throws RecognitionException {
		OneDimListContext _localctx = new OneDimListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_oneDimList);
		try {
			setState(729);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(727); simpleList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(728); guardedList();
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

	public static class SimpleListContext extends ParserRuleContext {
		public SimpleNonEmptyListContext simpleNonEmptyList() {
			return getRuleContext(SimpleNonEmptyListContext.class,0);
		}
		public SimpleListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterSimpleList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitSimpleList(this);
		}
	}

	public final SimpleListContext simpleList() throws RecognitionException {
		SimpleListContext _localctx = new SimpleListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_simpleList);
		try {
			setState(734);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(731); match(T__18);
				setState(732); match(T__53);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(733); simpleNonEmptyList();
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

	public static class SimpleNonEmptyListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SimpleNonEmptyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleNonEmptyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterSimpleNonEmptyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitSimpleNonEmptyList(this);
		}
	}

	public final SimpleNonEmptyListContext simpleNonEmptyList() throws RecognitionException {
		SimpleNonEmptyListContext _localctx = new SimpleNonEmptyListContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_simpleNonEmptyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736); match(T__18);
			setState(737); expr(0);
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(738); match(T__68);
				setState(739); expr(0);
				}
				}
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(745); match(T__53);
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

	public static class GuardedListContext extends ParserRuleContext {
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GuardedListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardedList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterGuardedList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitGuardedList(this);
		}
	}

	public final GuardedListContext guardedList() throws RecognitionException {
		GuardedListContext _localctx = new GuardedListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_guardedList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747); match(T__18);
			{
			setState(748); expr(0);
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(749); match(T__68);
				setState(750); expr(0);
				}
				}
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(756); match(T__17);
			setState(757); guard();
			setState(758); match(T__53);
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

	public static class MultiDimListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultiDimListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiDimList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterMultiDimList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitMultiDimList(this);
		}
	}

	public final MultiDimListContext multiDimList() throws RecognitionException {
		MultiDimListContext _localctx = new MultiDimListContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_multiDimList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(760); match(T__27);
			{
			setState(761); expr(0);
			setState(766);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(762); match(T__68);
					setState(763); expr(0);
					}
					} 
				}
				setState(768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68 || _la==T__17) {
				{
				{
				setState(770);
				_la = _input.LA(1);
				if (_la==T__68) {
					{
					setState(769); match(T__68);
					}
				}

				setState(772); match(T__17);
				setState(773); expr(0);
				setState(778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(774); match(T__68);
						setState(775); expr(0);
						}
						} 
					}
					setState(780);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				}
				}
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(786); match(T__51);
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

	public static class ListValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public PredOrUnionExprContext predOrUnionExpr() {
			return getRuleContext(PredOrUnionExprContext.class,0);
		}
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public ArrayaccessContext arrayaccess() {
			return getRuleContext(ArrayaccessContext.class,0);
		}
		public ListValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterListValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitListValue(this);
		}
	}

	public final ListValueContext listValue() throws RecognitionException {
		ListValueContext _localctx = new ListValueContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_listValue);
		try {
			setState(793);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(788); stringExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789); match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(790); ifExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(791); arrayaccess();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(792); predOrUnionExpr();
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

	public static class InDeclContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniZincGrammarParser.ID); }
		public SetExprContext setExpr() {
			return getRuleContext(SetExprContext.class,0);
		}
		public WhereCondContext whereCond() {
			return getRuleContext(WhereCondContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(MiniZincGrammarParser.ID, i);
		}
		public InDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterInDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitInDecl(this);
		}
	}

	public final InDeclContext inDecl() throws RecognitionException {
		InDeclContext _localctx = new InDeclContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_inDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795); match(ID);
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(796); match(T__68);
				setState(797); match(ID);
				}
				}
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(803); match(T__6);
			setState(804); setExpr(0);
			setState(806);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(805); whereCond();
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

	public static class WhereCondContext extends ParserRuleContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public WhereCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterWhereCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitWhereCond(this);
		}
	}

	public final WhereCondContext whereCond() throws RecognitionException {
		WhereCondContext _localctx = new WhereCondContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_whereCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808); match(T__11);
			setState(809); boolExpr(0);
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

	public static class LetExprContext extends ParserRuleContext {
		public List<LetDeclContext> letDecl() {
			return getRuleContexts(LetDeclContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LetDeclContext letDecl(int i) {
			return getRuleContext(LetDeclContext.class,i);
		}
		public LetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterLetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitLetExpr(this);
		}
	}

	public final LetExprContext letExpr() throws RecognitionException {
		LetExprContext _localctx = new LetExprContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_letExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811); match(T__49);
			setState(812); match(T__78);
			setState(813); letDecl();
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(814); match(T__68);
				setState(815); letDecl();
				}
				}
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(821); match(T__34);
			setState(822); match(T__6);
			setState(823); expr(0);
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

	public static class LetDeclContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public LetDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterLetDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitLetDecl(this);
		}
	}

	public final LetDeclContext letDecl() throws RecognitionException {
		LetDeclContext _localctx = new LetDeclContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_letDecl);
		try {
			setState(827);
			switch (_input.LA(1)) {
			case T__81:
			case T__79:
			case T__73:
			case T__69:
			case T__63:
			case T__49:
			case T__43:
			case T__33:
			case T__20:
			case T__18:
			case T__15:
			case T__0:
			case ID:
			case NAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(825); decl();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(826); constraint();
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

	public static class IfExprContext extends ParserRuleContext {
		public BodyIfContext bodyIf() {
			return getRuleContext(BodyIfContext.class,0);
		}
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitIfExpr(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829); match(T__33);
			setState(830); bodyIf();
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

	public static class BodyIfContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ElseSContext elseS() {
			return getRuleContext(ElseSContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ElseifSContext elseifS() {
			return getRuleContext(ElseifSContext.class,0);
		}
		public BodyIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterBodyIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitBodyIf(this);
		}
	}

	public final BodyIfContext bodyIf() throws RecognitionException {
		BodyIfContext _localctx = new BodyIfContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_bodyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832); expr(0);
			setState(833); match(T__45);
			setState(834); expr(0);
			setState(837);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(835); elseS();
				}
				break;
			case T__39:
				{
				setState(836); elseifS();
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

	public static class ElseSContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterElseS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitElseS(this);
		}
	}

	public final ElseSContext elseS() throws RecognitionException {
		ElseSContext _localctx = new ElseSContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_elseS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839); match(T__7);
			setState(840); expr(0);
			setState(841); match(T__85);
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

	public static class ElseifSContext extends ParserRuleContext {
		public BodyIfContext bodyIf() {
			return getRuleContext(BodyIfContext.class,0);
		}
		public ElseifSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterElseifS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitElseifS(this);
		}
	}

	public final ElseifSContext elseifS() throws RecognitionException {
		ElseifSContext _localctx = new ElseifSContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_elseifS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843); match(T__39);
			setState(844); bodyIf();
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

	public static class SetValContext extends ParserRuleContext {
		public BracketExprContext bracketExpr() {
			return getRuleContext(BracketExprContext.class,0);
		}
		public GuardedSetContext guardedSet() {
			return getRuleContext(GuardedSetContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public SetValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterSetVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitSetVal(this);
		}
	}

	public final SetValContext setVal() throws RecognitionException {
		SetValContext _localctx = new SetValContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_setVal);
		try {
			setState(849);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(846); bracketExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(847); range();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(848); guardedSet();
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

	public static class SetExprContext extends ParserRuleContext {
		public InfixSetOpContext infixSetOp() {
			return getRuleContext(InfixSetOpContext.class,0);
		}
		public List<SetExprContext> setExpr() {
			return getRuleContexts(SetExprContext.class);
		}
		public SetExprContext setExpr(int i) {
			return getRuleContext(SetExprContext.class,i);
		}
		public SetValContext setVal() {
			return getRuleContext(SetValContext.class,0);
		}
		public SetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitSetExpr(this);
		}
	}

	public final SetExprContext setExpr() throws RecognitionException {
		return setExpr(0);
	}

	private SetExprContext setExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SetExprContext _localctx = new SetExprContext(_ctx, _parentState);
		SetExprContext _prevctx = _localctx;
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_setExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(852); setVal();
			}
			_ctx.stop = _input.LT(-1);
			setState(860);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_setExpr);
					setState(854);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(855); infixSetOp();
					setState(856); setExpr(2);
					}
					} 
				}
				setState(862);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	public static class BracketExprContext extends ParserRuleContext {
		public CommaListContext commaList() {
			return getRuleContext(CommaListContext.class,0);
		}
		public BracketExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterBracketExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitBracketExpr(this);
		}
	}

	public final BracketExprContext bracketExpr() throws RecognitionException {
		BracketExprContext _localctx = new BracketExprContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_bracketExpr);
		try {
			setState(869);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(863); match(T__78);
				setState(864); match(T__34);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(865); match(T__78);
				setState(866); commaList();
				setState(867); match(T__34);
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

	public static class GuardedSetContext extends ParserRuleContext {
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GuardedSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardedSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterGuardedSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitGuardedSet(this);
		}
	}

	public final GuardedSetContext guardedSet() throws RecognitionException {
		GuardedSetContext _localctx = new GuardedSetContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_guardedSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871); match(T__78);
			setState(872); expr(0);
			setState(873); match(T__17);
			setState(874); guard();
			setState(875); match(T__34);
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

	public static class CommaListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CommaListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterCommaList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitCommaList(this);
		}
	}

	public final CommaListContext commaList() throws RecognitionException {
		CommaListContext _localctx = new CommaListContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_commaList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(877); expr(0);
			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(878); match(T__68);
				setState(879); expr(0);
				}
				}
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class GuardContext extends ParserRuleContext {
		public InDeclContext inDecl(int i) {
			return getRuleContext(InDeclContext.class,i);
		}
		public List<InDeclContext> inDecl() {
			return getRuleContexts(InDeclContext.class);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitGuard(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_guard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885); inDecl();
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(886); match(T__68);
				setState(887); inDecl();
				}
				}
				setState(892);
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

	public static class RangeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public ToRContext toR() {
			return getRuleContext(ToRContext.class,0);
		}
		public FromRContext fromR() {
			return getRuleContext(FromRContext.class,0);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_range);
		try {
			setState(898);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(893); fromR();
				setState(894); match(T__77);
				setState(895); toR();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(897); match(ID);
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

	public static class FromRContext extends ParserRuleContext {
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public FromRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterFromR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitFromR(this);
		}
	}

	public final FromRContext fromR() throws RecognitionException {
		FromRContext _localctx = new FromRContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_fromR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900); arithExpr(0);
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

	public static class ToRContext extends ParserRuleContext {
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public ToRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterToR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitToR(this);
		}
	}

	public final ToRContext toR() throws RecognitionException {
		ToRContext _localctx = new ToRContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_toR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902); arithExpr(0);
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

	public static class RintContext extends ParserRuleContext {
		public RintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterRint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitRint(this);
		}
	}

	public final RintContext rint() throws RecognitionException {
		RintContext _localctx = new RintContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_rint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904); match(T__73);
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

	public static class RfloatContext extends ParserRuleContext {
		public RfloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rfloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterRfloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitRfloat(this);
		}
	}

	public final RfloatContext rfloat() throws RecognitionException {
		RfloatContext _localctx = new RfloatContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_rfloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906); match(T__79);
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

	public static class RboolContext extends ParserRuleContext {
		public RboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rbool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterRbool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitRbool(this);
		}
	}

	public final RboolContext rbool() throws RecognitionException {
		RboolContext _localctx = new RboolContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_rbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908); match(T__15);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode NAT() { return getToken(MiniZincGrammarParser.NAT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_integer);
		try {
			setState(913);
			switch (_input.LA(1)) {
			case NAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(910); match(NAT);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(911); match(T__0);
				setState(912); match(NAT);
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

	public static class RealContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode NAT() { return getToken(MiniZincGrammarParser.NAT, 0); }
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitReal(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915); integer();
			setState(916); match(T__23);
			setState(917); match(NAT);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode ESC(int i) {
			return getToken(MiniZincGrammarParser.ESC, i);
		}
		public List<TerminalNode> ESC() { return getTokens(MiniZincGrammarParser.ESC); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__76) | (1L << T__75) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__68) | (1L << T__67) | (1L << T__66) | (1L << T__65) | (1L << T__64) | (1L << T__63) | (1L << T__62) | (1L << T__61) | (1L << T__60) | (1L << T__59) | (1L << T__58) | (1L << T__57) | (1L << T__56) | (1L << T__55) | (1L << T__54) | (1L << T__53) | (1L << T__52) | (1L << T__51) | (1L << T__50) | (1L << T__49) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__39) | (1L << T__38) | (1L << T__37) | (1L << T__36) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__32) | (1L << T__31) | (1L << T__30) | (1L << T__29) | (1L << T__28) | (1L << T__27) | (1L << T__25) | (1L << T__24) | (1L << T__23))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__22 - 64)) | (1L << (T__21 - 64)) | (1L << (T__20 - 64)) | (1L << (T__19 - 64)) | (1L << (T__18 - 64)) | (1L << (T__17 - 64)) | (1L << (T__16 - 64)) | (1L << (T__15 - 64)) | (1L << (T__14 - 64)) | (1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__9 - 64)) | (1L << (T__8 - 64)) | (1L << (T__7 - 64)) | (1L << (T__6 - 64)) | (1L << (T__5 - 64)) | (1L << (T__4 - 64)) | (1L << (T__3 - 64)) | (1L << (T__2 - 64)) | (1L << (T__1 - 64)) | (1L << (T__0 - 64)) | (1L << (ESC - 64)) | (1L << (SINGLE_LINE_COMMENT - 64)) | (1L << (ID - 64)) | (1L << (NAT - 64)) | (1L << (WS - 64)) | (1L << (BOOL - 64)))) != 0)) {
				{
				{
				setState(924);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(919);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__26) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				case 2:
					{
					setState(920); match(ESC);
					}
					break;
				case 3:
					{
					setState(921); match(T__23);
					}
					break;
				case 4:
					{
					setState(922); match(T__74);
					}
					break;
				case 5:
					{
					setState(923); match(T__50);
					}
					break;
				}
				}
				}
				setState(930);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 48: return expr_sempred((ExprContext)_localctx, predIndex);
		case 57: return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		case 60: return arithExpr_sempred((ArithExprContext)_localctx, predIndex);
		case 74: return listExpr_sempred((ListExprContext)_localctx, predIndex);
		case 90: return setExpr_sempred((SetExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean listExpr_sempred(ListExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean arithExpr_sempred(ArithExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean setExpr_sempred(SetExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3^\u03a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\3\2\3\2\3\2"+
		"\6\2\u00d6\n\2\r\2\16\2\u00d7\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\u00e4\n\3\3\4\3\4\5\4\u00e8\n\4\3\5\3\5\5\5\u00ec\n\5\3\5\3\5\5\5"+
		"\u00f0\n\5\3\6\3\6\5\6\u00f4\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00fd"+
		"\n\7\f\7\16\7\u0100\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u010a\n\b"+
		"\3\b\3\b\3\b\5\b\u010f\n\b\3\t\3\t\3\t\3\t\7\t\u0115\n\t\f\t\16\t\u0118"+
		"\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u012f\n\16\3\17\3\17\5\17\u0133\n\17"+
		"\3\17\3\17\5\17\u0137\n\17\3\20\5\20\u013a\n\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u0141\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u0150\n\23\f\23\16\23\u0153\13\23\5\23\u0155\n\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u015d\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u0164\n\24\f\24\16\24\u0167\13\24\5\24\u0169\n\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\5\25\u0173\n\25\3\26\3\26\3\27\3\27\5\27\u0179"+
		"\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\5\33\u0188\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\5\37\u0195\n\37\3\37\3\37\3\37\3\37\7\37\u019b\n\37\f\37\16\37\u019e"+
		"\13\37\3\37\3\37\5\37\u01a2\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\5#\u01b4\n#\3$\3$\3%\3%\3%\3%\3%\7%\u01bd\n%\f%\16%\u01c0"+
		"\13%\3%\3%\3&\3&\3&\3&\3&\5&\u01c9\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+"+
		"\3,\3,\3,\3,\3,\3,\3,\5,\u01dc\n,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/"+
		"\3/\3/\3\60\3\60\3\60\3\60\7\60\u01f0\n\60\f\60\16\60\u01f3\13\60\3\60"+
		"\5\60\u01f6\n\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u020f"+
		"\n\62\3\62\3\62\3\62\3\62\7\62\u0215\n\62\f\62\16\62\u0218\13\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0225\n\63\3\64"+
		"\3\64\5\64\u0229\n\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\38\39\39"+
		"\39\39\3:\3:\3:\5:\u023c\n:\3:\3:\3:\3:\3:\5:\u0243\n:\3:\3:\3:\5:\u0248"+
		"\n:\3;\3;\3;\3;\5;\u024e\n;\3;\3;\3;\3;\5;\u0254\n;\3;\3;\3;\5;\u0259"+
		"\n;\3;\3;\7;\u025d\n;\f;\16;\u0260\13;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\5<\u026d\n<\3=\3=\3=\3=\3=\5=\u0274\n=\3>\3>\3>\5>\u0279\n>\3>\3>\3"+
		">\3>\7>\u027f\n>\f>\16>\u0282\13>\3?\3?\3?\3@\3@\3@\3A\3A\3A\5A\u028d"+
		"\nA\3B\3B\3B\3B\7B\u0293\nB\fB\16B\u0296\13B\3B\3B\5B\u029a\nB\3C\3C\3"+
		"C\3C\3C\3C\3C\3D\3D\3D\3D\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\5G\u02b1\nG\3"+
		"H\3H\3I\3I\3I\3I\3I\5I\u02ba\nI\3J\3J\3J\3J\3J\3J\6J\u02c2\nJ\rJ\16J\u02c3"+
		"\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\5L\u02d0\nL\3L\3L\3L\7L\u02d5\nL\fL\16"+
		"L\u02d8\13L\3M\3M\5M\u02dc\nM\3N\3N\3N\5N\u02e1\nN\3O\3O\3O\3O\7O\u02e7"+
		"\nO\fO\16O\u02ea\13O\3O\3O\3P\3P\3P\3P\7P\u02f2\nP\fP\16P\u02f5\13P\3"+
		"P\3P\3P\3P\3Q\3Q\3Q\3Q\7Q\u02ff\nQ\fQ\16Q\u0302\13Q\3Q\5Q\u0305\nQ\3Q"+
		"\3Q\3Q\3Q\7Q\u030b\nQ\fQ\16Q\u030e\13Q\7Q\u0310\nQ\fQ\16Q\u0313\13Q\3"+
		"Q\3Q\3R\3R\3R\3R\3R\5R\u031c\nR\3S\3S\3S\7S\u0321\nS\fS\16S\u0324\13S"+
		"\3S\3S\3S\5S\u0329\nS\3T\3T\3T\3U\3U\3U\3U\3U\7U\u0333\nU\fU\16U\u0336"+
		"\13U\3U\3U\3U\3U\3V\3V\5V\u033e\nV\3W\3W\3W\3X\3X\3X\3X\3X\5X\u0348\n"+
		"X\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\5[\u0354\n[\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\7\\\u035d\n\\\f\\\16\\\u0360\13\\\3]\3]\3]\3]\3]\3]\5]\u0368\n]\3^"+
		"\3^\3^\3^\3^\3^\3_\3_\3_\7_\u0373\n_\f_\16_\u0376\13_\3`\3`\3`\7`\u037b"+
		"\n`\f`\16`\u037e\13`\3a\3a\3a\3a\3a\5a\u0385\na\3b\3b\3c\3c\3d\3d\3e\3"+
		"e\3f\3f\3g\3g\3g\5g\u0394\ng\3h\3h\3h\3h\3i\3i\3i\3i\3i\5i\u039f\ni\7"+
		"i\u03a1\ni\fi\16i\u03a4\13i\3i\2\7btz\u0096\u00b6j\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\2\t\5\2\32\32\34\34WW\7\2\27\27\33"+
		"\33$$\62\62OO\13\2\b\b\r\r\30\30..99CCHHLLUU\t\2\b\b\r\r !<<HHJJRR\b\2"+
		"\37\37,,//@@PPXX\4\2\22\22RS\3\2>>\u03c1\2\u00d5\3\2\2\2\4\u00e3\3\2\2"+
		"\2\6\u00e7\3\2\2\2\b\u00eb\3\2\2\2\n\u00f3\3\2\2\2\f\u00f5\3\2\2\2\16"+
		"\u0103\3\2\2\2\20\u0110\3\2\2\2\22\u011b\3\2\2\2\24\u011d\3\2\2\2\26\u011f"+
		"\3\2\2\2\30\u0122\3\2\2\2\32\u012e\3\2\2\2\34\u0130\3\2\2\2\36\u0139\3"+
		"\2\2\2 \u0142\3\2\2\2\"\u0145\3\2\2\2$\u0149\3\2\2\2&\u015a\3\2\2\2(\u0172"+
		"\3\2\2\2*\u0174\3\2\2\2,\u0178\3\2\2\2.\u017a\3\2\2\2\60\u017d\3\2\2\2"+
		"\62\u0180\3\2\2\2\64\u0187\3\2\2\2\66\u0189\3\2\2\28\u018c\3\2\2\2:\u018f"+
		"\3\2\2\2<\u0192\3\2\2\2>\u01a3\3\2\2\2@\u01ad\3\2\2\2B\u01af\3\2\2\2D"+
		"\u01b3\3\2\2\2F\u01b5\3\2\2\2H\u01b7\3\2\2\2J\u01c8\3\2\2\2L\u01ca\3\2"+
		"\2\2N\u01cc\3\2\2\2P\u01ce\3\2\2\2R\u01d0\3\2\2\2T\u01d2\3\2\2\2V\u01db"+
		"\3\2\2\2X\u01dd\3\2\2\2Z\u01e1\3\2\2\2\\\u01e6\3\2\2\2^\u01eb\3\2\2\2"+
		"`\u01f9\3\2\2\2b\u020e\3\2\2\2d\u0224\3\2\2\2f\u0228\3\2\2\2h\u022a\3"+
		"\2\2\2j\u022c\3\2\2\2l\u022e\3\2\2\2n\u0230\3\2\2\2p\u0234\3\2\2\2r\u0247"+
		"\3\2\2\2t\u0253\3\2\2\2v\u026c\3\2\2\2x\u0273\3\2\2\2z\u0278\3\2\2\2|"+
		"\u0283\3\2\2\2~\u0286\3\2\2\2\u0080\u0289\3\2\2\2\u0082\u0299\3\2\2\2"+
		"\u0084\u029b\3\2\2\2\u0086\u02a2\3\2\2\2\u0088\u02a6\3\2\2\2\u008a\u02a8"+
		"\3\2\2\2\u008c\u02b0\3\2\2\2\u008e\u02b2\3\2\2\2\u0090\u02b9\3\2\2\2\u0092"+
		"\u02bb\3\2\2\2\u0094\u02c7\3\2\2\2\u0096\u02cf\3\2\2\2\u0098\u02db\3\2"+
		"\2\2\u009a\u02e0\3\2\2\2\u009c\u02e2\3\2\2\2\u009e\u02ed\3\2\2\2\u00a0"+
		"\u02fa\3\2\2\2\u00a2\u031b\3\2\2\2\u00a4\u031d\3\2\2\2\u00a6\u032a\3\2"+
		"\2\2\u00a8\u032d\3\2\2\2\u00aa\u033d\3\2\2\2\u00ac\u033f\3\2\2\2\u00ae"+
		"\u0342\3\2\2\2\u00b0\u0349\3\2\2\2\u00b2\u034d\3\2\2\2\u00b4\u0353\3\2"+
		"\2\2\u00b6\u0355\3\2\2\2\u00b8\u0367\3\2\2\2\u00ba\u0369\3\2\2\2\u00bc"+
		"\u036f\3\2\2\2\u00be\u0377\3\2\2\2\u00c0\u0384\3\2\2\2\u00c2\u0386\3\2"+
		"\2\2\u00c4\u0388\3\2\2\2\u00c6\u038a\3\2\2\2\u00c8\u038c\3\2\2\2\u00ca"+
		"\u038e\3\2\2\2\u00cc\u0393\3\2\2\2\u00ce\u0395\3\2\2\2\u00d0\u03a2\3\2"+
		"\2\2\u00d2\u00d3\5\4\3\2\u00d3\u00d4\7\63\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d2\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\3\3\2\2\2\u00d9\u00e4\5\f\7\2\u00da\u00e4\5\16\b\2\u00db\u00e4"+
		"\5\26\f\2\u00dc\u00e4\5\6\4\2\u00dd\u00e4\5\34\17\2\u00de\u00e4\5\32\16"+
		"\2\u00df\u00e4\5$\23\2\u00e0\u00e4\5&\24\2\u00e1\u00e4\5 \21\2\u00e2\u00e4"+
		"\5\"\22\2\u00e3\u00d9\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3\u00db\3\2\2\2"+
		"\u00e3\u00dc\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00df"+
		"\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\5\3\2\2\2\u00e5\u00e8\5\b\5\2\u00e6\u00e8\5\n\6\2\u00e7\u00e5\3\2\2\2"+
		"\u00e7\u00e6\3\2\2\2\u00e8\7\3\2\2\2\u00e9\u00ec\5\30\r\2\u00ea\u00ec"+
		"\5Z.\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00ee\7\r\2\2\u00ee\u00f0\5b\62\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\t\3\2\2\2\u00f1\u00f4\5\36\20\2\u00f2\u00f4\5\\/\2\u00f3\u00f1"+
		"\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\13\3\2\2\2\u00f5\u00f6\7:\2\2\u00f6"+
		"\u00f7\7[\2\2\u00f7\u00f8\7\r\2\2\u00f8\u00f9\7\n\2\2\u00f9\u00fe\5D#"+
		"\2\u00fa\u00fb\7\24\2\2\u00fb\u00fd\5D#\2\u00fc\u00fa\3\2\2\2\u00fd\u0100"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0102\7\66\2\2\u0102\r\3\2\2\2\u0103\u0104\7\25\2"+
		"\2\u0104\u0105\7[\2\2\u0105\u0109\7\r\2\2\u0106\u0107\5\22\n\2\u0107\u0108"+
		"\7\"\2\2\u0108\u010a\3\2\2\2\u0109\u0106\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010e\5V,\2\u010c\u010d\7\"\2\2\u010d\u010f\5\24"+
		"\13\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\17\3\2\2\2\u0110\u0111"+
		"\7F\2\2\u0111\u0116\7[\2\2\u0112\u0113\7\24\2\2\u0113\u0115\7[\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7#\2\2\u011a"+
		"\21\3\2\2\2\u011b\u011c\5\20\t\2\u011c\23\3\2\2\2\u011d\u011e\5\20\t\2"+
		"\u011e\25\3\2\2\2\u011f\u0120\7?\2\2\u0120\u0121\5b\62\2\u0121\27\3\2"+
		"\2\2\u0122\u0123\7\31\2\2\u0123\u0124\5V,\2\u0124\u0125\7E\2\2\u0125\u0126"+
		"\7[\2\2\u0126\31\3\2\2\2\u0127\u0128\7\26\2\2\u0128\u0129\7\23\2\2\u0129"+
		"\u012a\5\u0096L\2\u012a\u012b\7T\2\2\u012b\u012f\3\2\2\2\u012c\u012d\7"+
		"\26\2\2\u012d\u012f\5\u0096L\2\u012e\u0127\3\2\2\2\u012e\u012c\3\2\2\2"+
		"\u012f\33\3\2\2\2\u0130\u0132\78\2\2\u0131\u0133\5\62\32\2\u0132\u0131"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0137\5*\26\2\u0135"+
		"\u0137\5,\27\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\35\3\2\2"+
		"\2\u0138\u013a\7D\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u013c\5V,\2\u013c\u013d\7E\2\2\u013d\u0140\7[\2\2\u013e"+
		"\u013f\7\r\2\2\u013f\u0141\5b\62\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\37\3\2\2\2\u0142\u0143\7\21\2\2\u0143\u0144\5\u008aF\2\u0144"+
		"!\3\2\2\2\u0145\u0146\7[\2\2\u0146\u0147\7\r\2\2\u0147\u0148\5b\62\2\u0148"+
		"#\3\2\2\2\u0149\u014a\7\64\2\2\u014a\u014b\7[\2\2\u014b\u0154\7\23\2\2"+
		"\u014c\u0151\5\6\4\2\u014d\u014e\7\24\2\2\u014e\u0150\5\6\4\2\u014f\u014d"+
		"\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u014c\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7T\2\2\u0157\u0158\7\r\2\2\u0158"+
		"\u0159\5b\62\2\u0159%\3\2\2\2\u015a\u015c\7)\2\2\u015b\u015d\7\31\2\2"+
		"\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f"+
		"\5(\25\2\u015f\u0168\7\23\2\2\u0160\u0165\5\6\4\2\u0161\u0162\7\24\2\2"+
		"\u0162\u0164\5\6\4\2\u0163\u0161\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0168"+
		"\u0160\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\7T"+
		"\2\2\u016b\u016c\7\r\2\2\u016c\u016d\5b\62\2\u016d\'\3\2\2\2\u016e\u0173"+
		"\7[\2\2\u016f\u0170\7[\2\2\u0170\u0171\7E\2\2\u0171\u0173\5f\64\2\u0172"+
		"\u016e\3\2\2\2\u0172\u016f\3\2\2\2\u0173)\3\2\2\2\u0174\u0175\7N\2\2\u0175"+
		"+\3\2\2\2\u0176\u0179\5.\30\2\u0177\u0179\5\60\31\2\u0178\u0176\3\2\2"+
		"\2\u0178\u0177\3\2\2\2\u0179-\3\2\2\2\u017a\u017b\7\4\2\2\u017b\u017c"+
		"\5b\62\2\u017c/\3\2\2\2\u017d\u017e\7\6\2\2\u017e\u017f\5b\62\2\u017f"+
		"\61\3\2\2\2\u0180\u0181\7\f\2\2\u0181\u0182\5\64\33\2\u0182\63\3\2\2\2"+
		"\u0183\u0188\5\66\34\2\u0184\u0188\58\35\2\u0185\u0188\5:\36\2\u0186\u0188"+
		"\5<\37\2\u0187\u0183\3\2\2\2\u0187\u0184\3\2\2\2\u0187\u0185\3\2\2\2\u0187"+
		"\u0186\3\2\2\2\u0188\65\3\2\2\2\u0189\u018a\7\5\2\2\u018a\u018b\5> \2"+
		"\u018b\67\3\2\2\2\u018c\u018d\7\20\2\2\u018d\u018e\5> \2\u018e9\3\2\2"+
		"\2\u018f\u0190\7\65\2\2\u0190\u0191\5> \2\u0191;\3\2\2\2\u0192\u0194\7"+
		"*\2\2\u0193\u0195\7\23\2\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0197\7F\2\2\u0197\u019c\5\64\33\2\u0198\u0199\7"+
		"\24\2\2\u0199\u019b\5\64\33\2\u019a\u0198\3\2\2\2\u019b\u019e\3\2\2\2"+
		"\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u019c"+
		"\3\2\2\2\u019f\u01a1\7#\2\2\u01a0\u01a2\7T\2\2\u01a1\u01a0\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2=\3\2\2\2\u01a3\u01a4\7\23\2\2\u01a4\u01a5\5b\62\2"+
		"\u01a5\u01a6\7\24\2\2\u01a6\u01a7\5@!\2\u01a7\u01a8\7\24\2\2\u01a8\u01a9"+
		"\5B\"\2\u01a9\u01aa\7\24\2\2\u01aa\u01ab\7\35\2\2\u01ab\u01ac\7T\2\2\u01ac"+
		"?\3\2\2\2\u01ad\u01ae\t\2\2\2\u01aeA\3\2\2\2\u01af\u01b0\t\3\2\2\u01b0"+
		"C\3\2\2\2\u01b1\u01b4\5F$\2\u01b2\u01b4\5H%\2\u01b3\u01b1\3\2\2\2\u01b3"+
		"\u01b2\3\2\2\2\u01b4E\3\2\2\2\u01b5\u01b6\7[\2\2\u01b6G\3\2\2\2\u01b7"+
		"\u01b8\7[\2\2\u01b8\u01b9\7\23\2\2\u01b9\u01be\5J&\2\u01ba\u01bb\7\24"+
		"\2\2\u01bb\u01bd\5J&\2\u01bc\u01ba\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc"+
		"\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1"+
		"\u01c2\7T\2\2\u01c2I\3\2\2\2\u01c3\u01c9\5L\'\2\u01c4\u01c9\5N(\2\u01c5"+
		"\u01c9\5P)\2\u01c6\u01c9\5R*\2\u01c7\u01c9\5T+\2\u01c8\u01c3\3\2\2\2\u01c8"+
		"\u01c4\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2"+
		"\2\2\u01c9K\3\2\2\2\u01ca\u01cb\5\u00c6d\2\u01cbM\3\2\2\2\u01cc\u01cd"+
		"\5\u00c8e\2\u01cdO\3\2\2\2\u01ce\u01cf\5\u00caf\2\u01cfQ\3\2\2\2\u01d0"+
		"\u01d1\7[\2\2\u01d1S\3\2\2\2\u01d2\u01d3\5\u00c0a\2\u01d3U\3\2\2\2\u01d4"+
		"\u01dc\5\u00c6d\2\u01d5\u01dc\5\u00caf\2\u01d6\u01dc\5\u00c8e\2\u01d7"+
		"\u01dc\7[\2\2\u01d8\u01dc\5`\61\2\u01d9\u01dc\5\u00c0a\2\u01da\u01dc\5"+
		"X-\2\u01db\u01d4\3\2\2\2\u01db\u01d5\3\2\2\2\u01db\u01d6\3\2\2\2\u01db"+
		"\u01d7\3\2\2\2\u01db\u01d8\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01da\3\2"+
		"\2\2\u01dcW\3\2\2\2\u01dd\u01de\7\7\2\2\u01de\u01df\7\60\2\2\u01df\u01e0"+
		"\5V,\2\u01e0Y\3\2\2\2\u01e1\u01e2\7-\2\2\u01e2\u01e3\5^\60\2\u01e3\u01e4"+
		"\7\60\2\2\u01e4\u01e5\5\30\r\2\u01e5[\3\2\2\2\u01e6\u01e7\7-\2\2\u01e7"+
		"\u01e8\5^\60\2\u01e8\u01e9\7\60\2\2\u01e9\u01ea\5\36\20\2\u01ea]\3\2\2"+
		"\2\u01eb\u01f5\7F\2\2\u01ec\u01f1\5\u00c0a\2\u01ed\u01ee\7\24\2\2\u01ee"+
		"\u01f0\5\u00c0a\2\u01ef\u01ed\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef"+
		"\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f6\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4"+
		"\u01f6\7\17\2\2\u01f5\u01ec\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3"+
		"\2\2\2\u01f7\u01f8\7#\2\2\u01f8_\3\2\2\2\u01f9\u01fa\7[\2\2\u01fa\u01fb"+
		"\7\23\2\2\u01fb\u01fc\5z>\2\u01fc\u01fd\7T\2\2\u01fda\3\2\2\2\u01fe\u020f"+
		"\b\62\1\2\u01ff\u020f\5\u0086D\2\u0200\u020f\5r:\2\u0201\u020f\5x=\2\u0202"+
		"\u020f\5\u00b6\\\2\u0203\u020f\5\u0096L\2\u0204\u020f\5\u00acW\2\u0205"+
		"\u020f\5\u00a8U\2\u0206\u020f\5\u0080A\2\u0207\u020f\5\u008aF\2\u0208"+
		"\u020f\5\u0092J\2\u0209\u020f\7^\2\2\u020a\u020f\5\u00ceh\2\u020b\u020f"+
		"\5\u00ccg\2\u020c\u020f\7[\2\2\u020d\u020f\7K\2\2\u020e\u01fe\3\2\2\2"+
		"\u020e\u01ff\3\2\2\2\u020e\u0200\3\2\2\2\u020e\u0201\3\2\2\2\u020e\u0202"+
		"\3\2\2\2\u020e\u0203\3\2\2\2\u020e\u0204\3\2\2\2\u020e\u0205\3\2\2\2\u020e"+
		"\u0206\3\2\2\2\u020e\u0207\3\2\2\2\u020e\u0208\3\2\2\2\u020e\u0209\3\2"+
		"\2\2\u020e\u020a\3\2\2\2\u020e\u020b\3\2\2\2\u020e\u020c\3\2\2\2\u020e"+
		"\u020d\3\2\2\2\u020f\u0216\3\2\2\2\u0210\u0211\f\r\2\2\u0211\u0212\5\u008c"+
		"G\2\u0212\u0213\5b\62\16\u0213\u0215\3\2\2\2\u0214\u0210\3\2\2\2\u0215"+
		"\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217c\3\2\2\2"+
		"\u0218\u0216\3\2\2\2\u0219\u0225\3\2\2\2\u021a\u021b\7\23\2\2\u021b\u021c"+
		"\5t;\2\u021c\u021d\7T\2\2\u021d\u0225\3\2\2\2\u021e\u0225\7[\2\2\u021f"+
		"\u0225\7^\2\2\u0220\u0225\5\u0090I\2\u0221\u0225\5\u00acW\2\u0222\u0225"+
		"\5\u00a8U\2\u0223\u0225\5\u0080A\2\u0224\u0219\3\2\2\2\u0224\u021a\3\2"+
		"\2\2\u0224\u021e\3\2\2\2\u0224\u021f\3\2\2\2\u0224\u0220\3\2\2\2\u0224"+
		"\u0221\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0223\3\2\2\2\u0225e\3\2\2\2"+
		"\u0226\u0229\5h\65\2\u0227\u0229\5j\66\2\u0228\u0226\3\2\2\2\u0228\u0227"+
		"\3\2\2\2\u0229g\3\2\2\2\u022a\u022b\t\4\2\2\u022bi\3\2\2\2\u022c\u022d"+
		"\t\5\2\2\u022dk\3\2\2\2\u022e\u022f\t\6\2\2\u022fm\3\2\2\2\u0230\u0231"+
		"\7[\2\2\u0231\u0232\7E\2\2\u0232\u0233\5h\65\2\u0233o\3\2\2\2\u0234\u0235"+
		"\7[\2\2\u0235\u0236\7E\2\2\u0236\u0237\5j\66\2\u0237q\3\2\2\2\u0238\u023b"+
		"\5t;\2\u0239\u023c\5h\65\2\u023a\u023c\5n8\2\u023b\u0239\3\2\2\2\u023b"+
		"\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\5t;\2\u023e\u0248\3\2\2"+
		"\2\u023f\u0242\5z>\2\u0240\u0243\5j\66\2\u0241\u0243\5p9\2\u0242\u0240"+
		"\3\2\2\2\u0242\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\5z>\2\u0245"+
		"\u0248\3\2\2\2\u0246\u0248\5|?\2\u0247\u0238\3\2\2\2\u0247\u023f\3\2\2"+
		"\2\u0247\u0246\3\2\2\2\u0248s\3\2\2\2\u0249\u024a\b;\1\2\u024a\u024d\5"+
		"z>\2\u024b\u024e\5j\66\2\u024c\u024e\5p9\2\u024d\u024b\3\2\2\2\u024d\u024c"+
		"\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\5z>\2\u0250\u0254\3\2\2\2\u0251"+
		"\u0254\5|?\2\u0252\u0254\5d\63\2\u0253\u0249\3\2\2\2\u0253\u0251\3\2\2"+
		"\2\u0253\u0252\3\2\2\2\u0254\u025e\3\2\2\2\u0255\u0258\f\6\2\2\u0256\u0259"+
		"\5h\65\2\u0257\u0259\5n8\2\u0258\u0256\3\2\2\2\u0258\u0257\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u025b\5t;\7\u025b\u025d\3\2\2\2\u025c\u0255\3\2\2"+
		"\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025fu"+
		"\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u026d\7[\2\2\u0262\u026d\5\u00ccg\2"+
		"\u0263\u026d\5\u00ceh\2\u0264\u026d\5\u0090I\2\u0265\u026d\5\u00acW\2"+
		"\u0266\u026d\5\u00a8U\2\u0267\u0268\7\23\2\2\u0268\u0269\5z>\2\u0269\u026a"+
		"\7T\2\2\u026a\u026d\3\2\2\2\u026b\u026d\5\u0080A\2\u026c\u0261\3\2\2\2"+
		"\u026c\u0262\3\2\2\2\u026c\u0263\3\2\2\2\u026c\u0264\3\2\2\2\u026c\u0265"+
		"\3\2\2\2\u026c\u0266\3\2\2\2\u026c\u0267\3\2\2\2\u026c\u026b\3\2\2\2\u026d"+
		"w\3\2\2\2\u026e\u0274\5~@\2\u026f\u0270\5z>\2\u0270\u0271\5l\67\2\u0271"+
		"\u0272\5z>\2\u0272\u0274\3\2\2\2\u0273\u026e\3\2\2\2\u0273\u026f\3\2\2"+
		"\2\u0274y\3\2\2\2\u0275\u0276\b>\1\2\u0276\u0279\5~@\2\u0277\u0279\5v"+
		"<\2\u0278\u0275\3\2\2\2\u0278\u0277\3\2\2\2\u0279\u0280\3\2\2\2\u027a"+
		"\u027b\f\4\2\2\u027b\u027c\5l\67\2\u027c\u027d\5z>\5\u027d\u027f\3\2\2"+
		"\2\u027e\u027a\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281"+
		"\3\2\2\2\u0281{\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0284\7V\2\2\u0284\u0285"+
		"\5b\62\2\u0285}\3\2\2\2\u0286\u0287\7X\2\2\u0287\u0288\5z>\2\u0288\177"+
		"\3\2\2\2\u0289\u028c\7[\2\2\u028a\u028d\5\u0084C\2\u028b\u028d\5\u0082"+
		"B\2\u028c\u028a\3\2\2\2\u028c\u028b\3\2\2\2\u028d\u0081\3\2\2\2\u028e"+
		"\u028f\7\23\2\2\u028f\u0294\5b\62\2\u0290\u0291\7\24\2\2\u0291\u0293\5"+
		"b\62\2\u0292\u0290\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294"+
		"\u0295\3\2\2\2\u0295\u0297\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u0298\7T"+
		"\2\2\u0298\u029a\3\2\2\2\u0299\u028e\3\2\2\2\u0299\u029a\3\2\2\2\u029a"+
		"\u0083\3\2\2\2\u029b\u029c\7\23\2\2\u029c\u029d\5\u00be`\2\u029d\u029e"+
		"\7T\2\2\u029e\u029f\7\23\2\2\u029f\u02a0\5b\62\2\u02a0\u02a1\7T\2\2\u02a1"+
		"\u0085\3\2\2\2\u02a2\u02a3\7\23\2\2\u02a3\u02a4\5b\62\2\u02a4\u02a5\7"+
		"T\2\2\u02a5\u0087\3\2\2\2\u02a6\u02a7\7[\2\2\u02a7\u0089\3\2\2\2\u02a8"+
		"\u02a9\7>\2\2\u02a9\u02aa\5\u00d0i\2\u02aa\u02ab\7>\2\2\u02ab\u008b\3"+
		"\2\2\2\u02ac\u02ad\7;\2\2\u02ad\u02ae\7[\2\2\u02ae\u02b1\7;\2\2\u02af"+
		"\u02b1\5\u008eH\2\u02b0\u02ac\3\2\2\2\u02b0\u02af\3\2\2\2\u02b1\u008d"+
		"\3\2\2\2\u02b2\u02b3\t\7\2\2\u02b3\u008f\3\2\2\2\u02b4\u02b5\7[\2\2\u02b5"+
		"\u02ba\5\u009cO\2\u02b6\u02b7\5\u009cO\2\u02b7\u02b8\5\u009cO\2\u02b8"+
		"\u02ba\3\2\2\2\u02b9\u02b4\3\2\2\2\u02b9\u02b6\3\2\2\2\u02ba\u0091\3\2"+
		"\2\2\u02bb\u02bc\7B\2\2\u02bc\u02bd\7[\2\2\u02bd\u02c1\7\60\2\2\u02be"+
		"\u02bf\5\u0094K\2\u02bf\u02c0\7\63\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02be"+
		"\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4"+
		"\u02c5\3\2\2\2\u02c5\u02c6\7\36\2\2\u02c6\u0093\3\2\2\2\u02c7\u02c8\5"+
		"\u0080A\2\u02c8\u02c9\7(\2\2\u02c9\u02ca\5b\62\2\u02ca\u0095\3\2\2\2\u02cb"+
		"\u02cc\bL\1\2\u02cc\u02d0\5\u00a2R\2\u02cd\u02d0\5\u0098M\2\u02ce\u02d0"+
		"\5\u00a0Q\2\u02cf\u02cb\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02ce\3\2\2"+
		"\2\u02d0\u02d6\3\2\2\2\u02d1\u02d2\f\5\2\2\u02d2\u02d3\7\"\2\2\u02d3\u02d5"+
		"\5\u0096L\6\u02d4\u02d1\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d4\3\2\2"+
		"\2\u02d6\u02d7\3\2\2\2\u02d7\u0097\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02dc"+
		"\5\u009aN\2\u02da\u02dc\5\u009eP\2\u02db\u02d9\3\2\2\2\u02db\u02da\3\2"+
		"\2\2\u02dc\u0099\3\2\2\2\u02dd\u02de\7F\2\2\u02de\u02e1\7#\2\2\u02df\u02e1"+
		"\5\u009cO\2\u02e0\u02dd\3\2\2\2\u02e0\u02df\3\2\2\2\u02e1\u009b\3\2\2"+
		"\2\u02e2\u02e3\7F\2\2\u02e3\u02e8\5b\62\2\u02e4\u02e5\7\24\2\2\u02e5\u02e7"+
		"\5b\62\2\u02e6\u02e4\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8"+
		"\u02e9\3\2\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb\u02ec\7#"+
		"\2\2\u02ec\u009d\3\2\2\2\u02ed\u02ee\7F\2\2\u02ee\u02f3\5b\62\2\u02ef"+
		"\u02f0\7\24\2\2\u02f0\u02f2\5b\62\2\u02f1\u02ef\3\2\2\2\u02f2\u02f5\3"+
		"\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f6\3\2\2\2\u02f5"+
		"\u02f3\3\2\2\2\u02f6\u02f7\7G\2\2\u02f7\u02f8\5\u00be`\2\u02f8\u02f9\7"+
		"#\2\2\u02f9\u009f\3\2\2\2\u02fa\u02fb\7=\2\2\u02fb\u0300\5b\62\2\u02fc"+
		"\u02fd\7\24\2\2\u02fd\u02ff\5b\62\2\u02fe\u02fc\3\2\2\2\u02ff\u0302\3"+
		"\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0311\3\2\2\2\u0302"+
		"\u0300\3\2\2\2\u0303\u0305\7\24\2\2\u0304\u0303\3\2\2\2\u0304\u0305\3"+
		"\2\2\2\u0305\u0306\3\2\2\2\u0306\u0307\7G\2\2\u0307\u030c\5b\62\2\u0308"+
		"\u0309\7\24\2\2\u0309\u030b\5b\62\2\u030a\u0308\3\2\2\2\u030b\u030e\3"+
		"\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0310\3\2\2\2\u030e"+
		"\u030c\3\2\2\2\u030f\u0304\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2"+
		"\2\2\u0311\u0312\3\2\2\2\u0312\u0314\3\2\2\2\u0313\u0311\3\2\2\2\u0314"+
		"\u0315\7%\2\2\u0315\u00a1\3\2\2\2\u0316\u031c\5\u008aF\2\u0317\u031c\7"+
		"[\2\2\u0318\u031c\5\u00acW\2\u0319\u031c\5\u0090I\2\u031a\u031c\5\u0080"+
		"A\2\u031b\u0316\3\2\2\2\u031b\u0317\3\2\2\2\u031b\u0318\3\2\2\2\u031b"+
		"\u0319\3\2\2\2\u031b\u031a\3\2\2\2\u031c\u00a3\3\2\2\2\u031d\u0322\7["+
		"\2\2\u031e\u031f\7\24\2\2\u031f\u0321\7[\2\2\u0320\u031e\3\2\2\2\u0321"+
		"\u0324\3\2\2\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0325\3\2"+
		"\2\2\u0324\u0322\3\2\2\2\u0325\u0326\7R\2\2\u0326\u0328\5\u00b6\\\2\u0327"+
		"\u0329\5\u00a6T\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u00a5"+
		"\3\2\2\2\u032a\u032b\7M\2\2\u032b\u032c\5t;\2\u032c\u00a7\3\2\2\2\u032d"+
		"\u032e\7\'\2\2\u032e\u032f\7\n\2\2\u032f\u0334\5\u00aaV\2\u0330\u0331"+
		"\7\24\2\2\u0331\u0333\5\u00aaV\2\u0332\u0330\3\2\2\2\u0333\u0336\3\2\2"+
		"\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\3\2\2\2\u0336\u0334"+
		"\3\2\2\2\u0337\u0338\7\66\2\2\u0338\u0339\7R\2\2\u0339\u033a\5b\62\2\u033a"+
		"\u00a9\3\2\2\2\u033b\u033e\5\6\4\2\u033c\u033e\5\26\f\2\u033d\u033b\3"+
		"\2\2\2\u033d\u033c\3\2\2\2\u033e\u00ab\3\2\2\2\u033f\u0340\7\67\2\2\u0340"+
		"\u0341\5\u00aeX\2\u0341\u00ad\3\2\2\2\u0342\u0343\5b\62\2\u0343\u0344"+
		"\7+\2\2\u0344\u0347\5b\62\2\u0345\u0348\5\u00b0Y\2\u0346\u0348\5\u00b2"+
		"Z\2\u0347\u0345\3\2\2\2\u0347\u0346\3\2\2\2\u0348\u00af\3\2\2\2\u0349"+
		"\u034a\7Q\2\2\u034a\u034b\5b\62\2\u034b\u034c\7\3\2\2\u034c\u00b1\3\2"+
		"\2\2\u034d\u034e\7\61\2\2\u034e\u034f\5\u00aeX\2\u034f\u00b3\3\2\2\2\u0350"+
		"\u0354\5\u00b8]\2\u0351\u0354\5\u00c0a\2\u0352\u0354\5\u00ba^\2\u0353"+
		"\u0350\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0352\3\2\2\2\u0354\u00b5\3\2"+
		"\2\2\u0355\u0356\b\\\1\2\u0356\u0357\5\u00b4[\2\u0357\u035e\3\2\2\2\u0358"+
		"\u0359\f\3\2\2\u0359\u035a\5\u008eH\2\u035a\u035b\5\u00b6\\\4\u035b\u035d"+
		"\3\2\2\2\u035c\u0358\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u035c\3\2\2\2\u035e"+
		"\u035f\3\2\2\2\u035f\u00b7\3\2\2\2\u0360\u035e\3\2\2\2\u0361\u0362\7\n"+
		"\2\2\u0362\u0368\7\66\2\2\u0363\u0364\7\n\2\2\u0364\u0365\5\u00bc_\2\u0365"+
		"\u0366\7\66\2\2\u0366\u0368\3\2\2\2\u0367\u0361\3\2\2\2\u0367\u0363\3"+
		"\2\2\2\u0368\u00b9\3\2\2\2\u0369\u036a\7\n\2\2\u036a\u036b\5b\62\2\u036b"+
		"\u036c\7G\2\2\u036c\u036d\5\u00be`\2\u036d\u036e\7\66\2\2\u036e\u00bb"+
		"\3\2\2\2\u036f\u0374\5b\62\2\u0370\u0371\7\24\2\2\u0371\u0373\5b\62\2"+
		"\u0372\u0370\3\2\2\2\u0373\u0376\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375"+
		"\3\2\2\2\u0375\u00bd\3\2\2\2\u0376\u0374\3\2\2\2\u0377\u037c\5\u00a4S"+
		"\2\u0378\u0379\7\24\2\2\u0379\u037b\5\u00a4S\2\u037a\u0378\3\2\2\2\u037b"+
		"\u037e\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u00bf\3\2"+
		"\2\2\u037e\u037c\3\2\2\2\u037f\u0380\5\u00c2b\2\u0380\u0381\7\13\2\2\u0381"+
		"\u0382\5\u00c4c\2\u0382\u0385\3\2\2\2\u0383\u0385\7[\2\2\u0384\u037f\3"+
		"\2\2\2\u0384\u0383\3\2\2\2\u0385\u00c1\3\2\2\2\u0386\u0387\5z>\2\u0387"+
		"\u00c3\3\2\2\2\u0388\u0389\5z>\2\u0389\u00c5\3\2\2\2\u038a\u038b\7\17"+
		"\2\2\u038b\u00c7\3\2\2\2\u038c\u038d\7\t\2\2\u038d\u00c9\3\2\2\2\u038e"+
		"\u038f\7I\2\2\u038f\u00cb\3\2\2\2\u0390\u0394\7\\\2\2\u0391\u0392\7X\2"+
		"\2\u0392\u0394\7\\\2\2\u0393\u0390\3\2\2\2\u0393\u0391\3\2\2\2\u0394\u00cd"+
		"\3\2\2\2\u0395\u0396\5\u00ccg\2\u0396\u0397\7A\2\2\u0397\u0398\7\\\2\2"+
		"\u0398\u00cf\3\2\2\2\u0399\u039f\n\b\2\2\u039a\u039f\7Y\2\2\u039b\u039f"+
		"\7A\2\2\u039c\u039f\7\16\2\2\u039d\u039f\7&\2\2\u039e\u0399\3\2\2\2\u039e"+
		"\u039a\3\2\2\2\u039e\u039b\3\2\2\2\u039e\u039c\3\2\2\2\u039e\u039d\3\2"+
		"\2\2\u039f\u03a1\3\2\2\2\u03a0\u039e\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2"+
		"\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u00d1\3\2\2\2\u03a4\u03a2\3\2"+
		"\2\2P\u00d7\u00e3\u00e7\u00eb\u00ef\u00f3\u00fe\u0109\u010e\u0116\u012e"+
		"\u0132\u0136\u0139\u0140\u0151\u0154\u015c\u0165\u0168\u0172\u0178\u0187"+
		"\u0194\u019c\u01a1\u01b3\u01be\u01c8\u01db\u01f1\u01f5\u020e\u0216\u0224"+
		"\u0228\u023b\u0242\u0247\u024d\u0253\u0258\u025e\u026c\u0273\u0278\u0280"+
		"\u028c\u0294\u0299\u02b0\u02b9\u02c3\u02cf\u02d6\u02db\u02e0\u02e8\u02f3"+
		"\u0300\u0304\u030c\u0311\u031b\u0322\u0328\u0334\u033d\u0347\u0353\u035e"+
		"\u0367\u0374\u037c\u0384\u0393\u039e\u03a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}