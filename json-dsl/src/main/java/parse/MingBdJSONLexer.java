// Generated from D:/MyWorkSpace/zrDSL-flink/json-dsl/src/main/resources\MingBdJSON.g4 by ANTLR 4.8
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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, STRING=42, FUNCNAME=43, BLOCK_STRING=44, 
		NUMBER=45, WS=46;
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
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"STRING", "FUNCNAME", "BLOCK_STRING", "ESC", "UNICODE", "HEX", "SAFECODEPOINT", 
			"NUMBER", "INT", "EXP", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u01f4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3"+
		"+\3+\7+\u01a4\n+\f+\16+\u01a7\13+\3+\3+\3,\7,\u01ac\n,\f,\16,\u01af\13"+
		",\3-\3-\3-\3-\3-\3-\7-\u01b7\n-\f-\16-\u01ba\13-\3-\3-\3-\3-\3.\3.\3."+
		"\5.\u01c3\n.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\5\62\u01d0\n\62"+
		"\3\62\3\62\3\62\6\62\u01d5\n\62\r\62\16\62\u01d6\5\62\u01d9\n\62\3\62"+
		"\5\62\u01dc\n\62\3\63\3\63\3\63\7\63\u01e1\n\63\f\63\16\63\u01e4\13\63"+
		"\5\63\u01e6\n\63\3\64\3\64\5\64\u01ea\n\64\3\64\3\64\3\65\6\65\u01ef\n"+
		"\65\r\65\16\65\u01f0\3\65\3\65\3\u01b8\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[\2]\2_\2a\2c/e\2g\2i\60\3\2\13\5\2\62;CHch\3\2--\n\2$$\61\61^^"+
		"ddhhppttvv\5\2\2!$$^^\3\2\62;\3\2\63;\4\2GGgg\4\2--//\5\2\13\f\17\17\""+
		"\"\2\u01fa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2c\3\2\2\2\2i\3\2\2\2\3k\3\2"+
		"\2\2\5m\3\2\2\2\7o\3\2\2\2\tq\3\2\2\2\13{\3\2\2\2\r}\3\2\2\2\17\u0086"+
		"\3\2\2\2\21\u008e\3\2\2\2\23\u0095\3\2\2\2\25\u0097\3\2\2\2\27\u0099\3"+
		"\2\2\2\31\u00a0\3\2\2\2\33\u00ac\3\2\2\2\35\u00b7\3\2\2\2\37\u00bf\3\2"+
		"\2\2!\u00c6\3\2\2\2#\u00cf\3\2\2\2%\u00db\3\2\2\2\'\u00e4\3\2\2\2)\u00ea"+
		"\3\2\2\2+\u00f1\3\2\2\2-\u00f8\3\2\2\2/\u0100\3\2\2\2\61\u0107\3\2\2\2"+
		"\63\u010c\3\2\2\2\65\u0117\3\2\2\2\67\u011c\3\2\2\29\u0122\3\2\2\2;\u012a"+
		"\3\2\2\2=\u0136\3\2\2\2?\u013d\3\2\2\2A\u0144\3\2\2\2C\u0149\3\2\2\2E"+
		"\u0155\3\2\2\2G\u015d\3\2\2\2I\u0165\3\2\2\2K\u016e\3\2\2\2M\u017b\3\2"+
		"\2\2O\u0185\3\2\2\2Q\u018f\3\2\2\2S\u0197\3\2\2\2U\u01a0\3\2\2\2W\u01ad"+
		"\3\2\2\2Y\u01b0\3\2\2\2[\u01bf\3\2\2\2]\u01c4\3\2\2\2_\u01ca\3\2\2\2a"+
		"\u01cc\3\2\2\2c\u01cf\3\2\2\2e\u01e5\3\2\2\2g\u01e7\3\2\2\2i\u01ee\3\2"+
		"\2\2kl\7}\2\2l\4\3\2\2\2mn\7.\2\2n\6\3\2\2\2op\7\177\2\2p\b\3\2\2\2qr"+
		"\7$\2\2rs\7t\2\2st\7w\2\2tu\7p\2\2uv\7O\2\2vw\7q\2\2wx\7f\2\2xy\7g\2\2"+
		"yz\7$\2\2z\n\3\2\2\2{|\7<\2\2|\f\3\2\2\2}~\7$\2\2~\177\7u\2\2\177\u0080"+
		"\7v\2\2\u0080\u0081\7t\2\2\u0081\u0082\7g\2\2\u0082\u0083\7c\2\2\u0083"+
		"\u0084\7o\2\2\u0084\u0085\7$\2\2\u0085\16\3\2\2\2\u0086\u0087\7$\2\2\u0087"+
		"\u0088\7d\2\2\u0088\u0089\7c\2\2\u0089\u008a\7v\2\2\u008a\u008b\7e\2\2"+
		"\u008b\u008c\7j\2\2\u008c\u008d\7$\2\2\u008d\20\3\2\2\2\u008e\u008f\7"+
		"$\2\2\u008f\u0090\7n\2\2\u0090\u0091\7q\2\2\u0091\u0092\7c\2\2\u0092\u0093"+
		"\7f\2\2\u0093\u0094\7$\2\2\u0094\22\3\2\2\2\u0095\u0096\7]\2\2\u0096\24"+
		"\3\2\2\2\u0097\u0098\7_\2\2\u0098\26\3\2\2\2\u0099\u009a\7$\2\2\u009a"+
		"\u009b\7l\2\2\u009b\u009c\7q\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2"+
		"\u009e\u009f\7$\2\2\u009f\30\3\2\2\2\u00a0\u00a1\7$\2\2\u00a1\u00a2\7"+
		"v\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6"+
		"\7u\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7t\2\2\u00a9"+
		"\u00aa\7o\2\2\u00aa\u00ab\7$\2\2\u00ab\32\3\2\2\2\u00ac\u00ad\7$\2\2\u00ad"+
		"\u00ae\7|\2\2\u00ae\u00af\7m\2\2\u00af\u00b0\7S\2\2\u00b0\u00b1\7w\2\2"+
		"\u00b1\u00b2\7q\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5"+
		"\7o\2\2\u00b5\u00b6\7$\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7$\2\2\u00b8\u00b9"+
		"\7v\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7d\2\2\u00bb\u00bc\7n\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd\u00be\7$\2\2\u00be\36\3\2\2\2\u00bf\u00c0\7$\2\2\u00c0"+
		"\u00c1\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7q\2\2"+
		"\u00c4\u00c5\7$\2\2\u00c5 \3\2\2\2\u00c6\u00c7\7$\2\2\u00c7\u00c8\7u\2"+
		"\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7j\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc"+
		"\7o\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7$\2\2\u00ce\"\3\2\2\2\u00cf\u00d0"+
		"\7$\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7d\2\2\u00d3"+
		"\u00d4\7n\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7P\2\2\u00d6\u00d7\7c\2\2"+
		"\u00d7\u00d8\7o\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7$\2\2\u00da$\3\2\2"+
		"\2\u00db\u00dc\7$\2\2\u00dc\u00dd\7f\2\2\u00dd\u00de\7t\2\2\u00de\u00df"+
		"\7k\2\2\u00df\u00e0\7x\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7t\2\2\u00e2"+
		"\u00e3\7$\2\2\u00e3&\3\2\2\2\u00e4\u00e5\7$\2\2\u00e5\u00e6\7w\2\2\u00e6"+
		"\u00e7\7t\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7$\2\2\u00e9(\3\2\2\2\u00ea"+
		"\u00eb\7$\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7g\2\2"+
		"\u00ee\u00ef\7t\2\2\u00ef\u00f0\7$\2\2\u00f0*\3\2\2\2\u00f1\u00f2\7$\2"+
		"\2\u00f2\u00f3\7r\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6"+
		"\7u\2\2\u00f6\u00f7\7$\2\2\u00f7,\3\2\2\2\u00f8\u00f9\7$\2\2\u00f9\u00fa"+
		"\7s\2\2\u00fa\u00fb\7w\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7t\2\2\u00fd"+
		"\u00fe\7{\2\2\u00fe\u00ff\7$\2\2\u00ff.\3\2\2\2\u0100\u0101\7$\2\2\u0101"+
		"\u0102\7h\2\2\u0102\u0103\7t\2\2\u0103\u0104\7q\2\2\u0104\u0105\7o\2\2"+
		"\u0105\u0106\7$\2\2\u0106\60\3\2\2\2\u0107\u0108\7$\2\2\u0108\u0109\7"+
		"v\2\2\u0109\u010a\7q\2\2\u010a\u010b\7$\2\2\u010b\62\3\2\2\2\u010c\u010d"+
		"\7$\2\2\u010d\u010e\7f\2\2\u010e\u010f\7k\2\2\u010f\u0110\7u\2\2\u0110"+
		"\u0111\7v\2\2\u0111\u0112\7k\2\2\u0112\u0113\7p\2\2\u0113\u0114\7e\2\2"+
		"\u0114\u0115\7v\2\2\u0115\u0116\7$\2\2\u0116\64\3\2\2\2\u0117\u0118\7"+
		"v\2\2\u0118\u0119\7t\2\2\u0119\u011a\7w\2\2\u011a\u011b\7g\2\2\u011b\66"+
		"\3\2\2\2\u011c\u011d\7h\2\2\u011d\u011e\7c\2\2\u011e\u011f\7n\2\2\u011f"+
		"\u0120\7u\2\2\u0120\u0121\7g\2\2\u01218\3\2\2\2\u0122\u0123\7$\2\2\u0123"+
		"\u0124\7i\2\2\u0124\u0125\7t\2\2\u0125\u0126\7q\2\2\u0126\u0127\7w\2\2"+
		"\u0127\u0128\7r\2\2\u0128\u0129\7$\2\2\u0129:\3\2\2\2\u012a\u012b\7$\2"+
		"\2\u012b\u012c\7e\2\2\u012c\u012d\7q\2\2\u012d\u012e\7p\2\2\u012e\u012f"+
		"\7f\2\2\u012f\u0130\7k\2\2\u0130\u0131\7v\2\2\u0131\u0132\7k\2\2\u0132"+
		"\u0133\7q\2\2\u0133\u0134\7p\2\2\u0134\u0135\7$\2\2\u0135<\3\2\2\2\u0136"+
		"\u0137\7$\2\2\u0137\u0138\7e\2\2\u0138\u0139\7q\2\2\u0139\u013a\7n\2\2"+
		"\u013a\u013b\7u\2\2\u013b\u013c\7$\2\2\u013c>\3\2\2\2\u013d\u013e\7$\2"+
		"\2\u013e\u013f\7u\2\2\u013f\u0140\7c\2\2\u0140\u0141\7x\2\2\u0141\u0142"+
		"\7g\2\2\u0142\u0143\7$\2\2\u0143@\3\2\2\2\u0144\u0145\7$\2\2\u0145\u0146"+
		"\7|\2\2\u0146\u0147\7m\2\2\u0147\u0148\7$\2\2\u0148B\3\2\2\2\u0149\u014a"+
		"\7$\2\2\u014a\u014b\7d\2\2\u014b\u014c\7v\2\2\u014c\u014d\7U\2\2\u014d"+
		"\u014e\7g\2\2\u014e\u014f\7t\2\2\u014f\u0150\7x\2\2\u0150\u0151\7g\2\2"+
		"\u0151\u0152\7t\2\2\u0152\u0153\7u\2\2\u0153\u0154\7$\2\2\u0154D\3\2\2"+
		"\2\u0155\u0156\7$\2\2\u0156\u0157\7v\2\2\u0157\u0158\7q\2\2\u0158\u0159"+
		"\7r\2\2\u0159\u015a\7k\2\2\u015a\u015b\7e\2\2\u015b\u015c\7$\2\2\u015c"+
		"F\3\2\2\2\u015d\u015e\7$\2\2\u015e\u015f\7v\2\2\u015f\u0160\7{\2\2\u0160"+
		"\u0161\7r\2\2\u0161\u0162\7g\2\2\u0162\u0163\7u\2\2\u0163\u0164\7$\2\2"+
		"\u0164H\3\2\2\2\u0165\u0166\7$\2\2\u0166\u0167\7k\2\2\u0167\u0168\7p\2"+
		"\2\u0168\u0169\7r\2\2\u0169\u016a\7w\2\2\u016a\u016b\7v\2\2\u016b\u016c"+
		"\7V\2\2\u016c\u016d\7$\2\2\u016dJ\3\2\2\2\u016e\u016f\7$\2\2\u016f\u0170"+
		"\7e\2\2\u0170\u0171\7q\2\2\u0171\u0172\7p\2\2\u0172\u0173\7f\2\2\u0173"+
		"\u0174\7k\2\2\u0174\u0175\7v\2\2\u0175\u0176\7k\2\2\u0176\u0177\7q\2\2"+
		"\u0177\u0178\7p\2\2\u0178\u0179\7V\2\2\u0179\u017a\7$\2\2\u017aL\3\2\2"+
		"\2\u017b\u017c\7$\2\2\u017c\u017d\7q\2\2\u017d\u017e\7w\2\2\u017e\u017f"+
		"\7v\2\2\u017f\u0180\7r\2\2\u0180\u0181\7w\2\2\u0181\u0182\7v\2\2\u0182"+
		"\u0183\7V\2\2\u0183\u0184\7$\2\2\u0184N\3\2\2\2\u0185\u0186\7$\2\2\u0186"+
		"\u0187\7i\2\2\u0187\u0188\7t\2\2\u0188\u0189\7q\2\2\u0189\u018a\7w\2\2"+
		"\u018a\u018b\7r\2\2\u018b\u018c\7K\2\2\u018c\u018d\7f\2\2\u018d\u018e"+
		"\7$\2\2\u018eP\3\2\2\2\u018f\u0190\7$\2\2\u0190\u0191\7p\2\2\u0191\u0192"+
		"\7c\2\2\u0192\u0193\7o\2\2\u0193\u0194\7g\2\2\u0194\u0195\7K\2\2\u0195"+
		"\u0196\7$\2\2\u0196R\3\2\2\2\u0197\u0198\7$\2\2\u0198\u0199\7c\2\2\u0199"+
		"\u019a\7n\2\2\u019a\u019b\7k\2\2\u019b\u019c\7c\2\2\u019c\u019d\7u\2\2"+
		"\u019d\u019e\7K\2\2\u019e\u019f\7$\2\2\u019fT\3\2\2\2\u01a0\u01a5\7$\2"+
		"\2\u01a1\u01a4\5[.\2\u01a2\u01a4\5a\61\2\u01a3\u01a1\3\2\2\2\u01a3\u01a2"+
		"\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\7$\2\2\u01a9V\3\2\2\2\u01aa"+
		"\u01ac\t\2\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2"+
		"\2\2\u01ad\u01ae\3\2\2\2\u01aeX\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1"+
		"\7)\2\2\u01b1\u01b2\7)\2\2\u01b2\u01b3\7)\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01b8\n\3\2\2\u01b5\u01b7\13\2\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3"+
		"\2\2\2\u01b8\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01bb\u01bc\7)\2\2\u01bc\u01bd\7)\2\2\u01bd\u01be\7)\2"+
		"\2\u01beZ\3\2\2\2\u01bf\u01c2\7^\2\2\u01c0\u01c3\t\4\2\2\u01c1\u01c3\5"+
		"]/\2\u01c2\u01c0\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3\\\3\2\2\2\u01c4\u01c5"+
		"\7w\2\2\u01c5\u01c6\5_\60\2\u01c6\u01c7\5_\60\2\u01c7\u01c8\5_\60\2\u01c8"+
		"\u01c9\5_\60\2\u01c9^\3\2\2\2\u01ca\u01cb\t\2\2\2\u01cb`\3\2\2\2\u01cc"+
		"\u01cd\n\5\2\2\u01cdb\3\2\2\2\u01ce\u01d0\7/\2\2\u01cf\u01ce\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d8\5e\63\2\u01d2\u01d4\7\60"+
		"\2\2\u01d3\u01d5\t\6\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d2\3\2"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01dc\5g\64\2\u01db"+
		"\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dcd\3\2\2\2\u01dd\u01e6\7\62\2\2"+
		"\u01de\u01e2\t\7\2\2\u01df\u01e1\t\6\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e4"+
		"\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e5\u01dd\3\2\2\2\u01e5\u01de\3\2\2\2\u01e6f\3\2\2\2"+
		"\u01e7\u01e9\t\b\2\2\u01e8\u01ea\t\t\2\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea"+
		"\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\5e\63\2\u01ech\3\2\2\2\u01ed"+
		"\u01ef\t\n\2\2\u01ee\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01ee\3\2"+
		"\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\b\65\2\2\u01f3"+
		"j\3\2\2\2\20\2\u01a3\u01a5\u01ad\u01b8\u01c2\u01cf\u01d6\u01d8\u01db\u01e2"+
		"\u01e5\u01e9\u01f0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}