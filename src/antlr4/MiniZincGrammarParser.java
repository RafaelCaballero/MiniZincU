package antlr4;
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
		RULE_op = 50, RULE_boolOp = 51, RULE_arithOp = 52, RULE_arithOp2 = 53, 
		RULE_qualBoolOp = 54, RULE_qualArithOp = 55, RULE_boolComplexExpr = 56, 
		RULE_boolExpr = 57, RULE_operand = 58, RULE_arithComplexExpr = 59, RULE_arithExpr = 60, 
		RULE_notExpr = 61, RULE_minusExpr = 62, RULE_predOrUnionExpr = 63, RULE_rbracketExpr = 64, 
		RULE_idexpr = 65, RULE_stringExpr = 66, RULE_infixOp = 67, RULE_infixSetOp = 68, 
		RULE_arrayaccess = 69, RULE_caseExpr = 70, RULE_caseBranch = 71, RULE_listExpr = 72, 
		RULE_oneDimList = 73, RULE_simpleList = 74, RULE_guardedList = 75, RULE_multiDimList = 76, 
		RULE_listValue = 77, RULE_showExpr = 78, RULE_functionExpr = 79, RULE_guardExpr = 80, 
		RULE_forall = 81, RULE_exists = 82, RULE_sum = 83, RULE_prod = 84, RULE_max = 85, 
		RULE_min = 86, RULE_bool2int = 87, RULE_alldifferent = 88, RULE_array1d = 89, 
		RULE_guardExprArg = 90, RULE_oneSection = 91, RULE_twoSections = 92, RULE_inDecl = 93, 
		RULE_whereCond = 94, RULE_letExpr = 95, RULE_letDecl = 96, RULE_ifExpr = 97, 
		RULE_bodyIf = 98, RULE_elseS = 99, RULE_elseifS = 100, RULE_setVal = 101, 
		RULE_complexSetExpr = 102, RULE_setExpr = 103, RULE_bracketExpr = 104, 
		RULE_guardedSet = 105, RULE_commaList = 106, RULE_guard = 107, RULE_range = 108, 
		RULE_fromR = 109, RULE_toR = 110, RULE_rint = 111, RULE_rfloat = 112, 
		RULE_rbool = 113, RULE_integer = 114, RULE_real = 115, RULE_string = 116;
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
		"arithExpr", "notExpr", "minusExpr", "predOrUnionExpr", "rbracketExpr", 
		"idexpr", "stringExpr", "infixOp", "infixSetOp", "arrayaccess", "caseExpr", 
		"caseBranch", "listExpr", "oneDimList", "simpleList", "guardedList", "multiDimList", 
		"listValue", "showExpr", "functionExpr", "guardExpr", "forall", "exists", 
		"sum", "prod", "max", "min", "bool2int", "alldifferent", "array1d", "guardExprArg", 
		"oneSection", "twoSections", "inDecl", "whereCond", "letExpr", "letDecl", 
		"ifExpr", "bodyIf", "elseS", "elseifS", "setVal", "complexSetExpr", "setExpr", 
		"bracketExpr", "guardedSet", "commaList", "guard", "range", "fromR", "toR", 
		"rint", "rfloat", "rbool", "integer", "real", "string"
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
			setState(237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234); stat();
				setState(235); match(54);
				}
				}
				setState(239); 
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
			setState(251);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241); data();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242); extended();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243); constraint();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244); decl();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245); solve();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246); output();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(247); predicate();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(248); function();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(249); include();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(250); init();
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
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253); vardecl();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254); pardecl();
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
			setState(259);
			switch (_input.LA(1)) {
			case 24:
				{
				setState(257); var();
				}
				break;
			case 46:
				{
				setState(258); vararray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(263);
			_la = _input.LA(1);
			if (_la==11) {
				{
				setState(261); match(11);
				setState(262); expr(0);
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
			setState(267);
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
				setState(265); parameter();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 2);
				{
				setState(266); pararray();
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
			setState(269); match(62);
			setState(270); match(ID);
			setState(271); match(11);
			setState(272); match(8);
			setState(273); constr();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(274); match(19);
				setState(275); constr();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281); match(58);
			}
		}
		catch (RecognitionException re) {
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
			setState(283); match(20);
			setState(284); match(ID);
			setState(285); match(11);
			setState(289);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(286); preExt();
				setState(287); match(33);
				}
				break;
			}
			setState(291); typename();
			setState(294);
			_la = _input.LA(1);
			if (_la==33) {
				{
				setState(292); match(33);
				setState(293); postExt();
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
			setState(296); match(75);
			setState(297); match(ID);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(298); match(19);
				setState(299); match(ID);
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305); match(34);
			}
		}
		catch (RecognitionException re) {
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
			setState(309); listExtended();
			}
		}
		catch (RecognitionException re) {
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
			setState(311); match(67);
			setState(312); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(314); match(24);
			setState(315); typename();
			setState(316); match(74);
			setState(317); match(ID);
			}
		}
		catch (RecognitionException re) {
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
			setState(326);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319); match(21);
				setState(320); match(17);
				setState(321); listExpr(0);
				setState(322); match(92);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324); match(21);
				setState(325); listExpr(0);
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
			setState(328); match(60);
			setState(330);
			_la = _input.LA(1);
			if (_la==10) {
				{
				setState(329); annotation();
				}
			}

			setState(334);
			switch (_input.LA(1)) {
			case 85:
				{
				setState(332); satisfy();
				}
				break;
			case 2:
			case 4:
				{
				setState(333); optimize();
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
			setState(337);
			_la = _input.LA(1);
			if (_la==73) {
				{
				setState(336); match(73);
				}
			}

			setState(339); typename();
			setState(340); match(74);
			setState(341); match(ID);
			setState(344);
			_la = _input.LA(1);
			if (_la==11) {
				{
				setState(342); match(11);
				setState(343); expr(0);
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
			setState(346); match(15);
			setState(347); stringExpr();
			}
		}
		catch (RecognitionException re) {
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
			setState(349); match(ID);
			setState(350); match(11);
			setState(351); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(353); match(56);
			setState(354); match(ID);
			setState(355); match(17);
			setState(364);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 13) | (1L << 17) | (1L << 18) | (1L << 24) | (1L << 35) | (1L << 39) | (1L << 41) | (1L << 46) | (1L << 49) | (1L << 52) | (1L << 55) | (1L << 59))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (73 - 69)) | (1L << (75 - 69)) | (1L << (79 - 69)) | (1L << (81 - 69)) | (1L << (91 - 69)) | (1L << (96 - 69)) | (1L << (ID - 69)) | (1L << (NAT - 69)))) != 0)) {
				{
				setState(356); decl();
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(357); match(19);
					setState(358); decl();
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(366); match(92);
			setState(367); match(11);
			setState(368); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(370); match(42);
			setState(372);
			_la = _input.LA(1);
			if (_la==24) {
				{
				setState(371); match(24);
				}
			}

			setState(374); qualName();
			setState(375); match(17);
			setState(384);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 13) | (1L << 17) | (1L << 18) | (1L << 24) | (1L << 35) | (1L << 39) | (1L << 41) | (1L << 46) | (1L << 49) | (1L << 52) | (1L << 55) | (1L << 59))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (73 - 69)) | (1L << (75 - 69)) | (1L << (79 - 69)) | (1L << (81 - 69)) | (1L << (91 - 69)) | (1L << (96 - 69)) | (1L << (ID - 69)) | (1L << (NAT - 69)))) != 0)) {
				{
				setState(376); decl();
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(377); match(19);
					setState(378); decl();
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(386); match(92);
			setState(387); match(11);
			setState(388); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(394);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391); match(ID);
				setState(392); match(74);
				setState(393); op();
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
			setState(396); match(85);
			}
		}
		catch (RecognitionException re) {
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
			setState(400);
			switch (_input.LA(1)) {
			case 2:
				enterOuterAlt(_localctx, 1);
				{
				setState(398); maximize();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 2);
				{
				setState(399); minimize();
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
			setState(402); match(2);
			setState(403); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(405); match(4);
			setState(406); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(408); match(10);
			setState(409); modeAnnotation();
			}
		}
		catch (RecognitionException re) {
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
			setState(415);
			switch (_input.LA(1)) {
			case 3:
				enterOuterAlt(_localctx, 1);
				{
				setState(411); intS();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 2);
				{
				setState(412); boolS();
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 3);
				{
				setState(413); setS();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 4);
				{
				setState(414); seqS();
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
			setState(417); match(3);
			setState(418); restS();
			}
		}
		catch (RecognitionException re) {
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
			setState(420); match(14);
			setState(421); restS();
			}
		}
		catch (RecognitionException re) {
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
			setState(423); match(57);
			setState(424); restS();
			}
		}
		catch (RecognitionException re) {
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
			setState(426); match(43);
			setState(428);
			_la = _input.LA(1);
			if (_la==17) {
				{
				setState(427); match(17);
				}
			}

			setState(430); match(75);
			setState(431); modeAnnotation();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(432); match(19);
				setState(433); modeAnnotation();
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(439); match(34);
			setState(441);
			_la = _input.LA(1);
			if (_la==92) {
				{
				setState(440); match(92);
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
			setState(443); match(17);
			setState(444); expr(0);
			setState(445); match(19);
			setState(446); varchoice();
			setState(447); match(19);
			setState(448); constrainchoice();
			setState(449); match(19);
			setState(450); match(28);
			setState(451); match(92);
			}
		}
		catch (RecognitionException re) {
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
			setState(453);
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
			setState(455);
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
			setState(459);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457); scons();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458); tcons();
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
			setState(461); match(ID);
			}
		}
		catch (RecognitionException re) {
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
			setState(463); match(ID);
			setState(464); match(17);
			setState(465); arg();
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(466); match(19);
				setState(467); arg();
				}
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(473); match(92);
			}
		}
		catch (RecognitionException re) {
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
			setState(480);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475); argint();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476); argfloat();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(477); argbool();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(478); argunion();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(479); argrange();
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
			setState(482); rint();
			}
		}
		catch (RecognitionException re) {
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
			setState(484); rfloat();
			}
		}
		catch (RecognitionException re) {
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
			setState(486); rbool();
			}
		}
		catch (RecognitionException re) {
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
			setState(488); match(ID);
			}
		}
		catch (RecognitionException re) {
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
			setState(490); range();
			}
		}
		catch (RecognitionException re) {
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
			setState(499);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492); rint();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493); rbool();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(494); rfloat();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(495); match(ID);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(496); typedata();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(497); range();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(498); typeset();
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
			setState(501); match(5);
			setState(502); match(50);
			setState(503); typename();
			}
		}
		catch (RecognitionException re) {
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
			setState(505); match(46);
			setState(506); dimensions();
			setState(507); match(50);
			setState(508); var();
			}
		}
		catch (RecognitionException re) {
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
			setState(510); match(46);
			setState(511); dimensions();
			setState(512); match(50);
			setState(513); parameter();
			}
		}
		catch (RecognitionException re) {
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
			setState(515); match(75);
			setState(525);
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
				setState(516); range();
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(517); match(19);
					setState(518); range();
					}
					}
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 13:
				{
				setState(524); match(13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(527); match(34);
			}
		}
		catch (RecognitionException re) {
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
			setState(529); match(ID);
			setState(530); match(17);
			setState(531); expr(0);
			setState(532); match(92);
			}
		}
		catch (RecognitionException re) {
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
			setState(551);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				}
				break;

			case 2:
				{
				setState(535); rbracketExpr();
				}
				break;

			case 3:
				{
				setState(536); boolComplexExpr();
				}
				break;

			case 4:
				{
				setState(537); arithComplexExpr();
				}
				break;

			case 5:
				{
				setState(538); setExpr(0);
				}
				break;

			case 6:
				{
				setState(539); listExpr(0);
				}
				break;

			case 7:
				{
				setState(540); ifExpr();
				}
				break;

			case 8:
				{
				setState(541); letExpr();
				}
				break;

			case 9:
				{
				setState(542); guardExpr();
				}
				break;

			case 10:
				{
				setState(543); predOrUnionExpr();
				}
				break;

			case 11:
				{
				setState(544); stringExpr();
				}
				break;

			case 12:
				{
				setState(545); caseExpr();
				}
				break;

			case 13:
				{
				setState(546); match(BOOL);
				}
				break;

			case 14:
				{
				setState(547); real();
				}
				break;

			case 15:
				{
				setState(548); integer();
				}
				break;

			case 16:
				{
				setState(549); match(ID);
				}
				break;

			case 17:
				{
				setState(550); match(82);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(559);
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
					setState(553);
					if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
					setState(554); infixOp();
					setState(555); expr(13);
					}
					} 
				}
				setState(561);
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
			setState(574);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(563); match(17);
				setState(564); boolExpr(0);
				setState(565); match(92);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(567); match(ID);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(568); match(BOOL);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(569); arrayaccess();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(570); ifExpr();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(571); letExpr();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(572); predOrUnionExpr();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(573); guardExpr();
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
			setState(578);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(576); boolOp();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(577); arithOp();
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
			setState(580);
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
			setState(582);
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
			setState(584);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 30) | (1L << 45) | (1L << 48))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (68 - 68)) | (1L << (87 - 68)) | (1L << (96 - 68)))) != 0)) ) {
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
			setState(586); match(ID);
			setState(587); match(74);
			setState(588); boolOp();
			}
		}
		catch (RecognitionException re) {
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
			setState(590); match(ID);
			setState(591); match(74);
			setState(592); arithOp();
			}
		}
		catch (RecognitionException re) {
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
			setState(609);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(594); boolExpr(0);
				setState(597);
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
					setState(595); boolOp();
					}
					break;
				case ID:
					{
					setState(596); qualBoolOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(599); boolExpr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601); arithExpr(0);
				setState(604);
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
					setState(602); arithOp();
					}
					break;
				case ID:
					{
					setState(603); qualArithOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(606); arithExpr(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(608); notExpr();
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(612); arithExpr(0);
				setState(615);
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
					setState(613); arithOp();
					}
					break;
				case ID:
					{
					setState(614); qualArithOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(617); expr(0);
				}
				break;

			case 2:
				{
				setState(619); notExpr();
				}
				break;

			case 3:
				{
				setState(620); boolVal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(632);
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
					setState(623);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(626);
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
						setState(624); boolOp();
						}
						break;
					case ID:
						{
						setState(625); qualBoolOp();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(628); boolExpr(5);
					}
					} 
				}
				setState(634);
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
		enterRule(_localctx, 116, RULE_operand);
		try {
			setState(647);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(635); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636); integer();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(637); real();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(638); arrayaccess();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(639); ifExpr();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(640); letExpr();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(641); match(17);
				setState(642); arithExpr(0);
				setState(643); match(92);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(645); predOrUnionExpr();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(646); functionExpr();
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
			setState(654);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649); minusExpr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(650); arithExpr(0);
				setState(651); arithOp2();
				setState(652); arithExpr(0);
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
			setState(659);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(657); minusExpr();
				}
				break;

			case 2:
				{
				setState(658); operand();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(667);
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
					setState(661);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(662); arithOp2();
					setState(663); arithExpr(3);
					}
					} 
				}
				setState(669);
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
			setState(670); match(94);
			setState(671); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(673); match(96);
			setState(674); arithExpr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 126, RULE_predOrUnionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676); match(ID);
			setState(688);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(677); match(17);
				setState(678); expr(0);
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(679); match(19);
					setState(680); expr(0);
					}
					}
					setState(685);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(686); match(92);
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
		enterRule(_localctx, 128, RULE_rbracketExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690); match(17);
			setState(691); expr(0);
			setState(692); match(92);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 130, RULE_idexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694); match(ID);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 132, RULE_stringExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696); match(66);
			setState(697); string();
			setState(698); match(66);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 134, RULE_infixOp);
		try {
			setState(704);
			switch (_input.LA(1)) {
			case 63:
				enterOuterAlt(_localctx, 1);
				{
				setState(700); match(63);
				setState(701); match(ID);
				setState(702); match(63);
				}
				break;
			case 16:
			case 89:
			case 90:
				enterOuterAlt(_localctx, 2);
				{
				setState(703); infixSetOp();
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
		enterRule(_localctx, 136, RULE_infixSetOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
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
		enterRule(_localctx, 138, RULE_arrayaccess);
		int _la;
		try {
			setState(743);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(708); match(ID);
				setState(709); match(75);
				setState(710); expr(0);
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(711); match(19);
					setState(712); expr(0);
					}
					}
					setState(717);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(718); match(34);
				}
				break;
			case 75:
				enterOuterAlt(_localctx, 2);
				{
				setState(720); match(75);
				setState(729);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(721); expr(0);
					setState(726);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==19) {
						{
						{
						setState(722); match(19);
						setState(723); expr(0);
						}
						}
						setState(728);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(731); match(34);
				setState(732); match(75);
				setState(733); expr(0);
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(734); match(19);
					setState(735); expr(0);
					}
					}
					setState(740);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(741); match(34);
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
		enterRule(_localctx, 140, RULE_caseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745); match(71);
			setState(746); match(ID);
			setState(747); match(50);
			setState(751); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(748); caseBranch();
				setState(749); match(54);
				}
				}
				setState(753); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(755); match(29);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 142, RULE_caseBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757); predOrUnionExpr();
			setState(758); match(40);
			setState(759); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_listExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(762); listValue();
				}
				break;

			case 2:
				{
				setState(763); oneDimList();
				}
				break;

			case 3:
				{
				setState(764); multiDimList();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(772);
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
					setState(767);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(768); match(33);
					setState(769); expr(0);
					}
					} 
				}
				setState(774);
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
		enterRule(_localctx, 146, RULE_oneDimList);
		try {
			setState(777);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(775); simpleList();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(776); guardedList();
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
		enterRule(_localctx, 148, RULE_simpleList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(779); match(75);
			setState(788);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(780); expr(0);
				setState(785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(781); match(19);
						setState(782); expr(0);
						}
						} 
					}
					setState(787);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;
			}
			setState(791);
			_la = _input.LA(1);
			if (_la==19) {
				{
				setState(790); match(19);
				}
			}

			setState(793); match(34);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 150, RULE_guardedList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795); match(75);
			setState(804);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(796); expr(0);
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(797); match(19);
					setState(798); expr(0);
					}
					}
					setState(803);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(806); match(76);
			setState(807); inDecl();
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(808); match(19);
				setState(809); inDecl();
				}
				}
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(815); match(34);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 152, RULE_multiDimList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(817); match(65);
			setState(826);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(818); expr(0);
				setState(823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(819); match(19);
						setState(820); expr(0);
						}
						} 
					}
					setState(825);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				}
				break;
			}
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19 || _la==76) {
				{
				{
				setState(829);
				_la = _input.LA(1);
				if (_la==19) {
					{
					setState(828); match(19);
					}
				}

				setState(831); match(76);
				setState(832); expr(0);
				setState(837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(833); match(19);
						setState(834); expr(0);
						}
						} 
					}
					setState(839);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				}
				}
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(845); match(37);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 154, RULE_listValue);
		try {
			setState(854);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(847); stringExpr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(848); match(ID);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(849); ifExpr();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(850); arrayaccess();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(851); showExpr();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(852); inDecl();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(853); functionExpr();
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
		enterRule(_localctx, 156, RULE_showExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856); match(78);
			setState(857); match(17);
			setState(858); expr(0);
			setState(859); match(92);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 158, RULE_functionExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861); guardExpr();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 160, RULE_guardExpr);
		try {
			setState(872);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(863); forall();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(864); exists();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(865); sum();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(866); prod();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(867); max();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(868); min();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(869); bool2int();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(870); alldifferent();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(871); array1d();
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
		enterRule(_localctx, 162, RULE_forall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874); match(81);
			setState(875); guardExprArg();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 164, RULE_exists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877); match(69);
			setState(878); guardExprArg();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 166, RULE_sum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880); match(52);
			setState(881); guardExprArg();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 168, RULE_prod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883); match(91);
			setState(884); guardExprArg();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 170, RULE_max);
		try {
			setState(895);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(886); match(55);
				setState(887); guardExprArg();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(888); match(55);
				setState(889); match(17);
				setState(890); expr(0);
				setState(891); match(19);
				setState(892); expr(0);
				setState(893); match(92);
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
		enterRule(_localctx, 172, RULE_min);
		try {
			setState(906);
			switch (_input.LA(1)) {
			case 18:
				enterOuterAlt(_localctx, 1);
				{
				setState(897); match(18);
				setState(898); guardExprArg();
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 2);
				{
				setState(899); match(55);
				setState(900); match(17);
				setState(901); expr(0);
				setState(902); match(19);
				setState(903); expr(0);
				setState(904); match(92);
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
		enterRule(_localctx, 174, RULE_bool2int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908); match(35);
			setState(909); match(17);
			setState(910); expr(0);
			setState(911); match(92);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 176, RULE_alldifferent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913); match(41);
			setState(914); guardExprArg();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 178, RULE_array1d);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916); match(49);
			setState(917); match(17);
			setState(918); expr(0);
			setState(919); match(19);
			setState(920); expr(0);
			setState(921); match(92);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 180, RULE_guardExprArg);
		try {
			setState(925);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(923); twoSections();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(924); oneSection();
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
		enterRule(_localctx, 182, RULE_oneSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927); match(17);
			setState(928); listExpr(0);
			setState(929); match(92);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 184, RULE_twoSections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931); match(17);
			setState(932); inDecl();
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(933); match(19);
				setState(934); inDecl();
				}
				}
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(940); match(92);
			setState(941); match(17);
			setState(942); expr(0);
			setState(943); match(92);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 186, RULE_inDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945); match(ID);
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(946); match(19);
				setState(947); match(ID);
				}
				}
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(953); match(89);
			setState(954); setExpr(0);
			setState(956);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(955); whereCond();
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
		enterRule(_localctx, 188, RULE_whereCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958); match(84);
			setState(959); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 190, RULE_letExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961); match(39);
			setState(962); match(8);
			setState(963); letDecl();
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(964); match(19);
				setState(965); letDecl();
				}
				}
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(971); match(58);
			setState(972); match(89);
			setState(973); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 192, RULE_letDecl);
		try {
			setState(977);
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
				setState(975); decl();
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 2);
				{
				setState(976); constraint();
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
		enterRule(_localctx, 194, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979); match(59);
			setState(980); bodyIf();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 196, RULE_bodyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982); expr(0);
			setState(983); match(44);
			setState(984); expr(0);
			setState(987);
			switch (_input.LA(1)) {
			case 88:
				{
				setState(985); elseS();
				}
				break;
			case 51:
				{
				setState(986); elseifS();
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
		enterRule(_localctx, 198, RULE_elseS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989); match(88);
			setState(990); expr(0);
			setState(991); match(1);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 200, RULE_elseifS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993); match(51);
			setState(994); bodyIf();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 202, RULE_setVal);
		try {
			setState(999);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(996); bracketExpr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(997); range();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(998); guardedSet();
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
		enterRule(_localctx, 204, RULE_complexSetExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001); setExpr(0);
			setState(1002); infixSetOp();
			setState(1003); setExpr(0);
			}
		}
		catch (RecognitionException re) {
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
		int _startState = 206;
		enterRecursionRule(_localctx, 206, RULE_setExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1006); setVal();
			}
			_ctx.stop = _input.LT(-1);
			setState(1014);
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
					setState(1008);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1009); infixSetOp();
					setState(1010); setExpr(2);
					}
					} 
				}
				setState(1016);
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
		enterRule(_localctx, 208, RULE_bracketExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017); match(8);
			setState(1018); commaList();
			setState(1019); match(58);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 210, RULE_guardedSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021); match(8);
			setState(1022); commaList();
			setState(1023); match(76);
			setState(1024); guard();
			setState(1025); match(58);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 212, RULE_commaList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(1027); expr(0);
				setState(1032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(1028); match(19);
					setState(1029); expr(0);
					}
					}
					setState(1034);
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
		enterRule(_localctx, 214, RULE_guard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037); inDecl();
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(1038); match(19);
				setState(1039); inDecl();
				}
				}
				setState(1044);
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
		enterRule(_localctx, 216, RULE_range);
		try {
			setState(1050);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1045); fromR();
				setState(1046); match(9);
				setState(1047); toR();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1049); match(ID);
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
		enterRule(_localctx, 218, RULE_fromR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052); arithExpr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 220, RULE_toR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054); arithExpr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 222, RULE_rint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056); match(13);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 224, RULE_rfloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058); match(7);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 226, RULE_rbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060); match(79);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 228, RULE_integer);
		try {
			setState(1065);
			switch (_input.LA(1)) {
			case NAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062); match(NAT);
				}
				break;
			case 96:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063); match(96);
				setState(1064); match(NAT);
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
		enterRule(_localctx, 230, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067); integer();
			setState(1068); match(70);
			setState(1069); match(NAT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 232, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 48) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 53) | (1L << 54) | (1L << 55) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 61) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (67 - 64)) | (1L << (68 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (71 - 64)) | (1L << (72 - 64)) | (1L << (73 - 64)) | (1L << (74 - 64)) | (1L << (75 - 64)) | (1L << (76 - 64)) | (1L << (77 - 64)) | (1L << (78 - 64)) | (1L << (79 - 64)) | (1L << (80 - 64)) | (1L << (81 - 64)) | (1L << (82 - 64)) | (1L << (83 - 64)) | (1L << (84 - 64)) | (1L << (85 - 64)) | (1L << (86 - 64)) | (1L << (87 - 64)) | (1L << (88 - 64)) | (1L << (89 - 64)) | (1L << (90 - 64)) | (1L << (91 - 64)) | (1L << (92 - 64)) | (1L << (93 - 64)) | (1L << (94 - 64)) | (1L << (95 - 64)) | (1L << (96 - 64)) | (1L << (ESC - 64)) | (1L << (SINGLE_LINE_COMMENT - 64)) | (1L << (ID - 64)) | (1L << (NAT - 64)) | (1L << (WS - 64)) | (1L << (BOOL - 64)))) != 0)) {
				{
				{
				setState(1076);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(1071);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==66) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;

				case 2:
					{
					setState(1072); match(ESC);
					}
					break;

				case 3:
					{
					setState(1073); match(70);
					}
					break;

				case 4:
					{
					setState(1074); match(12);
					}
					break;

				case 5:
					{
					setState(1075); match(38);
					}
					break;
				}
				}
				}
				setState(1082);
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

		case 72: return listExpr_sempred((ListExprContext)_localctx, predIndex);

		case 103: return setExpr_sempred((SetExprContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3h\u043e\4\2\t\2\4"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\3"+
		"\2\3\2\3\2\6\2\u00f0\n\2\r\2\16\2\u00f1\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\u00fe\n\3\3\4\3\4\5\4\u0102\n\4\3\5\3\5\5\5\u0106\n\5\3"+
		"\5\3\5\5\5\u010a\n\5\3\6\3\6\5\6\u010e\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\7\7\u0117\n\7\f\7\16\7\u011a\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0124\n\b\3\b\3\b\3\b\5\b\u0129\n\b\3\t\3\t\3\t\3\t\7\t\u012f\n\t\f\t"+
		"\16\t\u0132\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0149\n\16\3\17\3\17\5\17"+
		"\u014d\n\17\3\17\3\17\5\17\u0151\n\17\3\20\5\20\u0154\n\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u015b\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u016a\n\23\f\23\16\23\u016d\13\23\5\23"+
		"\u016f\n\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u0177\n\24\3\24\3\24\3"+
		"\24\3\24\3\24\7\24\u017e\n\24\f\24\16\24\u0181\13\24\5\24\u0183\n\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u018d\n\25\3\26\3\26\3\27"+
		"\3\27\5\27\u0193\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\5\33\u01a2\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\5\37\u01af\n\37\3\37\3\37\3\37\3\37\7\37\u01b5\n\37\f"+
		"\37\16\37\u01b8\13\37\3\37\3\37\5\37\u01bc\n\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3!\3!\3\"\3\"\3#\3#\5#\u01ce\n#\3$\3$\3%\3%\3%\3%\3%\7%\u01d7"+
		"\n%\f%\16%\u01da\13%\3%\3%\3&\3&\3&\3&\3&\5&\u01e3\n&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3,\5,\u01f6\n,\3-\3-\3-\3-\3.\3.\3"+
		".\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u020a\n\60\f\60\16\60"+
		"\u020d\13\60\3\60\5\60\u0210\n\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\5\62\u022a\n\62\3\62\3\62\3\62\3\62\7\62\u0230\n\62\f\62"+
		"\16\62\u0233\13\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\5\63\u0241\n\63\3\64\3\64\5\64\u0245\n\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\38\38\39\39\39\39\3:\3:\3:\5:\u0258\n:\3:\3:\3:\3:\3"+
		":\5:\u025f\n:\3:\3:\3:\5:\u0264\n:\3;\3;\3;\3;\5;\u026a\n;\3;\3;\3;\3"+
		";\5;\u0270\n;\3;\3;\3;\5;\u0275\n;\3;\3;\7;\u0279\n;\f;\16;\u027c\13;"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u028a\n<\3=\3=\3=\3=\3=\5=\u0291"+
		"\n=\3>\3>\3>\5>\u0296\n>\3>\3>\3>\3>\7>\u029c\n>\f>\16>\u029f\13>\3?\3"+
		"?\3?\3@\3@\3@\3A\3A\3A\3A\3A\7A\u02ac\nA\fA\16A\u02af\13A\3A\3A\5A\u02b3"+
		"\nA\3B\3B\3B\3B\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\5E\u02c3\nE\3F\3F\3G\3G"+
		"\3G\3G\3G\7G\u02cc\nG\fG\16G\u02cf\13G\3G\3G\3G\3G\3G\3G\7G\u02d7\nG\f"+
		"G\16G\u02da\13G\5G\u02dc\nG\3G\3G\3G\3G\3G\7G\u02e3\nG\fG\16G\u02e6\13"+
		"G\3G\3G\5G\u02ea\nG\3H\3H\3H\3H\3H\3H\6H\u02f2\nH\rH\16H\u02f3\3H\3H\3"+
		"I\3I\3I\3I\3J\3J\3J\3J\5J\u0300\nJ\3J\3J\3J\7J\u0305\nJ\fJ\16J\u0308\13"+
		"J\3K\3K\5K\u030c\nK\3L\3L\3L\3L\7L\u0312\nL\fL\16L\u0315\13L\5L\u0317"+
		"\nL\3L\5L\u031a\nL\3L\3L\3M\3M\3M\3M\7M\u0322\nM\fM\16M\u0325\13M\5M\u0327"+
		"\nM\3M\3M\3M\3M\7M\u032d\nM\fM\16M\u0330\13M\3M\3M\3N\3N\3N\3N\7N\u0338"+
		"\nN\fN\16N\u033b\13N\5N\u033d\nN\3N\5N\u0340\nN\3N\3N\3N\3N\7N\u0346\n"+
		"N\fN\16N\u0349\13N\7N\u034b\nN\fN\16N\u034e\13N\3N\3N\3O\3O\3O\3O\3O\3"+
		"O\3O\5O\u0359\nO\3P\3P\3P\3P\3P\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u036b"+
		"\nR\3S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W"+
		"\u0382\nW\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u038d\nX\3Y\3Y\3Y\3Y\3Y\3Z\3Z"+
		"\3Z\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\5\\\u03a0\n\\\3]\3]\3]\3]\3^\3^\3^\3"+
		"^\7^\u03aa\n^\f^\16^\u03ad\13^\3^\3^\3^\3^\3^\3_\3_\3_\7_\u03b7\n_\f_"+
		"\16_\u03ba\13_\3_\3_\3_\5_\u03bf\n_\3`\3`\3`\3a\3a\3a\3a\3a\7a\u03c9\n"+
		"a\fa\16a\u03cc\13a\3a\3a\3a\3a\3b\3b\5b\u03d4\nb\3c\3c\3c\3d\3d\3d\3d"+
		"\3d\5d\u03de\nd\3e\3e\3e\3e\3f\3f\3f\3g\3g\3g\5g\u03ea\ng\3h\3h\3h\3h"+
		"\3i\3i\3i\3i\3i\3i\3i\7i\u03f7\ni\fi\16i\u03fa\13i\3j\3j\3j\3j\3k\3k\3"+
		"k\3k\3k\3k\3l\3l\3l\7l\u0409\nl\fl\16l\u040c\13l\5l\u040e\nl\3m\3m\3m"+
		"\7m\u0413\nm\fm\16m\u0416\13m\3n\3n\3n\3n\3n\5n\u041d\nn\3o\3o\3p\3p\3"+
		"q\3q\3r\3r\3s\3s\3t\3t\3t\5t\u042c\nt\3u\3u\3u\3u\3v\3v\3v\3v\3v\5v\u0437"+
		"\nv\7v\u0439\nv\fv\16v\u043c\13v\3v\2\7btz\u0092\u00d0w\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\2\t\5\2\33\33\35\35a"+
		"a\7\2\30\30\34\34&&\67\67XX\13\2\b\b\r\r\31\31\61\61??JJOOUU__\t\2\b\b"+
		"\r\r!\"BBOORR[[\b\2  //\62\62FFYYbb\4\2\22\22[\\\3\2DD\u0464\2\u00ef\3"+
		"\2\2\2\4\u00fd\3\2\2\2\6\u0101\3\2\2\2\b\u0105\3\2\2\2\n\u010d\3\2\2\2"+
		"\f\u010f\3\2\2\2\16\u011d\3\2\2\2\20\u012a\3\2\2\2\22\u0135\3\2\2\2\24"+
		"\u0137\3\2\2\2\26\u0139\3\2\2\2\30\u013c\3\2\2\2\32\u0148\3\2\2\2\34\u014a"+
		"\3\2\2\2\36\u0153\3\2\2\2 \u015c\3\2\2\2\"\u015f\3\2\2\2$\u0163\3\2\2"+
		"\2&\u0174\3\2\2\2(\u018c\3\2\2\2*\u018e\3\2\2\2,\u0192\3\2\2\2.\u0194"+
		"\3\2\2\2\60\u0197\3\2\2\2\62\u019a\3\2\2\2\64\u01a1\3\2\2\2\66\u01a3\3"+
		"\2\2\28\u01a6\3\2\2\2:\u01a9\3\2\2\2<\u01ac\3\2\2\2>\u01bd\3\2\2\2@\u01c7"+
		"\3\2\2\2B\u01c9\3\2\2\2D\u01cd\3\2\2\2F\u01cf\3\2\2\2H\u01d1\3\2\2\2J"+
		"\u01e2\3\2\2\2L\u01e4\3\2\2\2N\u01e6\3\2\2\2P\u01e8\3\2\2\2R\u01ea\3\2"+
		"\2\2T\u01ec\3\2\2\2V\u01f5\3\2\2\2X\u01f7\3\2\2\2Z\u01fb\3\2\2\2\\\u0200"+
		"\3\2\2\2^\u0205\3\2\2\2`\u0213\3\2\2\2b\u0229\3\2\2\2d\u0240\3\2\2\2f"+
		"\u0244\3\2\2\2h\u0246\3\2\2\2j\u0248\3\2\2\2l\u024a\3\2\2\2n\u024c\3\2"+
		"\2\2p\u0250\3\2\2\2r\u0263\3\2\2\2t\u026f\3\2\2\2v\u0289\3\2\2\2x\u0290"+
		"\3\2\2\2z\u0295\3\2\2\2|\u02a0\3\2\2\2~\u02a3\3\2\2\2\u0080\u02a6\3\2"+
		"\2\2\u0082\u02b4\3\2\2\2\u0084\u02b8\3\2\2\2\u0086\u02ba\3\2\2\2\u0088"+
		"\u02c2\3\2\2\2\u008a\u02c4\3\2\2\2\u008c\u02e9\3\2\2\2\u008e\u02eb\3\2"+
		"\2\2\u0090\u02f7\3\2\2\2\u0092\u02ff\3\2\2\2\u0094\u030b\3\2\2\2\u0096"+
		"\u030d\3\2\2\2\u0098\u031d\3\2\2\2\u009a\u0333\3\2\2\2\u009c\u0358\3\2"+
		"\2\2\u009e\u035a\3\2\2\2\u00a0\u035f\3\2\2\2\u00a2\u036a\3\2\2\2\u00a4"+
		"\u036c\3\2\2\2\u00a6\u036f\3\2\2\2\u00a8\u0372\3\2\2\2\u00aa\u0375\3\2"+
		"\2\2\u00ac\u0381\3\2\2\2\u00ae\u038c\3\2\2\2\u00b0\u038e\3\2\2\2\u00b2"+
		"\u0393\3\2\2\2\u00b4\u0396\3\2\2\2\u00b6\u039f\3\2\2\2\u00b8\u03a1\3\2"+
		"\2\2\u00ba\u03a5\3\2\2\2\u00bc\u03b3\3\2\2\2\u00be\u03c0\3\2\2\2\u00c0"+
		"\u03c3\3\2\2\2\u00c2\u03d3\3\2\2\2\u00c4\u03d5\3\2\2\2\u00c6\u03d8\3\2"+
		"\2\2\u00c8\u03df\3\2\2\2\u00ca\u03e3\3\2\2\2\u00cc\u03e9\3\2\2\2\u00ce"+
		"\u03eb\3\2\2\2\u00d0\u03ef\3\2\2\2\u00d2\u03fb\3\2\2\2\u00d4\u03ff\3\2"+
		"\2\2\u00d6\u040d\3\2\2\2\u00d8\u040f\3\2\2\2\u00da\u041c\3\2\2\2\u00dc"+
		"\u041e\3\2\2\2\u00de\u0420\3\2\2\2\u00e0\u0422\3\2\2\2\u00e2\u0424\3\2"+
		"\2\2\u00e4\u0426\3\2\2\2\u00e6\u042b\3\2\2\2\u00e8\u042d\3\2\2\2\u00ea"+
		"\u043a\3\2\2\2\u00ec\u00ed\5\4\3\2\u00ed\u00ee\78\2\2\u00ee\u00f0\3\2"+
		"\2\2\u00ef\u00ec\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\3\3\2\2\2\u00f3\u00fe\5\f\7\2\u00f4\u00fe\5\16\b"+
		"\2\u00f5\u00fe\5\26\f\2\u00f6\u00fe\5\6\4\2\u00f7\u00fe\5\34\17\2\u00f8"+
		"\u00fe\5\32\16\2\u00f9\u00fe\5$\23\2\u00fa\u00fe\5&\24\2\u00fb\u00fe\5"+
		" \21\2\u00fc\u00fe\5\"\22\2\u00fd\u00f3\3\2\2\2\u00fd\u00f4\3\2\2\2\u00fd"+
		"\u00f5\3\2\2\2\u00fd\u00f6\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00f8\3\2"+
		"\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\5\3\2\2\2\u00ff\u0102\5\b\5\2\u0100\u0102\5\n\6\2"+
		"\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102\7\3\2\2\2\u0103\u0106\5"+
		"\30\r\2\u0104\u0106\5Z.\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0108\7\r\2\2\u0108\u010a\5b\62\2\u0109\u0107\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\t\3\2\2\2\u010b\u010e\5\36\20\2\u010c\u010e"+
		"\5\\/\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\13\3\2\2\2\u010f"+
		"\u0110\7@\2\2\u0110\u0111\7e\2\2\u0111\u0112\7\r\2\2\u0112\u0113\7\n\2"+
		"\2\u0113\u0118\5D#\2\u0114\u0115\7\25\2\2\u0115\u0117\5D#\2\u0116\u0114"+
		"\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7<\2\2\u011c\r\3\2\2\2"+
		"\u011d\u011e\7\26\2\2\u011e\u011f\7e\2\2\u011f\u0123\7\r\2\2\u0120\u0121"+
		"\5\22\n\2\u0121\u0122\7#\2\2\u0122\u0124\3\2\2\2\u0123\u0120\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0128\5V,\2\u0126\u0127\7#\2"+
		"\2\u0127\u0129\5\24\13\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\17\3\2\2\2\u012a\u012b\7M\2\2\u012b\u0130\7e\2\2\u012c\u012d\7\25\2\2"+
		"\u012d\u012f\7e\2\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133"+
		"\u0134\7$\2\2\u0134\21\3\2\2\2\u0135\u0136\5\20\t\2\u0136\23\3\2\2\2\u0137"+
		"\u0138\5\20\t\2\u0138\25\3\2\2\2\u0139\u013a\7E\2\2\u013a\u013b\5b\62"+
		"\2\u013b\27\3\2\2\2\u013c\u013d\7\32\2\2\u013d\u013e\5V,\2\u013e\u013f"+
		"\7L\2\2\u013f\u0140\7e\2\2\u0140\31\3\2\2\2\u0141\u0142\7\27\2\2\u0142"+
		"\u0143\7\23\2\2\u0143\u0144\5\u0092J\2\u0144\u0145\7^\2\2\u0145\u0149"+
		"\3\2\2\2\u0146\u0147\7\27\2\2\u0147\u0149\5\u0092J\2\u0148\u0141\3\2\2"+
		"\2\u0148\u0146\3\2\2\2\u0149\33\3\2\2\2\u014a\u014c\7>\2\2\u014b\u014d"+
		"\5\62\32\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0150\3\2\2\2"+
		"\u014e\u0151\5*\26\2\u014f\u0151\5,\27\2\u0150\u014e\3\2\2\2\u0150\u014f"+
		"\3\2\2\2\u0151\35\3\2\2\2\u0152\u0154\7K\2\2\u0153\u0152\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\5V,\2\u0156\u0157\7L\2"+
		"\2\u0157\u015a\7e\2\2\u0158\u0159\7\r\2\2\u0159\u015b\5b\62\2\u015a\u0158"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\37\3\2\2\2\u015c\u015d\7\21\2\2\u015d"+
		"\u015e\5\u0086D\2\u015e!\3\2\2\2\u015f\u0160\7e\2\2\u0160\u0161\7\r\2"+
		"\2\u0161\u0162\5b\62\2\u0162#\3\2\2\2\u0163\u0164\7:\2\2\u0164\u0165\7"+
		"e\2\2\u0165\u016e\7\23\2\2\u0166\u016b\5\6\4\2\u0167\u0168\7\25\2\2\u0168"+
		"\u016a\5\6\4\2\u0169\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u0166\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7^"+
		"\2\2\u0171\u0172\7\r\2\2\u0172\u0173\5b\62\2\u0173%\3\2\2\2\u0174\u0176"+
		"\7,\2\2\u0175\u0177\7\32\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u0179\5(\25\2\u0179\u0182\7\23\2\2\u017a\u017f\5"+
		"\6\4\2\u017b\u017c\7\25\2\2\u017c\u017e\5\6\4\2\u017d\u017b\3\2\2\2\u017e"+
		"\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0183\3\2"+
		"\2\2\u0181\u017f\3\2\2\2\u0182\u017a\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0185\7^\2\2\u0185\u0186\7\r\2\2\u0186\u0187\5b\62"+
		"\2\u0187\'\3\2\2\2\u0188\u018d\7e\2\2\u0189\u018a\7e\2\2\u018a\u018b\7"+
		"L\2\2\u018b\u018d\5f\64\2\u018c\u0188\3\2\2\2\u018c\u0189\3\2\2\2\u018d"+
		")\3\2\2\2\u018e\u018f\7W\2\2\u018f+\3\2\2\2\u0190\u0193\5.\30\2\u0191"+
		"\u0193\5\60\31\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193-\3\2\2"+
		"\2\u0194\u0195\7\4\2\2\u0195\u0196\5b\62\2\u0196/\3\2\2\2\u0197\u0198"+
		"\7\6\2\2\u0198\u0199\5b\62\2\u0199\61\3\2\2\2\u019a\u019b\7\f\2\2\u019b"+
		"\u019c\5\64\33\2\u019c\63\3\2\2\2\u019d\u01a2\5\66\34\2\u019e\u01a2\5"+
		"8\35\2\u019f\u01a2\5:\36\2\u01a0\u01a2\5<\37\2\u01a1\u019d\3\2\2\2\u01a1"+
		"\u019e\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\65\3\2\2"+
		"\2\u01a3\u01a4\7\5\2\2\u01a4\u01a5\5> \2\u01a5\67\3\2\2\2\u01a6\u01a7"+
		"\7\20\2\2\u01a7\u01a8\5> \2\u01a89\3\2\2\2\u01a9\u01aa\7;\2\2\u01aa\u01ab"+
		"\5> \2\u01ab;\3\2\2\2\u01ac\u01ae\7-\2\2\u01ad\u01af\7\23\2\2\u01ae\u01ad"+
		"\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\7M\2\2\u01b1"+
		"\u01b6\5\64\33\2\u01b2\u01b3\7\25\2\2\u01b3\u01b5\5\64\33\2\u01b4\u01b2"+
		"\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bb\7$\2\2\u01ba\u01bc\7^\2"+
		"\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc=\3\2\2\2\u01bd\u01be"+
		"\7\23\2\2\u01be\u01bf\5b\62\2\u01bf\u01c0\7\25\2\2\u01c0\u01c1\5@!\2\u01c1"+
		"\u01c2\7\25\2\2\u01c2\u01c3\5B\"\2\u01c3\u01c4\7\25\2\2\u01c4\u01c5\7"+
		"\36\2\2\u01c5\u01c6\7^\2\2\u01c6?\3\2\2\2\u01c7\u01c8\t\2\2\2\u01c8A\3"+
		"\2\2\2\u01c9\u01ca\t\3\2\2\u01caC\3\2\2\2\u01cb\u01ce\5F$\2\u01cc\u01ce"+
		"\5H%\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ceE\3\2\2\2\u01cf\u01d0"+
		"\7e\2\2\u01d0G\3\2\2\2\u01d1\u01d2\7e\2\2\u01d2\u01d3\7\23\2\2\u01d3\u01d8"+
		"\5J&\2\u01d4\u01d5\7\25\2\2\u01d5\u01d7\5J&\2\u01d6\u01d4\3\2\2\2\u01d7"+
		"\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\3\2"+
		"\2\2\u01da\u01d8\3\2\2\2\u01db\u01dc\7^\2\2\u01dcI\3\2\2\2\u01dd\u01e3"+
		"\5L\'\2\u01de\u01e3\5N(\2\u01df\u01e3\5P)\2\u01e0\u01e3\5R*\2\u01e1\u01e3"+
		"\5T+\2\u01e2\u01dd\3\2\2\2\u01e2\u01de\3\2\2\2\u01e2\u01df\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3K\3\2\2\2\u01e4\u01e5\5\u00e0"+
		"q\2\u01e5M\3\2\2\2\u01e6\u01e7\5\u00e2r\2\u01e7O\3\2\2\2\u01e8\u01e9\5"+
		"\u00e4s\2\u01e9Q\3\2\2\2\u01ea\u01eb\7e\2\2\u01ebS\3\2\2\2\u01ec\u01ed"+
		"\5\u00dan\2\u01edU\3\2\2\2\u01ee\u01f6\5\u00e0q\2\u01ef\u01f6\5\u00e4"+
		"s\2\u01f0\u01f6\5\u00e2r\2\u01f1\u01f6\7e\2\2\u01f2\u01f6\5`\61\2\u01f3"+
		"\u01f6\5\u00dan\2\u01f4\u01f6\5X-\2\u01f5\u01ee\3\2\2\2\u01f5\u01ef\3"+
		"\2\2\2\u01f5\u01f0\3\2\2\2\u01f5\u01f1\3\2\2\2\u01f5\u01f2\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6W\3\2\2\2\u01f7\u01f8\7\7\2\2"+
		"\u01f8\u01f9\7\64\2\2\u01f9\u01fa\5V,\2\u01faY\3\2\2\2\u01fb\u01fc\7\60"+
		"\2\2\u01fc\u01fd\5^\60\2\u01fd\u01fe\7\64\2\2\u01fe\u01ff\5\30\r\2\u01ff"+
		"[\3\2\2\2\u0200\u0201\7\60\2\2\u0201\u0202\5^\60\2\u0202\u0203\7\64\2"+
		"\2\u0203\u0204\5\36\20\2\u0204]\3\2\2\2\u0205\u020f\7M\2\2\u0206\u020b"+
		"\5\u00dan\2\u0207\u0208\7\25\2\2\u0208\u020a\5\u00dan\2\u0209\u0207\3"+
		"\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u0210\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u0210\7\17\2\2\u020f\u0206\3"+
		"\2\2\2\u020f\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\7$\2\2\u0212"+
		"_\3\2\2\2\u0213\u0214\7e\2\2\u0214\u0215\7\23\2\2\u0215\u0216\5b\62\2"+
		"\u0216\u0217\7^\2\2\u0217a\3\2\2\2\u0218\u022a\b\62\1\2\u0219\u022a\5"+
		"\u0082B\2\u021a\u022a\5r:\2\u021b\u022a\5x=\2\u021c\u022a\5\u00d0i\2\u021d"+
		"\u022a\5\u0092J\2\u021e\u022a\5\u00c4c\2\u021f\u022a\5\u00c0a\2\u0220"+
		"\u022a\5\u00a2R\2\u0221\u022a\5\u0080A\2\u0222\u022a\5\u0086D\2\u0223"+
		"\u022a\5\u008eH\2\u0224\u022a\7h\2\2\u0225\u022a\5\u00e8u\2\u0226\u022a"+
		"\5\u00e6t\2\u0227\u022a\7e\2\2\u0228\u022a\7T\2\2\u0229\u0218\3\2\2\2"+
		"\u0229\u0219\3\2\2\2\u0229\u021a\3\2\2\2\u0229\u021b\3\2\2\2\u0229\u021c"+
		"\3\2\2\2\u0229\u021d\3\2\2\2\u0229\u021e\3\2\2\2\u0229\u021f\3\2\2\2\u0229"+
		"\u0220\3\2\2\2\u0229\u0221\3\2\2\2\u0229\u0222\3\2\2\2\u0229\u0223\3\2"+
		"\2\2\u0229\u0224\3\2\2\2\u0229\u0225\3\2\2\2\u0229\u0226\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u0229\u0228\3\2\2\2\u022a\u0231\3\2\2\2\u022b\u022c\f\16"+
		"\2\2\u022c\u022d\5\u0088E\2\u022d\u022e\5b\62\17\u022e\u0230\3\2\2\2\u022f"+
		"\u022b\3\2\2\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2"+
		"\2\2\u0232c\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0241\3\2\2\2\u0235\u0236"+
		"\7\23\2\2\u0236\u0237\5t;\2\u0237\u0238\7^\2\2\u0238\u0241\3\2\2\2\u0239"+
		"\u0241\7e\2\2\u023a\u0241\7h\2\2\u023b\u0241\5\u008cG\2\u023c\u0241\5"+
		"\u00c4c\2\u023d\u0241\5\u00c0a\2\u023e\u0241\5\u0080A\2\u023f\u0241\5"+
		"\u00a2R\2\u0240\u0234\3\2\2\2\u0240\u0235\3\2\2\2\u0240\u0239\3\2\2\2"+
		"\u0240\u023a\3\2\2\2\u0240\u023b\3\2\2\2\u0240\u023c\3\2\2\2\u0240\u023d"+
		"\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u023f\3\2\2\2\u0241e\3\2\2\2\u0242"+
		"\u0245\5h\65\2\u0243\u0245\5j\66\2\u0244\u0242\3\2\2\2\u0244\u0243\3\2"+
		"\2\2\u0245g\3\2\2\2\u0246\u0247\t\4\2\2\u0247i\3\2\2\2\u0248\u0249\t\5"+
		"\2\2\u0249k\3\2\2\2\u024a\u024b\t\6\2\2\u024bm\3\2\2\2\u024c\u024d\7e"+
		"\2\2\u024d\u024e\7L\2\2\u024e\u024f\5h\65\2\u024fo\3\2\2\2\u0250\u0251"+
		"\7e\2\2\u0251\u0252\7L\2\2\u0252\u0253\5j\66\2\u0253q\3\2\2\2\u0254\u0257"+
		"\5t;\2\u0255\u0258\5h\65\2\u0256\u0258\5n8\2\u0257\u0255\3\2\2\2\u0257"+
		"\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\5t;\2\u025a\u0264\3\2\2"+
		"\2\u025b\u025e\5z>\2\u025c\u025f\5j\66\2\u025d\u025f\5p9\2\u025e\u025c"+
		"\3\2\2\2\u025e\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\5z>\2\u0261"+
		"\u0264\3\2\2\2\u0262\u0264\5|?\2\u0263\u0254\3\2\2\2\u0263\u025b\3\2\2"+
		"\2\u0263\u0262\3\2\2\2\u0264s\3\2\2\2\u0265\u0266\b;\1\2\u0266\u0269\5"+
		"z>\2\u0267\u026a\5j\66\2\u0268\u026a\5p9\2\u0269\u0267\3\2\2\2\u0269\u0268"+
		"\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\5b\62\2\u026c\u0270\3\2\2\2\u026d"+
		"\u0270\5|?\2\u026e\u0270\5d\63\2\u026f\u0265\3\2\2\2\u026f\u026d\3\2\2"+
		"\2\u026f\u026e\3\2\2\2\u0270\u027a\3\2\2\2\u0271\u0274\f\6\2\2\u0272\u0275"+
		"\5h\65\2\u0273\u0275\5n8\2\u0274\u0272\3\2\2\2\u0274\u0273\3\2\2\2\u0275"+
		"\u0276\3\2\2\2\u0276\u0277\5t;\7\u0277\u0279\3\2\2\2\u0278\u0271\3\2\2"+
		"\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027bu"+
		"\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u028a\7e\2\2\u027e\u028a\5\u00e6t\2"+
		"\u027f\u028a\5\u00e8u\2\u0280\u028a\5\u008cG\2\u0281\u028a\5\u00c4c\2"+
		"\u0282\u028a\5\u00c0a\2\u0283\u0284\7\23\2\2\u0284\u0285\5z>\2\u0285\u0286"+
		"\7^\2\2\u0286\u028a\3\2\2\2\u0287\u028a\5\u0080A\2\u0288\u028a\5\u00a0"+
		"Q\2\u0289\u027d\3\2\2\2\u0289\u027e\3\2\2\2\u0289\u027f\3\2\2\2\u0289"+
		"\u0280\3\2\2\2\u0289\u0281\3\2\2\2\u0289\u0282\3\2\2\2\u0289\u0283\3\2"+
		"\2\2\u0289\u0287\3\2\2\2\u0289\u0288\3\2\2\2\u028aw\3\2\2\2\u028b\u0291"+
		"\5~@\2\u028c\u028d\5z>\2\u028d\u028e\5l\67\2\u028e\u028f\5z>\2\u028f\u0291"+
		"\3\2\2\2\u0290\u028b\3\2\2\2\u0290\u028c\3\2\2\2\u0291y\3\2\2\2\u0292"+
		"\u0293\b>\1\2\u0293\u0296\5~@\2\u0294\u0296\5v<\2\u0295\u0292\3\2\2\2"+
		"\u0295\u0294\3\2\2\2\u0296\u029d\3\2\2\2\u0297\u0298\f\4\2\2\u0298\u0299"+
		"\5l\67\2\u0299\u029a\5z>\5\u029a\u029c\3\2\2\2\u029b\u0297\3\2\2\2\u029c"+
		"\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e{\3\2\2\2"+
		"\u029f\u029d\3\2\2\2\u02a0\u02a1\7`\2\2\u02a1\u02a2\5b\62\2\u02a2}\3\2"+
		"\2\2\u02a3\u02a4\7b\2\2\u02a4\u02a5\5z>\2\u02a5\177\3\2\2\2\u02a6\u02b2"+
		"\7e\2\2\u02a7\u02a8\7\23\2\2\u02a8\u02ad\5b\62\2\u02a9\u02aa\7\25\2\2"+
		"\u02aa\u02ac\5b\62\2\u02ab\u02a9\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab"+
		"\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0"+
		"\u02b1\7^\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02a7\3\2\2\2\u02b2\u02b3\3\2"+
		"\2\2\u02b3\u0081\3\2\2\2\u02b4\u02b5\7\23\2\2\u02b5\u02b6\5b\62\2\u02b6"+
		"\u02b7\7^\2\2\u02b7\u0083\3\2\2\2\u02b8\u02b9\7e\2\2\u02b9\u0085\3\2\2"+
		"\2\u02ba\u02bb\7D\2\2\u02bb\u02bc\5\u00eav\2\u02bc\u02bd\7D\2\2\u02bd"+
		"\u0087\3\2\2\2\u02be\u02bf\7A\2\2\u02bf\u02c0\7e\2\2\u02c0\u02c3\7A\2"+
		"\2\u02c1\u02c3\5\u008aF\2\u02c2\u02be\3\2\2\2\u02c2\u02c1\3\2\2\2\u02c3"+
		"\u0089\3\2\2\2\u02c4\u02c5\t\7\2\2\u02c5\u008b\3\2\2\2\u02c6\u02c7\7e"+
		"\2\2\u02c7\u02c8\7M\2\2\u02c8\u02cd\5b\62\2\u02c9\u02ca\7\25\2\2\u02ca"+
		"\u02cc\5b\62\2\u02cb\u02c9\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2"+
		"\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0"+
		"\u02d1\7$\2\2\u02d1\u02ea\3\2\2\2\u02d2\u02db\7M\2\2\u02d3\u02d8\5b\62"+
		"\2\u02d4\u02d5\7\25\2\2\u02d5\u02d7\5b\62\2\u02d6\u02d4\3\2\2\2\u02d7"+
		"\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02dc\3\2"+
		"\2\2\u02da\u02d8\3\2\2\2\u02db\u02d3\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u02dd\3\2\2\2\u02dd\u02de\7$\2\2\u02de\u02df\7M\2\2\u02df\u02e4\5b\62"+
		"\2\u02e0\u02e1\7\25\2\2\u02e1\u02e3\5b\62\2\u02e2\u02e0\3\2\2\2\u02e3"+
		"\u02e6\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e7\3\2"+
		"\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02e8\7$\2\2\u02e8\u02ea\3\2\2\2\u02e9"+
		"\u02c6\3\2\2\2\u02e9\u02d2\3\2\2\2\u02ea\u008d\3\2\2\2\u02eb\u02ec\7I"+
		"\2\2\u02ec\u02ed\7e\2\2\u02ed\u02f1\7\64\2\2\u02ee\u02ef\5\u0090I\2\u02ef"+
		"\u02f0\78\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ee\3\2\2\2\u02f2\u02f3\3\2"+
		"\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u02f6\7\37\2\2\u02f6\u008f\3\2\2\2\u02f7\u02f8\5\u0080A\2\u02f8\u02f9"+
		"\7*\2\2\u02f9\u02fa\5b\62\2\u02fa\u0091\3\2\2\2\u02fb\u02fc\bJ\1\2\u02fc"+
		"\u0300\5\u009cO\2\u02fd\u0300\5\u0094K\2\u02fe\u0300\5\u009aN\2\u02ff"+
		"\u02fb\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300\u0306\3\2"+
		"\2\2\u0301\u0302\f\5\2\2\u0302\u0303\7#\2\2\u0303\u0305\5b\62\2\u0304"+
		"\u0301\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2"+
		"\2\2\u0307\u0093\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030c\5\u0096L\2\u030a"+
		"\u030c\5\u0098M\2\u030b\u0309\3\2\2\2\u030b\u030a\3\2\2\2\u030c\u0095"+
		"\3\2\2\2\u030d\u0316\7M\2\2\u030e\u0313\5b\62\2\u030f\u0310\7\25\2\2\u0310"+
		"\u0312\5b\62\2\u0311\u030f\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2"+
		"\2\2\u0313\u0314\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0316"+
		"\u030e\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0319\3\2\2\2\u0318\u031a\7\25"+
		"\2\2\u0319\u0318\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		"\u031c\7$\2\2\u031c\u0097\3\2\2\2\u031d\u0326\7M\2\2\u031e\u0323\5b\62"+
		"\2\u031f\u0320\7\25\2\2\u0320\u0322\5b\62\2\u0321\u031f\3\2\2\2\u0322"+
		"\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0327\3\2"+
		"\2\2\u0325\u0323\3\2\2\2\u0326\u031e\3\2\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u0328\3\2\2\2\u0328\u0329\7N\2\2\u0329\u032e\5\u00bc_\2\u032a\u032b\7"+
		"\25\2\2\u032b\u032d\5\u00bc_\2\u032c\u032a\3\2\2\2\u032d\u0330\3\2\2\2"+
		"\u032e\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0331\3\2\2\2\u0330\u032e"+
		"\3\2\2\2\u0331\u0332\7$\2\2\u0332\u0099\3\2\2\2\u0333\u033c\7C\2\2\u0334"+
		"\u0339\5b\62\2\u0335\u0336\7\25\2\2\u0336\u0338\5b\62\2\u0337\u0335\3"+
		"\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a"+
		"\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u0334\3\2\2\2\u033c\u033d\3\2"+
		"\2\2\u033d\u034c\3\2\2\2\u033e\u0340\7\25\2\2\u033f\u033e\3\2\2\2\u033f"+
		"\u0340\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0342\7N\2\2\u0342\u0347\5b\62"+
		"\2\u0343\u0344\7\25\2\2\u0344\u0346\5b\62\2\u0345\u0343\3\2\2\2\u0346"+
		"\u0349\3\2\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u034b\3\2"+
		"\2\2\u0349\u0347\3\2\2\2\u034a\u033f\3\2\2\2\u034b\u034e\3\2\2\2\u034c"+
		"\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f\3\2\2\2\u034e\u034c\3\2"+
		"\2\2\u034f\u0350\7\'\2\2\u0350\u009b\3\2\2\2\u0351\u0359\5\u0086D\2\u0352"+
		"\u0359\7e\2\2\u0353\u0359\5\u00c4c\2\u0354\u0359\5\u008cG\2\u0355\u0359"+
		"\5\u009eP\2\u0356\u0359\5\u00bc_\2\u0357\u0359\5\u00a0Q\2\u0358\u0351"+
		"\3\2\2\2\u0358\u0352\3\2\2\2\u0358\u0353\3\2\2\2\u0358\u0354\3\2\2\2\u0358"+
		"\u0355\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0357\3\2\2\2\u0359\u009d\3\2"+
		"\2\2\u035a\u035b\7P\2\2\u035b\u035c\7\23\2\2\u035c\u035d\5b\62\2\u035d"+
		"\u035e\7^\2\2\u035e\u009f\3\2\2\2\u035f\u0360\5\u00a2R\2\u0360\u00a1\3"+
		"\2\2\2\u0361\u036b\5\u00a4S\2\u0362\u036b\5\u00a6T\2\u0363\u036b\5\u00a8"+
		"U\2\u0364\u036b\5\u00aaV\2\u0365\u036b\5\u00acW\2\u0366\u036b\5\u00ae"+
		"X\2\u0367\u036b\5\u00b0Y\2\u0368\u036b\5\u00b2Z\2\u0369\u036b\5\u00b4"+
		"[\2\u036a\u0361\3\2\2\2\u036a\u0362\3\2\2\2\u036a\u0363\3\2\2\2\u036a"+
		"\u0364\3\2\2\2\u036a\u0365\3\2\2\2\u036a\u0366\3\2\2\2\u036a\u0367\3\2"+
		"\2\2\u036a\u0368\3\2\2\2\u036a\u0369\3\2\2\2\u036b\u00a3\3\2\2\2\u036c"+
		"\u036d\7S\2\2\u036d\u036e\5\u00b6\\\2\u036e\u00a5\3\2\2\2\u036f\u0370"+
		"\7G\2\2\u0370\u0371\5\u00b6\\\2\u0371\u00a7\3\2\2\2\u0372\u0373\7\66\2"+
		"\2\u0373\u0374\5\u00b6\\\2\u0374\u00a9\3\2\2\2\u0375\u0376\7]\2\2\u0376"+
		"\u0377\5\u00b6\\\2\u0377\u00ab\3\2\2\2\u0378\u0379\79\2\2\u0379\u0382"+
		"\5\u00b6\\\2\u037a\u037b\79\2\2\u037b\u037c\7\23\2\2\u037c\u037d\5b\62"+
		"\2\u037d\u037e\7\25\2\2\u037e\u037f\5b\62\2\u037f\u0380\7^\2\2\u0380\u0382"+
		"\3\2\2\2\u0381\u0378\3\2\2\2\u0381\u037a\3\2\2\2\u0382\u00ad\3\2\2\2\u0383"+
		"\u0384\7\24\2\2\u0384\u038d\5\u00b6\\\2\u0385\u0386\79\2\2\u0386\u0387"+
		"\7\23\2\2\u0387\u0388\5b\62\2\u0388\u0389\7\25\2\2\u0389\u038a\5b\62\2"+
		"\u038a\u038b\7^\2\2\u038b\u038d\3\2\2\2\u038c\u0383\3\2\2\2\u038c\u0385"+
		"\3\2\2\2\u038d\u00af\3\2\2\2\u038e\u038f\7%\2\2\u038f\u0390\7\23\2\2\u0390"+
		"\u0391\5b\62\2\u0391\u0392\7^\2\2\u0392\u00b1\3\2\2\2\u0393\u0394\7+\2"+
		"\2\u0394\u0395\5\u00b6\\\2\u0395\u00b3\3\2\2\2\u0396\u0397\7\63\2\2\u0397"+
		"\u0398\7\23\2\2\u0398\u0399\5b\62\2\u0399\u039a\7\25\2\2\u039a\u039b\5"+
		"b\62\2\u039b\u039c\7^\2\2\u039c\u00b5\3\2\2\2\u039d\u03a0\5\u00ba^\2\u039e"+
		"\u03a0\5\u00b8]\2\u039f\u039d\3\2\2\2\u039f\u039e\3\2\2\2\u03a0\u00b7"+
		"\3\2\2\2\u03a1\u03a2\7\23\2\2\u03a2\u03a3\5\u0092J\2\u03a3\u03a4\7^\2"+
		"\2\u03a4\u00b9\3\2\2\2\u03a5\u03a6\7\23\2\2\u03a6\u03ab\5\u00bc_\2\u03a7"+
		"\u03a8\7\25\2\2\u03a8\u03aa\5\u00bc_\2\u03a9\u03a7\3\2\2\2\u03aa\u03ad"+
		"\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ae\3\2\2\2\u03ad"+
		"\u03ab\3\2\2\2\u03ae\u03af\7^\2\2\u03af\u03b0\7\23\2\2\u03b0\u03b1\5b"+
		"\62\2\u03b1\u03b2\7^\2\2\u03b2\u00bb\3\2\2\2\u03b3\u03b8\7e\2\2\u03b4"+
		"\u03b5\7\25\2\2\u03b5\u03b7\7e\2\2\u03b6\u03b4\3\2\2\2\u03b7\u03ba\3\2"+
		"\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03bb\3\2\2\2\u03ba"+
		"\u03b8\3\2\2\2\u03bb\u03bc\7[\2\2\u03bc\u03be\5\u00d0i\2\u03bd\u03bf\5"+
		"\u00be`\2\u03be\u03bd\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u00bd\3\2\2\2"+
		"\u03c0\u03c1\7V\2\2\u03c1\u03c2\5b\62\2\u03c2\u00bf\3\2\2\2\u03c3\u03c4"+
		"\7)\2\2\u03c4\u03c5\7\n\2\2\u03c5\u03ca\5\u00c2b\2\u03c6\u03c7\7\25\2"+
		"\2\u03c7\u03c9\5\u00c2b\2\u03c8\u03c6\3\2\2\2\u03c9\u03cc\3\2\2\2\u03ca"+
		"\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cd\3\2\2\2\u03cc\u03ca\3\2"+
		"\2\2\u03cd\u03ce\7<\2\2\u03ce\u03cf\7[\2\2\u03cf\u03d0\5b\62\2\u03d0\u00c1"+
		"\3\2\2\2\u03d1\u03d4\5\6\4\2\u03d2\u03d4\5\26\f\2\u03d3\u03d1\3\2\2\2"+
		"\u03d3\u03d2\3\2\2\2\u03d4\u00c3\3\2\2\2\u03d5\u03d6\7=\2\2\u03d6\u03d7"+
		"\5\u00c6d\2\u03d7\u00c5\3\2\2\2\u03d8\u03d9\5b\62\2\u03d9\u03da\7.\2\2"+
		"\u03da\u03dd\5b\62\2\u03db\u03de\5\u00c8e\2\u03dc\u03de\5\u00caf\2\u03dd"+
		"\u03db\3\2\2\2\u03dd\u03dc\3\2\2\2\u03de\u00c7\3\2\2\2\u03df\u03e0\7Z"+
		"\2\2\u03e0\u03e1\5b\62\2\u03e1\u03e2\7\3\2\2\u03e2\u00c9\3\2\2\2\u03e3"+
		"\u03e4\7\65\2\2\u03e4\u03e5\5\u00c6d\2\u03e5\u00cb\3\2\2\2\u03e6\u03ea"+
		"\5\u00d2j\2\u03e7\u03ea\5\u00dan\2\u03e8\u03ea\5\u00d4k\2\u03e9\u03e6"+
		"\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03e8\3\2\2\2\u03ea\u00cd\3\2\2\2\u03eb"+
		"\u03ec\5\u00d0i\2\u03ec\u03ed\5\u008aF\2\u03ed\u03ee\5\u00d0i\2\u03ee"+
		"\u00cf\3\2\2\2\u03ef\u03f0\bi\1\2\u03f0\u03f1\5\u00ccg\2\u03f1\u03f8\3"+
		"\2\2\2\u03f2\u03f3\f\3\2\2\u03f3\u03f4\5\u008aF\2\u03f4\u03f5\5\u00d0"+
		"i\4\u03f5\u03f7\3\2\2\2\u03f6\u03f2\3\2\2\2\u03f7\u03fa\3\2\2\2\u03f8"+
		"\u03f6\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u00d1\3\2\2\2\u03fa\u03f8\3\2"+
		"\2\2\u03fb\u03fc\7\n\2\2\u03fc\u03fd\5\u00d6l\2\u03fd\u03fe\7<\2\2\u03fe"+
		"\u00d3\3\2\2\2\u03ff\u0400\7\n\2\2\u0400\u0401\5\u00d6l\2\u0401\u0402"+
		"\7N\2\2\u0402\u0403\5\u00d8m\2\u0403\u0404\7<\2\2\u0404\u00d5\3\2\2\2"+
		"\u0405\u040a\5b\62\2\u0406\u0407\7\25\2\2\u0407\u0409\5b\62\2\u0408\u0406"+
		"\3\2\2\2\u0409\u040c\3\2\2\2\u040a\u0408\3\2\2\2\u040a\u040b\3\2\2\2\u040b"+
		"\u040e\3\2\2\2\u040c\u040a\3\2\2\2\u040d\u0405\3\2\2\2\u040d\u040e\3\2"+
		"\2\2\u040e\u00d7\3\2\2\2\u040f\u0414\5\u00bc_\2\u0410\u0411\7\25\2\2\u0411"+
		"\u0413\5\u00bc_\2\u0412\u0410\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412"+
		"\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u00d9\3\2\2\2\u0416\u0414\3\2\2\2\u0417"+
		"\u0418\5\u00dco\2\u0418\u0419\7\13\2\2\u0419\u041a\5\u00dep\2\u041a\u041d"+
		"\3\2\2\2\u041b\u041d\7e\2\2\u041c\u0417\3\2\2\2\u041c\u041b\3\2\2\2\u041d"+
		"\u00db\3\2\2\2\u041e\u041f\5z>\2\u041f\u00dd\3\2\2\2\u0420\u0421\5z>\2"+
		"\u0421\u00df\3\2\2\2\u0422\u0423\7\17\2\2\u0423\u00e1\3\2\2\2\u0424\u0425"+
		"\7\t\2\2\u0425\u00e3\3\2\2\2\u0426\u0427\7Q\2\2\u0427\u00e5\3\2\2\2\u0428"+
		"\u042c\7f\2\2\u0429\u042a\7b\2\2\u042a\u042c\7f\2\2\u042b\u0428\3\2\2"+
		"\2\u042b\u0429\3\2\2\2\u042c\u00e7\3\2\2\2\u042d\u042e\5\u00e6t\2\u042e"+
		"\u042f\7H\2\2\u042f\u0430\7f\2\2\u0430\u00e9\3\2\2\2\u0431\u0437\n\b\2"+
		"\2\u0432\u0437\7c\2\2\u0433\u0437\7H\2\2\u0434\u0437\7\16\2\2\u0435\u0437"+
		"\7(\2\2\u0436\u0431\3\2\2\2\u0436\u0432\3\2\2\2\u0436\u0433\3\2\2\2\u0436"+
		"\u0434\3\2\2\2\u0436\u0435\3\2\2\2\u0437\u0439\3\2\2\2\u0438\u0436\3\2"+
		"\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b\3\2\2\2\u043b"+
		"\u00eb\3\2\2\2\u043c\u043a\3\2\2\2\\\u00f1\u00fd\u0101\u0105\u0109\u010d"+
		"\u0118\u0123\u0128\u0130\u0148\u014c\u0150\u0153\u015a\u016b\u016e\u0176"+
		"\u017f\u0182\u018c\u0192\u01a1\u01ae\u01b6\u01bb\u01cd\u01d8\u01e2\u01f5"+
		"\u020b\u020f\u0229\u0231\u0240\u0244\u0257\u025e\u0263\u0269\u026f\u0274"+
		"\u027a\u0289\u0290\u0295\u029d\u02ad\u02b2\u02c2\u02cd\u02d8\u02db\u02e4"+
		"\u02e9\u02f3\u02ff\u0306\u030b\u0313\u0316\u0319\u0323\u0326\u032e\u0339"+
		"\u033c\u033f\u0347\u034c\u0358\u036a\u0381\u038c\u039f\u03ab\u03b8\u03be"+
		"\u03ca\u03d3\u03dd\u03e9\u03f8\u040a\u040d\u0414\u041c\u042b\u0436\u043a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}