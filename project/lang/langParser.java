// Generated from project/lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class langParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9,
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17,
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24,
		T__24=25, T__25=26, T__26=27, VAR=28, NUM=29, CHAR=30;
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_declare = 2, RULE_bind = 3, RULE_remove = 4,
		RULE_add = 5, RULE_expr = 6, RULE_set_expr = 7, RULE_edge_expr = 8, RULE_regexp = 9,
		RULE_range = 10, RULE_select = 11, RULE_v_filter = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmt", "declare", "bind", "remove", "add", "expr", "set_expr",
			"edge_expr", "regexp", "range", "select", "v_filter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'is'", "'graph'", "'='", "'remove'", "'vertex'", "'edge'",
			"'vertices'", "'from'", "'add'", "'to'", "'['", "','", "']'", "'('",
			"')'", "'|'", "'^'", "'.'", "'&'", "'..'", "'return'", "'where'", "'reachable'",
			"'in'", "'by'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, "VAR", "NUM", "CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public langParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1058L) != 0)) {
				{
				{
				setState(26);
				stmt();
				}
				}
				setState(31);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public BindContext bind() {
			return getRuleContext(BindContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public RemoveContext remove() {
			return getRuleContext(RemoveContext.class,0);
		}
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				bind();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				add();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				remove();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				declare();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(langParser.VAR, 0); }
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitDeclare(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(39);
			match(VAR);
			setState(40);
			match(T__1);
			setState(41);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BindContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(langParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterBind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitBind(this);
		}
	}

	public final BindContext bind() throws RecognitionException {
		BindContext _localctx = new BindContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			match(VAR);
			setState(45);
			match(T__3);
			setState(46);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RemoveContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode VAR() { return getToken(langParser.VAR, 0); }
		public RemoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitRemove(this);
		}
	}

	public final RemoveContext remove() throws RecognitionException {
		RemoveContext _localctx = new RemoveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_remove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__4);
			setState(49);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(50);
			expr();
			setState(51);
			match(T__8);
			setState(52);
			match(VAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode VAR() { return getToken(langParser.VAR, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitAdd(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__9);
			setState(55);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(56);
			expr();
			setState(57);
			match(T__10);
			setState(58);
			match(VAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(langParser.NUM, 0); }
		public TerminalNode CHAR() { return getToken(langParser.CHAR, 0); }
		public TerminalNode VAR() { return getToken(langParser.VAR, 0); }
		public Edge_exprContext edge_expr() {
			return getRuleContext(Edge_exprContext.class,0);
		}
		public Set_exprContext set_expr() {
			return getRuleContext(Set_exprContext.class,0);
		}
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(CHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(VAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				edge_expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				set_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				regexp(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				select();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Set_exprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Set_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterSet_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitSet_expr(this);
		}
	}

	public final Set_exprContext set_expr() throws RecognitionException {
		Set_exprContext _localctx = new Set_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_set_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__11);
			setState(70);
			expr();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(71);
				match(T__12);
				setState(72);
				expr();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(T__13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Edge_exprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Edge_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterEdge_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitEdge_expr(this);
		}
	}

	public final Edge_exprContext edge_expr() throws RecognitionException {
		Edge_exprContext _localctx = new Edge_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_edge_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__14);
			setState(81);
			expr();
			setState(82);
			match(T__12);
			setState(83);
			expr();
			setState(84);
			match(T__12);
			setState(85);
			expr();
			setState(86);
			match(T__15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RegexpContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(langParser.CHAR, 0); }
		public TerminalNode VAR() { return getToken(langParser.VAR, 0); }
		public List<RegexpContext> regexp() {
			return getRuleContexts(RegexpContext.class);
		}
		public RegexpContext regexp(int i) {
			return getRuleContext(RegexpContext.class,i);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public RegexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterRegexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitRegexp(this);
		}
	}

	public final RegexpContext regexp() throws RecognitionException {
		return regexp(0);
	}

	private RegexpContext regexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RegexpContext _localctx = new RegexpContext(_ctx, _parentState);
		RegexpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_regexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				{
				setState(89);
				match(CHAR);
				}
				break;
			case VAR:
				{
				setState(90);
				match(VAR);
				}
				break;
			case T__14:
				{
				setState(91);
				match(T__14);
				setState(92);
				regexp(0);
				setState(93);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new RegexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_regexp);
						setState(97);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(98);
						match(T__16);
						setState(99);
						regexp(5);
						}
						break;
					case 2:
						{
						_localctx = new RegexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_regexp);
						setState(100);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(101);
						match(T__18);
						setState(102);
						regexp(3);
						}
						break;
					case 3:
						{
						_localctx = new RegexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_regexp);
						setState(103);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(104);
						match(T__19);
						setState(105);
						regexp(2);
						}
						break;
					case 4:
						{
						_localctx = new RegexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_regexp);
						setState(106);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(107);
						match(T__17);
						setState(108);
						range();
						}
						break;
					}
					}
				}
				setState(113);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RangeContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(langParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(langParser.NUM, i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__11);
			setState(115);
			match(NUM);
			setState(116);
			match(T__20);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(117);
				match(NUM);
				}
			}

			setState(120);
			match(T__13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(langParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(langParser.VAR, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<V_filterContext> v_filter() {
			return getRuleContexts(V_filterContext.class);
		}
		public V_filterContext v_filter(int i) {
			return getRuleContext(V_filterContext.class,i);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitSelect(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(122);
				v_filter();
				}
				break;
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(125);
				v_filter();
				}
			}

			setState(128);
			match(T__21);
			setState(129);
			match(VAR);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(130);
				match(T__12);
				setState(131);
				match(VAR);
				}
			}

			setState(134);
			match(T__22);
			setState(135);
			match(VAR);
			setState(136);
			match(T__23);
			setState(137);
			match(T__8);
			setState(138);
			match(VAR);
			setState(139);
			match(T__24);
			setState(140);
			match(VAR);
			setState(141);
			match(T__25);
			setState(142);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class V_filterContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(langParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public V_filterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterV_filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitV_filter(this);
		}
	}

	public final V_filterContext v_filter() throws RecognitionException {
		V_filterContext _localctx = new V_filterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_v_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__26);
			setState(145);
			match(VAR);
			setState(146);
			match(T__24);
			setState(147);
			expr();
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
		case 9:
			return regexp_sempred((RegexpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean regexp_sempred(RegexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u0096\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000"+
		"\u001f\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006D\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007J\b\u0007\n\u0007\f\u0007M\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t`\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\tn\b\t\n\t\f\tq\t\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\nw\b\n\u0001\n\u0001\n\u0001\u000b\u0003\u000b|\b\u000b\u0001"+
		"\u000b\u0003\u000b\u007f\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0085\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0001\u0012"+
		"\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000"+
		"\u0002\u0001\u0000\u0006\b\u0001\u0000\u0006\u0007\u009d\u0000\u001d\u0001"+
		"\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004&\u0001\u0000\u0000"+
		"\u0000\u0006+\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000\u0000\n6\u0001"+
		"\u0000\u0000\u0000\fC\u0001\u0000\u0000\u0000\u000eE\u0001\u0000\u0000"+
		"\u0000\u0010P\u0001\u0000\u0000\u0000\u0012_\u0001\u0000\u0000\u0000\u0014"+
		"r\u0001\u0000\u0000\u0000\u0016{\u0001\u0000\u0000\u0000\u0018\u0090\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0001\u0001"+
		"\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 %\u0003\u0006\u0003"+
		"\u0000!%\u0003\n\u0005\u0000\"%\u0003\b\u0004\u0000#%\u0003\u0004\u0002"+
		"\u0000$ \u0001\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000\u0000"+
		"&\'\u0005\u0001\u0000\u0000\'(\u0005\u001c\u0000\u0000()\u0005\u0002\u0000"+
		"\u0000)*\u0005\u0003\u0000\u0000*\u0005\u0001\u0000\u0000\u0000+,\u0005"+
		"\u0001\u0000\u0000,-\u0005\u001c\u0000\u0000-.\u0005\u0004\u0000\u0000"+
		"./\u0003\f\u0006\u0000/\u0007\u0001\u0000\u0000\u000001\u0005\u0005\u0000"+
		"\u000012\u0007\u0000\u0000\u000023\u0003\f\u0006\u000034\u0005\t\u0000"+
		"\u000045\u0005\u001c\u0000\u00005\t\u0001\u0000\u0000\u000067\u0005\n"+
		"\u0000\u000078\u0007\u0001\u0000\u000089\u0003\f\u0006\u00009:\u0005\u000b"+
		"\u0000\u0000:;\u0005\u001c\u0000\u0000;\u000b\u0001\u0000\u0000\u0000"+
		"<D\u0005\u001d\u0000\u0000=D\u0005\u001e\u0000\u0000>D\u0005\u001c\u0000"+
		"\u0000?D\u0003\u0010\b\u0000@D\u0003\u000e\u0007\u0000AD\u0003\u0012\t"+
		"\u0000BD\u0003\u0016\u000b\u0000C<\u0001\u0000\u0000\u0000C=\u0001\u0000"+
		"\u0000\u0000C>\u0001\u0000\u0000\u0000C?\u0001\u0000\u0000\u0000C@\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"D\r\u0001\u0000\u0000\u0000EF\u0005\f\u0000\u0000FK\u0003\f\u0006\u0000"+
		"GH\u0005\r\u0000\u0000HJ\u0003\f\u0006\u0000IG\u0001\u0000\u0000\u0000"+
		"JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NO\u0005\u000e"+
		"\u0000\u0000O\u000f\u0001\u0000\u0000\u0000PQ\u0005\u000f\u0000\u0000"+
		"QR\u0003\f\u0006\u0000RS\u0005\r\u0000\u0000ST\u0003\f\u0006\u0000TU\u0005"+
		"\r\u0000\u0000UV\u0003\f\u0006\u0000VW\u0005\u0010\u0000\u0000W\u0011"+
		"\u0001\u0000\u0000\u0000XY\u0006\t\uffff\uffff\u0000Y`\u0005\u001e\u0000"+
		"\u0000Z`\u0005\u001c\u0000\u0000[\\\u0005\u000f\u0000\u0000\\]\u0003\u0012"+
		"\t\u0000]^\u0005\u0010\u0000\u0000^`\u0001\u0000\u0000\u0000_X\u0001\u0000"+
		"\u0000\u0000_Z\u0001\u0000\u0000\u0000_[\u0001\u0000\u0000\u0000`o\u0001"+
		"\u0000\u0000\u0000ab\n\u0004\u0000\u0000bc\u0005\u0011\u0000\u0000cn\u0003"+
		"\u0012\t\u0005de\n\u0002\u0000\u0000ef\u0005\u0013\u0000\u0000fn\u0003"+
		"\u0012\t\u0003gh\n\u0001\u0000\u0000hi\u0005\u0014\u0000\u0000in\u0003"+
		"\u0012\t\u0002jk\n\u0003\u0000\u0000kl\u0005\u0012\u0000\u0000ln\u0003"+
		"\u0014\n\u0000ma\u0001\u0000\u0000\u0000md\u0001\u0000\u0000\u0000mg\u0001"+
		"\u0000\u0000\u0000mj\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u0013\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000rs\u0005\f\u0000\u0000st\u0005\u001d"+
		"\u0000\u0000tv\u0005\u0015\u0000\u0000uw\u0005\u001d\u0000\u0000vu\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xy\u0005\u000e\u0000\u0000y\u0015\u0001\u0000\u0000\u0000z|\u0003\u0018"+
		"\f\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000"+
		"\u0000\u0000}\u007f\u0003\u0018\f\u0000~}\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u0016\u0000\u0000\u0081\u0084\u0005\u001c\u0000\u0000\u0082\u0083"+
		"\u0005\r\u0000\u0000\u0083\u0085\u0005\u001c\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005\u0017\u0000\u0000\u0087\u0088\u0005"+
		"\u001c\u0000\u0000\u0088\u0089\u0005\u0018\u0000\u0000\u0089\u008a\u0005"+
		"\t\u0000\u0000\u008a\u008b\u0005\u001c\u0000\u0000\u008b\u008c\u0005\u0019"+
		"\u0000\u0000\u008c\u008d\u0005\u001c\u0000\u0000\u008d\u008e\u0005\u001a"+
		"\u0000\u0000\u008e\u008f\u0003\f\u0006\u0000\u008f\u0017\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005\u001b\u0000\u0000\u0091\u0092\u0005\u001c\u0000"+
		"\u0000\u0092\u0093\u0005\u0019\u0000\u0000\u0093\u0094\u0003\f\u0006\u0000"+
		"\u0094\u0019\u0001\u0000\u0000\u0000\u000b\u001d$CK_mov{~\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
