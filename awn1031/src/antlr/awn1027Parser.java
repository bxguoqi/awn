// Generated from F:\Fpaper\awn1027.g4 by ANTLR 4.1
package antlr;
 


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class awn1027Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DATA=2, IF=3, ELSE=4, ELSEIF=5, ENDIF=6, INT=7, IP=8, BOOL=9, 
		VOID=10, IN=11, FORALL=12, SETOF=13, EVENT=14, EVENTT=15, PI=16, UPDATE=17, 
		UNICAST=18, BROADCAST=19, GROUPCAST=20, PARCOM=21, ARR=22, SEG=23, AND=24, 
		OR=25, PLU=26, SUB=27, MUL=28, DIV=29, ASS=30, EQ=31, LE=32, MO=33, NOTLE=34, 
		NOTMO=35, NOTEQ=36, NOT=37, NEG=38, LB=39, RB=40, LBB=41, RBB=42, LBBB=43, 
		RBBB=44, CO=45, ST=46, SE=47, ID=48, NUMBER=49, WS=50;
	public static final String[] tokenNames = {
		"<INVALID>", "'$'", "'data'", "'if'", "'else'", "'elseif'", "'endif'", 
		"'int'", "'ip'", "'bool'", "'void'", "'in'", "'forall'", "'setof'", "'<event>'", 
		"'</event>'", "'pi'", "'update'", "'unicast'", "'broadcast'", "'groupcast'", 
		"'|||'", "'->'", "'|'", "'&&'", "'||'", "'+'", "SUB", "'*'", "'/'", "'='", 
		"'=='", "'<'", "'>'", "'>='", "'<='", "'!='", "'!'", "NEG", "'('", "')'", 
		"'['", "']'", "'{'", "'}'", "','", "'.'", "';'", "ID", "NUMBER", "WS"
	};
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_processDef = 2, RULE_processTitle = 3, 
		RULE_eventExpr = 4, RULE_funcBlock = 5, RULE_type = 6, RULE_setName = 7, 
		RULE_typeName = 8, RULE_funcdefine = 9, RULE_paramDeclList = 10, RULE_paramDecl = 11, 
		RULE_block = 12, RULE_stmtList = 13, RULE_stmt = 14, RULE_setdefine = 15, 
		RULE_column = 16, RULE_ifStmt = 17, RULE_expr = 18, RULE_orExpr = 19, 
		RULE_andExpr = 20, RULE_equalityExpr = 21, RULE_comparisonExpr = 22, RULE_additiveExpr = 23, 
		RULE_multExpr = 24, RULE_notExpr = 25, RULE_negationExpr = 26, RULE_atom = 27, 
		RULE_var = 28, RULE_funcCall = 29, RULE_wsnFuncCall = 30, RULE_wsnEvent = 31, 
		RULE_paramList = 32;
	public static final String[] ruleNames = {
		"start", "program", "processDef", "processTitle", "eventExpr", "funcBlock", 
		"type", "setName", "typeName", "funcdefine", "paramDeclList", "paramDecl", 
		"block", "stmtList", "stmt", "setdefine", "column", "ifStmt", "expr", 
		"orExpr", "andExpr", "equalityExpr", "comparisonExpr", "additiveExpr", 
		"multExpr", "notExpr", "negationExpr", "atom", "var", "funcCall", "wsnFuncCall", 
		"wsnEvent", "paramList"
	};

	@Override
	public String getGrammarFileName() { return "awn1027.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }




	public awn1027Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); program();
			setState(67); match(1);
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

	public static class ProgramContext extends ParserRuleContext {
		public List<FuncdefineContext> funcdefine() {
			return getRuleContexts(FuncdefineContext.class);
		}
		public List<ProcessDefContext> processDef() {
			return getRuleContexts(ProcessDefContext.class);
		}
		public FuncdefineContext funcdefine(int i) {
			return getRuleContext(FuncdefineContext.class,i);
		}
		public ProcessDefContext processDef(int i) {
			return getRuleContext(ProcessDefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(69); processDef();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(72); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATA) | (1L << INT) | (1L << IP) | (1L << BOOL) | (1L << VOID) | (1L << SETOF) | (1L << ID))) != 0)) {
				{
				{
				setState(74); funcdefine();
				}
				}
				setState(79);
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

	public static class ProcessDefContext extends ParserRuleContext {
		public ProcessTitleContext processTitle() {
			return getRuleContext(ProcessTitleContext.class,0);
		}
		public TerminalNode ASS() { return getToken(awn1027Parser.ASS, 0); }
		public EventExprContext eventExpr() {
			return getRuleContext(EventExprContext.class,0);
		}
		public ProcessDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterProcessDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitProcessDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitProcessDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessDefContext processDef() throws RecognitionException {
		ProcessDefContext _localctx = new ProcessDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_processDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); processTitle();
			setState(81); match(ASS);
			setState(82); eventExpr(0);
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

	public static class ProcessTitleContext extends ParserRuleContext {
		public ProcessTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processTitle; }
	 
		public ProcessTitleContext() { }
		public void copyFrom(ProcessTitleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProcessTitle2Context extends ProcessTitleContext {
		public WsnEventContext wsnEvent() {
			return getRuleContext(WsnEventContext.class,0);
		}
		public ProcessTitle2Context(ProcessTitleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterProcessTitle2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitProcessTitle2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitProcessTitle2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProcessTitle1Context extends ProcessTitleContext {
		public TerminalNode LB() { return getToken(awn1027Parser.LB, 0); }
		public TerminalNode RB() { return getToken(awn1027Parser.RB, 0); }
		public TerminalNode ID() { return getToken(awn1027Parser.ID, 0); }
		public ProcessTitle1Context(ProcessTitleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterProcessTitle1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitProcessTitle1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitProcessTitle1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessTitleContext processTitle() throws RecognitionException {
		ProcessTitleContext _localctx = new ProcessTitleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_processTitle);
		try {
			setState(88);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ProcessTitle1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84); match(ID);
				setState(85); match(LB);
				setState(86); match(RB);
				}
				break;
			case UNICAST:
			case BROADCAST:
			case GROUPCAST:
				_localctx = new ProcessTitle2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87); wsnEvent();
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

	public static class EventExprContext extends ParserRuleContext {
		public int _p;
		public EventExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EventExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_eventExpr; }
	 
		public EventExprContext() { }
		public void copyFrom(EventExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class EventExpr3Context extends EventExprContext {
		public TerminalNode RBB() { return getToken(awn1027Parser.RBB, 0); }
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public TerminalNode LBB() { return getToken(awn1027Parser.LBB, 0); }
		public EventExprContext eventExpr() {
			return getRuleContext(EventExprContext.class,0);
		}
		public EventExpr3Context(EventExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterEventExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitEventExpr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitEventExpr3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EventExpr4Context extends EventExprContext {
		public EventExprContext eventExpr(int i) {
			return getRuleContext(EventExprContext.class,i);
		}
		public TerminalNode PARCOM() { return getToken(awn1027Parser.PARCOM, 0); }
		public List<EventExprContext> eventExpr() {
			return getRuleContexts(EventExprContext.class);
		}
		public EventExpr4Context(EventExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterEventExpr4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitEventExpr4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitEventExpr4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EventExpr5Context extends EventExprContext {
		public ProcessTitleContext processTitle() {
			return getRuleContext(ProcessTitleContext.class,0);
		}
		public EventExpr5Context(EventExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterEventExpr5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitEventExpr5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitEventExpr5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EventExpr1Context extends EventExprContext {
		public TerminalNode RBBB() { return getToken(awn1027Parser.RBBB, 0); }
		public TerminalNode LBBB() { return getToken(awn1027Parser.LBBB, 0); }
		public FuncBlockContext funcBlock() {
			return getRuleContext(FuncBlockContext.class,0);
		}
		public EventExpr1Context(EventExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterEventExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitEventExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitEventExpr1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EventExpr2Context extends EventExprContext {
		public TerminalNode ARR() { return getToken(awn1027Parser.ARR, 0); }
		public EventExprContext eventExpr(int i) {
			return getRuleContext(EventExprContext.class,i);
		}
		public List<EventExprContext> eventExpr() {
			return getRuleContexts(EventExprContext.class);
		}
		public EventExpr2Context(EventExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterEventExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitEventExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitEventExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventExprContext eventExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EventExprContext _localctx = new EventExprContext(_ctx, _parentState, _p);
		EventExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, RULE_eventExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			switch (_input.LA(1)) {
			case LBB:
				{
				_localctx = new EventExpr3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(91); match(LBB);
				setState(92); orExpr();
				setState(93); match(RBB);
				setState(94); eventExpr(3);
				}
				break;
			case LBBB:
				{
				_localctx = new EventExpr1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96); match(LBBB);
				setState(97); funcBlock();
				setState(98); match(RBBB);
				}
				break;
			case UNICAST:
			case BROADCAST:
			case GROUPCAST:
			case ID:
				{
				_localctx = new EventExpr5Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100); processTitle();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new EventExpr2Context(new EventExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_eventExpr);
						setState(103);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(104); match(ARR);
						setState(105); eventExpr(5);
						}
						break;

					case 2:
						{
						_localctx = new EventExpr4Context(new EventExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_eventExpr);
						setState(106);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(107); match(PARCOM);
						setState(108); eventExpr(3);
						}
						break;
					}
					} 
				}
				setState(113);
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

	public static class FuncBlockContext extends ParserRuleContext {
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public FuncBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterFuncBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitFuncBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitFuncBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncBlockContext funcBlock() throws RecognitionException {
		FuncBlockContext _localctx = new FuncBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); stmtList();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Type1Context extends TypeContext {
		public SetNameContext setName() {
			return getRuleContext(SetNameContext.class,0);
		}
		public Type1Context(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterType1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitType1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitType1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type2Context extends TypeContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public Type2Context(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterType2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitType2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitType2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(118);
			switch (_input.LA(1)) {
			case SETOF:
				_localctx = new Type1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116); setName();
				}
				break;
			case DATA:
			case INT:
			case IP:
			case BOOL:
			case VOID:
			case ID:
				_localctx = new Type2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117); typeName();
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

	public static class SetNameContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode SETOF() { return getToken(awn1027Parser.SETOF, 0); }
		public SetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterSetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitSetName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitSetName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetNameContext setName() throws RecognitionException {
		SetNameContext _localctx = new SetNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(SETOF);
			setState(121); typeName();
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

	public static class TypeNameContext extends ParserRuleContext {
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	 
		public TypeNameContext() { }
		public void copyFrom(TypeNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeName5Context extends TypeNameContext {
		public TerminalNode DATA() { return getToken(awn1027Parser.DATA, 0); }
		public TypeName5Context(TypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterTypeName5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitTypeName5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitTypeName5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeName6Context extends TypeNameContext {
		public TerminalNode VOID() { return getToken(awn1027Parser.VOID, 0); }
		public TypeName6Context(TypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterTypeName6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitTypeName6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitTypeName6(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeName4Context extends TypeNameContext {
		public TerminalNode ID() { return getToken(awn1027Parser.ID, 0); }
		public TypeName4Context(TypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterTypeName4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitTypeName4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitTypeName4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeName3Context extends TypeNameContext {
		public TerminalNode BOOL() { return getToken(awn1027Parser.BOOL, 0); }
		public TypeName3Context(TypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterTypeName3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitTypeName3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitTypeName3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeName2Context extends TypeNameContext {
		public TerminalNode IP() { return getToken(awn1027Parser.IP, 0); }
		public TypeName2Context(TypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterTypeName2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitTypeName2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitTypeName2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeName1Context extends TypeNameContext {
		public TerminalNode INT() { return getToken(awn1027Parser.INT, 0); }
		public TypeName1Context(TypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterTypeName1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitTypeName1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitTypeName1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeName);
		try {
			setState(129);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new TypeName1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123); match(INT);
				}
				break;
			case IP:
				_localctx = new TypeName2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124); match(IP);
				}
				break;
			case BOOL:
				_localctx = new TypeName3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125); match(BOOL);
				}
				break;
			case ID:
				_localctx = new TypeName4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(126); match(ID);
				}
				break;
			case DATA:
				_localctx = new TypeName5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(127); match(DATA);
				}
				break;
			case VOID:
				_localctx = new TypeName6Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(128); match(VOID);
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

	public static class FuncdefineContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(awn1027Parser.LB, 0); }
		public TerminalNode RB() { return getToken(awn1027Parser.RB, 0); }
		public TerminalNode ID() { return getToken(awn1027Parser.ID, 0); }
		public ParamDeclListContext paramDeclList() {
			return getRuleContext(ParamDeclListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncdefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterFuncdefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitFuncdefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitFuncdefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefineContext funcdefine() throws RecognitionException {
		FuncdefineContext _localctx = new FuncdefineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcdefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); type();
			setState(132); match(ID);
			setState(133); match(LB);
			setState(134); paramDeclList();
			setState(135); match(RB);
			setState(136); block();
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

	public static class ParamDeclListContext extends ParserRuleContext {
		public TerminalNode CO(int i) {
			return getToken(awn1027Parser.CO, i);
		}
		public List<TerminalNode> CO() { return getTokens(awn1027Parser.CO); }
		public ParamDeclContext paramDecl(int i) {
			return getRuleContext(ParamDeclContext.class,i);
		}
		public List<ParamDeclContext> paramDecl() {
			return getRuleContexts(ParamDeclContext.class);
		}
		public ParamDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDeclList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterParamDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitParamDeclList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitParamDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamDeclListContext paramDeclList() throws RecognitionException {
		ParamDeclListContext _localctx = new ParamDeclListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_paramDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATA) | (1L << INT) | (1L << IP) | (1L << BOOL) | (1L << VOID) | (1L << SETOF) | (1L << ID))) != 0)) {
				{
				setState(138); paramDecl();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CO) {
					{
					{
					setState(139); match(CO);
					setState(140); paramDecl();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class ParamDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(awn1027Parser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterParamDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitParamDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitParamDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamDeclContext paramDecl() throws RecognitionException {
		ParamDeclContext _localctx = new ParamDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_paramDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); type();
			setState(149); match(ID);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode RBBB() { return getToken(awn1027Parser.RBBB, 0); }
		public TerminalNode LBBB() { return getToken(awn1027Parser.LBBB, 0); }
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(LBBB);
			setState(152); stmtList();
			setState(153); match(RBBB);
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

	public static class StmtListContext extends ParserRuleContext {
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterStmtList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitStmtList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitStmtList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtListContext stmtList() throws RecognitionException {
		StmtListContext _localctx = new StmtListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stmtList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FORALL) | (1L << EVENT) | (1L << PI) | (1L << UPDATE) | (1L << NOT) | (1L << NEG) | (1L << LB) | (1L << LBBB) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(155); stmt();
				}
				}
				setState(160);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Stmt6Context extends StmtContext {
		public TerminalNode EVENTT() { return getToken(awn1027Parser.EVENTT, 0); }
		public TerminalNode EVENT() { return getToken(awn1027Parser.EVENT, 0); }
		public EventExprContext eventExpr() {
			return getRuleContext(EventExprContext.class,0);
		}
		public Stmt6Context(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterStmt6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitStmt6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitStmt6(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stmt4Context extends StmtContext {
		public TerminalNode SE() { return getToken(awn1027Parser.SE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stmt4Context(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterStmt4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitStmt4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitStmt4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stmt5Context extends StmtContext {
		public SetdefineContext setdefine() {
			return getRuleContext(SetdefineContext.class,0);
		}
		public Stmt5Context(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterStmt5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitStmt5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitStmt5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stmt2Context extends StmtContext {
		public TerminalNode IN() { return getToken(awn1027Parser.IN, 0); }
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FORALL() { return getToken(awn1027Parser.FORALL, 0); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public Stmt2Context(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterStmt2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitStmt2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitStmt2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stmt3Context extends StmtContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Stmt3Context(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterStmt3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitStmt3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitStmt3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stmt1Context extends StmtContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public Stmt1Context(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterStmt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitStmt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitStmt1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmt);
		try {
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Stmt1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161); ifStmt();
				}
				break;

			case 2:
				_localctx = new Stmt2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(162); match(FORALL);
				setState(163); atom(0);
				setState(164); match(IN);
				setState(165); atom(0);
				setState(166); block();
				}
				break;

			case 3:
				_localctx = new Stmt3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168); block();
				}
				break;

			case 4:
				_localctx = new Stmt4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(169); expr();
				setState(170); match(SE);
				}
				break;

			case 5:
				_localctx = new Stmt5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(172); setdefine();
				}
				break;

			case 6:
				_localctx = new Stmt6Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(173); match(EVENT);
				setState(174); eventExpr(0);
				setState(175); match(EVENTT);
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

	public static class SetdefineContext extends ParserRuleContext {
		public TerminalNode RBBB() { return getToken(awn1027Parser.RBBB, 0); }
		public TerminalNode SEG() { return getToken(awn1027Parser.SEG, 0); }
		public TerminalNode ID() { return getToken(awn1027Parser.ID, 0); }
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public TerminalNode LBBB() { return getToken(awn1027Parser.LBBB, 0); }
		public TerminalNode ASS() { return getToken(awn1027Parser.ASS, 0); }
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public SetdefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setdefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterSetdefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitSetdefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitSetdefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetdefineContext setdefine() throws RecognitionException {
		SetdefineContext _localctx = new SetdefineContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_setdefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); match(ID);
			setState(180); match(ASS);
			setState(181); match(LBBB);
			setState(182); column();
			setState(183); match(SEG);
			setState(184); orExpr();
			setState(185); match(RBBB);
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

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode CO(int i) {
			return getToken(awn1027Parser.CO, i);
		}
		public TerminalNode LB() { return getToken(awn1027Parser.LB, 0); }
		public List<TerminalNode> CO() { return getTokens(awn1027Parser.CO); }
		public ParamDeclContext paramDecl(int i) {
			return getRuleContext(ParamDeclContext.class,i);
		}
		public TerminalNode RB() { return getToken(awn1027Parser.RB, 0); }
		public List<ParamDeclContext> paramDecl() {
			return getRuleContexts(ParamDeclContext.class);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); match(LB);
			setState(188); paramDecl();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CO) {
				{
				{
				setState(189); match(CO);
				setState(190); paramDecl();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196); match(RB);
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode RB(int i) {
			return getToken(awn1027Parser.RB, i);
		}
		public TerminalNode IF() { return getToken(awn1027Parser.IF, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> LB() { return getTokens(awn1027Parser.LB); }
		public List<TerminalNode> ELSEIF() { return getTokens(awn1027Parser.ELSEIF); }
		public TerminalNode LB(int i) {
			return getToken(awn1027Parser.LB, i);
		}
		public TerminalNode ELSE() { return getToken(awn1027Parser.ELSE, 0); }
		public List<TerminalNode> RB() { return getTokens(awn1027Parser.RB); }
		public List<OrExprContext> orExpr() {
			return getRuleContexts(OrExprContext.class);
		}
		public TerminalNode ENDIF() { return getToken(awn1027Parser.ENDIF, 0); }
		public TerminalNode ELSEIF(int i) {
			return getToken(awn1027Parser.ELSEIF, i);
		}
		public OrExprContext orExpr(int i) {
			return getRuleContext(OrExprContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); match(IF);
			setState(199); match(LB);
			setState(200); orExpr();
			setState(201); match(RB);
			setState(202); stmt();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(203); match(ELSEIF);
				setState(204); match(LB);
				setState(205); orExpr();
				setState(206); match(RB);
				setState(207); stmt();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(214); match(ELSE);
				setState(215); stmt();
				}
			}

			setState(218); match(ENDIF);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expr1Context extends ExprContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public Expr1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitExpr1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr2Context extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASS() { return getToken(awn1027Parser.ASS, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Expr2Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr);
		try {
			setState(225);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new Expr1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220); orExpr();
				}
				break;

			case 2:
				_localctx = new Expr2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221); atom(0);
				setState(222); match(ASS);
				setState(223); expr();
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

	public static class OrExprContext extends ParserRuleContext {
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public List<TerminalNode> OR() { return getTokens(awn1027Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(awn1027Parser.OR, i);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); andExpr();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(228); match(OR);
				setState(229); andExpr();
				}
				}
				setState(234);
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

	public static class AndExprContext extends ParserRuleContext {
		public EqualityExprContext equalityExpr(int i) {
			return getRuleContext(EqualityExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(awn1027Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(awn1027Parser.AND, i);
		}
		public List<EqualityExprContext> equalityExpr() {
			return getRuleContexts(EqualityExprContext.class);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); equalityExpr();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(236); match(AND);
				setState(237); equalityExpr();
				}
				}
				setState(242);
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

	public static class EqualityExprContext extends ParserRuleContext {
		public EqualityExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpr; }
	 
		public EqualityExprContext() { }
		public void copyFrom(EqualityExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualityExpr3Context extends EqualityExprContext {
		public List<ComparisonExprContext> comparisonExpr() {
			return getRuleContexts(ComparisonExprContext.class);
		}
		public ComparisonExprContext comparisonExpr(int i) {
			return getRuleContext(ComparisonExprContext.class,i);
		}
		public TerminalNode NOTEQ() { return getToken(awn1027Parser.NOTEQ, 0); }
		public EqualityExpr3Context(EqualityExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterEqualityExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitEqualityExpr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitEqualityExpr3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExpr1Context extends EqualityExprContext {
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public EqualityExpr1Context(EqualityExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterEqualityExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitEqualityExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitEqualityExpr1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExpr2Context extends EqualityExprContext {
		public List<ComparisonExprContext> comparisonExpr() {
			return getRuleContexts(ComparisonExprContext.class);
		}
		public ComparisonExprContext comparisonExpr(int i) {
			return getRuleContext(ComparisonExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(awn1027Parser.EQ, 0); }
		public EqualityExpr2Context(EqualityExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterEqualityExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitEqualityExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitEqualityExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExprContext equalityExpr() throws RecognitionException {
		EqualityExprContext _localctx = new EqualityExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_equalityExpr);
		try {
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new EqualityExpr1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(243); comparisonExpr();
				}
				break;

			case 2:
				_localctx = new EqualityExpr2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(244); comparisonExpr();
				setState(245); match(EQ);
				setState(246); comparisonExpr();
				}
				break;

			case 3:
				_localctx = new EqualityExpr3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(248); comparisonExpr();
				setState(249); match(NOTEQ);
				setState(250); comparisonExpr();
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

	public static class ComparisonExprContext extends ParserRuleContext {
		public ComparisonExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpr; }
	 
		public ComparisonExprContext() { }
		public void copyFrom(ComparisonExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonExpr1Context extends ComparisonExprContext {
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public ComparisonExpr1Context(ComparisonExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterComparisonExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitComparisonExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitComparisonExpr1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpr5Context extends ComparisonExprContext {
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public TerminalNode NOTMO() { return getToken(awn1027Parser.NOTMO, 0); }
		public ComparisonExpr5Context(ComparisonExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterComparisonExpr5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitComparisonExpr5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitComparisonExpr5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpr4Context extends ComparisonExprContext {
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public TerminalNode NOTLE() { return getToken(awn1027Parser.NOTLE, 0); }
		public ComparisonExpr4Context(ComparisonExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterComparisonExpr4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitComparisonExpr4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitComparisonExpr4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpr3Context extends ComparisonExprContext {
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public TerminalNode MO() { return getToken(awn1027Parser.MO, 0); }
		public ComparisonExpr3Context(ComparisonExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterComparisonExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitComparisonExpr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitComparisonExpr3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpr2Context extends ComparisonExprContext {
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public TerminalNode LE() { return getToken(awn1027Parser.LE, 0); }
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public ComparisonExpr2Context(ComparisonExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterComparisonExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitComparisonExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitComparisonExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_comparisonExpr);
		try {
			setState(271);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ComparisonExpr1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(254); additiveExpr(0);
				}
				break;

			case 2:
				_localctx = new ComparisonExpr2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(255); additiveExpr(0);
				setState(256); match(LE);
				setState(257); additiveExpr(0);
				}
				break;

			case 3:
				_localctx = new ComparisonExpr3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(259); additiveExpr(0);
				setState(260); match(MO);
				setState(261); additiveExpr(0);
				}
				break;

			case 4:
				_localctx = new ComparisonExpr4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(263); additiveExpr(0);
				setState(264); match(NOTLE);
				setState(265); additiveExpr(0);
				}
				break;

			case 5:
				_localctx = new ComparisonExpr5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(267); additiveExpr(0);
				setState(268); match(NOTMO);
				setState(269); additiveExpr(0);
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

	public static class AdditiveExprContext extends ParserRuleContext {
		public int _p;
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AdditiveExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
	 
		public AdditiveExprContext() { }
		public void copyFrom(AdditiveExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class AdditiveExpr1Context extends AdditiveExprContext {
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public AdditiveExpr1Context(AdditiveExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterAdditiveExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitAdditiveExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitAdditiveExpr1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExpr2Context extends AdditiveExprContext {
		public TerminalNode PLU() { return getToken(awn1027Parser.PLU, 0); }
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public AdditiveExpr2Context(AdditiveExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterAdditiveExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitAdditiveExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitAdditiveExpr2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExpr3Context extends AdditiveExprContext {
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(awn1027Parser.SUB, 0); }
		public AdditiveExpr3Context(AdditiveExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterAdditiveExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitAdditiveExpr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitAdditiveExpr3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExprContext additiveExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, _parentState, _p);
		AdditiveExprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, RULE_additiveExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AdditiveExpr1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(274); multExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(282);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpr2Context(new AdditiveExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpr);
						setState(276);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(277); match(PLU);
						setState(278); multExpr(0);
						}
						break;

					case 2:
						{
						_localctx = new AdditiveExpr3Context(new AdditiveExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpr);
						setState(279);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(280); match(SUB);
						setState(281); multExpr(0);
						}
						break;
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class MultExprContext extends ParserRuleContext {
		public int _p;
		public MultExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MultExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	 
		public MultExprContext() { }
		public void copyFrom(MultExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class MultExpr2Context extends MultExprContext {
		public TerminalNode MUL() { return getToken(awn1027Parser.MUL, 0); }
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public MultExpr2Context(MultExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterMultExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitMultExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitMultExpr2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExpr1Context extends MultExprContext {
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public MultExpr1Context(MultExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterMultExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitMultExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitMultExpr1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExpr3Context extends MultExprContext {
		public TerminalNode DIV() { return getToken(awn1027Parser.DIV, 0); }
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public MultExpr3Context(MultExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterMultExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitMultExpr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitMultExpr3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExprContext multExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultExprContext _localctx = new MultExprContext(_ctx, _parentState, _p);
		MultExprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, RULE_multExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MultExpr1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(288); notExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(296);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MultExpr2Context(new MultExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_multExpr);
						setState(290);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(291); match(MUL);
						setState(292); notExpr();
						}
						break;

					case 2:
						{
						_localctx = new MultExpr3Context(new MultExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_multExpr);
						setState(293);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(294); match(DIV);
						setState(295); notExpr();
						}
						break;
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public NotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpr; }
	 
		public NotExprContext() { }
		public void copyFrom(NotExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotExpr1Context extends NotExprContext {
		public NegationExprContext negationExpr() {
			return getRuleContext(NegationExprContext.class,0);
		}
		public NotExpr1Context(NotExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterNotExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitNotExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitNotExpr1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpr2Context extends NotExprContext {
		public NegationExprContext negationExpr() {
			return getRuleContext(NegationExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(awn1027Parser.NOT, 0); }
		public NotExpr2Context(NotExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterNotExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitNotExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitNotExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExprContext notExpr() throws RecognitionException {
		NotExprContext _localctx = new NotExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_notExpr);
		try {
			setState(304);
			switch (_input.LA(1)) {
			case PI:
			case UPDATE:
			case NEG:
			case LB:
			case ID:
			case NUMBER:
				_localctx = new NotExpr1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(301); negationExpr();
				}
				break;
			case NOT:
				_localctx = new NotExpr2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(302); match(NOT);
				setState(303); negationExpr();
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

	public static class NegationExprContext extends ParserRuleContext {
		public NegationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negationExpr; }
	 
		public NegationExprContext() { }
		public void copyFrom(NegationExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegationExpr1Context extends NegationExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public NegationExpr1Context(NegationExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterNegationExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitNegationExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitNegationExpr1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegationExpr2Context extends NegationExprContext {
		public TerminalNode NEG() { return getToken(awn1027Parser.NEG, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public NegationExpr2Context(NegationExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterNegationExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitNegationExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitNegationExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationExprContext negationExpr() throws RecognitionException {
		NegationExprContext _localctx = new NegationExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_negationExpr);
		try {
			setState(309);
			switch (_input.LA(1)) {
			case PI:
			case UPDATE:
			case LB:
			case ID:
			case NUMBER:
				_localctx = new NegationExpr1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(306); atom(0);
				}
				break;
			case NEG:
				_localctx = new NegationExpr2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(307); match(NEG);
				setState(308); atom(0);
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

	public static class AtomContext extends ParserRuleContext {
		public int _p;
		public AtomContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AtomContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class Atom5Context extends AtomContext {
		public TerminalNode IN() { return getToken(awn1027Parser.IN, 0); }
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public Atom5Context(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterAtom5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitAtom5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitAtom5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Atom6Context extends AtomContext {
		public TerminalNode IN() { return getToken(awn1027Parser.IN, 0); }
		public TerminalNode CO(int i) {
			return getToken(awn1027Parser.CO, i);
		}
		public TerminalNode LB() { return getToken(awn1027Parser.LB, 0); }
		public List<TerminalNode> CO() { return getTokens(awn1027Parser.CO); }
		public TerminalNode RB() { return getToken(awn1027Parser.RB, 0); }
		public List<TerminalNode> ID() { return getTokens(awn1027Parser.ID); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(awn1027Parser.ID, i);
		}
		public Atom6Context(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterAtom6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitAtom6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitAtom6(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Atom3Context extends AtomContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Atom3Context(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterAtom3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitAtom3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitAtom3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Atom4Context extends AtomContext {
		public TerminalNode LB() { return getToken(awn1027Parser.LB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RB() { return getToken(awn1027Parser.RB, 0); }
		public Atom4Context(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterAtom4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitAtom4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitAtom4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Atom1Context extends AtomContext {
		public TerminalNode NUMBER() { return getToken(awn1027Parser.NUMBER, 0); }
		public Atom1Context(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterAtom1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitAtom1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitAtom1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Atom2Context extends AtomContext {
		public TerminalNode ST() { return getToken(awn1027Parser.ST, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Atom2Context(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterAtom2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitAtom2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitAtom2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AtomContext _localctx = new AtomContext(_ctx, _parentState, _p);
		AtomContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, RULE_atom);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new Atom2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(312); var();
				setState(313); match(ST);
				setState(314); atom(5);
				}
				break;

			case 2:
				{
				_localctx = new Atom6Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316); match(LB);
				setState(317); match(ID);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CO) {
					{
					{
					setState(318); match(CO);
					setState(319); match(ID);
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(325); match(RB);
				setState(326); match(IN);
				setState(327); atom(1);
				}
				break;

			case 3:
				{
				_localctx = new Atom1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(328); match(NUMBER);
				}
				break;

			case 4:
				{
				_localctx = new Atom3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(329); var();
				}
				break;

			case 5:
				{
				_localctx = new Atom4Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(330); match(LB);
				setState(331); expr();
				setState(332); match(RB);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Atom5Context(new AtomContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_atom);
					setState(336);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(337); match(IN);
					setState(338); atom(3);
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class VarContext extends ParserRuleContext {
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	 
		public VarContext() { }
		public void copyFrom(VarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Var1Context extends VarContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public Var1Context(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterVar1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitVar1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitVar1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Var2Context extends VarContext {
		public TerminalNode ID() { return getToken(awn1027Parser.ID, 0); }
		public Var2Context(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterVar2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitVar2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitVar2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_var);
		try {
			setState(346);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new Var1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(344); funcCall();
				}
				break;

			case 2:
				_localctx = new Var2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(345); match(ID);
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

	public static class FuncCallContext extends ParserRuleContext {
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
	 
		public FuncCallContext() { }
		public void copyFrom(FuncCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncCall1Context extends FuncCallContext {
		public TerminalNode LB() { return getToken(awn1027Parser.LB, 0); }
		public TerminalNode RB() { return getToken(awn1027Parser.RB, 0); }
		public TerminalNode ID() { return getToken(awn1027Parser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FuncCall1Context(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterFuncCall1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitFuncCall1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitFuncCall1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCall2Context extends FuncCallContext {
		public WsnFuncCallContext wsnFuncCall() {
			return getRuleContext(WsnFuncCallContext.class,0);
		}
		public FuncCall2Context(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterFuncCall2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitFuncCall2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitFuncCall2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_funcCall);
		try {
			setState(354);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new FuncCall1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(348); match(ID);
				setState(349); match(LB);
				setState(350); paramList();
				setState(351); match(RB);
				}
				break;
			case PI:
			case UPDATE:
				_localctx = new FuncCall2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(353); wsnFuncCall();
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

	public static class WsnFuncCallContext extends ParserRuleContext {
		public WsnFuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wsnFuncCall; }
	 
		public WsnFuncCallContext() { }
		public void copyFrom(WsnFuncCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WsnFuncCall2Context extends WsnFuncCallContext {
		public TerminalNode PI() { return getToken(awn1027Parser.PI, 0); }
		public TerminalNode LB() { return getToken(awn1027Parser.LB, 0); }
		public TerminalNode RB() { return getToken(awn1027Parser.RB, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public WsnFuncCall2Context(WsnFuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterWsnFuncCall2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitWsnFuncCall2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitWsnFuncCall2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WsnFuncCall1Context extends WsnFuncCallContext {
		public TerminalNode LB() { return getToken(awn1027Parser.LB, 0); }
		public TerminalNode RB() { return getToken(awn1027Parser.RB, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(awn1027Parser.UPDATE, 0); }
		public WsnFuncCall1Context(WsnFuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterWsnFuncCall1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitWsnFuncCall1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitWsnFuncCall1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WsnFuncCallContext wsnFuncCall() throws RecognitionException {
		WsnFuncCallContext _localctx = new WsnFuncCallContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_wsnFuncCall);
		try {
			setState(366);
			switch (_input.LA(1)) {
			case UPDATE:
				_localctx = new WsnFuncCall1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(356); match(UPDATE);
				setState(357); match(LB);
				setState(358); paramList();
				setState(359); match(RB);
				}
				break;
			case PI:
				_localctx = new WsnFuncCall2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(361); match(PI);
				setState(362); match(LB);
				setState(363); paramList();
				setState(364); match(RB);
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

	public static class WsnEventContext extends ParserRuleContext {
		public WsnEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wsnEvent; }
	 
		public WsnEventContext() { }
		public void copyFrom(WsnEventContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WsnEvent3Context extends WsnEventContext {
		public TerminalNode LB() { return getToken(awn1027Parser.LB, 0); }
		public TerminalNode RB() { return getToken(awn1027Parser.RB, 0); }
		public TerminalNode GROUPCAST() { return getToken(awn1027Parser.GROUPCAST, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public WsnEvent3Context(WsnEventContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterWsnEvent3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitWsnEvent3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitWsnEvent3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WsnEvent2Context extends WsnEventContext {
		public TerminalNode LB() { return getToken(awn1027Parser.LB, 0); }
		public TerminalNode RB() { return getToken(awn1027Parser.RB, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode BROADCAST() { return getToken(awn1027Parser.BROADCAST, 0); }
		public WsnEvent2Context(WsnEventContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterWsnEvent2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitWsnEvent2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitWsnEvent2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WsnEvent1Context extends WsnEventContext {
		public TerminalNode LB() { return getToken(awn1027Parser.LB, 0); }
		public TerminalNode UNICAST() { return getToken(awn1027Parser.UNICAST, 0); }
		public TerminalNode RB() { return getToken(awn1027Parser.RB, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public WsnEvent1Context(WsnEventContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterWsnEvent1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitWsnEvent1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitWsnEvent1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WsnEventContext wsnEvent() throws RecognitionException {
		WsnEventContext _localctx = new WsnEventContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_wsnEvent);
		try {
			setState(383);
			switch (_input.LA(1)) {
			case UNICAST:
				_localctx = new WsnEvent1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(368); match(UNICAST);
				setState(369); match(LB);
				setState(370); paramList();
				setState(371); match(RB);
				}
				break;
			case BROADCAST:
				_localctx = new WsnEvent2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(373); match(BROADCAST);
				setState(374); match(LB);
				setState(375); paramList();
				setState(376); match(RB);
				}
				break;
			case GROUPCAST:
				_localctx = new WsnEvent3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(378); match(GROUPCAST);
				setState(379); match(LB);
				setState(380); paramList();
				setState(381); match(RB);
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

	public static class ParamListContext extends ParserRuleContext {
		public TerminalNode CO(int i) {
			return getToken(awn1027Parser.CO, i);
		}
		public List<TerminalNode> CO() { return getTokens(awn1027Parser.CO); }
		public List<OrExprContext> orExpr() {
			return getRuleContexts(OrExprContext.class);
		}
		public OrExprContext orExpr(int i) {
			return getRuleContext(OrExprContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof awn1027Listener ) ((awn1027Listener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof awn1027Visitor ) return ((awn1027Visitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PI) | (1L << UPDATE) | (1L << NOT) | (1L << NEG) | (1L << LB) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				setState(385); orExpr();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CO) {
					{
					{
					setState(386); match(CO);
					setState(387); orExpr();
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return eventExpr_sempred((EventExprContext)_localctx, predIndex);

		case 23: return additiveExpr_sempred((AdditiveExprContext)_localctx, predIndex);

		case 24: return multExpr_sempred((MultExprContext)_localctx, predIndex);

		case 27: return atom_sempred((AtomContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean multExpr_sempred(MultExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return 2 >= _localctx._p;

		case 5: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean atom_sempred(AtomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean eventExpr_sempred(EventExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 4 >= _localctx._p;

		case 1: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean additiveExpr_sempred(AdditiveExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return 2 >= _localctx._p;

		case 3: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\64\u018e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\3\6\3I\n\3\r\3\16\3J\3\3\7\3N\n\3\f\3\16\3Q"+
		"\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6h\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6p\n\6\f\6\16"+
		"\6s\13\6\3\7\3\7\3\b\3\b\5\by\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u0084\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u0090"+
		"\n\f\f\f\16\f\u0093\13\f\5\f\u0095\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\7\17\u009f\n\17\f\17\16\17\u00a2\13\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b4\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00c2"+
		"\n\22\f\22\16\22\u00c5\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\7\23\u00d4\n\23\f\23\16\23\u00d7\13\23\3\23\3"+
		"\23\5\23\u00db\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00e4\n\24"+
		"\3\25\3\25\3\25\7\25\u00e9\n\25\f\25\16\25\u00ec\13\25\3\26\3\26\3\26"+
		"\7\26\u00f1\n\26\f\26\16\26\u00f4\13\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u00ff\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0112\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u011d\n\31\f\31\16\31\u0120\13"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u012b\n\32\f\32"+
		"\16\32\u012e\13\32\3\33\3\33\3\33\5\33\u0133\n\33\3\34\3\34\3\34\5\34"+
		"\u0138\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0143\n"+
		"\35\f\35\16\35\u0146\13\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u0151\n\35\3\35\3\35\3\35\7\35\u0156\n\35\f\35\16\35\u0159\13\35"+
		"\3\36\3\36\5\36\u015d\n\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0165\n"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0171\n \3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\5!\u0182\n!\3\"\3\"\3\"\7\"\u0187\n\"\f\"\16\"\u018a"+
		"\13\"\5\"\u018c\n\"\3\"\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@B\2\2\u01a0\2D\3\2\2\2\4H\3\2\2\2\6R\3\2\2\2\bZ"+
		"\3\2\2\2\ng\3\2\2\2\ft\3\2\2\2\16x\3\2\2\2\20z\3\2\2\2\22\u0083\3\2\2"+
		"\2\24\u0085\3\2\2\2\26\u0094\3\2\2\2\30\u0096\3\2\2\2\32\u0099\3\2\2\2"+
		"\34\u00a0\3\2\2\2\36\u00b3\3\2\2\2 \u00b5\3\2\2\2\"\u00bd\3\2\2\2$\u00c8"+
		"\3\2\2\2&\u00e3\3\2\2\2(\u00e5\3\2\2\2*\u00ed\3\2\2\2,\u00fe\3\2\2\2."+
		"\u0111\3\2\2\2\60\u0113\3\2\2\2\62\u0121\3\2\2\2\64\u0132\3\2\2\2\66\u0137"+
		"\3\2\2\28\u0150\3\2\2\2:\u015c\3\2\2\2<\u0164\3\2\2\2>\u0170\3\2\2\2@"+
		"\u0181\3\2\2\2B\u018b\3\2\2\2DE\5\4\3\2EF\7\3\2\2F\3\3\2\2\2GI\5\6\4\2"+
		"HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KO\3\2\2\2LN\5\24\13\2ML\3\2\2"+
		"\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\5\3\2\2\2QO\3\2\2\2RS\5\b\5\2ST\7 \2"+
		"\2TU\5\n\6\2U\7\3\2\2\2VW\7\62\2\2WX\7)\2\2X[\7*\2\2Y[\5@!\2ZV\3\2\2\2"+
		"ZY\3\2\2\2[\t\3\2\2\2\\]\b\6\1\2]^\7+\2\2^_\5(\25\2_`\7,\2\2`a\5\n\6\2"+
		"ah\3\2\2\2bc\7-\2\2cd\5\f\7\2de\7.\2\2eh\3\2\2\2fh\5\b\5\2g\\\3\2\2\2"+
		"gb\3\2\2\2gf\3\2\2\2hq\3\2\2\2ij\6\6\2\3jk\7\30\2\2kp\5\n\6\2lm\6\6\3"+
		"\3mn\7\27\2\2np\5\n\6\2oi\3\2\2\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2"+
		"\2\2r\13\3\2\2\2sq\3\2\2\2tu\5\34\17\2u\r\3\2\2\2vy\5\20\t\2wy\5\22\n"+
		"\2xv\3\2\2\2xw\3\2\2\2y\17\3\2\2\2z{\7\17\2\2{|\5\22\n\2|\21\3\2\2\2}"+
		"\u0084\7\t\2\2~\u0084\7\n\2\2\177\u0084\7\13\2\2\u0080\u0084\7\62\2\2"+
		"\u0081\u0084\7\4\2\2\u0082\u0084\7\f\2\2\u0083}\3\2\2\2\u0083~\3\2\2\2"+
		"\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\23\3\2\2\2\u0085\u0086\5\16\b\2\u0086\u0087\7\62\2\2\u0087"+
		"\u0088\7)\2\2\u0088\u0089\5\26\f\2\u0089\u008a\7*\2\2\u008a\u008b\5\32"+
		"\16\2\u008b\25\3\2\2\2\u008c\u0091\5\30\r\2\u008d\u008e\7/\2\2\u008e\u0090"+
		"\5\30\r\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u008c"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\27\3\2\2\2\u0096\u0097\5\16\b\2\u0097"+
		"\u0098\7\62\2\2\u0098\31\3\2\2\2\u0099\u009a\7-\2\2\u009a\u009b\5\34\17"+
		"\2\u009b\u009c\7.\2\2\u009c\33\3\2\2\2\u009d\u009f\5\36\20\2\u009e\u009d"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\35\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00b4\5$\23\2\u00a4\u00a5\7\16\2"+
		"\2\u00a5\u00a6\58\35\2\u00a6\u00a7\7\r\2\2\u00a7\u00a8\58\35\2\u00a8\u00a9"+
		"\5\32\16\2\u00a9\u00b4\3\2\2\2\u00aa\u00b4\5\32\16\2\u00ab\u00ac\5&\24"+
		"\2\u00ac\u00ad\7\61\2\2\u00ad\u00b4\3\2\2\2\u00ae\u00b4\5 \21\2\u00af"+
		"\u00b0\7\20\2\2\u00b0\u00b1\5\n\6\2\u00b1\u00b2\7\21\2\2\u00b2\u00b4\3"+
		"\2\2\2\u00b3\u00a3\3\2\2\2\u00b3\u00a4\3\2\2\2\u00b3\u00aa\3\2\2\2\u00b3"+
		"\u00ab\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\37\3\2\2"+
		"\2\u00b5\u00b6\7\62\2\2\u00b6\u00b7\7 \2\2\u00b7\u00b8\7-\2\2\u00b8\u00b9"+
		"\5\"\22\2\u00b9\u00ba\7\31\2\2\u00ba\u00bb\5(\25\2\u00bb\u00bc\7.\2\2"+
		"\u00bc!\3\2\2\2\u00bd\u00be\7)\2\2\u00be\u00c3\5\30\r\2\u00bf\u00c0\7"+
		"/\2\2\u00c0\u00c2\5\30\r\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c6\u00c7\7*\2\2\u00c7#\3\2\2\2\u00c8\u00c9\7\5\2\2\u00c9\u00ca"+
		"\7)\2\2\u00ca\u00cb\5(\25\2\u00cb\u00cc\7*\2\2\u00cc\u00d5\5\36\20\2\u00cd"+
		"\u00ce\7\7\2\2\u00ce\u00cf\7)\2\2\u00cf\u00d0\5(\25\2\u00d0\u00d1\7*\2"+
		"\2\u00d1\u00d2\5\36\20\2\u00d2\u00d4\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00da\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\6\2\2\u00d9\u00db\5\36\20\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7\b"+
		"\2\2\u00dd%\3\2\2\2\u00de\u00e4\5(\25\2\u00df\u00e0\58\35\2\u00e0\u00e1"+
		"\7 \2\2\u00e1\u00e2\5&\24\2\u00e2\u00e4\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3"+
		"\u00df\3\2\2\2\u00e4\'\3\2\2\2\u00e5\u00ea\5*\26\2\u00e6\u00e7\7\33\2"+
		"\2\u00e7\u00e9\5*\26\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb)\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00f2\5,\27\2\u00ee\u00ef\7\32\2\2\u00ef\u00f1\5,\27\2\u00f0\u00ee\3"+
		"\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"+\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00ff\5.\30\2\u00f6\u00f7\5.\30\2"+
		"\u00f7\u00f8\7!\2\2\u00f8\u00f9\5.\30\2\u00f9\u00ff\3\2\2\2\u00fa\u00fb"+
		"\5.\30\2\u00fb\u00fc\7&\2\2\u00fc\u00fd\5.\30\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u00f5\3\2\2\2\u00fe\u00f6\3\2\2\2\u00fe\u00fa\3\2\2\2\u00ff-\3\2\2\2"+
		"\u0100\u0112\5\60\31\2\u0101\u0102\5\60\31\2\u0102\u0103\7\"\2\2\u0103"+
		"\u0104\5\60\31\2\u0104\u0112\3\2\2\2\u0105\u0106\5\60\31\2\u0106\u0107"+
		"\7#\2\2\u0107\u0108\5\60\31\2\u0108\u0112\3\2\2\2\u0109\u010a\5\60\31"+
		"\2\u010a\u010b\7$\2\2\u010b\u010c\5\60\31\2\u010c\u0112\3\2\2\2\u010d"+
		"\u010e\5\60\31\2\u010e\u010f\7%\2\2\u010f\u0110\5\60\31\2\u0110\u0112"+
		"\3\2\2\2\u0111\u0100\3\2\2\2\u0111\u0101\3\2\2\2\u0111\u0105\3\2\2\2\u0111"+
		"\u0109\3\2\2\2\u0111\u010d\3\2\2\2\u0112/\3\2\2\2\u0113\u0114\b\31\1\2"+
		"\u0114\u0115\5\62\32\2\u0115\u011e\3\2\2\2\u0116\u0117\6\31\4\3\u0117"+
		"\u0118\7\34\2\2\u0118\u011d\5\62\32\2\u0119\u011a\6\31\5\3\u011a\u011b"+
		"\7\35\2\2\u011b\u011d\5\62\32\2\u011c\u0116\3\2\2\2\u011c\u0119\3\2\2"+
		"\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\61"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\b\32\1\2\u0122\u0123\5\64\33"+
		"\2\u0123\u012c\3\2\2\2\u0124\u0125\6\32\6\3\u0125\u0126\7\36\2\2\u0126"+
		"\u012b\5\64\33\2\u0127\u0128\6\32\7\3\u0128\u0129\7\37\2\2\u0129\u012b"+
		"\5\64\33\2\u012a\u0124\3\2\2\2\u012a\u0127\3\2\2\2\u012b\u012e\3\2\2\2"+
		"\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\63\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012f\u0133\5\66\34\2\u0130\u0131\7\'\2\2\u0131\u0133\5\66\34"+
		"\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0133\65\3\2\2\2\u0134\u0138"+
		"\58\35\2\u0135\u0136\7(\2\2\u0136\u0138\58\35\2\u0137\u0134\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0138\67\3\2\2\2\u0139\u013a\b\35\1\2\u013a\u013b\5:\36"+
		"\2\u013b\u013c\7\60\2\2\u013c\u013d\58\35\2\u013d\u0151\3\2\2\2\u013e"+
		"\u013f\7)\2\2\u013f\u0144\7\62\2\2\u0140\u0141\7/\2\2\u0141\u0143\7\62"+
		"\2\2\u0142\u0140\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7*"+
		"\2\2\u0148\u0149\7\r\2\2\u0149\u0151\58\35\2\u014a\u0151\7\63\2\2\u014b"+
		"\u0151\5:\36\2\u014c\u014d\7)\2\2\u014d\u014e\5&\24\2\u014e\u014f\7*\2"+
		"\2\u014f\u0151\3\2\2\2\u0150\u0139\3\2\2\2\u0150\u013e\3\2\2\2\u0150\u014a"+
		"\3\2\2\2\u0150\u014b\3\2\2\2\u0150\u014c\3\2\2\2\u0151\u0157\3\2\2\2\u0152"+
		"\u0153\6\35\b\3\u0153\u0154\7\r\2\2\u0154\u0156\58\35\2\u0155\u0152\3"+
		"\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"9\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015d\5<\37\2\u015b\u015d\7\62\2\2"+
		"\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d;\3\2\2\2\u015e\u015f\7"+
		"\62\2\2\u015f\u0160\7)\2\2\u0160\u0161\5B\"\2\u0161\u0162\7*\2\2\u0162"+
		"\u0165\3\2\2\2\u0163\u0165\5> \2\u0164\u015e\3\2\2\2\u0164\u0163\3\2\2"+
		"\2\u0165=\3\2\2\2\u0166\u0167\7\23\2\2\u0167\u0168\7)\2\2\u0168\u0169"+
		"\5B\"\2\u0169\u016a\7*\2\2\u016a\u0171\3\2\2\2\u016b\u016c\7\22\2\2\u016c"+
		"\u016d\7)\2\2\u016d\u016e\5B\"\2\u016e\u016f\7*\2\2\u016f\u0171\3\2\2"+
		"\2\u0170\u0166\3\2\2\2\u0170\u016b\3\2\2\2\u0171?\3\2\2\2\u0172\u0173"+
		"\7\24\2\2\u0173\u0174\7)\2\2\u0174\u0175\5B\"\2\u0175\u0176\7*\2\2\u0176"+
		"\u0182\3\2\2\2\u0177\u0178\7\25\2\2\u0178\u0179\7)\2\2\u0179\u017a\5B"+
		"\"\2\u017a\u017b\7*\2\2\u017b\u0182\3\2\2\2\u017c\u017d\7\26\2\2\u017d"+
		"\u017e\7)\2\2\u017e\u017f\5B\"\2\u017f\u0180\7*\2\2\u0180\u0182\3\2\2"+
		"\2\u0181\u0172\3\2\2\2\u0181\u0177\3\2\2\2\u0181\u017c\3\2\2\2\u0182A"+
		"\3\2\2\2\u0183\u0188\5(\25\2\u0184\u0185\7/\2\2\u0185\u0187\5(\25\2\u0186"+
		"\u0184\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u0183\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018cC\3\2\2\2%JOZgoqx\u0083\u0091\u0094\u00a0\u00b3\u00c3"+
		"\u00d5\u00da\u00e3\u00ea\u00f2\u00fe\u0111\u011c\u011e\u012a\u012c\u0132"+
		"\u0137\u0144\u0150\u0157\u015c\u0164\u0170\u0181\u0188\u018b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}