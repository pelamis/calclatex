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
		POWOP=27, DIV=28, LCURLB=29, RCURLB=30, LPAREN=31, RPAREN=32, LBRACK=33, 
		RBRACK=34, BAR=35, UNDERLN=36, ASGNOP=37, DOT=38, COMMA=39, SMCOLON=40, 
		IDENT=41, NUM=42, LTEXT=43, RTEXT=44, RSYM=45, WS=46;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "VECT", "MATR", "IMACRO", "IPRINT", "SWITCHOP", "CASEOP", "DEFOP", 
		"AT", "IN", "VMUL", "HMUL", "INV", "TRANSP", "TEXT", "OR", "AND", "GEQ", 
		"LEQ", "NEQ", "EQ", "GE", "LE", "PLUS", "MINUS", "MUL", "POWOP", "DIV", 
		"LCURLB", "RCURLB", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "BAR", "UNDERLN", 
		"ASGNOP", "DOT", "COMMA", "SMCOLON", "IDENT", "NUM", "LTEXT", "RTEXT", 
		"RSYM", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "'\\vect'", "'\\matr'", "'\\imacro'", "'\\iprint'", "'\\conditional'", 
		"'\\case'", "'\\otherwise'", "'\\at'", "'\\in'", "'\\times'", "'\\hidemul'", 
		"'\\inverse'", "'\\transpose'", "'\\text'", "'\\or'", "'\\and'", "'\\ge'", 
		"'\\le'", "'\\ne'", "'='", "'>'", "'<'", "'+'", "'-'", "'\\cdot'", "'^'", 
		"'/'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'|'", "'_'", "':='", 
		"'.'", "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "VECT", "MATR", "IMACRO", "IPRINT", "SWITCHOP", "CASEOP", 
		"DEFOP", "AT", "IN", "VMUL", "HMUL", "INV", "TRANSP", "TEXT", "OR", "AND", 
		"GEQ", "LEQ", "NEQ", "EQ", "GE", "LE", "PLUS", "MINUS", "MUL", "POWOP", 
		"DIV", "LCURLB", "RCURLB", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "BAR", 
		"UNDERLN", "ASGNOP", "DOT", "COMMA", "SMCOLON", "IDENT", "NUM", "LTEXT", 
		"RTEXT", "RSYM", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\60\u014c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\5*\u0112\n*\3*\3*\3*\3*\5*\u0118\n*\3*\3*\5*"+
		"\u011c\n*\3+\6+\u011f\n+\r+\16+\u0120\3+\3+\6+\u0125\n+\r+\16+\u0126\3"+
		"+\6+\u012a\n+\r+\16+\u012b\5+\u012e\n+\3,\6,\u0131\n,\r,\16,\u0132\3,"+
		"\7,\u0136\n,\f,\16,\u0139\13,\3-\3-\3-\6-\u013e\n-\r-\16-\u013f\3-\3-"+
		"\3.\3.\3/\6/\u0147\n/\r/\16/\u0148\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60\3\2\7\3\2\62;\4\2C\\c|\5\2\62;C\\c|\b\2\13\f\17\17\""+
		"\"))}}\177\177\5\2\13\f\17\17\"\"\u0156\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7g\3\2\2\2\tm\3\2\2\2\13"+
		"u\3\2\2\2\r}\3\2\2\2\17\u008a\3\2\2\2\21\u0090\3\2\2\2\23\u009b\3\2\2"+
		"\2\25\u009f\3\2\2\2\27\u00a3\3\2\2\2\31\u00aa\3\2\2\2\33\u00b3\3\2\2\2"+
		"\35\u00bc\3\2\2\2\37\u00c7\3\2\2\2!\u00cd\3\2\2\2#\u00d1\3\2\2\2%\u00d6"+
		"\3\2\2\2\'\u00da\3\2\2\2)\u00de\3\2\2\2+\u00e2\3\2\2\2-\u00e4\3\2\2\2"+
		"/\u00e6\3\2\2\2\61\u00e8\3\2\2\2\63\u00ea\3\2\2\2\65\u00ec\3\2\2\2\67"+
		"\u00f2\3\2\2\29\u00f4\3\2\2\2;\u00f6\3\2\2\2=\u00f8\3\2\2\2?\u00fa\3\2"+
		"\2\2A\u00fc\3\2\2\2C\u00fe\3\2\2\2E\u0100\3\2\2\2G\u0102\3\2\2\2I\u0104"+
		"\3\2\2\2K\u0106\3\2\2\2M\u0109\3\2\2\2O\u010b\3\2\2\2Q\u010d\3\2\2\2S"+
		"\u0111\3\2\2\2U\u012d\3\2\2\2W\u0130\3\2\2\2Y\u013a\3\2\2\2[\u0143\3\2"+
		"\2\2]\u0146\3\2\2\2_`\7\f\2\2`\4\3\2\2\2ab\7^\2\2bc\7x\2\2cd\7g\2\2de"+
		"\7e\2\2ef\7v\2\2f\6\3\2\2\2gh\7^\2\2hi\7o\2\2ij\7c\2\2jk\7v\2\2kl\7t\2"+
		"\2l\b\3\2\2\2mn\7^\2\2no\7k\2\2op\7o\2\2pq\7c\2\2qr\7e\2\2rs\7t\2\2st"+
		"\7q\2\2t\n\3\2\2\2uv\7^\2\2vw\7k\2\2wx\7r\2\2xy\7t\2\2yz\7k\2\2z{\7p\2"+
		"\2{|\7v\2\2|\f\3\2\2\2}~\7^\2\2~\177\7e\2\2\177\u0080\7q\2\2\u0080\u0081"+
		"\7p\2\2\u0081\u0082\7f\2\2\u0082\u0083\7k\2\2\u0083\u0084\7v\2\2\u0084"+
		"\u0085\7k\2\2\u0085\u0086\7q\2\2\u0086\u0087\7p\2\2\u0087\u0088\7c\2\2"+
		"\u0088\u0089\7n\2\2\u0089\16\3\2\2\2\u008a\u008b\7^\2\2\u008b\u008c\7"+
		"e\2\2\u008c\u008d\7c\2\2\u008d\u008e\7u\2\2\u008e\u008f\7g\2\2\u008f\20"+
		"\3\2\2\2\u0090\u0091\7^\2\2\u0091\u0092\7q\2\2\u0092\u0093\7v\2\2\u0093"+
		"\u0094\7j\2\2\u0094\u0095\7g\2\2\u0095\u0096\7t\2\2\u0096\u0097\7y\2\2"+
		"\u0097\u0098\7k\2\2\u0098\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a\22\3\2"+
		"\2\2\u009b\u009c\7^\2\2\u009c\u009d\7c\2\2\u009d\u009e\7v\2\2\u009e\24"+
		"\3\2\2\2\u009f\u00a0\7^\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2"+
		"\26\3\2\2\2\u00a3\u00a4\7^\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7k\2\2\u00a6"+
		"\u00a7\7o\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7u\2\2\u00a9\30\3\2\2\2\u00aa"+
		"\u00ab\7^\2\2\u00ab\u00ac\7j\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7f\2\2"+
		"\u00ae\u00af\7g\2\2\u00af\u00b0\7o\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2"+
		"\7n\2\2\u00b2\32\3\2\2\2\u00b3\u00b4\7^\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6"+
		"\7p\2\2\u00b6\u00b7\7x\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\u00ba\7u\2\2\u00ba\u00bb\7g\2\2\u00bb\34\3\2\2\2\u00bc\u00bd\7^\2\2\u00bd"+
		"\u00be\7v\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7p\2\2"+
		"\u00c1\u00c2\7u\2\2\u00c2\u00c3\7r\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5"+
		"\7u\2\2\u00c5\u00c6\7g\2\2\u00c6\36\3\2\2\2\u00c7\u00c8\7^\2\2\u00c8\u00c9"+
		"\7v\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7z\2\2\u00cb\u00cc\7v\2\2\u00cc"+
		" \3\2\2\2\u00cd\u00ce\7^\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7t\2\2\u00d0"+
		"\"\3\2\2\2\u00d1\u00d2\7^\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7p\2\2\u00d4"+
		"\u00d5\7f\2\2\u00d5$\3\2\2\2\u00d6\u00d7\7^\2\2\u00d7\u00d8\7i\2\2\u00d8"+
		"\u00d9\7g\2\2\u00d9&\3\2\2\2\u00da\u00db\7^\2\2\u00db\u00dc\7n\2\2\u00dc"+
		"\u00dd\7g\2\2\u00dd(\3\2\2\2\u00de\u00df\7^\2\2\u00df\u00e0\7p\2\2\u00e0"+
		"\u00e1\7g\2\2\u00e1*\3\2\2\2\u00e2\u00e3\7?\2\2\u00e3,\3\2\2\2\u00e4\u00e5"+
		"\7@\2\2\u00e5.\3\2\2\2\u00e6\u00e7\7>\2\2\u00e7\60\3\2\2\2\u00e8\u00e9"+
		"\7-\2\2\u00e9\62\3\2\2\2\u00ea\u00eb\7/\2\2\u00eb\64\3\2\2\2\u00ec\u00ed"+
		"\7^\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7q\2\2\u00f0"+
		"\u00f1\7v\2\2\u00f1\66\3\2\2\2\u00f2\u00f3\7`\2\2\u00f38\3\2\2\2\u00f4"+
		"\u00f5\7\61\2\2\u00f5:\3\2\2\2\u00f6\u00f7\7}\2\2\u00f7<\3\2\2\2\u00f8"+
		"\u00f9\7\177\2\2\u00f9>\3\2\2\2\u00fa\u00fb\7*\2\2\u00fb@\3\2\2\2\u00fc"+
		"\u00fd\7+\2\2\u00fdB\3\2\2\2\u00fe\u00ff\7]\2\2\u00ffD\3\2\2\2\u0100\u0101"+
		"\7_\2\2\u0101F\3\2\2\2\u0102\u0103\7~\2\2\u0103H\3\2\2\2\u0104\u0105\7"+
		"a\2\2\u0105J\3\2\2\2\u0106\u0107\7<\2\2\u0107\u0108\7?\2\2\u0108L\3\2"+
		"\2\2\u0109\u010a\7\60\2\2\u010aN\3\2\2\2\u010b\u010c\7.\2\2\u010cP\3\2"+
		"\2\2\u010d\u010e\7=\2\2\u010eR\3\2\2\2\u010f\u0112\5W,\2\u0110\u0112\5"+
		"Y-\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u011b\3\2\2\2\u0113"+
		"\u0114\5I%\2\u0114\u0117\5;\36\2\u0115\u0118\5Y-\2\u0116\u0118\5W,\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\5="+
		"\37\2\u011a\u011c\3\2\2\2\u011b\u0113\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"T\3\2\2\2\u011d\u011f\t\2\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2"+
		"\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124"+
		"\7\60\2\2\u0123\u0125\t\2\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2"+
		"\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012e\3\2\2\2\u0128\u012a"+
		"\t\2\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u011e\3\2\2\2\u012d\u0129\3\2"+
		"\2\2\u012eV\3\2\2\2\u012f\u0131\t\3\2\2\u0130\u012f\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0137\3\2\2\2\u0134"+
		"\u0136\t\4\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138X\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b"+
		"\5\37\20\2\u013b\u013d\5;\36\2\u013c\u013e\5[.\2\u013d\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0142\5=\37\2\u0142Z\3\2\2\2\u0143\u0144\n\5\2\2\u0144\\\3"+
		"\2\2\2\u0145\u0147\t\6\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b/"+
		"\2\2\u014b^\3\2\2\2\16\2\u0111\u0117\u011b\u0120\u0126\u012b\u012d\u0132"+
		"\u0137\u013f\u0148\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}