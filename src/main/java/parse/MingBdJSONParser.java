// Generated from D:/mingBd-DSL/src/main/resources\MingBdJSON.g4 by ANTLR 4.8
package parse;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MingBdJSONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, STRING=31, 
		NUMBER=32, WS=33;
	public static final int
		RULE_json = 0, RULE_value = 1, RULE_pair = 2, RULE_runtype = 3, RULE_load = 4, 
		RULE_join = 5, RULE_trans = 6, RULE_dataSource = 7, RULE_mysqlSource = 8, 
		RULE_transinfo = 9, RULE_select = 10, RULE_cols = 11, RULE_col = 12, RULE_filter = 13, 
		RULE_save = 14, RULE_saveInfo = 15, RULE_kafkaSave = 16, RULE_mysqlSave = 17, 
		RULE_joinpair = 18, RULE_kafkaSource = 19, RULE_field = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"json", "value", "pair", "runtype", "load", "join", "trans", "dataSource", 
			"mysqlSource", "transinfo", "select", "cols", "col", "filter", "save", 
			"saveInfo", "kafkaSave", "mysqlSave", "joinpair", "kafkaSource", "field"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "'\"runMode\"'", "':'", "'\"stream\"'", "'\"batch\"'", 
			"'\"load\"'", "'['", "']'", "'\"join\"'", "'\"transform\"'", "'\"from\"'", 
			"'\"to\"'", "'\"cols\"'", "'('", "')'", "'\"condition\"'", "'\"save\"'", 
			"'\"zk\"'", "'\"btServers\"'", "'\"topic\"'", "'\"inputT\"'", "'\"conditionT\"'", 
			"'\"outputT\"'", "'\"groupId\"'", "'\"schema\"'", "'\"tableName\"'", 
			"'\"nameI\"'", "'\"aliasI\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "STRING", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "MingBdJSON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MingBdJSONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class JsonContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			value();
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

	public static class ValueContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(45);
			pair();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(46);
				match(T__1);
				setState(47);
				pair();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
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

	public static class PairContext extends ParserRuleContext {
		public RuntypeContext runtype() {
			return getRuleContext(RuntypeContext.class,0);
		}
		public LoadContext load() {
			return getRuleContext(LoadContext.class,0);
		}
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public TransContext trans() {
			return getRuleContext(TransContext.class,0);
		}
		public SaveContext save() {
			return getRuleContext(SaveContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pair);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				runtype();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				load();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				join();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				trans();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				save();
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

	public static class RuntypeContext extends ParserRuleContext {
		public RuntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterRuntype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitRuntype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitRuntype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuntypeContext runtype() throws RecognitionException {
		RuntypeContext _localctx = new RuntypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_runtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__3);
			setState(63);
			match(T__4);
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
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

	public static class LoadContext extends ParserRuleContext {
		public List<DataSourceContext> dataSource() {
			return getRuleContexts(DataSourceContext.class);
		}
		public DataSourceContext dataSource(int i) {
			return getRuleContext(DataSourceContext.class,i);
		}
		public LoadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterLoad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitLoad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitLoad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoadContext load() throws RecognitionException {
		LoadContext _localctx = new LoadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_load);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__7);
			setState(67);
			match(T__4);
			setState(68);
			match(T__8);
			setState(69);
			dataSource();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(70);
				match(T__1);
				setState(71);
				dataSource();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__9);
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

	public static class JoinContext extends ParserRuleContext {
		public List<JoinpairContext> joinpair() {
			return getRuleContexts(JoinpairContext.class);
		}
		public JoinpairContext joinpair(int i) {
			return getRuleContext(JoinpairContext.class,i);
		}
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_join);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__10);
			setState(80);
			match(T__4);
			setState(81);
			match(T__8);
			setState(82);
			joinpair();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(83);
				match(T__1);
				setState(84);
				joinpair();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(T__9);
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

	public static class TransContext extends ParserRuleContext {
		public List<TransinfoContext> transinfo() {
			return getRuleContexts(TransinfoContext.class);
		}
		public TransinfoContext transinfo(int i) {
			return getRuleContext(TransinfoContext.class,i);
		}
		public TransContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterTrans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitTrans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitTrans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransContext trans() throws RecognitionException {
		TransContext _localctx = new TransContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_trans);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__11);
			setState(93);
			match(T__4);
			setState(94);
			match(T__8);
			setState(95);
			transinfo();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(96);
				match(T__1);
				setState(97);
				transinfo();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(T__9);
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

	public static class DataSourceContext extends ParserRuleContext {
		public KafkaSourceContext kafkaSource() {
			return getRuleContext(KafkaSourceContext.class,0);
		}
		public MysqlSourceContext mysqlSource() {
			return getRuleContext(MysqlSourceContext.class,0);
		}
		public DataSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterDataSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitDataSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitDataSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataSourceContext dataSource() throws RecognitionException {
		DataSourceContext _localctx = new DataSourceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dataSource);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				kafkaSource();
				}
				break;
			case T__1:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				mysqlSource();
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

	public static class MysqlSourceContext extends ParserRuleContext {
		public MysqlSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mysqlSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterMysqlSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitMysqlSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitMysqlSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MysqlSourceContext mysqlSource() throws RecognitionException {
		MysqlSourceContext _localctx = new MysqlSourceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mysqlSource);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class TransinfoContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public TransinfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transinfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterTransinfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitTransinfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitTransinfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransinfoContext transinfo() throws RecognitionException {
		TransinfoContext _localctx = new TransinfoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_transinfo);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				select();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				filter();
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

	public static class SelectContext extends ParserRuleContext {
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(MingBdJSONParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MingBdJSONParser.STRING, i);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__0);
			setState(116);
			cols();
			setState(117);
			match(T__1);
			setState(118);
			match(T__12);
			setState(119);
			match(T__4);
			setState(120);
			match(STRING);
			setState(121);
			match(T__1);
			setState(122);
			match(T__13);
			setState(123);
			match(T__4);
			setState(124);
			match(STRING);
			setState(125);
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

	public static class ColsContext extends ParserRuleContext {
		public List<ColContext> col() {
			return getRuleContexts(ColContext.class);
		}
		public ColContext col(int i) {
			return getRuleContext(ColContext.class,i);
		}
		public ColsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterCols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitCols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitCols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColsContext cols() throws RecognitionException {
		ColsContext _localctx = new ColsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__14);
			setState(128);
			match(T__4);
			setState(129);
			match(T__8);
			setState(130);
			col();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(131);
				match(T__1);
				setState(132);
				col();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(T__9);
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

	public static class ColContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MingBdJSONParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MingBdJSONParser.STRING, i);
		}
		public ColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitCol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitCol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColContext col() throws RecognitionException {
		ColContext _localctx = new ColContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_col);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(STRING);
				setState(142);
				match(T__15);
				setState(143);
				match(STRING);
				setState(144);
				match(T__16);
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

	public static class FilterContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MingBdJSONParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MingBdJSONParser.STRING, i);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__0);
			setState(148);
			match(T__17);
			setState(149);
			match(T__4);
			setState(150);
			match(STRING);
			setState(151);
			match(T__1);
			setState(152);
			match(T__12);
			setState(153);
			match(T__4);
			setState(154);
			match(STRING);
			setState(155);
			match(T__1);
			setState(156);
			match(T__13);
			setState(157);
			match(T__4);
			setState(158);
			match(STRING);
			setState(159);
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

	public static class SaveContext extends ParserRuleContext {
		public List<SaveInfoContext> saveInfo() {
			return getRuleContexts(SaveInfoContext.class);
		}
		public SaveInfoContext saveInfo(int i) {
			return getRuleContext(SaveInfoContext.class,i);
		}
		public SaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_save; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterSave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitSave(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitSave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaveContext save() throws RecognitionException {
		SaveContext _localctx = new SaveContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_save);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__18);
			setState(162);
			match(T__4);
			setState(163);
			match(T__8);
			setState(164);
			saveInfo();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(165);
				match(T__1);
				setState(166);
				saveInfo();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(T__9);
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

	public static class SaveInfoContext extends ParserRuleContext {
		public KafkaSaveContext kafkaSave() {
			return getRuleContext(KafkaSaveContext.class,0);
		}
		public MysqlSaveContext mysqlSave() {
			return getRuleContext(MysqlSaveContext.class,0);
		}
		public SaveInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saveInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterSaveInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitSaveInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitSaveInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaveInfoContext saveInfo() throws RecognitionException {
		SaveInfoContext _localctx = new SaveInfoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_saveInfo);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				kafkaSave();
				}
				break;
			case T__1:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				mysqlSave();
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

	public static class KafkaSaveContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MingBdJSONParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MingBdJSONParser.STRING, i);
		}
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public KafkaSaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kafkaSave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterKafkaSave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitKafkaSave(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitKafkaSave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KafkaSaveContext kafkaSave() throws RecognitionException {
		KafkaSaveContext _localctx = new KafkaSaveContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_kafkaSave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__0);
			setState(179);
			match(T__19);
			setState(180);
			match(T__4);
			setState(181);
			match(STRING);
			setState(182);
			match(T__1);
			setState(183);
			match(T__20);
			setState(184);
			match(T__4);
			setState(185);
			match(STRING);
			setState(186);
			match(T__1);
			setState(187);
			match(T__21);
			setState(188);
			match(T__4);
			setState(189);
			match(STRING);
			setState(190);
			match(T__1);
			setState(191);
			match(T__12);
			setState(192);
			match(T__4);
			setState(193);
			match(STRING);
			setState(194);
			match(T__1);
			setState(195);
			cols();
			setState(196);
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

	public static class MysqlSaveContext extends ParserRuleContext {
		public MysqlSaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mysqlSave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterMysqlSave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitMysqlSave(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitMysqlSave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MysqlSaveContext mysqlSave() throws RecognitionException {
		MysqlSaveContext _localctx = new MysqlSaveContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mysqlSave);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class JoinpairContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MingBdJSONParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MingBdJSONParser.STRING, i);
		}
		public JoinpairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinpair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterJoinpair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitJoinpair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitJoinpair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinpairContext joinpair() throws RecognitionException {
		JoinpairContext _localctx = new JoinpairContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_joinpair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__0);
			setState(201);
			match(T__22);
			setState(202);
			match(T__4);
			setState(203);
			match(T__8);
			setState(204);
			match(STRING);
			setState(205);
			match(T__1);
			setState(206);
			match(STRING);
			setState(207);
			match(T__9);
			setState(208);
			match(T__1);
			setState(209);
			match(T__23);
			setState(210);
			match(T__4);
			setState(211);
			match(T__8);
			setState(212);
			match(STRING);
			setState(213);
			match(T__9);
			setState(214);
			match(T__1);
			setState(215);
			match(T__24);
			setState(216);
			match(T__4);
			setState(217);
			match(STRING);
			setState(218);
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

	public static class KafkaSourceContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MingBdJSONParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MingBdJSONParser.STRING, i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public KafkaSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kafkaSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterKafkaSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitKafkaSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitKafkaSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KafkaSourceContext kafkaSource() throws RecognitionException {
		KafkaSourceContext _localctx = new KafkaSourceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_kafkaSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__0);
			setState(221);
			match(T__19);
			setState(222);
			match(T__4);
			setState(223);
			match(STRING);
			setState(224);
			match(T__1);
			setState(225);
			match(T__20);
			setState(226);
			match(T__4);
			setState(227);
			match(STRING);
			setState(228);
			match(T__1);
			setState(229);
			match(T__21);
			setState(230);
			match(T__4);
			setState(231);
			match(STRING);
			setState(232);
			match(T__1);
			setState(233);
			match(T__25);
			setState(234);
			match(T__4);
			setState(235);
			match(STRING);
			setState(236);
			match(T__1);
			setState(237);
			match(T__26);
			setState(238);
			match(T__4);
			setState(239);
			match(T__8);
			setState(240);
			field();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(241);
				match(T__1);
				setState(242);
				field();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(T__9);
			setState(249);
			match(T__1);
			setState(250);
			match(T__27);
			setState(251);
			match(T__4);
			setState(252);
			match(STRING);
			setState(253);
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

	public static class FieldContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MingBdJSONParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MingBdJSONParser.STRING, i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__0);
			setState(256);
			match(T__28);
			setState(257);
			match(T__4);
			setState(258);
			match(STRING);
			setState(259);
			match(T__1);
			setState(260);
			match(T__29);
			setState(261);
			match(T__4);
			setState(262);
			match(STRING);
			setState(263);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u010c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3\7\3\63"+
		"\n\3\f\3\16\3\66\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\be\n\b\f\b\16\bh\13\b\3\b\3\b\3\t\3\t\5\tn\n\t\3\n\3\n\3\13\3\13\5"+
		"\13t\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\7\r\u0088\n\r\f\r\16\r\u008b\13\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0094\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00aa\n\20"+
		"\f\20\16\20\u00ad\13\20\3\20\3\20\3\21\3\21\5\21\u00b3\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00f6\n\25\f\25\16\25\u00f9\13"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*\2\3\3\2\b\t\2\u0105\2,\3\2\2\2\4.\3\2\2\2\6>\3\2\2\2\b@\3\2\2"+
		"\2\nD\3\2\2\2\fQ\3\2\2\2\16^\3\2\2\2\20m\3\2\2\2\22o\3\2\2\2\24s\3\2\2"+
		"\2\26u\3\2\2\2\30\u0081\3\2\2\2\32\u0093\3\2\2\2\34\u0095\3\2\2\2\36\u00a3"+
		"\3\2\2\2 \u00b2\3\2\2\2\"\u00b4\3\2\2\2$\u00c8\3\2\2\2&\u00ca\3\2\2\2"+
		"(\u00de\3\2\2\2*\u0101\3\2\2\2,-\5\4\3\2-\3\3\2\2\2./\7\3\2\2/\64\5\6"+
		"\4\2\60\61\7\4\2\2\61\63\5\6\4\2\62\60\3\2\2\2\63\66\3\2\2\2\64\62\3\2"+
		"\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\5\2\28\5\3\2\2\2"+
		"9?\5\b\5\2:?\5\n\6\2;?\5\f\7\2<?\5\16\b\2=?\5\36\20\2>9\3\2\2\2>:\3\2"+
		"\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\7\3\2\2\2@A\7\6\2\2AB\7\7\2\2BC\t"+
		"\2\2\2C\t\3\2\2\2DE\7\n\2\2EF\7\7\2\2FG\7\13\2\2GL\5\20\t\2HI\7\4\2\2"+
		"IK\5\20\t\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2"+
		"\2OP\7\f\2\2P\13\3\2\2\2QR\7\r\2\2RS\7\7\2\2ST\7\13\2\2TY\5&\24\2UV\7"+
		"\4\2\2VX\5&\24\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y"+
		"\3\2\2\2\\]\7\f\2\2]\r\3\2\2\2^_\7\16\2\2_`\7\7\2\2`a\7\13\2\2af\5\24"+
		"\13\2bc\7\4\2\2ce\5\24\13\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi"+
		"\3\2\2\2hf\3\2\2\2ij\7\f\2\2j\17\3\2\2\2kn\5(\25\2ln\5\22\n\2mk\3\2\2"+
		"\2ml\3\2\2\2n\21\3\2\2\2op\3\2\2\2p\23\3\2\2\2qt\5\26\f\2rt\5\34\17\2"+
		"sq\3\2\2\2sr\3\2\2\2t\25\3\2\2\2uv\7\3\2\2vw\5\30\r\2wx\7\4\2\2xy\7\17"+
		"\2\2yz\7\7\2\2z{\7!\2\2{|\7\4\2\2|}\7\20\2\2}~\7\7\2\2~\177\7!\2\2\177"+
		"\u0080\7\5\2\2\u0080\27\3\2\2\2\u0081\u0082\7\21\2\2\u0082\u0083\7\7\2"+
		"\2\u0083\u0084\7\13\2\2\u0084\u0089\5\32\16\2\u0085\u0086\7\4\2\2\u0086"+
		"\u0088\5\32\16\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008d\7\f\2\2\u008d\31\3\2\2\2\u008e\u0094\7!\2\2\u008f\u0090\7!\2\2"+
		"\u0090\u0091\7\22\2\2\u0091\u0092\7!\2\2\u0092\u0094\7\23\2\2\u0093\u008e"+
		"\3\2\2\2\u0093\u008f\3\2\2\2\u0094\33\3\2\2\2\u0095\u0096\7\3\2\2\u0096"+
		"\u0097\7\24\2\2\u0097\u0098\7\7\2\2\u0098\u0099\7!\2\2\u0099\u009a\7\4"+
		"\2\2\u009a\u009b\7\17\2\2\u009b\u009c\7\7\2\2\u009c\u009d\7!\2\2\u009d"+
		"\u009e\7\4\2\2\u009e\u009f\7\20\2\2\u009f\u00a0\7\7\2\2\u00a0\u00a1\7"+
		"!\2\2\u00a1\u00a2\7\5\2\2\u00a2\35\3\2\2\2\u00a3\u00a4\7\25\2\2\u00a4"+
		"\u00a5\7\7\2\2\u00a5\u00a6\7\13\2\2\u00a6\u00ab\5 \21\2\u00a7\u00a8\7"+
		"\4\2\2\u00a8\u00aa\5 \21\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\u00af\7\f\2\2\u00af\37\3\2\2\2\u00b0\u00b3\5\"\22\2\u00b1\u00b3"+
		"\5$\23\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3!\3\2\2\2\u00b4"+
		"\u00b5\7\3\2\2\u00b5\u00b6\7\26\2\2\u00b6\u00b7\7\7\2\2\u00b7\u00b8\7"+
		"!\2\2\u00b8\u00b9\7\4\2\2\u00b9\u00ba\7\27\2\2\u00ba\u00bb\7\7\2\2\u00bb"+
		"\u00bc\7!\2\2\u00bc\u00bd\7\4\2\2\u00bd\u00be\7\30\2\2\u00be\u00bf\7\7"+
		"\2\2\u00bf\u00c0\7!\2\2\u00c0\u00c1\7\4\2\2\u00c1\u00c2\7\17\2\2\u00c2"+
		"\u00c3\7\7\2\2\u00c3\u00c4\7!\2\2\u00c4\u00c5\7\4\2\2\u00c5\u00c6\5\30"+
		"\r\2\u00c6\u00c7\7\5\2\2\u00c7#\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9%\3\2"+
		"\2\2\u00ca\u00cb\7\3\2\2\u00cb\u00cc\7\31\2\2\u00cc\u00cd\7\7\2\2\u00cd"+
		"\u00ce\7\13\2\2\u00ce\u00cf\7!\2\2\u00cf\u00d0\7\4\2\2\u00d0\u00d1\7!"+
		"\2\2\u00d1\u00d2\7\f\2\2\u00d2\u00d3\7\4\2\2\u00d3\u00d4\7\32\2\2\u00d4"+
		"\u00d5\7\7\2\2\u00d5\u00d6\7\13\2\2\u00d6\u00d7\7!\2\2\u00d7\u00d8\7\f"+
		"\2\2\u00d8\u00d9\7\4\2\2\u00d9\u00da\7\33\2\2\u00da\u00db\7\7\2\2\u00db"+
		"\u00dc\7!\2\2\u00dc\u00dd\7\5\2\2\u00dd\'\3\2\2\2\u00de\u00df\7\3\2\2"+
		"\u00df\u00e0\7\26\2\2\u00e0\u00e1\7\7\2\2\u00e1\u00e2\7!\2\2\u00e2\u00e3"+
		"\7\4\2\2\u00e3\u00e4\7\27\2\2\u00e4\u00e5\7\7\2\2\u00e5\u00e6\7!\2\2\u00e6"+
		"\u00e7\7\4\2\2\u00e7\u00e8\7\30\2\2\u00e8\u00e9\7\7\2\2\u00e9\u00ea\7"+
		"!\2\2\u00ea\u00eb\7\4\2\2\u00eb\u00ec\7\34\2\2\u00ec\u00ed\7\7\2\2\u00ed"+
		"\u00ee\7!\2\2\u00ee\u00ef\7\4\2\2\u00ef\u00f0\7\35\2\2\u00f0\u00f1\7\7"+
		"\2\2\u00f1\u00f2\7\13\2\2\u00f2\u00f7\5*\26\2\u00f3\u00f4\7\4\2\2\u00f4"+
		"\u00f6\5*\26\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fb\7\f\2\2\u00fb\u00fc\7\4\2\2\u00fc\u00fd\7\36\2\2\u00fd\u00fe\7"+
		"\7\2\2\u00fe\u00ff\7!\2\2\u00ff\u0100\7\5\2\2\u0100)\3\2\2\2\u0101\u0102"+
		"\7\3\2\2\u0102\u0103\7\37\2\2\u0103\u0104\7\7\2\2\u0104\u0105\7!\2\2\u0105"+
		"\u0106\7\4\2\2\u0106\u0107\7 \2\2\u0107\u0108\7\7\2\2\u0108\u0109\7!\2"+
		"\2\u0109\u010a\7\5\2\2\u010a+\3\2\2\2\16\64>LYfms\u0089\u0093\u00ab\u00b2"+
		"\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}