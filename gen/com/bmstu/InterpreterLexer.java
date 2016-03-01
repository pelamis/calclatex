// Generated from C:/Users/Daria/IdeaProjects/interpteter/src/com/bmstu\interpreter.g4 by ANTLR 4.5.1
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
		START=1, CODE=2, EXPR=3, EXPR1=4, TERM=5, TERM1=6, POW=7, POW1=8, FACTOR=9, 
		PRIM=10, IDENT=11, NUM=12, NUM1=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"START", "CODE", "EXPR", "EXPR1", "TERM", "TERM1", "POW", "POW1", "FACTOR", 
		"PRIM", "IDENT", "NUM", "NUM1", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "START", "CODE", "EXPR", "EXPR1", "TERM", "TERM1", "POW", "POW1", 
		"FACTOR", "PRIM", "IDENT", "NUM", "NUM1", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\66"+
		"\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7S\n\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\5\t[\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u0080\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0088"+
		"\n\13\3\f\6\f\u008b\n\f\r\f\16\f\u008c\3\f\7\f\u0090\n\f\f\f\16\f\u0093"+
		"\13\f\3\r\6\r\u0096\n\r\r\r\16\r\u0097\3\r\3\r\3\16\3\16\6\16\u009e\n"+
		"\16\r\16\16\16\u009f\3\16\5\16\u00a3\n\16\3\17\6\17\u00a6\n\17\r\17\16"+
		"\17\u00a7\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\3\2\6\4\2C\\c|\5\2\62;C\\c|\3\2\62;\5\2\13\f"+
		"\17\17\"\"\u00bd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5"+
		"+\3\2\2\2\7-\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\rR\3\2\2\2\17T\3\2\2\2"+
		"\21Z\3\2\2\2\23\177\3\2\2\2\25\u0087\3\2\2\2\27\u008a\3\2\2\2\31\u0095"+
		"\3\2\2\2\33\u00a2\3\2\2\2\35\u00a5\3\2\2\2\37 \7^\2\2 !\7k\2\2!\"\7o\2"+
		"\2\"#\7c\2\2#$\7e\2\2$%\7t\2\2%&\7q\2\2&\'\7}\2\2\'(\3\2\2\2()\5\5\3\2"+
		")*\7\177\2\2*\4\3\2\2\2+,\5\7\4\2,\6\3\2\2\2-.\5\13\6\2./\5\t\5\2/\b\3"+
		"\2\2\2\60\61\7-\2\2\61\66\5\13\6\2\62\63\7/\2\2\63\66\5\13\6\2\64\66\3"+
		"\2\2\2\65\60\3\2\2\2\65\62\3\2\2\2\65\64\3\2\2\2\66\n\3\2\2\2\678\5\17"+
		"\b\289\5\r\7\29\f\3\2\2\2:;\7,\2\2;S\5\17\b\2<=\7^\2\2=>\7j\2\2>?\7k\2"+
		"\2?@\7f\2\2@A\7g\2\2AB\7o\2\2BC\7w\2\2CD\7n\2\2DE\3\2\2\2ES\5\17\b\2F"+
		"G\7^\2\2GH\7x\2\2HI\7g\2\2IJ\7e\2\2JK\7o\2\2KL\7w\2\2LM\7n\2\2MN\3\2\2"+
		"\2NS\5\17\b\2OP\7\61\2\2PS\5\17\b\2QS\3\2\2\2R:\3\2\2\2R<\3\2\2\2RF\3"+
		"\2\2\2RO\3\2\2\2RQ\3\2\2\2S\16\3\2\2\2TU\5\23\n\2UV\5\21\t\2V\20\3\2\2"+
		"\2WX\7`\2\2X[\5\23\n\2Y[\3\2\2\2ZW\3\2\2\2ZY\3\2\2\2[\22\3\2\2\2\\]\7"+
		"/\2\2]\u0080\5\23\n\2^_\7^\2\2_`\7k\2\2`a\7p\2\2ab\7x\2\2bc\7g\2\2cd\7"+
		"t\2\2de\7u\2\2ef\7g\2\2fg\7}\2\2gh\3\2\2\2hi\5\23\n\2ij\7\177\2\2j\u0080"+
		"\3\2\2\2kl\7^\2\2lm\7v\2\2mn\7t\2\2no\7c\2\2op\7p\2\2pq\7u\2\2qr\7r\2"+
		"\2rs\7q\2\2st\7u\2\2tu\7g\2\2uv\7}\2\2vw\3\2\2\2wx\5\23\n\2xy\7\177\2"+
		"\2y\u0080\3\2\2\2z{\7~\2\2{|\5\23\n\2|}\7~\2\2}\u0080\3\2\2\2~\u0080\5"+
		"\25\13\2\177\\\3\2\2\2\177^\3\2\2\2\177k\3\2\2\2\177z\3\2\2\2\177~\3\2"+
		"\2\2\u0080\24\3\2\2\2\u0081\u0088\5\27\f\2\u0082\u0083\7*\2\2\u0083\u0084"+
		"\5\7\4\2\u0084\u0085\7+\2\2\u0085\u0088\3\2\2\2\u0086\u0088\5\31\r\2\u0087"+
		"\u0081\3\2\2\2\u0087\u0082\3\2\2\2\u0087\u0086\3\2\2\2\u0088\26\3\2\2"+
		"\2\u0089\u008b\t\2\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0091\3\2\2\2\u008e\u0090\t\3\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\30\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\t\4\2\2\u0095\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\5\33\16\2\u009a\32\3\2\2\2\u009b\u009d\7\60"+
		"\2\2\u009c\u009e\t\4\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a3\3\2"+
		"\2\2\u00a2\u009b\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\34\3\2\2\2\u00a4\u00a6"+
		"\t\5\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\17\2\2\u00aa\36\3\2\2"+
		"\2\16\2\65RZ\177\u0087\u008c\u0091\u0097\u009f\u00a2\u00a7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}