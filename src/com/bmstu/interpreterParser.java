// Generated from C:/Users/Daria/Documents/IdeaProjects/calclatex/src/com/bmstu\interpreter.g4 by ANTLR 4.5.1
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
		T__0=1, VECT=2, MATR=3, IMACRO=4, IPRINT=5, SWITCHOP=6, CASEOP=7, DEFOP=8, 
		AT=9, IN=10, VMUL=11, HMUL=12, INV=13, TRANSP=14, TEXT=15, OR=16, AND=17, 
		GEQ=18, LEQ=19, NEQ=20, EQ=21, GE=22, LE=23, PLUS=24, MINUS=25, MUL=26, 
		POWOP=27, DIV=28, FRAC=29, LCURLB=30, RCURLB=31, LPAREN=32, RPAREN=33, 
		LBRACK=34, RBRACK=35, BAR=36, UNDERLN=37, ASGNOP=38, DOT=39, COMMA=40, 
		SMCOLON=41, IDENT=42, NUM=43, LTEXT=44, RTEXT=45, RSYM=46, WS=47;
	public static final int
		RULE_start = 0, RULE_openblk = 1, RULE_closeblk = 2, RULE_code = 3, RULE_lgcexpr = 4, 
		RULE_lgcand = 5, RULE_cmpeq = 6, RULE_cmpr = 7, RULE_expr = 8, RULE_term = 9, 
		RULE_factor = 10, RULE_pow = 11, RULE_prim = 12, RULE_index = 13, RULE_vect = 14, 
		RULE_matr = 15, RULE_literal = 16, RULE_assgn = 17, RULE_lop = 18, RULE_rop = 19, 
		RULE_cond = 20, RULE_cond1 = 21, RULE_mcase = 22, RULE_mdefault = 23, 
		RULE_loop = 24, RULE_loopcnd = 25, RULE_func = 26, RULE_args = 27;
	public static final String[] ruleNames = {
		"start", "openblk", "closeblk", "code", "lgcexpr", "lgcand", "cmpeq", 
		"cmpr", "expr", "term", "factor", "pow", "prim", "index", "vect", "matr", 
		"literal", "assgn", "lop", "rop", "cond", "cond1", "mcase", "mdefault", 
		"loop", "loopcnd", "func", "args"
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
		public List<OpenblkContext> openblk() {
			return getRuleContexts(OpenblkContext.class);
		}
		public OpenblkContext openblk(int i) {
			return getRuleContext(OpenblkContext.class,i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<CloseblkContext> closeblk() {
			return getRuleContexts(CloseblkContext.class);
		}
		public CloseblkContext closeblk(int i) {
			return getRuleContext(CloseblkContext.class,i);
		}
		public List<TerminalNode> IMACRO() { return getTokens(interpreterParser.IMACRO); }
		public TerminalNode IMACRO(int i) {
			return getToken(interpreterParser.IMACRO, i);
		}
		public List<TerminalNode> IPRINT() { return getTokens(interpreterParser.IPRINT); }
		public TerminalNode IPRINT(int i) {
			return getToken(interpreterParser.IPRINT, i);
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMACRO || _la==IPRINT) {
				{
				{
				setState(56);
				_la = _input.LA(1);
				if ( !(_la==IMACRO || _la==IPRINT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(57);
				openblk();
				setState(58);
				code();
				setState(59);
				closeblk();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
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

	public static class OpenblkContext extends ParserRuleContext {
		public TerminalNode LCURLB() { return getToken(interpreterParser.LCURLB, 0); }
		public OpenblkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openblk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterOpenblk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitOpenblk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitOpenblk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenblkContext openblk() throws RecognitionException {
		OpenblkContext _localctx = new OpenblkContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_openblk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(LCURLB);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(69);
				match(T__0);
				}
				}
				setState(74);
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

	public static class CloseblkContext extends ParserRuleContext {
		public TerminalNode RCURLB() { return getToken(interpreterParser.RCURLB, 0); }
		public CloseblkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeblk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterCloseblk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitCloseblk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitCloseblk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseblkContext closeblk() throws RecognitionException {
		CloseblkContext _localctx = new CloseblkContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_closeblk);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(75);
				match(T__0);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(RCURLB);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					match(T__0);
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class CodeContext extends ParserRuleContext {
		public List<LgcexprContext> lgcexpr() {
			return getRuleContexts(LgcexprContext.class);
		}
		public LgcexprContext lgcexpr(int i) {
			return getRuleContext(LgcexprContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<AssgnContext> assgn() {
			return getRuleContexts(AssgnContext.class);
		}
		public AssgnContext assgn(int i) {
			return getRuleContext(AssgnContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
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
		enterRule(_localctx, 6, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(94);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(88);
					lgcexpr(0);
					setState(89);
					match(SMCOLON);
					}
					break;
				case 2:
					{
					setState(91);
					loop();
					}
					break;
				case 3:
					{
					setState(92);
					assgn();
					}
					break;
				case 4:
					{
					setState(93);
					cond();
					}
					break;
				}
				}
				setState(96); 
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

	public static class LgcexprContext extends ParserRuleContext {
		public LgcexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lgcexpr; }
	 
		public LgcexprContext() { }
		public void copyFrom(LgcexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LgcandExprContext extends LgcexprContext {
		public LgcandContext lgcand() {
			return getRuleContext(LgcandContext.class,0);
		}
		public LgcandExprContext(LgcexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterLgcandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitLgcandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitLgcandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends LgcexprContext {
		public LgcexprContext lgcexpr() {
			return getRuleContext(LgcexprContext.class,0);
		}
		public TerminalNode OR() { return getToken(interpreterParser.OR, 0); }
		public LgcandContext lgcand() {
			return getRuleContext(LgcandContext.class,0);
		}
		public OrExprContext(LgcexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitOrExpr(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_lgcexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LgcandExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(99);
			lgcand(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExprContext(new LgcexprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lgcexpr);
					setState(101);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(102);
					match(OR);
					setState(103);
					lgcand(0);
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public LgcandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lgcand; }
	 
		public LgcandContext() { }
		public void copyFrom(LgcandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CmpeqExprContext extends LgcandContext {
		public CmpeqContext cmpeq() {
			return getRuleContext(CmpeqContext.class,0);
		}
		public CmpeqExprContext(LgcandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterCmpeqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitCmpeqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitCmpeqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends LgcandContext {
		public LgcandContext lgcand() {
			return getRuleContext(LgcandContext.class,0);
		}
		public TerminalNode AND() { return getToken(interpreterParser.AND, 0); }
		public CmpeqContext cmpeq() {
			return getRuleContext(CmpeqContext.class,0);
		}
		public AndExprContext(LgcandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitAndExpr(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_lgcand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CmpeqExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(110);
			cmpeq(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(new LgcandContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lgcand);
					setState(112);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(113);
					match(AND);
					setState(114);
					cmpeq(0);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public CmpeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpeq; }
	 
		public CmpeqContext() { }
		public void copyFrom(CmpeqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CmprExprContext extends CmpeqContext {
		public CmprContext cmpr() {
			return getRuleContext(CmprContext.class,0);
		}
		public CmprExprContext(CmpeqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterCmprExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitCmprExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitCmprExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualExprContext extends CmpeqContext {
		public CmpeqContext cmpeq() {
			return getRuleContext(CmpeqContext.class,0);
		}
		public TerminalNode NEQ() { return getToken(interpreterParser.NEQ, 0); }
		public CmprContext cmpr() {
			return getRuleContext(CmprContext.class,0);
		}
		public NotEqualExprContext(CmpeqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterNotEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitNotEqualExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitNotEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualExprContext extends CmpeqContext {
		public CmpeqContext cmpeq() {
			return getRuleContext(CmpeqContext.class,0);
		}
		public TerminalNode EQ() { return getToken(interpreterParser.EQ, 0); }
		public CmprContext cmpr() {
			return getRuleContext(CmprContext.class,0);
		}
		public EqualExprContext(CmpeqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitEqualExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitEqualExpr(this);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_cmpeq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CmprExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(121);
			cmpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(129);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new EqualExprContext(new CmpeqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cmpeq);
						setState(123);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(124);
						match(EQ);
						setState(125);
						cmpr(0);
						}
						break;
					case 2:
						{
						_localctx = new NotEqualExprContext(new CmpeqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cmpeq);
						setState(126);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(127);
						match(NEQ);
						setState(128);
						cmpr(0);
						}
						break;
					}
					} 
				}
				setState(133);
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

	public static class CmprContext extends ParserRuleContext {
		public CmprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpr; }
	 
		public CmprContext() { }
		public void copyFrom(CmprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GreaterExprContext extends CmprContext {
		public CmprContext cmpr() {
			return getRuleContext(CmprContext.class,0);
		}
		public TerminalNode GE() { return getToken(interpreterParser.GE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GreaterExprContext(CmprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterGreaterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitGreaterExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitGreaterExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterOrEqExprContext extends CmprContext {
		public CmprContext cmpr() {
			return getRuleContext(CmprContext.class,0);
		}
		public TerminalNode GEQ() { return getToken(interpreterParser.GEQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GreaterOrEqExprContext(CmprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterGreaterOrEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitGreaterOrEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitGreaterOrEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessExprContext extends CmprContext {
		public CmprContext cmpr() {
			return getRuleContext(CmprContext.class,0);
		}
		public TerminalNode LE() { return getToken(interpreterParser.LE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LessExprContext(CmprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterLessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitLessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitLessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithExprContext extends CmprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArithExprContext(CmprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterArithExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitArithExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitArithExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessOrEqExprContext extends CmprContext {
		public CmprContext cmpr() {
			return getRuleContext(CmprContext.class,0);
		}
		public TerminalNode LEQ() { return getToken(interpreterParser.LEQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LessOrEqExprContext(CmprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterLessOrEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitLessOrEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitLessOrEqExpr(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_cmpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ArithExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(135);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(149);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new LessExprContext(new CmprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cmpr);
						setState(137);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(138);
						match(LE);
						setState(139);
						expr(0);
						}
						break;
					case 2:
						{
						_localctx = new LessOrEqExprContext(new CmprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cmpr);
						setState(140);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(141);
						match(LEQ);
						setState(142);
						expr(0);
						}
						break;
					case 3:
						{
						_localctx = new GreaterExprContext(new CmprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cmpr);
						setState(143);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(144);
						match(GE);
						setState(145);
						expr(0);
						}
						break;
					case 4:
						{
						_localctx = new GreaterOrEqExprContext(new CmprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cmpr);
						setState(146);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(147);
						match(GEQ);
						setState(148);
						expr(0);
						}
						break;
					}
					} 
				}
				setState(153);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(interpreterParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(interpreterParser.MINUS, 0); }
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermExprContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterTermExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitTermExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitTermExpr(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(155);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(157);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(158);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(159);
					term(0);
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HiddenMulContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode HMUL() { return getToken(interpreterParser.HMUL, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public HiddenMulContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterHiddenMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitHiddenMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitHiddenMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExprContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MUL() { return getToken(interpreterParser.MUL, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public MulExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExprContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode DIV() { return getToken(interpreterParser.DIV, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public DivExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorExprContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterFactorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitFactorExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitFactorExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VectorMulContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode VMUL() { return getToken(interpreterParser.VMUL, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public VectorMulContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterVectorMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitVectorMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitVectorMul(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FactorExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(166);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(180);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(168);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(169);
						match(MUL);
						setState(170);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new HiddenMulContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(171);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(172);
						match(HMUL);
						setState(173);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new DivExprContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(174);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(175);
						match(DIV);
						setState(176);
						factor();
						}
						break;
					case 4:
						{
						_localctx = new VectorMulContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(177);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(178);
						match(VMUL);
						setState(179);
						factor();
						}
						break;
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PwrExprContext extends FactorContext {
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public PwrExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterPwrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitPwrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitPwrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TranspExprContext extends FactorContext {
		public TerminalNode TRANSP() { return getToken(interpreterParser.TRANSP, 0); }
		public TerminalNode LCURLB() { return getToken(interpreterParser.LCURLB, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public TerminalNode RCURLB() { return getToken(interpreterParser.RCURLB, 0); }
		public TranspExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterTranspExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitTranspExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitTranspExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InversionExprContext extends FactorContext {
		public TerminalNode INV() { return getToken(interpreterParser.INV, 0); }
		public TerminalNode LCURLB() { return getToken(interpreterParser.LCURLB, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public TerminalNode RCURLB() { return getToken(interpreterParser.RCURLB, 0); }
		public InversionExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterInversionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitInversionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitInversionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusContext extends FactorContext {
		public TerminalNode MINUS() { return getToken(interpreterParser.MINUS, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public UnaryMinusContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModOrDetContext extends FactorContext {
		public List<TerminalNode> BAR() { return getTokens(interpreterParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(interpreterParser.BAR, i);
		}
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public ModOrDetContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterModOrDet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitModOrDet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitModOrDet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factor);
		try {
			setState(202);
			switch (_input.LA(1)) {
			case MINUS:
				_localctx = new UnaryMinusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(MINUS);
				setState(186);
				pow(0);
				}
				break;
			case INV:
				_localctx = new InversionExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(INV);
				setState(188);
				match(LCURLB);
				setState(189);
				pow(0);
				setState(190);
				match(RCURLB);
				}
				break;
			case TRANSP:
				_localctx = new TranspExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(TRANSP);
				setState(193);
				match(LCURLB);
				setState(194);
				pow(0);
				setState(195);
				match(RCURLB);
				}
				break;
			case BAR:
				_localctx = new ModOrDetContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				match(BAR);
				setState(198);
				pow(0);
				setState(199);
				match(BAR);
				}
				break;
			case VECT:
			case MATR:
			case LPAREN:
			case IDENT:
			case NUM:
				_localctx = new PwrExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
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
		public PowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow; }
	 
		public PowContext() { }
		public void copyFrom(PowContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimExprContext extends PowContext {
		public PrimContext prim() {
			return getRuleContext(PrimContext.class,0);
		}
		public PrimExprContext(PowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterPrimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitPrimExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitPrimExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExprContext extends PowContext {
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public TerminalNode POWOP() { return getToken(interpreterParser.POWOP, 0); }
		public PrimContext prim() {
			return getRuleContext(PrimContext.class,0);
		}
		public PowExprContext(PowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitPowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitPowExpr(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_pow, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(205);
			prim();
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PowExprContext(new PowContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_pow);
					setState(207);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(208);
					match(POWOP);
					setState(209);
					prim();
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public PrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prim; }
	 
		public PrimContext() { }
		public void copyFrom(PrimContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends PrimContext {
		public TerminalNode LPAREN() { return getToken(interpreterParser.LPAREN, 0); }
		public LgcexprContext lgcexpr() {
			return getRuleContext(LgcexprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(interpreterParser.RPAREN, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public ParExprContext(PrimContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncInvokeContext extends PrimContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public FuncInvokeContext(PrimContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterFuncInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitFuncInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitFuncInvoke(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends PrimContext {
		public TerminalNode IDENT() { return getToken(interpreterParser.IDENT, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public IdContext(PrimContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomContext extends PrimContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AtomContext(PrimContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimContext prim() throws RecognitionException {
		PrimContext _localctx = new PrimContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_prim);
		try {
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new FuncInvokeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				func();
				}
				break;
			case 2:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(IDENT);
				setState(218);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(217);
					index();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(LPAREN);
				setState(221);
				lgcexpr(0);
				setState(222);
				match(RPAREN);
				setState(224);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(223);
					index();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new AtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
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
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
	 
		public IndexContext() { }
		public void copyFrom(IndexContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VecIndexContext extends IndexContext {
		public TerminalNode AT() { return getToken(interpreterParser.AT, 0); }
		public TerminalNode LCURLB() { return getToken(interpreterParser.LCURLB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RCURLB() { return getToken(interpreterParser.RCURLB, 0); }
		public VecIndexContext(IndexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterVecIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitVecIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitVecIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatrIndexContext extends IndexContext {
		public TerminalNode AT() { return getToken(interpreterParser.AT, 0); }
		public TerminalNode LCURLB() { return getToken(interpreterParser.LCURLB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(interpreterParser.COMMA, 0); }
		public TerminalNode RCURLB() { return getToken(interpreterParser.RCURLB, 0); }
		public MatrIndexContext(IndexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterMatrIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitMatrIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitMatrIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_index);
		try {
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new VecIndexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(229);
				match(AT);
				setState(230);
				match(LCURLB);
				setState(231);
				expr(0);
				setState(232);
				match(RCURLB);
				}
				}
				break;
			case 2:
				_localctx = new MatrIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(234);
				match(AT);
				setState(235);
				match(LCURLB);
				setState(236);
				expr(0);
				setState(237);
				match(COMMA);
				setState(238);
				expr(0);
				setState(239);
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
		enterRule(_localctx, 28, RULE_vect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(VECT);
			setState(244);
			match(LBRACK);
			setState(245);
			lgcexpr(0);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(246);
				match(COMMA);
				setState(247);
				lgcexpr(0);
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
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
		enterRule(_localctx, 30, RULE_matr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(MATR);
			setState(256);
			match(LBRACK);
			setState(268); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(257);
				match(LBRACK);
				setState(258);
				lgcexpr(0);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(259);
					match(COMMA);
					setState(260);
					lgcexpr(0);
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(266);
				match(RBRACK);
				}
				}
				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACK );
			setState(272);
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
		enterRule(_localctx, 32, RULE_literal);
		try {
			setState(277);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(NUM);
				}
				break;
			case VECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				vect();
				}
				break;
			case MATR:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
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
		public List<TerminalNode> SMCOLON() { return getTokens(interpreterParser.SMCOLON); }
		public TerminalNode SMCOLON(int i) {
			return getToken(interpreterParser.SMCOLON, i);
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
		enterRule(_localctx, 34, RULE_assgn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			lop();
			setState(280);
			match(ASGNOP);
			setState(281);
			rop();
			setState(283); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(282);
				match(SMCOLON);
				}
				}
				setState(285); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SMCOLON );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 36, RULE_lop);
		try {
			setState(291);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
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
		enterRule(_localctx, 38, RULE_rop);
		try {
			setState(296);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
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
		public OpenblkContext openblk() {
			return getRuleContext(OpenblkContext.class,0);
		}
		public Cond1Context cond1() {
			return getRuleContext(Cond1Context.class,0);
		}
		public CloseblkContext closeblk() {
			return getRuleContext(CloseblkContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(SWITCHOP);
			setState(299);
			openblk();
			setState(300);
			cond1();
			setState(301);
			closeblk();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 42, RULE_cond1);
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
		public List<OpenblkContext> openblk() {
			return getRuleContexts(OpenblkContext.class);
		}
		public OpenblkContext openblk(int i) {
			return getRuleContext(OpenblkContext.class,i);
		}
		public LgcexprContext lgcexpr() {
			return getRuleContext(LgcexprContext.class,0);
		}
		public List<CloseblkContext> closeblk() {
			return getRuleContexts(CloseblkContext.class);
		}
		public CloseblkContext closeblk(int i) {
			return getRuleContext(CloseblkContext.class,i);
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
		enterRule(_localctx, 44, RULE_mcase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(CASEOP);
			setState(310);
			openblk();
			setState(311);
			lgcexpr(0);
			setState(312);
			closeblk();
			setState(313);
			openblk();
			setState(314);
			code();
			setState(315);
			closeblk();
			}
		}
		catch (RecognitionException re) {
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
		public OpenblkContext openblk() {
			return getRuleContext(OpenblkContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public CloseblkContext closeblk() {
			return getRuleContext(CloseblkContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_mdefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(DEFOP);
			setState(318);
			openblk();
			setState(319);
			code();
			setState(320);
			closeblk();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 48, RULE_loop);
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
		enterRule(_localctx, 50, RULE_loopcnd);
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
		enterRule(_localctx, 52, RULE_func);
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
		public List<LgcexprContext> lgcexpr() {
			return getRuleContexts(LgcexprContext.class);
		}
		public LgcexprContext lgcexpr(int i) {
			return getRuleContext(LgcexprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(interpreterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(interpreterParser.COMMA, i);
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
		enterRule(_localctx, 54, RULE_args);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(340);
					lgcexpr(0);
					setState(341);
					match(COMMA);
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(348);
			lgcexpr(0);
			}
		}
		catch (RecognitionException re) {
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
		case 4:
			return lgcexpr_sempred((LgcexprContext)_localctx, predIndex);
		case 5:
			return lgcand_sempred((LgcandContext)_localctx, predIndex);
		case 6:
			return cmpeq_sempred((CmpeqContext)_localctx, predIndex);
		case 7:
			return cmpr_sempred((CmprContext)_localctx, predIndex);
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 9:
			return term_sempred((TermContext)_localctx, predIndex);
		case 11:
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
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean pow_sempred(PowContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0161\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\7\2@\n\2"+
		"\f\2\16\2C\13\2\3\2\3\2\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\4\7\4O\n\4\f"+
		"\4\16\4R\13\4\3\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\6\5a\n\5\r\5\16\5b\3\6\3\6\3\6\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7v\n\7\f\7\16\7y\13\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\b\u0084\n\b\f\b\16\b\u0087\13\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0098\n\t\f\t\16\t\u009b\13\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a3\n\n\f\n\16\n\u00a6\13\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b7"+
		"\n\13\f\13\16\13\u00ba\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cd\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d5"+
		"\n\r\f\r\16\r\u00d8\13\r\3\16\3\16\3\16\5\16\u00dd\n\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00e3\n\16\3\16\5\16\u00e6\n\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f4\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00fb\n\20\f\20\16\20\u00fe\13\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u0108\n\21\f\21\16\21\u010b\13\21\3\21\3\21\6\21"+
		"\u010f\n\21\r\21\16\21\u0110\3\21\3\21\3\22\3\22\3\22\5\22\u0118\n\22"+
		"\3\23\3\23\3\23\3\23\6\23\u011e\n\23\r\23\16\23\u011f\3\24\3\24\3\24\3"+
		"\24\5\24\u0126\n\24\3\25\3\25\3\25\5\25\u012b\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\5\27\u0136\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\7\35\u015a\n\35\f\35\16\35\u015d\13\35\3\35\3\35\3\35\2\t\n\f\16\20\22"+
		"\24\30\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8\2\4\3\2\6\7\3\2\32\33\u0170\2A\3\2\2\2\4F\3\2\2\2\6P\3\2\2\2\b`\3\2"+
		"\2\2\nd\3\2\2\2\fo\3\2\2\2\16z\3\2\2\2\20\u0088\3\2\2\2\22\u009c\3\2\2"+
		"\2\24\u00a7\3\2\2\2\26\u00cc\3\2\2\2\30\u00ce\3\2\2\2\32\u00e5\3\2\2\2"+
		"\34\u00f3\3\2\2\2\36\u00f5\3\2\2\2 \u0101\3\2\2\2\"\u0117\3\2\2\2$\u0119"+
		"\3\2\2\2&\u0125\3\2\2\2(\u012a\3\2\2\2*\u012c\3\2\2\2,\u0135\3\2\2\2."+
		"\u0137\3\2\2\2\60\u013f\3\2\2\2\62\u0144\3\2\2\2\64\u0149\3\2\2\2\66\u0151"+
		"\3\2\2\28\u015b\3\2\2\2:;\t\2\2\2;<\5\4\3\2<=\5\b\5\2=>\5\6\4\2>@\3\2"+
		"\2\2?:\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\2"+
		"\2\3E\3\3\2\2\2FJ\7 \2\2GI\7\3\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2"+
		"\2\2K\5\3\2\2\2LJ\3\2\2\2MO\7\3\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3"+
		"\2\2\2QS\3\2\2\2RP\3\2\2\2SW\7!\2\2TV\7\3\2\2UT\3\2\2\2VY\3\2\2\2WU\3"+
		"\2\2\2WX\3\2\2\2X\7\3\2\2\2YW\3\2\2\2Z[\5\n\6\2[\\\7+\2\2\\a\3\2\2\2]"+
		"a\5\62\32\2^a\5$\23\2_a\5*\26\2`Z\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2"+
		"\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\t\3\2\2\2de\b\6\1\2ef\5\f\7\2fl\3\2"+
		"\2\2gh\f\4\2\2hi\7\22\2\2ik\5\f\7\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3"+
		"\2\2\2m\13\3\2\2\2nl\3\2\2\2op\b\7\1\2pq\5\16\b\2qw\3\2\2\2rs\f\4\2\2"+
		"st\7\23\2\2tv\5\16\b\2ur\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\r\3\2"+
		"\2\2yw\3\2\2\2z{\b\b\1\2{|\5\20\t\2|\u0085\3\2\2\2}~\f\5\2\2~\177\7\27"+
		"\2\2\177\u0084\5\20\t\2\u0080\u0081\f\4\2\2\u0081\u0082\7\26\2\2\u0082"+
		"\u0084\5\20\t\2\u0083}\3\2\2\2\u0083\u0080\3\2\2\2\u0084\u0087\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\17\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u0089\b\t\1\2\u0089\u008a\5\22\n\2\u008a\u0099\3\2\2\2"+
		"\u008b\u008c\f\7\2\2\u008c\u008d\7\31\2\2\u008d\u0098\5\22\n\2\u008e\u008f"+
		"\f\6\2\2\u008f\u0090\7\25\2\2\u0090\u0098\5\22\n\2\u0091\u0092\f\5\2\2"+
		"\u0092\u0093\7\30\2\2\u0093\u0098\5\22\n\2\u0094\u0095\f\4\2\2\u0095\u0096"+
		"\7\24\2\2\u0096\u0098\5\22\n\2\u0097\u008b\3\2\2\2\u0097\u008e\3\2\2\2"+
		"\u0097\u0091\3\2\2\2\u0097\u0094\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\21\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009d\b\n\1\2\u009d\u009e\5\24\13\2\u009e\u00a4\3\2\2\2\u009f\u00a0\f"+
		"\4\2\2\u00a0\u00a1\t\3\2\2\u00a1\u00a3\5\24\13\2\u00a2\u009f\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\23\3\2\2"+
		"\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\b\13\1\2\u00a8\u00a9\5\26\f\2\u00a9"+
		"\u00b8\3\2\2\2\u00aa\u00ab\f\7\2\2\u00ab\u00ac\7\34\2\2\u00ac\u00b7\5"+
		"\26\f\2\u00ad\u00ae\f\6\2\2\u00ae\u00af\7\16\2\2\u00af\u00b7\5\26\f\2"+
		"\u00b0\u00b1\f\5\2\2\u00b1\u00b2\7\36\2\2\u00b2\u00b7\5\26\f\2\u00b3\u00b4"+
		"\f\4\2\2\u00b4\u00b5\7\r\2\2\u00b5\u00b7\5\26\f\2\u00b6\u00aa\3\2\2\2"+
		"\u00b6\u00ad\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b7\u00ba"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\25\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bc\7\33\2\2\u00bc\u00cd\5\30\r\2\u00bd\u00be\7"+
		"\17\2\2\u00be\u00bf\7 \2\2\u00bf\u00c0\5\30\r\2\u00c0\u00c1\7!\2\2\u00c1"+
		"\u00cd\3\2\2\2\u00c2\u00c3\7\20\2\2\u00c3\u00c4\7 \2\2\u00c4\u00c5\5\30"+
		"\r\2\u00c5\u00c6\7!\2\2\u00c6\u00cd\3\2\2\2\u00c7\u00c8\7&\2\2\u00c8\u00c9"+
		"\5\30\r\2\u00c9\u00ca\7&\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00cd\5\30\r\2"+
		"\u00cc\u00bb\3\2\2\2\u00cc\u00bd\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc\u00c7"+
		"\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\27\3\2\2\2\u00ce\u00cf\b\r\1\2\u00cf"+
		"\u00d0\5\32\16\2\u00d0\u00d6\3\2\2\2\u00d1\u00d2\f\4\2\2\u00d2\u00d3\7"+
		"\35\2\2\u00d3\u00d5\5\32\16\2\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\31\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d9\u00e6\5\66\34\2\u00da\u00dc\7,\2\2\u00db\u00dd\5\34\17"+
		"\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e6\3\2\2\2\u00de\u00df"+
		"\7\"\2\2\u00df\u00e0\5\n\6\2\u00e0\u00e2\7#\2\2\u00e1\u00e3\5\34\17\2"+
		"\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e6"+
		"\5\"\22\2\u00e5\u00d9\3\2\2\2\u00e5\u00da\3\2\2\2\u00e5\u00de\3\2\2\2"+
		"\u00e5\u00e4\3\2\2\2\u00e6\33\3\2\2\2\u00e7\u00e8\7\13\2\2\u00e8\u00e9"+
		"\7 \2\2\u00e9\u00ea\5\22\n\2\u00ea\u00eb\7!\2\2\u00eb\u00f4\3\2\2\2\u00ec"+
		"\u00ed\7\13\2\2\u00ed\u00ee\7 \2\2\u00ee\u00ef\5\22\n\2\u00ef\u00f0\7"+
		"*\2\2\u00f0\u00f1\5\22\n\2\u00f1\u00f2\7!\2\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00e7\3\2\2\2\u00f3\u00ec\3\2\2\2\u00f4\35\3\2\2\2\u00f5\u00f6\7\4\2"+
		"\2\u00f6\u00f7\7$\2\2\u00f7\u00fc\5\n\6\2\u00f8\u00f9\7*\2\2\u00f9\u00fb"+
		"\5\n\6\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7%"+
		"\2\2\u0100\37\3\2\2\2\u0101\u0102\7\5\2\2\u0102\u010e\7$\2\2\u0103\u0104"+
		"\7$\2\2\u0104\u0109\5\n\6\2\u0105\u0106\7*\2\2\u0106\u0108\5\n\6\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7%\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u0103\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7%\2\2\u0113"+
		"!\3\2\2\2\u0114\u0118\7-\2\2\u0115\u0118\5\36\20\2\u0116\u0118\5 \21\2"+
		"\u0117\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118#\3"+
		"\2\2\2\u0119\u011a\5&\24\2\u011a\u011b\7(\2\2\u011b\u011d\5(\25\2\u011c"+
		"\u011e\7+\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120%\3\2\2\2\u0121\u0126\7,\2\2\u0122\u0123"+
		"\7,\2\2\u0123\u0126\5\34\17\2\u0124\u0126\5\66\34\2\u0125\u0121\3\2\2"+
		"\2\u0125\u0122\3\2\2\2\u0125\u0124\3\2\2\2\u0126\'\3\2\2\2\u0127\u012b"+
		"\5\n\6\2\u0128\u012b\5*\26\2\u0129\u012b\5\62\32\2\u012a\u0127\3\2\2\2"+
		"\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b)\3\2\2\2\u012c\u012d\7"+
		"\b\2\2\u012d\u012e\5\4\3\2\u012e\u012f\5,\27\2\u012f\u0130\5\6\4\2\u0130"+
		"+\3\2\2\2\u0131\u0132\5.\30\2\u0132\u0133\5,\27\2\u0133\u0136\3\2\2\2"+
		"\u0134\u0136\5\60\31\2\u0135\u0131\3\2\2\2\u0135\u0134\3\2\2\2\u0136-"+
		"\3\2\2\2\u0137\u0138\7\t\2\2\u0138\u0139\5\4\3\2\u0139\u013a\5\n\6\2\u013a"+
		"\u013b\5\6\4\2\u013b\u013c\5\4\3\2\u013c\u013d\5\b\5\2\u013d\u013e\5\6"+
		"\4\2\u013e/\3\2\2\2\u013f\u0140\7\n\2\2\u0140\u0141\5\4\3\2\u0141\u0142"+
		"\5\b\5\2\u0142\u0143\5\6\4\2\u0143\61\3\2\2\2\u0144\u0145\5\64\33\2\u0145"+
		"\u0146\7 \2\2\u0146\u0147\5\b\5\2\u0147\u0148\7!\2\2\u0148\63\3\2\2\2"+
		"\u0149\u014a\5\n\6\2\u014a\u014b\7\f\2\2\u014b\u014c\7 \2\2\u014c\u014d"+
		"\5\n\6\2\u014d\u014e\7+\2\2\u014e\u014f\5\n\6\2\u014f\u0150\7!\2\2\u0150"+
		"\65\3\2\2\2\u0151\u0152\7,\2\2\u0152\u0153\7\"\2\2\u0153\u0154\58\35\2"+
		"\u0154\u0155\7#\2\2\u0155\67\3\2\2\2\u0156\u0157\5\n\6\2\u0157\u0158\7"+
		"*\2\2\u0158\u015a\3\2\2\2\u0159\u0156\3\2\2\2\u015a\u015d\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015e\u015f\5\n\6\2\u015f9\3\2\2\2 AJPW`blw\u0083\u0085\u0097\u0099"+
		"\u00a4\u00b6\u00b8\u00cc\u00d6\u00dc\u00e2\u00e5\u00f3\u00fc\u0109\u0110"+
		"\u0117\u011f\u0125\u012a\u0135\u015b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}