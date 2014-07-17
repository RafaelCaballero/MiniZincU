// Generated from MiniZincGrammar.g4 by ANTLR 4.4
package antlr4;

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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'", 
		"'<'", "'='", "'>'", "'?'", "'@'", "'A'", "'B'", "'C'", "'D'", "'E'", 
		"'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", 
		"'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", 
		"'Z'", "'['", "'\\'", "']'", "'^'", "'_'", "'`'", "'a'", "'b'", "'c'", 
		"'d'", "'e'", "'f'"
	};
	public static final String[] ruleNames = {
		"T__95", "T__94", "T__93", "T__92", "T__91", "T__90", "T__89", "T__88", 
		"T__87", "T__86", "T__85", "T__84", "T__83", "T__82", "T__81", "T__80", 
		"T__79", "T__78", "T__77", "T__76", "T__75", "T__74", "T__73", "T__72", 
		"T__71", "T__70", "T__69", "T__68", "T__67", "T__66", "T__65", "T__64", 
		"T__63", "T__62", "T__61", "T__60", "T__59", "T__58", "T__57", "T__56", 
		"T__55", "T__54", "T__53", "T__52", "T__51", "T__50", "T__49", "T__48", 
		"T__47", "T__46", "T__45", "T__44", "T__43", "T__42", "T__41", "T__40", 
		"T__39", "T__38", "T__37", "T__36", "T__35", "T__34", "T__33", "T__32", 
		"T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24", 
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "ESC", 
		"SINGLE_LINE_COMMENT", "ID", "NAT", "WS", "BOOL"
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
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2h\u030d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3"+
		".\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3"+
		"\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3"+
		">\3>\3?\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3I\3I\3I\3J\3J\3J\3J\3K\3K\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3O\3O\3"+
		"P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3"+
		"R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3T\3T\3U\3U\3U\3U\3U\3U\3"+
		"U\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3^\3^\3_\3_\3_\3`\3`\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3b\5b\u02e5\n"+
		"b\3c\3c\7c\u02e9\nc\fc\16c\u02ec\13c\3c\3c\3d\3d\7d\u02f2\nd\fd\16d\u02f5"+
		"\13d\3e\6e\u02f8\ne\re\16e\u02f9\3f\6f\u02fd\nf\rf\16f\u02fe\3f\3f\3g"+
		"\3g\3g\3g\3g\3g\3g\3g\3g\5g\u030c\ng\2\2h\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9"+
		"V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd"+
		"`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\3\2\7\4\2\f"+
		"\f\17\17\4\2C\\c|\7\2))\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u0314\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
		"\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd"+
		"\3\2\2\2\3\u00cf\3\2\2\2\5\u00d5\3\2\2\2\7\u00d7\3\2\2\2\t\u00db\3\2\2"+
		"\2\13\u00dd\3\2\2\2\r\u00df\3\2\2\2\17\u00e1\3\2\2\2\21\u00ed\3\2\2\2"+
		"\23\u00f0\3\2\2\2\25\u00f3\3\2\2\2\27\u00fe\3\2\2\2\31\u0102\3\2\2\2\33"+
		"\u0107\3\2\2\2\35\u010a\3\2\2\2\37\u010c\3\2\2\2!\u010e\3\2\2\2#\u0114"+
		"\3\2\2\2%\u011c\3\2\2\2\'\u0121\3\2\2\2)\u012a\3\2\2\2+\u012d\3\2\2\2"+
		"-\u0137\3\2\2\2/\u013b\3\2\2\2\61\u0143\3\2\2\2\63\u0147\3\2\2\2\65\u014d"+
		"\3\2\2\2\67\u015a\3\2\2\29\u015c\3\2\2\2;\u0161\3\2\2\2=\u0163\3\2\2\2"+
		"?\u016e\3\2\2\2A\u0171\3\2\2\2C\u017c\3\2\2\2E\u0187\3\2\2\2G\u0189\3"+
		"\2\2\2I\u018c\3\2\2\2K\u0195\3\2\2\2M\u0199\3\2\2\2O\u01a0\3\2\2\2Q\u01a4"+
		"\3\2\2\2S\u01a6\3\2\2\2U\u01ab\3\2\2\2W\u01ae\3\2\2\2Y\u01b0\3\2\2\2["+
		"\u01b9\3\2\2\2]\u01bc\3\2\2\2_\u01bf\3\2\2\2a\u01c1\3\2\2\2c\u01ca\3\2"+
		"\2\2e\u01cc\3\2\2\2g\u01ce\3\2\2\2i\u01d0\3\2\2\2k\u01d4\3\2\2\2m\u01d7"+
		"\3\2\2\2o\u01db\3\2\2\2q\u01e1\3\2\2\2s\u01e5\3\2\2\2u\u01e9\3\2\2\2w"+
		"\u01f8\3\2\2\2y\u0201\3\2\2\2{\u0204\3\2\2\2}\u0206\3\2\2\2\177\u020a"+
		"\3\2\2\2\u0081\u020e\3\2\2\2\u0083\u0213\3\2\2\2\u0085\u0216\3\2\2\2\u0087"+
		"\u0226\3\2\2\2\u0089\u0229\3\2\2\2\u008b\u0230\3\2\2\2\u008d\u0232\3\2"+
		"\2\2\u008f\u023b\3\2\2\2\u0091\u023d\3\2\2\2\u0093\u0240\3\2\2\2\u0095"+
		"\u0244\3\2\2\2\u0097\u0246\3\2\2\2\u0099\u0253\3\2\2\2\u009b\u025a\3\2"+
		"\2\2\u009d\u025e\3\2\2\2\u009f\u0260\3\2\2\2\u00a1\u0265\3\2\2\2\u00a3"+
		"\u0275\3\2\2\2\u00a5\u027e\3\2\2\2\u00a7\u0286\3\2\2\2\u00a9\u0288\3\2"+
		"\2\2\u00ab\u028f\3\2\2\2\u00ad\u0295\3\2\2\2\u00af\u029f\3\2\2\2\u00b1"+
		"\u02a8\3\2\2\2\u00b3\u02ad\3\2\2\2\u00b5\u02b5\3\2\2\2\u00b7\u02bb\3\2"+
		"\2\2\u00b9\u02c6\3\2\2\2\u00bb\u02c9\3\2\2\2\u00bd\u02cb\3\2\2\2\u00bf"+
		"\u02ce\3\2\2\2\u00c1\u02d0\3\2\2\2\u00c3\u02e4\3\2\2\2\u00c5\u02e6\3\2"+
		"\2\2\u00c7\u02ef\3\2\2\2\u00c9\u02f7\3\2\2\2\u00cb\u02fc\3\2\2\2\u00cd"+
		"\u030b\3\2\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7f\2"+
		"\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7h\2\2\u00d4\4\3\2\2\2\u00d5\u00d6\7"+
		"b\2\2\u00d6\6\3\2\2\2\u00d7\u00d8\7o\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da"+
		"\7p\2\2\u00da\b\3\2\2\2\u00db\u00dc\7]\2\2\u00dc\n\3\2\2\2\u00dd\u00de"+
		"\7,\2\2\u00de\f\3\2\2\2\u00df\u00e0\7>\2\2\u00e0\16\3\2\2\2\u00e1\u00e2"+
		"\7k\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7r\2\2\u00e4\u00e5\7w\2\2\u00e5"+
		"\u00e6\7v\2\2\u00e6\u00e7\7a\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7t\2\2"+
		"\u00e9\u00ea\7f\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7t\2\2\u00ec\20\3\2"+
		"\2\2\u00ed\u00ee\7#\2\2\u00ee\u00ef\7?\2\2\u00ef\22\3\2\2\2\u00f0\u00f1"+
		"\7>\2\2\u00f1\u00f2\7?\2\2\u00f2\24\3\2\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5"+
		"\7p\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7a\2\2\u00f7\u00f8\7u\2\2\u00f8"+
		"\u00f9\7g\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7e\2\2"+
		"\u00fc\u00fd\7j\2\2\u00fd\26\3\2\2\2\u00fe\u00ff\7/\2\2\u00ff\u0100\7"+
		"/\2\2\u0100\u0101\7@\2\2\u0101\30\3\2\2\2\u0102\u0103\7r\2\2\u0103\u0104"+
		"\7t\2\2\u0104\u0105\7q\2\2\u0105\u0106\7f\2\2\u0106\32\3\2\2\2\u0107\u0108"+
		"\7\61\2\2\u0108\u0109\7^\2\2\u0109\34\3\2\2\2\u010a\u010b\7\177\2\2\u010b"+
		"\36\3\2\2\2\u010c\u010d\7$\2\2\u010d \3\2\2\2\u010e\u010f\7h\2\2\u010f"+
		"\u0110\7n\2\2\u0110\u0111\7q\2\2\u0111\u0112\7c\2\2\u0112\u0113\7v\2\2"+
		"\u0113\"\3\2\2\2\u0114\u0115\7c\2\2\u0115\u0116\7t\2\2\u0116\u0117\7t"+
		"\2\2\u0117\u0118\7c\2\2\u0118\u0119\7{\2\2\u0119\u011a\7\63\2\2\u011a"+
		"\u011b\7f\2\2\u011b$\3\2\2\2\u011c\u011d\7e\2\2\u011d\u011e\7c\2\2\u011e"+
		"\u011f\7u\2\2\u011f\u0120\7g\2\2\u0120&\3\2\2\2\u0121\u0122\7g\2\2\u0122"+
		"\u0123\7z\2\2\u0123\u0124\7v\2\2\u0124\u0125\7g\2\2\u0125\u0126\7p\2\2"+
		"\u0126\u0127\7f\2\2\u0127\u0128\7g\2\2\u0128\u0129\7f\2\2\u0129(\3\2\2"+
		"\2\u012a\u012b\7/\2\2\u012b\u012c\7@\2\2\u012c*\3\2\2\2\u012d\u012e\7"+
		"r\2\2\u012e\u012f\7t\2\2\u012f\u0130\7g\2\2\u0130\u0131\7f\2\2\u0131\u0132"+
		"\7k\2\2\u0132\u0133\7e\2\2\u0133\u0134\7c\2\2\u0134\u0135\7v\2\2\u0135"+
		"\u0136\7g\2\2\u0136,\3\2\2\2\u0137\u0138\7o\2\2\u0138\u0139\7c\2\2\u0139"+
		"\u013a\7z\2\2\u013a.\3\2\2\2\u013b\u013c\7g\2\2\u013c\u013d\7p\2\2\u013d"+
		"\u013e\7f\2\2\u013e\u013f\7e\2\2\u013f\u0140\7c\2\2\u0140\u0141\7u\2\2"+
		"\u0141\u0142\7g\2\2\u0142\60\3\2\2\2\u0143\u0144\7z\2\2\u0144\u0145\7"+
		"q\2\2\u0145\u0146\7t\2\2\u0146\62\3\2\2\2\u0147\u0148\7w\2\2\u0148\u0149"+
		"\7p\2\2\u0149\u014a\7k\2\2\u014a\u014b\7q\2\2\u014b\u014c\7p\2\2\u014c"+
		"\64\3\2\2\2\u014d\u014e\7c\2\2\u014e\u014f\7n\2\2\u014f\u0150\7n\2\2\u0150"+
		"\u0151\7f\2\2\u0151\u0152\7k\2\2\u0152\u0153\7h\2\2\u0153\u0154\7h\2\2"+
		"\u0154\u0155\7g\2\2\u0155\u0156\7t\2\2\u0156\u0157\7g\2\2\u0157\u0158"+
		"\7p\2\2\u0158\u0159\7v\2\2\u0159\66\3\2\2\2\u015a\u015b\7+\2\2\u015b8"+
		"\3\2\2\2\u015c\u015d\7d\2\2\u015d\u015e\7q\2\2\u015e\u015f\7q\2\2\u015f"+
		"\u0160\7n\2\2\u0160:\3\2\2\2\u0161\u0162\7a\2\2\u0162<\3\2\2\2\u0163\u0164"+
		"\7u\2\2\u0164\u0165\7g\2\2\u0165\u0166\7v\2\2\u0166\u0167\7a\2\2\u0167"+
		"\u0168\7u\2\2\u0168\u0169\7g\2\2\u0169\u016a\7c\2\2\u016a\u016b\7t\2\2"+
		"\u016b\u016c\7e\2\2\u016c\u016d\7j\2\2\u016d>\3\2\2\2\u016e\u016f\7<\2"+
		"\2\u016f\u0170\7<\2\2\u0170@\3\2\2\2\u0171\u0172\7u\2\2\u0172\u0173\7"+
		"g\2\2\u0173\u0174\7s\2\2\u0174\u0175\7a\2\2\u0175\u0176\7u\2\2\u0176\u0177"+
		"\7g\2\2\u0177\u0178\7c\2\2\u0178\u0179\7t\2\2\u0179\u017a\7e\2\2\u017a"+
		"\u017b\7j\2\2\u017bB\3\2\2\2\u017c\u017d\7e\2\2\u017d\u017e\7q\2\2\u017e"+
		"\u017f\7p\2\2\u017f\u0180\7u\2\2\u0180\u0181\7v\2\2\u0181\u0182\7t\2\2"+
		"\u0182\u0183\7c\2\2\u0183\u0184\7k\2\2\u0184\u0185\7p\2\2\u0185\u0186"+
		"\7v\2\2\u0186D\3\2\2\2\u0187\u0188\7?\2\2\u0188F\3\2\2\2\u0189\u018a\7"+
		"]\2\2\u018a\u018b\7~\2\2\u018bH\3\2\2\2\u018c\u018d\7o\2\2\u018d\u018e"+
		"\7c\2\2\u018e\u018f\7z\2\2\u018f\u0190\7k\2\2\u0190\u0191\7o\2\2\u0191"+
		"\u0192\7k\2\2\u0192\u0193\7|\2\2\u0193\u0194\7g\2\2\u0194J\3\2\2\2\u0195"+
		"\u0196\7f\2\2\u0196\u0197\7k\2\2\u0197\u0198\7x\2\2\u0198L\3\2\2\2\u0199"+
		"\u019a\7q\2\2\u019a\u019b\7w\2\2\u019b\u019c\7v\2\2\u019c\u019d\7r\2\2"+
		"\u019d\u019e\7w\2\2\u019e\u019f\7v\2\2\u019fN\3\2\2\2\u01a0\u01a1\7o\2"+
		"\2\u01a1\u01a2\7q\2\2\u01a2\u01a3\7f\2\2\u01a3P\3\2\2\2\u01a4\u01a5\7"+
		"~\2\2\u01a5R\3\2\2\2\u01a6\u01a7\7g\2\2\u01a7\u01a8\7p\2\2\u01a8\u01a9"+
		"\7w\2\2\u01a9\u01aa\7o\2\2\u01aaT\3\2\2\2\u01ab\u01ac\7\60\2\2\u01ac\u01ad"+
		"\7\60\2\2\u01adV\3\2\2\2\u01ae\u01af\7_\2\2\u01afX\3\2\2\2\u01b0\u01b1"+
		"\7o\2\2\u01b1\u01b2\7k\2\2\u01b2\u01b3\7p\2\2\u01b3\u01b4\7k\2\2\u01b4"+
		"\u01b5\7o\2\2\u01b5\u01b6\7k\2\2\u01b6\u01b7\7|\2\2\u01b7\u01b8\7g\2\2"+
		"\u01b8Z\3\2\2\2\u01b9\u01ba\7k\2\2\u01ba\u01bb\7p\2\2\u01bb\\\3\2\2\2"+
		"\u01bc\u01bd\7q\2\2\u01bd\u01be\7h\2\2\u01be^\3\2\2\2\u01bf\u01c0\7.\2"+
		"\2\u01c0`\3\2\2\2\u01c1\u01c2\7u\2\2\u01c2\u01c3\7o\2\2\u01c3\u01c4\7"+
		"c\2\2\u01c4\u01c5\7n\2\2\u01c5\u01c6\7n\2\2\u01c6\u01c7\7g\2\2\u01c7\u01c8"+
		"\7u\2\2\u01c8\u01c9\7v\2\2\u01c9b\3\2\2\2\u01ca\u01cb\7/\2\2\u01cbd\3"+
		"\2\2\2\u01cc\u01cd\7<\2\2\u01cdf\3\2\2\2\u01ce\u01cf\7*\2\2\u01cfh\3\2"+
		"\2\2\u01d0\u01d1\7p\2\2\u01d1\u01d2\7q\2\2\u01d2\u01d3\7v\2\2\u01d3j\3"+
		"\2\2\2\u01d4\u01d5\7k\2\2\u01d5\u01d6\7h\2\2\u01d6l\3\2\2\2\u01d7\u01d8"+
		"\7k\2\2\u01d8\u01d9\7p\2\2\u01d9\u01da\7v\2\2\u01dan\3\2\2\2\u01db\u01dc"+
		"\7c\2\2\u01dc\u01dd\7t\2\2\u01dd\u01de\7t\2\2\u01de\u01df\7c\2\2\u01df"+
		"\u01e0\7{\2\2\u01e0p\3\2\2\2\u01e1\u01e2\7x\2\2\u01e2\u01e3\7c\2\2\u01e3"+
		"\u01e4\7t\2\2\u01e4r\3\2\2\2\u01e5\u01e6\7u\2\2\u01e6\u01e7\7g\2\2\u01e7"+
		"\u01e8\7v\2\2\u01e8t\3\2\2\2\u01e9\u01ea\7k\2\2\u01ea\u01eb\7p\2\2\u01eb"+
		"\u01ec\7f\2\2\u01ec\u01ed\7q\2\2\u01ed\u01ee\7o\2\2\u01ee\u01ef\7c\2\2"+
		"\u01ef\u01f0\7k\2\2\u01f0\u01f1\7p\2\2\u01f1\u01f2\7a\2\2\u01f2\u01f3"+
		"\7u\2\2\u01f3\u01f4\7r\2\2\u01f4\u01f5\7n\2\2\u01f5\u01f6\7k\2\2\u01f6"+
		"\u01f7\7v\2\2\u01f7v\3\2\2\2\u01f8\u01f9\7k\2\2\u01f9\u01fa\7p\2\2\u01fa"+
		"\u01fb\7f\2\2\u01fb\u01fc\7q\2\2\u01fc\u01fd\7o\2\2\u01fd\u01fe\7c\2\2"+
		"\u01fe\u01ff\7k\2\2\u01ff\u0200\7p\2\2\u0200x\3\2\2\2\u0201\u0202\7~\2"+
		"\2\u0202\u0203\7_\2\2\u0203z\3\2\2\2\u0204\u0205\7}\2\2\u0205|\3\2\2\2"+
		"\u0206\u0207\7u\2\2\u0207\u0208\7w\2\2\u0208\u0209\7o\2\2\u0209~\3\2\2"+
		"\2\u020a\u020b\7n\2\2\u020b\u020c\7g\2\2\u020c\u020d\7v\2\2\u020d\u0080"+
		"\3\2\2\2\u020e\u020f\7g\2\2\u020f\u0210\7n\2\2\u0210\u0211\7u\2\2\u0211"+
		"\u0212\7g\2\2\u0212\u0082\3\2\2\2\u0213\u0214\7>\2\2\u0214\u0215\7/\2"+
		"\2\u0215\u0084\3\2\2\2\u0216\u0217\7k\2\2\u0217\u0218\7p\2\2\u0218\u0219"+
		"\7f\2\2\u0219\u021a\7q\2\2\u021a\u021b\7o\2\2\u021b\u021c\7c\2\2\u021c"+
		"\u021d\7k\2\2\u021d\u021e\7p\2\2\u021e\u021f\7a\2\2\u021f\u0220\7o\2\2"+
		"\u0220\u0221\7g\2\2\u0221\u0222\7f\2\2\u0222\u0223\7k\2\2\u0223\u0224"+
		"\7c\2\2\u0224\u0225\7p\2\2\u0225\u0086\3\2\2\2\u0226\u0227\7-\2\2\u0227"+
		"\u0228\7-\2\2\u0228\u0088\3\2\2\2\u0229\u022a\7g\2\2\u022a\u022b\7n\2"+
		"\2\u022b\u022c\7u\2\2\u022c\u022d\7g\2\2\u022d\u022e\7k\2\2\u022e\u022f"+
		"\7h\2\2\u022f\u008a\3\2\2\2\u0230\u0231\7`\2\2\u0231\u008c\3\2\2\2\u0232"+
		"\u0233\7h\2\2\u0233\u0234\7w\2\2\u0234\u0235\7p\2\2\u0235\u0236\7e\2\2"+
		"\u0236\u0237\7v\2\2\u0237\u0238\7k\2\2\u0238\u0239\7q\2\2\u0239\u023a"+
		"\7p\2\2\u023a\u008e\3\2\2\2\u023b\u023c\7\60\2\2\u023c\u0090\3\2\2\2\u023d"+
		"\u023e\7^\2\2\u023e\u023f\7\61\2\2\u023f\u0092\3\2\2\2\u0240\u0241\7>"+
		"\2\2\u0241\u0242\7/\2\2\u0242\u0243\7@\2\2\u0243\u0094\3\2\2\2\u0244\u0245"+
		"\7-\2\2\u0245\u0096\3\2\2\2\u0246\u0247\7k\2\2\u0247\u0248\7p\2\2\u0248"+
		"\u0249\7f\2\2\u0249\u024a\7q\2\2\u024a\u024b\7o\2\2\u024b\u024c\7c\2\2"+
		"\u024c\u024d\7k\2\2\u024d\u024e\7p\2\2\u024e\u024f\7a\2\2\u024f\u0250"+
		"\7o\2\2\u0250\u0251\7k\2\2\u0251\u0252\7p\2\2\u0252\u0098\3\2\2\2\u0253"+
		"\u0254\7h\2\2\u0254\u0255\7q\2\2\u0255\u0256\7t\2\2\u0256\u0257\7c\2\2"+
		"\u0257\u0258\7n\2\2\u0258\u0259\7n\2\2\u0259\u009a\3\2\2\2\u025a\u025b"+
		"\7r\2\2\u025b\u025c\7c\2\2\u025c\u025d\7t\2\2\u025d\u009c\3\2\2\2\u025e"+
		"\u025f\7=\2\2\u025f\u009e\3\2\2\2\u0260\u0261\7u\2\2\u0261\u0262\7j\2"+
		"\2\u0262\u0263\7q\2\2\u0263\u0264\7y\2\2\u0264\u00a0\3\2\2\2\u0265\u0266"+
		"\7k\2\2\u0266\u0267\7p\2\2\u0267\u0268\7f\2\2\u0268\u0269\7q\2\2\u0269"+
		"\u026a\7o\2\2\u026a\u026b\7c\2\2\u026b\u026c\7k\2\2\u026c\u026d\7p\2\2"+
		"\u026d\u026e\7a\2\2\u026e\u026f\7t\2\2\u026f\u0270\7c\2\2\u0270\u0271"+
		"\7p\2\2\u0271\u0272\7f\2\2\u0272\u0273\7q\2\2\u0273\u0274\7o\2\2\u0274"+
		"\u00a2\3\2\2\2\u0275\u0276\7e\2\2\u0276\u0277\7q\2\2\u0277\u0278\7o\2"+
		"\2\u0278\u0279\7r\2\2\u0279\u027a\7n\2\2\u027a\u027b\7g\2\2\u027b\u027c"+
		"\7v\2\2\u027c\u027d\7g\2\2\u027d\u00a4\3\2\2\2\u027e\u027f\7k\2\2\u027f"+
		"\u0280\7p\2\2\u0280\u0281\7e\2\2\u0281\u0282\7n\2\2\u0282\u0283\7w\2\2"+
		"\u0283\u0284\7f\2\2\u0284\u0285\7g\2\2\u0285\u00a6\3\2\2\2\u0286\u0287"+
		"\7@\2\2\u0287\u00a8\3\2\2\2\u0288\u0289\7g\2\2\u0289\u028a\7z\2\2\u028a"+
		"\u028b\7k\2\2\u028b\u028c\7u\2\2\u028c\u028d\7v\2\2\u028d\u028e\7u\2\2"+
		"\u028e\u00aa\3\2\2\2\u028f\u0290\7u\2\2\u0290\u0291\7q\2\2\u0291\u0292"+
		"\7n\2\2\u0292\u0293\7x\2\2\u0293\u0294\7g\2\2\u0294\u00ac\3\2\2\2\u0295"+
		"\u0296\7k\2\2\u0296\u0297\7p\2\2\u0297\u0298\7v\2\2\u0298\u0299\7g\2\2"+
		"\u0299\u029a\7t\2\2\u029a\u029b\7u\2\2\u029b\u029c\7g\2\2\u029c\u029d"+
		"\7e\2\2\u029d\u029e\7v\2\2\u029e\u00ae\3\2\2\2\u029f\u02a0\7d\2\2\u02a0"+
		"\u02a1\7q\2\2\u02a1\u02a2\7q\2\2\u02a2\u02a3\7n\2\2\u02a3\u02a4\7\64\2"+
		"\2\u02a4\u02a5\7k\2\2\u02a5\u02a6\7p\2\2\u02a6\u02a7\7v\2\2\u02a7\u00b0"+
		"\3\2\2\2\u02a8\u02a9\7v\2\2\u02a9\u02aa\7j\2\2\u02aa\u02ab\7g\2\2\u02ab"+
		"\u02ac\7p\2\2\u02ac\u00b2\3\2\2\2\u02ad\u02ae\7u\2\2\u02ae\u02af\7c\2"+
		"\2\u02af\u02b0\7v\2\2\u02b0\u02b1\7k\2\2\u02b1\u02b2\7u\2\2\u02b2\u02b3"+
		"\7h\2\2\u02b3\u02b4\7{\2\2\u02b4\u00b4\3\2\2\2\u02b5\u02b6\7y\2\2\u02b6"+
		"\u02b7\7j\2\2\u02b7\u02b8\7g\2\2\u02b8\u02b9\7t\2\2\u02b9\u02ba\7g\2\2"+
		"\u02ba\u00b6\3\2\2\2\u02bb\u02bc\7h\2\2\u02bc\u02bd\7k\2\2\u02bd\u02be"+
		"\7t\2\2\u02be\u02bf\7u\2\2\u02bf\u02c0\7v\2\2\u02c0\u02c1\7a\2\2\u02c1"+
		"\u02c2\7h\2\2\u02c2\u02c3\7c\2\2\u02c3\u02c4\7k\2\2\u02c4\u02c5\7n\2\2"+
		"\u02c5\u00b8\3\2\2\2\u02c6\u02c7\7?\2\2\u02c7\u02c8\7?\2\2\u02c8\u00ba"+
		"\3\2\2\2\u02c9\u02ca\7\61\2\2\u02ca\u00bc\3\2\2\2\u02cb\u02cc\7@\2\2\u02cc"+
		"\u02cd\7?\2\2\u02cd\u00be\3\2\2\2\u02ce\u02cf\7%\2\2\u02cf\u00c0\3\2\2"+
		"\2\u02d0\u02d1\7d\2\2\u02d1\u02d2\7q\2\2\u02d2\u02d3\7q\2\2\u02d3\u02d4"+
		"\7n\2\2\u02d4\u02d5\7a\2\2\u02d5\u02d6\7u\2\2\u02d6\u02d7\7g\2\2\u02d7"+
		"\u02d8\7c\2\2\u02d8\u02d9\7t\2\2\u02d9\u02da\7e\2\2\u02da\u02db\7j\2\2"+
		"\u02db\u00c2\3\2\2\2\u02dc\u02dd\7^\2\2\u02dd\u02e5\7$\2\2\u02de\u02df"+
		"\7^\2\2\u02df\u02e5\7^\2\2\u02e0\u02e1\7^\2\2\u02e1\u02e5\7p\2\2\u02e2"+
		"\u02e3\7^\2\2\u02e3\u02e5\7v\2\2\u02e4\u02dc\3\2\2\2\u02e4\u02de\3\2\2"+
		"\2\u02e4\u02e0\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u00c4\3\2\2\2\u02e6\u02ea"+
		"\7\'\2\2\u02e7\u02e9\n\2\2\2\u02e8\u02e7\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea"+
		"\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02ea\3\2"+
		"\2\2\u02ed\u02ee\bc\2\2\u02ee\u00c6\3\2\2\2\u02ef\u02f3\t\3\2\2\u02f0"+
		"\u02f2\t\4\2\2\u02f1\u02f0\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2"+
		"\2\2\u02f3\u02f4\3\2\2\2\u02f4\u00c8\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6"+
		"\u02f8\t\5\2\2\u02f7\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02f7\3\2"+
		"\2\2\u02f9\u02fa\3\2\2\2\u02fa\u00ca\3\2\2\2\u02fb\u02fd\t\6\2\2\u02fc"+
		"\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2"+
		"\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\bf\2\2\u0301\u00cc\3\2\2\2\u0302"+
		"\u0303\7v\2\2\u0303\u0304\7t\2\2\u0304\u0305\7w\2\2\u0305\u030c\7g\2\2"+
		"\u0306\u0307\7h\2\2\u0307\u0308\7c\2\2\u0308\u0309\7n\2\2\u0309\u030a"+
		"\7u\2\2\u030a\u030c\7g\2\2\u030b\u0302\3\2\2\2\u030b\u0306\3\2\2\2\u030c"+
		"\u00ce\3\2\2\2\t\2\u02e4\u02ea\u02f3\u02f9\u02fe\u030b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}