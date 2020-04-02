// Generated from D:/mingBd-DSL/src/main/resources\MingBdJSON.g4 by ANTLR 4.8
package parse;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MingBdJSONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, STRING=34, NUMBER=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"STRING", "ESC", "UNICODE", "HEX", "SAFECODEPOINT", "NUMBER", "INT", 
			"EXP", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "'\"runMode\"'", "':'", "'\"stream\"'", "'\"batch\"'", 
			"'\"load\"'", "'['", "']'", "'\"join\"'", "'\"transform\"'", "'\"from\"'", 
			"'\"to\"'", "'\"distinct\"'", "'true'", "'false'", "'\"cols\"'", "'('", 
			"')'", "'\"condition\"'", "'\"save\"'", "'\"zk\"'", "'\"btServers\"'", 
			"'\"topic\"'", "'\"inputT\"'", "'\"conditionT\"'", "'\"outputT\"'", "'\"groupId\"'", 
			"'\"schema\"'", "'\"tableName\"'", "'\"nameI\"'", "'\"aliasI\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "STRING", 
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


	public MingBdJSONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MingBdJSON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0180\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\7#\u0145\n#\f#\16#\u0148\13#\3#\3#\3$\3$\3$\5$\u014f\n"+
		"$\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\5(\u015c\n(\3(\3(\3(\6(\u0161\n("+
		"\r(\16(\u0162\5(\u0165\n(\3(\5(\u0168\n(\3)\3)\3)\7)\u016d\n)\f)\16)\u0170"+
		"\13)\5)\u0172\n)\3*\3*\5*\u0176\n*\3*\3*\3+\6+\u017b\n+\r+\16+\u017c\3"+
		"+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G\2I\2K\2M\2O%Q\2S\2U&\3\2\n\n\2$$\61\61^^ddhhp"+
		"pttvv\5\2\62;CHch\5\2\2!$$^^\3\2\62;\3\2\63;\4\2GGgg\4\2--//\5\2\13\f"+
		"\17\17\"\"\2\u0184\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2O\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7[\3\2\2\2\t]\3\2"+
		"\2\2\13g\3\2\2\2\ri\3\2\2\2\17r\3\2\2\2\21z\3\2\2\2\23\u0081\3\2\2\2\25"+
		"\u0083\3\2\2\2\27\u0085\3\2\2\2\31\u008c\3\2\2\2\33\u0098\3\2\2\2\35\u009f"+
		"\3\2\2\2\37\u00a4\3\2\2\2!\u00af\3\2\2\2#\u00b4\3\2\2\2%\u00ba\3\2\2\2"+
		"\'\u00c1\3\2\2\2)\u00c3\3\2\2\2+\u00c5\3\2\2\2-\u00d1\3\2\2\2/\u00d8\3"+
		"\2\2\2\61\u00dd\3\2\2\2\63\u00e9\3\2\2\2\65\u00f1\3\2\2\2\67\u00fa\3\2"+
		"\2\29\u0107\3\2\2\2;\u0111\3\2\2\2=\u011b\3\2\2\2?\u0124\3\2\2\2A\u0130"+
		"\3\2\2\2C\u0138\3\2\2\2E\u0141\3\2\2\2G\u014b\3\2\2\2I\u0150\3\2\2\2K"+
		"\u0156\3\2\2\2M\u0158\3\2\2\2O\u015b\3\2\2\2Q\u0171\3\2\2\2S\u0173\3\2"+
		"\2\2U\u017a\3\2\2\2WX\7}\2\2X\4\3\2\2\2YZ\7.\2\2Z\6\3\2\2\2[\\\7\177\2"+
		"\2\\\b\3\2\2\2]^\7$\2\2^_\7t\2\2_`\7w\2\2`a\7p\2\2ab\7O\2\2bc\7q\2\2c"+
		"d\7f\2\2de\7g\2\2ef\7$\2\2f\n\3\2\2\2gh\7<\2\2h\f\3\2\2\2ij\7$\2\2jk\7"+
		"u\2\2kl\7v\2\2lm\7t\2\2mn\7g\2\2no\7c\2\2op\7o\2\2pq\7$\2\2q\16\3\2\2"+
		"\2rs\7$\2\2st\7d\2\2tu\7c\2\2uv\7v\2\2vw\7e\2\2wx\7j\2\2xy\7$\2\2y\20"+
		"\3\2\2\2z{\7$\2\2{|\7n\2\2|}\7q\2\2}~\7c\2\2~\177\7f\2\2\177\u0080\7$"+
		"\2\2\u0080\22\3\2\2\2\u0081\u0082\7]\2\2\u0082\24\3\2\2\2\u0083\u0084"+
		"\7_\2\2\u0084\26\3\2\2\2\u0085\u0086\7$\2\2\u0086\u0087\7l\2\2\u0087\u0088"+
		"\7q\2\2\u0088\u0089\7k\2\2\u0089\u008a\7p\2\2\u008a\u008b\7$\2\2\u008b"+
		"\30\3\2\2\2\u008c\u008d\7$\2\2\u008d\u008e\7v\2\2\u008e\u008f\7t\2\2\u008f"+
		"\u0090\7c\2\2\u0090\u0091\7p\2\2\u0091\u0092\7u\2\2\u0092\u0093\7h\2\2"+
		"\u0093\u0094\7q\2\2\u0094\u0095\7t\2\2\u0095\u0096\7o\2\2\u0096\u0097"+
		"\7$\2\2\u0097\32\3\2\2\2\u0098\u0099\7$\2\2\u0099\u009a\7h\2\2\u009a\u009b"+
		"\7t\2\2\u009b\u009c\7q\2\2\u009c\u009d\7o\2\2\u009d\u009e\7$\2\2\u009e"+
		"\34\3\2\2\2\u009f\u00a0\7$\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7q\2\2\u00a2"+
		"\u00a3\7$\2\2\u00a3\36\3\2\2\2\u00a4\u00a5\7$\2\2\u00a5\u00a6\7f\2\2\u00a6"+
		"\u00a7\7k\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7k\2\2"+
		"\u00aa\u00ab\7p\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae"+
		"\7$\2\2\u00ae \3\2\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2"+
		"\7w\2\2\u00b2\u00b3\7g\2\2\u00b3\"\3\2\2\2\u00b4\u00b5\7h\2\2\u00b5\u00b6"+
		"\7c\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7g\2\2\u00b9"+
		"$\3\2\2\2\u00ba\u00bb\7$\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7q\2\2\u00bd"+
		"\u00be\7n\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7$\2\2\u00c0&\3\2\2\2\u00c1"+
		"\u00c2\7*\2\2\u00c2(\3\2\2\2\u00c3\u00c4\7+\2\2\u00c4*\3\2\2\2\u00c5\u00c6"+
		"\7$\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7p\2\2\u00c9"+
		"\u00ca\7f\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7k\2\2"+
		"\u00cd\u00ce\7q\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7$\2\2\u00d0,\3\2\2"+
		"\2\u00d1\u00d2\7$\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5"+
		"\7x\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7$\2\2\u00d7.\3\2\2\2\u00d8\u00d9"+
		"\7$\2\2\u00d9\u00da\7|\2\2\u00da\u00db\7m\2\2\u00db\u00dc\7$\2\2\u00dc"+
		"\60\3\2\2\2\u00dd\u00de\7$\2\2\u00de\u00df\7d\2\2\u00df\u00e0\7v\2\2\u00e0"+
		"\u00e1\7U\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7x\2\2"+
		"\u00e4\u00e5\7g\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8"+
		"\7$\2\2\u00e8\62\3\2\2\2\u00e9\u00ea\7$\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec"+
		"\7q\2\2\u00ec\u00ed\7r\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7e\2\2\u00ef"+
		"\u00f0\7$\2\2\u00f0\64\3\2\2\2\u00f1\u00f2\7$\2\2\u00f2\u00f3\7k\2\2\u00f3"+
		"\u00f4\7p\2\2\u00f4\u00f5\7r\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7v\2\2"+
		"\u00f7\u00f8\7V\2\2\u00f8\u00f9\7$\2\2\u00f9\66\3\2\2\2\u00fa\u00fb\7"+
		"$\2\2\u00fb\u00fc\7e\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff"+
		"\7f\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7v\2\2\u0101\u0102\7k\2\2\u0102"+
		"\u0103\7q\2\2\u0103\u0104\7p\2\2\u0104\u0105\7V\2\2\u0105\u0106\7$\2\2"+
		"\u01068\3\2\2\2\u0107\u0108\7$\2\2\u0108\u0109\7q\2\2\u0109\u010a\7w\2"+
		"\2\u010a\u010b\7v\2\2\u010b\u010c\7r\2\2\u010c\u010d\7w\2\2\u010d\u010e"+
		"\7v\2\2\u010e\u010f\7V\2\2\u010f\u0110\7$\2\2\u0110:\3\2\2\2\u0111\u0112"+
		"\7$\2\2\u0112\u0113\7i\2\2\u0113\u0114\7t\2\2\u0114\u0115\7q\2\2\u0115"+
		"\u0116\7w\2\2\u0116\u0117\7r\2\2\u0117\u0118\7K\2\2\u0118\u0119\7f\2\2"+
		"\u0119\u011a\7$\2\2\u011a<\3\2\2\2\u011b\u011c\7$\2\2\u011c\u011d\7u\2"+
		"\2\u011d\u011e\7e\2\2\u011e\u011f\7j\2\2\u011f\u0120\7g\2\2\u0120\u0121"+
		"\7o\2\2\u0121\u0122\7c\2\2\u0122\u0123\7$\2\2\u0123>\3\2\2\2\u0124\u0125"+
		"\7$\2\2\u0125\u0126\7v\2\2\u0126\u0127\7c\2\2\u0127\u0128\7d\2\2\u0128"+
		"\u0129\7n\2\2\u0129\u012a\7g\2\2\u012a\u012b\7P\2\2\u012b\u012c\7c\2\2"+
		"\u012c\u012d\7o\2\2\u012d\u012e\7g\2\2\u012e\u012f\7$\2\2\u012f@\3\2\2"+
		"\2\u0130\u0131\7$\2\2\u0131\u0132\7p\2\2\u0132\u0133\7c\2\2\u0133\u0134"+
		"\7o\2\2\u0134\u0135\7g\2\2\u0135\u0136\7K\2\2\u0136\u0137\7$\2\2\u0137"+
		"B\3\2\2\2\u0138\u0139\7$\2\2\u0139\u013a\7c\2\2\u013a\u013b\7n\2\2\u013b"+
		"\u013c\7k\2\2\u013c\u013d\7c\2\2\u013d\u013e\7u\2\2\u013e\u013f\7K\2\2"+
		"\u013f\u0140\7$\2\2\u0140D\3\2\2\2\u0141\u0146\7$\2\2\u0142\u0145\5G$"+
		"\2\u0143\u0145\5M\'\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\u0148"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014a\7$\2\2\u014aF\3\2\2\2\u014b\u014e\7^\2\2\u014c"+
		"\u014f\t\2\2\2\u014d\u014f\5I%\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2"+
		"\2\u014fH\3\2\2\2\u0150\u0151\7w\2\2\u0151\u0152\5K&\2\u0152\u0153\5K"+
		"&\2\u0153\u0154\5K&\2\u0154\u0155\5K&\2\u0155J\3\2\2\2\u0156\u0157\t\3"+
		"\2\2\u0157L\3\2\2\2\u0158\u0159\n\4\2\2\u0159N\3\2\2\2\u015a\u015c\7/"+
		"\2\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u0164\5Q)\2\u015e\u0160\7\60\2\2\u015f\u0161\t\5\2\2\u0160\u015f\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0165\3\2\2\2\u0164\u015e\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2"+
		"\2\2\u0166\u0168\5S*\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168P"+
		"\3\2\2\2\u0169\u0172\7\62\2\2\u016a\u016e\t\6\2\2\u016b\u016d\t\5\2\2"+
		"\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0169\3\2\2\2\u0171"+
		"\u016a\3\2\2\2\u0172R\3\2\2\2\u0173\u0175\t\7\2\2\u0174\u0176\t\b\2\2"+
		"\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178"+
		"\5Q)\2\u0178T\3\2\2\2\u0179\u017b\t\t\2\2\u017a\u0179\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u017f\b+\2\2\u017fV\3\2\2\2\16\2\u0144\u0146\u014e\u015b\u0162\u0164"+
		"\u0167\u016e\u0171\u0175\u017c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}