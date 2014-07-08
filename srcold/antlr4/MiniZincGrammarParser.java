package antlr4;
// Generated from MiniZincGrammar.g4 by ANTLR 4.1
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
		T__39=1, T__38=2, T__37=3, T__36=4, T__35=5, T__34=6, T__33=7, T__32=8, 
		T__31=9, T__30=10, T__29=11, T__28=12, T__27=13, T__26=14, T__25=15, T__24=16, 
		T__23=17, T__22=18, T__21=19, T__20=20, T__19=21, T__18=22, T__17=23, 
		T__16=24, T__15=25, T__14=26, T__13=27, T__12=28, T__11=29, T__10=30, 
		T__9=31, T__8=32, T__7=33, T__6=34, T__5=35, T__4=36, T__3=37, T__2=38, 
		T__1=39, T__0=40, SINGLE_LINE_COMMENT=41, ID=42, INT=43, NAT=44, WS=45;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "','", "'-'", "'*'", "'['", "':'", "'('", "'not'", 
		"'<'", "'int'", "'false'", "'!='", "'<='", "'var'", "'{'", "'/\\'", "'}'", 
		"'<-'", "'true'", "'\"'", "'float'", "'->'", "')'", "'bool'", "'\\/'", 
		"'+'", "'constraint'", "'='", "';'", "'show'", "'\\n'", "'>'", "'output'", 
		"'solve'", "'satisfy'", "'/'", "'=='", "'>='", "'enum'", "'..'", "SINGLE_LINE_COMMENT", 
		"ID", "INT", "NAT", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_data = 2, RULE_constraint = 3, RULE_var = 4, 
		RULE_output = 5, RULE_solve = 6, RULE_constr = 7, RULE_scons = 8, RULE_tcons = 9, 
		RULE_arg = 10, RULE_argint = 11, RULE_argfloat = 12, RULE_argbool = 13, 
		RULE_argunion = 14, RULE_argrange = 15, RULE_typename = 16, RULE_typedata = 17, 
		RULE_expr = 18, RULE_notExpr = 19, RULE_minusExpr = 20, RULE_predOrUnionExpr = 21, 
		RULE_rbracketExpr = 22, RULE_idexpr = 23, RULE_boolExpr = 24, RULE_showExpr = 25, 
		RULE_stringExpr = 26, RULE_string = 27, RULE_list = 28, RULE_range = 29, 
		RULE_fromR = 30, RULE_toR = 31, RULE_rint = 32, RULE_rfloat = 33, RULE_rbool = 34;
	public static final String[] ruleNames = {
		"prog", "stat", "data", "constraint", "var", "output", "solve", "constr", 
		"scons", "tcons", "arg", "argint", "argfloat", "argbool", "argunion", 
		"argrange", "typename", "typedata", "expr", "notExpr", "minusExpr", "predOrUnionExpr", 
		"rbracketExpr", "idexpr", "boolExpr", "showExpr", "stringExpr", "string", 
		"list", "range", "fromR", "toR", "rint", "rfloat", "rbool"
	};

	@Override
	public String getGrammarFileName() { return "MiniZincGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

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
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70); stat();
				setState(71); match(29);
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << 27) | (1L << 33) | (1L << 34) | (1L << 39))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public SolveContext solve() {
			return getRuleContext(SolveContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
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
			setState(82);
			switch (_input.LA(1)) {
			case 39:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); data();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); constraint();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 3);
				{
				setState(79); var();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 4);
				{
				setState(80); solve();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 5);
				{
				setState(81); output();
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
		public List<ConstrContext> constr() {
			return getRuleContexts(ConstrContext.class);
		}
		public ConstrContext constr(int i) {
			return getRuleContext(ConstrContext.class,i);
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
			setState(84); match(39);
			setState(85); match(ID);
			setState(86); match(28);
			setState(87); match(15);
			setState(88); constr();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(89); match(2);
				setState(90); constr();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96); match(17);
			}
		}
		catch (RecognitionException re) {
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
			setState(98); match(27);
			setState(99); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
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
			setState(101); match(14);
			setState(102); typename();
			setState(103); match(6);
			setState(104); match(ID);
			}
		}
		catch (RecognitionException re) {
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
			setState(106); match(33);
			setState(107); match(7);
			setState(108); list();
			setState(109); match(23);
			}
		}
		catch (RecognitionException re) {
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
			setState(111); match(34);
			setState(112); match(35);
			}
		}
		catch (RecognitionException re) {
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
		public SconsContext scons() {
			return getRuleContext(SconsContext.class,0);
		}
		public TconsContext tcons() {
			return getRuleContext(TconsContext.class,0);
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
		enterRule(_localctx, 14, RULE_constr);
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); scons();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); tcons();
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
		enterRule(_localctx, 16, RULE_scons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(ID);
			}
		}
		catch (RecognitionException re) {
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
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
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
		enterRule(_localctx, 18, RULE_tcons);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(ID);
			setState(121); match(7);
			setState(122); arg();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(123); match(2);
				setState(124); arg();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130); match(23);
			}
		}
		catch (RecognitionException re) {
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
		public ArgfloatContext argfloat() {
			return getRuleContext(ArgfloatContext.class,0);
		}
		public ArgrangeContext argrange() {
			return getRuleContext(ArgrangeContext.class,0);
		}
		public ArgboolContext argbool() {
			return getRuleContext(ArgboolContext.class,0);
		}
		public ArgunionContext argunion() {
			return getRuleContext(ArgunionContext.class,0);
		}
		public ArgintContext argint() {
			return getRuleContext(ArgintContext.class,0);
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
		enterRule(_localctx, 20, RULE_arg);
		try {
			setState(137);
			switch (_input.LA(1)) {
			case 10:
				enterOuterAlt(_localctx, 1);
				{
				setState(132); argint();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 2);
				{
				setState(133); argfloat();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 3);
				{
				setState(134); argbool();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(135); argunion();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 5);
				{
				setState(136); argrange();
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
		enterRule(_localctx, 22, RULE_argint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); rint();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 24, RULE_argfloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); rfloat();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 26, RULE_argbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); rbool();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 28, RULE_argunion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(ID);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_argrange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); range();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TypedataContext typedata() {
			return getRuleContext(TypedataContext.class,0);
		}
		public RfloatContext rfloat() {
			return getRuleContext(RfloatContext.class,0);
		}
		public RboolContext rbool() {
			return getRuleContext(RboolContext.class,0);
		}
		public RintContext rint() {
			return getRuleContext(RintContext.class,0);
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
		enterRule(_localctx, 32, RULE_typename);
		try {
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149); rint();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150); rbool();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151); rfloat();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152); match(ID);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153); typedata();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154); range();
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

	public static class TypedataContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MiniZincGrammarParser.INT, 0); }
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
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
		enterRule(_localctx, 34, RULE_typedata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(ID);
			setState(158); match(7);
			setState(159); match(INT);
			setState(160); match(23);
			}
		}
		catch (RecognitionException re) {
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
		public int _p;
		public ShowExprContext showExpr() {
			return getRuleContext(ShowExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public PredOrUnionExprContext predOrUnionExpr() {
			return getRuleContext(PredOrUnionExprContext.class,0);
		}
		public IdexprContext idexpr() {
			return getRuleContext(IdexprContext.class,0);
		}
		public TerminalNode INT() { return getToken(MiniZincGrammarParser.INT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public MinusExprContext minusExpr() {
			return getRuleContext(MinusExprContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RbracketExprContext rbracketExpr() {
			return getRuleContext(RbracketExprContext.class,0);
		}
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
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

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(163); minusExpr();
				}
				break;

			case 2:
				{
				setState(164); match(INT);
				}
				break;

			case 3:
				{
				setState(165); notExpr();
				}
				break;

			case 4:
				{
				setState(166); boolExpr();
				}
				break;

			case 5:
				{
				setState(167); stringExpr();
				}
				break;

			case 6:
				{
				setState(168); showExpr();
				}
				break;

			case 7:
				{
				setState(169); predOrUnionExpr();
				}
				break;

			case 8:
				{
				setState(170); idexpr();
				}
				break;

			case 9:
				{
				setState(171); rbracketExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(175);
						_la = _input.LA(1);
						if ( !(_la==4 || _la==36) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(176); expr(16);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(178);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==26) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(179); expr(15);
						}
						break;

					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(181);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 13) | (1L << 32) | (1L << 38))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(182); expr(14);
						}
						break;

					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(184);
						_la = _input.LA(1);
						if ( !(_la==16 || _la==25) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(185); expr(13);
						}
						break;

					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(187); match(22);
						setState(188); expr(12);
						}
						break;

					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(190); match(18);
						setState(191); expr(11);
						}
						break;

					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(193);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 28) | (1L << 37))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(194); expr(10);
						}
						break;
					}
					} 
				}
				setState(199);
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
		enterRule(_localctx, 38, RULE_notExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(8);
			setState(201); match(7);
			setState(202); expr(0);
			setState(203); match(23);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_minusExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(3);
			setState(206); match(7);
			setState(207); expr(0);
			setState(208); match(23);
			}
		}
		catch (RecognitionException re) {
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
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
		enterRule(_localctx, 42, RULE_predOrUnionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); match(ID);
			setState(211); match(7);
			setState(212); expr(0);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(213); match(2);
				setState(214); expr(0);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220); match(23);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 44, RULE_rbracketExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(7);
			setState(223); expr(0);
			setState(224); match(23);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 46, RULE_idexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); match(ID);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 48, RULE_boolExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !(_la==11 || _la==19) ) {
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
		enterRule(_localctx, 50, RULE_showExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); match(30);
			setState(231); match(7);
			setState(232); match(ID);
			setState(233); match(23);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 52, RULE_stringExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); match(20);
			setState(236); string();
			setState(237); match(20);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 54, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << SINGLE_LINE_COMMENT) | (1L << ID) | (1L << INT) | (1L << NAT) | (1L << WS))) != 0)) {
				{
				{
				setState(241);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(239);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==20) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;

				case 2:
					{
					setState(240); match(31);
					}
					break;
				}
				}
				}
				setState(247);
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
		enterRule(_localctx, 56, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(5);
			setState(249); expr(0);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(250); match(2);
				setState(251); expr(0);
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257); match(1);
			}
		}
		catch (RecognitionException re) {
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
		public FromRContext fromR() {
			return getRuleContext(FromRContext.class,0);
		}
		public ToRContext toR() {
			return getRuleContext(ToRContext.class,0);
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
		enterRule(_localctx, 58, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); fromR();
			setState(260); match(40);
			setState(261); toR();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 60, RULE_fromR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(INT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 62, RULE_toR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); match(INT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 64, RULE_rint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); match(10);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 66, RULE_rfloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269); match(21);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 68, RULE_rbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); match(24);
			}
		}
		catch (RecognitionException re) {
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
		case 18: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 15 >= _localctx._p;

		case 1: return 14 >= _localctx._p;

		case 2: return 13 >= _localctx._p;

		case 3: return 12 >= _localctx._p;

		case 4: return 11 >= _localctx._p;

		case 5: return 10 >= _localctx._p;

		case 6: return 9 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3/\u0114\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\6\2L\n\2\r\2\16\2M\3\3\3\3\3\3\3\3"+
		"\3\3\5\3U\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\5\tw\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u0080\n\13\f\13"+
		"\16\13\u0083\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u008c\n\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u009e\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00af\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u00c6\n\24\f\24\16\24\u00c9\13\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u00da\n\27\f\27\16"+
		"\27\u00dd\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\5\35\u00f4\n\35\7\35"+
		"\u00f6\n\35\f\35\16\35\u00f9\13\35\3\36\3\36\3\36\3\36\7\36\u00ff\n\36"+
		"\f\36\16\36\u0102\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3$\2%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDF\2\t\4\2\6\6&&\4\2\5\5\34\34\6\2\13\13\17\17\"\""+
		"((\4\2\22\22\33\33\5\2\16\16\36\36\'\'\4\2\r\r\25\25\3\2\26\26\u0114\2"+
		"K\3\2\2\2\4T\3\2\2\2\6V\3\2\2\2\bd\3\2\2\2\ng\3\2\2\2\fl\3\2\2\2\16q\3"+
		"\2\2\2\20v\3\2\2\2\22x\3\2\2\2\24z\3\2\2\2\26\u008b\3\2\2\2\30\u008d\3"+
		"\2\2\2\32\u008f\3\2\2\2\34\u0091\3\2\2\2\36\u0093\3\2\2\2 \u0095\3\2\2"+
		"\2\"\u009d\3\2\2\2$\u009f\3\2\2\2&\u00ae\3\2\2\2(\u00ca\3\2\2\2*\u00cf"+
		"\3\2\2\2,\u00d4\3\2\2\2.\u00e0\3\2\2\2\60\u00e4\3\2\2\2\62\u00e6\3\2\2"+
		"\2\64\u00e8\3\2\2\2\66\u00ed\3\2\2\28\u00f7\3\2\2\2:\u00fa\3\2\2\2<\u0105"+
		"\3\2\2\2>\u0109\3\2\2\2@\u010b\3\2\2\2B\u010d\3\2\2\2D\u010f\3\2\2\2F"+
		"\u0111\3\2\2\2HI\5\4\3\2IJ\7\37\2\2JL\3\2\2\2KH\3\2\2\2LM\3\2\2\2MK\3"+
		"\2\2\2MN\3\2\2\2N\3\3\2\2\2OU\5\6\4\2PU\5\b\5\2QU\5\n\6\2RU\5\16\b\2S"+
		"U\5\f\7\2TO\3\2\2\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\5\3\2\2\2"+
		"VW\7)\2\2WX\7,\2\2XY\7\36\2\2YZ\7\21\2\2Z_\5\20\t\2[\\\7\4\2\2\\^\5\20"+
		"\t\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\23"+
		"\2\2c\7\3\2\2\2de\7\35\2\2ef\5&\24\2f\t\3\2\2\2gh\7\20\2\2hi\5\"\22\2"+
		"ij\7\b\2\2jk\7,\2\2k\13\3\2\2\2lm\7#\2\2mn\7\t\2\2no\5:\36\2op\7\31\2"+
		"\2p\r\3\2\2\2qr\7$\2\2rs\7%\2\2s\17\3\2\2\2tw\5\22\n\2uw\5\24\13\2vt\3"+
		"\2\2\2vu\3\2\2\2w\21\3\2\2\2xy\7,\2\2y\23\3\2\2\2z{\7,\2\2{|\7\t\2\2|"+
		"\u0081\5\26\f\2}~\7\4\2\2~\u0080\5\26\f\2\177}\3\2\2\2\u0080\u0083\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0085\7\31\2\2\u0085\25\3\2\2\2\u0086\u008c\5\30\r\2\u0087"+
		"\u008c\5\32\16\2\u0088\u008c\5\34\17\2\u0089\u008c\5\36\20\2\u008a\u008c"+
		"\5 \21\2\u008b\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\27\3\2\2\2\u008d\u008e\5B\"\2"+
		"\u008e\31\3\2\2\2\u008f\u0090\5D#\2\u0090\33\3\2\2\2\u0091\u0092\5F$\2"+
		"\u0092\35\3\2\2\2\u0093\u0094\7,\2\2\u0094\37\3\2\2\2\u0095\u0096\5<\37"+
		"\2\u0096!\3\2\2\2\u0097\u009e\5B\"\2\u0098\u009e\5F$\2\u0099\u009e\5D"+
		"#\2\u009a\u009e\7,\2\2\u009b\u009e\5$\23\2\u009c\u009e\5<\37\2\u009d\u0097"+
		"\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009a\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e#\3\2\2\2\u009f\u00a0\7,\2\2\u00a0"+
		"\u00a1\7\t\2\2\u00a1\u00a2\7-\2\2\u00a2\u00a3\7\31\2\2\u00a3%\3\2\2\2"+
		"\u00a4\u00a5\b\24\1\2\u00a5\u00af\5*\26\2\u00a6\u00af\7-\2\2\u00a7\u00af"+
		"\5(\25\2\u00a8\u00af\5\62\32\2\u00a9\u00af\5\66\34\2\u00aa\u00af\5\64"+
		"\33\2\u00ab\u00af\5,\27\2\u00ac\u00af\5\60\31\2\u00ad\u00af\5.\30\2\u00ae"+
		"\u00a4\3\2\2\2\u00ae\u00a6\3\2\2\2\u00ae\u00a7\3\2\2\2\u00ae\u00a8\3\2"+
		"\2\2\u00ae\u00a9\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00c7\3\2\2\2\u00b0\u00b1\6\24"+
		"\2\3\u00b1\u00b2\t\2\2\2\u00b2\u00c6\5&\24\2\u00b3\u00b4\6\24\3\3\u00b4"+
		"\u00b5\t\3\2\2\u00b5\u00c6\5&\24\2\u00b6\u00b7\6\24\4\3\u00b7\u00b8\t"+
		"\4\2\2\u00b8\u00c6\5&\24\2\u00b9\u00ba\6\24\5\3\u00ba\u00bb\t\5\2\2\u00bb"+
		"\u00c6\5&\24\2\u00bc\u00bd\6\24\6\3\u00bd\u00be\7\30\2\2\u00be\u00c6\5"+
		"&\24\2\u00bf\u00c0\6\24\7\3\u00c0\u00c1\7\24\2\2\u00c1\u00c6\5&\24\2\u00c2"+
		"\u00c3\6\24\b\3\u00c3\u00c4\t\6\2\2\u00c4\u00c6\5&\24\2\u00c5\u00b0\3"+
		"\2\2\2\u00c5\u00b3\3\2\2\2\u00c5\u00b6\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c5"+
		"\u00bc\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c6\u00c9\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\'\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00ca\u00cb\7\n\2\2\u00cb\u00cc\7\t\2\2\u00cc\u00cd\5&\24\2\u00cd"+
		"\u00ce\7\31\2\2\u00ce)\3\2\2\2\u00cf\u00d0\7\5\2\2\u00d0\u00d1\7\t\2\2"+
		"\u00d1\u00d2\5&\24\2\u00d2\u00d3\7\31\2\2\u00d3+\3\2\2\2\u00d4\u00d5\7"+
		",\2\2\u00d5\u00d6\7\t\2\2\u00d6\u00db\5&\24\2\u00d7\u00d8\7\4\2\2\u00d8"+
		"\u00da\5&\24\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00df\7\31\2\2\u00df-\3\2\2\2\u00e0\u00e1\7\t\2\2\u00e1\u00e2\5&\24\2"+
		"\u00e2\u00e3\7\31\2\2\u00e3/\3\2\2\2\u00e4\u00e5\7,\2\2\u00e5\61\3\2\2"+
		"\2\u00e6\u00e7\t\7\2\2\u00e7\63\3\2\2\2\u00e8\u00e9\7 \2\2\u00e9\u00ea"+
		"\7\t\2\2\u00ea\u00eb\7,\2\2\u00eb\u00ec\7\31\2\2\u00ec\65\3\2\2\2\u00ed"+
		"\u00ee\7\26\2\2\u00ee\u00ef\58\35\2\u00ef\u00f0\7\26\2\2\u00f0\67\3\2"+
		"\2\2\u00f1\u00f4\n\b\2\2\u00f2\u00f4\7!\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f89\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00fa\u00fb\7\7\2\2\u00fb\u0100\5&\24\2\u00fc\u00fd\7\4\2\2\u00fd"+
		"\u00ff\5&\24\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u0104\7\3\2\2\u0104;\3\2\2\2\u0105\u0106\5> \2\u0106\u0107\7*\2\2\u0107"+
		"\u0108\5@!\2\u0108=\3\2\2\2\u0109\u010a\7-\2\2\u010a?\3\2\2\2\u010b\u010c"+
		"\7-\2\2\u010cA\3\2\2\2\u010d\u010e\7\f\2\2\u010eC\3\2\2\2\u010f\u0110"+
		"\7\27\2\2\u0110E\3\2\2\2\u0111\u0112\7\32\2\2\u0112G\3\2\2\2\20MT_v\u0081"+
		"\u008b\u009d\u00ae\u00c5\u00c7\u00db\u00f3\u00f7\u0100";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}