// Generated from project/lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class langLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, VAR=28, NUM=29, CHAR=30;
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
			"T__25", "T__26", "VAR", "NUM", "CHAR"
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


	public langLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lang.g4"; }

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
		"\u0004\u0000\u001e\u00bf\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u00ad\b\u001b\n"+
		"\u001b\f\u001b\u00b0\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u00b5\b\u001c\n\u001c\f\u001c\u00b8\t\u001c\u0003\u001c\u00ba\b"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0000\u0000\u001e"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e\u0001\u0000\u0004\u0001"+
		"\u0000az\u0002\u000009az\u0001\u000019\u0001\u000009\u00c1\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0001=\u0001\u0000\u0000"+
		"\u0000\u0003A\u0001\u0000\u0000\u0000\u0005D\u0001\u0000\u0000\u0000\u0007"+
		"J\u0001\u0000\u0000\u0000\tL\u0001\u0000\u0000\u0000\u000bS\u0001\u0000"+
		"\u0000\u0000\rZ\u0001\u0000\u0000\u0000\u000f_\u0001\u0000\u0000\u0000"+
		"\u0011h\u0001\u0000\u0000\u0000\u0013m\u0001\u0000\u0000\u0000\u0015q"+
		"\u0001\u0000\u0000\u0000\u0017t\u0001\u0000\u0000\u0000\u0019v\u0001\u0000"+
		"\u0000\u0000\u001bx\u0001\u0000\u0000\u0000\u001dz\u0001\u0000\u0000\u0000"+
		"\u001f|\u0001\u0000\u0000\u0000!~\u0001\u0000\u0000\u0000#\u0080\u0001"+
		"\u0000\u0000\u0000%\u0082\u0001\u0000\u0000\u0000\'\u0084\u0001\u0000"+
		"\u0000\u0000)\u0086\u0001\u0000\u0000\u0000+\u0089\u0001\u0000\u0000\u0000"+
		"-\u0090\u0001\u0000\u0000\u0000/\u0096\u0001\u0000\u0000\u00001\u00a0"+
		"\u0001\u0000\u0000\u00003\u00a3\u0001\u0000\u0000\u00005\u00a6\u0001\u0000"+
		"\u0000\u00007\u00aa\u0001\u0000\u0000\u00009\u00b9\u0001\u0000\u0000\u0000"+
		";\u00bb\u0001\u0000\u0000\u0000=>\u0005l\u0000\u0000>?\u0005e\u0000\u0000"+
		"?@\u0005t\u0000\u0000@\u0002\u0001\u0000\u0000\u0000AB\u0005i\u0000\u0000"+
		"BC\u0005s\u0000\u0000C\u0004\u0001\u0000\u0000\u0000DE\u0005g\u0000\u0000"+
		"EF\u0005r\u0000\u0000FG\u0005a\u0000\u0000GH\u0005p\u0000\u0000HI\u0005"+
		"h\u0000\u0000I\u0006\u0001\u0000\u0000\u0000JK\u0005=\u0000\u0000K\b\u0001"+
		"\u0000\u0000\u0000LM\u0005r\u0000\u0000MN\u0005e\u0000\u0000NO\u0005m"+
		"\u0000\u0000OP\u0005o\u0000\u0000PQ\u0005v\u0000\u0000QR\u0005e\u0000"+
		"\u0000R\n\u0001\u0000\u0000\u0000ST\u0005v\u0000\u0000TU\u0005e\u0000"+
		"\u0000UV\u0005r\u0000\u0000VW\u0005t\u0000\u0000WX\u0005e\u0000\u0000"+
		"XY\u0005x\u0000\u0000Y\f\u0001\u0000\u0000\u0000Z[\u0005e\u0000\u0000"+
		"[\\\u0005d\u0000\u0000\\]\u0005g\u0000\u0000]^\u0005e\u0000\u0000^\u000e"+
		"\u0001\u0000\u0000\u0000_`\u0005v\u0000\u0000`a\u0005e\u0000\u0000ab\u0005"+
		"r\u0000\u0000bc\u0005t\u0000\u0000cd\u0005i\u0000\u0000de\u0005c\u0000"+
		"\u0000ef\u0005e\u0000\u0000fg\u0005s\u0000\u0000g\u0010\u0001\u0000\u0000"+
		"\u0000hi\u0005f\u0000\u0000ij\u0005r\u0000\u0000jk\u0005o\u0000\u0000"+
		"kl\u0005m\u0000\u0000l\u0012\u0001\u0000\u0000\u0000mn\u0005a\u0000\u0000"+
		"no\u0005d\u0000\u0000op\u0005d\u0000\u0000p\u0014\u0001\u0000\u0000\u0000"+
		"qr\u0005t\u0000\u0000rs\u0005o\u0000\u0000s\u0016\u0001\u0000\u0000\u0000"+
		"tu\u0005[\u0000\u0000u\u0018\u0001\u0000\u0000\u0000vw\u0005,\u0000\u0000"+
		"w\u001a\u0001\u0000\u0000\u0000xy\u0005]\u0000\u0000y\u001c\u0001\u0000"+
		"\u0000\u0000z{\u0005(\u0000\u0000{\u001e\u0001\u0000\u0000\u0000|}\u0005"+
		")\u0000\u0000} \u0001\u0000\u0000\u0000~\u007f\u0005|\u0000\u0000\u007f"+
		"\"\u0001\u0000\u0000\u0000\u0080\u0081\u0005^\u0000\u0000\u0081$\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005.\u0000\u0000\u0083&\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005&\u0000\u0000\u0085(\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005.\u0000\u0000\u0087\u0088\u0005.\u0000\u0000\u0088*\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005r\u0000\u0000\u008a\u008b\u0005e\u0000"+
		"\u0000\u008b\u008c\u0005t\u0000\u0000\u008c\u008d\u0005u\u0000\u0000\u008d"+
		"\u008e\u0005r\u0000\u0000\u008e\u008f\u0005n\u0000\u0000\u008f,\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005w\u0000\u0000\u0091\u0092\u0005h\u0000"+
		"\u0000\u0092\u0093\u0005e\u0000\u0000\u0093\u0094\u0005r\u0000\u0000\u0094"+
		"\u0095\u0005e\u0000\u0000\u0095.\u0001\u0000\u0000\u0000\u0096\u0097\u0005"+
		"r\u0000\u0000\u0097\u0098\u0005e\u0000\u0000\u0098\u0099\u0005a\u0000"+
		"\u0000\u0099\u009a\u0005c\u0000\u0000\u009a\u009b\u0005h\u0000\u0000\u009b"+
		"\u009c\u0005a\u0000\u0000\u009c\u009d\u0005b\u0000\u0000\u009d\u009e\u0005"+
		"l\u0000\u0000\u009e\u009f\u0005e\u0000\u0000\u009f0\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005i\u0000\u0000\u00a1\u00a2\u0005n\u0000\u0000\u00a2"+
		"2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005b\u0000\u0000\u00a4\u00a5\u0005"+
		"y\u0000\u0000\u00a54\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005f\u0000"+
		"\u0000\u00a7\u00a8\u0005o\u0000\u0000\u00a8\u00a9\u0005r\u0000\u0000\u00a9"+
		"6\u0001\u0000\u0000\u0000\u00aa\u00ae\u0007\u0000\u0000\u0000\u00ab\u00ad"+
		"\u0007\u0001\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00b0"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af8\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b1\u00ba\u00050\u0000\u0000\u00b2\u00b6\u0007\u0002"+
		"\u0000\u0000\u00b3\u00b5\u0007\u0003\u0000\u0000\u00b4\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b2\u0001\u0000\u0000\u0000\u00ba:\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0005\"\u0000\u0000\u00bc\u00bd\u0007\u0000\u0000\u0000"+
		"\u00bd\u00be\u0005\"\u0000\u0000\u00be<\u0001\u0000\u0000\u0000\u0004"+
		"\u0000\u00ae\u00b6\u00b9\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}