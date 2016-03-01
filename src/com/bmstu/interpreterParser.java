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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, IDENT=36, NUM=37, LTEXT=38, RTEXT=39, 
		WS=40;
	public static final int
		RULE_start = 0, RULE_code = 1, RULE_lgcexpr = 2, RULE_lgcand = 3, RULE_cmpeq = 4, 
		RULE_cmpr = 5, RULE_expr = 6, RULE_term = 7, RULE_factor = 8, RULE_pow = 9, 
		RULE_prim = 10, RULE_index = 11, RULE_vect = 12, RULE_matr = 13, RULE_literal = 14, 
		RULE_assgn = 15, RULE_lop = 16, RULE_rop = 17, RULE_cond = 18, RULE_cond1 = 19, 
		RULE_mcase = 20, RULE_mdefault = 21, RULE_loop = 22, RULE_loopcnd = 23, 
		RULE_func = 24, RULE_args = 25;
	public static final String[] ruleNames = {
		"start", "code", "lgcexpr", "lgcand", "cmpeq", "cmpr", "expr", "term", 
		"factor", "pow", "prim", "index", "vect", "matr", "literal", "assgn", 
		"lop", "rop", "cond", "cond1", "mcase", "mdefault", "loop", "loopcnd", 
		"func", "args"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\'", "'imacro'", "'{'", "'}'", "'iprint'", "'\\or'", "'\\and'", 
		"'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'\\hidemul'", 
		"'/'", "'\\vecmul'", "'\\inverse'", "'\\transpose'", "'|'", "'^'", "'('", 
		"')'", "'\\at'", "','", "'['", "']'", "':='", "'conditional'", "'case'", 
		"'otherwise'", "'in'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"IDENT", "NUM", "LTEXT", "RTEXT", "WS"
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
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
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
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(T__0);
				setState(53);
				match(T__1);
				setState(54);
				match(T__2);
				setState(55);
				code();
				setState(56);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(T__0);
				setState(59);
				match(T__4);
				setState(60);
				match(T__2);
				setState(61);
				code();
				setState(62);
				match(T__3);
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

	public static class CodeContext extends ParserRuleContext {
		public LgcexprContext lgcexpr() {
			return getRuleContext(LgcexprContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public AssgnContext assgn() {
			return getRuleContext(AssgnContext.class,0);
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
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		try {
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				lgcexpr(0);
				setState(67);
				code();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				cond();
				setState(70);
				code();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				loop();
				setState(73);
				code();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				func();
				setState(76);
				code();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				assgn();
				setState(79);
				code();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
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
	}

	public final LgcexprContext lgcexpr() throws RecognitionException {
		return lgcexpr(0);
	}

	private LgcexprContext lgcexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LgcexprContext _localctx = new LgcexprContext(_ctx, _parentState);
		LgcexprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_lgcexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(85);
			lgcand(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LgcexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lgcexpr);
					setState(87);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(88);
					match(T__5);
					setState(89);
					lgcand(0);
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	}

	public final LgcandContext lgcand() throws RecognitionException {
		return lgcand(0);
	}

	private LgcandContext lgcand(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LgcandContext _localctx = new LgcandContext(_ctx, _parentState);
		LgcandContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_lgcand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(96);
			cmpeq(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LgcandContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lgcand);
					setState(98);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(99);
					match(T__6);
					setState(100);
					cmpeq(0);
					}
					} 
				}
				setState(105);
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
	}

	public final CmpeqContext cmpeq() throws RecognitionException {
		return cmpeq(0);
	}

	private CmpeqContext cmpeq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CmpeqContext _localctx = new CmpeqContext(_ctx, _parentState);
		CmpeqContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_cmpeq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(107);
			cmpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(115);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new CmpeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cmpeq);
						setState(109);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(110);
						match(T__7);
						setState(111);
						cmpr(0);
						}
						break;
					case 2:
						{
						_localctx = new CmpeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cmpeq);
						setState(112);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(113);
						match(T__8);
						setState(114);
						cmpr(0);
						}
						break;
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	}

	public final CmprContext cmpr() throws RecognitionException {
		return cmpr(0);
	}

	private CmprContext cmpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CmprContext _localctx = new CmprContext(_ctx, _parentState);
		CmprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_cmpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(121);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new CmprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cmpr);
						setState(123);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(124);
						match(T__9);
						setState(125);
						expr(0);
						}
						break;
					case 2:
						{
						_localctx = new CmprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cmpr);
						setState(126);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(127);
						match(T__10);
						setState(128);
						expr(0);
						}
						break;
					case 3:
						{
						_localctx = new CmprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cmpr);
						setState(129);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(130);
						match(T__11);
						setState(131);
						expr(0);
						}
						break;
					case 4:
						{
						_localctx = new CmprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cmpr);
						setState(132);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(133);
						match(T__12);
						setState(134);
						expr(0);
						}
						break;
					}
					} 
				}
				setState(139);
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(141);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(149);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(144);
						match(T__13);
						setState(145);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(147);
						match(T__14);
						setState(148);
						term(0);
						}
						break;
					}
					} 
				}
				setState(153);
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
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
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(155);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(157);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(158);
						match(T__15);
						setState(159);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(160);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(161);
						match(T__16);
						setState(162);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(163);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(164);
						match(T__17);
						setState(165);
						factor();
						}
						break;
					case 4:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(166);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(167);
						match(T__18);
						setState(168);
						factor();
						}
						break;
					}
					} 
				}
				setState(173);
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

	public static class FactorContext extends ParserRuleContext {
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
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
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_factor);
		try {
			setState(191);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(T__14);
				setState(175);
				pow(0);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__19);
				setState(177);
				match(T__2);
				setState(178);
				pow(0);
				setState(179);
				match(T__3);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(T__20);
				setState(182);
				match(T__2);
				setState(183);
				pow(0);
				setState(184);
				match(T__3);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(T__21);
				setState(187);
				pow(0);
				setState(188);
				match(T__21);
				}
				break;
			case T__23:
			case T__27:
			case IDENT:
			case NUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
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
	}

	public final PowContext pow() throws RecognitionException {
		return pow(0);
	}

	private PowContext pow(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PowContext _localctx = new PowContext(_ctx, _parentState);
		PowContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_pow, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(194);
			prim();
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PowContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pow);
					setState(196);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(197);
					match(T__22);
					setState(198);
					prim();
					}
					} 
				}
				setState(203);
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

	public static class PrimContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(interpreterParser.IDENT, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public LgcexprContext lgcexpr() {
			return getRuleContext(LgcexprContext.class,0);
		}
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
	}

	public final PrimContext prim() throws RecognitionException {
		PrimContext _localctx = new PrimContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prim);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(IDENT);
				setState(205);
				index();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(T__23);
				setState(207);
				lgcexpr(0);
				setState(208);
				match(T__24);
				setState(209);
				index();
				}
				break;
			case T__27:
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				literal();
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

	public static class IndexContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_index);
		try {
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(T__25);
				setState(215);
				match(T__2);
				setState(216);
				expr(0);
				setState(217);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(T__25);
				setState(220);
				match(T__2);
				setState(221);
				expr(0);
				setState(222);
				match(T__26);
				setState(223);
				expr(0);
				setState(224);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
		public List<TerminalNode> NUM() { return getTokens(interpreterParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(interpreterParser.NUM, i);
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
	}

	public final VectContext vect() throws RecognitionException {
		VectContext _localctx = new VectContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_vect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__27);
			setState(230);
			match(NUM);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(231);
				match(T__26);
				setState(232);
				match(NUM);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(T__28);
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
		public List<VectContext> vect() {
			return getRuleContexts(VectContext.class);
		}
		public VectContext vect(int i) {
			return getRuleContext(VectContext.class,i);
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
	}

	public final MatrContext matr() throws RecognitionException {
		MatrContext _localctx = new MatrContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_matr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__27);
			setState(241);
			vect();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(242);
				match(T__26);
				setState(243);
				vect();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(T__28);
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
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_literal);
		try {
			setState(254);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				vect();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				matr();
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

	public static class AssgnContext extends ParserRuleContext {
		public LopContext lop() {
			return getRuleContext(LopContext.class,0);
		}
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
	}

	public final AssgnContext assgn() throws RecognitionException {
		AssgnContext _localctx = new AssgnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assgn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			lop();
			setState(257);
			match(T__29);
			setState(258);
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
	}

	public final LopContext lop() throws RecognitionException {
		LopContext _localctx = new LopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lop);
		try {
			setState(264);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(IDENT);
				setState(262);
				index();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
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
		public TerminalNode IDENT() { return getToken(interpreterParser.IDENT, 0); }
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
	}

	public final RopContext rop() throws RecognitionException {
		RopContext _localctx = new RopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rop);
		try {
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				lgcexpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				cond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
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
		public Cond1Context cond1() {
			return getRuleContext(Cond1Context.class,0);
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
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__0);
			setState(273);
			match(T__30);
			setState(274);
			match(T__2);
			setState(275);
			cond1();
			setState(276);
			match(T__3);
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
	}

	public final Cond1Context cond1() throws RecognitionException {
		Cond1Context _localctx = new Cond1Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_cond1);
		try {
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				mcase();
				setState(279);
				cond1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				mdefault();
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

	public static class McaseContext extends ParserRuleContext {
		public LgcexprContext lgcexpr() {
			return getRuleContext(LgcexprContext.class,0);
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
	}

	public final McaseContext mcase() throws RecognitionException {
		McaseContext _localctx = new McaseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mcase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__0);
			setState(285);
			match(T__31);
			setState(286);
			match(T__2);
			setState(287);
			lgcexpr(0);
			setState(288);
			match(T__3);
			setState(289);
			match(T__2);
			setState(290);
			code();
			setState(291);
			match(T__3);
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
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
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
	}

	public final MdefaultContext mdefault() throws RecognitionException {
		MdefaultContext _localctx = new MdefaultContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mdefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__0);
			setState(294);
			match(T__32);
			setState(295);
			match(T__2);
			setState(296);
			code();
			setState(297);
			match(T__3);
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
		public LgcexprContext lgcexpr() {
			return getRuleContext(LgcexprContext.class,0);
		}
		public LoopcndContext loopcnd() {
			return getRuleContext(LoopcndContext.class,0);
		}
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
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			lgcexpr(0);
			setState(300);
			match(T__26);
			setState(301);
			loopcnd();
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
	}

	public final LoopcndContext loopcnd() throws RecognitionException {
		LoopcndContext _localctx = new LoopcndContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_loopcnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			lgcexpr(0);
			setState(304);
			match(T__0);
			setState(305);
			match(T__33);
			setState(306);
			match(T__2);
			setState(307);
			lgcexpr(0);
			setState(308);
			match(T__34);
			setState(309);
			lgcexpr(0);
			setState(310);
			match(T__3);
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
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
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
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(IDENT);
			setState(313);
			match(T__23);
			setState(314);
			args();
			setState(315);
			match(T__24);
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
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_args);
		try {
			setState(322);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				lgcexpr(0);
				setState(318);
				match(T__26);
				setState(319);
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
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
		case 2:
			return lgcexpr_sempred((LgcexprContext)_localctx, predIndex);
		case 3:
			return lgcand_sempred((LgcandContext)_localctx, predIndex);
		case 4:
			return cmpeq_sempred((CmpeqContext)_localctx, predIndex);
		case 5:
			return cmpr_sempred((CmprContext)_localctx, predIndex);
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 7:
			return term_sempred((TermContext)_localctx, predIndex);
		case 9:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u0147\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5"+
		"\2C\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3U\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5h\n\5\f\5\16\5k\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6v\n\6\f\6\16\6y\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\u008a\n\7\f\7\16\7\u008d\13\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u0098\n\b\f\b\16\b\u009b\13\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ac\n\t\f\t\16\t\u00af"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00c2\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ca\n\13\f\13"+
		"\16\13\u00cd\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d7\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e6\n\r\3\16\3\16"+
		"\3\16\3\16\7\16\u00ec\n\16\f\16\16\16\u00ef\13\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\7\17\u00f7\n\17\f\17\16\17\u00fa\13\17\3\17\3\17\3\20\3\20"+
		"\3\20\5\20\u0101\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u010b"+
		"\n\22\3\23\3\23\3\23\3\23\5\23\u0111\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\5\25\u011d\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0145\n\33\3\33\2\t\6\b\n\f\16\20\24\34\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\2\u0154\2B\3\2\2\2\4"+
		"T\3\2\2\2\6V\3\2\2\2\ba\3\2\2\2\nl\3\2\2\2\fz\3\2\2\2\16\u008e\3\2\2\2"+
		"\20\u009c\3\2\2\2\22\u00c1\3\2\2\2\24\u00c3\3\2\2\2\26\u00d6\3\2\2\2\30"+
		"\u00e5\3\2\2\2\32\u00e7\3\2\2\2\34\u00f2\3\2\2\2\36\u0100\3\2\2\2 \u0102"+
		"\3\2\2\2\"\u010a\3\2\2\2$\u0110\3\2\2\2&\u0112\3\2\2\2(\u011c\3\2\2\2"+
		"*\u011e\3\2\2\2,\u0127\3\2\2\2.\u012d\3\2\2\2\60\u0131\3\2\2\2\62\u013a"+
		"\3\2\2\2\64\u0144\3\2\2\2\66\67\7\3\2\2\678\7\4\2\289\7\5\2\29:\5\4\3"+
		"\2:;\7\6\2\2;C\3\2\2\2<=\7\3\2\2=>\7\7\2\2>?\7\5\2\2?@\5\4\3\2@A\7\6\2"+
		"\2AC\3\2\2\2B\66\3\2\2\2B<\3\2\2\2C\3\3\2\2\2DE\5\6\4\2EF\5\4\3\2FU\3"+
		"\2\2\2GH\5&\24\2HI\5\4\3\2IU\3\2\2\2JK\5.\30\2KL\5\4\3\2LU\3\2\2\2MN\5"+
		"\62\32\2NO\5\4\3\2OU\3\2\2\2PQ\5 \21\2QR\5\4\3\2RU\3\2\2\2SU\3\2\2\2T"+
		"D\3\2\2\2TG\3\2\2\2TJ\3\2\2\2TM\3\2\2\2TP\3\2\2\2TS\3\2\2\2U\5\3\2\2\2"+
		"VW\b\4\1\2WX\5\b\5\2X^\3\2\2\2YZ\f\4\2\2Z[\7\b\2\2[]\5\b\5\2\\Y\3\2\2"+
		"\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\7\3\2\2\2`^\3\2\2\2ab\b\5\1\2bc\5\n"+
		"\6\2ci\3\2\2\2de\f\4\2\2ef\7\t\2\2fh\5\n\6\2gd\3\2\2\2hk\3\2\2\2ig\3\2"+
		"\2\2ij\3\2\2\2j\t\3\2\2\2ki\3\2\2\2lm\b\6\1\2mn\5\f\7\2nw\3\2\2\2op\f"+
		"\5\2\2pq\7\n\2\2qv\5\f\7\2rs\f\4\2\2st\7\13\2\2tv\5\f\7\2uo\3\2\2\2ur"+
		"\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\13\3\2\2\2yw\3\2\2\2z{\b\7\1\2"+
		"{|\5\16\b\2|\u008b\3\2\2\2}~\f\7\2\2~\177\7\f\2\2\177\u008a\5\16\b\2\u0080"+
		"\u0081\f\6\2\2\u0081\u0082\7\r\2\2\u0082\u008a\5\16\b\2\u0083\u0084\f"+
		"\5\2\2\u0084\u0085\7\16\2\2\u0085\u008a\5\16\b\2\u0086\u0087\f\4\2\2\u0087"+
		"\u0088\7\17\2\2\u0088\u008a\5\16\b\2\u0089}\3\2\2\2\u0089\u0080\3\2\2"+
		"\2\u0089\u0083\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\r\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\b\b\1\2\u008f\u0090\5\20\t\2\u0090\u0099\3\2\2\2\u0091\u0092\f"+
		"\5\2\2\u0092\u0093\7\20\2\2\u0093\u0098\5\20\t\2\u0094\u0095\f\4\2\2\u0095"+
		"\u0096\7\21\2\2\u0096\u0098\5\20\t\2\u0097\u0091\3\2\2\2\u0097\u0094\3"+
		"\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\17\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\b\t\1\2\u009d\u009e\5\22\n"+
		"\2\u009e\u00ad\3\2\2\2\u009f\u00a0\f\7\2\2\u00a0\u00a1\7\22\2\2\u00a1"+
		"\u00ac\5\22\n\2\u00a2\u00a3\f\6\2\2\u00a3\u00a4\7\23\2\2\u00a4\u00ac\5"+
		"\22\n\2\u00a5\u00a6\f\5\2\2\u00a6\u00a7\7\24\2\2\u00a7\u00ac\5\22\n\2"+
		"\u00a8\u00a9\f\4\2\2\u00a9\u00aa\7\25\2\2\u00aa\u00ac\5\22\n\2\u00ab\u009f"+
		"\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\21\3\2\2"+
		"\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\21\2\2\u00b1\u00c2\5\24\13\2\u00b2"+
		"\u00b3\7\26\2\2\u00b3\u00b4\7\5\2\2\u00b4\u00b5\5\24\13\2\u00b5\u00b6"+
		"\7\6\2\2\u00b6\u00c2\3\2\2\2\u00b7\u00b8\7\27\2\2\u00b8\u00b9\7\5\2\2"+
		"\u00b9\u00ba\5\24\13\2\u00ba\u00bb\7\6\2\2\u00bb\u00c2\3\2\2\2\u00bc\u00bd"+
		"\7\30\2\2\u00bd\u00be\5\24\13\2\u00be\u00bf\7\30\2\2\u00bf\u00c2\3\2\2"+
		"\2\u00c0\u00c2\5\24\13\2\u00c1\u00b0\3\2\2\2\u00c1\u00b2\3\2\2\2\u00c1"+
		"\u00b7\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\23\3\2\2"+
		"\2\u00c3\u00c4\b\13\1\2\u00c4\u00c5\5\26\f\2\u00c5\u00cb\3\2\2\2\u00c6"+
		"\u00c7\f\4\2\2\u00c7\u00c8\7\31\2\2\u00c8\u00ca\5\26\f\2\u00c9\u00c6\3"+
		"\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\25\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7&\2\2\u00cf\u00d7\5\30\r"+
		"\2\u00d0\u00d1\7\32\2\2\u00d1\u00d2\5\6\4\2\u00d2\u00d3\7\33\2\2\u00d3"+
		"\u00d4\5\30\r\2\u00d4\u00d7\3\2\2\2\u00d5\u00d7\5\36\20\2\u00d6\u00ce"+
		"\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\27\3\2\2\2\u00d8"+
		"\u00d9\7\34\2\2\u00d9\u00da\7\5\2\2\u00da\u00db\5\16\b\2\u00db\u00dc\7"+
		"\6\2\2\u00dc\u00e6\3\2\2\2\u00dd\u00de\7\34\2\2\u00de\u00df\7\5\2\2\u00df"+
		"\u00e0\5\16\b\2\u00e0\u00e1\7\35\2\2\u00e1\u00e2\5\16\b\2\u00e2\u00e3"+
		"\7\6\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00d8\3\2\2\2\u00e5"+
		"\u00dd\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\31\3\2\2\2\u00e7\u00e8\7\36\2"+
		"\2\u00e8\u00ed\7\'\2\2\u00e9\u00ea\7\35\2\2\u00ea\u00ec\7\'\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7\37\2\2\u00f1"+
		"\33\3\2\2\2\u00f2\u00f3\7\36\2\2\u00f3\u00f8\5\32\16\2\u00f4\u00f5\7\35"+
		"\2\2\u00f5\u00f7\5\32\16\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fc\7\37\2\2\u00fc\35\3\2\2\2\u00fd\u0101\7\'\2\2\u00fe\u0101"+
		"\5\32\16\2\u00ff\u0101\5\34\17\2\u0100\u00fd\3\2\2\2\u0100\u00fe\3\2\2"+
		"\2\u0100\u00ff\3\2\2\2\u0101\37\3\2\2\2\u0102\u0103\5\"\22\2\u0103\u0104"+
		"\7 \2\2\u0104\u0105\5$\23\2\u0105!\3\2\2\2\u0106\u010b\7&\2\2\u0107\u0108"+
		"\7&\2\2\u0108\u010b\5\30\r\2\u0109\u010b\5\62\32\2\u010a\u0106\3\2\2\2"+
		"\u010a\u0107\3\2\2\2\u010a\u0109\3\2\2\2\u010b#\3\2\2\2\u010c\u0111\7"+
		"&\2\2\u010d\u0111\5\6\4\2\u010e\u0111\5&\24\2\u010f\u0111\5.\30\2\u0110"+
		"\u010c\3\2\2\2\u0110\u010d\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2"+
		"\2\2\u0111%\3\2\2\2\u0112\u0113\7\3\2\2\u0113\u0114\7!\2\2\u0114\u0115"+
		"\7\5\2\2\u0115\u0116\5(\25\2\u0116\u0117\7\6\2\2\u0117\'\3\2\2\2\u0118"+
		"\u0119\5*\26\2\u0119\u011a\5(\25\2\u011a\u011d\3\2\2\2\u011b\u011d\5,"+
		"\27\2\u011c\u0118\3\2\2\2\u011c\u011b\3\2\2\2\u011d)\3\2\2\2\u011e\u011f"+
		"\7\3\2\2\u011f\u0120\7\"\2\2\u0120\u0121\7\5\2\2\u0121\u0122\5\6\4\2\u0122"+
		"\u0123\7\6\2\2\u0123\u0124\7\5\2\2\u0124\u0125\5\4\3\2\u0125\u0126\7\6"+
		"\2\2\u0126+\3\2\2\2\u0127\u0128\7\3\2\2\u0128\u0129\7#\2\2\u0129\u012a"+
		"\7\5\2\2\u012a\u012b\5\4\3\2\u012b\u012c\7\6\2\2\u012c-\3\2\2\2\u012d"+
		"\u012e\5\6\4\2\u012e\u012f\7\35\2\2\u012f\u0130\5\60\31\2\u0130/\3\2\2"+
		"\2\u0131\u0132\5\6\4\2\u0132\u0133\7\3\2\2\u0133\u0134\7$\2\2\u0134\u0135"+
		"\7\5\2\2\u0135\u0136\5\6\4\2\u0136\u0137\7%\2\2\u0137\u0138\5\6\4\2\u0138"+
		"\u0139\7\6\2\2\u0139\61\3\2\2\2\u013a\u013b\7&\2\2\u013b\u013c\7\32\2"+
		"\2\u013c\u013d\5\64\33\2\u013d\u013e\7\33\2\2\u013e\63\3\2\2\2\u013f\u0140"+
		"\5\6\4\2\u0140\u0141\7\35\2\2\u0141\u0142\5\64\33\2\u0142\u0145\3\2\2"+
		"\2\u0143\u0145\5\6\4\2\u0144\u013f\3\2\2\2\u0144\u0143\3\2\2\2\u0145\65"+
		"\3\2\2\2\31BT^iuw\u0089\u008b\u0097\u0099\u00ab\u00ad\u00c1\u00cb\u00d6"+
		"\u00e5\u00ed\u00f8\u0100\u010a\u0110\u011c\u0144";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}