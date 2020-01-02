// Generated from /home/willie/Desktop/Test Java COOL/ANTLR_COOL_Program/COOL.g4 by ANTLR 4.7.2
package ANTLR_COOL_Program;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class COOLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		CLASS=10, ELSE=11, FALSE=12, FI=13, IF=14, IN=15, INHERITS=16, ISVOID=17, 
		LET=18, LOOP=19, POOL=20, THEN=21, WHILE=22, CASE=23, ESAC=24, NEW=25, 
		OF=26, NOT=27, TRUE=28, STRING=29, INT=30, TYPEID=31, OBJECTID=32, ASSIGNMENT=33, 
		CASE_ARROW=34, ADD=35, MINUS=36, MULTIPLY=37, DIVISION=38, LESS_THAN=39, 
		LESS_EQUAL=40, EQUAL=41, INTEGER_NEGATIVE=42, OPEN_COMMENT=43, CLOSE_COMMENT=44, 
		COMMENT=45, ONE_LINE_COMMENT=46, WHITESPACE=47;
	public static final int
		RULE_program = 0, RULE_programBlocks = 1, RULE_classDefine = 2, RULE_feature = 3, 
		RULE_formal = 4, RULE_expression = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programBlocks", "classDefine", "feature", "formal", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "','", "')'", "':'", "'@'", "'.'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'<-'", 
			"'=>'", "'+'", "'-'", "'*'", "'/'", "'<'", "'<='", "'='", "'~'", "'(*'", 
			"'*)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "CLASS", 
			"ELSE", "FALSE", "FI", "IF", "IN", "INHERITS", "ISVOID", "LET", "LOOP", 
			"POOL", "THEN", "WHILE", "CASE", "ESAC", "NEW", "OF", "NOT", "TRUE", 
			"STRING", "INT", "TYPEID", "OBJECTID", "ASSIGNMENT", "CASE_ARROW", "ADD", 
			"MINUS", "MULTIPLY", "DIVISION", "LESS_THAN", "LESS_EQUAL", "EQUAL", 
			"INTEGER_NEGATIVE", "OPEN_COMMENT", "CLOSE_COMMENT", "COMMENT", "ONE_LINE_COMMENT", 
			"WHITESPACE"
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
	public String getGrammarFileName() { return "COOL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public COOLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramBlocksContext programBlocks() {
			return getRuleContext(ProgramBlocksContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			programBlocks();
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

	public static class ProgramBlocksContext extends ParserRuleContext {
		public ProgramBlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBlocks; }
	 
		public ProgramBlocksContext() { }
		public void copyFrom(ProgramBlocksContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassesContext extends ProgramBlocksContext {
		public ClassDefineContext classDefine() {
			return getRuleContext(ClassDefineContext.class,0);
		}
		public ProgramBlocksContext programBlocks() {
			return getRuleContext(ProgramBlocksContext.class,0);
		}
		public ClassesContext(ProgramBlocksContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterClasses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitClasses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitClasses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EofContext extends ProgramBlocksContext {
		public TerminalNode EOF() { return getToken(COOLParser.EOF, 0); }
		public EofContext(ProgramBlocksContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitEof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitEof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramBlocksContext programBlocks() throws RecognitionException {
		ProgramBlocksContext _localctx = new ProgramBlocksContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programBlocks);
		try {
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				_localctx = new ClassesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				classDefine();
				setState(15);
				match(T__0);
				setState(16);
				programBlocks();
				}
				break;
			case EOF:
				_localctx = new EofContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(EOF);
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

	public static class ClassDefineContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(COOLParser.CLASS, 0); }
		public List<TerminalNode> TYPEID() { return getTokens(COOLParser.TYPEID); }
		public TerminalNode TYPEID(int i) {
			return getToken(COOLParser.TYPEID, i);
		}
		public TerminalNode INHERITS() { return getToken(COOLParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public ClassDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterClassDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitClassDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitClassDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefineContext classDefine() throws RecognitionException {
		ClassDefineContext _localctx = new ClassDefineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(CLASS);
			setState(22);
			match(TYPEID);
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(23);
				match(INHERITS);
				setState(24);
				match(TYPEID);
				}
			}

			setState(27);
			match(T__1);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBJECTID) {
				{
				{
				setState(28);
				feature();
				setState(29);
				match(T__0);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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

	public static class FeatureContext extends ParserRuleContext {
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	 
		public FeatureContext() { }
		public void copyFrom(FeatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodContext extends FeatureContext {
		public TerminalNode OBJECTID() { return getToken(COOLParser.OBJECTID, 0); }
		public TerminalNode TYPEID() { return getToken(COOLParser.TYPEID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public MethodContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropertyContext extends FeatureContext {
		public TerminalNode OBJECTID() { return getToken(COOLParser.OBJECTID, 0); }
		public TerminalNode TYPEID() { return getToken(COOLParser.TYPEID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(COOLParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_feature);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new MethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(OBJECTID);
				setState(39);
				match(T__3);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OBJECTID) {
					{
					setState(40);
					formal();
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(41);
						match(T__4);
						setState(42);
						formal();
						}
						}
						setState(47);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(50);
				match(T__5);
				setState(51);
				match(T__6);
				setState(52);
				match(TYPEID);
				setState(53);
				match(T__1);
				setState(54);
				expression(0);
				setState(55);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new PropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(OBJECTID);
				setState(58);
				match(T__6);
				setState(59);
				match(TYPEID);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(60);
					match(ASSIGNMENT);
					setState(61);
					expression(0);
					}
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

	public static class FormalContext extends ParserRuleContext {
		public TerminalNode OBJECTID() { return getToken(COOLParser.OBJECTID, 0); }
		public TerminalNode TYPEID() { return getToken(COOLParser.TYPEID, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitFormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(OBJECTID);
			setState(67);
			match(T__6);
			setState(68);
			match(TYPEID);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LetInContext extends ExpressionContext {
		public TerminalNode LET() { return getToken(COOLParser.LET, 0); }
		public List<TerminalNode> OBJECTID() { return getTokens(COOLParser.OBJECTID); }
		public TerminalNode OBJECTID(int i) {
			return getToken(COOLParser.OBJECTID, i);
		}
		public List<TerminalNode> TYPEID() { return getTokens(COOLParser.TYPEID); }
		public TerminalNode TYPEID(int i) {
			return getToken(COOLParser.TYPEID, i);
		}
		public TerminalNode IN() { return getToken(COOLParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ASSIGNMENT() { return getTokens(COOLParser.ASSIGNMENT); }
		public TerminalNode ASSIGNMENT(int i) {
			return getToken(COOLParser.ASSIGNMENT, i);
		}
		public LetInContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterLetIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitLetIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitLetIn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(COOLParser.MINUS, 0); }
		public MinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(COOLParser.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsvoidContext extends ExpressionContext {
		public TerminalNode ISVOID() { return getToken(COOLParser.ISVOID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IsvoidContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterIsvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitIsvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitIsvoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends ExpressionContext {
		public TerminalNode WHILE() { return getToken(COOLParser.WHILE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOOP() { return getToken(COOLParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(COOLParser.POOL, 0); }
		public WhileContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVISION() { return getToken(COOLParser.DIVISION, 0); }
		public DivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeContext extends ExpressionContext {
		public TerminalNode INTEGER_NEGATIVE() { return getToken(COOLParser.INTEGER_NEGATIVE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegativeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitNegative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitNegative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolNotContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(COOLParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BoolNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterBoolNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitBoolNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitBoolNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(COOLParser.LESS_THAN, 0); }
		public LessThanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BlockContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExpressionContext {
		public TerminalNode OBJECTID() { return getToken(COOLParser.OBJECTID, 0); }
		public IdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(COOLParser.MULTIPLY, 0); }
		public MultiplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends ExpressionContext {
		public TerminalNode IF() { return getToken(COOLParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(COOLParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(COOLParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(COOLParser.FI, 0); }
		public IfContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseContext extends ExpressionContext {
		public TerminalNode CASE() { return getToken(COOLParser.CASE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OF() { return getToken(COOLParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(COOLParser.ESAC, 0); }
		public List<TerminalNode> OBJECTID() { return getTokens(COOLParser.OBJECTID); }
		public TerminalNode OBJECTID(int i) {
			return getToken(COOLParser.OBJECTID, i);
		}
		public List<TerminalNode> TYPEID() { return getTokens(COOLParser.TYPEID); }
		public TerminalNode TYPEID(int i) {
			return getToken(COOLParser.TYPEID, i);
		}
		public List<TerminalNode> CASE_ARROW() { return getTokens(COOLParser.CASE_ARROW); }
		public TerminalNode CASE_ARROW(int i) {
			return getToken(COOLParser.CASE_ARROW, i);
		}
		public CaseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OwnMethodCallContext extends ExpressionContext {
		public TerminalNode OBJECTID() { return getToken(COOLParser.OBJECTID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OwnMethodCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterOwnMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitOwnMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitOwnMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(COOLParser.ADD, 0); }
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(COOLParser.NEW, 0); }
		public TerminalNode TYPEID() { return getToken(COOLParser.TYPEID, 0); }
		public NewContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends ExpressionContext {
		public TerminalNode OBJECTID() { return getToken(COOLParser.OBJECTID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(COOLParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends ExpressionContext {
		public TerminalNode FALSE() { return getToken(COOLParser.FALSE, 0); }
		public FalseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(COOLParser.INT, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(COOLParser.EQUAL, 0); }
		public EqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends ExpressionContext {
		public TerminalNode TRUE() { return getToken(COOLParser.TRUE, 0); }
		public TrueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessEqualContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS_EQUAL() { return getToken(COOLParser.LESS_EQUAL, 0); }
		public LessEqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterLessEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitLessEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitLessEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OBJECTID() { return getToken(COOLParser.OBJECTID, 0); }
		public TerminalNode TYPEID() { return getToken(COOLParser.TYPEID, 0); }
		public MethodCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new OwnMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(71);
				match(OBJECTID);
				setState(72);
				match(T__3);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << STRING) | (1L << INT) | (1L << OBJECTID) | (1L << INTEGER_NEGATIVE))) != 0)) {
					{
					setState(73);
					expression(0);
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(74);
						match(T__4);
						setState(75);
						expression(0);
						}
						}
						setState(80);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(83);
				match(T__5);
				}
				break;
			case 2:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(IF);
				setState(85);
				expression(0);
				setState(86);
				match(THEN);
				setState(87);
				expression(0);
				setState(88);
				match(ELSE);
				setState(89);
				expression(0);
				setState(90);
				match(FI);
				}
				break;
			case 3:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(WHILE);
				setState(93);
				expression(0);
				setState(94);
				match(LOOP);
				setState(95);
				expression(0);
				setState(96);
				match(POOL);
				}
				break;
			case 4:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(T__1);
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(99);
					expression(0);
					setState(100);
					match(T__0);
					}
					}
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << STRING) | (1L << INT) | (1L << OBJECTID) | (1L << INTEGER_NEGATIVE))) != 0) );
				setState(106);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new LetInContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(LET);
				setState(109);
				match(OBJECTID);
				setState(110);
				match(T__6);
				setState(111);
				match(TYPEID);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(112);
					match(ASSIGNMENT);
					setState(113);
					expression(0);
					}
				}

				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(116);
					match(T__4);
					setState(117);
					match(OBJECTID);
					setState(118);
					match(T__6);
					setState(119);
					match(TYPEID);
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGNMENT) {
						{
						setState(120);
						match(ASSIGNMENT);
						setState(121);
						expression(0);
						}
					}

					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
				match(IN);
				setState(130);
				expression(20);
				}
				break;
			case 6:
				{
				_localctx = new CaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(CASE);
				setState(132);
				expression(0);
				setState(133);
				match(OF);
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(134);
					match(OBJECTID);
					setState(135);
					match(T__6);
					setState(136);
					match(TYPEID);
					setState(137);
					match(CASE_ARROW);
					setState(138);
					expression(0);
					setState(139);
					match(T__0);
					}
					}
					setState(143); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OBJECTID );
				setState(145);
				match(ESAC);
				}
				break;
			case 7:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(NEW);
				setState(148);
				match(TYPEID);
				}
				break;
			case 8:
				{
				_localctx = new NegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(INTEGER_NEGATIVE);
				setState(150);
				expression(17);
				}
				break;
			case 9:
				{
				_localctx = new IsvoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(ISVOID);
				setState(152);
				expression(16);
				}
				break;
			case 10:
				{
				_localctx = new BoolNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(NOT);
				setState(154);
				expression(8);
				}
				break;
			case 11:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(T__3);
				setState(156);
				expression(0);
				setState(157);
				match(T__5);
				}
				break;
			case 12:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(OBJECTID);
				}
				break;
			case 13:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(INT);
				}
				break;
			case 14:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(STRING);
				}
				break;
			case 15:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(TRUE);
				}
				break;
			case 16:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(FALSE);
				}
				break;
			case 17:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(OBJECTID);
				setState(165);
				match(ASSIGNMENT);
				setState(166);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(169);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(170);
						match(MULTIPLY);
						setState(171);
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(172);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(173);
						match(DIVISION);
						setState(174);
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(176);
						match(ADD);
						setState(177);
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(179);
						match(MINUS);
						setState(180);
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new LessThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(182);
						match(LESS_THAN);
						setState(183);
						expression(12);
						}
						break;
					case 6:
						{
						_localctx = new LessEqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(185);
						match(LESS_EQUAL);
						setState(186);
						expression(11);
						}
						break;
					case 7:
						{
						_localctx = new EqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(188);
						match(EQUAL);
						setState(189);
						expression(10);
						}
						break;
					case 8:
						{
						_localctx = new MethodCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(193);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__7) {
							{
							setState(191);
							match(T__7);
							setState(192);
							match(TYPEID);
							}
						}

						setState(195);
						match(T__8);
						setState(196);
						match(OBJECTID);
						setState(197);
						match(T__3);
						setState(206);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << STRING) | (1L << INT) | (1L << OBJECTID) | (1L << INTEGER_NEGATIVE))) != 0)) {
							{
							setState(198);
							expression(0);
							setState(203);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__4) {
								{
								{
								setState(199);
								match(T__4);
								setState(200);
								expression(0);
								}
								}
								setState(205);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(208);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(213);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 25);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00d9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\26\n\3\3\4\3\4\3\4\3\4\5\4\34\n\4\3\4\3\4\3\4\3\4\7\4\"\n\4\f\4\16"+
		"\4%\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5.\n\5\f\5\16\5\61\13\5\5\5\63"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\5\5C\n\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7O\n\7\f\7\16\7R\13\7\5\7T"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\6\7i\n\7\r\7\16\7j\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7u\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7}\n\7\7\7\177\n\7\f\7\16\7\u0082\13\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u0090\n\7\r\7\16\7\u0091"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u00aa\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c4\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00cc\n\7\f\7\16\7\u00cf\13\7\5\7\u00d1"+
		"\n\7\3\7\7\7\u00d4\n\7\f\7\16\7\u00d7\13\7\3\7\2\3\f\b\2\4\6\b\n\f\2\2"+
		"\2\u00fb\2\16\3\2\2\2\4\25\3\2\2\2\6\27\3\2\2\2\bB\3\2\2\2\nD\3\2\2\2"+
		"\f\u00a9\3\2\2\2\16\17\5\4\3\2\17\3\3\2\2\2\20\21\5\6\4\2\21\22\7\3\2"+
		"\2\22\23\5\4\3\2\23\26\3\2\2\2\24\26\7\2\2\3\25\20\3\2\2\2\25\24\3\2\2"+
		"\2\26\5\3\2\2\2\27\30\7\f\2\2\30\33\7!\2\2\31\32\7\22\2\2\32\34\7!\2\2"+
		"\33\31\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35#\7\4\2\2\36\37\5\b\5\2\37"+
		" \7\3\2\2 \"\3\2\2\2!\36\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2"+
		"\2\2%#\3\2\2\2&\'\7\5\2\2\'\7\3\2\2\2()\7\"\2\2)\62\7\6\2\2*/\5\n\6\2"+
		"+,\7\7\2\2,.\5\n\6\2-+\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\63"+
		"\3\2\2\2\61/\3\2\2\2\62*\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7\b"+
		"\2\2\65\66\7\t\2\2\66\67\7!\2\2\678\7\4\2\289\5\f\7\29:\7\5\2\2:C\3\2"+
		"\2\2;<\7\"\2\2<=\7\t\2\2=@\7!\2\2>?\7#\2\2?A\5\f\7\2@>\3\2\2\2@A\3\2\2"+
		"\2AC\3\2\2\2B(\3\2\2\2B;\3\2\2\2C\t\3\2\2\2DE\7\"\2\2EF\7\t\2\2FG\7!\2"+
		"\2G\13\3\2\2\2HI\b\7\1\2IJ\7\"\2\2JS\7\6\2\2KP\5\f\7\2LM\7\7\2\2MO\5\f"+
		"\7\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QT\3\2\2\2RP\3\2\2\2SK\3\2"+
		"\2\2ST\3\2\2\2TU\3\2\2\2U\u00aa\7\b\2\2VW\7\20\2\2WX\5\f\7\2XY\7\27\2"+
		"\2YZ\5\f\7\2Z[\7\r\2\2[\\\5\f\7\2\\]\7\17\2\2]\u00aa\3\2\2\2^_\7\30\2"+
		"\2_`\5\f\7\2`a\7\25\2\2ab\5\f\7\2bc\7\26\2\2c\u00aa\3\2\2\2dh\7\4\2\2"+
		"ef\5\f\7\2fg\7\3\2\2gi\3\2\2\2he\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2"+
		"kl\3\2\2\2lm\7\5\2\2m\u00aa\3\2\2\2no\7\24\2\2op\7\"\2\2pq\7\t\2\2qt\7"+
		"!\2\2rs\7#\2\2su\5\f\7\2tr\3\2\2\2tu\3\2\2\2u\u0080\3\2\2\2vw\7\7\2\2"+
		"wx\7\"\2\2xy\7\t\2\2y|\7!\2\2z{\7#\2\2{}\5\f\7\2|z\3\2\2\2|}\3\2\2\2}"+
		"\177\3\2\2\2~v\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\21\2\2\u0084"+
		"\u00aa\5\f\7\26\u0085\u0086\7\31\2\2\u0086\u0087\5\f\7\2\u0087\u008f\7"+
		"\34\2\2\u0088\u0089\7\"\2\2\u0089\u008a\7\t\2\2\u008a\u008b\7!\2\2\u008b"+
		"\u008c\7$\2\2\u008c\u008d\5\f\7\2\u008d\u008e\7\3\2\2\u008e\u0090\3\2"+
		"\2\2\u008f\u0088\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7\32\2\2\u0094\u00aa\3"+
		"\2\2\2\u0095\u0096\7\33\2\2\u0096\u00aa\7!\2\2\u0097\u0098\7,\2\2\u0098"+
		"\u00aa\5\f\7\23\u0099\u009a\7\23\2\2\u009a\u00aa\5\f\7\22\u009b\u009c"+
		"\7\35\2\2\u009c\u00aa\5\f\7\n\u009d\u009e\7\6\2\2\u009e\u009f\5\f\7\2"+
		"\u009f\u00a0\7\b\2\2\u00a0\u00aa\3\2\2\2\u00a1\u00aa\7\"\2\2\u00a2\u00aa"+
		"\7 \2\2\u00a3\u00aa\7\37\2\2\u00a4\u00aa\7\36\2\2\u00a5\u00aa\7\16\2\2"+
		"\u00a6\u00a7\7\"\2\2\u00a7\u00a8\7#\2\2\u00a8\u00aa\5\f\7\3\u00a9H\3\2"+
		"\2\2\u00a9V\3\2\2\2\u00a9^\3\2\2\2\u00a9d\3\2\2\2\u00a9n\3\2\2\2\u00a9"+
		"\u0085\3\2\2\2\u00a9\u0095\3\2\2\2\u00a9\u0097\3\2\2\2\u00a9\u0099\3\2"+
		"\2\2\u00a9\u009b\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9"+
		"\u00a2\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5\3\2"+
		"\2\2\u00a9\u00a6\3\2\2\2\u00aa\u00d5\3\2\2\2\u00ab\u00ac\f\21\2\2\u00ac"+
		"\u00ad\7\'\2\2\u00ad\u00d4\5\f\7\22\u00ae\u00af\f\20\2\2\u00af\u00b0\7"+
		"(\2\2\u00b0\u00d4\5\f\7\21\u00b1\u00b2\f\17\2\2\u00b2\u00b3\7%\2\2\u00b3"+
		"\u00d4\5\f\7\20\u00b4\u00b5\f\16\2\2\u00b5\u00b6\7&\2\2\u00b6\u00d4\5"+
		"\f\7\17\u00b7\u00b8\f\r\2\2\u00b8\u00b9\7)\2\2\u00b9\u00d4\5\f\7\16\u00ba"+
		"\u00bb\f\f\2\2\u00bb\u00bc\7*\2\2\u00bc\u00d4\5\f\7\r\u00bd\u00be\f\13"+
		"\2\2\u00be\u00bf\7+\2\2\u00bf\u00d4\5\f\7\f\u00c0\u00c3\f\33\2\2\u00c1"+
		"\u00c2\7\n\2\2\u00c2\u00c4\7!\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\13\2\2\u00c6\u00c7\7\"\2\2\u00c7"+
		"\u00d0\7\6\2\2\u00c8\u00cd\5\f\7\2\u00c9\u00ca\7\7\2\2\u00ca\u00cc\5\f"+
		"\7\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00c8\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\7\b\2\2\u00d3"+
		"\u00ab\3\2\2\2\u00d3\u00ae\3\2\2\2\u00d3\u00b1\3\2\2\2\u00d3\u00b4\3\2"+
		"\2\2\u00d3\u00b7\3\2\2\2\u00d3\u00ba\3\2\2\2\u00d3\u00bd\3\2\2\2\u00d3"+
		"\u00c0\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\r\3\2\2\2\u00d7\u00d5\3\2\2\2\26\25\33#/\62@BPSjt|\u0080\u0091"+
		"\u00a9\u00c3\u00cd\u00d0\u00d3\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}