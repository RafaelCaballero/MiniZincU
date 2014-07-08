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
		T__42=1, T__41=2, T__40=3, T__39=4, T__38=5, T__37=6, T__36=7, T__35=8, 
		T__34=9, T__33=10, T__32=11, T__31=12, T__30=13, T__29=14, T__28=15, T__27=16, 
		T__26=17, T__25=18, T__24=19, T__23=20, T__22=21, T__21=22, T__20=23, 
		T__19=24, T__18=25, T__17=26, T__16=27, T__15=28, T__14=29, T__13=30, 
		T__12=31, T__11=32, T__10=33, T__9=34, T__8=35, T__7=36, T__6=37, T__5=38, 
		T__4=39, T__3=40, T__2=41, T__1=42, T__0=43, SINGLE_LINE_COMMENT=44, ID=45, 
		INT=46, NAT=47, WS=48;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'of'", "'true'", "'set'", "'!='", "'float'", "'{'", 
		"';'", "'..'", "'}'", "'='", "'\\n'", "'solve'", "'\\/'", "'enum'", "'<='", 
		"'\"'", "'int'", "'constraint'", "'('", "'*'", "','", "'false'", "'output'", 
		"'<-'", "'->'", "'var'", "'par'", "':'", "'['", "'>='", "'=='", "'<'", 
		"']'", "'show'", "'bool'", "'>'", "'satisfy'", "')'", "'/\\'", "'+'", 
		"'not'", "'-'", "SINGLE_LINE_COMMENT", "ID", "INT", "NAT", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_data = 2, RULE_constraint = 3, RULE_var = 4, 
		RULE_output = 5, RULE_solve = 6, RULE_parameter = 7, RULE_constr = 8, 
		RULE_scons = 9, RULE_tcons = 10, RULE_arg = 11, RULE_argint = 12, RULE_argfloat = 13, 
		RULE_argbool = 14, RULE_argunion = 15, RULE_argrange = 16, RULE_typename = 17, 
		RULE_typeset = 18, RULE_typedata = 19, RULE_expr = 20, RULE_notExpr = 21, 
		RULE_minusExpr = 22, RULE_predOrUnionExpr = 23, RULE_rbracketExpr = 24, 
		RULE_idexpr = 25, RULE_boolExpr = 26, RULE_showExpr = 27, RULE_stringExpr = 28, 
		RULE_list = 29, RULE_setExpr = 30, RULE_range = 31, RULE_fromR = 32, RULE_toR = 33, 
		RULE_rint = 34, RULE_rfloat = 35, RULE_rbool = 36, RULE_string = 37;
	public static final String[] ruleNames = {
		"prog", "stat", "data", "constraint", "var", "output", "solve", "parameter", 
		"constr", "scons", "tcons", "arg", "argint", "argfloat", "argbool", "argunion", 
		"argrange", "typename", "typeset", "typedata", "expr", "notExpr", "minusExpr", 
		"predOrUnionExpr", "rbracketExpr", "idexpr", "boolExpr", "showExpr", "stringExpr", 
		"list", "setExpr", "range", "fromR", "toR", "rint", "rfloat", "rbool", 
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
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76); stat();
				setState(77); match(8);
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 6) | (1L << 13) | (1L << 15) | (1L << 18) | (1L << 19) | (1L << 24) | (1L << 27) | (1L << 28) | (1L << 36) | (1L << ID) | (1L << INT))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
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
			setState(89);
			switch (_input.LA(1)) {
			case 15:
				enterOuterAlt(_localctx, 1);
				{
				setState(83); data();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 2);
				{
				setState(84); constraint();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 3);
				{
				setState(85); var();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 4);
				{
				setState(86); solve();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 5);
				{
				setState(87); output();
				}
				break;
			case 4:
			case 6:
			case 18:
			case 28:
			case 36:
			case ID:
			case INT:
				enterOuterAlt(_localctx, 6);
				{
				setState(88); parameter();
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
		enterRule(_localctx, 4, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(15);
			setState(92); match(ID);
			setState(93); match(11);
			setState(94); match(7);
			setState(95); constr();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==22) {
				{
				{
				setState(96); match(22);
				setState(97); constr();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103); match(10);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 6, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(19);
			setState(106); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 8, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(27);
			setState(109); typename();
			setState(110); match(29);
			setState(111); match(ID);
			}
		}
		catch (RecognitionException re) {
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
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
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
		enterRule(_localctx, 10, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(24);
			setState(114); match(20);
			setState(115); list();
			setState(116); match(39);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 12, RULE_solve);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(13);
			setState(119); match(38);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 14, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if (_la==28) {
				{
				setState(121); match(28);
				}
			}

			setState(124); typename();
			setState(125); match(29);
			setState(126); match(ID);
			setState(129);
			_la = _input.LA(1);
			if (_la==11) {
				{
				setState(127); match(11);
				setState(128); expr(0);
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
		enterRule(_localctx, 16, RULE_constr);
		try {
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131); scons();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132); tcons();
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
		enterRule(_localctx, 18, RULE_scons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(ID);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 20, RULE_tcons);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(ID);
			setState(138); match(20);
			setState(139); arg();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==22) {
				{
				{
				setState(140); match(22);
				setState(141); arg();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147); match(39);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 22, RULE_arg);
		try {
			setState(154);
			switch (_input.LA(1)) {
			case 18:
				enterOuterAlt(_localctx, 1);
				{
				setState(149); argint();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 2);
				{
				setState(150); argfloat();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 3);
				{
				setState(151); argbool();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(152); argunion();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 5);
				{
				setState(153); argrange();
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
		enterRule(_localctx, 24, RULE_argint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); rint();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 26, RULE_argfloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); rfloat();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 28, RULE_argbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); rbool();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_argunion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(ID);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 32, RULE_argrange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); range();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 34, RULE_typename);
		try {
			setState(173);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166); rint();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167); rbool();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168); rfloat();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169); match(ID);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(170); typedata();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(171); range();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(172); typeset();
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
		enterRule(_localctx, 36, RULE_typeset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(4);
			setState(176); match(2);
			setState(177); typename();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode INT() { return getToken(MiniZincGrammarParser.INT, 0); }
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
		enterRule(_localctx, 38, RULE_typedata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); match(ID);
			setState(180); match(20);
			setState(181); match(INT);
			setState(182); match(39);
			}
		}
		catch (RecognitionException re) {
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
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public SetExprContext setExpr() {
			return getRuleContext(SetExprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public IdexprContext idexpr() {
			return getRuleContext(IdexprContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PredOrUnionExprContext predOrUnionExpr() {
			return getRuleContext(PredOrUnionExprContext.class,0);
		}
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(MiniZincGrammarParser.INT, 0); }
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public ShowExprContext showExpr() {
			return getRuleContext(ShowExprContext.class,0);
		}
		public MinusExprContext minusExpr() {
			return getRuleContext(MinusExprContext.class,0);
		}
		public RbracketExprContext rbracketExpr() {
			return getRuleContext(RbracketExprContext.class,0);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(185); minusExpr();
				}
				break;

			case 2:
				{
				setState(186); match(INT);
				}
				break;

			case 3:
				{
				setState(187); notExpr();
				}
				break;

			case 4:
				{
				setState(188); boolExpr();
				}
				break;

			case 5:
				{
				setState(189); stringExpr();
				}
				break;

			case 6:
				{
				setState(190); showExpr();
				}
				break;

			case 7:
				{
				setState(191); predOrUnionExpr();
				}
				break;

			case 8:
				{
				setState(192); idexpr();
				}
				break;

			case 9:
				{
				setState(193); rbracketExpr();
				}
				break;

			case 10:
				{
				setState(194); setExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(218);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(198);
						_la = _input.LA(1);
						if ( !(_la==1 || _la==21) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(199); expr(17);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(201);
						_la = _input.LA(1);
						if ( !(_la==41 || _la==43) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(202); expr(16);
						}
						break;

					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(204);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 31) | (1L << 33) | (1L << 37))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(205); expr(15);
						}
						break;

					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(207);
						_la = _input.LA(1);
						if ( !(_la==14 || _la==40) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(208); expr(14);
						}
						break;

					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(209);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(210); match(26);
						setState(211); expr(13);
						}
						break;

					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(213); match(25);
						setState(214); expr(12);
						}
						break;

					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(216);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 11) | (1L << 32))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(217); expr(11);
						}
						break;
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 42, RULE_notExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); match(42);
			setState(224); match(20);
			setState(225); expr(0);
			setState(226); match(39);
			}
		}
		catch (RecognitionException re) {
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 44, RULE_minusExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); match(43);
			setState(229); match(20);
			setState(230); expr(0);
			setState(231); match(39);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 46, RULE_predOrUnionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); match(ID);
			setState(234); match(20);
			setState(235); expr(0);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==22) {
				{
				{
				setState(236); match(22);
				setState(237); expr(0);
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243); match(39);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 48, RULE_rbracketExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); match(20);
			setState(246); expr(0);
			setState(247); match(39);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 50, RULE_idexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(ID);
			}
		}
		catch (RecognitionException re) {
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
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_boolExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==3 || _la==23) ) {
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

	public static class ShowExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
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
		enterRule(_localctx, 54, RULE_showExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); match(35);
			setState(254); match(20);
			setState(255); match(ID);
			setState(256); match(39);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 56, RULE_stringExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(17);
			setState(259); string();
			setState(260); match(17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); match(30);
			setState(271);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 7) | (1L << 17) | (1L << 20) | (1L << 23) | (1L << 35) | (1L << 42) | (1L << 43) | (1L << ID) | (1L << INT))) != 0)) {
				{
				setState(263); expr(0);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==22) {
					{
					{
					setState(264); match(22);
					setState(265); expr(0);
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(273); match(34);
			}
		}
		catch (RecognitionException re) {
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		SetExprContext _localctx = new SetExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_setExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); match(7);
			setState(284);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 7) | (1L << 17) | (1L << 20) | (1L << 23) | (1L << 35) | (1L << 42) | (1L << 43) | (1L << ID) | (1L << INT))) != 0)) {
				{
				setState(276); expr(0);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==22) {
					{
					{
					setState(277); match(22);
					setState(278); expr(0);
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(286); match(10);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 62, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288); fromR();
			setState(289); match(9);
			setState(290); toR();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode INT() { return getToken(MiniZincGrammarParser.INT, 0); }
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
		enterRule(_localctx, 64, RULE_fromR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); match(INT);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode INT() { return getToken(MiniZincGrammarParser.INT, 0); }
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
		enterRule(_localctx, 66, RULE_toR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(INT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 68, RULE_rint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); match(18);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 70, RULE_rfloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298); match(6);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 72, RULE_rbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300); match(36);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 74, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 43) | (1L << SINGLE_LINE_COMMENT) | (1L << ID) | (1L << INT) | (1L << NAT) | (1L << WS))) != 0)) {
				{
				{
				setState(304);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(302);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==17) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;

				case 2:
					{
					setState(303); match(12);
					}
					break;
				}
				}
				}
				setState(310);
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
		case 20: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 16);

		case 1: return precpred(_ctx, 15);

		case 2: return precpred(_ctx, 14);

		case 3: return precpred(_ctx, 13);

		case 4: return precpred(_ctx, 12);

		case 5: return precpred(_ctx, 11);

		case 6: return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u013a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\6\2R\n\2\r\2\16"+
		"\2S\3\3\3\3\3\3\3\3\3\3\3\3\5\3\\\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"e\n\4\f\4\16\4h\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\5\t}\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0084\n\t"+
		"\3\n\3\n\5\n\u0088\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u0091\n\f\f\f"+
		"\16\f\u0094\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u009d\n\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u00b0\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00c6\n\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00dd\n\26\f\26\16\26\u00e0\13\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u00f1\n\31\f\31\16\31\u00f4\13\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\7\37\u010d\n\37\f\37\16\37\u0110\13\37\5\37\u0112"+
		"\n\37\3\37\3\37\3 \3 \3 \3 \7 \u011a\n \f \16 \u011d\13 \5 \u011f\n \3"+
		" \3 \3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\5\'\u0133\n\'"+
		"\7\'\u0135\n\'\f\'\16\'\u0138\13\'\3\'\2\3*(\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\t\4\2\3\3\27\27\4\2++-"+
		"-\6\2\22\22!!##\'\'\4\2\20\20**\5\2\7\7\r\r\"\"\4\2\5\5\31\31\3\2\23\23"+
		"\u013f\2Q\3\2\2\2\4[\3\2\2\2\6]\3\2\2\2\bk\3\2\2\2\nn\3\2\2\2\fs\3\2\2"+
		"\2\16x\3\2\2\2\20|\3\2\2\2\22\u0087\3\2\2\2\24\u0089\3\2\2\2\26\u008b"+
		"\3\2\2\2\30\u009c\3\2\2\2\32\u009e\3\2\2\2\34\u00a0\3\2\2\2\36\u00a2\3"+
		"\2\2\2 \u00a4\3\2\2\2\"\u00a6\3\2\2\2$\u00af\3\2\2\2&\u00b1\3\2\2\2(\u00b5"+
		"\3\2\2\2*\u00c5\3\2\2\2,\u00e1\3\2\2\2.\u00e6\3\2\2\2\60\u00eb\3\2\2\2"+
		"\62\u00f7\3\2\2\2\64\u00fb\3\2\2\2\66\u00fd\3\2\2\28\u00ff\3\2\2\2:\u0104"+
		"\3\2\2\2<\u0108\3\2\2\2>\u0115\3\2\2\2@\u0122\3\2\2\2B\u0126\3\2\2\2D"+
		"\u0128\3\2\2\2F\u012a\3\2\2\2H\u012c\3\2\2\2J\u012e\3\2\2\2L\u0136\3\2"+
		"\2\2NO\5\4\3\2OP\7\n\2\2PR\3\2\2\2QN\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2"+
		"\2\2T\3\3\2\2\2U\\\5\6\4\2V\\\5\b\5\2W\\\5\n\6\2X\\\5\16\b\2Y\\\5\f\7"+
		"\2Z\\\5\20\t\2[U\3\2\2\2[V\3\2\2\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2"+
		"\2\2\\\5\3\2\2\2]^\7\21\2\2^_\7/\2\2_`\7\r\2\2`a\7\t\2\2af\5\22\n\2bc"+
		"\7\30\2\2ce\5\22\n\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2"+
		"hf\3\2\2\2ij\7\f\2\2j\7\3\2\2\2kl\7\25\2\2lm\5*\26\2m\t\3\2\2\2no\7\35"+
		"\2\2op\5$\23\2pq\7\37\2\2qr\7/\2\2r\13\3\2\2\2st\7\32\2\2tu\7\26\2\2u"+
		"v\5<\37\2vw\7)\2\2w\r\3\2\2\2xy\7\17\2\2yz\7(\2\2z\17\3\2\2\2{}\7\36\2"+
		"\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\5$\23\2\177\u0080\7\37\2\2\u0080"+
		"\u0083\7/\2\2\u0081\u0082\7\r\2\2\u0082\u0084\5*\26\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\21\3\2\2\2\u0085\u0088\5\24\13\2\u0086"+
		"\u0088\5\26\f\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\23\3\2\2"+
		"\2\u0089\u008a\7/\2\2\u008a\25\3\2\2\2\u008b\u008c\7/\2\2\u008c\u008d"+
		"\7\26\2\2\u008d\u0092\5\30\r\2\u008e\u008f\7\30\2\2\u008f\u0091\5\30\r"+
		"\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7)\2\2\u0096"+
		"\27\3\2\2\2\u0097\u009d\5\32\16\2\u0098\u009d\5\34\17\2\u0099\u009d\5"+
		"\36\20\2\u009a\u009d\5 \21\2\u009b\u009d\5\"\22\2\u009c\u0097\3\2\2\2"+
		"\u009c\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b"+
		"\3\2\2\2\u009d\31\3\2\2\2\u009e\u009f\5F$\2\u009f\33\3\2\2\2\u00a0\u00a1"+
		"\5H%\2\u00a1\35\3\2\2\2\u00a2\u00a3\5J&\2\u00a3\37\3\2\2\2\u00a4\u00a5"+
		"\7/\2\2\u00a5!\3\2\2\2\u00a6\u00a7\5@!\2\u00a7#\3\2\2\2\u00a8\u00b0\5"+
		"F$\2\u00a9\u00b0\5J&\2\u00aa\u00b0\5H%\2\u00ab\u00b0\7/\2\2\u00ac\u00b0"+
		"\5(\25\2\u00ad\u00b0\5@!\2\u00ae\u00b0\5&\24\2\u00af\u00a8\3\2\2\2\u00af"+
		"\u00a9\3\2\2\2\u00af\u00aa\3\2\2\2\u00af\u00ab\3\2\2\2\u00af\u00ac\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0%\3\2\2\2\u00b1\u00b2"+
		"\7\6\2\2\u00b2\u00b3\7\4\2\2\u00b3\u00b4\5$\23\2\u00b4\'\3\2\2\2\u00b5"+
		"\u00b6\7/\2\2\u00b6\u00b7\7\26\2\2\u00b7\u00b8\7\60\2\2\u00b8\u00b9\7"+
		")\2\2\u00b9)\3\2\2\2\u00ba\u00bb\b\26\1\2\u00bb\u00c6\5.\30\2\u00bc\u00c6"+
		"\7\60\2\2\u00bd\u00c6\5,\27\2\u00be\u00c6\5\66\34\2\u00bf\u00c6\5:\36"+
		"\2\u00c0\u00c6\58\35\2\u00c1\u00c6\5\60\31\2\u00c2\u00c6\5\64\33\2\u00c3"+
		"\u00c6\5\62\32\2\u00c4\u00c6\5> \2\u00c5\u00ba\3\2\2\2\u00c5\u00bc\3\2"+
		"\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00be\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c5"+
		"\u00c0\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00de\3\2\2\2\u00c7\u00c8\f\22\2\2\u00c8"+
		"\u00c9\t\2\2\2\u00c9\u00dd\5*\26\23\u00ca\u00cb\f\21\2\2\u00cb\u00cc\t"+
		"\3\2\2\u00cc\u00dd\5*\26\22\u00cd\u00ce\f\20\2\2\u00ce\u00cf\t\4\2\2\u00cf"+
		"\u00dd\5*\26\21\u00d0\u00d1\f\17\2\2\u00d1\u00d2\t\5\2\2\u00d2\u00dd\5"+
		"*\26\20\u00d3\u00d4\f\16\2\2\u00d4\u00d5\7\34\2\2\u00d5\u00dd\5*\26\17"+
		"\u00d6\u00d7\f\r\2\2\u00d7\u00d8\7\33\2\2\u00d8\u00dd\5*\26\16\u00d9\u00da"+
		"\f\f\2\2\u00da\u00db\t\6\2\2\u00db\u00dd\5*\26\r\u00dc\u00c7\3\2\2\2\u00dc"+
		"\u00ca\3\2\2\2\u00dc\u00cd\3\2\2\2\u00dc\u00d0\3\2\2\2\u00dc\u00d3\3\2"+
		"\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df+\3\2\2\2\u00e0\u00de\3\2\2\2"+
		"\u00e1\u00e2\7,\2\2\u00e2\u00e3\7\26\2\2\u00e3\u00e4\5*\26\2\u00e4\u00e5"+
		"\7)\2\2\u00e5-\3\2\2\2\u00e6\u00e7\7-\2\2\u00e7\u00e8\7\26\2\2\u00e8\u00e9"+
		"\5*\26\2\u00e9\u00ea\7)\2\2\u00ea/\3\2\2\2\u00eb\u00ec\7/\2\2\u00ec\u00ed"+
		"\7\26\2\2\u00ed\u00f2\5*\26\2\u00ee\u00ef\7\30\2\2\u00ef\u00f1\5*\26\2"+
		"\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7)\2\2\u00f6"+
		"\61\3\2\2\2\u00f7\u00f8\7\26\2\2\u00f8\u00f9\5*\26\2\u00f9\u00fa\7)\2"+
		"\2\u00fa\63\3\2\2\2\u00fb\u00fc\7/\2\2\u00fc\65\3\2\2\2\u00fd\u00fe\t"+
		"\7\2\2\u00fe\67\3\2\2\2\u00ff\u0100\7%\2\2\u0100\u0101\7\26\2\2\u0101"+
		"\u0102\7/\2\2\u0102\u0103\7)\2\2\u01039\3\2\2\2\u0104\u0105\7\23\2\2\u0105"+
		"\u0106\5L\'\2\u0106\u0107\7\23\2\2\u0107;\3\2\2\2\u0108\u0111\7 \2\2\u0109"+
		"\u010e\5*\26\2\u010a\u010b\7\30\2\2\u010b\u010d\5*\26\2\u010c\u010a\3"+
		"\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0109\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7$\2\2\u0114=\3\2\2\2\u0115\u011e"+
		"\7\t\2\2\u0116\u011b\5*\26\2\u0117\u0118\7\30\2\2\u0118\u011a\5*\26\2"+
		"\u0119\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0116\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7\f\2\2\u0121?\3\2\2\2"+
		"\u0122\u0123\5B\"\2\u0123\u0124\7\13\2\2\u0124\u0125\5D#\2\u0125A\3\2"+
		"\2\2\u0126\u0127\7\60\2\2\u0127C\3\2\2\2\u0128\u0129\7\60\2\2\u0129E\3"+
		"\2\2\2\u012a\u012b\7\24\2\2\u012bG\3\2\2\2\u012c\u012d\7\b\2\2\u012dI"+
		"\3\2\2\2\u012e\u012f\7&\2\2\u012fK\3\2\2\2\u0130\u0133\n\b\2\2\u0131\u0133"+
		"\7\16\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0135\3\2\2\2"+
		"\u0134\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137M\3\2\2\2\u0138\u0136\3\2\2\2\25S[f|\u0083\u0087\u0092\u009c"+
		"\u00af\u00c5\u00dc\u00de\u00f2\u010e\u0111\u011b\u011e\u0132\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}