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
		RULE_listValue = 80, RULE_functionExpr = 81, RULE_inDecl = 82, RULE_whereCond = 83, 
		RULE_letExpr = 84, RULE_letDecl = 85, RULE_ifExpr = 86, RULE_bodyIf = 87, 
		RULE_elseS = 88, RULE_elseifS = 89, RULE_setVal = 90, RULE_setExpr = 91, 
		RULE_bracketExpr = 92, RULE_guardedSet = 93, RULE_commaList = 94, RULE_guard = 95, 
		RULE_range = 96, RULE_fromR = 97, RULE_toR = 98, RULE_rint = 99, RULE_rfloat = 100, 
		RULE_rbool = 101, RULE_integer = 102, RULE_real = 103, RULE_string = 104;
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
		"simpleNonEmptyList", "guardedList", "multiDimList", "listValue", "functionExpr", 
		"inDecl", "whereCond", "letExpr", "letDecl", "ifExpr", "bodyIf", "elseS", 
		"elseifS", "setVal", "setExpr", "bracketExpr", "guardedSet", "commaList", 
		"guard", "range", "fromR", "toR", "rint", "rfloat", "rbool", "integer", 
		"real", "string"
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
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(210); stat();
				setState(211); match(T__37);
				}
				}
				setState(215); 
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
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217); data();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218); extended();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219); constraint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(220); decl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(221); solve();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(222); output();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(223); predicate();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(224); function();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(225); include();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(226); init();
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
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229); vardecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230); pardecl();
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
			setState(235);
			switch (_input.LA(1)) {
			case T__63:
				{
				setState(233); var();
				}
				break;
			case T__43:
				{
				setState(234); vararray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(239);
			_la = _input.LA(1);
			if (_la==T__75) {
				{
				setState(237); match(T__75);
				setState(238); expr(0);
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
			setState(243);
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
				setState(241); parameter();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(242); pararray();
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
			setState(245); match(T__30);
			setState(246); match(ID);
			setState(247); match(T__75);
			setState(248); match(T__78);
			setState(249); constr();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(250); match(T__68);
				setState(251); constr();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257); match(T__34);
			}
		}
		catch (RecognitionException re) {
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
			setState(259); match(T__67);
			setState(260); match(ID);
			setState(261); match(T__75);
			setState(265);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(262); preExt();
				setState(263); match(T__54);
				}
				break;
			}
			setState(267); typename();
			setState(270);
			_la = _input.LA(1);
			if (_la==T__54) {
				{
				setState(268); match(T__54);
				setState(269); postExt();
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
			setState(272); match(T__18);
			setState(273); match(ID);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(274); match(T__68);
				setState(275); match(ID);
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281); match(T__53);
			}
		}
		catch (RecognitionException re) {
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
			setState(285); listExtended();
			}
		}
		catch (RecognitionException re) {
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
			setState(287); match(T__25);
			setState(288); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(290); match(T__63);
			setState(291); typename();
			setState(292); match(T__19);
			setState(293); match(ID);
			}
		}
		catch (RecognitionException re) {
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
			setState(302);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295); match(T__66);
				setState(296); match(T__69);
				setState(297); listExpr(0);
				setState(298); match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300); match(T__66);
				setState(301); listExpr(0);
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
			setState(304); match(T__32);
			setState(306);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(305); annotation();
				}
			}

			setState(310);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(308); satisfy();
				}
				break;
			case T__84:
			case T__82:
				{
				setState(309); optimize();
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
			setState(313);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(312); match(T__20);
				}
			}

			setState(315); typename();
			setState(316); match(T__19);
			setState(317); match(ID);
			setState(320);
			_la = _input.LA(1);
			if (_la==T__75) {
				{
				setState(318); match(T__75);
				setState(319); expr(0);
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
			setState(322); match(T__71);
			setState(323); stringExpr();
			}
		}
		catch (RecognitionException re) {
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
			setState(325); match(ID);
			setState(326); match(T__75);
			setState(327); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(329); match(T__36);
			setState(330); match(ID);
			setState(331); match(T__69);
			setState(340);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__81) | (1L << T__79) | (1L << T__73) | (1L << T__69) | (1L << T__63) | (1L << T__49) | (1L << T__43) | (1L << T__33))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__15 - 66)) | (1L << (T__0 - 66)) | (1L << (ID - 66)) | (1L << (NAT - 66)))) != 0)) {
				{
				setState(332); decl();
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__68) {
					{
					{
					setState(333); match(T__68);
					setState(334); decl();
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(342); match(T__4);
			setState(343); match(T__75);
			setState(344); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(346); match(T__47);
			setState(348);
			_la = _input.LA(1);
			if (_la==T__63) {
				{
				setState(347); match(T__63);
				}
			}

			setState(350); qualName();
			setState(351); match(T__69);
			setState(360);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__81) | (1L << T__79) | (1L << T__73) | (1L << T__69) | (1L << T__63) | (1L << T__49) | (1L << T__43) | (1L << T__33))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__15 - 66)) | (1L << (T__0 - 66)) | (1L << (ID - 66)) | (1L << (NAT - 66)))) != 0)) {
				{
				setState(352); decl();
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__68) {
					{
					{
					setState(353); match(T__68);
					setState(354); decl();
					}
					}
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(362); match(T__4);
			setState(363); match(T__75);
			setState(364); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(370);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367); match(ID);
				setState(368); match(T__19);
				setState(369); op();
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
			setState(372); match(T__10);
			}
		}
		catch (RecognitionException re) {
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
			setState(376);
			switch (_input.LA(1)) {
			case T__84:
				enterOuterAlt(_localctx, 1);
				{
				setState(374); maximize();
				}
				break;
			case T__82:
				enterOuterAlt(_localctx, 2);
				{
				setState(375); minimize();
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
			setState(378); match(T__84);
			setState(379); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(381); match(T__82);
			setState(382); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(384); match(T__76);
			setState(385); modeAnnotation();
			}
		}
		catch (RecognitionException re) {
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
			setState(391);
			switch (_input.LA(1)) {
			case T__83:
				enterOuterAlt(_localctx, 1);
				{
				setState(387); intS();
				}
				break;
			case T__72:
				enterOuterAlt(_localctx, 2);
				{
				setState(388); boolS();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(389); setS();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 4);
				{
				setState(390); seqS();
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
			setState(393); match(T__83);
			setState(394); restS();
			}
		}
		catch (RecognitionException re) {
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
			setState(396); match(T__72);
			setState(397); restS();
			}
		}
		catch (RecognitionException re) {
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
			setState(399); match(T__35);
			setState(400); restS();
			}
		}
		catch (RecognitionException re) {
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
			setState(402); match(T__46);
			setState(404);
			_la = _input.LA(1);
			if (_la==T__69) {
				{
				setState(403); match(T__69);
				}
			}

			setState(406); match(T__18);
			setState(407); modeAnnotation();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(408); match(T__68);
				setState(409); modeAnnotation();
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415); match(T__53);
			setState(417);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(416); match(T__4);
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
			setState(419); match(T__69);
			setState(420); expr(0);
			setState(421); match(T__68);
			setState(422); varchoice();
			setState(423); match(T__68);
			setState(424); constrainchoice();
			setState(425); match(T__68);
			setState(426); match(T__59);
			setState(427); match(T__4);
			}
		}
		catch (RecognitionException re) {
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
			setState(429);
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
			setState(431);
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
			setState(435);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433); scons();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434); tcons();
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
			setState(437); match(ID);
			}
		}
		catch (RecognitionException re) {
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
			setState(439); match(ID);
			setState(440); match(T__69);
			setState(441); arg();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(442); match(T__68);
				setState(443); arg();
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449); match(T__4);
			}
		}
		catch (RecognitionException re) {
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
			setState(456);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451); argint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452); argfloat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453); argbool();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(454); argunion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(455); argrange();
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
			setState(458); rint();
			}
		}
		catch (RecognitionException re) {
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
			setState(460); rfloat();
			}
		}
		catch (RecognitionException re) {
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
			setState(462); rbool();
			}
		}
		catch (RecognitionException re) {
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
			setState(464); match(ID);
			}
		}
		catch (RecognitionException re) {
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
			setState(466); range();
			}
		}
		catch (RecognitionException re) {
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
			setState(475);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(468); rint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469); rbool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(470); rfloat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(471); match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(472); typedata();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(473); range();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(474); typeset();
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
			setState(477); match(T__81);
			setState(478); match(T__40);
			setState(479); typename();
			}
		}
		catch (RecognitionException re) {
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
			setState(481); match(T__43);
			setState(482); dimensions();
			setState(483); match(T__40);
			setState(484); var();
			}
		}
		catch (RecognitionException re) {
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
			setState(486); match(T__43);
			setState(487); dimensions();
			setState(488); match(T__40);
			setState(489); parameter();
			}
		}
		catch (RecognitionException re) {
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
			setState(491); match(T__18);
			setState(501);
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
				setState(492); range();
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__68) {
					{
					{
					setState(493); match(T__68);
					setState(494); range();
					}
					}
					setState(499);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case T__73:
				{
				setState(500); match(T__73);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(503); match(T__53);
			}
		}
		catch (RecognitionException re) {
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
			setState(505); match(ID);
			setState(506); match(T__69);
			setState(507); arithExpr(0);
			setState(508); match(T__4);
			}
		}
		catch (RecognitionException re) {
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
			setState(526);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(511); rbracketExpr();
				}
				break;
			case 3:
				{
				setState(512); boolComplexExpr();
				}
				break;
			case 4:
				{
				setState(513); arithComplexExpr();
				}
				break;
			case 5:
				{
				setState(514); setExpr(0);
				}
				break;
			case 6:
				{
				setState(515); listExpr(0);
				}
				break;
			case 7:
				{
				setState(516); ifExpr();
				}
				break;
			case 8:
				{
				setState(517); letExpr();
				}
				break;
			case 9:
				{
				setState(518); predOrUnionExpr();
				}
				break;
			case 10:
				{
				setState(519); stringExpr();
				}
				break;
			case 11:
				{
				setState(520); caseExpr();
				}
				break;
			case 12:
				{
				setState(521); match(BOOL);
				}
				break;
			case 13:
				{
				setState(522); real();
				}
				break;
			case 14:
				{
				setState(523); integer();
				}
				break;
			case 15:
				{
				setState(524); match(ID);
				}
				break;
			case 16:
				{
				setState(525); match(T__13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(534);
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
					setState(528);
					if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
					setState(529); infixOp();
					setState(530); expr(12);
					}
					} 
				}
				setState(536);
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
			setState(548);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(538); match(T__69);
				setState(539); boolExpr(0);
				setState(540); match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(542); match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(543); match(BOOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(544); arrayaccess();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(545); ifExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(546); letExpr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(547); predOrUnionExpr();
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
			setState(552);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550); boolOp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551); arithOp();
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
			setState(554);
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
			setState(556);
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
			setState(558);
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
			setState(560); match(ID);
			setState(561); match(T__19);
			setState(562); boolOp();
			}
		}
		catch (RecognitionException re) {
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
			setState(564); match(ID);
			setState(565); match(T__19);
			setState(566); arithOp();
			}
		}
		catch (RecognitionException re) {
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
			setState(583);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568); boolExpr(0);
				setState(571);
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
					setState(569); boolOp();
					}
					break;
				case ID:
					{
					setState(570); qualBoolOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(573); boolExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(575); arithExpr(0);
				setState(578);
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
					setState(576); arithOp();
					}
					break;
				case ID:
					{
					setState(577); qualArithOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(580); arithExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(582); notExpr();
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
			setState(595);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(586); arithExpr(0);
				setState(589);
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
					setState(587); arithOp();
					}
					break;
				case ID:
					{
					setState(588); qualArithOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(591); arithExpr(0);
				}
				break;
			case 2:
				{
				setState(593); notExpr();
				}
				break;
			case 3:
				{
				setState(594); boolVal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(606);
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
					setState(597);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(600);
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
						setState(598); boolOp();
						}
						break;
					case ID:
						{
						setState(599); qualBoolOp();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(602); boolExpr(5);
					}
					} 
				}
				setState(608);
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
			setState(621);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610); integer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(611); real();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(612); arrayaccess();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(613); ifExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(614); letExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(615); match(T__69);
				setState(616); arithExpr(0);
				setState(617); match(T__4);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(619); predOrUnionExpr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(620); functionExpr();
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
			setState(628);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623); minusExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(624); arithExpr(0);
				setState(625); arithOp2();
				setState(626); arithExpr(0);
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
			setState(633);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(631); minusExpr();
				}
				break;
			case 2:
				{
				setState(632); operand();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(641);
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
					setState(635);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(636); arithOp2();
					setState(637); arithExpr(3);
					}
					} 
				}
				setState(643);
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
			setState(644); match(T__2);
			setState(645); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(647); match(T__0);
			setState(648); arithExpr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(650); match(ID);
			setState(653);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(651); twosections();
				}
				break;
			case 2:
				{
				setState(652); onesection();
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
			setState(666);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(655); match(T__69);
				setState(656); expr(0);
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__68) {
					{
					{
					setState(657); match(T__68);
					setState(658); expr(0);
					}
					}
					setState(663);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(664); match(T__4);
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
			setState(668); match(T__69);
			setState(669); guard();
			setState(670); match(T__4);
			setState(671); match(T__69);
			setState(672); expr(0);
			setState(673); match(T__4);
			}
		}
		catch (RecognitionException re) {
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
			setState(675); match(T__69);
			setState(676); expr(0);
			setState(677); match(T__4);
			}
		}
		catch (RecognitionException re) {
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
			setState(679); match(ID);
			}
		}
		catch (RecognitionException re) {
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
			setState(681); match(T__26);
			setState(682); string();
			setState(683); match(T__26);
			}
		}
		catch (RecognitionException re) {
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
			setState(689);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(685); match(T__29);
				setState(686); match(ID);
				setState(687); match(T__29);
				}
				break;
			case T__70:
			case T__6:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(688); infixSetOp();
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
			setState(691);
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
			setState(698);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(693); match(ID);
				setState(694); simpleNonEmptyList();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(695); simpleNonEmptyList();
				setState(696); simpleNonEmptyList();
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
			setState(700); match(T__22);
			setState(701); match(ID);
			setState(702); match(T__40);
			setState(706); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(703); caseBranch();
				setState(704); match(T__37);
				}
				}
				setState(708); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(710); match(T__58);
			}
		}
		catch (RecognitionException re) {
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
			setState(712); predOrUnionExpr();
			setState(713); match(T__48);
			setState(714); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(720);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(717); listValue();
				}
				break;
			case 2:
				{
				setState(718); oneDimList();
				}
				break;
			case 3:
				{
				setState(719); multiDimList();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(727);
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
					setState(722);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(723); match(T__54);
					setState(724); listExpr(4);
					}
					} 
				}
				setState(729);
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
			setState(732);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730); simpleList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731); guardedList();
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
			setState(737);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(734); match(T__18);
				setState(735); match(T__53);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(736); simpleNonEmptyList();
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
			setState(739); match(T__18);
			setState(740); expr(0);
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(741); match(T__68);
				setState(742); expr(0);
				}
				}
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(748); match(T__53);
			}
		}
		catch (RecognitionException re) {
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
			setState(750); match(T__18);
			{
			setState(751); expr(0);
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(752); match(T__68);
				setState(753); expr(0);
				}
				}
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(759); match(T__17);
			setState(760); guard();
			setState(761); match(T__53);
			}
		}
		catch (RecognitionException re) {
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
			setState(763); match(T__27);
			{
			setState(764); expr(0);
			setState(769);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(765); match(T__68);
					setState(766); expr(0);
					}
					} 
				}
				setState(771);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68 || _la==T__17) {
				{
				{
				setState(773);
				_la = _input.LA(1);
				if (_la==T__68) {
					{
					setState(772); match(T__68);
					}
				}

				setState(775); match(T__17);
				setState(776); expr(0);
				setState(781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(777); match(T__68);
						setState(778); expr(0);
						}
						} 
					}
					setState(783);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				}
				}
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(789); match(T__51);
			}
		}
		catch (RecognitionException re) {
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
			setState(796);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(791); stringExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(792); match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(793); ifExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(794); arrayaccess();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(795); functionExpr();
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

	public static class FunctionExprContext extends ParserRuleContext {
		public PredOrUnionExprContext predOrUnionExpr() {
			return getRuleContext(PredOrUnionExprContext.class,0);
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
		enterRule(_localctx, 162, RULE_functionExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798); predOrUnionExpr();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 164, RULE_inDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800); match(ID);
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(801); match(T__68);
				setState(802); match(ID);
				}
				}
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(808); match(T__6);
			setState(809); setExpr(0);
			setState(811);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(810); whereCond();
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
		enterRule(_localctx, 166, RULE_whereCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813); match(T__11);
			setState(814); boolExpr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 168, RULE_letExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816); match(T__49);
			setState(817); match(T__78);
			setState(818); letDecl();
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(819); match(T__68);
				setState(820); letDecl();
				}
				}
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(826); match(T__34);
			setState(827); match(T__6);
			setState(828); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 170, RULE_letDecl);
		try {
			setState(832);
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
				setState(830); decl();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(831); constraint();
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
		enterRule(_localctx, 172, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834); match(T__33);
			setState(835); bodyIf();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 174, RULE_bodyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837); expr(0);
			setState(838); match(T__45);
			setState(839); expr(0);
			setState(842);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(840); elseS();
				}
				break;
			case T__39:
				{
				setState(841); elseifS();
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
		enterRule(_localctx, 176, RULE_elseS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844); match(T__7);
			setState(845); expr(0);
			setState(846); match(T__85);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 178, RULE_elseifS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848); match(T__39);
			setState(849); bodyIf();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 180, RULE_setVal);
		try {
			setState(854);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(851); bracketExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(852); range();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(853); guardedSet();
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
		int _startState = 182;
		enterRecursionRule(_localctx, 182, RULE_setExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(857); setVal();
			}
			_ctx.stop = _input.LT(-1);
			setState(865);
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
					setState(859);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(860); infixSetOp();
					setState(861); setExpr(2);
					}
					} 
				}
				setState(867);
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
		enterRule(_localctx, 184, RULE_bracketExpr);
		try {
			setState(874);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(868); match(T__78);
				setState(869); match(T__34);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(870); match(T__78);
				setState(871); commaList();
				setState(872); match(T__34);
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
		enterRule(_localctx, 186, RULE_guardedSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876); match(T__78);
			setState(877); expr(0);
			setState(878); match(T__17);
			setState(879); guard();
			setState(880); match(T__34);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 188, RULE_commaList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(882); expr(0);
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(883); match(T__68);
				setState(884); expr(0);
				}
				}
				setState(889);
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
		enterRule(_localctx, 190, RULE_guard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890); inDecl();
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(891); match(T__68);
				setState(892); inDecl();
				}
				}
				setState(897);
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
		enterRule(_localctx, 192, RULE_range);
		try {
			setState(903);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(898); fromR();
				setState(899); match(T__77);
				setState(900); toR();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(902); match(ID);
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
		enterRule(_localctx, 194, RULE_fromR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905); arithExpr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 196, RULE_toR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907); arithExpr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 198, RULE_rint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909); match(T__73);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 200, RULE_rfloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911); match(T__79);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 202, RULE_rbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913); match(T__15);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 204, RULE_integer);
		try {
			setState(918);
			switch (_input.LA(1)) {
			case NAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(915); match(NAT);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(916); match(T__0);
				setState(917); match(NAT);
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
		enterRule(_localctx, 206, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920); integer();
			setState(921); match(T__23);
			setState(922); match(NAT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 208, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__76) | (1L << T__75) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__68) | (1L << T__67) | (1L << T__66) | (1L << T__65) | (1L << T__64) | (1L << T__63) | (1L << T__62) | (1L << T__61) | (1L << T__60) | (1L << T__59) | (1L << T__58) | (1L << T__57) | (1L << T__56) | (1L << T__55) | (1L << T__54) | (1L << T__53) | (1L << T__52) | (1L << T__51) | (1L << T__50) | (1L << T__49) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__39) | (1L << T__38) | (1L << T__37) | (1L << T__36) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__32) | (1L << T__31) | (1L << T__30) | (1L << T__29) | (1L << T__28) | (1L << T__27) | (1L << T__25) | (1L << T__24) | (1L << T__23))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__22 - 64)) | (1L << (T__21 - 64)) | (1L << (T__20 - 64)) | (1L << (T__19 - 64)) | (1L << (T__18 - 64)) | (1L << (T__17 - 64)) | (1L << (T__16 - 64)) | (1L << (T__15 - 64)) | (1L << (T__14 - 64)) | (1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__9 - 64)) | (1L << (T__8 - 64)) | (1L << (T__7 - 64)) | (1L << (T__6 - 64)) | (1L << (T__5 - 64)) | (1L << (T__4 - 64)) | (1L << (T__3 - 64)) | (1L << (T__2 - 64)) | (1L << (T__1 - 64)) | (1L << (T__0 - 64)) | (1L << (ESC - 64)) | (1L << (SINGLE_LINE_COMMENT - 64)) | (1L << (ID - 64)) | (1L << (NAT - 64)) | (1L << (WS - 64)) | (1L << (BOOL - 64)))) != 0)) {
				{
				{
				setState(929);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(924);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__26) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				case 2:
					{
					setState(925); match(ESC);
					}
					break;
				case 3:
					{
					setState(926); match(T__23);
					}
					break;
				case 4:
					{
					setState(927); match(T__74);
					}
					break;
				case 5:
					{
					setState(928); match(T__50);
					}
					break;
				}
				}
				}
				setState(935);
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
		case 91: return setExpr_sempred((SetExprContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3^\u03ab\4\2\t\2\4"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\3\2\3"+
		"\2\3\2\6\2\u00d8\n\2\r\2\16\2\u00d9\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\u00e6\n\3\3\4\3\4\5\4\u00ea\n\4\3\5\3\5\5\5\u00ee\n\5\3\5\3"+
		"\5\5\5\u00f2\n\5\3\6\3\6\5\6\u00f6\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u00ff\n\7\f\7\16\7\u0102\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u010c"+
		"\n\b\3\b\3\b\3\b\5\b\u0111\n\b\3\t\3\t\3\t\3\t\7\t\u0117\n\t\f\t\16\t"+
		"\u011a\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0131\n\16\3\17\3\17\5\17\u0135"+
		"\n\17\3\17\3\17\5\17\u0139\n\17\3\20\5\20\u013c\n\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u0143\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u0152\n\23\f\23\16\23\u0155\13\23\5\23\u0157"+
		"\n\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u015f\n\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u0166\n\24\f\24\16\24\u0169\13\24\5\24\u016b\n\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0175\n\25\3\26\3\26\3\27\3\27\5\27"+
		"\u017b\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\5\33\u018a\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\5\37\u0197\n\37\3\37\3\37\3\37\3\37\7\37\u019d\n\37\f\37\16\37\u01a0"+
		"\13\37\3\37\3\37\5\37\u01a4\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\5#\u01b6\n#\3$\3$\3%\3%\3%\3%\3%\7%\u01bf\n%\f%\16%\u01c2"+
		"\13%\3%\3%\3&\3&\3&\3&\3&\5&\u01cb\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+"+
		"\3,\3,\3,\3,\3,\3,\3,\5,\u01de\n,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/"+
		"\3/\3/\3\60\3\60\3\60\3\60\7\60\u01f2\n\60\f\60\16\60\u01f5\13\60\3\60"+
		"\5\60\u01f8\n\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0211"+
		"\n\62\3\62\3\62\3\62\3\62\7\62\u0217\n\62\f\62\16\62\u021a\13\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0227\n\63\3\64"+
		"\3\64\5\64\u022b\n\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\38\39\39"+
		"\39\39\3:\3:\3:\5:\u023e\n:\3:\3:\3:\3:\3:\5:\u0245\n:\3:\3:\3:\5:\u024a"+
		"\n:\3;\3;\3;\3;\5;\u0250\n;\3;\3;\3;\3;\5;\u0256\n;\3;\3;\3;\5;\u025b"+
		"\n;\3;\3;\7;\u025f\n;\f;\16;\u0262\13;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\5<\u0270\n<\3=\3=\3=\3=\3=\5=\u0277\n=\3>\3>\3>\5>\u027c\n>\3>\3"+
		">\3>\3>\7>\u0282\n>\f>\16>\u0285\13>\3?\3?\3?\3@\3@\3@\3A\3A\3A\5A\u0290"+
		"\nA\3B\3B\3B\3B\7B\u0296\nB\fB\16B\u0299\13B\3B\3B\5B\u029d\nB\3C\3C\3"+
		"C\3C\3C\3C\3C\3D\3D\3D\3D\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\5G\u02b4\nG\3"+
		"H\3H\3I\3I\3I\3I\3I\5I\u02bd\nI\3J\3J\3J\3J\3J\3J\6J\u02c5\nJ\rJ\16J\u02c6"+
		"\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\5L\u02d3\nL\3L\3L\3L\7L\u02d8\nL\fL\16"+
		"L\u02db\13L\3M\3M\5M\u02df\nM\3N\3N\3N\5N\u02e4\nN\3O\3O\3O\3O\7O\u02ea"+
		"\nO\fO\16O\u02ed\13O\3O\3O\3P\3P\3P\3P\7P\u02f5\nP\fP\16P\u02f8\13P\3"+
		"P\3P\3P\3P\3Q\3Q\3Q\3Q\7Q\u0302\nQ\fQ\16Q\u0305\13Q\3Q\5Q\u0308\nQ\3Q"+
		"\3Q\3Q\3Q\7Q\u030e\nQ\fQ\16Q\u0311\13Q\7Q\u0313\nQ\fQ\16Q\u0316\13Q\3"+
		"Q\3Q\3R\3R\3R\3R\3R\5R\u031f\nR\3S\3S\3T\3T\3T\7T\u0326\nT\fT\16T\u0329"+
		"\13T\3T\3T\3T\5T\u032e\nT\3U\3U\3U\3V\3V\3V\3V\3V\7V\u0338\nV\fV\16V\u033b"+
		"\13V\3V\3V\3V\3V\3W\3W\5W\u0343\nW\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\5Y\u034d\n"+
		"Y\3Z\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\5\\\u0359\n\\\3]\3]\3]\3]\3]\3]\3]"+
		"\7]\u0362\n]\f]\16]\u0365\13]\3^\3^\3^\3^\3^\3^\5^\u036d\n^\3_\3_\3_\3"+
		"_\3_\3_\3`\3`\3`\7`\u0378\n`\f`\16`\u037b\13`\3a\3a\3a\7a\u0380\na\fa"+
		"\16a\u0383\13a\3b\3b\3b\3b\3b\5b\u038a\nb\3c\3c\3d\3d\3e\3e\3f\3f\3g\3"+
		"g\3h\3h\3h\5h\u0399\nh\3i\3i\3i\3i\3j\3j\3j\3j\3j\5j\u03a4\nj\7j\u03a6"+
		"\nj\fj\16j\u03a9\13j\3j\2\7btz\u0096\u00b8k\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\2\t\5\2\32\32\34\34WW\7\2\27\27\33"+
		"\33$$\62\62OO\13\2\b\b\r\r\30\30..99CCHHLLUU\t\2\b\b\r\r !<<HHJJRR\b\2"+
		"\37\37,,//@@PPXX\4\2\22\22RS\3\2>>\u03c6\2\u00d7\3\2\2\2\4\u00e5\3\2\2"+
		"\2\6\u00e9\3\2\2\2\b\u00ed\3\2\2\2\n\u00f5\3\2\2\2\f\u00f7\3\2\2\2\16"+
		"\u0105\3\2\2\2\20\u0112\3\2\2\2\22\u011d\3\2\2\2\24\u011f\3\2\2\2\26\u0121"+
		"\3\2\2\2\30\u0124\3\2\2\2\32\u0130\3\2\2\2\34\u0132\3\2\2\2\36\u013b\3"+
		"\2\2\2 \u0144\3\2\2\2\"\u0147\3\2\2\2$\u014b\3\2\2\2&\u015c\3\2\2\2(\u0174"+
		"\3\2\2\2*\u0176\3\2\2\2,\u017a\3\2\2\2.\u017c\3\2\2\2\60\u017f\3\2\2\2"+
		"\62\u0182\3\2\2\2\64\u0189\3\2\2\2\66\u018b\3\2\2\28\u018e\3\2\2\2:\u0191"+
		"\3\2\2\2<\u0194\3\2\2\2>\u01a5\3\2\2\2@\u01af\3\2\2\2B\u01b1\3\2\2\2D"+
		"\u01b5\3\2\2\2F\u01b7\3\2\2\2H\u01b9\3\2\2\2J\u01ca\3\2\2\2L\u01cc\3\2"+
		"\2\2N\u01ce\3\2\2\2P\u01d0\3\2\2\2R\u01d2\3\2\2\2T\u01d4\3\2\2\2V\u01dd"+
		"\3\2\2\2X\u01df\3\2\2\2Z\u01e3\3\2\2\2\\\u01e8\3\2\2\2^\u01ed\3\2\2\2"+
		"`\u01fb\3\2\2\2b\u0210\3\2\2\2d\u0226\3\2\2\2f\u022a\3\2\2\2h\u022c\3"+
		"\2\2\2j\u022e\3\2\2\2l\u0230\3\2\2\2n\u0232\3\2\2\2p\u0236\3\2\2\2r\u0249"+
		"\3\2\2\2t\u0255\3\2\2\2v\u026f\3\2\2\2x\u0276\3\2\2\2z\u027b\3\2\2\2|"+
		"\u0286\3\2\2\2~\u0289\3\2\2\2\u0080\u028c\3\2\2\2\u0082\u029c\3\2\2\2"+
		"\u0084\u029e\3\2\2\2\u0086\u02a5\3\2\2\2\u0088\u02a9\3\2\2\2\u008a\u02ab"+
		"\3\2\2\2\u008c\u02b3\3\2\2\2\u008e\u02b5\3\2\2\2\u0090\u02bc\3\2\2\2\u0092"+
		"\u02be\3\2\2\2\u0094\u02ca\3\2\2\2\u0096\u02d2\3\2\2\2\u0098\u02de\3\2"+
		"\2\2\u009a\u02e3\3\2\2\2\u009c\u02e5\3\2\2\2\u009e\u02f0\3\2\2\2\u00a0"+
		"\u02fd\3\2\2\2\u00a2\u031e\3\2\2\2\u00a4\u0320\3\2\2\2\u00a6\u0322\3\2"+
		"\2\2\u00a8\u032f\3\2\2\2\u00aa\u0332\3\2\2\2\u00ac\u0342\3\2\2\2\u00ae"+
		"\u0344\3\2\2\2\u00b0\u0347\3\2\2\2\u00b2\u034e\3\2\2\2\u00b4\u0352\3\2"+
		"\2\2\u00b6\u0358\3\2\2\2\u00b8\u035a\3\2\2\2\u00ba\u036c\3\2\2\2\u00bc"+
		"\u036e\3\2\2\2\u00be\u0374\3\2\2\2\u00c0\u037c\3\2\2\2\u00c2\u0389\3\2"+
		"\2\2\u00c4\u038b\3\2\2\2\u00c6\u038d\3\2\2\2\u00c8\u038f\3\2\2\2\u00ca"+
		"\u0391\3\2\2\2\u00cc\u0393\3\2\2\2\u00ce\u0398\3\2\2\2\u00d0\u039a\3\2"+
		"\2\2\u00d2\u03a7\3\2\2\2\u00d4\u00d5\5\4\3\2\u00d5\u00d6\7\63\2\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\3\3\2\2\2\u00db\u00e6\5\f\7\2\u00dc\u00e6"+
		"\5\16\b\2\u00dd\u00e6\5\26\f\2\u00de\u00e6\5\6\4\2\u00df\u00e6\5\34\17"+
		"\2\u00e0\u00e6\5\32\16\2\u00e1\u00e6\5$\23\2\u00e2\u00e6\5&\24\2\u00e3"+
		"\u00e6\5 \21\2\u00e4\u00e6\5\"\22\2\u00e5\u00db\3\2\2\2\u00e5\u00dc\3"+
		"\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00de\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5"+
		"\u00e0\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e4\3\2\2\2\u00e6\5\3\2\2\2\u00e7\u00ea\5\b\5\2\u00e8\u00ea"+
		"\5\n\6\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\7\3\2\2\2\u00eb"+
		"\u00ee\5\30\r\2\u00ec\u00ee\5Z.\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2"+
		"\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00f0\7\r\2\2\u00f0\u00f2\5b\62\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\t\3\2\2\2\u00f3\u00f6\5\36\20"+
		"\2\u00f4\u00f6\5\\/\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\13"+
		"\3\2\2\2\u00f7\u00f8\7:\2\2\u00f8\u00f9\7[\2\2\u00f9\u00fa\7\r\2\2\u00fa"+
		"\u00fb\7\n\2\2\u00fb\u0100\5D#\2\u00fc\u00fd\7\24\2\2\u00fd\u00ff\5D#"+
		"\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7\66\2\2"+
		"\u0104\r\3\2\2\2\u0105\u0106\7\25\2\2\u0106\u0107\7[\2\2\u0107\u010b\7"+
		"\r\2\2\u0108\u0109\5\22\n\2\u0109\u010a\7\"\2\2\u010a\u010c\3\2\2\2\u010b"+
		"\u0108\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0110\5V"+
		",\2\u010e\u010f\7\"\2\2\u010f\u0111\5\24\13\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\17\3\2\2\2\u0112\u0113\7F\2\2\u0113\u0118\7[\2\2"+
		"\u0114\u0115\7\24\2\2\u0115\u0117\7[\2\2\u0116\u0114\3\2\2\2\u0117\u011a"+
		"\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011c\7#\2\2\u011c\21\3\2\2\2\u011d\u011e\5\20\t"+
		"\2\u011e\23\3\2\2\2\u011f\u0120\5\20\t\2\u0120\25\3\2\2\2\u0121\u0122"+
		"\7?\2\2\u0122\u0123\5b\62\2\u0123\27\3\2\2\2\u0124\u0125\7\31\2\2\u0125"+
		"\u0126\5V,\2\u0126\u0127\7E\2\2\u0127\u0128\7[\2\2\u0128\31\3\2\2\2\u0129"+
		"\u012a\7\26\2\2\u012a\u012b\7\23\2\2\u012b\u012c\5\u0096L\2\u012c\u012d"+
		"\7T\2\2\u012d\u0131\3\2\2\2\u012e\u012f\7\26\2\2\u012f\u0131\5\u0096L"+
		"\2\u0130\u0129\3\2\2\2\u0130\u012e\3\2\2\2\u0131\33\3\2\2\2\u0132\u0134"+
		"\78\2\2\u0133\u0135\5\62\32\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2"+
		"\u0135\u0138\3\2\2\2\u0136\u0139\5*\26\2\u0137\u0139\5,\27\2\u0138\u0136"+
		"\3\2\2\2\u0138\u0137\3\2\2\2\u0139\35\3\2\2\2\u013a\u013c\7D\2\2\u013b"+
		"\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\5V"+
		",\2\u013e\u013f\7E\2\2\u013f\u0142\7[\2\2\u0140\u0141\7\r\2\2\u0141\u0143"+
		"\5b\62\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\37\3\2\2\2\u0144"+
		"\u0145\7\21\2\2\u0145\u0146\5\u008aF\2\u0146!\3\2\2\2\u0147\u0148\7[\2"+
		"\2\u0148\u0149\7\r\2\2\u0149\u014a\5b\62\2\u014a#\3\2\2\2\u014b\u014c"+
		"\7\64\2\2\u014c\u014d\7[\2\2\u014d\u0156\7\23\2\2\u014e\u0153\5\6\4\2"+
		"\u014f\u0150\7\24\2\2\u0150\u0152\5\6\4\2\u0151\u014f\3\2\2\2\u0152\u0155"+
		"\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0157\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u014e\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0159\7T\2\2\u0159\u015a\7\r\2\2\u015a\u015b\5b\62\2\u015b"+
		"%\3\2\2\2\u015c\u015e\7)\2\2\u015d\u015f\7\31\2\2\u015e\u015d\3\2\2\2"+
		"\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\5(\25\2\u0161\u016a"+
		"\7\23\2\2\u0162\u0167\5\6\4\2\u0163\u0164\7\24\2\2\u0164\u0166\5\6\4\2"+
		"\u0165\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u0162\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\7T\2\2\u016d\u016e\7\r"+
		"\2\2\u016e\u016f\5b\62\2\u016f\'\3\2\2\2\u0170\u0175\7[\2\2\u0171\u0172"+
		"\7[\2\2\u0172\u0173\7E\2\2\u0173\u0175\5f\64\2\u0174\u0170\3\2\2\2\u0174"+
		"\u0171\3\2\2\2\u0175)\3\2\2\2\u0176\u0177\7N\2\2\u0177+\3\2\2\2\u0178"+
		"\u017b\5.\30\2\u0179\u017b\5\60\31\2\u017a\u0178\3\2\2\2\u017a\u0179\3"+
		"\2\2\2\u017b-\3\2\2\2\u017c\u017d\7\4\2\2\u017d\u017e\5b\62\2\u017e/\3"+
		"\2\2\2\u017f\u0180\7\6\2\2\u0180\u0181\5b\62\2\u0181\61\3\2\2\2\u0182"+
		"\u0183\7\f\2\2\u0183\u0184\5\64\33\2\u0184\63\3\2\2\2\u0185\u018a\5\66"+
		"\34\2\u0186\u018a\58\35\2\u0187\u018a\5:\36\2\u0188\u018a\5<\37\2\u0189"+
		"\u0185\3\2\2\2\u0189\u0186\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2"+
		"\2\2\u018a\65\3\2\2\2\u018b\u018c\7\5\2\2\u018c\u018d\5> \2\u018d\67\3"+
		"\2\2\2\u018e\u018f\7\20\2\2\u018f\u0190\5> \2\u01909\3\2\2\2\u0191\u0192"+
		"\7\65\2\2\u0192\u0193\5> \2\u0193;\3\2\2\2\u0194\u0196\7*\2\2\u0195\u0197"+
		"\7\23\2\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2"+
		"\u0198\u0199\7F\2\2\u0199\u019e\5\64\33\2\u019a\u019b\7\24\2\2\u019b\u019d"+
		"\5\64\33\2\u019c\u019a\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2"+
		"\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a3"+
		"\7#\2\2\u01a2\u01a4\7T\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"=\3\2\2\2\u01a5\u01a6\7\23\2\2\u01a6\u01a7\5b\62\2\u01a7\u01a8\7\24\2"+
		"\2\u01a8\u01a9\5@!\2\u01a9\u01aa\7\24\2\2\u01aa\u01ab\5B\"\2\u01ab\u01ac"+
		"\7\24\2\2\u01ac\u01ad\7\35\2\2\u01ad\u01ae\7T\2\2\u01ae?\3\2\2\2\u01af"+
		"\u01b0\t\2\2\2\u01b0A\3\2\2\2\u01b1\u01b2\t\3\2\2\u01b2C\3\2\2\2\u01b3"+
		"\u01b6\5F$\2\u01b4\u01b6\5H%\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2"+
		"\u01b6E\3\2\2\2\u01b7\u01b8\7[\2\2\u01b8G\3\2\2\2\u01b9\u01ba\7[\2\2\u01ba"+
		"\u01bb\7\23\2\2\u01bb\u01c0\5J&\2\u01bc\u01bd\7\24\2\2\u01bd\u01bf\5J"+
		"&\2\u01be\u01bc\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c4\7T"+
		"\2\2\u01c4I\3\2\2\2\u01c5\u01cb\5L\'\2\u01c6\u01cb\5N(\2\u01c7\u01cb\5"+
		"P)\2\u01c8\u01cb\5R*\2\u01c9\u01cb\5T+\2\u01ca\u01c5\3\2\2\2\u01ca\u01c6"+
		"\3\2\2\2\u01ca\u01c7\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb"+
		"K\3\2\2\2\u01cc\u01cd\5\u00c8e\2\u01cdM\3\2\2\2\u01ce\u01cf\5\u00caf\2"+
		"\u01cfO\3\2\2\2\u01d0\u01d1\5\u00ccg\2\u01d1Q\3\2\2\2\u01d2\u01d3\7[\2"+
		"\2\u01d3S\3\2\2\2\u01d4\u01d5\5\u00c2b\2\u01d5U\3\2\2\2\u01d6\u01de\5"+
		"\u00c8e\2\u01d7\u01de\5\u00ccg\2\u01d8\u01de\5\u00caf\2\u01d9\u01de\7"+
		"[\2\2\u01da\u01de\5`\61\2\u01db\u01de\5\u00c2b\2\u01dc\u01de\5X-\2\u01dd"+
		"\u01d6\3\2\2\2\u01dd\u01d7\3\2\2\2\u01dd\u01d8\3\2\2\2\u01dd\u01d9\3\2"+
		"\2\2\u01dd\u01da\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01de"+
		"W\3\2\2\2\u01df\u01e0\7\7\2\2\u01e0\u01e1\7\60\2\2\u01e1\u01e2\5V,\2\u01e2"+
		"Y\3\2\2\2\u01e3\u01e4\7-\2\2\u01e4\u01e5\5^\60\2\u01e5\u01e6\7\60\2\2"+
		"\u01e6\u01e7\5\30\r\2\u01e7[\3\2\2\2\u01e8\u01e9\7-\2\2\u01e9\u01ea\5"+
		"^\60\2\u01ea\u01eb\7\60\2\2\u01eb\u01ec\5\36\20\2\u01ec]\3\2\2\2\u01ed"+
		"\u01f7\7F\2\2\u01ee\u01f3\5\u00c2b\2\u01ef\u01f0\7\24\2\2\u01f0\u01f2"+
		"\5\u00c2b\2\u01f1\u01ef\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2"+
		"\2\u01f3\u01f4\3\2\2\2\u01f4\u01f8\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f8"+
		"\7\17\2\2\u01f7\u01ee\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2"+
		"\u01f9\u01fa\7#\2\2\u01fa_\3\2\2\2\u01fb\u01fc\7[\2\2\u01fc\u01fd\7\23"+
		"\2\2\u01fd\u01fe\5z>\2\u01fe\u01ff\7T\2\2\u01ffa\3\2\2\2\u0200\u0211\b"+
		"\62\1\2\u0201\u0211\5\u0086D\2\u0202\u0211\5r:\2\u0203\u0211\5x=\2\u0204"+
		"\u0211\5\u00b8]\2\u0205\u0211\5\u0096L\2\u0206\u0211\5\u00aeX\2\u0207"+
		"\u0211\5\u00aaV\2\u0208\u0211\5\u0080A\2\u0209\u0211\5\u008aF\2\u020a"+
		"\u0211\5\u0092J\2\u020b\u0211\7^\2\2\u020c\u0211\5\u00d0i\2\u020d\u0211"+
		"\5\u00ceh\2\u020e\u0211\7[\2\2\u020f\u0211\7K\2\2\u0210\u0200\3\2\2\2"+
		"\u0210\u0201\3\2\2\2\u0210\u0202\3\2\2\2\u0210\u0203\3\2\2\2\u0210\u0204"+
		"\3\2\2\2\u0210\u0205\3\2\2\2\u0210\u0206\3\2\2\2\u0210\u0207\3\2\2\2\u0210"+
		"\u0208\3\2\2\2\u0210\u0209\3\2\2\2\u0210\u020a\3\2\2\2\u0210\u020b\3\2"+
		"\2\2\u0210\u020c\3\2\2\2\u0210\u020d\3\2\2\2\u0210\u020e\3\2\2\2\u0210"+
		"\u020f\3\2\2\2\u0211\u0218\3\2\2\2\u0212\u0213\f\r\2\2\u0213\u0214\5\u008c"+
		"G\2\u0214\u0215\5b\62\16\u0215\u0217\3\2\2\2\u0216\u0212\3\2\2\2\u0217"+
		"\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219c\3\2\2\2"+
		"\u021a\u0218\3\2\2\2\u021b\u0227\3\2\2\2\u021c\u021d\7\23\2\2\u021d\u021e"+
		"\5t;\2\u021e\u021f\7T\2\2\u021f\u0227\3\2\2\2\u0220\u0227\7[\2\2\u0221"+
		"\u0227\7^\2\2\u0222\u0227\5\u0090I\2\u0223\u0227\5\u00aeX\2\u0224\u0227"+
		"\5\u00aaV\2\u0225\u0227\5\u0080A\2\u0226\u021b\3\2\2\2\u0226\u021c\3\2"+
		"\2\2\u0226\u0220\3\2\2\2\u0226\u0221\3\2\2\2\u0226\u0222\3\2\2\2\u0226"+
		"\u0223\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227e\3\2\2\2"+
		"\u0228\u022b\5h\65\2\u0229\u022b\5j\66\2\u022a\u0228\3\2\2\2\u022a\u0229"+
		"\3\2\2\2\u022bg\3\2\2\2\u022c\u022d\t\4\2\2\u022di\3\2\2\2\u022e\u022f"+
		"\t\5\2\2\u022fk\3\2\2\2\u0230\u0231\t\6\2\2\u0231m\3\2\2\2\u0232\u0233"+
		"\7[\2\2\u0233\u0234\7E\2\2\u0234\u0235\5h\65\2\u0235o\3\2\2\2\u0236\u0237"+
		"\7[\2\2\u0237\u0238\7E\2\2\u0238\u0239\5j\66\2\u0239q\3\2\2\2\u023a\u023d"+
		"\5t;\2\u023b\u023e\5h\65\2\u023c\u023e\5n8\2\u023d\u023b\3\2\2\2\u023d"+
		"\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\5t;\2\u0240\u024a\3\2\2"+
		"\2\u0241\u0244\5z>\2\u0242\u0245\5j\66\2\u0243\u0245\5p9\2\u0244\u0242"+
		"\3\2\2\2\u0244\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\5z>\2\u0247"+
		"\u024a\3\2\2\2\u0248\u024a\5|?\2\u0249\u023a\3\2\2\2\u0249\u0241\3\2\2"+
		"\2\u0249\u0248\3\2\2\2\u024as\3\2\2\2\u024b\u024c\b;\1\2\u024c\u024f\5"+
		"z>\2\u024d\u0250\5j\66\2\u024e\u0250\5p9\2\u024f\u024d\3\2\2\2\u024f\u024e"+
		"\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\5z>\2\u0252\u0256\3\2\2\2\u0253"+
		"\u0256\5|?\2\u0254\u0256\5d\63\2\u0255\u024b\3\2\2\2\u0255\u0253\3\2\2"+
		"\2\u0255\u0254\3\2\2\2\u0256\u0260\3\2\2\2\u0257\u025a\f\6\2\2\u0258\u025b"+
		"\5h\65\2\u0259\u025b\5n8\2\u025a\u0258\3\2\2\2\u025a\u0259\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025c\u025d\5t;\7\u025d\u025f\3\2\2\2\u025e\u0257\3\2\2"+
		"\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261u"+
		"\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0270\7[\2\2\u0264\u0270\5\u00ceh\2"+
		"\u0265\u0270\5\u00d0i\2\u0266\u0270\5\u0090I\2\u0267\u0270\5\u00aeX\2"+
		"\u0268\u0270\5\u00aaV\2\u0269\u026a\7\23\2\2\u026a\u026b\5z>\2\u026b\u026c"+
		"\7T\2\2\u026c\u0270\3\2\2\2\u026d\u0270\5\u0080A\2\u026e\u0270\5\u00a4"+
		"S\2\u026f\u0263\3\2\2\2\u026f\u0264\3\2\2\2\u026f\u0265\3\2\2\2\u026f"+
		"\u0266\3\2\2\2\u026f\u0267\3\2\2\2\u026f\u0268\3\2\2\2\u026f\u0269\3\2"+
		"\2\2\u026f\u026d\3\2\2\2\u026f\u026e\3\2\2\2\u0270w\3\2\2\2\u0271\u0277"+
		"\5~@\2\u0272\u0273\5z>\2\u0273\u0274\5l\67\2\u0274\u0275\5z>\2\u0275\u0277"+
		"\3\2\2\2\u0276\u0271\3\2\2\2\u0276\u0272\3\2\2\2\u0277y\3\2\2\2\u0278"+
		"\u0279\b>\1\2\u0279\u027c\5~@\2\u027a\u027c\5v<\2\u027b\u0278\3\2\2\2"+
		"\u027b\u027a\3\2\2\2\u027c\u0283\3\2\2\2\u027d\u027e\f\4\2\2\u027e\u027f"+
		"\5l\67\2\u027f\u0280\5z>\5\u0280\u0282\3\2\2\2\u0281\u027d\3\2\2\2\u0282"+
		"\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284{\3\2\2\2"+
		"\u0285\u0283\3\2\2\2\u0286\u0287\7V\2\2\u0287\u0288\5b\62\2\u0288}\3\2"+
		"\2\2\u0289\u028a\7X\2\2\u028a\u028b\5z>\2\u028b\177\3\2\2\2\u028c\u028f"+
		"\7[\2\2\u028d\u0290\5\u0084C\2\u028e\u0290\5\u0082B\2\u028f\u028d\3\2"+
		"\2\2\u028f\u028e\3\2\2\2\u0290\u0081\3\2\2\2\u0291\u0292\7\23\2\2\u0292"+
		"\u0297\5b\62\2\u0293\u0294\7\24\2\2\u0294\u0296\5b\62\2\u0295\u0293\3"+
		"\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"\u029a\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029b\7T\2\2\u029b\u029d\3\2"+
		"\2\2\u029c\u0291\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u0083\3\2\2\2\u029e"+
		"\u029f\7\23\2\2\u029f\u02a0\5\u00c0a\2\u02a0\u02a1\7T\2\2\u02a1\u02a2"+
		"\7\23\2\2\u02a2\u02a3\5b\62\2\u02a3\u02a4\7T\2\2\u02a4\u0085\3\2\2\2\u02a5"+
		"\u02a6\7\23\2\2\u02a6\u02a7\5b\62\2\u02a7\u02a8\7T\2\2\u02a8\u0087\3\2"+
		"\2\2\u02a9\u02aa\7[\2\2\u02aa\u0089\3\2\2\2\u02ab\u02ac\7>\2\2\u02ac\u02ad"+
		"\5\u00d2j\2\u02ad\u02ae\7>\2\2\u02ae\u008b\3\2\2\2\u02af\u02b0\7;\2\2"+
		"\u02b0\u02b1\7[\2\2\u02b1\u02b4\7;\2\2\u02b2\u02b4\5\u008eH\2\u02b3\u02af"+
		"\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4\u008d\3\2\2\2\u02b5\u02b6\t\7\2\2\u02b6"+
		"\u008f\3\2\2\2\u02b7\u02b8\7[\2\2\u02b8\u02bd\5\u009cO\2\u02b9\u02ba\5"+
		"\u009cO\2\u02ba\u02bb\5\u009cO\2\u02bb\u02bd\3\2\2\2\u02bc\u02b7\3\2\2"+
		"\2\u02bc\u02b9\3\2\2\2\u02bd\u0091\3\2\2\2\u02be\u02bf\7B\2\2\u02bf\u02c0"+
		"\7[\2\2\u02c0\u02c4\7\60\2\2\u02c1\u02c2\5\u0094K\2\u02c2\u02c3\7\63\2"+
		"\2\u02c3\u02c5\3\2\2\2\u02c4\u02c1\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c4"+
		"\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\7\36\2\2"+
		"\u02c9\u0093\3\2\2\2\u02ca\u02cb\5\u0080A\2\u02cb\u02cc\7(\2\2\u02cc\u02cd"+
		"\5b\62\2\u02cd\u0095\3\2\2\2\u02ce\u02cf\bL\1\2\u02cf\u02d3\5\u00a2R\2"+
		"\u02d0\u02d3\5\u0098M\2\u02d1\u02d3\5\u00a0Q\2\u02d2\u02ce\3\2\2\2\u02d2"+
		"\u02d0\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3\u02d9\3\2\2\2\u02d4\u02d5\f\5"+
		"\2\2\u02d5\u02d6\7\"\2\2\u02d6\u02d8\5\u0096L\6\u02d7\u02d4\3\2\2\2\u02d8"+
		"\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u0097\3\2"+
		"\2\2\u02db\u02d9\3\2\2\2\u02dc\u02df\5\u009aN\2\u02dd\u02df\5\u009eP\2"+
		"\u02de\u02dc\3\2\2\2\u02de\u02dd\3\2\2\2\u02df\u0099\3\2\2\2\u02e0\u02e1"+
		"\7F\2\2\u02e1\u02e4\7#\2\2\u02e2\u02e4\5\u009cO\2\u02e3\u02e0\3\2\2\2"+
		"\u02e3\u02e2\3\2\2\2\u02e4\u009b\3\2\2\2\u02e5\u02e6\7F\2\2\u02e6\u02eb"+
		"\5b\62\2\u02e7\u02e8\7\24\2\2\u02e8\u02ea\5b\62\2\u02e9\u02e7\3\2\2\2"+
		"\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee"+
		"\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee\u02ef\7#\2\2\u02ef\u009d\3\2\2\2\u02f0"+
		"\u02f1\7F\2\2\u02f1\u02f6\5b\62\2\u02f2\u02f3\7\24\2\2\u02f3\u02f5\5b"+
		"\62\2\u02f4\u02f2\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6"+
		"\u02f7\3\2\2\2\u02f7\u02f9\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02fa\7G"+
		"\2\2\u02fa\u02fb\5\u00c0a\2\u02fb\u02fc\7#\2\2\u02fc\u009f\3\2\2\2\u02fd"+
		"\u02fe\7=\2\2\u02fe\u0303\5b\62\2\u02ff\u0300\7\24\2\2\u0300\u0302\5b"+
		"\62\2\u0301\u02ff\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303"+
		"\u0304\3\2\2\2\u0304\u0314\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u0308\7\24"+
		"\2\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309\3\2\2\2\u0309"+
		"\u030a\7G\2\2\u030a\u030f\5b\62\2\u030b\u030c\7\24\2\2\u030c\u030e\5b"+
		"\62\2\u030d\u030b\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u0307\3\2"+
		"\2\2\u0313\u0316\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315"+
		"\u0317\3\2\2\2\u0316\u0314\3\2\2\2\u0317\u0318\7%\2\2\u0318\u00a1\3\2"+
		"\2\2\u0319\u031f\5\u008aF\2\u031a\u031f\7[\2\2\u031b\u031f\5\u00aeX\2"+
		"\u031c\u031f\5\u0090I\2\u031d\u031f\5\u00a4S\2\u031e\u0319\3\2\2\2\u031e"+
		"\u031a\3\2\2\2\u031e\u031b\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031d\3\2"+
		"\2\2\u031f\u00a3\3\2\2\2\u0320\u0321\5\u0080A\2\u0321\u00a5\3\2\2\2\u0322"+
		"\u0327\7[\2\2\u0323\u0324\7\24\2\2\u0324\u0326\7[\2\2\u0325\u0323\3\2"+
		"\2\2\u0326\u0329\3\2\2\2\u0327\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328"+
		"\u032a\3\2\2\2\u0329\u0327\3\2\2\2\u032a\u032b\7R\2\2\u032b\u032d\5\u00b8"+
		"]\2\u032c\u032e\5\u00a8U\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e"+
		"\u00a7\3\2\2\2\u032f\u0330\7M\2\2\u0330\u0331\5t;\2\u0331\u00a9\3\2\2"+
		"\2\u0332\u0333\7\'\2\2\u0333\u0334\7\n\2\2\u0334\u0339\5\u00acW\2\u0335"+
		"\u0336\7\24\2\2\u0336\u0338\5\u00acW\2\u0337\u0335\3\2\2\2\u0338\u033b"+
		"\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033c\3\2\2\2\u033b"+
		"\u0339\3\2\2\2\u033c\u033d\7\66\2\2\u033d\u033e\7R\2\2\u033e\u033f\5b"+
		"\62\2\u033f\u00ab\3\2\2\2\u0340\u0343\5\6\4\2\u0341\u0343\5\26\f\2\u0342"+
		"\u0340\3\2\2\2\u0342\u0341\3\2\2\2\u0343\u00ad\3\2\2\2\u0344\u0345\7\67"+
		"\2\2\u0345\u0346\5\u00b0Y\2\u0346\u00af\3\2\2\2\u0347\u0348\5b\62\2\u0348"+
		"\u0349\7+\2\2\u0349\u034c\5b\62\2\u034a\u034d\5\u00b2Z\2\u034b\u034d\5"+
		"\u00b4[\2\u034c\u034a\3\2\2\2\u034c\u034b\3\2\2\2\u034d\u00b1\3\2\2\2"+
		"\u034e\u034f\7Q\2\2\u034f\u0350\5b\62\2\u0350\u0351\7\3\2\2\u0351\u00b3"+
		"\3\2\2\2\u0352\u0353\7\61\2\2\u0353\u0354\5\u00b0Y\2\u0354\u00b5\3\2\2"+
		"\2\u0355\u0359\5\u00ba^\2\u0356\u0359\5\u00c2b\2\u0357\u0359\5\u00bc_"+
		"\2\u0358\u0355\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0357\3\2\2\2\u0359\u00b7"+
		"\3\2\2\2\u035a\u035b\b]\1\2\u035b\u035c\5\u00b6\\\2\u035c\u0363\3\2\2"+
		"\2\u035d\u035e\f\3\2\2\u035e\u035f\5\u008eH\2\u035f\u0360\5\u00b8]\4\u0360"+
		"\u0362\3\2\2\2\u0361\u035d\3\2\2\2\u0362\u0365\3\2\2\2\u0363\u0361\3\2"+
		"\2\2\u0363\u0364\3\2\2\2\u0364\u00b9\3\2\2\2\u0365\u0363\3\2\2\2\u0366"+
		"\u0367\7\n\2\2\u0367\u036d\7\66\2\2\u0368\u0369\7\n\2\2\u0369\u036a\5"+
		"\u00be`\2\u036a\u036b\7\66\2\2\u036b\u036d\3\2\2\2\u036c\u0366\3\2\2\2"+
		"\u036c\u0368\3\2\2\2\u036d\u00bb\3\2\2\2\u036e\u036f\7\n\2\2\u036f\u0370"+
		"\5b\62\2\u0370\u0371\7G\2\2\u0371\u0372\5\u00c0a\2\u0372\u0373\7\66\2"+
		"\2\u0373\u00bd\3\2\2\2\u0374\u0379\5b\62\2\u0375\u0376\7\24\2\2\u0376"+
		"\u0378\5b\62\2\u0377\u0375\3\2\2\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2"+
		"\2\2\u0379\u037a\3\2\2\2\u037a\u00bf\3\2\2\2\u037b\u0379\3\2\2\2\u037c"+
		"\u0381\5\u00a6T\2\u037d\u037e\7\24\2\2\u037e\u0380\5\u00a6T\2\u037f\u037d"+
		"\3\2\2\2\u0380\u0383\3\2\2\2\u0381\u037f\3\2\2\2\u0381\u0382\3\2\2\2\u0382"+
		"\u00c1\3\2\2\2\u0383\u0381\3\2\2\2\u0384\u0385\5\u00c4c\2\u0385\u0386"+
		"\7\13\2\2\u0386\u0387\5\u00c6d\2\u0387\u038a\3\2\2\2\u0388\u038a\7[\2"+
		"\2\u0389\u0384\3\2\2\2\u0389\u0388\3\2\2\2\u038a\u00c3\3\2\2\2\u038b\u038c"+
		"\5z>\2\u038c\u00c5\3\2\2\2\u038d\u038e\5z>\2\u038e\u00c7\3\2\2\2\u038f"+
		"\u0390\7\17\2\2\u0390\u00c9\3\2\2\2\u0391\u0392\7\t\2\2\u0392\u00cb\3"+
		"\2\2\2\u0393\u0394\7I\2\2\u0394\u00cd\3\2\2\2\u0395\u0399\7\\\2\2\u0396"+
		"\u0397\7X\2\2\u0397\u0399\7\\\2\2\u0398\u0395\3\2\2\2\u0398\u0396\3\2"+
		"\2\2\u0399\u00cf\3\2\2\2\u039a\u039b\5\u00ceh\2\u039b\u039c\7A\2\2\u039c"+
		"\u039d\7\\\2\2\u039d\u00d1\3\2\2\2\u039e\u03a4\n\b\2\2\u039f\u03a4\7Y"+
		"\2\2\u03a0\u03a4\7A\2\2\u03a1\u03a4\7\16\2\2\u03a2\u03a4\7&\2\2\u03a3"+
		"\u039e\3\2\2\2\u03a3\u039f\3\2\2\2\u03a3\u03a0\3\2\2\2\u03a3\u03a1\3\2"+
		"\2\2\u03a3\u03a2\3\2\2\2\u03a4\u03a6\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6"+
		"\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u00d3\3\2"+
		"\2\2\u03a9\u03a7\3\2\2\2P\u00d9\u00e5\u00e9\u00ed\u00f1\u00f5\u0100\u010b"+
		"\u0110\u0118\u0130\u0134\u0138\u013b\u0142\u0153\u0156\u015e\u0167\u016a"+
		"\u0174\u017a\u0189\u0196\u019e\u01a3\u01b5\u01c0\u01ca\u01dd\u01f3\u01f7"+
		"\u0210\u0218\u0226\u022a\u023d\u0244\u0249\u024f\u0255\u025a\u0260\u026f"+
		"\u0276\u027b\u0283\u028f\u0297\u029c\u02b3\u02bc\u02c6\u02d2\u02d9\u02de"+
		"\u02e3\u02eb\u02f6\u0303\u0307\u030f\u0314\u031e\u0327\u032d\u0339\u0342"+
		"\u034c\u0358\u0363\u036c\u0379\u0381\u0389\u0398\u03a3\u03a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}