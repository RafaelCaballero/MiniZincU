// Generated from MiniZincGrammar.g4 by ANTLR 4.2.2
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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__95=1, T__94=2, T__93=3, T__92=4, T__91=5, T__90=6, T__89=7, T__88=8, 
		T__87=9, T__86=10, T__85=11, T__84=12, T__83=13, T__82=14, T__81=15, T__80=16, 
		T__79=17, T__78=18, T__77=19, T__76=20, T__75=21, T__74=22, T__73=23, 
		T__72=24, T__71=25, T__70=26, T__69=27, T__68=28, T__67=29, T__66=30, 
		T__65=31, T__64=32, T__63=33, T__62=34, T__61=35, T__60=36, T__59=37, 
		T__58=38, T__57=39, T__56=40, T__55=41, T__54=42, T__53=43, T__52=44, 
		T__51=45, T__50=46, T__49=47, T__48=48, T__47=49, T__46=50, T__45=51, 
		T__44=52, T__43=53, T__42=54, T__41=55, T__40=56, T__39=57, T__38=58, 
		T__37=59, T__36=60, T__35=61, T__34=62, T__33=63, T__32=64, T__31=65, 
		T__30=66, T__29=67, T__28=68, T__27=69, T__26=70, T__25=71, T__24=72, 
		T__23=73, T__22=74, T__21=75, T__20=76, T__19=77, T__18=78, T__17=79, 
		T__16=80, T__15=81, T__14=82, T__13=83, T__12=84, T__11=85, T__10=86, 
		T__9=87, T__8=88, T__7=89, T__6=90, T__5=91, T__4=92, T__3=93, T__2=94, 
		T__1=95, T__0=96, ESC=97, SINGLE_LINE_COMMENT=98, ID=99, NAT=100, WS=101, 
		BOOL=102;
	public static final String[] tokenNames = {
		"<INVALID>", "'endif'", "'maximize'", "'int_search'", "'minimize'", "'set'", 
		"'!='", "'float'", "'{'", "'..'", "'::'", "'='", "'^'", "'int'", "'bool_search'", 
		"'include'", "'union'", "'('", "'min'", "','", "'extended'", "'output'", 
		"'indomain'", "'<-'", "'var'", "'first_fail'", "'indomain_split'", "'smallest'", 
		"'complete'", "'endcase'", "'mod'", "'>='", "'<'", "'++'", "']'", "'bool2int'", 
		"'indomain_random'", "'|]'", "'#'", "'let'", "'-->'", "'alldifferent'", 
		"'function'", "'seq_search'", "'then'", "'+'", "'array'", "'<->'", "'/'", 
		"'array1d'", "'of'", "'elseif'", "'sum'", "'indomain_min'", "';'", "'max'", 
		"'predicate'", "'set_search'", "'}'", "'if'", "'solve'", "'\\/'", "'enum'", 
		"'`'", "'<='", "'[|'", "'\"'", "'constraint'", "'*'", "'exists'", "'.'", 
		"'case'", "'->'", "'par'", "':'", "'['", "'|'", "'=='", "'show'", "'bool'", 
		"'>'", "'forall'", "'_'", "'xor'", "'where'", "'satisfy'", "'indomain_median'", 
		"'div'", "'else'", "'in'", "'intersect'", "'prod'", "')'", "'/\\'", "'not'", 
		"'input_order'", "'-'", "ESC", "SINGLE_LINE_COMMENT", "ID", "NAT", "WS", 
		"BOOL"
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
		RULE_op = 50, RULE_boolOp = 51, RULE_arithOp = 52, RULE_qualBoolOp = 53, 
		RULE_qualArithOp = 54, RULE_boolComplexExpr = 55, RULE_boolExpr = 56, 
		RULE_operand = 57, RULE_arithComplexExpr = 58, RULE_arithExpr = 59, RULE_notExpr = 60, 
		RULE_minusExpr = 61, RULE_predOrUnionExpr = 62, RULE_rbracketExpr = 63, 
		RULE_idexpr = 64, RULE_stringExpr = 65, RULE_infixOp = 66, RULE_infixSetOp = 67, 
		RULE_arrayaccess = 68, RULE_caseExpr = 69, RULE_caseBranch = 70, RULE_listExpr = 71, 
		RULE_oneDimList = 72, RULE_simpleList = 73, RULE_guardedList = 74, RULE_multiDimList = 75, 
		RULE_listValue = 76, RULE_showExpr = 77, RULE_functionExpr = 78, RULE_guardExpr = 79, 
		RULE_forall = 80, RULE_exists = 81, RULE_sum = 82, RULE_prod = 83, RULE_max = 84, 
		RULE_min = 85, RULE_bool2int = 86, RULE_alldifferent = 87, RULE_array1d = 88, 
		RULE_guardExprArg = 89, RULE_oneSection = 90, RULE_twoSections = 91, RULE_inDecl = 92, 
		RULE_whereCond = 93, RULE_letExpr = 94, RULE_letDecl = 95, RULE_ifExpr = 96, 
		RULE_bodyIf = 97, RULE_elseS = 98, RULE_elseifS = 99, RULE_setVal = 100, 
		RULE_complexSetExpr = 101, RULE_setExpr = 102, RULE_bracketExpr = 103, 
		RULE_guardedSet = 104, RULE_commaList = 105, RULE_guard = 106, RULE_range = 107, 
		RULE_fromR = 108, RULE_toR = 109, RULE_rint = 110, RULE_rfloat = 111, 
		RULE_rbool = 112, RULE_integer = 113, RULE_real = 114, RULE_string = 115;
	public static final String[] ruleNames = {
		"model", "stat", "decl", "vardecl", "pardecl", "data", "extended", "listExtended", 
		"preExt", "postExt", "constraint", "var", "output", "solve", "parameter", 
		"include", "init", "predicate", "function", "qualName", "satisfy", "optimize", 
		"maximize", "minimize", "annotation", "modeAnnotation", "intS", "boolS", 
		"setS", "seqS", "restS", "varchoice", "constrainchoice", "constr", "scons", 
		"tcons", "arg", "argint", "argfloat", "argbool", "argunion", "argrange", 
		"typename", "typeset", "vararray", "pararray", "dimensions", "typedata", 
		"expr", "boolVal", "op", "boolOp", "arithOp", "qualBoolOp", "qualArithOp", 
		"boolComplexExpr", "boolExpr", "operand", "arithComplexExpr", "arithExpr", 
		"notExpr", "minusExpr", "predOrUnionExpr", "rbracketExpr", "idexpr", "stringExpr", 
		"infixOp", "infixSetOp", "arrayaccess", "caseExpr", "caseBranch", "listExpr", 
		"oneDimList", "simpleList", "guardedList", "multiDimList", "listValue", 
		"showExpr", "functionExpr", "guardExpr", "forall", "exists", "sum", "prod", 
		"max", "min", "bool2int", "alldifferent", "array1d", "guardExprArg", "oneSection", 
		"twoSections", "inDecl", "whereCond", "letExpr", "letDecl", "ifExpr", 
		"bodyIf", "elseS", "elseifS", "setVal", "complexSetExpr", "setExpr", "bracketExpr", 
		"guardedSet", "commaList", "guard", "range", "fromR", "toR", "rint", "rfloat", 
		"rbool", "integer", "real", "string"
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
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(232); stat();
				setState(233); match(54);
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 13) | (1L << 15) | (1L << 17) | (1L << 18) | (1L << 20) | (1L << 21) | (1L << 24) | (1L << 35) | (1L << 39) | (1L << 41) | (1L << 42) | (1L << 46) | (1L << 49) | (1L << 52) | (1L << 55) | (1L << 56) | (1L << 59) | (1L << 60) | (1L << 62))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (69 - 67)) | (1L << (73 - 67)) | (1L << (75 - 67)) | (1L << (79 - 67)) | (1L << (81 - 67)) | (1L << (91 - 67)) | (1L << (96 - 67)) | (1L << (ID - 67)) | (1L << (NAT - 67)))) != 0) );
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
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); data();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240); extended();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241); constraint();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242); decl();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(243); solve();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(244); output();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(245); predicate();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(246); function();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(247); include();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(248); init();
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
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251); vardecl();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252); pardecl();
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
			setState(257);
			switch (_input.LA(1)) {
			case 24:
				{
				setState(255); var();
				}
				break;
			case 46:
				{
				setState(256); vararray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(261);
			_la = _input.LA(1);
			if (_la==11) {
				{
				setState(259); match(11);
				setState(260); expr(0);
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
			setState(265);
			switch (_input.LA(1)) {
			case 5:
			case 7:
			case 13:
			case 17:
			case 18:
			case 35:
			case 39:
			case 41:
			case 49:
			case 52:
			case 55:
			case 59:
			case 69:
			case 73:
			case 75:
			case 79:
			case 81:
			case 91:
			case 96:
			case ID:
			case NAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(263); parameter();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 2);
				{
				setState(264); pararray();
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
			setState(267); match(62);
			setState(268); match(ID);
			setState(269); match(11);
			setState(270); match(8);
			setState(271); constr();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(272); match(19);
				setState(273); constr();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279); match(58);
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
			setState(281); match(20);
			setState(282); match(ID);
			setState(283); match(11);
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(284); preExt();
				setState(285); match(33);
				}
				break;
			}
			setState(289); typename();
			setState(292);
			_la = _input.LA(1);
			if (_la==33) {
				{
				setState(290); match(33);
				setState(291); postExt();
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
			setState(294); match(75);
			setState(295); match(ID);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(296); match(19);
				setState(297); match(ID);
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303); match(34);
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
			setState(305); listExtended();
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
			setState(307); listExtended();
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
			setState(309); match(67);
			setState(310); expr(0);
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
			setState(312); match(24);
			setState(313); typename();
			setState(314); match(74);
			setState(315); match(ID);
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
			setState(324);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317); match(21);
				setState(318); match(17);
				setState(319); listExpr(0);
				setState(320); match(92);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322); match(21);
				setState(323); listExpr(0);
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
			setState(326); match(60);
			setState(328);
			_la = _input.LA(1);
			if (_la==10) {
				{
				setState(327); annotation();
				}
			}

			setState(332);
			switch (_input.LA(1)) {
			case 85:
				{
				setState(330); satisfy();
				}
				break;
			case 2:
			case 4:
				{
				setState(331); optimize();
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
			setState(335);
			_la = _input.LA(1);
			if (_la==73) {
				{
				setState(334); match(73);
				}
			}

			setState(337); typename();
			setState(338); match(74);
			setState(339); match(ID);
			setState(342);
			_la = _input.LA(1);
			if (_la==11) {
				{
				setState(340); match(11);
				setState(341); expr(0);
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
			setState(344); match(15);
			setState(345); stringExpr();
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
			setState(347); match(ID);
			setState(348); match(11);
			setState(349); expr(0);
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
			setState(351); match(56);
			setState(352); match(ID);
			setState(353); match(17);
			setState(362);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 13) | (1L << 17) | (1L << 18) | (1L << 24) | (1L << 35) | (1L << 39) | (1L << 41) | (1L << 46) | (1L << 49) | (1L << 52) | (1L << 55) | (1L << 59))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (73 - 69)) | (1L << (75 - 69)) | (1L << (79 - 69)) | (1L << (81 - 69)) | (1L << (91 - 69)) | (1L << (96 - 69)) | (1L << (ID - 69)) | (1L << (NAT - 69)))) != 0)) {
				{
				setState(354); decl();
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(355); match(19);
					setState(356); decl();
					}
					}
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(364); match(92);
			setState(365); match(11);
			setState(366); expr(0);
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
			setState(368); match(42);
			setState(370);
			_la = _input.LA(1);
			if (_la==24) {
				{
				setState(369); match(24);
				}
			}

			setState(372); qualName();
			setState(373); match(17);
			setState(382);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 13) | (1L << 17) | (1L << 18) | (1L << 24) | (1L << 35) | (1L << 39) | (1L << 41) | (1L << 46) | (1L << 49) | (1L << 52) | (1L << 55) | (1L << 59))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (73 - 69)) | (1L << (75 - 69)) | (1L << (79 - 69)) | (1L << (81 - 69)) | (1L << (91 - 69)) | (1L << (96 - 69)) | (1L << (ID - 69)) | (1L << (NAT - 69)))) != 0)) {
				{
				setState(374); decl();
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(375); match(19);
					setState(376); decl();
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(384); match(92);
			setState(385); match(11);
			setState(386); expr(0);
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
			setState(392);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389); match(ID);
				setState(390); match(74);
				setState(391); op();
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
			setState(394); match(85);
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
			setState(398);
			switch (_input.LA(1)) {
			case 2:
				enterOuterAlt(_localctx, 1);
				{
				setState(396); maximize();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 2);
				{
				setState(397); minimize();
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
			setState(400); match(2);
			setState(401); expr(0);
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
			setState(403); match(4);
			setState(404); expr(0);
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
			setState(406); match(10);
			setState(407); modeAnnotation();
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
			setState(413);
			switch (_input.LA(1)) {
			case 3:
				enterOuterAlt(_localctx, 1);
				{
				setState(409); intS();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 2);
				{
				setState(410); boolS();
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 3);
				{
				setState(411); setS();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 4);
				{
				setState(412); seqS();
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
			setState(415); match(3);
			setState(416); restS();
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
			setState(418); match(14);
			setState(419); restS();
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
			setState(421); match(57);
			setState(422); restS();
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
			setState(424); match(43);
			setState(426);
			_la = _input.LA(1);
			if (_la==17) {
				{
				setState(425); match(17);
				}
			}

			setState(428); match(75);
			setState(429); modeAnnotation();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(430); match(19);
				setState(431); modeAnnotation();
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437); match(34);
			setState(439);
			_la = _input.LA(1);
			if (_la==92) {
				{
				setState(438); match(92);
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
			setState(441); match(17);
			setState(442); expr(0);
			setState(443); match(19);
			setState(444); varchoice();
			setState(445); match(19);
			setState(446); constrainchoice();
			setState(447); match(19);
			setState(448); match(28);
			setState(449); match(92);
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
			setState(451);
			_la = _input.LA(1);
			if ( !(_la==25 || _la==27 || _la==95) ) {
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
			setState(453);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 22) | (1L << 26) | (1L << 36) | (1L << 53))) != 0) || _la==86) ) {
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
			setState(457);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455); scons();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456); tcons();
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
			setState(459); match(ID);
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
			setState(461); match(ID);
			setState(462); match(17);
			setState(463); arg();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(464); match(19);
				setState(465); arg();
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471); match(92);
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
			setState(478);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473); argint();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474); argfloat();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(475); argbool();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(476); argunion();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(477); argrange();
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
			setState(480); rint();
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
			setState(482); rfloat();
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
			setState(484); rbool();
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
			setState(486); match(ID);
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
			setState(488); range();
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
			setState(497);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(490); rint();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491); rbool();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492); rfloat();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493); match(ID);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(494); typedata();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(495); range();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(496); typeset();
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
			setState(499); match(5);
			setState(500); match(50);
			setState(501); typename();
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
			setState(503); match(46);
			setState(504); dimensions();
			setState(505); match(50);
			setState(506); var();
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
			setState(508); match(46);
			setState(509); dimensions();
			setState(510); match(50);
			setState(511); parameter();
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
			setState(513); match(75);
			setState(523);
			switch (_input.LA(1)) {
			case 17:
			case 18:
			case 35:
			case 39:
			case 41:
			case 49:
			case 52:
			case 55:
			case 59:
			case 69:
			case 75:
			case 81:
			case 91:
			case 96:
			case ID:
			case NAT:
				{
				{
				setState(514); range();
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(515); match(19);
					setState(516); range();
					}
					}
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 13:
				{
				setState(522); match(13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(525); match(34);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(527); match(ID);
			setState(528); match(17);
			setState(529); expr(0);
			setState(530); match(92);
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
		public GuardExprContext guardExpr() {
			return getRuleContext(GuardExprContext.class,0);
		}
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
			setState(549);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				}
				break;

			case 2:
				{
				setState(533); rbracketExpr();
				}
				break;

			case 3:
				{
				setState(534); boolComplexExpr();
				}
				break;

			case 4:
				{
				setState(535); arithComplexExpr();
				}
				break;

			case 5:
				{
				setState(536); setExpr(0);
				}
				break;

			case 6:
				{
				setState(537); listExpr(0);
				}
				break;

			case 7:
				{
				setState(538); ifExpr();
				}
				break;

			case 8:
				{
				setState(539); letExpr();
				}
				break;

			case 9:
				{
				setState(540); guardExpr();
				}
				break;

			case 10:
				{
				setState(541); predOrUnionExpr();
				}
				break;

			case 11:
				{
				setState(542); stringExpr();
				}
				break;

			case 12:
				{
				setState(543); caseExpr();
				}
				break;

			case 13:
				{
				setState(544); match(BOOL);
				}
				break;

			case 14:
				{
				setState(545); real();
				}
				break;

			case 15:
				{
				setState(546); integer();
				}
				break;

			case 16:
				{
				setState(547); match(ID);
				}
				break;

			case 17:
				{
				setState(548); match(82);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(551);
					if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
					setState(552); infixOp();
					setState(553); expr(13);
					}
					} 
				}
				setState(559);
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
		public GuardExprContext guardExpr() {
			return getRuleContext(GuardExprContext.class,0);
		}
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
			setState(572);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561); match(17);
				setState(562); boolExpr(0);
				setState(563); match(92);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(565); match(ID);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(566); match(BOOL);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(567); arrayaccess();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(568); ifExpr();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(569); letExpr();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(570); predOrUnionExpr();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(571); guardExpr();
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
			setState(576);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574); boolOp();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(575); arithOp();
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
			setState(578);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 11) | (1L << 23) | (1L << 47) | (1L << 61))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (72 - 72)) | (1L << (77 - 72)) | (1L << (83 - 72)) | (1L << (93 - 72)))) != 0)) ) {
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
			setState(580);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 11) | (1L << 31) | (1L << 32))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (77 - 64)) | (1L << (80 - 64)) | (1L << (89 - 64)))) != 0)) ) {
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
		enterRule(_localctx, 106, RULE_qualBoolOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582); match(ID);
			setState(583); match(74);
			setState(584); boolOp();
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
		enterRule(_localctx, 108, RULE_qualArithOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586); match(ID);
			setState(587); match(74);
			setState(588); arithOp();
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
		enterRule(_localctx, 110, RULE_boolComplexExpr);
		try {
			setState(605);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(590); boolExpr(0);
				setState(593);
				switch (_input.LA(1)) {
				case 6:
				case 11:
				case 23:
				case 47:
				case 61:
				case 72:
				case 77:
				case 83:
				case 93:
					{
					setState(591); boolOp();
					}
					break;
				case ID:
					{
					setState(592); qualBoolOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(595); boolExpr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597); arithExpr(0);
				setState(600);
				switch (_input.LA(1)) {
				case 6:
				case 11:
				case 31:
				case 32:
				case 64:
				case 77:
				case 80:
				case 89:
					{
					setState(598); arithOp();
					}
					break;
				case ID:
					{
					setState(599); qualArithOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(602); arithExpr(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(604); notExpr();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public QualBoolOpContext qualBoolOp() {
			return getRuleContext(QualBoolOpContext.class,0);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(608); arithExpr(0);
				setState(611);
				switch (_input.LA(1)) {
				case 6:
				case 11:
				case 31:
				case 32:
				case 64:
				case 77:
				case 80:
				case 89:
					{
					setState(609); arithOp();
					}
					break;
				case ID:
					{
					setState(610); qualArithOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(613); expr(0);
				}
				break;

			case 2:
				{
				setState(615); notExpr();
				}
				break;

			case 3:
				{
				setState(616); boolVal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
					setState(619);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(622);
					switch (_input.LA(1)) {
					case 6:
					case 11:
					case 23:
					case 47:
					case 61:
					case 72:
					case 77:
					case 83:
					case 93:
						{
						setState(620); boolOp();
						}
						break;
					case ID:
						{
						setState(621); qualBoolOp();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(624); boolExpr(5);
					}
					} 
				}
				setState(630);
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
		public FunctionExprContext functionExpr() {
			return getRuleContext(FunctionExprContext.class,0);
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
		enterRule(_localctx, 114, RULE_operand);
		try {
			setState(643);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(631); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(632); integer();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(633); real();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(634); arrayaccess();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(635); ifExpr();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(636); letExpr();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(637); match(17);
				setState(638); arithExpr(0);
				setState(639); match(92);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(641); predOrUnionExpr();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(642); functionExpr();
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
		enterRule(_localctx, 116, RULE_arithComplexExpr);
		int _la;
		try {
			setState(650);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(645); minusExpr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(646); arithExpr(0);
				setState(647);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 30) | (1L << 45) | (1L << 48))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (68 - 68)) | (1L << (87 - 68)) | (1L << (96 - 68)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(648); arithExpr(0);
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
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_arithExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(653); minusExpr();
				}
				break;

			case 2:
				{
				setState(654); operand();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(662);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithExpr);
					setState(657);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(658);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 30) | (1L << 45) | (1L << 48))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (68 - 68)) | (1L << (87 - 68)) | (1L << (96 - 68)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(659); arithExpr(3);
					}
					} 
				}
				setState(664);
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
		enterRule(_localctx, 120, RULE_notExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665); match(94);
			setState(666); expr(0);
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
		enterRule(_localctx, 122, RULE_minusExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668); match(96);
			setState(669); arithExpr(0);
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
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 124, RULE_predOrUnionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671); match(ID);
			setState(683);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(672); match(17);
				setState(673); expr(0);
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(674); match(19);
					setState(675); expr(0);
					}
					}
					setState(680);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(681); match(92);
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
		enterRule(_localctx, 126, RULE_rbracketExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685); match(17);
			setState(686); expr(0);
			setState(687); match(92);
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
		enterRule(_localctx, 128, RULE_idexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689); match(ID);
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
		enterRule(_localctx, 130, RULE_stringExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691); match(66);
			setState(692); string();
			setState(693); match(66);
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
		enterRule(_localctx, 132, RULE_infixOp);
		try {
			setState(699);
			switch (_input.LA(1)) {
			case 63:
				enterOuterAlt(_localctx, 1);
				{
				setState(695); match(63);
				setState(696); match(ID);
				setState(697); match(63);
				}
				break;
			case 16:
			case 89:
			case 90:
				enterOuterAlt(_localctx, 2);
				{
				setState(698); infixSetOp();
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
		enterRule(_localctx, 134, RULE_infixSetOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_la = _input.LA(1);
			if ( !(_la==16 || _la==89 || _la==90) ) {
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 136, RULE_arrayaccess);
		int _la;
		try {
			setState(738);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(703); match(ID);
				setState(704); match(75);
				setState(705); expr(0);
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(706); match(19);
					setState(707); expr(0);
					}
					}
					setState(712);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(713); match(34);
				}
				break;
			case 75:
				enterOuterAlt(_localctx, 2);
				{
				setState(715); match(75);
				setState(724);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(716); expr(0);
					setState(721);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==19) {
						{
						{
						setState(717); match(19);
						setState(718); expr(0);
						}
						}
						setState(723);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(726); match(34);
				setState(727); match(75);
				setState(728); expr(0);
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(729); match(19);
					setState(730); expr(0);
					}
					}
					setState(735);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(736); match(34);
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
		enterRule(_localctx, 138, RULE_caseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740); match(71);
			setState(741); match(ID);
			setState(742); match(50);
			setState(746); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(743); caseBranch();
				setState(744); match(54);
				}
				}
				setState(748); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(750); match(29);
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
		enterRule(_localctx, 140, RULE_caseBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752); predOrUnionExpr();
			setState(753); match(40);
			setState(754); expr(0);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListValueContext listValue() {
			return getRuleContext(ListValueContext.class,0);
		}
		public OneDimListContext oneDimList() {
			return getRuleContext(OneDimListContext.class,0);
		}
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
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
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_listExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(757); listValue();
				}
				break;

			case 2:
				{
				setState(758); oneDimList();
				}
				break;

			case 3:
				{
				setState(759); multiDimList();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(767);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_listExpr);
					setState(762);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(763); match(33);
					setState(764); expr(0);
					}
					} 
				}
				setState(769);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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
		enterRule(_localctx, 144, RULE_oneDimList);
		try {
			setState(772);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(770); simpleList();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(771); guardedList();
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 146, RULE_simpleList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(774); match(75);
			setState(783);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(775); expr(0);
				setState(780);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(776); match(19);
						setState(777); expr(0);
						}
						} 
					}
					setState(782);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;
			}
			setState(786);
			_la = _input.LA(1);
			if (_la==19) {
				{
				setState(785); match(19);
				}
			}

			setState(788); match(34);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InDeclContext inDecl(int i) {
			return getRuleContext(InDeclContext.class,i);
		}
		public List<InDeclContext> inDecl() {
			return getRuleContexts(InDeclContext.class);
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
		enterRule(_localctx, 148, RULE_guardedList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790); match(75);
			setState(799);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(791); expr(0);
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(792); match(19);
					setState(793); expr(0);
					}
					}
					setState(798);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(801); match(76);
			setState(802); inDecl();
			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(803); match(19);
				setState(804); inDecl();
				}
				}
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(810); match(34);
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
		enterRule(_localctx, 150, RULE_multiDimList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(812); match(65);
			setState(821);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(813); expr(0);
				setState(818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(814); match(19);
						setState(815); expr(0);
						}
						} 
					}
					setState(820);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				}
				break;
			}
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19 || _la==76) {
				{
				{
				setState(824);
				_la = _input.LA(1);
				if (_la==19) {
					{
					setState(823); match(19);
					}
				}

				setState(826); match(76);
				setState(827); expr(0);
				setState(832);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(828); match(19);
						setState(829); expr(0);
						}
						} 
					}
					setState(834);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				}
				}
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(840); match(37);
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
		public FunctionExprContext functionExpr() {
			return getRuleContext(FunctionExprContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public ArrayaccessContext arrayaccess() {
			return getRuleContext(ArrayaccessContext.class,0);
		}
		public ShowExprContext showExpr() {
			return getRuleContext(ShowExprContext.class,0);
		}
		public InDeclContext inDecl() {
			return getRuleContext(InDeclContext.class,0);
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
		enterRule(_localctx, 152, RULE_listValue);
		try {
			setState(849);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(842); stringExpr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(843); match(ID);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(844); ifExpr();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(845); arrayaccess();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(846); showExpr();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(847); inDecl();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(848); functionExpr();
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

	public static class ShowExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ShowExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterShowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitShowExpr(this);
		}
	}

	public final ShowExprContext showExpr() throws RecognitionException {
		ShowExprContext _localctx = new ShowExprContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_showExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851); match(78);
			setState(852); match(17);
			setState(853); expr(0);
			setState(854); match(92);
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

	public static class FunctionExprContext extends ParserRuleContext {
		public GuardExprContext guardExpr() {
			return getRuleContext(GuardExprContext.class,0);
		}
		public FunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitFunctionExpr(this);
		}
	}

	public final FunctionExprContext functionExpr() throws RecognitionException {
		FunctionExprContext _localctx = new FunctionExprContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_functionExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856); guardExpr();
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

	public static class GuardExprContext extends ParserRuleContext {
		public AlldifferentContext alldifferent() {
			return getRuleContext(AlldifferentContext.class,0);
		}
		public MinContext min() {
			return getRuleContext(MinContext.class,0);
		}
		public Array1dContext array1d() {
			return getRuleContext(Array1dContext.class,0);
		}
		public ProdContext prod() {
			return getRuleContext(ProdContext.class,0);
		}
		public ForallContext forall() {
			return getRuleContext(ForallContext.class,0);
		}
		public MaxContext max() {
			return getRuleContext(MaxContext.class,0);
		}
		public Bool2intContext bool2int() {
			return getRuleContext(Bool2intContext.class,0);
		}
		public ExistsContext exists() {
			return getRuleContext(ExistsContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public GuardExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterGuardExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitGuardExpr(this);
		}
	}

	public final GuardExprContext guardExpr() throws RecognitionException {
		GuardExprContext _localctx = new GuardExprContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_guardExpr);
		try {
			setState(867);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(858); forall();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(859); exists();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(860); sum();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(861); prod();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(862); max();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(863); min();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(864); bool2int();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(865); alldifferent();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(866); array1d();
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

	public static class ForallContext extends ParserRuleContext {
		public GuardExprArgContext guardExprArg() {
			return getRuleContext(GuardExprArgContext.class,0);
		}
		public ForallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterForall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitForall(this);
		}
	}

	public final ForallContext forall() throws RecognitionException {
		ForallContext _localctx = new ForallContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_forall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869); match(81);
			setState(870); guardExprArg();
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

	public static class ExistsContext extends ParserRuleContext {
		public GuardExprArgContext guardExprArg() {
			return getRuleContext(GuardExprArgContext.class,0);
		}
		public ExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitExists(this);
		}
	}

	public final ExistsContext exists() throws RecognitionException {
		ExistsContext _localctx = new ExistsContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_exists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872); match(69);
			setState(873); guardExprArg();
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

	public static class SumContext extends ParserRuleContext {
		public GuardExprArgContext guardExprArg() {
			return getRuleContext(GuardExprArgContext.class,0);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitSum(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_sum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875); match(52);
			setState(876); guardExprArg();
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

	public static class ProdContext extends ParserRuleContext {
		public GuardExprArgContext guardExprArg() {
			return getRuleContext(GuardExprArgContext.class,0);
		}
		public ProdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterProd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitProd(this);
		}
	}

	public final ProdContext prod() throws RecognitionException {
		ProdContext _localctx = new ProdContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_prod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878); match(91);
			setState(879); guardExprArg();
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

	public static class MaxContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public GuardExprArgContext guardExprArg() {
			return getRuleContext(GuardExprArgContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitMax(this);
		}
	}

	public final MaxContext max() throws RecognitionException {
		MaxContext _localctx = new MaxContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_max);
		try {
			setState(890);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(881); match(55);
				setState(882); guardExprArg();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(883); match(55);
				setState(884); match(17);
				setState(885); expr(0);
				setState(886); match(19);
				setState(887); expr(0);
				setState(888); match(92);
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

	public static class MinContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public GuardExprArgContext guardExprArg() {
			return getRuleContext(GuardExprArgContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitMin(this);
		}
	}

	public final MinContext min() throws RecognitionException {
		MinContext _localctx = new MinContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_min);
		try {
			setState(901);
			switch (_input.LA(1)) {
			case 18:
				enterOuterAlt(_localctx, 1);
				{
				setState(892); match(18);
				setState(893); guardExprArg();
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 2);
				{
				setState(894); match(55);
				setState(895); match(17);
				setState(896); expr(0);
				setState(897); match(19);
				setState(898); expr(0);
				setState(899); match(92);
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

	public static class Bool2intContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bool2intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool2int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterBool2int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitBool2int(this);
		}
	}

	public final Bool2intContext bool2int() throws RecognitionException {
		Bool2intContext _localctx = new Bool2intContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_bool2int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903); match(35);
			setState(904); match(17);
			setState(905); expr(0);
			setState(906); match(92);
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

	public static class AlldifferentContext extends ParserRuleContext {
		public GuardExprArgContext guardExprArg() {
			return getRuleContext(GuardExprArgContext.class,0);
		}
		public AlldifferentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alldifferent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterAlldifferent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitAlldifferent(this);
		}
	}

	public final AlldifferentContext alldifferent() throws RecognitionException {
		AlldifferentContext _localctx = new AlldifferentContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_alldifferent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908); match(41);
			setState(909); guardExprArg();
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

	public static class Array1dContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Array1dContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array1d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterArray1d(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitArray1d(this);
		}
	}

	public final Array1dContext array1d() throws RecognitionException {
		Array1dContext _localctx = new Array1dContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_array1d);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911); match(49);
			setState(912); match(17);
			setState(913); expr(0);
			setState(914); match(19);
			setState(915); expr(0);
			setState(916); match(92);
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

	public static class GuardExprArgContext extends ParserRuleContext {
		public TwoSectionsContext twoSections() {
			return getRuleContext(TwoSectionsContext.class,0);
		}
		public OneSectionContext oneSection() {
			return getRuleContext(OneSectionContext.class,0);
		}
		public GuardExprArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardExprArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterGuardExprArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitGuardExprArg(this);
		}
	}

	public final GuardExprArgContext guardExprArg() throws RecognitionException {
		GuardExprArgContext _localctx = new GuardExprArgContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_guardExprArg);
		try {
			setState(920);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(918); twoSections();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(919); oneSection();
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

	public static class OneSectionContext extends ParserRuleContext {
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public OneSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterOneSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitOneSection(this);
		}
	}

	public final OneSectionContext oneSection() throws RecognitionException {
		OneSectionContext _localctx = new OneSectionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_oneSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922); match(17);
			setState(923); listExpr(0);
			setState(924); match(92);
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

	public static class TwoSectionsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InDeclContext inDecl(int i) {
			return getRuleContext(InDeclContext.class,i);
		}
		public List<InDeclContext> inDecl() {
			return getRuleContexts(InDeclContext.class);
		}
		public TwoSectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoSections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterTwoSections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitTwoSections(this);
		}
	}

	public final TwoSectionsContext twoSections() throws RecognitionException {
		TwoSectionsContext _localctx = new TwoSectionsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_twoSections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926); match(17);
			setState(927); inDecl();
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(928); match(19);
				setState(929); inDecl();
				}
				}
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(935); match(92);
			setState(936); match(17);
			setState(937); expr(0);
			setState(938); match(92);
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
		enterRule(_localctx, 184, RULE_inDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940); match(ID);
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(941); match(19);
				setState(942); match(ID);
				}
				}
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(948); match(89);
			setState(949); setExpr(0);
			setState(951);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(950); whereCond();
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

	public static class WhereCondContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 186, RULE_whereCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953); match(84);
			setState(954); expr(0);
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
		enterRule(_localctx, 188, RULE_letExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956); match(39);
			setState(957); match(8);
			setState(958); letDecl();
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(959); match(19);
				setState(960); letDecl();
				}
				}
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(966); match(58);
			setState(967); match(89);
			setState(968); expr(0);
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
		enterRule(_localctx, 190, RULE_letDecl);
		try {
			setState(972);
			switch (_input.LA(1)) {
			case 5:
			case 7:
			case 13:
			case 17:
			case 18:
			case 24:
			case 35:
			case 39:
			case 41:
			case 46:
			case 49:
			case 52:
			case 55:
			case 59:
			case 69:
			case 73:
			case 75:
			case 79:
			case 81:
			case 91:
			case 96:
			case ID:
			case NAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(970); decl();
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 2);
				{
				setState(971); constraint();
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
		enterRule(_localctx, 192, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974); match(59);
			setState(975); bodyIf();
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
		enterRule(_localctx, 194, RULE_bodyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977); expr(0);
			setState(978); match(44);
			setState(979); expr(0);
			setState(982);
			switch (_input.LA(1)) {
			case 88:
				{
				setState(980); elseS();
				}
				break;
			case 51:
				{
				setState(981); elseifS();
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
		enterRule(_localctx, 196, RULE_elseS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984); match(88);
			setState(985); expr(0);
			setState(986); match(1);
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
		enterRule(_localctx, 198, RULE_elseifS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988); match(51);
			setState(989); bodyIf();
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
		enterRule(_localctx, 200, RULE_setVal);
		try {
			setState(994);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(991); bracketExpr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(992); range();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(993); guardedSet();
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

	public static class ComplexSetExprContext extends ParserRuleContext {
		public InfixSetOpContext infixSetOp() {
			return getRuleContext(InfixSetOpContext.class,0);
		}
		public List<SetExprContext> setExpr() {
			return getRuleContexts(SetExprContext.class);
		}
		public SetExprContext setExpr(int i) {
			return getRuleContext(SetExprContext.class,i);
		}
		public ComplexSetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexSetExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterComplexSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitComplexSetExpr(this);
		}
	}

	public final ComplexSetExprContext complexSetExpr() throws RecognitionException {
		ComplexSetExprContext _localctx = new ComplexSetExprContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_complexSetExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996); setExpr(0);
			setState(997); infixSetOp();
			setState(998); setExpr(0);
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
		int _startState = 204;
		enterRecursionRule(_localctx, 204, RULE_setExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1001); setVal();
			}
			_ctx.stop = _input.LT(-1);
			setState(1009);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_setExpr);
					setState(1003);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1004); infixSetOp();
					setState(1005); setExpr(2);
					}
					} 
				}
				setState(1011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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
		enterRule(_localctx, 206, RULE_bracketExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012); match(8);
			setState(1013); commaList();
			setState(1014); match(58);
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
		public CommaListContext commaList() {
			return getRuleContext(CommaListContext.class,0);
		}
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
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
		enterRule(_localctx, 208, RULE_guardedSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016); match(8);
			setState(1017); commaList();
			setState(1018); match(76);
			setState(1019); guard();
			setState(1020); match(58);
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
		enterRule(_localctx, 210, RULE_commaList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(1022); expr(0);
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(1023); match(19);
					setState(1024); expr(0);
					}
					}
					setState(1029);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		enterRule(_localctx, 212, RULE_guard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032); inDecl();
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(1033); match(19);
				setState(1034); inDecl();
				}
				}
				setState(1039);
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
		enterRule(_localctx, 214, RULE_range);
		try {
			setState(1045);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1040); fromR();
				setState(1041); match(9);
				setState(1042); toR();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044); match(ID);
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
		enterRule(_localctx, 216, RULE_fromR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047); arithExpr(0);
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
		enterRule(_localctx, 218, RULE_toR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049); arithExpr(0);
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
		enterRule(_localctx, 220, RULE_rint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051); match(13);
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
		enterRule(_localctx, 222, RULE_rfloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053); match(7);
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
		enterRule(_localctx, 224, RULE_rbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055); match(79);
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
		enterRule(_localctx, 226, RULE_integer);
		try {
			setState(1060);
			switch (_input.LA(1)) {
			case NAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1057); match(NAT);
				}
				break;
			case 96:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058); match(96);
				setState(1059); match(NAT);
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
		enterRule(_localctx, 228, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062); integer();
			setState(1063); match(70);
			setState(1064); match(NAT);
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
		enterRule(_localctx, 230, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 48) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 53) | (1L << 54) | (1L << 55) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 61) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (67 - 64)) | (1L << (68 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (71 - 64)) | (1L << (72 - 64)) | (1L << (73 - 64)) | (1L << (74 - 64)) | (1L << (75 - 64)) | (1L << (76 - 64)) | (1L << (77 - 64)) | (1L << (78 - 64)) | (1L << (79 - 64)) | (1L << (80 - 64)) | (1L << (81 - 64)) | (1L << (82 - 64)) | (1L << (83 - 64)) | (1L << (84 - 64)) | (1L << (85 - 64)) | (1L << (86 - 64)) | (1L << (87 - 64)) | (1L << (88 - 64)) | (1L << (89 - 64)) | (1L << (90 - 64)) | (1L << (91 - 64)) | (1L << (92 - 64)) | (1L << (93 - 64)) | (1L << (94 - 64)) | (1L << (95 - 64)) | (1L << (96 - 64)) | (1L << (ESC - 64)) | (1L << (SINGLE_LINE_COMMENT - 64)) | (1L << (ID - 64)) | (1L << (NAT - 64)) | (1L << (WS - 64)) | (1L << (BOOL - 64)))) != 0)) {
				{
				{
				setState(1071);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(1066);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==66) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;

				case 2:
					{
					setState(1067); match(ESC);
					}
					break;

				case 3:
					{
					setState(1068); match(70);
					}
					break;

				case 4:
					{
					setState(1069); match(12);
					}
					break;

				case 5:
					{
					setState(1070); match(38);
					}
					break;
				}
				}
				}
				setState(1077);
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

		case 56: return boolExpr_sempred((BoolExprContext)_localctx, predIndex);

		case 59: return arithExpr_sempred((ArithExprContext)_localctx, predIndex);

		case 71: return listExpr_sempred((ListExprContext)_localctx, predIndex);

		case 102: return setExpr_sempred((SetExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 12);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3h\u0439\4\2\t\2\4"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\3\2\3\2"+
		"\3\2\6\2\u00ee\n\2\r\2\16\2\u00ef\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\u00fc\n\3\3\4\3\4\5\4\u0100\n\4\3\5\3\5\5\5\u0104\n\5\3\5\3\5"+
		"\5\5\u0108\n\5\3\6\3\6\5\6\u010c\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0115"+
		"\n\7\f\7\16\7\u0118\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0122\n\b"+
		"\3\b\3\b\3\b\5\b\u0127\n\b\3\t\3\t\3\t\3\t\7\t\u012d\n\t\f\t\16\t\u0130"+
		"\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u0147\n\16\3\17\3\17\5\17\u014b\n\17"+
		"\3\17\3\17\5\17\u014f\n\17\3\20\5\20\u0152\n\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u0159\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u0168\n\23\f\23\16\23\u016b\13\23\5\23\u016d\n\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u0175\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u017c\n\24\f\24\16\24\u017f\13\24\5\24\u0181\n\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\5\25\u018b\n\25\3\26\3\26\3\27\3\27\5\27\u0191"+
		"\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\5\33\u01a0\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\5\37\u01ad\n\37\3\37\3\37\3\37\3\37\7\37\u01b3\n\37\f\37\16\37\u01b6"+
		"\13\37\3\37\3\37\5\37\u01ba\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\5#\u01cc\n#\3$\3$\3%\3%\3%\3%\3%\7%\u01d5\n%\f%\16%\u01d8"+
		"\13%\3%\3%\3&\3&\3&\3&\3&\5&\u01e1\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+"+
		"\3,\3,\3,\3,\3,\3,\3,\5,\u01f4\n,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/"+
		"\3/\3/\3\60\3\60\3\60\3\60\7\60\u0208\n\60\f\60\16\60\u020b\13\60\3\60"+
		"\5\60\u020e\n\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u0228\n\62\3\62\3\62\3\62\3\62\7\62\u022e\n\62\f\62\16\62\u0231\13\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u023f"+
		"\n\63\3\64\3\64\5\64\u0243\n\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\39\39\39\59\u0254\n9\39\39\39\39\39\59\u025b\n9\39\39\39"+
		"\59\u0260\n9\3:\3:\3:\3:\5:\u0266\n:\3:\3:\3:\3:\5:\u026c\n:\3:\3:\3:"+
		"\5:\u0271\n:\3:\3:\7:\u0275\n:\f:\16:\u0278\13:\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\5;\u0286\n;\3<\3<\3<\3<\3<\5<\u028d\n<\3=\3=\3=\5=\u0292"+
		"\n=\3=\3=\3=\7=\u0297\n=\f=\16=\u029a\13=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3"+
		"@\3@\7@\u02a7\n@\f@\16@\u02aa\13@\3@\3@\5@\u02ae\n@\3A\3A\3A\3A\3B\3B"+
		"\3C\3C\3C\3C\3D\3D\3D\3D\5D\u02be\nD\3E\3E\3F\3F\3F\3F\3F\7F\u02c7\nF"+
		"\fF\16F\u02ca\13F\3F\3F\3F\3F\3F\3F\7F\u02d2\nF\fF\16F\u02d5\13F\5F\u02d7"+
		"\nF\3F\3F\3F\3F\3F\7F\u02de\nF\fF\16F\u02e1\13F\3F\3F\5F\u02e5\nF\3G\3"+
		"G\3G\3G\3G\3G\6G\u02ed\nG\rG\16G\u02ee\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\5"+
		"I\u02fb\nI\3I\3I\3I\7I\u0300\nI\fI\16I\u0303\13I\3J\3J\5J\u0307\nJ\3K"+
		"\3K\3K\3K\7K\u030d\nK\fK\16K\u0310\13K\5K\u0312\nK\3K\5K\u0315\nK\3K\3"+
		"K\3L\3L\3L\3L\7L\u031d\nL\fL\16L\u0320\13L\5L\u0322\nL\3L\3L\3L\3L\7L"+
		"\u0328\nL\fL\16L\u032b\13L\3L\3L\3M\3M\3M\3M\7M\u0333\nM\fM\16M\u0336"+
		"\13M\5M\u0338\nM\3M\5M\u033b\nM\3M\3M\3M\3M\7M\u0341\nM\fM\16M\u0344\13"+
		"M\7M\u0346\nM\fM\16M\u0349\13M\3M\3M\3N\3N\3N\3N\3N\3N\3N\5N\u0354\nN"+
		"\3O\3O\3O\3O\3O\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0366\nQ\3R\3R\3R"+
		"\3S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u037d\nV\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\5W\u0388\nW\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\3[\3[\5[\u039b\n[\3\\\3\\\3\\\3\\\3]\3]\3]\3]\7]\u03a5\n"+
		"]\f]\16]\u03a8\13]\3]\3]\3]\3]\3]\3^\3^\3^\7^\u03b2\n^\f^\16^\u03b5\13"+
		"^\3^\3^\3^\5^\u03ba\n^\3_\3_\3_\3`\3`\3`\3`\3`\7`\u03c4\n`\f`\16`\u03c7"+
		"\13`\3`\3`\3`\3`\3a\3a\5a\u03cf\na\3b\3b\3b\3c\3c\3c\3c\3c\5c\u03d9\n"+
		"c\3d\3d\3d\3d\3e\3e\3e\3f\3f\3f\5f\u03e5\nf\3g\3g\3g\3g\3h\3h\3h\3h\3"+
		"h\3h\3h\7h\u03f2\nh\fh\16h\u03f5\13h\3i\3i\3i\3i\3j\3j\3j\3j\3j\3j\3k"+
		"\3k\3k\7k\u0404\nk\fk\16k\u0407\13k\5k\u0409\nk\3l\3l\3l\7l\u040e\nl\f"+
		"l\16l\u0411\13l\3m\3m\3m\3m\3m\5m\u0418\nm\3n\3n\3o\3o\3p\3p\3q\3q\3r"+
		"\3r\3s\3s\3s\5s\u0427\ns\3t\3t\3t\3t\3u\3u\3u\3u\3u\5u\u0432\nu\7u\u0434"+
		"\nu\fu\16u\u0437\13u\3u\2\7brx\u0090\u00cev\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\2\t\5\2\33\33\35\35aa\7\2\30\30\34\34&"+
		"&\67\67XX\13\2\b\b\r\r\31\31\61\61??JJOOUU__\t\2\b\b\r\r!\"BBOORR[[\b"+
		"\2  //\62\62FFYYbb\4\2\22\22[\\\3\2DD\u0460\2\u00ed\3\2\2\2\4\u00fb\3"+
		"\2\2\2\6\u00ff\3\2\2\2\b\u0103\3\2\2\2\n\u010b\3\2\2\2\f\u010d\3\2\2\2"+
		"\16\u011b\3\2\2\2\20\u0128\3\2\2\2\22\u0133\3\2\2\2\24\u0135\3\2\2\2\26"+
		"\u0137\3\2\2\2\30\u013a\3\2\2\2\32\u0146\3\2\2\2\34\u0148\3\2\2\2\36\u0151"+
		"\3\2\2\2 \u015a\3\2\2\2\"\u015d\3\2\2\2$\u0161\3\2\2\2&\u0172\3\2\2\2"+
		"(\u018a\3\2\2\2*\u018c\3\2\2\2,\u0190\3\2\2\2.\u0192\3\2\2\2\60\u0195"+
		"\3\2\2\2\62\u0198\3\2\2\2\64\u019f\3\2\2\2\66\u01a1\3\2\2\28\u01a4\3\2"+
		"\2\2:\u01a7\3\2\2\2<\u01aa\3\2\2\2>\u01bb\3\2\2\2@\u01c5\3\2\2\2B\u01c7"+
		"\3\2\2\2D\u01cb\3\2\2\2F\u01cd\3\2\2\2H\u01cf\3\2\2\2J\u01e0\3\2\2\2L"+
		"\u01e2\3\2\2\2N\u01e4\3\2\2\2P\u01e6\3\2\2\2R\u01e8\3\2\2\2T\u01ea\3\2"+
		"\2\2V\u01f3\3\2\2\2X\u01f5\3\2\2\2Z\u01f9\3\2\2\2\\\u01fe\3\2\2\2^\u0203"+
		"\3\2\2\2`\u0211\3\2\2\2b\u0227\3\2\2\2d\u023e\3\2\2\2f\u0242\3\2\2\2h"+
		"\u0244\3\2\2\2j\u0246\3\2\2\2l\u0248\3\2\2\2n\u024c\3\2\2\2p\u025f\3\2"+
		"\2\2r\u026b\3\2\2\2t\u0285\3\2\2\2v\u028c\3\2\2\2x\u0291\3\2\2\2z\u029b"+
		"\3\2\2\2|\u029e\3\2\2\2~\u02a1\3\2\2\2\u0080\u02af\3\2\2\2\u0082\u02b3"+
		"\3\2\2\2\u0084\u02b5\3\2\2\2\u0086\u02bd\3\2\2\2\u0088\u02bf\3\2\2\2\u008a"+
		"\u02e4\3\2\2\2\u008c\u02e6\3\2\2\2\u008e\u02f2\3\2\2\2\u0090\u02fa\3\2"+
		"\2\2\u0092\u0306\3\2\2\2\u0094\u0308\3\2\2\2\u0096\u0318\3\2\2\2\u0098"+
		"\u032e\3\2\2\2\u009a\u0353\3\2\2\2\u009c\u0355\3\2\2\2\u009e\u035a\3\2"+
		"\2\2\u00a0\u0365\3\2\2\2\u00a2\u0367\3\2\2\2\u00a4\u036a\3\2\2\2\u00a6"+
		"\u036d\3\2\2\2\u00a8\u0370\3\2\2\2\u00aa\u037c\3\2\2\2\u00ac\u0387\3\2"+
		"\2\2\u00ae\u0389\3\2\2\2\u00b0\u038e\3\2\2\2\u00b2\u0391\3\2\2\2\u00b4"+
		"\u039a\3\2\2\2\u00b6\u039c\3\2\2\2\u00b8\u03a0\3\2\2\2\u00ba\u03ae\3\2"+
		"\2\2\u00bc\u03bb\3\2\2\2\u00be\u03be\3\2\2\2\u00c0\u03ce\3\2\2\2\u00c2"+
		"\u03d0\3\2\2\2\u00c4\u03d3\3\2\2\2\u00c6\u03da\3\2\2\2\u00c8\u03de\3\2"+
		"\2\2\u00ca\u03e4\3\2\2\2\u00cc\u03e6\3\2\2\2\u00ce\u03ea\3\2\2\2\u00d0"+
		"\u03f6\3\2\2\2\u00d2\u03fa\3\2\2\2\u00d4\u0408\3\2\2\2\u00d6\u040a\3\2"+
		"\2\2\u00d8\u0417\3\2\2\2\u00da\u0419\3\2\2\2\u00dc\u041b\3\2\2\2\u00de"+
		"\u041d\3\2\2\2\u00e0\u041f\3\2\2\2\u00e2\u0421\3\2\2\2\u00e4\u0426\3\2"+
		"\2\2\u00e6\u0428\3\2\2\2\u00e8\u0435\3\2\2\2\u00ea\u00eb\5\4\3\2\u00eb"+
		"\u00ec\78\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\3\3\2\2\2\u00f1\u00fc"+
		"\5\f\7\2\u00f2\u00fc\5\16\b\2\u00f3\u00fc\5\26\f\2\u00f4\u00fc\5\6\4\2"+
		"\u00f5\u00fc\5\34\17\2\u00f6\u00fc\5\32\16\2\u00f7\u00fc\5$\23\2\u00f8"+
		"\u00fc\5&\24\2\u00f9\u00fc\5 \21\2\u00fa\u00fc\5\"\22\2\u00fb\u00f1\3"+
		"\2\2\2\u00fb\u00f2\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb\u00f4\3\2\2\2\u00fb"+
		"\u00f5\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f8\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\5\3\2\2\2\u00fd\u0100"+
		"\5\b\5\2\u00fe\u0100\5\n\6\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\7\3\2\2\2\u0101\u0104\5\30\r\2\u0102\u0104\5Z.\2\u0103\u0101\3\2\2\2"+
		"\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0106\7\r\2\2\u0106\u0108"+
		"\5b\62\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\t\3\2\2\2\u0109"+
		"\u010c\5\36\20\2\u010a\u010c\5\\/\2\u010b\u0109\3\2\2\2\u010b\u010a\3"+
		"\2\2\2\u010c\13\3\2\2\2\u010d\u010e\7@\2\2\u010e\u010f\7e\2\2\u010f\u0110"+
		"\7\r\2\2\u0110\u0111\7\n\2\2\u0111\u0116\5D#\2\u0112\u0113\7\25\2\2\u0113"+
		"\u0115\5D#\2\u0114\u0112\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2"+
		"\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a"+
		"\7<\2\2\u011a\r\3\2\2\2\u011b\u011c\7\26\2\2\u011c\u011d\7e\2\2\u011d"+
		"\u0121\7\r\2\2\u011e\u011f\5\22\n\2\u011f\u0120\7#\2\2\u0120\u0122\3\2"+
		"\2\2\u0121\u011e\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0126\5V,\2\u0124\u0125\7#\2\2\u0125\u0127\5\24\13\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\17\3\2\2\2\u0128\u0129\7M\2\2\u0129\u012e"+
		"\7e\2\2\u012a\u012b\7\25\2\2\u012b\u012d\7e\2\2\u012c\u012a\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7$\2\2\u0132\21\3\2\2\2\u0133\u0134"+
		"\5\20\t\2\u0134\23\3\2\2\2\u0135\u0136\5\20\t\2\u0136\25\3\2\2\2\u0137"+
		"\u0138\7E\2\2\u0138\u0139\5b\62\2\u0139\27\3\2\2\2\u013a\u013b\7\32\2"+
		"\2\u013b\u013c\5V,\2\u013c\u013d\7L\2\2\u013d\u013e\7e\2\2\u013e\31\3"+
		"\2\2\2\u013f\u0140\7\27\2\2\u0140\u0141\7\23\2\2\u0141\u0142\5\u0090I"+
		"\2\u0142\u0143\7^\2\2\u0143\u0147\3\2\2\2\u0144\u0145\7\27\2\2\u0145\u0147"+
		"\5\u0090I\2\u0146\u013f\3\2\2\2\u0146\u0144\3\2\2\2\u0147\33\3\2\2\2\u0148"+
		"\u014a\7>\2\2\u0149\u014b\5\62\32\2\u014a\u0149\3\2\2\2\u014a\u014b\3"+
		"\2\2\2\u014b\u014e\3\2\2\2\u014c\u014f\5*\26\2\u014d\u014f\5,\27\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\35\3\2\2\2\u0150\u0152\7K\2\2"+
		"\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154"+
		"\5V,\2\u0154\u0155\7L\2\2\u0155\u0158\7e\2\2\u0156\u0157\7\r\2\2\u0157"+
		"\u0159\5b\62\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\37\3\2\2"+
		"\2\u015a\u015b\7\21\2\2\u015b\u015c\5\u0084C\2\u015c!\3\2\2\2\u015d\u015e"+
		"\7e\2\2\u015e\u015f\7\r\2\2\u015f\u0160\5b\62\2\u0160#\3\2\2\2\u0161\u0162"+
		"\7:\2\2\u0162\u0163\7e\2\2\u0163\u016c\7\23\2\2\u0164\u0169\5\6\4\2\u0165"+
		"\u0166\7\25\2\2\u0166\u0168\5\6\4\2\u0167\u0165\3\2\2\2\u0168\u016b\3"+
		"\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016c\u0164\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u016f\7^\2\2\u016f\u0170\7\r\2\2\u0170\u0171\5b\62\2\u0171"+
		"%\3\2\2\2\u0172\u0174\7,\2\2\u0173\u0175\7\32\2\2\u0174\u0173\3\2\2\2"+
		"\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\5(\25\2\u0177\u0180"+
		"\7\23\2\2\u0178\u017d\5\6\4\2\u0179\u017a\7\25\2\2\u017a\u017c\5\6\4\2"+
		"\u017b\u0179\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0178\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\7^\2\2\u0183\u0184\7\r"+
		"\2\2\u0184\u0185\5b\62\2\u0185\'\3\2\2\2\u0186\u018b\7e\2\2\u0187\u0188"+
		"\7e\2\2\u0188\u0189\7L\2\2\u0189\u018b\5f\64\2\u018a\u0186\3\2\2\2\u018a"+
		"\u0187\3\2\2\2\u018b)\3\2\2\2\u018c\u018d\7W\2\2\u018d+\3\2\2\2\u018e"+
		"\u0191\5.\30\2\u018f\u0191\5\60\31\2\u0190\u018e\3\2\2\2\u0190\u018f\3"+
		"\2\2\2\u0191-\3\2\2\2\u0192\u0193\7\4\2\2\u0193\u0194\5b\62\2\u0194/\3"+
		"\2\2\2\u0195\u0196\7\6\2\2\u0196\u0197\5b\62\2\u0197\61\3\2\2\2\u0198"+
		"\u0199\7\f\2\2\u0199\u019a\5\64\33\2\u019a\63\3\2\2\2\u019b\u01a0\5\66"+
		"\34\2\u019c\u01a0\58\35\2\u019d\u01a0\5:\36\2\u019e\u01a0\5<\37\2\u019f"+
		"\u019b\3\2\2\2\u019f\u019c\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u019e\3\2"+
		"\2\2\u01a0\65\3\2\2\2\u01a1\u01a2\7\5\2\2\u01a2\u01a3\5> \2\u01a3\67\3"+
		"\2\2\2\u01a4\u01a5\7\20\2\2\u01a5\u01a6\5> \2\u01a69\3\2\2\2\u01a7\u01a8"+
		"\7;\2\2\u01a8\u01a9\5> \2\u01a9;\3\2\2\2\u01aa\u01ac\7-\2\2\u01ab\u01ad"+
		"\7\23\2\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2"+
		"\u01ae\u01af\7M\2\2\u01af\u01b4\5\64\33\2\u01b0\u01b1\7\25\2\2\u01b1\u01b3"+
		"\5\64\33\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2"+
		"\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b9"+
		"\7$\2\2\u01b8\u01ba\7^\2\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"=\3\2\2\2\u01bb\u01bc\7\23\2\2\u01bc\u01bd\5b\62\2\u01bd\u01be\7\25\2"+
		"\2\u01be\u01bf\5@!\2\u01bf\u01c0\7\25\2\2\u01c0\u01c1\5B\"\2\u01c1\u01c2"+
		"\7\25\2\2\u01c2\u01c3\7\36\2\2\u01c3\u01c4\7^\2\2\u01c4?\3\2\2\2\u01c5"+
		"\u01c6\t\2\2\2\u01c6A\3\2\2\2\u01c7\u01c8\t\3\2\2\u01c8C\3\2\2\2\u01c9"+
		"\u01cc\5F$\2\u01ca\u01cc\5H%\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2"+
		"\u01ccE\3\2\2\2\u01cd\u01ce\7e\2\2\u01ceG\3\2\2\2\u01cf\u01d0\7e\2\2\u01d0"+
		"\u01d1\7\23\2\2\u01d1\u01d6\5J&\2\u01d2\u01d3\7\25\2\2\u01d3\u01d5\5J"+
		"&\2\u01d4\u01d2\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\7^"+
		"\2\2\u01daI\3\2\2\2\u01db\u01e1\5L\'\2\u01dc\u01e1\5N(\2\u01dd\u01e1\5"+
		"P)\2\u01de\u01e1\5R*\2\u01df\u01e1\5T+\2\u01e0\u01db\3\2\2\2\u01e0\u01dc"+
		"\3\2\2\2\u01e0\u01dd\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1"+
		"K\3\2\2\2\u01e2\u01e3\5\u00dep\2\u01e3M\3\2\2\2\u01e4\u01e5\5\u00e0q\2"+
		"\u01e5O\3\2\2\2\u01e6\u01e7\5\u00e2r\2\u01e7Q\3\2\2\2\u01e8\u01e9\7e\2"+
		"\2\u01e9S\3\2\2\2\u01ea\u01eb\5\u00d8m\2\u01ebU\3\2\2\2\u01ec\u01f4\5"+
		"\u00dep\2\u01ed\u01f4\5\u00e2r\2\u01ee\u01f4\5\u00e0q\2\u01ef\u01f4\7"+
		"e\2\2\u01f0\u01f4\5`\61\2\u01f1\u01f4\5\u00d8m\2\u01f2\u01f4\5X-\2\u01f3"+
		"\u01ec\3\2\2\2\u01f3\u01ed\3\2\2\2\u01f3\u01ee\3\2\2\2\u01f3\u01ef\3\2"+
		"\2\2\u01f3\u01f0\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4"+
		"W\3\2\2\2\u01f5\u01f6\7\7\2\2\u01f6\u01f7\7\64\2\2\u01f7\u01f8\5V,\2\u01f8"+
		"Y\3\2\2\2\u01f9\u01fa\7\60\2\2\u01fa\u01fb\5^\60\2\u01fb\u01fc\7\64\2"+
		"\2\u01fc\u01fd\5\30\r\2\u01fd[\3\2\2\2\u01fe\u01ff\7\60\2\2\u01ff\u0200"+
		"\5^\60\2\u0200\u0201\7\64\2\2\u0201\u0202\5\36\20\2\u0202]\3\2\2\2\u0203"+
		"\u020d\7M\2\2\u0204\u0209\5\u00d8m\2\u0205\u0206\7\25\2\2\u0206\u0208"+
		"\5\u00d8m\2\u0207\u0205\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2"+
		"\2\u0209\u020a\3\2\2\2\u020a\u020e\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020e"+
		"\7\17\2\2\u020d\u0204\3\2\2\2\u020d\u020c\3\2\2\2\u020e\u020f\3\2\2\2"+
		"\u020f\u0210\7$\2\2\u0210_\3\2\2\2\u0211\u0212\7e\2\2\u0212\u0213\7\23"+
		"\2\2\u0213\u0214\5b\62\2\u0214\u0215\7^\2\2\u0215a\3\2\2\2\u0216\u0228"+
		"\b\62\1\2\u0217\u0228\5\u0080A\2\u0218\u0228\5p9\2\u0219\u0228\5v<\2\u021a"+
		"\u0228\5\u00ceh\2\u021b\u0228\5\u0090I\2\u021c\u0228\5\u00c2b\2\u021d"+
		"\u0228\5\u00be`\2\u021e\u0228\5\u00a0Q\2\u021f\u0228\5~@\2\u0220\u0228"+
		"\5\u0084C\2\u0221\u0228\5\u008cG\2\u0222\u0228\7h\2\2\u0223\u0228\5\u00e6"+
		"t\2\u0224\u0228\5\u00e4s\2\u0225\u0228\7e\2\2\u0226\u0228\7T\2\2\u0227"+
		"\u0216\3\2\2\2\u0227\u0217\3\2\2\2\u0227\u0218\3\2\2\2\u0227\u0219\3\2"+
		"\2\2\u0227\u021a\3\2\2\2\u0227\u021b\3\2\2\2\u0227\u021c\3\2\2\2\u0227"+
		"\u021d\3\2\2\2\u0227\u021e\3\2\2\2\u0227\u021f\3\2\2\2\u0227\u0220\3\2"+
		"\2\2\u0227\u0221\3\2\2\2\u0227\u0222\3\2\2\2\u0227\u0223\3\2\2\2\u0227"+
		"\u0224\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0226\3\2\2\2\u0228\u022f\3\2"+
		"\2\2\u0229\u022a\f\16\2\2\u022a\u022b\5\u0086D\2\u022b\u022c\5b\62\17"+
		"\u022c\u022e\3\2\2\2\u022d\u0229\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d"+
		"\3\2\2\2\u022f\u0230\3\2\2\2\u0230c\3\2\2\2\u0231\u022f\3\2\2\2\u0232"+
		"\u023f\3\2\2\2\u0233\u0234\7\23\2\2\u0234\u0235\5r:\2\u0235\u0236\7^\2"+
		"\2\u0236\u023f\3\2\2\2\u0237\u023f\7e\2\2\u0238\u023f\7h\2\2\u0239\u023f"+
		"\5\u008aF\2\u023a\u023f\5\u00c2b\2\u023b\u023f\5\u00be`\2\u023c\u023f"+
		"\5~@\2\u023d\u023f\5\u00a0Q\2\u023e\u0232\3\2\2\2\u023e\u0233\3\2\2\2"+
		"\u023e\u0237\3\2\2\2\u023e\u0238\3\2\2\2\u023e\u0239\3\2\2\2\u023e\u023a"+
		"\3\2\2\2\u023e\u023b\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023d\3\2\2\2\u023f"+
		"e\3\2\2\2\u0240\u0243\5h\65\2\u0241\u0243\5j\66\2\u0242\u0240\3\2\2\2"+
		"\u0242\u0241\3\2\2\2\u0243g\3\2\2\2\u0244\u0245\t\4\2\2\u0245i\3\2\2\2"+
		"\u0246\u0247\t\5\2\2\u0247k\3\2\2\2\u0248\u0249\7e\2\2\u0249\u024a\7L"+
		"\2\2\u024a\u024b\5h\65\2\u024bm\3\2\2\2\u024c\u024d\7e\2\2\u024d\u024e"+
		"\7L\2\2\u024e\u024f\5j\66\2\u024fo\3\2\2\2\u0250\u0253\5r:\2\u0251\u0254"+
		"\5h\65\2\u0252\u0254\5l\67\2\u0253\u0251\3\2\2\2\u0253\u0252\3\2\2\2\u0254"+
		"\u0255\3\2\2\2\u0255\u0256\5r:\2\u0256\u0260\3\2\2\2\u0257\u025a\5x=\2"+
		"\u0258\u025b\5j\66\2\u0259\u025b\5n8\2\u025a\u0258\3\2\2\2\u025a\u0259"+
		"\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\5x=\2\u025d\u0260\3\2\2\2\u025e"+
		"\u0260\5z>\2\u025f\u0250\3\2\2\2\u025f\u0257\3\2\2\2\u025f\u025e\3\2\2"+
		"\2\u0260q\3\2\2\2\u0261\u0262\b:\1\2\u0262\u0265\5x=\2\u0263\u0266\5j"+
		"\66\2\u0264\u0266\5n8\2\u0265\u0263\3\2\2\2\u0265\u0264\3\2\2\2\u0266"+
		"\u0267\3\2\2\2\u0267\u0268\5b\62\2\u0268\u026c\3\2\2\2\u0269\u026c\5z"+
		">\2\u026a\u026c\5d\63\2\u026b\u0261\3\2\2\2\u026b\u0269\3\2\2\2\u026b"+
		"\u026a\3\2\2\2\u026c\u0276\3\2\2\2\u026d\u0270\f\6\2\2\u026e\u0271\5h"+
		"\65\2\u026f\u0271\5l\67\2\u0270\u026e\3\2\2\2\u0270\u026f\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0273\5r:\7\u0273\u0275\3\2\2\2\u0274\u026d\3\2\2"+
		"\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277s"+
		"\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u0286\7e\2\2\u027a\u0286\5\u00e4s\2"+
		"\u027b\u0286\5\u00e6t\2\u027c\u0286\5\u008aF\2\u027d\u0286\5\u00c2b\2"+
		"\u027e\u0286\5\u00be`\2\u027f\u0280\7\23\2\2\u0280\u0281\5x=\2\u0281\u0282"+
		"\7^\2\2\u0282\u0286\3\2\2\2\u0283\u0286\5~@\2\u0284\u0286\5\u009eP\2\u0285"+
		"\u0279\3\2\2\2\u0285\u027a\3\2\2\2\u0285\u027b\3\2\2\2\u0285\u027c\3\2"+
		"\2\2\u0285\u027d\3\2\2\2\u0285\u027e\3\2\2\2\u0285\u027f\3\2\2\2\u0285"+
		"\u0283\3\2\2\2\u0285\u0284\3\2\2\2\u0286u\3\2\2\2\u0287\u028d\5|?\2\u0288"+
		"\u0289\5x=\2\u0289\u028a\t\6\2\2\u028a\u028b\5x=\2\u028b\u028d\3\2\2\2"+
		"\u028c\u0287\3\2\2\2\u028c\u0288\3\2\2\2\u028dw\3\2\2\2\u028e\u028f\b"+
		"=\1\2\u028f\u0292\5|?\2\u0290\u0292\5t;\2\u0291\u028e\3\2\2\2\u0291\u0290"+
		"\3\2\2\2\u0292\u0298\3\2\2\2\u0293\u0294\f\4\2\2\u0294\u0295\t\6\2\2\u0295"+
		"\u0297\5x=\5\u0296\u0293\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296\3\2\2"+
		"\2\u0298\u0299\3\2\2\2\u0299y\3\2\2\2\u029a\u0298\3\2\2\2\u029b\u029c"+
		"\7`\2\2\u029c\u029d\5b\62\2\u029d{\3\2\2\2\u029e\u029f\7b\2\2\u029f\u02a0"+
		"\5x=\2\u02a0}\3\2\2\2\u02a1\u02ad\7e\2\2\u02a2\u02a3\7\23\2\2\u02a3\u02a8"+
		"\5b\62\2\u02a4\u02a5\7\25\2\2\u02a5\u02a7\5b\62\2\u02a6\u02a4\3\2\2\2"+
		"\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab"+
		"\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02ac\7^\2\2\u02ac\u02ae\3\2\2\2\u02ad"+
		"\u02a2\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\177\3\2\2\2\u02af\u02b0\7\23"+
		"\2\2\u02b0\u02b1\5b\62\2\u02b1\u02b2\7^\2\2\u02b2\u0081\3\2\2\2\u02b3"+
		"\u02b4\7e\2\2\u02b4\u0083\3\2\2\2\u02b5\u02b6\7D\2\2\u02b6\u02b7\5\u00e8"+
		"u\2\u02b7\u02b8\7D\2\2\u02b8\u0085\3\2\2\2\u02b9\u02ba\7A\2\2\u02ba\u02bb"+
		"\7e\2\2\u02bb\u02be\7A\2\2\u02bc\u02be\5\u0088E\2\u02bd\u02b9\3\2\2\2"+
		"\u02bd\u02bc\3\2\2\2\u02be\u0087\3\2\2\2\u02bf\u02c0\t\7\2\2\u02c0\u0089"+
		"\3\2\2\2\u02c1\u02c2\7e\2\2\u02c2\u02c3\7M\2\2\u02c3\u02c8\5b\62\2\u02c4"+
		"\u02c5\7\25\2\2\u02c5\u02c7\5b\62\2\u02c6\u02c4\3\2\2\2\u02c7\u02ca\3"+
		"\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cb\3\2\2\2\u02ca"+
		"\u02c8\3\2\2\2\u02cb\u02cc\7$\2\2\u02cc\u02e5\3\2\2\2\u02cd\u02d6\7M\2"+
		"\2\u02ce\u02d3\5b\62\2\u02cf\u02d0\7\25\2\2\u02d0\u02d2\5b\62\2\u02d1"+
		"\u02cf\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2"+
		"\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02ce\3\2\2\2\u02d6"+
		"\u02d7\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\7$\2\2\u02d9\u02da\7M\2"+
		"\2\u02da\u02df\5b\62\2\u02db\u02dc\7\25\2\2\u02dc\u02de\5b\62\2\u02dd"+
		"\u02db\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2"+
		"\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e3\7$\2\2\u02e3"+
		"\u02e5\3\2\2\2\u02e4\u02c1\3\2\2\2\u02e4\u02cd\3\2\2\2\u02e5\u008b\3\2"+
		"\2\2\u02e6\u02e7\7I\2\2\u02e7\u02e8\7e\2\2\u02e8\u02ec\7\64\2\2\u02e9"+
		"\u02ea\5\u008eH\2\u02ea\u02eb\78\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02e9\3"+
		"\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u02f1\7\37\2\2\u02f1\u008d\3\2\2\2\u02f2\u02f3\5"+
		"~@\2\u02f3\u02f4\7*\2\2\u02f4\u02f5\5b\62\2\u02f5\u008f\3\2\2\2\u02f6"+
		"\u02f7\bI\1\2\u02f7\u02fb\5\u009aN\2\u02f8\u02fb\5\u0092J\2\u02f9\u02fb"+
		"\5\u0098M\2\u02fa\u02f6\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02f9\3\2\2"+
		"\2\u02fb\u0301\3\2\2\2\u02fc\u02fd\f\5\2\2\u02fd\u02fe\7#\2\2\u02fe\u0300"+
		"\5b\62\2\u02ff\u02fc\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301"+
		"\u0302\3\2\2\2\u0302\u0091\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u0307\5\u0094"+
		"K\2\u0305\u0307\5\u0096L\2\u0306\u0304\3\2\2\2\u0306\u0305\3\2\2\2\u0307"+
		"\u0093\3\2\2\2\u0308\u0311\7M\2\2\u0309\u030e\5b\62\2\u030a\u030b\7\25"+
		"\2\2\u030b\u030d\5b\62\2\u030c\u030a\3\2\2\2\u030d\u0310\3\2\2\2\u030e"+
		"\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0312\3\2\2\2\u0310\u030e\3\2"+
		"\2\2\u0311\u0309\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0314\3\2\2\2\u0313"+
		"\u0315\7\25\2\2\u0314\u0313\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\3"+
		"\2\2\2\u0316\u0317\7$\2\2\u0317\u0095\3\2\2\2\u0318\u0321\7M\2\2\u0319"+
		"\u031e\5b\62\2\u031a\u031b\7\25\2\2\u031b\u031d\5b\62\2\u031c\u031a\3"+
		"\2\2\2\u031d\u0320\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u0322\3\2\2\2\u0320\u031e\3\2\2\2\u0321\u0319\3\2\2\2\u0321\u0322\3\2"+
		"\2\2\u0322\u0323\3\2\2\2\u0323\u0324\7N\2\2\u0324\u0329\5\u00ba^\2\u0325"+
		"\u0326\7\25\2\2\u0326\u0328\5\u00ba^\2\u0327\u0325\3\2\2\2\u0328\u032b"+
		"\3\2\2\2\u0329\u0327\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032c\3\2\2\2\u032b"+
		"\u0329\3\2\2\2\u032c\u032d\7$\2\2\u032d\u0097\3\2\2\2\u032e\u0337\7C\2"+
		"\2\u032f\u0334\5b\62\2\u0330\u0331\7\25\2\2\u0331\u0333\5b\62\2\u0332"+
		"\u0330\3\2\2\2\u0333\u0336\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2"+
		"\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2\2\2\u0337\u032f\3\2\2\2\u0337"+
		"\u0338\3\2\2\2\u0338\u0347\3\2\2\2\u0339\u033b\7\25\2\2\u033a\u0339\3"+
		"\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\7N\2\2\u033d"+
		"\u0342\5b\62\2\u033e\u033f\7\25\2\2\u033f\u0341\5b\62\2\u0340\u033e\3"+
		"\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343"+
		"\u0346\3\2\2\2\u0344\u0342\3\2\2\2\u0345\u033a\3\2\2\2\u0346\u0349\3\2"+
		"\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u034a\3\2\2\2\u0349"+
		"\u0347\3\2\2\2\u034a\u034b\7\'\2\2\u034b\u0099\3\2\2\2\u034c\u0354\5\u0084"+
		"C\2\u034d\u0354\7e\2\2\u034e\u0354\5\u00c2b\2\u034f\u0354\5\u008aF\2\u0350"+
		"\u0354\5\u009cO\2\u0351\u0354\5\u00ba^\2\u0352\u0354\5\u009eP\2\u0353"+
		"\u034c\3\2\2\2\u0353\u034d\3\2\2\2\u0353\u034e\3\2\2\2\u0353\u034f\3\2"+
		"\2\2\u0353\u0350\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0352\3\2\2\2\u0354"+
		"\u009b\3\2\2\2\u0355\u0356\7P\2\2\u0356\u0357\7\23\2\2\u0357\u0358\5b"+
		"\62\2\u0358\u0359\7^\2\2\u0359\u009d\3\2\2\2\u035a\u035b\5\u00a0Q\2\u035b"+
		"\u009f\3\2\2\2\u035c\u0366\5\u00a2R\2\u035d\u0366\5\u00a4S\2\u035e\u0366"+
		"\5\u00a6T\2\u035f\u0366\5\u00a8U\2\u0360\u0366\5\u00aaV\2\u0361\u0366"+
		"\5\u00acW\2\u0362\u0366\5\u00aeX\2\u0363\u0366\5\u00b0Y\2\u0364\u0366"+
		"\5\u00b2Z\2\u0365\u035c\3\2\2\2\u0365\u035d\3\2\2\2\u0365\u035e\3\2\2"+
		"\2\u0365\u035f\3\2\2\2\u0365\u0360\3\2\2\2\u0365\u0361\3\2\2\2\u0365\u0362"+
		"\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0364\3\2\2\2\u0366\u00a1\3\2\2\2\u0367"+
		"\u0368\7S\2\2\u0368\u0369\5\u00b4[\2\u0369\u00a3\3\2\2\2\u036a\u036b\7"+
		"G\2\2\u036b\u036c\5\u00b4[\2\u036c\u00a5\3\2\2\2\u036d\u036e\7\66\2\2"+
		"\u036e\u036f\5\u00b4[\2\u036f\u00a7\3\2\2\2\u0370\u0371\7]\2\2\u0371\u0372"+
		"\5\u00b4[\2\u0372\u00a9\3\2\2\2\u0373\u0374\79\2\2\u0374\u037d\5\u00b4"+
		"[\2\u0375\u0376\79\2\2\u0376\u0377\7\23\2\2\u0377\u0378\5b\62\2\u0378"+
		"\u0379\7\25\2\2\u0379\u037a\5b\62\2\u037a\u037b\7^\2\2\u037b\u037d\3\2"+
		"\2\2\u037c\u0373\3\2\2\2\u037c\u0375\3\2\2\2\u037d\u00ab\3\2\2\2\u037e"+
		"\u037f\7\24\2\2\u037f\u0388\5\u00b4[\2\u0380\u0381\79\2\2\u0381\u0382"+
		"\7\23\2\2\u0382\u0383\5b\62\2\u0383\u0384\7\25\2\2\u0384\u0385\5b\62\2"+
		"\u0385\u0386\7^\2\2\u0386\u0388\3\2\2\2\u0387\u037e\3\2\2\2\u0387\u0380"+
		"\3\2\2\2\u0388\u00ad\3\2\2\2\u0389\u038a\7%\2\2\u038a\u038b\7\23\2\2\u038b"+
		"\u038c\5b\62\2\u038c\u038d\7^\2\2\u038d\u00af\3\2\2\2\u038e\u038f\7+\2"+
		"\2\u038f\u0390\5\u00b4[\2\u0390\u00b1\3\2\2\2\u0391\u0392\7\63\2\2\u0392"+
		"\u0393\7\23\2\2\u0393\u0394\5b\62\2\u0394\u0395\7\25\2\2\u0395\u0396\5"+
		"b\62\2\u0396\u0397\7^\2\2\u0397\u00b3\3\2\2\2\u0398\u039b\5\u00b8]\2\u0399"+
		"\u039b\5\u00b6\\\2\u039a\u0398\3\2\2\2\u039a\u0399\3\2\2\2\u039b\u00b5"+
		"\3\2\2\2\u039c\u039d\7\23\2\2\u039d\u039e\5\u0090I\2\u039e\u039f\7^\2"+
		"\2\u039f\u00b7\3\2\2\2\u03a0\u03a1\7\23\2\2\u03a1\u03a6\5\u00ba^\2\u03a2"+
		"\u03a3\7\25\2\2\u03a3\u03a5\5\u00ba^\2\u03a4\u03a2\3\2\2\2\u03a5\u03a8"+
		"\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a9\3\2\2\2\u03a8"+
		"\u03a6\3\2\2\2\u03a9\u03aa\7^\2\2\u03aa\u03ab\7\23\2\2\u03ab\u03ac\5b"+
		"\62\2\u03ac\u03ad\7^\2\2\u03ad\u00b9\3\2\2\2\u03ae\u03b3\7e\2\2\u03af"+
		"\u03b0\7\25\2\2\u03b0\u03b2\7e\2\2\u03b1\u03af\3\2\2\2\u03b2\u03b5\3\2"+
		"\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b6\3\2\2\2\u03b5"+
		"\u03b3\3\2\2\2\u03b6\u03b7\7[\2\2\u03b7\u03b9\5\u00ceh\2\u03b8\u03ba\5"+
		"\u00bc_\2\u03b9\u03b8\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u00bb\3\2\2\2"+
		"\u03bb\u03bc\7V\2\2\u03bc\u03bd\5b\62\2\u03bd\u00bd\3\2\2\2\u03be\u03bf"+
		"\7)\2\2\u03bf\u03c0\7\n\2\2\u03c0\u03c5\5\u00c0a\2\u03c1\u03c2\7\25\2"+
		"\2\u03c2\u03c4\5\u00c0a\2\u03c3\u03c1\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5"+
		"\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c8\3\2\2\2\u03c7\u03c5\3\2"+
		"\2\2\u03c8\u03c9\7<\2\2\u03c9\u03ca\7[\2\2\u03ca\u03cb\5b\62\2\u03cb\u00bf"+
		"\3\2\2\2\u03cc\u03cf\5\6\4\2\u03cd\u03cf\5\26\f\2\u03ce\u03cc\3\2\2\2"+
		"\u03ce\u03cd\3\2\2\2\u03cf\u00c1\3\2\2\2\u03d0\u03d1\7=\2\2\u03d1\u03d2"+
		"\5\u00c4c\2\u03d2\u00c3\3\2\2\2\u03d3\u03d4\5b\62\2\u03d4\u03d5\7.\2\2"+
		"\u03d5\u03d8\5b\62\2\u03d6\u03d9\5\u00c6d\2\u03d7\u03d9\5\u00c8e\2\u03d8"+
		"\u03d6\3\2\2\2\u03d8\u03d7\3\2\2\2\u03d9\u00c5\3\2\2\2\u03da\u03db\7Z"+
		"\2\2\u03db\u03dc\5b\62\2\u03dc\u03dd\7\3\2\2\u03dd\u00c7\3\2\2\2\u03de"+
		"\u03df\7\65\2\2\u03df\u03e0\5\u00c4c\2\u03e0\u00c9\3\2\2\2\u03e1\u03e5"+
		"\5\u00d0i\2\u03e2\u03e5\5\u00d8m\2\u03e3\u03e5\5\u00d2j\2\u03e4\u03e1"+
		"\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e3\3\2\2\2\u03e5\u00cb\3\2\2\2\u03e6"+
		"\u03e7\5\u00ceh\2\u03e7\u03e8\5\u0088E\2\u03e8\u03e9\5\u00ceh\2\u03e9"+
		"\u00cd\3\2\2\2\u03ea\u03eb\bh\1\2\u03eb\u03ec\5\u00caf\2\u03ec\u03f3\3"+
		"\2\2\2\u03ed\u03ee\f\3\2\2\u03ee\u03ef\5\u0088E\2\u03ef\u03f0\5\u00ce"+
		"h\4\u03f0\u03f2\3\2\2\2\u03f1\u03ed\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3"+
		"\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u00cf\3\2\2\2\u03f5\u03f3\3\2"+
		"\2\2\u03f6\u03f7\7\n\2\2\u03f7\u03f8\5\u00d4k\2\u03f8\u03f9\7<\2\2\u03f9"+
		"\u00d1\3\2\2\2\u03fa\u03fb\7\n\2\2\u03fb\u03fc\5\u00d4k\2\u03fc\u03fd"+
		"\7N\2\2\u03fd\u03fe\5\u00d6l\2\u03fe\u03ff\7<\2\2\u03ff\u00d3\3\2\2\2"+
		"\u0400\u0405\5b\62\2\u0401\u0402\7\25\2\2\u0402\u0404\5b\62\2\u0403\u0401"+
		"\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2\2\2\u0406"+
		"\u0409\3\2\2\2\u0407\u0405\3\2\2\2\u0408\u0400\3\2\2\2\u0408\u0409\3\2"+
		"\2\2\u0409\u00d5\3\2\2\2\u040a\u040f\5\u00ba^\2\u040b\u040c\7\25\2\2\u040c"+
		"\u040e\5\u00ba^\2\u040d\u040b\3\2\2\2\u040e\u0411\3\2\2\2\u040f\u040d"+
		"\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u00d7\3\2\2\2\u0411\u040f\3\2\2\2\u0412"+
		"\u0413\5\u00dan\2\u0413\u0414\7\13\2\2\u0414\u0415\5\u00dco\2\u0415\u0418"+
		"\3\2\2\2\u0416\u0418\7e\2\2\u0417\u0412\3\2\2\2\u0417\u0416\3\2\2\2\u0418"+
		"\u00d9\3\2\2\2\u0419\u041a\5x=\2\u041a\u00db\3\2\2\2\u041b\u041c\5x=\2"+
		"\u041c\u00dd\3\2\2\2\u041d\u041e\7\17\2\2\u041e\u00df\3\2\2\2\u041f\u0420"+
		"\7\t\2\2\u0420\u00e1\3\2\2\2\u0421\u0422\7Q\2\2\u0422\u00e3\3\2\2\2\u0423"+
		"\u0427\7f\2\2\u0424\u0425\7b\2\2\u0425\u0427\7f\2\2\u0426\u0423\3\2\2"+
		"\2\u0426\u0424\3\2\2\2\u0427\u00e5\3\2\2\2\u0428\u0429\5\u00e4s\2\u0429"+
		"\u042a\7H\2\2\u042a\u042b\7f\2\2\u042b\u00e7\3\2\2\2\u042c\u0432\n\b\2"+
		"\2\u042d\u0432\7c\2\2\u042e\u0432\7H\2\2\u042f\u0432\7\16\2\2\u0430\u0432"+
		"\7(\2\2\u0431\u042c\3\2\2\2\u0431\u042d\3\2\2\2\u0431\u042e\3\2\2\2\u0431"+
		"\u042f\3\2\2\2\u0431\u0430\3\2\2\2\u0432\u0434\3\2\2\2\u0433\u0431\3\2"+
		"\2\2\u0434\u0437\3\2\2\2\u0435\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436"+
		"\u00e9\3\2\2\2\u0437\u0435\3\2\2\2\\\u00ef\u00fb\u00ff\u0103\u0107\u010b"+
		"\u0116\u0121\u0126\u012e\u0146\u014a\u014e\u0151\u0158\u0169\u016c\u0174"+
		"\u017d\u0180\u018a\u0190\u019f\u01ac\u01b4\u01b9\u01cb\u01d6\u01e0\u01f3"+
		"\u0209\u020d\u0227\u022f\u023e\u0242\u0253\u025a\u025f\u0265\u026b\u0270"+
		"\u0276\u0285\u028c\u0291\u0298\u02a8\u02ad\u02bd\u02c8\u02d3\u02d6\u02df"+
		"\u02e4\u02ee\u02fa\u0301\u0306\u030e\u0311\u0314\u031e\u0321\u0329\u0334"+
		"\u0337\u033a\u0342\u0347\u0353\u0365\u037c\u0387\u039a\u03a6\u03b3\u03b9"+
		"\u03c5\u03ce\u03d8\u03e4\u03f3\u0405\u0408\u040f\u0417\u0426\u0431\u0435";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}