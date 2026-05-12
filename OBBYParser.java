// Generated from OBBYParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class OBBYParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROJECT=1, FOLDER=2, PART=3, K_BRICK=4, M_PLATFROM=5, C_POINT=6, QUOTE=7, 
		NAME=8, WS=9, INT=10, DOUBLE=11, O_BRACKET=12, C_BRACKET=13, SIZE=14, 
		MATERIAL=15, COLOR=16, ANCHORED=17, SPEED=18, DISTANCE=19;
	public static final int
		RULE_program = 0, RULE_folder = 1, RULE_item = 2, RULE_property = 3, RULE_num = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "folder", "item", "property", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'project'", "'folder'", "'part'", "'kill_brick'", "'moving_platform'", 
			"'checkpoint'", "'\"'", null, null, null, null, "'{'", "'}'", "'size:'", 
			"'material:'", "'color:'", "'anchored:'", "'speed:'", "'distance:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROJECT", "FOLDER", "PART", "K_BRICK", "M_PLATFROM", "C_POINT", 
			"QUOTE", "NAME", "WS", "INT", "DOUBLE", "O_BRACKET", "C_BRACKET", "SIZE", 
			"MATERIAL", "COLOR", "ANCHORED", "SPEED", "DISTANCE"
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
	public String getGrammarFileName() { return "OBBYParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OBBYParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROJECT() { return getToken(OBBYParser.PROJECT, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(OBBYParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(OBBYParser.QUOTE, i);
		}
		public TerminalNode NAME() { return getToken(OBBYParser.NAME, 0); }
		public TerminalNode O_BRACKET() { return getToken(OBBYParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(OBBYParser.C_BRACKET, 0); }
		public List<FolderContext> folder() {
			return getRuleContexts(FolderContext.class);
		}
		public FolderContext folder(int i) {
			return getRuleContext(FolderContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OBBYParserListener ) ((OBBYParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OBBYParserListener ) ((OBBYParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OBBYParserVisitor ) return ((OBBYParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(PROJECT);
			setState(11);
			match(QUOTE);
			setState(12);
			match(NAME);
			setState(13);
			match(QUOTE);
			setState(14);
			match(O_BRACKET);
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FOLDER) {
				{
				{
				setState(15);
				folder();
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
			match(C_BRACKET);
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
	public static class FolderContext extends ParserRuleContext {
		public TerminalNode FOLDER() { return getToken(OBBYParser.FOLDER, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(OBBYParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(OBBYParser.QUOTE, i);
		}
		public TerminalNode NAME() { return getToken(OBBYParser.NAME, 0); }
		public TerminalNode O_BRACKET() { return getToken(OBBYParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(OBBYParser.C_BRACKET, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public FolderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_folder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OBBYParserListener ) ((OBBYParserListener)listener).enterFolder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OBBYParserListener ) ((OBBYParserListener)listener).exitFolder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OBBYParserVisitor ) return ((OBBYParserVisitor<? extends T>)visitor).visitFolder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FolderContext folder() throws RecognitionException {
		FolderContext _localctx = new FolderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_folder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(FOLDER);
			setState(24);
			match(QUOTE);
			setState(25);
			match(NAME);
			setState(26);
			match(QUOTE);
			setState(27);
			match(O_BRACKET);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0)) {
				{
				{
				setState(28);
				item();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(C_BRACKET);
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
	public static class ItemContext extends ParserRuleContext {
		public TerminalNode PART() { return getToken(OBBYParser.PART, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(OBBYParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(OBBYParser.QUOTE, i);
		}
		public TerminalNode NAME() { return getToken(OBBYParser.NAME, 0); }
		public TerminalNode O_BRACKET() { return getToken(OBBYParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(OBBYParser.C_BRACKET, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode K_BRICK() { return getToken(OBBYParser.K_BRICK, 0); }
		public TerminalNode M_PLATFROM() { return getToken(OBBYParser.M_PLATFROM, 0); }
		public TerminalNode C_POINT() { return getToken(OBBYParser.C_POINT, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OBBYParserListener ) ((OBBYParserListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OBBYParserListener ) ((OBBYParserListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OBBYParserVisitor ) return ((OBBYParserVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_item);
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PART:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(PART);
				setState(37);
				match(QUOTE);
				setState(38);
				match(NAME);
				setState(39);
				match(QUOTE);
				setState(40);
				match(O_BRACKET);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0)) {
					{
					{
					setState(41);
					property();
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(47);
				match(C_BRACKET);
				}
				break;
			case K_BRICK:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(K_BRICK);
				setState(49);
				match(QUOTE);
				setState(50);
				match(NAME);
				setState(51);
				match(QUOTE);
				setState(52);
				match(O_BRACKET);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0)) {
					{
					{
					setState(53);
					property();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(C_BRACKET);
				}
				break;
			case M_PLATFROM:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(M_PLATFROM);
				setState(61);
				match(QUOTE);
				setState(62);
				match(NAME);
				setState(63);
				match(QUOTE);
				setState(64);
				match(O_BRACKET);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0)) {
					{
					{
					setState(65);
					property();
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71);
				match(C_BRACKET);
				}
				break;
			case C_POINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				match(C_POINT);
				setState(73);
				match(QUOTE);
				setState(74);
				match(NAME);
				setState(75);
				match(QUOTE);
				setState(76);
				match(O_BRACKET);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0)) {
					{
					{
					setState(77);
					property();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(C_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode SIZE() { return getToken(OBBYParser.SIZE, 0); }
		public List<TerminalNode> INT() { return getTokens(OBBYParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(OBBYParser.INT, i);
		}
		public TerminalNode COLOR() { return getToken(OBBYParser.COLOR, 0); }
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public TerminalNode MATERIAL() { return getToken(OBBYParser.MATERIAL, 0); }
		public TerminalNode NAME() { return getToken(OBBYParser.NAME, 0); }
		public TerminalNode ANCHORED() { return getToken(OBBYParser.ANCHORED, 0); }
		public TerminalNode SPEED() { return getToken(OBBYParser.SPEED, 0); }
		public TerminalNode DISTANCE() { return getToken(OBBYParser.DISTANCE, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OBBYParserListener ) ((OBBYParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OBBYParserListener ) ((OBBYParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OBBYParserVisitor ) return ((OBBYParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_property);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(SIZE);
				setState(87);
				match(INT);
				setState(88);
				match(INT);
				setState(89);
				match(INT);
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(COLOR);
				setState(91);
				num();
				setState(92);
				num();
				setState(93);
				num();
				}
				break;
			case MATERIAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(MATERIAL);
				setState(96);
				match(NAME);
				}
				break;
			case ANCHORED:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(ANCHORED);
				setState(98);
				match(NAME);
				}
				break;
			case SPEED:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				match(SPEED);
				setState(100);
				match(INT);
				}
				break;
			case DISTANCE:
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				match(DISTANCE);
				setState(102);
				match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(OBBYParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(OBBYParser.DOUBLE, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OBBYParserListener ) ((OBBYParserListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OBBYParserListener ) ((OBBYParserListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OBBYParserVisitor ) return ((OBBYParserVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0013l\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u0011\b\u0000\n\u0000\f\u0000\u0014\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u001e\b\u0001\n\u0001\f\u0001!\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002+\b\u0002\n\u0002\f\u0002.\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u00027\b\u0002\n\u0002\f\u0002:\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002C\b"+
		"\u0002\n\u0002\f\u0002F\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002O\b\u0002\n\u0002"+
		"\f\u0002R\t\u0002\u0001\u0002\u0003\u0002U\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003h\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000"+
		"\u0001\u0001\u0000\n\u000bt\u0000\n\u0001\u0000\u0000\u0000\u0002\u0017"+
		"\u0001\u0000\u0000\u0000\u0004T\u0001\u0000\u0000\u0000\u0006g\u0001\u0000"+
		"\u0000\u0000\bi\u0001\u0000\u0000\u0000\n\u000b\u0005\u0001\u0000\u0000"+
		"\u000b\f\u0005\u0007\u0000\u0000\f\r\u0005\b\u0000\u0000\r\u000e\u0005"+
		"\u0007\u0000\u0000\u000e\u0012\u0005\f\u0000\u0000\u000f\u0011\u0003\u0002"+
		"\u0001\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0011\u0014\u0001\u0000"+
		"\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000"+
		"\u0000\u0000\u0013\u0015\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0005\r\u0000\u0000\u0016\u0001\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0005\u0002\u0000\u0000\u0018\u0019\u0005\u0007\u0000"+
		"\u0000\u0019\u001a\u0005\b\u0000\u0000\u001a\u001b\u0005\u0007\u0000\u0000"+
		"\u001b\u001f\u0005\f\u0000\u0000\u001c\u001e\u0003\u0004\u0002\u0000\u001d"+
		"\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000"+
		"\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0005\r\u0000\u0000#\u0003"+
		"\u0001\u0000\u0000\u0000$%\u0005\u0003\u0000\u0000%&\u0005\u0007\u0000"+
		"\u0000&\'\u0005\b\u0000\u0000\'(\u0005\u0007\u0000\u0000(,\u0005\f\u0000"+
		"\u0000)+\u0003\u0006\u0003\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000"+
		"\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-/\u0001"+
		"\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/U\u0005\r\u0000\u000001\u0005"+
		"\u0004\u0000\u000012\u0005\u0007\u0000\u000023\u0005\b\u0000\u000034\u0005"+
		"\u0007\u0000\u000048\u0005\f\u0000\u000057\u0003\u0006\u0003\u000065\u0001"+
		"\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000"+
		"\u0000;U\u0005\r\u0000\u0000<=\u0005\u0005\u0000\u0000=>\u0005\u0007\u0000"+
		"\u0000>?\u0005\b\u0000\u0000?@\u0005\u0007\u0000\u0000@D\u0005\f\u0000"+
		"\u0000AC\u0003\u0006\u0003\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GU\u0005\r\u0000\u0000HI\u0005"+
		"\u0006\u0000\u0000IJ\u0005\u0007\u0000\u0000JK\u0005\b\u0000\u0000KL\u0005"+
		"\u0007\u0000\u0000LP\u0005\f\u0000\u0000MO\u0003\u0006\u0003\u0000NM\u0001"+
		"\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000SU\u0005\r\u0000\u0000T$\u0001\u0000\u0000\u0000T0\u0001\u0000\u0000"+
		"\u0000T<\u0001\u0000\u0000\u0000TH\u0001\u0000\u0000\u0000U\u0005\u0001"+
		"\u0000\u0000\u0000VW\u0005\u000e\u0000\u0000WX\u0005\n\u0000\u0000XY\u0005"+
		"\n\u0000\u0000Yh\u0005\n\u0000\u0000Z[\u0005\u0010\u0000\u0000[\\\u0003"+
		"\b\u0004\u0000\\]\u0003\b\u0004\u0000]^\u0003\b\u0004\u0000^h\u0001\u0000"+
		"\u0000\u0000_`\u0005\u000f\u0000\u0000`h\u0005\b\u0000\u0000ab\u0005\u0011"+
		"\u0000\u0000bh\u0005\b\u0000\u0000cd\u0005\u0012\u0000\u0000dh\u0005\n"+
		"\u0000\u0000ef\u0005\u0013\u0000\u0000fh\u0005\n\u0000\u0000gV\u0001\u0000"+
		"\u0000\u0000gZ\u0001\u0000\u0000\u0000g_\u0001\u0000\u0000\u0000ga\u0001"+
		"\u0000\u0000\u0000gc\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"h\u0007\u0001\u0000\u0000\u0000ij\u0007\u0000\u0000\u0000j\t\u0001\u0000"+
		"\u0000\u0000\b\u0012\u001f,8DPTg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}