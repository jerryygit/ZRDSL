// Generated from D:/MyWorkSpace/zrDSL-flink/src/main/resources\MingBdJSON.g4 by ANTLR 4.8
package parse;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, STRING=42, FUNCNAME=43, BLOCK_STRING=44, 
		NUMBER=45, WS=46;
	public static final int
		RULE_json = 0, RULE_value = 1, RULE_pair = 2, RULE_runtype = 3, RULE_load = 4, 
		RULE_join = 5, RULE_trans = 6, RULE_dataSource = 7, RULE_hbaseSource = 8, 
		RULE_mysqlSource = 9, RULE_mysqlInfo = 10, RULE_mysqlSchema = 11, RULE_transinfo = 12, 
		RULE_select = 13, RULE_groupBy = 14, RULE_filter = 15, RULE_cols = 16, 
		RULE_col = 17, RULE_save = 18, RULE_saveInfo = 19, RULE_kafkaSave = 20, 
		RULE_mysqlSave = 21, RULE_joinpair = 22, RULE_kafkaSource = 23, RULE_field = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"json", "value", "pair", "runtype", "load", "join", "trans", "dataSource", 
			"hbaseSource", "mysqlSource", "mysqlInfo", "mysqlSchema", "transinfo", 
			"select", "groupBy", "filter", "cols", "col", "save", "saveInfo", "kafkaSave", 
			"mysqlSave", "joinpair", "kafkaSource", "field"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "'\"runMode\"'", "':'", "'\"stream\"'", "'\"batch\"'", 
			"'\"load\"'", "'['", "']'", "'\"join\"'", "'\"transform\"'", "'\"zkQuorum\"'", 
			"'\"table\"'", "'\"info\"'", "'\"schema\"'", "'\"tableName\"'", "'\"driver\"'", 
			"'\"url\"'", "'\"user\"'", "'\"pass\"'", "'\"query\"'", "'\"from\"'", 
			"'\"to\"'", "'\"distinct\"'", "'true'", "'false'", "'\"group\"'", "'\"condition\"'", 
			"'\"cols\"'", "'\"save\"'", "'\"zk\"'", "'\"btServers\"'", "'\"topic\"'", 
			"'\"types\"'", "'\"inputT\"'", "'\"conditionT\"'", "'\"outputT\"'", "'\"groupId\"'", 
			"'\"nameI\"'", "'\"aliasI\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "STRING", "FUNCNAME", "BLOCK_STRING", 
			"NUMBER", "WS"
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
			setState(50);
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
			setState(52);
			match(T__0);
			setState(53);
			pair();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(54);
				match(T__1);
				setState(55);
				pair();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
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
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				runtype();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				load();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				join();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				trans();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
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
			setState(70);
			match(T__3);
			setState(71);
			match(T__4);
			setState(72);
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
			setState(74);
			match(T__7);
			setState(75);
			match(T__4);
			setState(76);
			match(T__8);
			setState(77);
			dataSource();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(78);
				match(T__1);
				setState(79);
				dataSource();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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
			setState(87);
			match(T__10);
			setState(88);
			match(T__4);
			setState(89);
			match(T__8);
			setState(90);
			joinpair();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(91);
				match(T__1);
				setState(92);
				joinpair();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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
			setState(100);
			match(T__11);
			setState(101);
			match(T__4);
			setState(102);
			match(T__8);
			setState(103);
			transinfo();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(104);
				match(T__1);
				setState(105);
				transinfo();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
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
		public HbaseSourceContext hbaseSource() {
			return getRuleContext(HbaseSourceContext.class,0);
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				kafkaSource();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				hbaseSource();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				mysqlSource();
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

	public static class HbaseSourceContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MingBdJSONParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MingBdJSONParser.STRING, i);
		}
		public HbaseSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hbaseSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterHbaseSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitHbaseSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitHbaseSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HbaseSourceContext hbaseSource() throws RecognitionException {
		HbaseSourceContext _localctx = new HbaseSourceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_hbaseSource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__0);
			setState(119);
			match(T__12);
			setState(120);
			match(T__4);
			setState(121);
			match(STRING);
			setState(122);
			match(T__1);
			setState(123);
			match(T__13);
			setState(124);
			match(T__4);
			setState(125);
			match(STRING);
			setState(126);
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

	public static class MysqlSourceContext extends ParserRuleContext {
		public MysqlInfoContext mysqlInfo() {
			return getRuleContext(MysqlInfoContext.class,0);
		}
		public MysqlSchemaContext mysqlSchema() {
			return getRuleContext(MysqlSchemaContext.class,0);
		}
		public TerminalNode STRING() { return getToken(MingBdJSONParser.STRING, 0); }
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
		enterRule(_localctx, 18, RULE_mysqlSource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__0);
			setState(129);
			match(T__14);
			setState(130);
			match(T__4);
			setState(131);
			mysqlInfo();
			setState(132);
			match(T__1);
			setState(133);
			match(T__15);
			setState(134);
			match(T__4);
			setState(135);
			mysqlSchema();
			setState(136);
			match(T__1);
			setState(137);
			match(T__16);
			setState(138);
			match(T__4);
			setState(139);
			match(STRING);
			setState(140);
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

	public static class MysqlInfoContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MingBdJSONParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MingBdJSONParser.STRING, i);
		}
		public MysqlInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mysqlInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterMysqlInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitMysqlInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitMysqlInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MysqlInfoContext mysqlInfo() throws RecognitionException {
		MysqlInfoContext _localctx = new MysqlInfoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mysqlInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__0);
			setState(143);
			match(T__17);
			setState(144);
			match(T__4);
			setState(145);
			match(STRING);
			setState(146);
			match(T__1);
			setState(147);
			match(T__18);
			setState(148);
			match(T__4);
			setState(149);
			match(STRING);
			setState(150);
			match(T__1);
			setState(151);
			match(T__19);
			setState(152);
			match(T__4);
			setState(153);
			match(STRING);
			setState(154);
			match(T__1);
			setState(155);
			match(T__20);
			setState(156);
			match(T__4);
			setState(157);
			match(STRING);
			setState(158);
			match(T__1);
			setState(159);
			match(T__21);
			setState(160);
			match(T__4);
			setState(161);
			match(STRING);
			setState(162);
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

	public static class MysqlSchemaContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MingBdJSONParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MingBdJSONParser.STRING, i);
		}
		public MysqlSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mysqlSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterMysqlSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitMysqlSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitMysqlSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MysqlSchemaContext mysqlSchema() throws RecognitionException {
		MysqlSchemaContext _localctx = new MysqlSchemaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mysqlSchema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__8);
			setState(165);
			match(STRING);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(166);
				match(T__1);
				setState(167);
				match(STRING);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
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

	public static class TransinfoContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
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
		enterRule(_localctx, 24, RULE_transinfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			select();
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
		public GroupByContext groupBy() {
			return getRuleContext(GroupByContext.class,0);
		}
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
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
		enterRule(_localctx, 26, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__0);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(178);
				groupBy();
				setState(179);
				match(T__1);
				}
			}

			setState(183);
			cols();
			setState(184);
			match(T__1);
			setState(185);
			match(T__22);
			setState(186);
			match(T__4);
			setState(187);
			match(STRING);
			setState(188);
			match(T__1);
			setState(189);
			match(T__23);
			setState(190);
			match(T__4);
			setState(191);
			match(STRING);
			setState(192);
			match(T__1);
			setState(193);
			match(T__24);
			setState(194);
			match(T__4);
			setState(195);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(196);
				match(T__1);
				setState(197);
				filter();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
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

	public static class GroupByContext extends ParserRuleContext {
		public List<ColContext> col() {
			return getRuleContexts(ColContext.class);
		}
		public ColContext col(int i) {
			return getRuleContext(ColContext.class,i);
		}
		public GroupByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).enterGroupBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MingBdJSONListener ) ((MingBdJSONListener)listener).exitGroupBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MingBdJSONVisitor ) return ((MingBdJSONVisitor<? extends T>)visitor).visitGroupBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByContext groupBy() throws RecognitionException {
		GroupByContext _localctx = new GroupByContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_groupBy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__27);
			setState(206);
			match(T__4);
			setState(207);
			match(T__8);
			setState(208);
			col();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(209);
				match(T__1);
				setState(210);
				col();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
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

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MingBdJSONParser.STRING, 0); }
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
		enterRule(_localctx, 30, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__28);
			setState(219);
			match(T__4);
			setState(220);
			match(STRING);
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
		enterRule(_localctx, 32, RULE_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__29);
			setState(223);
			match(T__4);
			setState(224);
			match(T__8);
			setState(225);
			col();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(226);
				match(T__1);
				setState(227);
				col();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
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
		public TerminalNode STRING() { return getToken(MingBdJSONParser.STRING, 0); }
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
		enterRule(_localctx, 34, RULE_col);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(STRING);
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
		enterRule(_localctx, 36, RULE_save);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__30);
			setState(238);
			match(T__4);
			setState(239);
			match(T__8);
			setState(240);
			saveInfo();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(241);
				match(T__1);
				setState(242);
				saveInfo();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
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
		enterRule(_localctx, 38, RULE_saveInfo);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				kafkaSave();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				mysqlSave();
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

	public static class KafkaSaveContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MingBdJSONParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MingBdJSONParser.STRING, i);
		}
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public List<ColContext> col() {
			return getRuleContexts(ColContext.class);
		}
		public ColContext col(int i) {
			return getRuleContext(ColContext.class,i);
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
		enterRule(_localctx, 40, RULE_kafkaSave);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__0);
			setState(255);
			match(T__31);
			setState(256);
			match(T__4);
			setState(257);
			match(STRING);
			setState(258);
			match(T__1);
			setState(259);
			match(T__32);
			setState(260);
			match(T__4);
			setState(261);
			match(STRING);
			setState(262);
			match(T__1);
			setState(263);
			match(T__33);
			setState(264);
			match(T__4);
			setState(265);
			match(STRING);
			setState(266);
			match(T__1);
			setState(267);
			match(T__22);
			setState(268);
			match(T__4);
			setState(269);
			match(STRING);
			setState(270);
			match(T__1);
			setState(271);
			cols();
			setState(272);
			match(T__1);
			setState(273);
			match(T__34);
			setState(274);
			match(T__4);
			setState(275);
			match(T__8);
			setState(276);
			col();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(277);
				match(T__1);
				setState(278);
				col();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
			match(T__9);
			setState(285);
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
		public MysqlInfoContext mysqlInfo() {
			return getRuleContext(MysqlInfoContext.class,0);
		}
		public MysqlSchemaContext mysqlSchema() {
			return getRuleContext(MysqlSchemaContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(MingBdJSONParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MingBdJSONParser.STRING, i);
		}
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
		enterRule(_localctx, 42, RULE_mysqlSave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__0);
			setState(288);
			match(T__14);
			setState(289);
			match(T__4);
			setState(290);
			mysqlInfo();
			setState(291);
			match(T__1);
			setState(292);
			match(T__15);
			setState(293);
			match(T__4);
			setState(294);
			mysqlSchema();
			setState(295);
			match(T__1);
			setState(296);
			match(T__22);
			setState(297);
			match(T__4);
			setState(298);
			match(STRING);
			setState(299);
			match(T__1);
			setState(300);
			match(T__23);
			setState(301);
			match(T__4);
			setState(302);
			match(STRING);
			setState(303);
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
		enterRule(_localctx, 44, RULE_joinpair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__0);
			setState(306);
			match(T__35);
			setState(307);
			match(T__4);
			setState(308);
			match(T__8);
			setState(309);
			match(STRING);
			setState(310);
			match(T__1);
			setState(311);
			match(STRING);
			setState(312);
			match(T__9);
			setState(313);
			match(T__1);
			setState(314);
			match(T__36);
			setState(315);
			match(T__4);
			setState(316);
			match(T__8);
			setState(317);
			match(STRING);
			setState(318);
			match(T__9);
			setState(319);
			match(T__1);
			setState(320);
			match(T__37);
			setState(321);
			match(T__4);
			setState(322);
			match(STRING);
			setState(323);
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
		enterRule(_localctx, 46, RULE_kafkaSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__0);
			setState(326);
			match(T__31);
			setState(327);
			match(T__4);
			setState(328);
			match(STRING);
			setState(329);
			match(T__1);
			setState(330);
			match(T__32);
			setState(331);
			match(T__4);
			setState(332);
			match(STRING);
			setState(333);
			match(T__1);
			setState(334);
			match(T__33);
			setState(335);
			match(T__4);
			setState(336);
			match(STRING);
			setState(337);
			match(T__1);
			setState(338);
			match(T__38);
			setState(339);
			match(T__4);
			setState(340);
			match(STRING);
			setState(341);
			match(T__1);
			setState(342);
			match(T__15);
			setState(343);
			match(T__4);
			setState(344);
			match(T__8);
			setState(345);
			field();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(346);
				match(T__1);
				setState(347);
				field();
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			match(T__9);
			setState(354);
			match(T__1);
			setState(355);
			match(T__16);
			setState(356);
			match(T__4);
			setState(357);
			match(STRING);
			setState(358);
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
		enterRule(_localctx, 48, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(T__0);
			setState(361);
			match(T__39);
			setState(362);
			match(T__4);
			setState(363);
			match(STRING);
			setState(364);
			match(T__1);
			setState(365);
			match(T__40);
			setState(366);
			match(T__4);
			setState(367);
			match(STRING);
			setState(368);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0175\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\5\4G\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"S\n\6\f\6\16\6V\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7`\n\7\f\7\16\7"+
		"c\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b\3\b\3\b"+
		"\3\t\3\t\3\t\5\tw\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u00ab\n\r\f\r\16\r\u00ae\13\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\5\17\u00b8\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00c9\n\17\f\17\16"+
		"\17\u00cc\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d6\n\20"+
		"\f\20\16\20\u00d9\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\7\22\u00e7\n\22\f\22\16\22\u00ea\13\22\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00f6\n\24\f\24\16\24\u00f9\13"+
		"\24\3\24\3\24\3\25\3\25\5\25\u00ff\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u011a\n\26\f\26\16\26\u011d\13\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u015f\n\31\f\31\16\31\u0162\13"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\2\4\3\2\b\t\3\2\34\35\2\u016e\2\64\3\2\2\2\4\66\3\2\2"+
		"\2\6F\3\2\2\2\bH\3\2\2\2\nL\3\2\2\2\fY\3\2\2\2\16f\3\2\2\2\20v\3\2\2\2"+
		"\22x\3\2\2\2\24\u0082\3\2\2\2\26\u0090\3\2\2\2\30\u00a6\3\2\2\2\32\u00b1"+
		"\3\2\2\2\34\u00b3\3\2\2\2\36\u00cf\3\2\2\2 \u00dc\3\2\2\2\"\u00e0\3\2"+
		"\2\2$\u00ed\3\2\2\2&\u00ef\3\2\2\2(\u00fe\3\2\2\2*\u0100\3\2\2\2,\u0121"+
		"\3\2\2\2.\u0133\3\2\2\2\60\u0147\3\2\2\2\62\u016a\3\2\2\2\64\65\5\4\3"+
		"\2\65\3\3\2\2\2\66\67\7\3\2\2\67<\5\6\4\289\7\4\2\29;\5\6\4\2:8\3\2\2"+
		"\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\5\2\2@\5\3\2"+
		"\2\2AG\5\b\5\2BG\5\n\6\2CG\5\f\7\2DG\5\16\b\2EG\5&\24\2FA\3\2\2\2FB\3"+
		"\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2G\7\3\2\2\2HI\7\6\2\2IJ\7\7\2\2JK"+
		"\t\2\2\2K\t\3\2\2\2LM\7\n\2\2MN\7\7\2\2NO\7\13\2\2OT\5\20\t\2PQ\7\4\2"+
		"\2QS\5\20\t\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2"+
		"\2\2WX\7\f\2\2X\13\3\2\2\2YZ\7\r\2\2Z[\7\7\2\2[\\\7\13\2\2\\a\5.\30\2"+
		"]^\7\4\2\2^`\5.\30\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2"+
		"ca\3\2\2\2de\7\f\2\2e\r\3\2\2\2fg\7\16\2\2gh\7\7\2\2hi\7\13\2\2in\5\32"+
		"\16\2jk\7\4\2\2km\5\32\16\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq"+
		"\3\2\2\2pn\3\2\2\2qr\7\f\2\2r\17\3\2\2\2sw\5\60\31\2tw\5\22\n\2uw\5\24"+
		"\13\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\21\3\2\2\2xy\7\3\2\2yz\7\17\2\2z"+
		"{\7\7\2\2{|\7,\2\2|}\7\4\2\2}~\7\20\2\2~\177\7\7\2\2\177\u0080\7,\2\2"+
		"\u0080\u0081\7\5\2\2\u0081\23\3\2\2\2\u0082\u0083\7\3\2\2\u0083\u0084"+
		"\7\21\2\2\u0084\u0085\7\7\2\2\u0085\u0086\5\26\f\2\u0086\u0087\7\4\2\2"+
		"\u0087\u0088\7\22\2\2\u0088\u0089\7\7\2\2\u0089\u008a\5\30\r\2\u008a\u008b"+
		"\7\4\2\2\u008b\u008c\7\23\2\2\u008c\u008d\7\7\2\2\u008d\u008e\7,\2\2\u008e"+
		"\u008f\7\5\2\2\u008f\25\3\2\2\2\u0090\u0091\7\3\2\2\u0091\u0092\7\24\2"+
		"\2\u0092\u0093\7\7\2\2\u0093\u0094\7,\2\2\u0094\u0095\7\4\2\2\u0095\u0096"+
		"\7\25\2\2\u0096\u0097\7\7\2\2\u0097\u0098\7,\2\2\u0098\u0099\7\4\2\2\u0099"+
		"\u009a\7\26\2\2\u009a\u009b\7\7\2\2\u009b\u009c\7,\2\2\u009c\u009d\7\4"+
		"\2\2\u009d\u009e\7\27\2\2\u009e\u009f\7\7\2\2\u009f\u00a0\7,\2\2\u00a0"+
		"\u00a1\7\4\2\2\u00a1\u00a2\7\30\2\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\7"+
		",\2\2\u00a4\u00a5\7\5\2\2\u00a5\27\3\2\2\2\u00a6\u00a7\7\13\2\2\u00a7"+
		"\u00ac\7,\2\2\u00a8\u00a9\7\4\2\2\u00a9\u00ab\7,\2\2\u00aa\u00a8\3\2\2"+
		"\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\f\2\2\u00b0\31\3\2\2\2\u00b1"+
		"\u00b2\5\34\17\2\u00b2\33\3\2\2\2\u00b3\u00b7\7\3\2\2\u00b4\u00b5\5\36"+
		"\20\2\u00b5\u00b6\7\4\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\5\"\22\2\u00ba\u00bb\7"+
		"\4\2\2\u00bb\u00bc\7\31\2\2\u00bc\u00bd\7\7\2\2\u00bd\u00be\7,\2\2\u00be"+
		"\u00bf\7\4\2\2\u00bf\u00c0\7\32\2\2\u00c0\u00c1\7\7\2\2\u00c1\u00c2\7"+
		",\2\2\u00c2\u00c3\7\4\2\2\u00c3\u00c4\7\33\2\2\u00c4\u00c5\7\7\2\2\u00c5"+
		"\u00ca\t\3\2\2\u00c6\u00c7\7\4\2\2\u00c7\u00c9\5 \21\2\u00c8\u00c6\3\2"+
		"\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\5\2\2\u00ce\35\3\2\2"+
		"\2\u00cf\u00d0\7\36\2\2\u00d0\u00d1\7\7\2\2\u00d1\u00d2\7\13\2\2\u00d2"+
		"\u00d7\5$\23\2\u00d3\u00d4\7\4\2\2\u00d4\u00d6\5$\23\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\f\2\2\u00db\37\3\2\2"+
		"\2\u00dc\u00dd\7\37\2\2\u00dd\u00de\7\7\2\2\u00de\u00df\7,\2\2\u00df!"+
		"\3\2\2\2\u00e0\u00e1\7 \2\2\u00e1\u00e2\7\7\2\2\u00e2\u00e3\7\13\2\2\u00e3"+
		"\u00e8\5$\23\2\u00e4\u00e5\7\4\2\2\u00e5\u00e7\5$\23\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7\f\2\2\u00ec#\3\2\2\2"+
		"\u00ed\u00ee\7,\2\2\u00ee%\3\2\2\2\u00ef\u00f0\7!\2\2\u00f0\u00f1\7\7"+
		"\2\2\u00f1\u00f2\7\13\2\2\u00f2\u00f7\5(\25\2\u00f3\u00f4\7\4\2\2\u00f4"+
		"\u00f6\5(\25\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fb\7\f\2\2\u00fb\'\3\2\2\2\u00fc\u00ff\5*\26\2\u00fd\u00ff\5,\27\2"+
		"\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff)\3\2\2\2\u0100\u0101\7"+
		"\3\2\2\u0101\u0102\7\"\2\2\u0102\u0103\7\7\2\2\u0103\u0104\7,\2\2\u0104"+
		"\u0105\7\4\2\2\u0105\u0106\7#\2\2\u0106\u0107\7\7\2\2\u0107\u0108\7,\2"+
		"\2\u0108\u0109\7\4\2\2\u0109\u010a\7$\2\2\u010a\u010b\7\7\2\2\u010b\u010c"+
		"\7,\2\2\u010c\u010d\7\4\2\2\u010d\u010e\7\31\2\2\u010e\u010f\7\7\2\2\u010f"+
		"\u0110\7,\2\2\u0110\u0111\7\4\2\2\u0111\u0112\5\"\22\2\u0112\u0113\7\4"+
		"\2\2\u0113\u0114\7%\2\2\u0114\u0115\7\7\2\2\u0115\u0116\7\13\2\2\u0116"+
		"\u011b\5$\23\2\u0117\u0118\7\4\2\2\u0118\u011a\5$\23\2\u0119\u0117\3\2"+
		"\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7\f\2\2\u011f\u0120\7\5"+
		"\2\2\u0120+\3\2\2\2\u0121\u0122\7\3\2\2\u0122\u0123\7\21\2\2\u0123\u0124"+
		"\7\7\2\2\u0124\u0125\5\26\f\2\u0125\u0126\7\4\2\2\u0126\u0127\7\22\2\2"+
		"\u0127\u0128\7\7\2\2\u0128\u0129\5\30\r\2\u0129\u012a\7\4\2\2\u012a\u012b"+
		"\7\31\2\2\u012b\u012c\7\7\2\2\u012c\u012d\7,\2\2\u012d\u012e\7\4\2\2\u012e"+
		"\u012f\7\32\2\2\u012f\u0130\7\7\2\2\u0130\u0131\7,\2\2\u0131\u0132\7\5"+
		"\2\2\u0132-\3\2\2\2\u0133\u0134\7\3\2\2\u0134\u0135\7&\2\2\u0135\u0136"+
		"\7\7\2\2\u0136\u0137\7\13\2\2\u0137\u0138\7,\2\2\u0138\u0139\7\4\2\2\u0139"+
		"\u013a\7,\2\2\u013a\u013b\7\f\2\2\u013b\u013c\7\4\2\2\u013c\u013d\7\'"+
		"\2\2\u013d\u013e\7\7\2\2\u013e\u013f\7\13\2\2\u013f\u0140\7,\2\2\u0140"+
		"\u0141\7\f\2\2\u0141\u0142\7\4\2\2\u0142\u0143\7(\2\2\u0143\u0144\7\7"+
		"\2\2\u0144\u0145\7,\2\2\u0145\u0146\7\5\2\2\u0146/\3\2\2\2\u0147\u0148"+
		"\7\3\2\2\u0148\u0149\7\"\2\2\u0149\u014a\7\7\2\2\u014a\u014b\7,\2\2\u014b"+
		"\u014c\7\4\2\2\u014c\u014d\7#\2\2\u014d\u014e\7\7\2\2\u014e\u014f\7,\2"+
		"\2\u014f\u0150\7\4\2\2\u0150\u0151\7$\2\2\u0151\u0152\7\7\2\2\u0152\u0153"+
		"\7,\2\2\u0153\u0154\7\4\2\2\u0154\u0155\7)\2\2\u0155\u0156\7\7\2\2\u0156"+
		"\u0157\7,\2\2\u0157\u0158\7\4\2\2\u0158\u0159\7\22\2\2\u0159\u015a\7\7"+
		"\2\2\u015a\u015b\7\13\2\2\u015b\u0160\5\62\32\2\u015c\u015d\7\4\2\2\u015d"+
		"\u015f\5\62\32\2\u015e\u015c\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3"+
		"\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0164\7\f\2\2\u0164\u0165\7\4\2\2\u0165\u0166\7\23\2\2\u0166\u0167\7"+
		"\7\2\2\u0167\u0168\7,\2\2\u0168\u0169\7\5\2\2\u0169\61\3\2\2\2\u016a\u016b"+
		"\7\3\2\2\u016b\u016c\7*\2\2\u016c\u016d\7\7\2\2\u016d\u016e\7,\2\2\u016e"+
		"\u016f\7\4\2\2\u016f\u0170\7+\2\2\u0170\u0171\7\7\2\2\u0171\u0172\7,\2"+
		"\2\u0172\u0173\7\5\2\2\u0173\63\3\2\2\2\21<FTanv\u00ac\u00b7\u00ca\u00d7"+
		"\u00e8\u00f7\u00fe\u011b\u0160";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}