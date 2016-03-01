// Generated from D:/Google Drive/vault/Courseproj/interpteter/src/com/bmstu\interpreter.g4 by ANTLR 4.5.1
package com.bmstu;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class interpreterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VECT=1, MATR=2, IMACRO=3, IPRINT=4, SWITCHOP=5, CASEOP=6, DEFOP=7, AT=8, 
		IN=9, VMUL=10, HMUL=11, INV=12, TRANSP=13, TEXT=14, OR=15, AND=16, GEQ=17, 
		LEQ=18, NEQ=19, EQ=20, GE=21, LE=22, PLUS=23, MINUS=24, MUL=25, POWOP=26, 
		DIV=27, LCURLB=28, RCURLB=29, LPAREN=30, RPAREN=31, LBRACK=32, RBRACK=33, 
		BAR=34, UNDERLN=35, ASGNOP=36, DOT=37, COMMA=38, SMCOLON=39, IDENT=40, 
		NUM=41, LTEXT=42, RTEXT=43, SPECSYM=44, CYRSYM=45, NEWLINE=46, WS=47;
	public static final int
		RULE_start = 0, RULE_code = 1, RULE_cnstrct = 2, RULE_lgcexpr = 3, RULE_lgcand = 4, 
		RULE_cmpeq = 5, RULE_cmpr = 6, RULE_expr = 7, RULE_term = 8, RULE_factor = 9, 
		RULE_pow = 10, RULE_prim = 11, RULE_index = 12, RULE_vect = 13, RULE_matr = 14, 
		RULE_literal = 15, RULE_assgn = 16, RULE_lop = 17, RULE_rop = 18, RULE_cond = 19, 
		RULE_cond1 = 20, RULE_mcase = 21, RULE_mdefault = 22, RULE_loop = 23, 
		RULE_loopcnd = 24, RULE_func = 25, RULE_args = 26;
	public static final String[] ruleNames = {
		"start", "code", "cnstrct", "lgcexpr", "lgcand", "cmpeq", "cmpr", "expr", 
		"term", "factor", "pow", "prim", "index", "vect", "matr", "literal", "assgn", 
		"lop", "rop", "cond", "cond1", "mcase", "mdefault", "loop", "loopcnd", 
		"func", "args"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\vect'", "'\\matr'", "'\\imacro'", "'\\iprint'", "'\\conditional'", 
		"'\\case'", "'\\otherwise'", "'\\at'", "'\\in'", "'\\times'", "'\\hidemul'", 
		"'\\inverse'", "'\\transpose'", "'\\text'", "'\\or'", "'\\and'", "'\\ge'", 
		"'\\le'", "'\\ne'", "'='", "'>'", "'<'", "'+'", "'-'", "'\\cdot'", "'^'", 
		"'/'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'|'", "'_'", "':='", 
		"'.'", "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VECT", "MATR", "IMACRO", "IPRINT", "SWITCHOP", "CASEOP", "DEFOP", 
		"AT", "IN", "VMUL", "HMUL", "INV", "TRANSP", "TEXT", "OR", "AND", "GEQ", 
		"LEQ", "NEQ", "EQ", "GE", "LE", "PLUS", "MINUS", "MUL", "POWOP", "DIV", 
		"LCURLB", "RCURLB", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "BAR", "UNDERLN", 
		"ASGNOP", "DOT", "COMMA", "SMCOLON", "IDENT", "NUM", "LTEXT", "RTEXT", 
		"SPECSYM", "CYRSYM", "NEWLINE", "WS"
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

	@Override
	public String getGrammarFileName() { return "interpreter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public interpreterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(interpreterParser.EOF, 0); }
		public List<TerminalNode> IMACRO() { return getTokens(interpreterParser.IMACRO); }
		public TerminalNode IMACRO(int i) {
			return getToken(interpreterParser.IMACRO, i);
		}
		public List<TerminalNode> LCURLB() { return getTokens(interpreterParser.LCURLB); }
		public TerminalNode LCURLB(int i) {
			return getToken(interpreterParser.LCURLB, i);
		}
		public List<TerminalNode> RCURLB() { return getTokens(interpreterParser.RCURLB); }
		public TerminalNode RCURLB(int i) {
			return getToken(interpreterParser.RCURLB, i);
		}
		public List<TerminalNode> IPRINT() { return getTokens(interpreterParser.IPRINT); }
		public TerminalNode IPRINT(int i) {
			return getToken(interpreterParser.IPRINT, i);
		}
		public List<CnstrctContext> cnstrct() {
			return getRuleContexts(CnstrctContext.class);
		}
		public CnstrctContext cnstrct(int i) {
			return getRuleContext(CnstrctContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(interpreterParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(interpreterParser.NEWLINE, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMACRO || _la==IPRINT) {
				{
				setState(82);
				switch (_input.LA(1)) {
				case IMACRO:
					{
					setState(54);
					match(IMACRO);
					setState(55);
					match(LCURLB);
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(56);
						cnstrct();
						setState(58); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(57);
							match(NEWLINE);
							}
							}
							setState(60); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NEWLINE );
						}
						}
						setState(64); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VECT) | (1L << MATR) | (1L << SWITCHOP) | (1L << INV) | (1L << TRANSP) | (1L << MINUS) | (1L << LPAREN) | (1L << BAR) | (1L << IDENT) | (1L << NUM))) != 0) );
					setState(66);
					match(RCURLB);
					}
					break;
				case IPRINT:
					{
					setState(68);
					match(IPRINT);
					setState(69);
					match(LCURLB);
					setState(76); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(70);
						cnstrct();
						setState(72); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(71);
							match(NEWLINE);
							}
							}
							setState(74); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NEWLINE );
						}
						}
						setState(78); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VECT) | (1L << MATR) | (1L << SWITCHOP) | (1L << INV) | (1L << TRANSP) | (1L << MINUS) | (1L << LPAREN) | (1L << BAR) | (1L << IDENT) | (1L << NUM))) != 0) );
					setState(80);
					match(RCURLB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeContext extends ParserRuleContext {
		public List<CnstrctContext> cnstrct() {
			return getRuleContexts(CnstrctContext.class);
		}
		public CnstrctContext cnstrct(int i) {
			return getRuleContext(CnstrctContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				cnstrct();
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VECT) | (1L << MATR) | (1L << SWITCHOP) | (1L << INV) | (1L << TRANSP) | (1L << MINUS) | (1L << LPAREN) | (1L << BAR) | (1L << IDENT) | (1L << NUM))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CnstrctContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public AssgnContext assgn() {
			return getRuleContext(AssgnContext.class,0);
		}
		public LgcexprContext lgcexpr() {
			return getRuleContext(LgcexprContext.class,0);
		}
		public CnstrctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnstrct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterCnstrct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitCnstrct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitCnstrct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CnstrctContext cnstrct() throws RecognitionException {
		CnstrctContext _localctx = new CnstrctContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cnstrct);
		try {
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				cond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				assgn();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				lgcexpr(0);
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

	public static class LgcexprContext extends ParserRuleContext {
		public LgcandContext lgcand() {
			return getRuleContext(LgcandContext.class,0);
		}
		public LgcexprContext lgcexpr() {
			return getRuleContext(LgcexprContext.class,0);
		}
		public TerminalNode OR() { return getToken(interpreterParser.OR, 0); }
		public LgcexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lgcexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterLgcexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitLgcexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitLgcexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LgcexprContext lgcexpr() throws RecognitionException {
		return lgcexpr(0);
	}

	private LgcexprContext lgcexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LgcexprContext _localctx = new LgcexprContext(_ctx, _parentState);
		LgcexprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_lgcexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(101);
			lgcand(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LgcexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lgcexpr);
					setState(103);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(104);
					match(OR);
					setState(105);
					lgcand(0);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class LgcandContext extends ParserRuleContext {
		public CmpeqContext cmpeq() {
			return getRuleContext(CmpeqContext.class,0);
		}
		public LgcandContext lgcand() {
			return getRuleContext(LgcandContext.class,0);
		}
		public TerminalNode AND() { return getToken(interpreterParser.AND, 0); }
		public LgcandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lgcand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterLgcand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitLgcand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitLgcand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LgcandContext lgcand() throws RecognitionException {
		return lgcand(0);
	}

	private LgcandContext lgcand(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LgcandContext _localctx = new LgcandContext(_ctx, _parentState);
		LgcandContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_lgcand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(112);
			cmpeq(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LgcandContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lgcand);
					setState(114);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(115);
					match(AND);
					setState(116);
					cmpeq(0);
					}
					} 
				}
				setState(121);
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

	public static class CmpeqContext extends ParserRuleContext {
		public CmprContext cmpr() {
			return getRuleContext(CmprContext.class,0);
		}
		public CmpeqContext cmpeq() {
			return getRuleContext(CmpeqContext.class,0);
		}
		public TerminalNode EQ() { return getToken(interpreterParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(interpreterParser.NEQ, 0); }
		public CmpeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterCmpeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitCmpeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitCmpeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmpeqContext cmpeq() throws RecognitionException {
		return cmpeq(0);
	}

	private CmpeqContext cmpeq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CmpeqContext _localctx = new CmpeqContext(_ctx, _parentState);
		CmpeqContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_cmpeq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(123);
			cmpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new CmpeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cmpeq);
						setState(125);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(126);
						match(EQ);
						setState(127);
						cmpr(0);
						}
						break;
					case 2:
						{
						_localctx = new CmpeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cmpeq);
						setState(128);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(129);
						match(NEQ);
						setState(130);
						cmpr(0);
						}
						break;
					}
					} 
				}
				setState(135);
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

	public static class CmprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CmprContext cmpr() {
			return getRuleContext(CmprContext.class,0);
		}
		public TerminalNode LE() { return getToken(interpreterParser.LE, 0); }
		public TerminalNode LEQ() { return getToken(interpreterParser.LEQ, 0); }
		public TerminalNode GE() { return getToken(interpreterParser.GE, 0); }
		public TerminalNode GEQ() { return getToken(interpreterParser.GEQ, 0); }
		public CmprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterCmpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitCmpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitCmpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmprContext cmpr() throws RecognitionException {
		return cmpr(0);
	}

	private CmprContext cmpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CmprContext _localctx = new CmprContext(_ctx, _parentState);
		CmprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_cmpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(137);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(151);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new CmprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cmpr);
						setState(139);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(140);
						match(LE);
						setState(141);
						expr(0);
						}
						break;
					case 2:
						{
						_localctx = new CmprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cmpr);
						setState(142);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(143);
						match(LEQ);
						setState(144);
						expr(0);
						}
						break;
					case 3:
						{
						_localctx = new CmprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cmpr);
						setState(145);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(146);
						match(GE);
						setState(147);
						expr(0);
						}
						break;
					case 4:
						{
						_localctx = new CmprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cmpr);
						setState(148);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(149);
						match(GEQ);
						setState(150);
						expr(0);
						}
						break;
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(interpreterParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(interpreterParser.MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(157);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(160);
						match(PLUS);
						setState(161);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(163);
						match(MINUS);
						setState(164);
						term(0);
						}
						break;
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MUL() { return getToken(interpreterParser.MUL, 0); }
		public TerminalNode HMUL() { return getToken(interpreterParser.HMUL, 0); }
		public TerminalNode DIV() { return getToken(interpreterParser.DIV, 0); }
		public TerminalNode VMUL() { return getToken(interpreterParser.VMUL, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(171);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(173);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(174);
						match(MUL);
						setState(175);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(176);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(177);
						match(HMUL);
						setState(178);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(179);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(180);
						match(DIV);
						setState(181);
						factor();
						}
						break;
					case 4:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(182);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(183);
						match(VMUL);
						setState(184);
						factor();
						}
						break;
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(interpreterParser.MINUS, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public TerminalNode INV() { return getToken(interpreterParser.INV, 0); }
		public TerminalNode LCURLB() { return getToken(interpreterParser.LCURLB, 0); }
		public TerminalNode RCURLB() { return getToken(interpreterParser.RCURLB, 0); }
		public TerminalNode TRANSP() { return getToken(interpreterParser.TRANSP, 0); }
		public List<TerminalNode> BAR() { return getTokens(interpreterParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(interpreterParser.BAR, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factor);
		try {
			setState(207);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(MINUS);
				setState(191);
				pow(0);
				}
				break;
			case INV:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(INV);
				setState(193);
				match(LCURLB);
				setState(194);
				pow(0);
				setState(195);
				match(RCURLB);
				}
				break;
			case TRANSP:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(TRANSP);
				setState(198);
				match(LCURLB);
				setState(199);
				pow(0);
				setState(200);
				match(RCURLB);
				}
				break;
			case BAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				match(BAR);
				setState(203);
				pow(0);
				setState(204);
				match(BAR);
				}
				break;
			case VECT:
			case MATR:
			case LPAREN:
			case IDENT:
			case NUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				pow(0);
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

	public static class PowContext extends ParserRuleContext {
		public PrimContext prim() {
			return getRuleContext(PrimContext.class,0);
		}
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public TerminalNode POWOP() { return getToken(interpreterParser.POWOP, 0); }
		public PowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowContext pow() throws RecognitionException {
		return pow(0);
	}

	private PowContext pow(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PowContext _localctx = new PowContext(_ctx, _parentState);
		PowContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_pow, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(210);
			prim();
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PowContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pow);
					setState(212);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(213);
					match(POWOP);
					setState(214);
					prim();
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class PrimContext extends ParserRuleContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(interpreterParser.IDENT, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(interpreterParser.LPAREN, 0); }
		public LgcexprContext lgcexpr() {
			return getRuleContext(LgcexprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(interpreterParser.RPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitPrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitPrim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimContext prim() throws RecognitionException {
		PrimContext _localctx = new PrimContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prim);
		try {
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				func();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(IDENT);
				setState(223);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(222);
					index();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(LPAREN);
				setState(226);
				lgcexpr(0);
				setState(227);
				match(RPAREN);
				setState(228);
				index();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				literal();
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

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(interpreterParser.AT, 0); }
		public TerminalNode LCURLB() { return getToken(interpreterParser.LCURLB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RCURLB() { return getToken(interpreterParser.RCURLB, 0); }
		public TerminalNode COMMA() { return getToken(interpreterParser.COMMA, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_index);
		try {
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(233);
				match(AT);
				setState(234);
				match(LCURLB);
				setState(235);
				expr(0);
				setState(236);
				match(RCURLB);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(238);
				match(AT);
				setState(239);
				match(LCURLB);
				setState(240);
				expr(0);
				setState(241);
				match(COMMA);
				setState(242);
				expr(0);
				setState(243);
				match(RCURLB);
				}
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

	public static class VectContext extends ParserRuleContext {
		public TerminalNode VECT() { return getToken(interpreterParser.VECT, 0); }
		public List<LgcexprContext> lgcexpr() {
			return getRuleContexts(LgcexprContext.class);
		}
		public LgcexprContext lgcexpr(int i) {
			return getRuleContext(LgcexprContext.class,i);
		}
		public VectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterVect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitVect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitVect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectContext vect() throws RecognitionException {
		VectContext _localctx = new VectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(VECT);
			setState(248);
			match(LBRACK);
			setState(249);
			lgcexpr(0);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(250);
				match(COMMA);
				setState(251);
				lgcexpr(0);
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrContext extends ParserRuleContext {
		public TerminalNode MATR() { return getToken(interpreterParser.MATR, 0); }
		public List<LgcexprContext> lgcexpr() {
			return getRuleContexts(LgcexprContext.class);
		}
		public LgcexprContext lgcexpr(int i) {
			return getRuleContext(LgcexprContext.class,i);
		}
		public MatrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterMatr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitMatr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitMatr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrContext matr() throws RecognitionException {
		MatrContext _localctx = new MatrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_matr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(MATR);
			setState(260);
			match(LBRACK);
			setState(272); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(261);
				match(LBRACK);
				setState(262);
				lgcexpr(0);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(263);
					match(COMMA);
					setState(264);
					lgcexpr(0);
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				match(RBRACK);
				}
				}
				setState(274); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACK );
			setState(276);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(interpreterParser.NUM, 0); }
		public VectContext vect() {
			return getRuleContext(VectContext.class,0);
		}
		public MatrContext matr() {
			return getRuleContext(MatrContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal);
		try {
			setState(281);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(NUM);
				}
				break;
			case VECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				vect();
				}
				break;
			case MATR:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				matr();
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

	public static class AssgnContext extends ParserRuleContext {
		public LopContext lop() {
			return getRuleContext(LopContext.class,0);
		}
		public TerminalNode ASGNOP() { return getToken(interpreterParser.ASGNOP, 0); }
		public RopContext rop() {
			return getRuleContext(RopContext.class,0);
		}
		public AssgnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assgn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterAssgn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitAssgn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitAssgn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssgnContext assgn() throws RecognitionException {
		AssgnContext _localctx = new AssgnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assgn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			lop();
			setState(284);
			match(ASGNOP);
			setState(285);
			rop();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LopContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(interpreterParser.IDENT, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public LopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterLop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitLop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitLop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LopContext lop() throws RecognitionException {
		LopContext _localctx = new LopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lop);
		try {
			setState(291);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(IDENT);
				setState(289);
				index();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				func();
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

	public static class RopContext extends ParserRuleContext {
		public LgcexprContext lgcexpr() {
			return getRuleContext(LgcexprContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public RopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterRop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitRop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitRop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RopContext rop() throws RecognitionException {
		RopContext _localctx = new RopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rop);
		try {
			setState(296);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				lgcexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				cond();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				loop();
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

	public static class CondContext extends ParserRuleContext {
		public TerminalNode SWITCHOP() { return getToken(interpreterParser.SWITCHOP, 0); }
		public TerminalNode LCURLB() { return getToken(interpreterParser.LCURLB, 0); }
		public Cond1Context cond1() {
			return getRuleContext(Cond1Context.class,0);
		}
		public TerminalNode RCURLB() { return getToken(interpreterParser.RCURLB, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(SWITCHOP);
			setState(299);
			match(LCURLB);
			setState(300);
			cond1();
			setState(301);
			match(RCURLB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cond1Context extends ParserRuleContext {
		public McaseContext mcase() {
			return getRuleContext(McaseContext.class,0);
		}
		public Cond1Context cond1() {
			return getRuleContext(Cond1Context.class,0);
		}
		public MdefaultContext mdefault() {
			return getRuleContext(MdefaultContext.class,0);
		}
		public Cond1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterCond1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitCond1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitCond1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond1Context cond1() throws RecognitionException {
		Cond1Context _localctx = new Cond1Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_cond1);
		try {
			setState(307);
			switch (_input.LA(1)) {
			case CASEOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				mcase();
				setState(304);
				cond1();
				}
				break;
			case DEFOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				mdefault();
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

	public static class McaseContext extends ParserRuleContext {
		public TerminalNode CASEOP() { return getToken(interpreterParser.CASEOP, 0); }
		public List<TerminalNode> LCURLB() { return getTokens(interpreterParser.LCURLB); }
		public TerminalNode LCURLB(int i) {
			return getToken(interpreterParser.LCURLB, i);
		}
		public LgcexprContext lgcexpr() {
			return getRuleContext(LgcexprContext.class,0);
		}
		public List<TerminalNode> RCURLB() { return getTokens(interpreterParser.RCURLB); }
		public TerminalNode RCURLB(int i) {
			return getToken(interpreterParser.RCURLB, i);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public McaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterMcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitMcase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitMcase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final McaseContext mcase() throws RecognitionException {
		McaseContext _localctx = new McaseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mcase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(CASEOP);
			setState(310);
			match(LCURLB);
			setState(311);
			lgcexpr(0);
			setState(312);
			match(RCURLB);
			setState(313);
			match(LCURLB);
			setState(314);
			code();
			setState(315);
			match(RCURLB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MdefaultContext extends ParserRuleContext {
		public TerminalNode DEFOP() { return getToken(interpreterParser.DEFOP, 0); }
		public TerminalNode LCURLB() { return getToken(interpreterParser.LCURLB, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RCURLB() { return getToken(interpreterParser.RCURLB, 0); }
		public MdefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mdefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterMdefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitMdefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitMdefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MdefaultContext mdefault() throws RecognitionException {
		MdefaultContext _localctx = new MdefaultContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mdefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(DEFOP);
			setState(318);
			match(LCURLB);
			setState(319);
			code();
			setState(320);
			match(RCURLB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public LoopcndContext loopcnd() {
			return getRuleContext(LoopcndContext.class,0);
		}
		public TerminalNode LCURLB() { return getToken(interpreterParser.LCURLB, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RCURLB() { return getToken(interpreterParser.RCURLB, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			loopcnd();
			setState(323);
			match(LCURLB);
			setState(324);
			code();
			setState(325);
			match(RCURLB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopcndContext extends ParserRuleContext {
		public List<LgcexprContext> lgcexpr() {
			return getRuleContexts(LgcexprContext.class);
		}
		public LgcexprContext lgcexpr(int i) {
			return getRuleContext(LgcexprContext.class,i);
		}
		public TerminalNode IN() { return getToken(interpreterParser.IN, 0); }
		public TerminalNode LCURLB() { return getToken(interpreterParser.LCURLB, 0); }
		public TerminalNode SMCOLON() { return getToken(interpreterParser.SMCOLON, 0); }
		public TerminalNode RCURLB() { return getToken(interpreterParser.RCURLB, 0); }
		public LoopcndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopcnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterLoopcnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitLoopcnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitLoopcnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopcndContext loopcnd() throws RecognitionException {
		LoopcndContext _localctx = new LoopcndContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_loopcnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			lgcexpr(0);
			setState(328);
			match(IN);
			setState(329);
			match(LCURLB);
			setState(330);
			lgcexpr(0);
			setState(331);
			match(SMCOLON);
			setState(332);
			lgcexpr(0);
			setState(333);
			match(RCURLB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(interpreterParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(interpreterParser.LPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(interpreterParser.RPAREN, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(IDENT);
			setState(336);
			match(LPAREN);
			setState(337);
			args();
			setState(338);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public LgcexprContext lgcexpr() {
			return getRuleContext(LgcexprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(interpreterParser.COMMA, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_args);
		try {
			setState(345);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				lgcexpr(0);
				setState(341);
				match(COMMA);
				setState(342);
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				lgcexpr(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return lgcexpr_sempred((LgcexprContext)_localctx, predIndex);
		case 4:
			return lgcand_sempred((LgcandContext)_localctx, predIndex);
		case 5:
			return cmpeq_sempred((CmpeqContext)_localctx, predIndex);
		case 6:
			return cmpr_sempred((CmprContext)_localctx, predIndex);
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 8:
			return term_sempred((TermContext)_localctx, predIndex);
		case 10:
			return pow_sempred((PowContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lgcexpr_sempred(LgcexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lgcand_sempred(LgcandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cmpeq_sempred(CmpeqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cmpr_sempred(CmprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean pow_sempred(PowContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u015e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\6\2=\n\2\r\2\16\2>\6\2"+
		"A\n\2\r\2\16\2B\3\2\3\2\3\2\3\2\3\2\3\2\6\2K\n\2\r\2\16\2L\6\2O\n\2\r"+
		"\2\16\2P\3\2\3\2\7\2U\n\2\f\2\16\2X\13\2\3\2\3\2\3\3\6\3]\n\3\r\3\16\3"+
		"^\3\4\3\4\3\4\3\4\5\4e\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5m\n\5\f\5\16\5p"+
		"\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6x\n\6\f\6\16\6{\13\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\7\7\u0086\n\7\f\7\16\7\u0089\13\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009a\n\b\f\b\16\b\u009d"+
		"\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a8\n\t\f\t\16\t\u00ab"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00bc\n\n\f\n\16\n\u00bf\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d2\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u00da\n\f\f\f\16\f\u00dd\13\f\3\r\3\r\3\r\5\r\u00e2"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ea\n\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f8\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00ff\n\17\f\17\16\17\u0102\13\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u010c\n\20\f\20\16\20\u010f\13\20\3\20\3\20\6\20"+
		"\u0113\n\20\r\20\16\20\u0114\3\20\3\20\3\21\3\21\3\21\5\21\u011c\n\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u0126\n\23\3\24\3\24\3\24"+
		"\5\24\u012b\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0136"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u015c\n\34\3\34\2\t"+
		"\b\n\f\16\20\22\26\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\66\2\2\u016f\2V\3\2\2\2\4\\\3\2\2\2\6d\3\2\2\2\bf\3\2\2\2\n"+
		"q\3\2\2\2\f|\3\2\2\2\16\u008a\3\2\2\2\20\u009e\3\2\2\2\22\u00ac\3\2\2"+
		"\2\24\u00d1\3\2\2\2\26\u00d3\3\2\2\2\30\u00e9\3\2\2\2\32\u00f7\3\2\2\2"+
		"\34\u00f9\3\2\2\2\36\u0105\3\2\2\2 \u011b\3\2\2\2\"\u011d\3\2\2\2$\u0125"+
		"\3\2\2\2&\u012a\3\2\2\2(\u012c\3\2\2\2*\u0135\3\2\2\2,\u0137\3\2\2\2."+
		"\u013f\3\2\2\2\60\u0144\3\2\2\2\62\u0149\3\2\2\2\64\u0151\3\2\2\2\66\u015b"+
		"\3\2\2\289\7\5\2\29@\7\36\2\2:<\5\6\4\2;=\7\60\2\2<;\3\2\2\2=>\3\2\2\2"+
		"><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@:\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2"+
		"CD\3\2\2\2DE\7\37\2\2EU\3\2\2\2FG\7\6\2\2GN\7\36\2\2HJ\5\6\4\2IK\7\60"+
		"\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NH\3\2\2\2OP\3\2"+
		"\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\37\2\2SU\3\2\2\2T8\3\2\2\2TF\3"+
		"\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\2\2\3Z\3"+
		"\3\2\2\2[]\5\6\4\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\5\3\2\2"+
		"\2`e\5(\25\2ae\5\60\31\2be\5\"\22\2ce\5\b\5\2d`\3\2\2\2da\3\2\2\2db\3"+
		"\2\2\2dc\3\2\2\2e\7\3\2\2\2fg\b\5\1\2gh\5\n\6\2hn\3\2\2\2ij\f\4\2\2jk"+
		"\7\21\2\2km\5\n\6\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\t\3\2\2\2"+
		"pn\3\2\2\2qr\b\6\1\2rs\5\f\7\2sy\3\2\2\2tu\f\4\2\2uv\7\22\2\2vx\5\f\7"+
		"\2wt\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\13\3\2\2\2{y\3\2\2\2|}\b\7"+
		"\1\2}~\5\16\b\2~\u0087\3\2\2\2\177\u0080\f\5\2\2\u0080\u0081\7\26\2\2"+
		"\u0081\u0086\5\16\b\2\u0082\u0083\f\4\2\2\u0083\u0084\7\25\2\2\u0084\u0086"+
		"\5\16\b\2\u0085\177\3\2\2\2\u0085\u0082\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\r\3\2\2\2\u0089\u0087\3\2\2\2"+
		"\u008a\u008b\b\b\1\2\u008b\u008c\5\20\t\2\u008c\u009b\3\2\2\2\u008d\u008e"+
		"\f\7\2\2\u008e\u008f\7\30\2\2\u008f\u009a\5\20\t\2\u0090\u0091\f\6\2\2"+
		"\u0091\u0092\7\24\2\2\u0092\u009a\5\20\t\2\u0093\u0094\f\5\2\2\u0094\u0095"+
		"\7\27\2\2\u0095\u009a\5\20\t\2\u0096\u0097\f\4\2\2\u0097\u0098\7\23\2"+
		"\2\u0098\u009a\5\20\t\2\u0099\u008d\3\2\2\2\u0099\u0090\3\2\2\2\u0099"+
		"\u0093\3\2\2\2\u0099\u0096\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\17\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f"+
		"\b\t\1\2\u009f\u00a0\5\22\n\2\u00a0\u00a9\3\2\2\2\u00a1\u00a2\f\5\2\2"+
		"\u00a2\u00a3\7\31\2\2\u00a3\u00a8\5\22\n\2\u00a4\u00a5\f\4\2\2\u00a5\u00a6"+
		"\7\32\2\2\u00a6\u00a8\5\22\n\2\u00a7\u00a1\3\2\2\2\u00a7\u00a4\3\2\2\2"+
		"\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\21"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\b\n\1\2\u00ad\u00ae\5\24\13\2"+
		"\u00ae\u00bd\3\2\2\2\u00af\u00b0\f\7\2\2\u00b0\u00b1\7\33\2\2\u00b1\u00bc"+
		"\5\24\13\2\u00b2\u00b3\f\6\2\2\u00b3\u00b4\7\r\2\2\u00b4\u00bc\5\24\13"+
		"\2\u00b5\u00b6\f\5\2\2\u00b6\u00b7\7\35\2\2\u00b7\u00bc\5\24\13\2\u00b8"+
		"\u00b9\f\4\2\2\u00b9\u00ba\7\f\2\2\u00ba\u00bc\5\24\13\2\u00bb\u00af\3"+
		"\2\2\2\u00bb\u00b2\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\23\3\2\2"+
		"\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\32\2\2\u00c1\u00d2\5\26\f\2\u00c2"+
		"\u00c3\7\16\2\2\u00c3\u00c4\7\36\2\2\u00c4\u00c5\5\26\f\2\u00c5\u00c6"+
		"\7\37\2\2\u00c6\u00d2\3\2\2\2\u00c7\u00c8\7\17\2\2\u00c8\u00c9\7\36\2"+
		"\2\u00c9\u00ca\5\26\f\2\u00ca\u00cb\7\37\2\2\u00cb\u00d2\3\2\2\2\u00cc"+
		"\u00cd\7$\2\2\u00cd\u00ce\5\26\f\2\u00ce\u00cf\7$\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00d2\5\26\f\2\u00d1\u00c0\3\2\2\2\u00d1\u00c2\3\2\2\2\u00d1"+
		"\u00c7\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\25\3\2\2"+
		"\2\u00d3\u00d4\b\f\1\2\u00d4\u00d5\5\30\r\2\u00d5\u00db\3\2\2\2\u00d6"+
		"\u00d7\f\4\2\2\u00d7\u00d8\7\34\2\2\u00d8\u00da\5\30\r\2\u00d9\u00d6\3"+
		"\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\27\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00ea\5\64\33\2\u00df\u00e1\7*\2"+
		"\2\u00e0\u00e2\5\32\16\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00ea\3\2\2\2\u00e3\u00e4\7 \2\2\u00e4\u00e5\5\b\5\2\u00e5\u00e6\7!\2"+
		"\2\u00e6\u00e7\5\32\16\2\u00e7\u00ea\3\2\2\2\u00e8\u00ea\5 \21\2\u00e9"+
		"\u00de\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e8\3\2"+
		"\2\2\u00ea\31\3\2\2\2\u00eb\u00ec\7\n\2\2\u00ec\u00ed\7\36\2\2\u00ed\u00ee"+
		"\5\20\t\2\u00ee\u00ef\7\37\2\2\u00ef\u00f8\3\2\2\2\u00f0\u00f1\7\n\2\2"+
		"\u00f1\u00f2\7\36\2\2\u00f2\u00f3\5\20\t\2\u00f3\u00f4\7(\2\2\u00f4\u00f5"+
		"\5\20\t\2\u00f5\u00f6\7\37\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00eb\3\2\2\2"+
		"\u00f7\u00f0\3\2\2\2\u00f8\33\3\2\2\2\u00f9\u00fa\7\3\2\2\u00fa\u00fb"+
		"\7\"\2\2\u00fb\u0100\5\b\5\2\u00fc\u00fd\7(\2\2\u00fd\u00ff\5\b\5\2\u00fe"+
		"\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7#\2\2\u0104"+
		"\35\3\2\2\2\u0105\u0106\7\4\2\2\u0106\u0112\7\"\2\2\u0107\u0108\7\"\2"+
		"\2\u0108\u010d\5\b\5\2\u0109\u010a\7(\2\2\u010a\u010c\5\b\5\2\u010b\u0109"+
		"\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7#\2\2\u0111\u0113\3\2"+
		"\2\2\u0112\u0107\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7#\2\2\u0117\37\3\2\2\2"+
		"\u0118\u011c\7+\2\2\u0119\u011c\5\34\17\2\u011a\u011c\5\36\20\2\u011b"+
		"\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c!\3\2\2\2"+
		"\u011d\u011e\5$\23\2\u011e\u011f\7&\2\2\u011f\u0120\5&\24\2\u0120#\3\2"+
		"\2\2\u0121\u0126\7*\2\2\u0122\u0123\7*\2\2\u0123\u0126\5\32\16\2\u0124"+
		"\u0126\5\64\33\2\u0125\u0121\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0124\3"+
		"\2\2\2\u0126%\3\2\2\2\u0127\u012b\5\b\5\2\u0128\u012b\5(\25\2\u0129\u012b"+
		"\5\60\31\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2"+
		"\u012b\'\3\2\2\2\u012c\u012d\7\7\2\2\u012d\u012e\7\36\2\2\u012e\u012f"+
		"\5*\26\2\u012f\u0130\7\37\2\2\u0130)\3\2\2\2\u0131\u0132\5,\27\2\u0132"+
		"\u0133\5*\26\2\u0133\u0136\3\2\2\2\u0134\u0136\5.\30\2\u0135\u0131\3\2"+
		"\2\2\u0135\u0134\3\2\2\2\u0136+\3\2\2\2\u0137\u0138\7\b\2\2\u0138\u0139"+
		"\7\36\2\2\u0139\u013a\5\b\5\2\u013a\u013b\7\37\2\2\u013b\u013c\7\36\2"+
		"\2\u013c\u013d\5\4\3\2\u013d\u013e\7\37\2\2\u013e-\3\2\2\2\u013f\u0140"+
		"\7\t\2\2\u0140\u0141\7\36\2\2\u0141\u0142\5\4\3\2\u0142\u0143\7\37\2\2"+
		"\u0143/\3\2\2\2\u0144\u0145\5\62\32\2\u0145\u0146\7\36\2\2\u0146\u0147"+
		"\5\4\3\2\u0147\u0148\7\37\2\2\u0148\61\3\2\2\2\u0149\u014a\5\b\5\2\u014a"+
		"\u014b\7\13\2\2\u014b\u014c\7\36\2\2\u014c\u014d\5\b\5\2\u014d\u014e\7"+
		")\2\2\u014e\u014f\5\b\5\2\u014f\u0150\7\37\2\2\u0150\63\3\2\2\2\u0151"+
		"\u0152\7*\2\2\u0152\u0153\7 \2\2\u0153\u0154\5\66\34\2\u0154\u0155\7!"+
		"\2\2\u0155\65\3\2\2\2\u0156\u0157\5\b\5\2\u0157\u0158\7(\2\2\u0158\u0159"+
		"\5\66\34\2\u0159\u015c\3\2\2\2\u015a\u015c\5\b\5\2\u015b\u0156\3\2\2\2"+
		"\u015b\u015a\3\2\2\2\u015c\67\3\2\2\2!>BLPTV^dny\u0085\u0087\u0099\u009b"+
		"\u00a7\u00a9\u00bb\u00bd\u00d1\u00db\u00e1\u00e9\u00f7\u0100\u010d\u0114"+
		"\u011b\u0125\u012a\u0135\u015b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}