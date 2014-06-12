package antlr4;
// Generated from MiniZincGrammar.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniZincGrammarLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "','", "'-'", "'*'", "'['", "':'", "'('", "'not'", "'<'", "'int'", 
		"'false'", "'!='", "'<='", "'var'", "'{'", "'/\\'", "'}'", "'<-'", "'true'", 
		"'\"'", "'float'", "'->'", "')'", "'bool'", "'\\/'", "'+'", "'constraint'", 
		"'='", "';'", "'show'", "'\\n'", "'>'", "'output'", "'solve'", "'satisfy'", 
		"'/'", "'=='", "'>='", "'enum'", "'..'", "SINGLE_LINE_COMMENT", "ID", 
		"INT", "NAT", "WS"
	};
	public static final String[] ruleNames = {
		"T__39", "T__38", "T__37", "T__36", "T__35", "T__34", "T__33", "T__32", 
		"T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24", 
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "SINGLE_LINE_COMMENT", 
		"ID", "INT", "NAT", "WS"
	};


	public MiniZincGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniZincGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 40: SINGLE_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 44: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void SINGLE_LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2/\u0108\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\7*\u00ec"+
		"\n*\f*\16*\u00ef\13*\3*\3*\3+\6+\u00f4\n+\r+\16+\u00f5\3,\3,\3,\5,\u00fb"+
		"\n,\3-\6-\u00fe\n-\r-\16-\u00ff\3.\6.\u0103\n.\r.\16.\u0104\3.\3.\2/\3"+
		"\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r"+
		"\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27"+
		"\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\""+
		"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\2U,\1W-\1Y.\1[/\3\3\2\6\4\2\f\f"+
		"\17\17\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\u010c\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7a\3\2\2\2\tc\3\2\2\2\13e\3"+
		"\2\2\2\rg\3\2\2\2\17i\3\2\2\2\21k\3\2\2\2\23o\3\2\2\2\25q\3\2\2\2\27u"+
		"\3\2\2\2\31{\3\2\2\2\33~\3\2\2\2\35\u0081\3\2\2\2\37\u0085\3\2\2\2!\u0087"+
		"\3\2\2\2#\u008a\3\2\2\2%\u008c\3\2\2\2\'\u008f\3\2\2\2)\u0094\3\2\2\2"+
		"+\u0096\3\2\2\2-\u009c\3\2\2\2/\u009f\3\2\2\2\61\u00a1\3\2\2\2\63\u00a6"+
		"\3\2\2\2\65\u00a9\3\2\2\2\67\u00ab\3\2\2\29\u00b6\3\2\2\2;\u00b8\3\2\2"+
		"\2=\u00ba\3\2\2\2?\u00bf\3\2\2\2A\u00c2\3\2\2\2C\u00c4\3\2\2\2E\u00cb"+
		"\3\2\2\2G\u00d1\3\2\2\2I\u00d9\3\2\2\2K\u00db\3\2\2\2M\u00de\3\2\2\2O"+
		"\u00e1\3\2\2\2Q\u00e6\3\2\2\2S\u00e9\3\2\2\2U\u00f3\3\2\2\2W\u00fa\3\2"+
		"\2\2Y\u00fd\3\2\2\2[\u0102\3\2\2\2]^\7_\2\2^\4\3\2\2\2_`\7.\2\2`\6\3\2"+
		"\2\2ab\7/\2\2b\b\3\2\2\2cd\7,\2\2d\n\3\2\2\2ef\7]\2\2f\f\3\2\2\2gh\7<"+
		"\2\2h\16\3\2\2\2ij\7*\2\2j\20\3\2\2\2kl\7p\2\2lm\7q\2\2mn\7v\2\2n\22\3"+
		"\2\2\2op\7>\2\2p\24\3\2\2\2qr\7k\2\2rs\7p\2\2st\7v\2\2t\26\3\2\2\2uv\7"+
		"h\2\2vw\7c\2\2wx\7n\2\2xy\7u\2\2yz\7g\2\2z\30\3\2\2\2{|\7#\2\2|}\7?\2"+
		"\2}\32\3\2\2\2~\177\7>\2\2\177\u0080\7?\2\2\u0080\34\3\2\2\2\u0081\u0082"+
		"\7x\2\2\u0082\u0083\7c\2\2\u0083\u0084\7t\2\2\u0084\36\3\2\2\2\u0085\u0086"+
		"\7}\2\2\u0086 \3\2\2\2\u0087\u0088\7\61\2\2\u0088\u0089\7^\2\2\u0089\""+
		"\3\2\2\2\u008a\u008b\7\177\2\2\u008b$\3\2\2\2\u008c\u008d\7>\2\2\u008d"+
		"\u008e\7/\2\2\u008e&\3\2\2\2\u008f\u0090\7v\2\2\u0090\u0091\7t\2\2\u0091"+
		"\u0092\7w\2\2\u0092\u0093\7g\2\2\u0093(\3\2\2\2\u0094\u0095\7$\2\2\u0095"+
		"*\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098\7n\2\2\u0098\u0099\7q\2\2\u0099"+
		"\u009a\7c\2\2\u009a\u009b\7v\2\2\u009b,\3\2\2\2\u009c\u009d\7/\2\2\u009d"+
		"\u009e\7@\2\2\u009e.\3\2\2\2\u009f\u00a0\7+\2\2\u00a0\60\3\2\2\2\u00a1"+
		"\u00a2\7d\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7n\2\2"+
		"\u00a5\62\3\2\2\2\u00a6\u00a7\7^\2\2\u00a7\u00a8\7\61\2\2\u00a8\64\3\2"+
		"\2\2\u00a9\u00aa\7-\2\2\u00aa\66\3\2\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad"+
		"\7q\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7v\2\2\u00b0"+
		"\u00b1\7t\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7p\2\2"+
		"\u00b4\u00b5\7v\2\2\u00b58\3\2\2\2\u00b6\u00b7\7?\2\2\u00b7:\3\2\2\2\u00b8"+
		"\u00b9\7=\2\2\u00b9<\3\2\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7j\2\2\u00bc"+
		"\u00bd\7q\2\2\u00bd\u00be\7y\2\2\u00be>\3\2\2\2\u00bf\u00c0\7^\2\2\u00c0"+
		"\u00c1\7p\2\2\u00c1@\3\2\2\2\u00c2\u00c3\7@\2\2\u00c3B\3\2\2\2\u00c4\u00c5"+
		"\7q\2\2\u00c5\u00c6\7w\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7r\2\2\u00c8"+
		"\u00c9\7w\2\2\u00c9\u00ca\7v\2\2\u00caD\3\2\2\2\u00cb\u00cc\7u\2\2\u00cc"+
		"\u00cd\7q\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7x\2\2\u00cf\u00d0\7g\2\2"+
		"\u00d0F\3\2\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7v\2"+
		"\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8"+
		"\7{\2\2\u00d8H\3\2\2\2\u00d9\u00da\7\61\2\2\u00daJ\3\2\2\2\u00db\u00dc"+
		"\7?\2\2\u00dc\u00dd\7?\2\2\u00ddL\3\2\2\2\u00de\u00df\7@\2\2\u00df\u00e0"+
		"\7?\2\2\u00e0N\3\2\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4"+
		"\7w\2\2\u00e4\u00e5\7o\2\2\u00e5P\3\2\2\2\u00e6\u00e7\7\60\2\2\u00e7\u00e8"+
		"\7\60\2\2\u00e8R\3\2\2\2\u00e9\u00ed\7\'\2\2\u00ea\u00ec\n\2\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\b*\2\2\u00f1"+
		"T\3\2\2\2\u00f2\u00f4\t\3\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2"+
		"\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6V\3\2\2\2\u00f7\u00fb\5"+
		"Y-\2\u00f8\u00f9\7/\2\2\u00f9\u00fb\5Y-\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fbX\3\2\2\2\u00fc\u00fe\t\4\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100Z\3\2\2\2"+
		"\u0101\u0103\t\5\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\b.\3\2\u0107"+
		"\\\3\2\2\2\b\2\u00ed\u00f5\u00fa\u00ff\u0104";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}