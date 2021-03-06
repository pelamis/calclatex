// Generated from C:/Users/Daria/Documents/IdeaProjects/interpteter/src/com/bmstu\interpreter.g4 by ANTLR 4.5.1
package com.bmstu;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class interpreterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, VECT=2, MATR=3, IMACRO=4, IPRINT=5, SWITCHOP=6, CASEOP=7, DEFOP=8, 
		AT=9, IN=10, VMUL=11, HMUL=12, INV=13, TRANSP=14, TEXT=15, OR=16, AND=17, 
		GEQ=18, LEQ=19, NEQ=20, EQ=21, GE=22, LE=23, PLUS=24, MINUS=25, MUL=26, 
		POWOP=27, DIV=28, FRAC=29, LCURLB=30, RCURLB=31, LPAREN=32, RPAREN=33, 
		LBRACK=34, RBRACK=35, BAR=36, UNDERLN=37, ASGNOP=38, DOT=39, COMMA=40, 
		SMCOLON=41, IDENT=42, NUM=43, LTEXT=44, RTEXT=45, RSYM=46, WS=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "VECT", "MATR", "IMACRO", "IPRINT", "SWITCHOP", "CASEOP", "DEFOP", 
		"AT", "IN", "VMUL", "HMUL", "INV", "TRANSP", "TEXT", "OR", "AND", "GEQ", 
		"LEQ", "NEQ", "EQ", "GE", "LE", "PLUS", "MINUS", "MUL", "POWOP", "DIV", 
		"FRAC", "LCURLB", "RCURLB", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "BAR", 
		"UNDERLN", "ASGNOP", "DOT", "COMMA", "SMCOLON", "IDENT", "NUM", "LTEXT", 
		"RTEXT", "RSYM", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "'\\vect'", "'\\matr'", "'\\imacro'", "'\\iprint'", "'\\conditional'", 
		"'\\case'", "'\\otherwise'", "'\\at'", "'\\in'", "'\\times'", "'\\hidemul'", 
		"'\\inverse'", "'\\transpose'", "'\\text'", "'\\lor'", "'\\land'", "'\\ge'", 
		"'\\le'", "'\\ne'", "'='", "'>'", "'<'", "'+'", "'-'", "'\\cdot'", "'^'", 
		"'\\div'", "'\\frac'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'|'", 
		"'_'", "':='", "'.'", "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "VECT", "MATR", "IMACRO", "IPRINT", "SWITCHOP", "CASEOP", 
		"DEFOP", "AT", "IN", "VMUL", "HMUL", "INV", "TRANSP", "TEXT", "OR", "AND", 
		"GEQ", "LEQ", "NEQ", "EQ", "GE", "LE", "PLUS", "MINUS", "MUL", "POWOP", 
		"DIV", "FRAC", "LCURLB", "RCURLB", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
		"BAR", "UNDERLN", "ASGNOP", "DOT", "COMMA", "SMCOLON", "IDENT", "NUM", 
		"LTEXT", "RTEXT", "RSYM", "WS"
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


	public interpreterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "interpreter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u0159\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3+\3+\5+\u011f\n+\3+\3+\3+\3+\5+\u0125\n+\3+\3+\5+\u0129\n"+
		"+\3,\6,\u012c\n,\r,\16,\u012d\3,\3,\6,\u0132\n,\r,\16,\u0133\3,\6,\u0137"+
		"\n,\r,\16,\u0138\5,\u013b\n,\3-\6-\u013e\n-\r-\16-\u013f\3-\7-\u0143\n"+
		"-\f-\16-\u0146\13-\3.\3.\3.\6.\u014b\n.\r.\16.\u014c\3.\3.\3/\3/\3\60"+
		"\6\60\u0154\n\60\r\60\16\60\u0155\3\60\3\60\2\2\61\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61\3\2\7\3\2\62;\4\2C\\c|\5\2\62;C\\c|\7\2\13\f"+
		"\17\17\"\"}}\177\177\5\2\13\f\17\17\"\"\u0163\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7i\3\2"+
		"\2\2\to\3\2\2\2\13w\3\2\2\2\r\177\3\2\2\2\17\u008c\3\2\2\2\21\u0092\3"+
		"\2\2\2\23\u009d\3\2\2\2\25\u00a1\3\2\2\2\27\u00a5\3\2\2\2\31\u00ac\3\2"+
		"\2\2\33\u00b5\3\2\2\2\35\u00be\3\2\2\2\37\u00c9\3\2\2\2!\u00cf\3\2\2\2"+
		"#\u00d4\3\2\2\2%\u00da\3\2\2\2\'\u00de\3\2\2\2)\u00e2\3\2\2\2+\u00e6\3"+
		"\2\2\2-\u00e8\3\2\2\2/\u00ea\3\2\2\2\61\u00ec\3\2\2\2\63\u00ee\3\2\2\2"+
		"\65\u00f0\3\2\2\2\67\u00f6\3\2\2\29\u00f8\3\2\2\2;\u00fd\3\2\2\2=\u0103"+
		"\3\2\2\2?\u0105\3\2\2\2A\u0107\3\2\2\2C\u0109\3\2\2\2E\u010b\3\2\2\2G"+
		"\u010d\3\2\2\2I\u010f\3\2\2\2K\u0111\3\2\2\2M\u0113\3\2\2\2O\u0116\3\2"+
		"\2\2Q\u0118\3\2\2\2S\u011a\3\2\2\2U\u011e\3\2\2\2W\u013a\3\2\2\2Y\u013d"+
		"\3\2\2\2[\u0147\3\2\2\2]\u0150\3\2\2\2_\u0153\3\2\2\2ab\7\f\2\2b\4\3\2"+
		"\2\2cd\7^\2\2de\7x\2\2ef\7g\2\2fg\7e\2\2gh\7v\2\2h\6\3\2\2\2ij\7^\2\2"+
		"jk\7o\2\2kl\7c\2\2lm\7v\2\2mn\7t\2\2n\b\3\2\2\2op\7^\2\2pq\7k\2\2qr\7"+
		"o\2\2rs\7c\2\2st\7e\2\2tu\7t\2\2uv\7q\2\2v\n\3\2\2\2wx\7^\2\2xy\7k\2\2"+
		"yz\7r\2\2z{\7t\2\2{|\7k\2\2|}\7p\2\2}~\7v\2\2~\f\3\2\2\2\177\u0080\7^"+
		"\2\2\u0080\u0081\7e\2\2\u0081\u0082\7q\2\2\u0082\u0083\7p\2\2\u0083\u0084"+
		"\7f\2\2\u0084\u0085\7k\2\2\u0085\u0086\7v\2\2\u0086\u0087\7k\2\2\u0087"+
		"\u0088\7q\2\2\u0088\u0089\7p\2\2\u0089\u008a\7c\2\2\u008a\u008b\7n\2\2"+
		"\u008b\16\3\2\2\2\u008c\u008d\7^\2\2\u008d\u008e\7e\2\2\u008e\u008f\7"+
		"c\2\2\u008f\u0090\7u\2\2\u0090\u0091\7g\2\2\u0091\20\3\2\2\2\u0092\u0093"+
		"\7^\2\2\u0093\u0094\7q\2\2\u0094\u0095\7v\2\2\u0095\u0096\7j\2\2\u0096"+
		"\u0097\7g\2\2\u0097\u0098\7t\2\2\u0098\u0099\7y\2\2\u0099\u009a\7k\2\2"+
		"\u009a\u009b\7u\2\2\u009b\u009c\7g\2\2\u009c\22\3\2\2\2\u009d\u009e\7"+
		"^\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7v\2\2\u00a0\24\3\2\2\2\u00a1\u00a2"+
		"\7^\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\26\3\2\2\2\u00a5\u00a6"+
		"\7^\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7o\2\2\u00a9"+
		"\u00aa\7g\2\2\u00aa\u00ab\7u\2\2\u00ab\30\3\2\2\2\u00ac\u00ad\7^\2\2\u00ad"+
		"\u00ae\7j\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7f\2\2\u00b0\u00b1\7g\2\2"+
		"\u00b1\u00b2\7o\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7n\2\2\u00b4\32\3\2"+
		"\2\2\u00b5\u00b6\7^\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9"+
		"\7x\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7u\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd\34\3\2\2\2\u00be\u00bf\7^\2\2\u00bf\u00c0\7v\2\2\u00c0"+
		"\u00c1\7t\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7u\2\2"+
		"\u00c4\u00c5\7r\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8"+
		"\7g\2\2\u00c8\36\3\2\2\2\u00c9\u00ca\7^\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc"+
		"\7g\2\2\u00cc\u00cd\7z\2\2\u00cd\u00ce\7v\2\2\u00ce \3\2\2\2\u00cf\u00d0"+
		"\7^\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7t\2\2\u00d3"+
		"\"\3\2\2\2\u00d4\u00d5\7^\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7c\2\2\u00d7"+
		"\u00d8\7p\2\2\u00d8\u00d9\7f\2\2\u00d9$\3\2\2\2\u00da\u00db\7^\2\2\u00db"+
		"\u00dc\7i\2\2\u00dc\u00dd\7g\2\2\u00dd&\3\2\2\2\u00de\u00df\7^\2\2\u00df"+
		"\u00e0\7n\2\2\u00e0\u00e1\7g\2\2\u00e1(\3\2\2\2\u00e2\u00e3\7^\2\2\u00e3"+
		"\u00e4\7p\2\2\u00e4\u00e5\7g\2\2\u00e5*\3\2\2\2\u00e6\u00e7\7?\2\2\u00e7"+
		",\3\2\2\2\u00e8\u00e9\7@\2\2\u00e9.\3\2\2\2\u00ea\u00eb\7>\2\2\u00eb\60"+
		"\3\2\2\2\u00ec\u00ed\7-\2\2\u00ed\62\3\2\2\2\u00ee\u00ef\7/\2\2\u00ef"+
		"\64\3\2\2\2\u00f0\u00f1\7^\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3\7f\2\2\u00f3"+
		"\u00f4\7q\2\2\u00f4\u00f5\7v\2\2\u00f5\66\3\2\2\2\u00f6\u00f7\7`\2\2\u00f7"+
		"8\3\2\2\2\u00f8\u00f9\7^\2\2\u00f9\u00fa\7f\2\2\u00fa\u00fb\7k\2\2\u00fb"+
		"\u00fc\7x\2\2\u00fc:\3\2\2\2\u00fd\u00fe\7^\2\2\u00fe\u00ff\7h\2\2\u00ff"+
		"\u0100\7t\2\2\u0100\u0101\7c\2\2\u0101\u0102\7e\2\2\u0102<\3\2\2\2\u0103"+
		"\u0104\7}\2\2\u0104>\3\2\2\2\u0105\u0106\7\177\2\2\u0106@\3\2\2\2\u0107"+
		"\u0108\7*\2\2\u0108B\3\2\2\2\u0109\u010a\7+\2\2\u010aD\3\2\2\2\u010b\u010c"+
		"\7]\2\2\u010cF\3\2\2\2\u010d\u010e\7_\2\2\u010eH\3\2\2\2\u010f\u0110\7"+
		"~\2\2\u0110J\3\2\2\2\u0111\u0112\7a\2\2\u0112L\3\2\2\2\u0113\u0114\7<"+
		"\2\2\u0114\u0115\7?\2\2\u0115N\3\2\2\2\u0116\u0117\7\60\2\2\u0117P\3\2"+
		"\2\2\u0118\u0119\7.\2\2\u0119R\3\2\2\2\u011a\u011b\7=\2\2\u011bT\3\2\2"+
		"\2\u011c\u011f\5Y-\2\u011d\u011f\5[.\2\u011e\u011c\3\2\2\2\u011e\u011d"+
		"\3\2\2\2\u011f\u0128\3\2\2\2\u0120\u0121\5K&\2\u0121\u0124\5=\37\2\u0122"+
		"\u0125\5[.\2\u0123\u0125\5Y-\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2"+
		"\u0125\u0126\3\2\2\2\u0126\u0127\5? \2\u0127\u0129\3\2\2\2\u0128\u0120"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129V\3\2\2\2\u012a\u012c\t\2\2\2\u012b"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u0131\7\60\2\2\u0130\u0132\t\2\2\2\u0131"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u013b\3\2\2\2\u0135\u0137\t\2\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2"+
		"\2\2\u013a\u012b\3\2\2\2\u013a\u0136\3\2\2\2\u013bX\3\2\2\2\u013c\u013e"+
		"\t\3\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0144\3\2\2\2\u0141\u0143\t\4\2\2\u0142\u0141\3\2"+
		"\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"Z\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\5\37\20\2\u0148\u014a\5=\37"+
		"\2\u0149\u014b\5]/\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\5? \2\u014f"+
		"\\\3\2\2\2\u0150\u0151\n\5\2\2\u0151^\3\2\2\2\u0152\u0154\t\6\2\2\u0153"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b\60\2\2\u0158`\3\2\2\2\16\2\u011e"+
		"\u0124\u0128\u012d\u0133\u0138\u013a\u013f\u0144\u014c\u0155\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}