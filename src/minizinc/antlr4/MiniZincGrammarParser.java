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
		T__83=1, T__82=2, T__81=3, T__80=4, T__79=5, T__78=6, T__77=7, T__76=8, 
		T__75=9, T__74=10, T__73=11, T__72=12, T__71=13, T__70=14, T__69=15, T__68=16, 
		T__67=17, T__66=18, T__65=19, T__64=20, T__63=21, T__62=22, T__61=23, 
		T__60=24, T__59=25, T__58=26, T__57=27, T__56=28, T__55=29, T__54=30, 
		T__53=31, T__52=32, T__51=33, T__50=34, T__49=35, T__48=36, T__47=37, 
		T__46=38, T__45=39, T__44=40, T__43=41, T__42=42, T__41=43, T__40=44, 
		T__39=45, T__38=46, T__37=47, T__36=48, T__35=49, T__34=50, T__33=51, 
		T__32=52, T__31=53, T__30=54, T__29=55, T__28=56, T__27=57, T__26=58, 
		T__25=59, T__24=60, T__23=61, T__22=62, T__21=63, T__20=64, T__19=65, 
		T__18=66, T__17=67, T__16=68, T__15=69, T__14=70, T__13=71, T__12=72, 
		T__11=73, T__10=74, T__9=75, T__8=76, T__7=77, T__6=78, T__5=79, T__4=80, 
		T__3=81, T__2=82, T__1=83, T__0=84, STRING=85, ESC=86, SINGLE_LINE_COMMENT=87, 
		ID=88, NAT=89, WS=90, BOOL=91;
	public static final String[] tokenNames = {
		"<INVALID>", "'endif'", "'maximize'", "'int_search'", "'minimize'", "'set'", 
		"'!='", "'float'", "'{'", "'..'", "'::'", "'='", "'int'", "'bool_search'", 
		"'include'", "'union'", "'('", "','", "'extended'", "'output'", "'indomain'", 
		"'<-'", "'var'", "'first_fail'", "'indomain_split'", "'smallest'", "'complete'", 
		"'endcase'", "'mod'", "'>='", "'<'", "'++'", "']'", "'indomain_random'", 
		"'|]'", "'let'", "'-->'", "'function'", "'seq_search'", "'then'", "'+'", 
		"'array'", "'<->'", "'/'", "'of'", "'elseif'", "'indomain_min'", "';'", 
		"'predicate'", "'set_search'", "'extends'", "'}'", "'if'", "'solve'", 
		"'\\/'", "'enum'", "'`'", "'<='", "'[|'", "'constraint'", "'*'", "'.'", 
		"'case'", "'->'", "'par'", "':'", "'['", "'|'", "'=='", "'bool'", "'>'", 
		"'_'", "'xor'", "'where'", "'satisfy'", "'indomain_median'", "'div'", 
		"'else'", "'in'", "'intersect'", "')'", "'/\\'", "'not'", "'input_order'", 
		"'-'", "STRING", "ESC", "SINGLE_LINE_COMMENT", "ID", "NAT", "WS", "BOOL"
	};
	public static final int
		RULE_model = 0, RULE_stat = 1, RULE_decl = 2, RULE_vardecl = 3, RULE_pardecl = 4, 
		RULE_data = 5, RULE_extended = 6, RULE_listExtended = 7, RULE_preExt = 8, 
		RULE_postExt = 9, RULE_constraint = 10, RULE_var = 11, RULE_output = 12, 
		RULE_solve = 13, RULE_parameter = 14, RULE_include = 15, RULE_init = 16, 
		RULE_predicate = 17, RULE_function = 18, RULE_qualName = 19, RULE_varmark = 20, 
		RULE_extendsmark = 21, RULE_opOrID = 22, RULE_satisfy = 23, RULE_optimize = 24, 
		RULE_maximize = 25, RULE_minimize = 26, RULE_annotation = 27, RULE_modeAnnotation = 28, 
		RULE_intS = 29, RULE_boolS = 30, RULE_setS = 31, RULE_seqS = 32, RULE_restS = 33, 
		RULE_varchoice = 34, RULE_constrainchoice = 35, RULE_constr = 36, RULE_scons = 37, 
		RULE_tcons = 38, RULE_typename = 39, RULE_typeset = 40, RULE_vararray = 41, 
		RULE_pararray = 42, RULE_dimensions = 43, RULE_typedata = 44, RULE_expr = 45, 
		RULE_boolVal = 46, RULE_op = 47, RULE_boolOp = 48, RULE_arithOp = 49, 
		RULE_arithOp2 = 50, RULE_qualBoolOp = 51, RULE_qualArithOp = 52, RULE_boolComplexExpr = 53, 
		RULE_boolExpr = 54, RULE_operand = 55, RULE_arithComplexExpr = 56, RULE_arithExpr = 57, 
		RULE_notExpr = 58, RULE_minusExpr = 59, RULE_predOrUnionExpr = 60, RULE_onesection = 61, 
		RULE_twosections = 62, RULE_rbracketExpr = 63, RULE_idexpr = 64, RULE_stringExpr = 65, 
		RULE_infixOp = 66, RULE_infixSetOp = 67, RULE_arrayaccess = 68, RULE_caseExpr = 69, 
		RULE_caseBranch = 70, RULE_listExpr = 71, RULE_oneDimList = 72, RULE_simpleList = 73, 
		RULE_simpleNonEmptyList = 74, RULE_guardedList = 75, RULE_multiDimList = 76, 
		RULE_nonEmptyListElems = 77, RULE_listValue = 78, RULE_inDecl = 79, RULE_whereCond = 80, 
		RULE_letExpr = 81, RULE_letDecl = 82, RULE_ifExpr = 83, RULE_bodyIf = 84, 
		RULE_elseS = 85, RULE_elseifS = 86, RULE_setVal = 87, RULE_setExpr = 88, 
		RULE_bracketExpr = 89, RULE_guardedSet = 90, RULE_commaList = 91, RULE_guard = 92, 
		RULE_range = 93, RULE_fromR = 94, RULE_toR = 95, RULE_rint = 96, RULE_rfloat = 97, 
		RULE_rbool = 98, RULE_integer = 99, RULE_real = 100, RULE_string = 101;
	public static final String[] ruleNames = {
		"model", "stat", "decl", "vardecl", "pardecl", "data", "extended", "listExtended", 
		"preExt", "postExt", "constraint", "var", "output", "solve", "parameter", 
		"include", "init", "predicate", "function", "qualName", "varmark", "extendsmark", 
		"opOrID", "satisfy", "optimize", "maximize", "minimize", "annotation", 
		"modeAnnotation", "intS", "boolS", "setS", "seqS", "restS", "varchoice", 
		"constrainchoice", "constr", "scons", "tcons", "typename", "typeset", 
		"vararray", "pararray", "dimensions", "typedata", "expr", "boolVal", "op", 
		"boolOp", "arithOp", "arithOp2", "qualBoolOp", "qualArithOp", "boolComplexExpr", 
		"boolExpr", "operand", "arithComplexExpr", "arithExpr", "notExpr", "minusExpr", 
		"predOrUnionExpr", "onesection", "twosections", "rbracketExpr", "idexpr", 
		"stringExpr", "infixOp", "infixSetOp", "arrayaccess", "caseExpr", "caseBranch", 
		"listExpr", "oneDimList", "simpleList", "simpleNonEmptyList", "guardedList", 
		"multiDimList", "nonEmptyListElems", "listValue", "inDecl", "whereCond", 
		"letExpr", "letDecl", "ifExpr", "bodyIf", "elseS", "elseifS", "setVal", 
		"setExpr", "bracketExpr", "guardedSet", "commaList", "guard", "range", 
		"fromR", "toR", "rint", "rfloat", "rbool", "integer", "real", "string"
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
			setState(207); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204); stat();
				setState(205); match(T__37);
				}
				}
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__79) | (1L << T__77) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__66) | (1L << T__65) | (1L << T__62) | (1L << T__49) | (1L << T__47) | (1L << T__43) | (1L << T__36) | (1L << T__32) | (1L << T__31) | (1L << T__29) | (1L << T__25))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__20 - 64)) | (1L << (T__18 - 64)) | (1L << (T__15 - 64)) | (1L << (T__0 - 64)) | (1L << (ID - 64)) | (1L << (NAT - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211); data();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212); extended();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213); constraint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(214); decl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(215); solve();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(216); output();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(217); predicate();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(218); function();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(219); include();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(220); init();
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
			setState(225);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223); vardecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224); pardecl();
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
			setState(229);
			switch (_input.LA(1)) {
			case T__62:
				{
				setState(227); var();
				}
				break;
			case T__43:
				{
				setState(228); vararray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(233);
			_la = _input.LA(1);
			if (_la==T__73) {
				{
				setState(231); match(T__73);
				setState(232); expr(0);
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
			setState(237);
			switch (_input.LA(1)) {
			case T__79:
			case T__77:
			case T__72:
			case T__68:
			case T__49:
			case T__32:
			case T__20:
			case T__18:
			case T__15:
			case T__0:
			case ID:
			case NAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(235); parameter();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(236); pararray();
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
			setState(239); match(T__29);
			setState(240); match(ID);
			setState(241); match(T__73);
			setState(242); match(T__76);
			setState(243); constr();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__67) {
				{
				{
				setState(244); match(T__67);
				setState(245); constr();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251); match(T__33);
			}
		}
		catch (RecognitionException re) {
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
			setState(253); match(T__66);
			setState(254); match(ID);
			setState(255); match(T__73);
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(256); preExt();
				setState(257); match(T__53);
				}
				break;
			}
			setState(261); typename();
			setState(264);
			_la = _input.LA(1);
			if (_la==T__53) {
				{
				setState(262); match(T__53);
				setState(263); postExt();
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
			setState(266); match(T__18);
			setState(267); match(ID);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__67) {
				{
				{
				setState(268); match(T__67);
				setState(269); match(ID);
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275); match(T__52);
			}
		}
		catch (RecognitionException re) {
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
			setState(277); listExtended();
			}
		}
		catch (RecognitionException re) {
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
			setState(279); listExtended();
			}
		}
		catch (RecognitionException re) {
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
			setState(281); match(T__25);
			setState(282); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		public VarmarkContext varmark() {
			return getRuleContext(VarmarkContext.class,0);
		}
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
			setState(284); varmark();
			setState(285); typename();
			setState(286); match(T__19);
			setState(287); match(ID);
			}
		}
		catch (RecognitionException re) {
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
			setState(296);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289); match(T__65);
				setState(290); match(T__68);
				setState(291); listExpr(0);
				setState(292); match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294); match(T__65);
				setState(295); listExpr(0);
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
			setState(298); match(T__31);
			setState(300);
			_la = _input.LA(1);
			if (_la==T__74) {
				{
				setState(299); annotation();
				}
			}

			setState(304);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(302); satisfy();
				}
				break;
			case T__82:
			case T__80:
				{
				setState(303); optimize();
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
			setState(307);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(306); match(T__20);
				}
			}

			setState(309); typename();
			setState(310); match(T__19);
			setState(311); match(ID);
			setState(314);
			_la = _input.LA(1);
			if (_la==T__73) {
				{
				setState(312); match(T__73);
				setState(313); expr(0);
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
			setState(316); match(T__70);
			setState(317); stringExpr();
			}
		}
		catch (RecognitionException re) {
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
			setState(319); match(ID);
			setState(320); match(T__73);
			setState(321); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(323); match(T__36);
			setState(324); match(ID);
			setState(325); match(T__68);
			setState(334);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__79) | (1L << T__77) | (1L << T__72) | (1L << T__68) | (1L << T__62) | (1L << T__49) | (1L << T__43) | (1L << T__32))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__20 - 64)) | (1L << (T__18 - 64)) | (1L << (T__15 - 64)) | (1L << (T__0 - 64)) | (1L << (ID - 64)) | (1L << (NAT - 64)))) != 0)) {
				{
				setState(326); decl();
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__67) {
					{
					{
					setState(327); match(T__67);
					setState(328); decl();
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(336); match(T__4);
			setState(337); match(T__73);
			setState(338); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		public VarmarkContext varmark() {
			return getRuleContext(VarmarkContext.class,0);
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
			setState(340); match(T__47);
			setState(342);
			_la = _input.LA(1);
			if (_la==T__62) {
				{
				setState(341); varmark();
				}
			}

			setState(344); qualName();
			setState(345); match(T__68);
			setState(354);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__79) | (1L << T__77) | (1L << T__72) | (1L << T__68) | (1L << T__62) | (1L << T__49) | (1L << T__43) | (1L << T__32))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__20 - 64)) | (1L << (T__18 - 64)) | (1L << (T__15 - 64)) | (1L << (T__0 - 64)) | (1L << (ID - 64)) | (1L << (NAT - 64)))) != 0)) {
				{
				setState(346); decl();
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__67) {
					{
					{
					setState(347); match(T__67);
					setState(348); decl();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(356); match(T__4);
			setState(357); match(T__73);
			setState(358); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		public OpOrIDContext opOrID(int i) {
			return getRuleContext(OpOrIDContext.class,i);
		}
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public List<OpOrIDContext> opOrID() {
			return getRuleContexts(OpOrIDContext.class);
		}
		public ExtendsmarkContext extendsmark() {
			return getRuleContext(ExtendsmarkContext.class,0);
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
				setState(360); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361); match(ID);
				setState(362); match(T__19);
				setState(363); opOrID();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364); opOrID();
				setState(365); extendsmark();
				setState(366); opOrID();
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

	public static class VarmarkContext extends ParserRuleContext {
		public VarmarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varmark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterVarmark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitVarmark(this);
		}
	}

	public final VarmarkContext varmark() throws RecognitionException {
		VarmarkContext _localctx = new VarmarkContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_varmark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); match(T__62);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsmarkContext extends ParserRuleContext {
		public ExtendsmarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsmark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterExtendsmark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitExtendsmark(this);
		}
	}

	public final ExtendsmarkContext extendsmark() throws RecognitionException {
		ExtendsmarkContext _localctx = new ExtendsmarkContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_extendsmark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372); match(T__34);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpOrIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public OpOrIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opOrID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterOpOrID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitOpOrID(this);
		}
	}

	public final OpOrIDContext opOrID() throws RecognitionException {
		OpOrIDContext _localctx = new OpOrIDContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opOrID);
		try {
			setState(376);
			switch (_input.LA(1)) {
			case T__78:
			case T__73:
			case T__63:
			case T__55:
			case T__54:
			case T__42:
			case T__30:
			case T__27:
			case T__21:
			case T__16:
			case T__14:
			case T__12:
			case T__6:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(374); op();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(375); match(ID);
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
		enterRule(_localctx, 46, RULE_satisfy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378); match(T__10);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 48, RULE_optimize);
		try {
			setState(382);
			switch (_input.LA(1)) {
			case T__82:
				enterOuterAlt(_localctx, 1);
				{
				setState(380); maximize();
				}
				break;
			case T__80:
				enterOuterAlt(_localctx, 2);
				{
				setState(381); minimize();
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
		enterRule(_localctx, 50, RULE_maximize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); match(T__82);
			setState(385); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 52, RULE_minimize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387); match(T__80);
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
		enterRule(_localctx, 54, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390); match(T__74);
			setState(391); modeAnnotation();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 56, RULE_modeAnnotation);
		try {
			setState(397);
			switch (_input.LA(1)) {
			case T__81:
				enterOuterAlt(_localctx, 1);
				{
				setState(393); intS();
				}
				break;
			case T__71:
				enterOuterAlt(_localctx, 2);
				{
				setState(394); boolS();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(395); setS();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 4);
				{
				setState(396); seqS();
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
		enterRule(_localctx, 58, RULE_intS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399); match(T__81);
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
		enterRule(_localctx, 60, RULE_boolS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402); match(T__71);
			setState(403); restS();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 62, RULE_setS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405); match(T__35);
			setState(406); restS();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 64, RULE_seqS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408); match(T__46);
			setState(410);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(409); match(T__68);
				}
			}

			setState(412); match(T__18);
			setState(413); modeAnnotation();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__67) {
				{
				{
				setState(414); match(T__67);
				setState(415); modeAnnotation();
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(421); match(T__52);
			setState(423);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(422); match(T__4);
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
		enterRule(_localctx, 66, RULE_restS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425); match(T__68);
			setState(426); expr(0);
			setState(427); match(T__67);
			setState(428); varchoice();
			setState(429); match(T__67);
			setState(430); constrainchoice();
			setState(431); match(T__67);
			setState(432); match(T__58);
			setState(433); match(T__4);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 68, RULE_varchoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ( !(((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (T__61 - 23)) | (1L << (T__59 - 23)) | (1L << (T__1 - 23)))) != 0)) ) {
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
		enterRule(_localctx, 70, RULE_constrainchoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_la = _input.LA(1);
			if ( !(((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__64 - 20)) | (1L << (T__60 - 20)) | (1L << (T__51 - 20)) | (1L << (T__38 - 20)) | (1L << (T__9 - 20)))) != 0)) ) {
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
		enterRule(_localctx, 72, RULE_constr);
		try {
			setState(441);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439); scons();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440); tcons();
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
		enterRule(_localctx, 74, RULE_scons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443); match(ID);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public TypenameContext typename(int i) {
			return getRuleContext(TypenameContext.class,i);
		}
		public List<TypenameContext> typename() {
			return getRuleContexts(TypenameContext.class);
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
		enterRule(_localctx, 76, RULE_tcons);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); match(ID);
			setState(446); match(T__68);
			setState(447); typename();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__67) {
				{
				{
				setState(448); match(T__67);
				setState(449); typename();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455); match(T__4);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 78, RULE_typename);
		try {
			setState(464);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457); rint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458); rbool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(459); rfloat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(460); match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(461); typedata();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(462); range();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(463); typeset();
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
		enterRule(_localctx, 80, RULE_typeset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466); match(T__79);
			setState(467); match(T__40);
			setState(468); typename();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 82, RULE_vararray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470); match(T__43);
			setState(471); dimensions();
			setState(472); match(T__40);
			setState(473); var();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 84, RULE_pararray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475); match(T__43);
			setState(476); dimensions();
			setState(477); match(T__40);
			setState(478); parameter();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 86, RULE_dimensions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480); match(T__18);
			setState(490);
			switch (_input.LA(1)) {
			case T__68:
			case T__49:
			case T__32:
			case T__18:
			case T__0:
			case ID:
			case NAT:
				{
				{
				setState(481); range();
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__67) {
					{
					{
					setState(482); match(T__67);
					setState(483); range();
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case T__72:
				{
				setState(489); match(T__72);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(492); match(T__52);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 88, RULE_typedata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494); match(ID);
			setState(495); match(T__68);
			setState(496); arithExpr(0);
			setState(497); match(T__4);
			}
		}
		catch (RecognitionException re) {
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public BoolComplexExprContext boolComplexExpr() {
			return getRuleContext(BoolComplexExprContext.class,0);
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(500); match(ID);
				}
				break;
			case 2:
				{
				setState(501); match(T__13);
				}
				break;
			case 3:
				{
				setState(502); match(BOOL);
				}
				break;
			case 4:
				{
				setState(503); real();
				}
				break;
			case 5:
				{
				setState(504); integer();
				}
				break;
			case 6:
				{
				setState(505); predOrUnionExpr();
				}
				break;
			case 7:
				{
				setState(506); rbracketExpr();
				}
				break;
			case 8:
				{
				setState(507); ifExpr();
				}
				break;
			case 9:
				{
				setState(508); letExpr();
				}
				break;
			case 10:
				{
				setState(509); listExpr(0);
				}
				break;
			case 11:
				{
				setState(510); boolComplexExpr();
				}
				break;
			case 12:
				{
				setState(511); arithComplexExpr();
				}
				break;
			case 13:
				{
				setState(512); setExpr(0);
				}
				break;
			case 14:
				{
				setState(513); caseExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(522);
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
					setState(516);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(517); infixOp();
					setState(518); expr(2);
					}
					} 
				}
				setState(524);
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
		enterRule(_localctx, 92, RULE_boolVal);
		try {
			setState(536);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526); match(T__68);
				setState(527); boolExpr(0);
				setState(528); match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(530); match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(531); match(BOOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(532); arrayaccess();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(533); ifExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(534); letExpr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(535); predOrUnionExpr();
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
		enterRule(_localctx, 94, RULE_op);
		try {
			setState(540);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538); boolOp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539); arithOp();
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
		enterRule(_localctx, 96, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__78) | (1L << T__73) | (1L << T__63) | (1L << T__42) | (1L << T__30) | (1L << T__21))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__16 - 68)) | (1L << (T__12 - 68)) | (1L << (T__3 - 68)))) != 0)) ) {
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
		enterRule(_localctx, 98, RULE_arithOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__78) | (1L << T__73) | (1L << T__55) | (1L << T__54) | (1L << T__27))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__16 - 68)) | (1L << (T__14 - 68)) | (1L << (T__6 - 68)))) != 0)) ) {
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
		enterRule(_localctx, 100, RULE_arithOp2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_la = _input.LA(1);
			if ( !(((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (T__56 - 28)) | (1L << (T__44 - 28)) | (1L << (T__41 - 28)) | (1L << (T__24 - 28)) | (1L << (T__8 - 28)) | (1L << (T__0 - 28)))) != 0)) ) {
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
		enterRule(_localctx, 102, RULE_qualBoolOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548); match(ID);
			setState(549); match(T__19);
			setState(550); boolOp();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 104, RULE_qualArithOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552); match(ID);
			setState(553); match(T__19);
			setState(554); arithOp();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 106, RULE_boolComplexExpr);
		try {
			setState(571);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(556); boolExpr(0);
				setState(559);
				switch (_input.LA(1)) {
				case T__78:
				case T__73:
				case T__63:
				case T__42:
				case T__30:
				case T__21:
				case T__16:
				case T__12:
				case T__3:
					{
					setState(557); boolOp();
					}
					break;
				case ID:
					{
					setState(558); qualBoolOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(561); boolExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(563); arithExpr(0);
				setState(566);
				switch (_input.LA(1)) {
				case T__78:
				case T__73:
				case T__55:
				case T__54:
				case T__27:
				case T__16:
				case T__14:
				case T__6:
					{
					setState(564); arithOp();
					}
					break;
				case ID:
					{
					setState(565); qualArithOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(568); arithExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(570); notExpr();
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(574); arithExpr(0);
				setState(577);
				switch (_input.LA(1)) {
				case T__78:
				case T__73:
				case T__55:
				case T__54:
				case T__27:
				case T__16:
				case T__14:
				case T__6:
					{
					setState(575); arithOp();
					}
					break;
				case ID:
					{
					setState(576); qualArithOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(579); arithExpr(0);
				}
				break;
			case 2:
				{
				setState(581); notExpr();
				}
				break;
			case 3:
				{
				setState(582); boolVal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(594);
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
					setState(585);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(588);
					switch (_input.LA(1)) {
					case T__78:
					case T__73:
					case T__63:
					case T__42:
					case T__30:
					case T__21:
					case T__16:
					case T__12:
					case T__3:
						{
						setState(586); boolOp();
						}
						break;
					case ID:
						{
						setState(587); qualBoolOp();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(590); boolExpr(5);
					}
					} 
				}
				setState(596);
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
		enterRule(_localctx, 110, RULE_operand);
		try {
			setState(608);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(598); integer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(599); real();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(600); arrayaccess();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(601); ifExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(602); letExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(603); match(T__68);
				setState(604); arithExpr(0);
				setState(605); match(T__4);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(607); predOrUnionExpr();
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
		enterRule(_localctx, 112, RULE_arithComplexExpr);
		try {
			setState(615);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(610); minusExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(611); arithExpr(0);
				setState(612); arithOp2();
				setState(613); arithExpr(0);
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_arithExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(618); minusExpr();
				}
				break;
			case 2:
				{
				setState(619); operand();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(628);
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
					setState(622);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(623); arithOp2();
					setState(624); arithExpr(3);
					}
					} 
				}
				setState(630);
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
		enterRule(_localctx, 116, RULE_notExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631); match(T__2);
			setState(632); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 118, RULE_minusExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634); match(T__0);
			setState(635); arithExpr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 120, RULE_predOrUnionExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637); match(ID);
			setState(640);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(638); twosections();
				}
				break;
			case 2:
				{
				setState(639); onesection();
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
		enterRule(_localctx, 122, RULE_onesection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642); match(T__68);
			setState(651);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(643); expr(0);
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__67) {
					{
					{
					setState(644); match(T__67);
					setState(645); expr(0);
					}
					}
					setState(650);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(653); match(T__4);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 124, RULE_twosections);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655); match(T__68);
			setState(656); guard();
			setState(657); match(T__4);
			setState(658); match(T__68);
			setState(659); expr(0);
			setState(660); match(T__4);
			}
		}
		catch (RecognitionException re) {
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
			setState(662); match(T__68);
			setState(663); expr(0);
			setState(664); match(T__4);
			}
		}
		catch (RecognitionException re) {
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
			setState(666); match(ID);
			}
		}
		catch (RecognitionException re) {
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
			setState(668); string();
			}
		}
		catch (RecognitionException re) {
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
			setState(674);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(670); match(T__28);
				setState(671); match(ID);
				setState(672); match(T__28);
				}
				break;
			case T__69:
			case T__6:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(673); infixSetOp();
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
			setState(676);
			_la = _input.LA(1);
			if ( !(_la==T__69 || _la==T__6 || _la==T__5) ) {
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
		enterRule(_localctx, 136, RULE_arrayaccess);
		try {
			setState(683);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(678); match(ID);
				setState(679); simpleNonEmptyList();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(680); simpleNonEmptyList();
				setState(681); simpleNonEmptyList();
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
			setState(685); match(T__22);
			setState(686); match(ID);
			setState(687); match(T__40);
			setState(691); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(688); caseBranch();
				setState(689); match(T__37);
				}
				}
				setState(693); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(695); match(T__57);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
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
			setState(699);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(697); predOrUnionExpr();
				}
				break;
			case 2:
				{
				setState(698); match(ID);
				}
				break;
			}
			setState(701); match(T__48);
			setState(702); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_listExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(705); listValue();
				}
				break;
			case 2:
				{
				setState(706); oneDimList();
				}
				break;
			case 3:
				{
				setState(707); multiDimList();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_listExpr);
					setState(710);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(711); match(T__53);
					setState(712); listExpr(4);
					}
					} 
				}
				setState(717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
			setState(720);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718); simpleList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719); guardedList();
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
		enterRule(_localctx, 146, RULE_simpleList);
		try {
			setState(725);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(722); match(T__18);
				setState(723); match(T__52);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(724); simpleNonEmptyList();
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
		public NonEmptyListElemsContext nonEmptyListElems() {
			return getRuleContext(NonEmptyListElemsContext.class,0);
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
		enterRule(_localctx, 148, RULE_simpleNonEmptyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727); match(T__18);
			setState(728); nonEmptyListElems();
			setState(730);
			_la = _input.LA(1);
			if (_la==T__67) {
				{
				setState(729); match(T__67);
				}
			}

			setState(732); match(T__52);
			}
		}
		catch (RecognitionException re) {
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
		public NonEmptyListElemsContext nonEmptyListElems() {
			return getRuleContext(NonEmptyListElemsContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734); match(T__18);
			setState(735); nonEmptyListElems();
			setState(736); match(T__17);
			setState(737); guard();
			setState(738); match(T__52);
			}
		}
		catch (RecognitionException re) {
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
		public NonEmptyListElemsContext nonEmptyListElems(int i) {
			return getRuleContext(NonEmptyListElemsContext.class,i);
		}
		public List<NonEmptyListElemsContext> nonEmptyListElems() {
			return getRuleContexts(NonEmptyListElemsContext.class);
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
			setState(740); match(T__26);
			setState(741); nonEmptyListElems();
			setState(749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(743);
					_la = _input.LA(1);
					if (_la==T__67) {
						{
						setState(742); match(T__67);
						}
					}

					setState(745); match(T__17);
					setState(746); nonEmptyListElems();
					}
					} 
				}
				setState(751);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(753);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(752); match(T__17);
				}
			}

			setState(755); match(T__50);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonEmptyListElemsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NonEmptyListElemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonEmptyListElems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterNonEmptyListElems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitNonEmptyListElems(this);
		}
	}

	public final NonEmptyListElemsContext nonEmptyListElems() throws RecognitionException {
		NonEmptyListElemsContext _localctx = new NonEmptyListElemsContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_nonEmptyListElems);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(757); expr(0);
			setState(762);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(758); match(T__67);
					setState(759); expr(0);
					}
					} 
				}
				setState(764);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
		enterRule(_localctx, 156, RULE_listValue);
		try {
			setState(770);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(765); stringExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(766); match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(767); ifExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(768); arrayaccess();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(769); predOrUnionExpr();
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
		enterRule(_localctx, 158, RULE_inDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772); match(ID);
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__67) {
				{
				{
				setState(773); match(T__67);
				setState(774); match(ID);
				}
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(780); match(T__6);
			setState(781); setExpr(0);
			setState(783);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(782); whereCond();
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
		enterRule(_localctx, 160, RULE_whereCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785); match(T__11);
			setState(786); boolExpr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 162, RULE_letExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788); match(T__49);
			setState(789); match(T__76);
			setState(790); letDecl();
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__67) {
				{
				{
				setState(791); match(T__67);
				setState(792); letDecl();
				}
				}
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(798); match(T__33);
			setState(799); match(T__6);
			setState(800); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 164, RULE_letDecl);
		try {
			setState(804);
			switch (_input.LA(1)) {
			case T__79:
			case T__77:
			case T__72:
			case T__68:
			case T__62:
			case T__49:
			case T__43:
			case T__32:
			case T__20:
			case T__18:
			case T__15:
			case T__0:
			case ID:
			case NAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(802); decl();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(803); constraint();
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
		enterRule(_localctx, 166, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806); match(T__32);
			setState(807); bodyIf();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 168, RULE_bodyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809); expr(0);
			setState(810); match(T__45);
			setState(811); expr(0);
			setState(814);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(812); elseS();
				}
				break;
			case T__39:
				{
				setState(813); elseifS();
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
		enterRule(_localctx, 170, RULE_elseS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816); match(T__7);
			setState(817); expr(0);
			setState(818); match(T__83);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 172, RULE_elseifS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820); match(T__39);
			setState(821); bodyIf();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 174, RULE_setVal);
		try {
			setState(826);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(823); bracketExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(824); range();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(825); guardedSet();
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
		int _startState = 176;
		enterRecursionRule(_localctx, 176, RULE_setExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(829); setVal();
			}
			_ctx.stop = _input.LT(-1);
			setState(837);
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
					setState(831);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(832); infixSetOp();
					setState(833); setExpr(2);
					}
					} 
				}
				setState(839);
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
		enterRule(_localctx, 178, RULE_bracketExpr);
		try {
			setState(846);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840); match(T__76);
				setState(841); match(T__33);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(842); match(T__76);
				setState(843); commaList();
				setState(844); match(T__33);
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
		enterRule(_localctx, 180, RULE_guardedSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848); match(T__76);
			setState(849); expr(0);
			setState(850); match(T__17);
			setState(851); guard();
			setState(852); match(T__33);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 182, RULE_commaList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(854); expr(0);
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__67) {
				{
				{
				setState(855); match(T__67);
				setState(856); expr(0);
				}
				}
				setState(861);
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
		enterRule(_localctx, 184, RULE_guard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862); inDecl();
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__67) {
				{
				{
				setState(863); match(T__67);
				setState(864); inDecl();
				}
				}
				setState(869);
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
		enterRule(_localctx, 186, RULE_range);
		try {
			setState(875);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(870); fromR();
				setState(871); match(T__75);
				setState(872); toR();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(874); match(ID);
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
		enterRule(_localctx, 188, RULE_fromR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877); arithExpr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 190, RULE_toR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879); arithExpr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 192, RULE_rint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881); match(T__72);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 194, RULE_rfloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883); match(T__77);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 196, RULE_rbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885); match(T__15);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 198, RULE_integer);
		try {
			setState(890);
			switch (_input.LA(1)) {
			case NAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(887); match(NAT);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(888); match(T__0);
				setState(889); match(NAT);
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
		enterRule(_localctx, 200, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892); integer();
			setState(893); match(T__23);
			setState(894); match(NAT);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode STRING() { return getToken(MiniZincGrammarParser.STRING, 0); }
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
		enterRule(_localctx, 202, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896); match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		case 45: return expr_sempred((ExprContext)_localctx, predIndex);
		case 54: return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		case 57: return arithExpr_sempred((ArithExprContext)_localctx, predIndex);
		case 71: return listExpr_sempred((ListExprContext)_localctx, predIndex);
		case 88: return setExpr_sempred((SetExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3]\u0385\4\2\t\2\4"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\3\2\3\2\6\2\u00d2\n"+
		"\2\r\2\16\2\u00d3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00e0\n"+
		"\3\3\4\3\4\5\4\u00e4\n\4\3\5\3\5\5\5\u00e8\n\5\3\5\3\5\5\5\u00ec\n\5\3"+
		"\6\3\6\5\6\u00f0\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00f9\n\7\f\7\16"+
		"\7\u00fc\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0106\n\b\3\b\3\b\3"+
		"\b\5\b\u010b\n\b\3\t\3\t\3\t\3\t\7\t\u0111\n\t\f\t\16\t\u0114\13\t\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u012b\n\16\3\17\3\17\5\17\u012f\n\17\3\17\3"+
		"\17\5\17\u0133\n\17\3\20\5\20\u0136\n\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u013d\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u014c\n\23\f\23\16\23\u014f\13\23\5\23\u0151\n\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\5\24\u0159\n\24\3\24\3\24\3\24\3\24\3\24\7\24\u0160"+
		"\n\24\f\24\16\24\u0163\13\24\5\24\u0165\n\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0173\n\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\5\30\u017b\n\30\3\31\3\31\3\32\3\32\5\32\u0181\n\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0190"+
		"\n\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\5\"\u019d\n\"\3\"\3\"\3"+
		"\"\3\"\7\"\u01a3\n\"\f\"\16\"\u01a6\13\"\3\"\3\"\5\"\u01aa\n\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&\5&\u01bc\n&\3\'\3\'\3(\3(\3("+
		"\3(\3(\7(\u01c5\n(\f(\16(\u01c8\13(\3(\3(\3)\3)\3)\3)\3)\3)\3)\5)\u01d3"+
		"\n)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\7-\u01e7\n-"+
		"\f-\16-\u01ea\13-\3-\5-\u01ed\n-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0205\n/\3/\3/\3/\3/\7/\u020b\n/\f/\16"+
		"/\u020e\13/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u021b\n\60\3\61\3\61\5\61\u021f\n\61\3\62\3\62\3\63\3\63\3\64\3\64\3"+
		"\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\5\67\u0232\n\67"+
		"\3\67\3\67\3\67\3\67\3\67\5\67\u0239\n\67\3\67\3\67\3\67\5\67\u023e\n"+
		"\67\38\38\38\38\58\u0244\n8\38\38\38\38\58\u024a\n8\38\38\38\58\u024f"+
		"\n8\38\38\78\u0253\n8\f8\168\u0256\138\39\39\39\39\39\39\39\39\39\39\3"+
		"9\59\u0263\n9\3:\3:\3:\3:\3:\5:\u026a\n:\3;\3;\3;\5;\u026f\n;\3;\3;\3"+
		";\3;\7;\u0275\n;\f;\16;\u0278\13;\3<\3<\3<\3=\3=\3=\3>\3>\3>\5>\u0283"+
		"\n>\3?\3?\3?\3?\7?\u0289\n?\f?\16?\u028c\13?\5?\u028e\n?\3?\3?\3@\3@\3"+
		"@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3C\3C\3D\3D\3D\3D\5D\u02a5\nD\3E\3E\3"+
		"F\3F\3F\3F\3F\5F\u02ae\nF\3G\3G\3G\3G\3G\3G\6G\u02b6\nG\rG\16G\u02b7\3"+
		"G\3G\3H\3H\5H\u02be\nH\3H\3H\3H\3I\3I\3I\3I\5I\u02c7\nI\3I\3I\3I\7I\u02cc"+
		"\nI\fI\16I\u02cf\13I\3J\3J\5J\u02d3\nJ\3K\3K\3K\5K\u02d8\nK\3L\3L\3L\5"+
		"L\u02dd\nL\3L\3L\3M\3M\3M\3M\3M\3M\3N\3N\3N\5N\u02ea\nN\3N\3N\7N\u02ee"+
		"\nN\fN\16N\u02f1\13N\3N\5N\u02f4\nN\3N\3N\3O\3O\3O\7O\u02fb\nO\fO\16O"+
		"\u02fe\13O\3P\3P\3P\3P\3P\5P\u0305\nP\3Q\3Q\3Q\7Q\u030a\nQ\fQ\16Q\u030d"+
		"\13Q\3Q\3Q\3Q\5Q\u0312\nQ\3R\3R\3R\3S\3S\3S\3S\3S\7S\u031c\nS\fS\16S\u031f"+
		"\13S\3S\3S\3S\3S\3T\3T\5T\u0327\nT\3U\3U\3U\3V\3V\3V\3V\3V\5V\u0331\n"+
		"V\3W\3W\3W\3W\3X\3X\3X\3Y\3Y\3Y\5Y\u033d\nY\3Z\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u0346"+
		"\nZ\fZ\16Z\u0349\13Z\3[\3[\3[\3[\3[\3[\5[\u0351\n[\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3]\3]\3]\7]\u035c\n]\f]\16]\u035f\13]\3^\3^\3^\7^\u0364\n^\f^\16"+
		"^\u0367\13^\3_\3_\3_\3_\3_\5_\u036e\n_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3"+
		"e\3e\3e\5e\u037d\ne\3f\3f\3f\3f\3g\3g\3g\2\7\\nt\u0090\u00b2h\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\2\b\5\2\31\31\33\33UU\7\2\26\26\32"+
		"\32##\60\60MM\13\2\b\b\r\r\27\27,,88AAFFJJSS\t\2\b\b\r\r\37 ;;FFHHPP\b"+
		"\2\36\36**-->>NNVV\4\2\21\21PQ\u0399\2\u00d1\3\2\2\2\4\u00df\3\2\2\2\6"+
		"\u00e3\3\2\2\2\b\u00e7\3\2\2\2\n\u00ef\3\2\2\2\f\u00f1\3\2\2\2\16\u00ff"+
		"\3\2\2\2\20\u010c\3\2\2\2\22\u0117\3\2\2\2\24\u0119\3\2\2\2\26\u011b\3"+
		"\2\2\2\30\u011e\3\2\2\2\32\u012a\3\2\2\2\34\u012c\3\2\2\2\36\u0135\3\2"+
		"\2\2 \u013e\3\2\2\2\"\u0141\3\2\2\2$\u0145\3\2\2\2&\u0156\3\2\2\2(\u0172"+
		"\3\2\2\2*\u0174\3\2\2\2,\u0176\3\2\2\2.\u017a\3\2\2\2\60\u017c\3\2\2\2"+
		"\62\u0180\3\2\2\2\64\u0182\3\2\2\2\66\u0185\3\2\2\28\u0188\3\2\2\2:\u018f"+
		"\3\2\2\2<\u0191\3\2\2\2>\u0194\3\2\2\2@\u0197\3\2\2\2B\u019a\3\2\2\2D"+
		"\u01ab\3\2\2\2F\u01b5\3\2\2\2H\u01b7\3\2\2\2J\u01bb\3\2\2\2L\u01bd\3\2"+
		"\2\2N\u01bf\3\2\2\2P\u01d2\3\2\2\2R\u01d4\3\2\2\2T\u01d8\3\2\2\2V\u01dd"+
		"\3\2\2\2X\u01e2\3\2\2\2Z\u01f0\3\2\2\2\\\u0204\3\2\2\2^\u021a\3\2\2\2"+
		"`\u021e\3\2\2\2b\u0220\3\2\2\2d\u0222\3\2\2\2f\u0224\3\2\2\2h\u0226\3"+
		"\2\2\2j\u022a\3\2\2\2l\u023d\3\2\2\2n\u0249\3\2\2\2p\u0262\3\2\2\2r\u0269"+
		"\3\2\2\2t\u026e\3\2\2\2v\u0279\3\2\2\2x\u027c\3\2\2\2z\u027f\3\2\2\2|"+
		"\u0284\3\2\2\2~\u0291\3\2\2\2\u0080\u0298\3\2\2\2\u0082\u029c\3\2\2\2"+
		"\u0084\u029e\3\2\2\2\u0086\u02a4\3\2\2\2\u0088\u02a6\3\2\2\2\u008a\u02ad"+
		"\3\2\2\2\u008c\u02af\3\2\2\2\u008e\u02bd\3\2\2\2\u0090\u02c6\3\2\2\2\u0092"+
		"\u02d2\3\2\2\2\u0094\u02d7\3\2\2\2\u0096\u02d9\3\2\2\2\u0098\u02e0\3\2"+
		"\2\2\u009a\u02e6\3\2\2\2\u009c\u02f7\3\2\2\2\u009e\u0304\3\2\2\2\u00a0"+
		"\u0306\3\2\2\2\u00a2\u0313\3\2\2\2\u00a4\u0316\3\2\2\2\u00a6\u0326\3\2"+
		"\2\2\u00a8\u0328\3\2\2\2\u00aa\u032b\3\2\2\2\u00ac\u0332\3\2\2\2\u00ae"+
		"\u0336\3\2\2\2\u00b0\u033c\3\2\2\2\u00b2\u033e\3\2\2\2\u00b4\u0350\3\2"+
		"\2\2\u00b6\u0352\3\2\2\2\u00b8\u0358\3\2\2\2\u00ba\u0360\3\2\2\2\u00bc"+
		"\u036d\3\2\2\2\u00be\u036f\3\2\2\2\u00c0\u0371\3\2\2\2\u00c2\u0373\3\2"+
		"\2\2\u00c4\u0375\3\2\2\2\u00c6\u0377\3\2\2\2\u00c8\u037c\3\2\2\2\u00ca"+
		"\u037e\3\2\2\2\u00cc\u0382\3\2\2\2\u00ce\u00cf\5\4\3\2\u00cf\u00d0\7\61"+
		"\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\3\3\2\2\2\u00d5\u00e0\5\f\7\2"+
		"\u00d6\u00e0\5\16\b\2\u00d7\u00e0\5\26\f\2\u00d8\u00e0\5\6\4\2\u00d9\u00e0"+
		"\5\34\17\2\u00da\u00e0\5\32\16\2\u00db\u00e0\5$\23\2\u00dc\u00e0\5&\24"+
		"\2\u00dd\u00e0\5 \21\2\u00de\u00e0\5\"\22\2\u00df\u00d5\3\2\2\2\u00df"+
		"\u00d6\3\2\2\2\u00df\u00d7\3\2\2\2\u00df\u00d8\3\2\2\2\u00df\u00d9\3\2"+
		"\2\2\u00df\u00da\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\5\3\2\2\2\u00e1\u00e4\5\b\5\2"+
		"\u00e2\u00e4\5\n\6\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\7\3"+
		"\2\2\2\u00e5\u00e8\5\30\r\2\u00e6\u00e8\5T+\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00ea\7\r\2\2\u00ea\u00ec\5\\"+
		"/\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\t\3\2\2\2\u00ed\u00f0"+
		"\5\36\20\2\u00ee\u00f0\5V,\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\13\3\2\2\2\u00f1\u00f2\79\2\2\u00f2\u00f3\7Z\2\2\u00f3\u00f4\7\r\2\2"+
		"\u00f4\u00f5\7\n\2\2\u00f5\u00fa\5J&\2\u00f6\u00f7\7\23\2\2\u00f7\u00f9"+
		"\5J&\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\65"+
		"\2\2\u00fe\r\3\2\2\2\u00ff\u0100\7\24\2\2\u0100\u0101\7Z\2\2\u0101\u0105"+
		"\7\r\2\2\u0102\u0103\5\22\n\2\u0103\u0104\7!\2\2\u0104\u0106\3\2\2\2\u0105"+
		"\u0102\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010a\5P"+
		")\2\u0108\u0109\7!\2\2\u0109\u010b\5\24\13\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\17\3\2\2\2\u010c\u010d\7D\2\2\u010d\u0112\7Z\2\2"+
		"\u010e\u010f\7\23\2\2\u010f\u0111\7Z\2\2\u0110\u010e\3\2\2\2\u0111\u0114"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0116\7\"\2\2\u0116\21\3\2\2\2\u0117\u0118\5\20\t"+
		"\2\u0118\23\3\2\2\2\u0119\u011a\5\20\t\2\u011a\25\3\2\2\2\u011b\u011c"+
		"\7=\2\2\u011c\u011d\5\\/\2\u011d\27\3\2\2\2\u011e\u011f\5*\26\2\u011f"+
		"\u0120\5P)\2\u0120\u0121\7C\2\2\u0121\u0122\7Z\2\2\u0122\31\3\2\2\2\u0123"+
		"\u0124\7\25\2\2\u0124\u0125\7\22\2\2\u0125\u0126\5\u0090I\2\u0126\u0127"+
		"\7R\2\2\u0127\u012b\3\2\2\2\u0128\u0129\7\25\2\2\u0129\u012b\5\u0090I"+
		"\2\u012a\u0123\3\2\2\2\u012a\u0128\3\2\2\2\u012b\33\3\2\2\2\u012c\u012e"+
		"\7\67\2\2\u012d\u012f\58\35\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2"+
		"\u012f\u0132\3\2\2\2\u0130\u0133\5\60\31\2\u0131\u0133\5\62\32\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\35\3\2\2\2\u0134\u0136\7B\2\2"+
		"\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138"+
		"\5P)\2\u0138\u0139\7C\2\2\u0139\u013c\7Z\2\2\u013a\u013b\7\r\2\2\u013b"+
		"\u013d\5\\/\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\37\3\2\2\2"+
		"\u013e\u013f\7\20\2\2\u013f\u0140\5\u0084C\2\u0140!\3\2\2\2\u0141\u0142"+
		"\7Z\2\2\u0142\u0143\7\r\2\2\u0143\u0144\5\\/\2\u0144#\3\2\2\2\u0145\u0146"+
		"\7\62\2\2\u0146\u0147\7Z\2\2\u0147\u0150\7\22\2\2\u0148\u014d\5\6\4\2"+
		"\u0149\u014a\7\23\2\2\u014a\u014c\5\6\4\2\u014b\u0149\3\2\2\2\u014c\u014f"+
		"\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0148\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0153\7R\2\2\u0153\u0154\7\r\2\2\u0154\u0155\5\\/\2\u0155%"+
		"\3\2\2\2\u0156\u0158\7\'\2\2\u0157\u0159\5*\26\2\u0158\u0157\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\5(\25\2\u015b\u0164\7\22"+
		"\2\2\u015c\u0161\5\6\4\2\u015d\u015e\7\23\2\2\u015e\u0160\5\6\4\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u015c\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\7R\2\2\u0167\u0168\7\r"+
		"\2\2\u0168\u0169\5\\/\2\u0169\'\3\2\2\2\u016a\u0173\7Z\2\2\u016b\u016c"+
		"\7Z\2\2\u016c\u016d\7C\2\2\u016d\u0173\5.\30\2\u016e\u016f\5.\30\2\u016f"+
		"\u0170\5,\27\2\u0170\u0171\5.\30\2\u0171\u0173\3\2\2\2\u0172\u016a\3\2"+
		"\2\2\u0172\u016b\3\2\2\2\u0172\u016e\3\2\2\2\u0173)\3\2\2\2\u0174\u0175"+
		"\7\30\2\2\u0175+\3\2\2\2\u0176\u0177\7\64\2\2\u0177-\3\2\2\2\u0178\u017b"+
		"\5`\61\2\u0179\u017b\7Z\2\2\u017a\u0178\3\2\2\2\u017a\u0179\3\2\2\2\u017b"+
		"/\3\2\2\2\u017c\u017d\7L\2\2\u017d\61\3\2\2\2\u017e\u0181\5\64\33\2\u017f"+
		"\u0181\5\66\34\2\u0180\u017e\3\2\2\2\u0180\u017f\3\2\2\2\u0181\63\3\2"+
		"\2\2\u0182\u0183\7\4\2\2\u0183\u0184\5\\/\2\u0184\65\3\2\2\2\u0185\u0186"+
		"\7\6\2\2\u0186\u0187\5\\/\2\u0187\67\3\2\2\2\u0188\u0189\7\f\2\2\u0189"+
		"\u018a\5:\36\2\u018a9\3\2\2\2\u018b\u0190\5<\37\2\u018c\u0190\5> \2\u018d"+
		"\u0190\5@!\2\u018e\u0190\5B\"\2\u018f\u018b\3\2\2\2\u018f\u018c\3\2\2"+
		"\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190;\3\2\2\2\u0191\u0192"+
		"\7\5\2\2\u0192\u0193\5D#\2\u0193=\3\2\2\2\u0194\u0195\7\17\2\2\u0195\u0196"+
		"\5D#\2\u0196?\3\2\2\2\u0197\u0198\7\63\2\2\u0198\u0199\5D#\2\u0199A\3"+
		"\2\2\2\u019a\u019c\7(\2\2\u019b\u019d\7\22\2\2\u019c\u019b\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\7D\2\2\u019f\u01a4\5:\36"+
		"\2\u01a0\u01a1\7\23\2\2\u01a1\u01a3\5:\36\2\u01a2\u01a0\3\2\2\2\u01a3"+
		"\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2"+
		"\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a9\7\"\2\2\u01a8\u01aa\7R\2\2\u01a9"+
		"\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aaC\3\2\2\2\u01ab\u01ac\7\22\2\2"+
		"\u01ac\u01ad\5\\/\2\u01ad\u01ae\7\23\2\2\u01ae\u01af\5F$\2\u01af\u01b0"+
		"\7\23\2\2\u01b0\u01b1\5H%\2\u01b1\u01b2\7\23\2\2\u01b2\u01b3\7\34\2\2"+
		"\u01b3\u01b4\7R\2\2\u01b4E\3\2\2\2\u01b5\u01b6\t\2\2\2\u01b6G\3\2\2\2"+
		"\u01b7\u01b8\t\3\2\2\u01b8I\3\2\2\2\u01b9\u01bc\5L\'\2\u01ba\u01bc\5N"+
		"(\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bcK\3\2\2\2\u01bd\u01be"+
		"\7Z\2\2\u01beM\3\2\2\2\u01bf\u01c0\7Z\2\2\u01c0\u01c1\7\22\2\2\u01c1\u01c6"+
		"\5P)\2\u01c2\u01c3\7\23\2\2\u01c3\u01c5\5P)\2\u01c4\u01c2\3\2\2\2\u01c5"+
		"\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2"+
		"\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\7R\2\2\u01caO\3\2\2\2\u01cb\u01d3"+
		"\5\u00c2b\2\u01cc\u01d3\5\u00c6d\2\u01cd\u01d3\5\u00c4c\2\u01ce\u01d3"+
		"\7Z\2\2\u01cf\u01d3\5Z.\2\u01d0\u01d3\5\u00bc_\2\u01d1\u01d3\5R*\2\u01d2"+
		"\u01cb\3\2\2\2\u01d2\u01cc\3\2\2\2\u01d2\u01cd\3\2\2\2\u01d2\u01ce\3\2"+
		"\2\2\u01d2\u01cf\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3"+
		"Q\3\2\2\2\u01d4\u01d5\7\7\2\2\u01d5\u01d6\7.\2\2\u01d6\u01d7\5P)\2\u01d7"+
		"S\3\2\2\2\u01d8\u01d9\7+\2\2\u01d9\u01da\5X-\2\u01da\u01db\7.\2\2\u01db"+
		"\u01dc\5\30\r\2\u01dcU\3\2\2\2\u01dd\u01de\7+\2\2\u01de\u01df\5X-\2\u01df"+
		"\u01e0\7.\2\2\u01e0\u01e1\5\36\20\2\u01e1W\3\2\2\2\u01e2\u01ec\7D\2\2"+
		"\u01e3\u01e8\5\u00bc_\2\u01e4\u01e5\7\23\2\2\u01e5\u01e7\5\u00bc_\2\u01e6"+
		"\u01e4\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2"+
		"\2\2\u01e9\u01ed\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ed\7\16\2\2\u01ec"+
		"\u01e3\3\2\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\7\""+
		"\2\2\u01efY\3\2\2\2\u01f0\u01f1\7Z\2\2\u01f1\u01f2\7\22\2\2\u01f2\u01f3"+
		"\5t;\2\u01f3\u01f4\7R\2\2\u01f4[\3\2\2\2\u01f5\u01f6\b/\1\2\u01f6\u0205"+
		"\7Z\2\2\u01f7\u0205\7I\2\2\u01f8\u0205\7]\2\2\u01f9\u0205\5\u00caf\2\u01fa"+
		"\u0205\5\u00c8e\2\u01fb\u0205\5z>\2\u01fc\u0205\5\u0080A\2\u01fd\u0205"+
		"\5\u00a8U\2\u01fe\u0205\5\u00a4S\2\u01ff\u0205\5\u0090I\2\u0200\u0205"+
		"\5l\67\2\u0201\u0205\5r:\2\u0202\u0205\5\u00b2Z\2\u0203\u0205\5\u008c"+
		"G\2\u0204\u01f5\3\2\2\2\u0204\u01f7\3\2\2\2\u0204\u01f8\3\2\2\2\u0204"+
		"\u01f9\3\2\2\2\u0204\u01fa\3\2\2\2\u0204\u01fb\3\2\2\2\u0204\u01fc\3\2"+
		"\2\2\u0204\u01fd\3\2\2\2\u0204\u01fe\3\2\2\2\u0204\u01ff\3\2\2\2\u0204"+
		"\u0200\3\2\2\2\u0204\u0201\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0203\3\2"+
		"\2\2\u0205\u020c\3\2\2\2\u0206\u0207\f\3\2\2\u0207\u0208\5\u0086D\2\u0208"+
		"\u0209\5\\/\4\u0209\u020b\3\2\2\2\u020a\u0206\3\2\2\2\u020b\u020e\3\2"+
		"\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d]\3\2\2\2\u020e\u020c"+
		"\3\2\2\2\u020f\u021b\3\2\2\2\u0210\u0211\7\22\2\2\u0211\u0212\5n8\2\u0212"+
		"\u0213\7R\2\2\u0213\u021b\3\2\2\2\u0214\u021b\7Z\2\2\u0215\u021b\7]\2"+
		"\2\u0216\u021b\5\u008aF\2\u0217\u021b\5\u00a8U\2\u0218\u021b\5\u00a4S"+
		"\2\u0219\u021b\5z>\2\u021a\u020f\3\2\2\2\u021a\u0210\3\2\2\2\u021a\u0214"+
		"\3\2\2\2\u021a\u0215\3\2\2\2\u021a\u0216\3\2\2\2\u021a\u0217\3\2\2\2\u021a"+
		"\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021b_\3\2\2\2\u021c\u021f\5b\62\2"+
		"\u021d\u021f\5d\63\2\u021e\u021c\3\2\2\2\u021e\u021d\3\2\2\2\u021fa\3"+
		"\2\2\2\u0220\u0221\t\4\2\2\u0221c\3\2\2\2\u0222\u0223\t\5\2\2\u0223e\3"+
		"\2\2\2\u0224\u0225\t\6\2\2\u0225g\3\2\2\2\u0226\u0227\7Z\2\2\u0227\u0228"+
		"\7C\2\2\u0228\u0229\5b\62\2\u0229i\3\2\2\2\u022a\u022b\7Z\2\2\u022b\u022c"+
		"\7C\2\2\u022c\u022d\5d\63\2\u022dk\3\2\2\2\u022e\u0231\5n8\2\u022f\u0232"+
		"\5b\62\2\u0230\u0232\5h\65\2\u0231\u022f\3\2\2\2\u0231\u0230\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u0234\5n8\2\u0234\u023e\3\2\2\2\u0235\u0238\5t;\2"+
		"\u0236\u0239\5d\63\2\u0237\u0239\5j\66\2\u0238\u0236\3\2\2\2\u0238\u0237"+
		"\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\5t;\2\u023b\u023e\3\2\2\2\u023c"+
		"\u023e\5v<\2\u023d\u022e\3\2\2\2\u023d\u0235\3\2\2\2\u023d\u023c\3\2\2"+
		"\2\u023em\3\2\2\2\u023f\u0240\b8\1\2\u0240\u0243\5t;\2\u0241\u0244\5d"+
		"\63\2\u0242\u0244\5j\66\2\u0243\u0241\3\2\2\2\u0243\u0242\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0246\5t;\2\u0246\u024a\3\2\2\2\u0247\u024a\5v<\2"+
		"\u0248\u024a\5^\60\2\u0249\u023f\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u0248"+
		"\3\2\2\2\u024a\u0254\3\2\2\2\u024b\u024e\f\6\2\2\u024c\u024f\5b\62\2\u024d"+
		"\u024f\5h\65\2\u024e\u024c\3\2\2\2\u024e\u024d\3\2\2\2\u024f\u0250\3\2"+
		"\2\2\u0250\u0251\5n8\7\u0251\u0253\3\2\2\2\u0252\u024b\3\2\2\2\u0253\u0256"+
		"\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255o\3\2\2\2\u0256"+
		"\u0254\3\2\2\2\u0257\u0263\7Z\2\2\u0258\u0263\5\u00c8e\2\u0259\u0263\5"+
		"\u00caf\2\u025a\u0263\5\u008aF\2\u025b\u0263\5\u00a8U\2\u025c\u0263\5"+
		"\u00a4S\2\u025d\u025e\7\22\2\2\u025e\u025f\5t;\2\u025f\u0260\7R\2\2\u0260"+
		"\u0263\3\2\2\2\u0261\u0263\5z>\2\u0262\u0257\3\2\2\2\u0262\u0258\3\2\2"+
		"\2\u0262\u0259\3\2\2\2\u0262\u025a\3\2\2\2\u0262\u025b\3\2\2\2\u0262\u025c"+
		"\3\2\2\2\u0262\u025d\3\2\2\2\u0262\u0261\3\2\2\2\u0263q\3\2\2\2\u0264"+
		"\u026a\5x=\2\u0265\u0266\5t;\2\u0266\u0267\5f\64\2\u0267\u0268\5t;\2\u0268"+
		"\u026a\3\2\2\2\u0269\u0264\3\2\2\2\u0269\u0265\3\2\2\2\u026as\3\2\2\2"+
		"\u026b\u026c\b;\1\2\u026c\u026f\5x=\2\u026d\u026f\5p9\2\u026e\u026b\3"+
		"\2\2\2\u026e\u026d\3\2\2\2\u026f\u0276\3\2\2\2\u0270\u0271\f\4\2\2\u0271"+
		"\u0272\5f\64\2\u0272\u0273\5t;\5\u0273\u0275\3\2\2\2\u0274\u0270\3\2\2"+
		"\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277u"+
		"\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027a\7T\2\2\u027a\u027b\5\\/\2\u027b"+
		"w\3\2\2\2\u027c\u027d\7V\2\2\u027d\u027e\5t;\2\u027ey\3\2\2\2\u027f\u0282"+
		"\7Z\2\2\u0280\u0283\5~@\2\u0281\u0283\5|?\2\u0282\u0280\3\2\2\2\u0282"+
		"\u0281\3\2\2\2\u0283{\3\2\2\2\u0284\u028d\7\22\2\2\u0285\u028a\5\\/\2"+
		"\u0286\u0287\7\23\2\2\u0287\u0289\5\\/\2\u0288\u0286\3\2\2\2\u0289\u028c"+
		"\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028e\3\2\2\2\u028c"+
		"\u028a\3\2\2\2\u028d\u0285\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2"+
		"\2\2\u028f\u0290\7R\2\2\u0290}\3\2\2\2\u0291\u0292\7\22\2\2\u0292\u0293"+
		"\5\u00ba^\2\u0293\u0294\7R\2\2\u0294\u0295\7\22\2\2\u0295\u0296\5\\/\2"+
		"\u0296\u0297\7R\2\2\u0297\177\3\2\2\2\u0298\u0299\7\22\2\2\u0299\u029a"+
		"\5\\/\2\u029a\u029b\7R\2\2\u029b\u0081\3\2\2\2\u029c\u029d\7Z\2\2\u029d"+
		"\u0083\3\2\2\2\u029e\u029f\5\u00ccg\2\u029f\u0085\3\2\2\2\u02a0\u02a1"+
		"\7:\2\2\u02a1\u02a2\7Z\2\2\u02a2\u02a5\7:\2\2\u02a3\u02a5\5\u0088E\2\u02a4"+
		"\u02a0\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5\u0087\3\2\2\2\u02a6\u02a7\t\7"+
		"\2\2\u02a7\u0089\3\2\2\2\u02a8\u02a9\7Z\2\2\u02a9\u02ae\5\u0096L\2\u02aa"+
		"\u02ab\5\u0096L\2\u02ab\u02ac\5\u0096L\2\u02ac\u02ae\3\2\2\2\u02ad\u02a8"+
		"\3\2\2\2\u02ad\u02aa\3\2\2\2\u02ae\u008b\3\2\2\2\u02af\u02b0\7@\2\2\u02b0"+
		"\u02b1\7Z\2\2\u02b1\u02b5\7.\2\2\u02b2\u02b3\5\u008eH\2\u02b3\u02b4\7"+
		"\61\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b2\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7"+
		"\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\7\35"+
		"\2\2\u02ba\u008d\3\2\2\2\u02bb\u02be\5z>\2\u02bc\u02be\7Z\2\2\u02bd\u02bb"+
		"\3\2\2\2\u02bd\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\7&\2\2\u02c0"+
		"\u02c1\5\\/\2\u02c1\u008f\3\2\2\2\u02c2\u02c3\bI\1\2\u02c3\u02c7\5\u009e"+
		"P\2\u02c4\u02c7\5\u0092J\2\u02c5\u02c7\5\u009aN\2\u02c6\u02c2\3\2\2\2"+
		"\u02c6\u02c4\3\2\2\2\u02c6\u02c5\3\2\2\2\u02c7\u02cd\3\2\2\2\u02c8\u02c9"+
		"\f\5\2\2\u02c9\u02ca\7!\2\2\u02ca\u02cc\5\u0090I\6\u02cb\u02c8\3\2\2\2"+
		"\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u0091"+
		"\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d3\5\u0094K\2\u02d1\u02d3\5\u0098"+
		"M\2\u02d2\u02d0\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3\u0093\3\2\2\2\u02d4"+
		"\u02d5\7D\2\2\u02d5\u02d8\7\"\2\2\u02d6\u02d8\5\u0096L\2\u02d7\u02d4\3"+
		"\2\2\2\u02d7\u02d6\3\2\2\2\u02d8\u0095\3\2\2\2\u02d9\u02da\7D\2\2\u02da"+
		"\u02dc\5\u009cO\2\u02db\u02dd\7\23\2\2\u02dc\u02db\3\2\2\2\u02dc\u02dd"+
		"\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\7\"\2\2\u02df\u0097\3\2\2\2\u02e0"+
		"\u02e1\7D\2\2\u02e1\u02e2\5\u009cO\2\u02e2\u02e3\7E\2\2\u02e3\u02e4\5"+
		"\u00ba^\2\u02e4\u02e5\7\"\2\2\u02e5\u0099\3\2\2\2\u02e6\u02e7\7<\2\2\u02e7"+
		"\u02ef\5\u009cO\2\u02e8\u02ea\7\23\2\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea"+
		"\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\7E\2\2\u02ec\u02ee\5\u009cO\2"+
		"\u02ed\u02e9\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0"+
		"\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f4\7E\2\2\u02f3"+
		"\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\7$"+
		"\2\2\u02f6\u009b\3\2\2\2\u02f7\u02fc\5\\/\2\u02f8\u02f9\7\23\2\2\u02f9"+
		"\u02fb\5\\/\2\u02fa\u02f8\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc\u02fa\3\2"+
		"\2\2\u02fc\u02fd\3\2\2\2\u02fd\u009d\3\2\2\2\u02fe\u02fc\3\2\2\2\u02ff"+
		"\u0305\5\u0084C\2\u0300\u0305\7Z\2\2\u0301\u0305\5\u00a8U\2\u0302\u0305"+
		"\5\u008aF\2\u0303\u0305\5z>\2\u0304\u02ff\3\2\2\2\u0304\u0300\3\2\2\2"+
		"\u0304\u0301\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0303\3\2\2\2\u0305\u009f"+
		"\3\2\2\2\u0306\u030b\7Z\2\2\u0307\u0308\7\23\2\2\u0308\u030a\7Z\2\2\u0309"+
		"\u0307\3\2\2\2\u030a\u030d\3\2\2\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2"+
		"\2\2\u030c\u030e\3\2\2\2\u030d\u030b\3\2\2\2\u030e\u030f\7P\2\2\u030f"+
		"\u0311\5\u00b2Z\2\u0310\u0312\5\u00a2R\2\u0311\u0310\3\2\2\2\u0311\u0312"+
		"\3\2\2\2\u0312\u00a1\3\2\2\2\u0313\u0314\7K\2\2\u0314\u0315\5n8\2\u0315"+
		"\u00a3\3\2\2\2\u0316\u0317\7%\2\2\u0317\u0318\7\n\2\2\u0318\u031d\5\u00a6"+
		"T\2\u0319\u031a\7\23\2\2\u031a\u031c\5\u00a6T\2\u031b\u0319\3\2\2\2\u031c"+
		"\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0320\3\2"+
		"\2\2\u031f\u031d\3\2\2\2\u0320\u0321\7\65\2\2\u0321\u0322\7P\2\2\u0322"+
		"\u0323\5\\/\2\u0323\u00a5\3\2\2\2\u0324\u0327\5\6\4\2\u0325\u0327\5\26"+
		"\f\2\u0326\u0324\3\2\2\2\u0326\u0325\3\2\2\2\u0327\u00a7\3\2\2\2\u0328"+
		"\u0329\7\66\2\2\u0329\u032a\5\u00aaV\2\u032a\u00a9\3\2\2\2\u032b\u032c"+
		"\5\\/\2\u032c\u032d\7)\2\2\u032d\u0330\5\\/\2\u032e\u0331\5\u00acW\2\u032f"+
		"\u0331\5\u00aeX\2\u0330\u032e\3\2\2\2\u0330\u032f\3\2\2\2\u0331\u00ab"+
		"\3\2\2\2\u0332\u0333\7O\2\2\u0333\u0334\5\\/\2\u0334\u0335\7\3\2\2\u0335"+
		"\u00ad\3\2\2\2\u0336\u0337\7/\2\2\u0337\u0338\5\u00aaV\2\u0338\u00af\3"+
		"\2\2\2\u0339\u033d\5\u00b4[\2\u033a\u033d\5\u00bc_\2\u033b\u033d\5\u00b6"+
		"\\\2\u033c\u0339\3\2\2\2\u033c\u033a\3\2\2\2\u033c\u033b\3\2\2\2\u033d"+
		"\u00b1\3\2\2\2\u033e\u033f\bZ\1\2\u033f\u0340\5\u00b0Y\2\u0340\u0347\3"+
		"\2\2\2\u0341\u0342\f\3\2\2\u0342\u0343\5\u0088E\2\u0343\u0344\5\u00b2"+
		"Z\4\u0344\u0346\3\2\2\2\u0345\u0341\3\2\2\2\u0346\u0349\3\2\2\2\u0347"+
		"\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u00b3\3\2\2\2\u0349\u0347\3\2"+
		"\2\2\u034a\u034b\7\n\2\2\u034b\u0351\7\65\2\2\u034c\u034d\7\n\2\2\u034d"+
		"\u034e\5\u00b8]\2\u034e\u034f\7\65\2\2\u034f\u0351\3\2\2\2\u0350\u034a"+
		"\3\2\2\2\u0350\u034c\3\2\2\2\u0351\u00b5\3\2\2\2\u0352\u0353\7\n\2\2\u0353"+
		"\u0354\5\\/\2\u0354\u0355\7E\2\2\u0355\u0356\5\u00ba^\2\u0356\u0357\7"+
		"\65\2\2\u0357\u00b7\3\2\2\2\u0358\u035d\5\\/\2\u0359\u035a\7\23\2\2\u035a"+
		"\u035c\5\\/\2\u035b\u0359\3\2\2\2\u035c\u035f\3\2\2\2\u035d\u035b\3\2"+
		"\2\2\u035d\u035e\3\2\2\2\u035e\u00b9\3\2\2\2\u035f\u035d\3\2\2\2\u0360"+
		"\u0365\5\u00a0Q\2\u0361\u0362\7\23\2\2\u0362\u0364\5\u00a0Q\2\u0363\u0361"+
		"\3\2\2\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366"+
		"\u00bb\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u0369\5\u00be`\2\u0369\u036a"+
		"\7\13\2\2\u036a\u036b\5\u00c0a\2\u036b\u036e\3\2\2\2\u036c\u036e\7Z\2"+
		"\2\u036d\u0368\3\2\2\2\u036d\u036c\3\2\2\2\u036e\u00bd\3\2\2\2\u036f\u0370"+
		"\5t;\2\u0370\u00bf\3\2\2\2\u0371\u0372\5t;\2\u0372\u00c1\3\2\2\2\u0373"+
		"\u0374\7\16\2\2\u0374\u00c3\3\2\2\2\u0375\u0376\7\t\2\2\u0376\u00c5\3"+
		"\2\2\2\u0377\u0378\7G\2\2\u0378\u00c7\3\2\2\2\u0379\u037d\7[\2\2\u037a"+
		"\u037b\7V\2\2\u037b\u037d\7[\2\2\u037c\u0379\3\2\2\2\u037c\u037a\3\2\2"+
		"\2\u037d\u00c9\3\2\2\2\u037e\u037f\5\u00c8e\2\u037f\u0380\7?\2\2\u0380"+
		"\u0381\7[\2\2\u0381\u00cb\3\2\2\2\u0382\u0383\7W\2\2\u0383\u00cd\3\2\2"+
		"\2N\u00d3\u00df\u00e3\u00e7\u00eb\u00ef\u00fa\u0105\u010a\u0112\u012a"+
		"\u012e\u0132\u0135\u013c\u014d\u0150\u0158\u0161\u0164\u0172\u017a\u0180"+
		"\u018f\u019c\u01a4\u01a9\u01bb\u01c6\u01d2\u01e8\u01ec\u0204\u020c\u021a"+
		"\u021e\u0231\u0238\u023d\u0243\u0249\u024e\u0254\u0262\u0269\u026e\u0276"+
		"\u0282\u028a\u028d\u02a4\u02ad\u02b7\u02bd\u02c6\u02cd\u02d2\u02d7\u02dc"+
		"\u02e9\u02ef\u02f3\u02fc\u0304\u030b\u0311\u031d\u0326\u0330\u033c\u0347"+
		"\u0350\u035d\u0365\u036d\u037c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}