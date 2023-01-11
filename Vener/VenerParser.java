// Generated from java-escape by ANTLR 4.11.1
package Ven;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class VenerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Separate=8, Semicolon=9, 
		As=10, Using=11, Expose=12, Divide=13, Multiply=14, Star=15, Slash=16, 
		Colon=17, Name=18, Pass=19, Return=20, Yield=21, Await=22, Break=23, Throw=24, 
		Comma=25, Type=26, BitOr=27, BitAnd=28, Nullable=29, Keyword=30, BaseInput=31, 
		Val=32, Var=33, Def=34, Set=35, Flexible=36, Delay=37, If=38, Else=39, 
		ElseIf=40, Switch=41, Case=42, Default=43, Match=44, Rule=45, Try=46, 
		Catch=47, Final=48, In=49, For=50, While=51, Macro=52, With=53, Let=54, 
		Class=55, Extend=56, Act=57, Tilde=58, Suffix=59, Prefix=60, Enumerate=61, 
		Structure=62, Interface=63, Trait=64, Plus=65, Minus=66, Power=67, Surd=68, 
		Decimal=69, DecimalBad=70, Binary=71, Octal=72, Hexadecimal=73, Integer=74, 
		Exponent=75, Base=76, StringEscapeBlock=77, StringEscapeSingle=78, StringLiteralBlock=79, 
		StringLiteralSingle=80, StringEmpty=81, Escape=82, True=83, False=84, 
		Null=85, Nothing=86, Symbols=87, TrueName=88, Symbol=89, Sharp=90, Dot=91, 
		Underline=92, Shebang=93, Remark=94, Comment=95, LineComment=96, PartComment=97, 
		NewLine=98, WhiteSpace=99, Import=100, LeftShift=101, LessEqual=102, Less=103, 
		Export=104, RightShift=105, GraterEqual=106, Grater=107, Increase=108, 
		LogicXor=109, Decrease=110, Kronecker=111, TensorProduct=112, MapAll=113, 
		Quotient=114, Map=115, Output=116, Modulo=117, Equivalent=118, NotEquivalent=119, 
		Equal=120, Concat=121, Destruct=122, LogicOr=123, LogicAnd=124, DoubleBang=125, 
		NotEqual=126, BitNot=127, LogicNot=128, Elvis=129, Curry=130, Apply=131, 
		LetAssign=132, Quote=133, Acute=134, Quotation=135, Ellipsis=136, DOT=137, 
		Reciprocal=138, Degree=139, Transpose=140, Hermitian=141, Section=142, 
		Pilcrow=143, Currency=144, Element=145;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_emptyStatement = 2, RULE_eos = 3, 
		RULE_importStatement = 4, RULE_moduleName = 5, RULE_moduleLanguage = 6, 
		RULE_moduleScope = 7, RULE_exportStatment = 8, RULE_idTuples = 9, RULE_blockStatement = 10, 
		RULE_blockNonEnd = 11, RULE_expressionStatement = 12, RULE_expression = 13, 
		RULE_controlFlow = 14, RULE_functionCall = 15, RULE_arguments = 16, RULE_flowController = 17, 
		RULE_typeStatement = 18, RULE_typeExpression = 19, RULE_typeSuffix = 20, 
		RULE_assignStatment = 21, RULE_assignLHS = 22, RULE_assignRHS = 23, RULE_parameter = 24, 
		RULE_functionPattern = 25, RULE_maybeSymbol = 26, RULE_symbols = 27, RULE_ifStatment = 28, 
		RULE_ifShort = 29, RULE_ifSingle = 30, RULE_ifNested = 31, RULE_elif = 32, 
		RULE_elseIf = 33, RULE_switchStatment = 34, RULE_caseBody = 35, RULE_switchBody = 36, 
		RULE_matchStatment = 37, RULE_matchBody = 38, RULE_condition = 39, RULE_tryStatement = 40, 
		RULE_tryCatch = 41, RULE_tryFinal = 42, RULE_forStatement = 43, RULE_whileStatment = 44, 
		RULE_letStatment = 45, RULE_classExpression = 46, RULE_classStatement = 47, 
		RULE_classExtend = 48, RULE_classTrait = 49, RULE_classController = 50, 
		RULE_classEos = 51, RULE_traitStatement = 52, RULE_interfaceStatement = 53, 
		RULE_structureStatement = 54, RULE_enumerateStatement = 55, RULE_traitExpression = 56, 
		RULE_interfaceExpression = 57, RULE_interfaceFunction = 58, RULE_interfaceParameters = 59, 
		RULE_structureExpression = 60, RULE_enumerateExpression = 61, RULE_enumerateNumber = 62, 
		RULE_data = 63, RULE_number = 64, RULE_byteInput = 65, RULE_index = 66, 
		RULE_indexValid = 67, RULE_indexTerm = 68, RULE_dict = 69, RULE_keyValue = 70, 
		RULE_keyValid = 71, RULE_list = 72, RULE_element = 73, RULE_complex = 74, 
		RULE_decimal = 75, RULE_integer = 76, RULE_string = 77, RULE_special = 78, 
		RULE_symbol = 79, RULE_solt = 80, RULE_add_ops = 81, RULE_pre_ops = 82, 
		RULE_pst_ops = 83, RULE_bit_ops = 84, RULE_lgk_ops = 85, RULE_cpr_ops = 86, 
		RULE_pow_ops = 87, RULE_mul_ops = 88, RULE_list_ops = 89, RULE_mod_assign = 90;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "emptyStatement", "eos", "importStatement", "moduleName", 
			"moduleLanguage", "moduleScope", "exportStatment", "idTuples", "blockStatement", 
			"blockNonEnd", "expressionStatement", "expression", "controlFlow", "functionCall", 
			"arguments", "flowController", "typeStatement", "typeExpression", "typeSuffix", 
			"assignStatment", "assignLHS", "assignRHS", "parameter", "functionPattern", 
			"maybeSymbol", "symbols", "ifStatment", "ifShort", "ifSingle", "ifNested", 
			"elif", "elseIf", "switchStatment", "caseBody", "switchBody", "matchStatment", 
			"matchBody", "condition", "tryStatement", "tryCatch", "tryFinal", "forStatement", 
			"whileStatment", "letStatment", "classExpression", "classStatement", 
			"classExtend", "classTrait", "classController", "classEos", "traitStatement", 
			"interfaceStatement", "structureStatement", "enumerateStatement", "traitExpression", 
			"interfaceExpression", "interfaceFunction", "interfaceParameters", "structureExpression", 
			"enumerateExpression", "enumerateNumber", "data", "number", "byteInput", 
			"index", "indexValid", "indexTerm", "dict", "keyValue", "keyValid", "list", 
			"element", "complex", "decimal", "integer", "string", "special", "symbol", 
			"solt", "add_ops", "pre_ops", "pst_ops", "bit_ops", "lgk_ops", "cpr_ops", 
			"pow_ops", "mul_ops", "list_ops", "mod_assign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'['", "']'", "'\\u9244\\uFFFD'", "';;'", 
			null, "'as'", "'use'", "'expose'", null, null, "'*'", "'/'", null, null, 
			"'pass'", "'return'", "'yield'", "'await'", "'break'", "'throw'", null, 
			"'type'", "'|'", "'&'", "'?'", "'**'", "'^^'", "'val'", "'var'", "'def'", 
			"'='", null, null, "'if'", "'else'", "'elseif'", "'switch'", "'case'", 
			"'default'", "'match'", null, "'try'", "'except'", "'final'", "'in'", 
			"'for'", "'while'", "'macro'", "'with'", "'let'", "'class'", "'extend'", 
			"'act'", "'~'", "'$'", "'@'", "'enumerate'", "'structure'", "'interface'", 
			"'trait'", "'+'", "'-'", "'^'", "'\\u221A'", null, null, null, null, 
			null, null, "'*^'", "'/^'", null, null, null, null, null, "'\\'", "'true'", 
			"'false'", "'null'", "'nothing'", null, null, null, "'#'", "'.'", "'_'", 
			"'#!'", "'///'", "'%%%'", null, null, null, null, null, null, "'<='", 
			"'<'", null, null, "'>='", "'>'", "'++'", "'\\u2295'", "'--'", "'\\u2297'", 
			"'\\u2299'", "'//@'", "'//'", "'/@'", "'%%'", "'%'", "'==='", "'=!='", 
			"'=='", "'~~'", "'~='", null, null, "'!!'", null, null, null, "':?'", 
			"'@@@'", "'@@'", "'@='", "'`'", "'\\u00B4'", "'''", "'...'", "'\\u22C5'", 
			"'\\u215F'", "'\\u00B0'", "'\\u1D40'", "'\\u1D34'", "'\\u00A7'", "'\\u00B6'", 
			"'\\u00A4'", "'\\u2208'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "Separate", "Semicolon", 
			"As", "Using", "Expose", "Divide", "Multiply", "Star", "Slash", "Colon", 
			"Name", "Pass", "Return", "Yield", "Await", "Break", "Throw", "Comma", 
			"Type", "BitOr", "BitAnd", "Nullable", "Keyword", "BaseInput", "Val", 
			"Var", "Def", "Set", "Flexible", "Delay", "If", "Else", "ElseIf", "Switch", 
			"Case", "Default", "Match", "Rule", "Try", "Catch", "Final", "In", "For", 
			"While", "Macro", "With", "Let", "Class", "Extend", "Act", "Tilde", "Suffix", 
			"Prefix", "Enumerate", "Structure", "Interface", "Trait", "Plus", "Minus", 
			"Power", "Surd", "Decimal", "DecimalBad", "Binary", "Octal", "Hexadecimal", 
			"Integer", "Exponent", "Base", "StringEscapeBlock", "StringEscapeSingle", 
			"StringLiteralBlock", "StringLiteralSingle", "StringEmpty", "Escape", 
			"True", "False", "Null", "Nothing", "Symbols", "TrueName", "Symbol", 
			"Sharp", "Dot", "Underline", "Shebang", "Remark", "Comment", "LineComment", 
			"PartComment", "NewLine", "WhiteSpace", "Import", "LeftShift", "LessEqual", 
			"Less", "Export", "RightShift", "GraterEqual", "Grater", "Increase", 
			"LogicXor", "Decrease", "Kronecker", "TensorProduct", "MapAll", "Quotient", 
			"Map", "Output", "Modulo", "Equivalent", "NotEquivalent", "Equal", "Concat", 
			"Destruct", "LogicOr", "LogicAnd", "DoubleBang", "NotEqual", "BitNot", 
			"LogicNot", "Elvis", "Curry", "Apply", "LetAssign", "Quote", "Acute", 
			"Quotation", "Ellipsis", "DOT", "Reciprocal", "Degree", "Transpose", 
			"Hermitian", "Section", "Pilcrow", "Currency", "Element"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VenerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VenerParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -1671870896664994902L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -9223354444534781977L) != 0 || _la==LogicNot || _la==Reciprocal) {
				{
				{
				setState(182);
				statement();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(EOF);
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
	public static class StatementContext extends ParserRuleContext {
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ExportStatmentContext exportStatment() {
			return getRuleContext(ExportStatmentContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public LetStatmentContext letStatment() {
			return getRuleContext(LetStatmentContext.class,0);
		}
		public AssignStatmentContext assignStatment() {
			return getRuleContext(AssignStatmentContext.class,0);
		}
		public SwitchStatmentContext switchStatment() {
			return getRuleContext(SwitchStatmentContext.class,0);
		}
		public IfStatmentContext ifStatment() {
			return getRuleContext(IfStatmentContext.class,0);
		}
		public MatchStatmentContext matchStatment() {
			return getRuleContext(MatchStatmentContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatmentContext whileStatment() {
			return getRuleContext(WhileStatmentContext.class,0);
		}
		public TypeStatementContext typeStatement() {
			return getRuleContext(TypeStatementContext.class,0);
		}
		public TraitStatementContext traitStatement() {
			return getRuleContext(TraitStatementContext.class,0);
		}
		public ClassStatementContext classStatement() {
			return getRuleContext(ClassStatementContext.class,0);
		}
		public InterfaceStatementContext interfaceStatement() {
			return getRuleContext(InterfaceStatementContext.class,0);
		}
		public StructureStatementContext structureStatement() {
			return getRuleContext(StructureStatementContext.class,0);
		}
		public EnumerateStatementContext enumerateStatement() {
			return getRuleContext(EnumerateStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				emptyStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Using:
					{
					setState(191);
					importStatement();
					}
					break;
				case Expose:
					{
					setState(192);
					exportStatment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(195);
					eos();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Let:
					{
					setState(198);
					letStatment();
					}
					break;
				case Pass:
				case Yield:
				case Await:
				case Break:
				case Throw:
				case Val:
				case Var:
				case Def:
				case Suffix:
				case Symbols:
				case TrueName:
				case Symbol:
					{
					setState(199);
					assignStatment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(202);
					eos();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Switch:
					{
					setState(205);
					switchStatment();
					}
					break;
				case If:
					{
					setState(206);
					ifStatment();
					}
					break;
				case Match:
					{
					setState(207);
					matchStatment();
					}
					break;
				case For:
					{
					setState(208);
					forStatement();
					}
					break;
				case While:
					{
					setState(209);
					whileStatment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(212);
					eos();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Type:
					{
					setState(215);
					typeStatement();
					}
					break;
				case Trait:
					{
					setState(216);
					traitStatement();
					}
					break;
				case Class:
					{
					setState(217);
					classStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(220);
					eos();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Interface:
					{
					setState(223);
					interfaceStatement();
					}
					break;
				case Structure:
					{
					setState(224);
					structureStatement();
					}
					break;
				case Enumerate:
					{
					setState(225);
					enumerateStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(228);
					eos();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(231);
				tryStatement();
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(232);
					eos();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(235);
				expression(0);
				setState(237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(236);
					eos();
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(239);
				data();
				setState(241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(240);
					eos();
					}
					break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStatementContext extends ParserRuleContext {
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Separate() { return getToken(VenerParser.Separate, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_emptyStatement);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				eos();
				}
				break;
			case Separate:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(Separate);
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
	public static class EosContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(VenerParser.Semicolon, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(Semicolon);
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
	public static class ImportStatementContext extends ParserRuleContext {
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
	 
		public ImportStatementContext() { }
		public void copyFrom(ImportStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModuleAliasContext extends ImportStatementContext {
		public ModuleNameContext name;
		public TerminalNode Using() { return getToken(VenerParser.Using, 0); }
		public TerminalNode As() { return getToken(VenerParser.As, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ModuleNameContext moduleName() {
			return getRuleContext(ModuleNameContext.class,0);
		}
		public ModuleAliasContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterModuleAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitModuleAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitModuleAlias(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModuleModifyContext extends ImportStatementContext {
		public ModuleNameContext name;
		public Token mod;
		public TerminalNode Using() { return getToken(VenerParser.Using, 0); }
		public ModuleNameContext moduleName() {
			return getRuleContext(ModuleNameContext.class,0);
		}
		public TerminalNode Star() { return getToken(VenerParser.Star, 0); }
		public TerminalNode Power() { return getToken(VenerParser.Power, 0); }
		public ModuleModifyContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterModuleModify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitModuleModify(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitModuleModify(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModuleSymbolContext extends ImportStatementContext {
		public ModuleNameContext name;
		public TerminalNode Using() { return getToken(VenerParser.Using, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ModuleNameContext moduleName() {
			return getRuleContext(ModuleNameContext.class,0);
		}
		public TerminalNode With() { return getToken(VenerParser.With, 0); }
		public ModuleSymbolContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterModuleSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitModuleSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitModuleSymbol(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModuleSymbolsContext extends ImportStatementContext {
		public ModuleNameContext name;
		public TerminalNode Using() { return getToken(VenerParser.Using, 0); }
		public IdTuplesContext idTuples() {
			return getRuleContext(IdTuplesContext.class,0);
		}
		public ModuleNameContext moduleName() {
			return getRuleContext(ModuleNameContext.class,0);
		}
		public TerminalNode With() { return getToken(VenerParser.With, 0); }
		public TerminalNode Dot() { return getToken(VenerParser.Dot, 0); }
		public ModuleSymbolsContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterModuleSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitModuleSymbols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitModuleSymbols(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModuleResolveContext extends ImportStatementContext {
		public TerminalNode Using() { return getToken(VenerParser.Using, 0); }
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
		}
		public ModuleResolveContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterModuleResolve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitModuleResolve(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitModuleResolve(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importStatement);
		int _la;
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ModuleModifyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(Using);
				setState(252);
				((ModuleModifyContext)_localctx).name = moduleName();
				setState(254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(253);
					((ModuleModifyContext)_localctx).mod = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==Star || _la==Power) ) {
						((ModuleModifyContext)_localctx).mod = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new ModuleAliasContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(Using);
				setState(257);
				((ModuleAliasContext)_localctx).name = moduleName();
				setState(258);
				match(As);
				setState(259);
				symbol();
				}
				break;
			case 3:
				_localctx = new ModuleSymbolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(Using);
				setState(262);
				((ModuleSymbolContext)_localctx).name = moduleName();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==With) {
					{
					setState(263);
					match(With);
					}
				}

				setState(266);
				symbol();
				}
				break;
			case 4:
				_localctx = new ModuleSymbolsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				match(Using);
				setState(269);
				((ModuleSymbolsContext)_localctx).name = moduleName();
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==With || _la==Dot) {
					{
					setState(270);
					_la = _input.LA(1);
					if ( !(_la==With || _la==Dot) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(273);
				idTuples();
				}
				break;
			case 5:
				_localctx = new ModuleResolveContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
				match(Using);
				setState(276);
				dict();
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
	public static class ModuleNameContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public ModuleLanguageContext moduleLanguage() {
			return getRuleContext(ModuleLanguageContext.class,0);
		}
		public ModuleScopeContext moduleScope() {
			return getRuleContext(ModuleScopeContext.class,0);
		}
		public ModuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterModuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitModuleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitModuleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleNameContext moduleName() throws RecognitionException {
		ModuleNameContext _localctx = new ModuleNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_moduleName);
		int _la;
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				symbol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Suffix) {
					{
					setState(281);
					moduleLanguage();
					}
				}

				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Prefix) {
					{
					setState(284);
					moduleScope();
					}
				}

				setState(287);
				symbols();
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
	public static class ModuleLanguageContext extends ParserRuleContext {
		public TerminalNode Suffix() { return getToken(VenerParser.Suffix, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode Slash() { return getToken(VenerParser.Slash, 0); }
		public ModuleLanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleLanguage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterModuleLanguage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitModuleLanguage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitModuleLanguage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleLanguageContext moduleLanguage() throws RecognitionException {
		ModuleLanguageContext _localctx = new ModuleLanguageContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_moduleLanguage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(Suffix);
			setState(291);
			symbol();
			setState(292);
			match(Slash);
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
	public static class ModuleScopeContext extends ParserRuleContext {
		public TerminalNode Prefix() { return getToken(VenerParser.Prefix, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode Slash() { return getToken(VenerParser.Slash, 0); }
		public ModuleScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterModuleScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitModuleScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitModuleScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleScopeContext moduleScope() throws RecognitionException {
		ModuleScopeContext _localctx = new ModuleScopeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_moduleScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(Prefix);
			setState(295);
			symbol();
			setState(296);
			match(Slash);
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
	public static class ExportStatmentContext extends ParserRuleContext {
		public TerminalNode Expose() { return getToken(VenerParser.Expose, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ExportStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterExportStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitExportStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitExportStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatmentContext exportStatment() throws RecognitionException {
		ExportStatmentContext _localctx = new ExportStatmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exportStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(Expose);
			setState(299);
			symbol();
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
	public static class IdTuplesContext extends ParserRuleContext {
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(VenerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VenerParser.Comma, i);
		}
		public IdTuplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idTuples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterIdTuples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitIdTuples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitIdTuples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdTuplesContext idTuples() throws RecognitionException {
		IdTuplesContext _localctx = new IdTuplesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_idTuples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__0);
			setState(302);
			symbol();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(303);
				match(Comma);
				setState(304);
				symbol();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			match(T__1);
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
	public static class BlockStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Colon() { return getToken(VenerParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockStatement);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(T__0);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & -1671870896664994902L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -9223354444534781977L) != 0 || _la==LogicNot || _la==Reciprocal) {
					{
					{
					setState(313);
					statement();
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(319);
				match(T__1);
				}
				break;
			case Colon:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(Colon);
				setState(321);
				expression(0);
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
	public static class BlockNonEndContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Colon() { return getToken(VenerParser.Colon, 0); }
		public BlockNonEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockNonEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterBlockNonEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitBlockNonEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitBlockNonEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockNonEndContext blockNonEnd() throws RecognitionException {
		BlockNonEndContext _localctx = new BlockNonEndContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockNonEnd);
		int _la;
		try {
			int _alt;
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(T__0);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & -1671870896664994902L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -9223354444534781977L) != 0 || _la==LogicNot || _la==Reciprocal) {
					{
					{
					setState(325);
					statement();
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(331);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(332);
					match(Colon);
					}
				}

				setState(336); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(335);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(338); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(VenerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VenerParser.Comma, i);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressionStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			expression(0);
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(343);
					match(Comma);
					setState(344);
					expression(0);
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
	@SuppressWarnings("CheckReturnValue")
	public static class PriorityExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PriorityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterPriorityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitPriorityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitPriorityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataLiteralContext extends ExpressionContext {
		public DataContext atom;
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public DataLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterDataLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitDataLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitDataLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionApplyContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionApplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterFunctionApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitFunctionApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitFunctionApply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryLikeContext extends ExpressionContext {
		public ExpressionContext left;
		public Bit_opsContext op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Bit_opsContext bit_ops() {
			return getRuleContext(Bit_opsContext.class,0);
		}
		public BinaryLikeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterBinaryLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitBinaryLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitBinaryLike(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicLikeContext extends ExpressionContext {
		public ExpressionContext left;
		public Lgk_opsContext op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Lgk_opsContext lgk_ops() {
			return getRuleContext(Lgk_opsContext.class,0);
		}
		public LogicLikeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterLogicLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitLogicLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitLogicLike(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodApplyContext extends ExpressionContext {
		public ExpressionContext left;
		public FunctionCallContext right;
		public TerminalNode Dot() { return getToken(VenerParser.Dot, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MethodApplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterMethodApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitMethodApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitMethodApply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexApplyContext extends ExpressionContext {
		public ExpressionContext left;
		public IndexContext right;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public IndexApplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterIndexApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitIndexApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitIndexApply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareLikeContext extends ExpressionContext {
		public ExpressionContext left;
		public Cpr_opsContext op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Cpr_opsContext cpr_ops() {
			return getRuleContext(Cpr_opsContext.class,0);
		}
		public CompareLikeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterCompareLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitCompareLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitCompareLike(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusLikeContext extends ExpressionContext {
		public ExpressionContext left;
		public Add_opsContext op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Add_opsContext add_ops() {
			return getRuleContext(Add_opsContext.class,0);
		}
		public PlusLikeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterPlusLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitPlusLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitPlusLike(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SlotCatchContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BitAnd() { return getToken(VenerParser.BitAnd, 0); }
		public SlotCatchContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterSlotCatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitSlotCatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitSlotCatch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerLikeContext extends ExpressionContext {
		public ExpressionContext left;
		public Pow_opsContext op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Pow_opsContext pow_ops() {
			return getRuleContext(Pow_opsContext.class,0);
		}
		public PowerLikeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterPowerLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitPowerLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitPowerLike(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeConversionContext extends ExpressionContext {
		public ExpressionContext left;
		public TypeExpressionContext right;
		public TerminalNode As() { return getToken(VenerParser.As, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TypeConversionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterTypeConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitTypeConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitTypeConversion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ControlExpressionContext extends ExpressionContext {
		public ControlFlowContext controlFlow() {
			return getRuleContext(ControlFlowContext.class,0);
		}
		public ControlExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterControlExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitControlExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitControlExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixExpressionContext extends ExpressionContext {
		public Pre_opsContext op;
		public ExpressionContext right;
		public Pre_opsContext pre_ops() {
			return getRuleContext(Pre_opsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrefixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterPrefixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitPrefixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignApplyContext extends ExpressionContext {
		public AssignStatmentContext assignStatment() {
			return getRuleContext(AssignStatmentContext.class,0);
		}
		public AssignApplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterAssignApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitAssignApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitAssignApply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpecialStringContext extends ExpressionContext {
		public SymbolContext left;
		public StringContext right;
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public SpecialStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterSpecialString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitSpecialString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitSpecialString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Pst_opsContext op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Pst_opsContext pst_ops() {
			return getRuleContext(Pst_opsContext.class,0);
		}
		public PostfixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyLikeContext extends ExpressionContext {
		public ExpressionContext left;
		public Mul_opsContext op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Mul_opsContext mul_ops() {
			return getRuleContext(Mul_opsContext.class,0);
		}
		public MultiplyLikeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterMultiplyLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitMultiplyLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitMultiplyLike(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetterApplyContext extends ExpressionContext {
		public ExpressionContext left;
		public SymbolContext right;
		public TerminalNode Dot() { return getToken(VenerParser.Dot, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public GetterApplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterGetterApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitGetterApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitGetterApply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListLikeContext extends ExpressionContext {
		public ExpressionContext left;
		public List_opsContext op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List_opsContext list_ops() {
			return getRuleContext(List_opsContext.class,0);
		}
		public ListLikeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterListLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitListLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitListLike(this);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionApplyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(351);
				functionCall();
				}
				break;
			case 2:
				{
				_localctx = new AssignApplyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(352);
				assignStatment();
				}
				break;
			case 3:
				{
				_localctx = new SpecialStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(353);
				((SpecialStringContext)_localctx).left = symbol();
				setState(354);
				((SpecialStringContext)_localctx).right = string();
				}
				break;
			case 4:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(356);
				((PrefixExpressionContext)_localctx).op = pre_ops();
				setState(357);
				((PrefixExpressionContext)_localctx).right = expression(13);
				}
				break;
			case 5:
				{
				_localctx = new DataLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(359);
				((DataLiteralContext)_localctx).atom = data();
				}
				break;
			case 6:
				{
				_localctx = new PriorityExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(360);
				match(T__2);
				setState(361);
				expression(0);
				setState(362);
				match(T__3);
				}
				break;
			case 7:
				{
				_localctx = new ControlExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(364);
				controlFlow();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(410);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryLikeContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryLikeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(367);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(368);
						((BinaryLikeContext)_localctx).op = bit_ops();
						setState(369);
						((BinaryLikeContext)_localctx).right = expression(12);
						}
						break;
					case 2:
						{
						_localctx = new LogicLikeContext(new ExpressionContext(_parentctx, _parentState));
						((LogicLikeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(371);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(372);
						((LogicLikeContext)_localctx).op = lgk_ops();
						setState(373);
						((LogicLikeContext)_localctx).right = expression(11);
						}
						break;
					case 3:
						{
						_localctx = new CompareLikeContext(new ExpressionContext(_parentctx, _parentState));
						((CompareLikeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(375);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(376);
						((CompareLikeContext)_localctx).op = cpr_ops();
						setState(377);
						((CompareLikeContext)_localctx).right = expression(10);
						}
						break;
					case 4:
						{
						_localctx = new PowerLikeContext(new ExpressionContext(_parentctx, _parentState));
						((PowerLikeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(379);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(380);
						((PowerLikeContext)_localctx).op = pow_ops();
						setState(381);
						((PowerLikeContext)_localctx).right = expression(8);
						}
						break;
					case 5:
						{
						_localctx = new MultiplyLikeContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyLikeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(383);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(384);
						((MultiplyLikeContext)_localctx).op = mul_ops();
						setState(385);
						((MultiplyLikeContext)_localctx).right = expression(8);
						}
						break;
					case 6:
						{
						_localctx = new PlusLikeContext(new ExpressionContext(_parentctx, _parentState));
						((PlusLikeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(387);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(388);
						((PlusLikeContext)_localctx).op = add_ops();
						setState(389);
						((PlusLikeContext)_localctx).right = expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ListLikeContext(new ExpressionContext(_parentctx, _parentState));
						((ListLikeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(391);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(392);
						((ListLikeContext)_localctx).op = list_ops();
						setState(393);
						((ListLikeContext)_localctx).right = expression(6);
						}
						break;
					case 8:
						{
						_localctx = new GetterApplyContext(new ExpressionContext(_parentctx, _parentState));
						((GetterApplyContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(395);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(396);
						match(Dot);
						setState(397);
						((GetterApplyContext)_localctx).right = symbol();
						}
						break;
					case 9:
						{
						_localctx = new MethodApplyContext(new ExpressionContext(_parentctx, _parentState));
						((MethodApplyContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(398);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(399);
						match(Dot);
						setState(400);
						((MethodApplyContext)_localctx).right = functionCall();
						}
						break;
					case 10:
						{
						_localctx = new IndexApplyContext(new ExpressionContext(_parentctx, _parentState));
						((IndexApplyContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(401);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(402);
						((IndexApplyContext)_localctx).right = index();
						}
						break;
					case 11:
						{
						_localctx = new TypeConversionContext(new ExpressionContext(_parentctx, _parentState));
						((TypeConversionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(403);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(404);
						match(As);
						setState(405);
						((TypeConversionContext)_localctx).right = typeExpression(0);
						}
						break;
					case 12:
						{
						_localctx = new PostfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((PostfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(406);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(407);
						((PostfixExpressionContext)_localctx).op = pst_ops();
						}
						break;
					case 13:
						{
						_localctx = new SlotCatchContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(408);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(409);
						match(BitAnd);
						}
						break;
					}
					} 
				}
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
	public static class ControlFlowContext extends ParserRuleContext {
		public Token state;
		public TerminalNode Pass() { return getToken(VenerParser.Pass, 0); }
		public TerminalNode Break() { return getToken(VenerParser.Break, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Throw() { return getToken(VenerParser.Throw, 0); }
		public TerminalNode Yield() { return getToken(VenerParser.Yield, 0); }
		public TerminalNode Await() { return getToken(VenerParser.Await, 0); }
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public TerminalNode Return() { return getToken(VenerParser.Return, 0); }
		public TerminalNode Comma() { return getToken(VenerParser.Comma, 0); }
		public ControlFlowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlFlow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterControlFlow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitControlFlow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitControlFlow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlFlowContext controlFlow() throws RecognitionException {
		ControlFlowContext _localctx = new ControlFlowContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_controlFlow);
		int _la;
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				((ControlFlowContext)_localctx).state = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Pass || _la==Break) ) {
					((ControlFlowContext)_localctx).state = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(416);
					match(T__2);
					setState(417);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				((ControlFlowContext)_localctx).state = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 23068672L) != 0) ) {
					((ControlFlowContext)_localctx).state = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(421);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(422);
				((ControlFlowContext)_localctx).state = match(Return);
				setState(423);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				((ControlFlowContext)_localctx).state = match(Return);
				setState(425);
				match(T__2);
				setState(426);
				expressionStatement();
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(427);
					match(Comma);
					}
				}

				setState(430);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(VenerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VenerParser.Comma, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			symbols();
			setState(435);
			match(T__2);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 576460782401224874L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -4611677222267390989L) != 0 || _la==Reciprocal) {
				{
				setState(436);
				arguments();
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(437);
						match(Comma);
						setState(438);
						arguments();
						}
						} 
					}
					setState(443);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(444);
					match(Comma);
					}
				}

				}
			}

			setState(449);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arguments);
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				data();
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
	public static class FlowControllerContext extends ParserRuleContext {
		public TerminalNode Pass() { return getToken(VenerParser.Pass, 0); }
		public TerminalNode Break() { return getToken(VenerParser.Break, 0); }
		public TerminalNode Throw() { return getToken(VenerParser.Throw, 0); }
		public TerminalNode Yield() { return getToken(VenerParser.Yield, 0); }
		public TerminalNode Await() { return getToken(VenerParser.Await, 0); }
		public FlowControllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flowController; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterFlowController(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitFlowController(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitFlowController(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlowControllerContext flowController() throws RecognitionException {
		FlowControllerContext _localctx = new FlowControllerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_flowController);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 31981568L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeStatementContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(VenerParser.Type, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TypeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterTypeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitTypeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitTypeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeStatementContext typeStatement() throws RecognitionException {
		TypeStatementContext _localctx = new TypeStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(Type);
			setState(459);
			symbol();
			setState(460);
			match(T__0);
			setState(461);
			typeExpression(0);
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(462);
				match(T__1);
				}
				break;
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
	public static class TypeExpressionContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public List<TypeExpressionContext> typeExpression() {
			return getRuleContexts(TypeExpressionContext.class);
		}
		public TypeExpressionContext typeExpression(int i) {
			return getRuleContext(TypeExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(VenerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VenerParser.Comma, i);
		}
		public TerminalNode Less() { return getToken(VenerParser.Less, 0); }
		public TerminalNode Grater() { return getToken(VenerParser.Grater, 0); }
		public TerminalNode Nullable() { return getToken(VenerParser.Nullable, 0); }
		public TerminalNode Star() { return getToken(VenerParser.Star, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode BitOr() { return getToken(VenerParser.BitOr, 0); }
		public TerminalNode BitAnd() { return getToken(VenerParser.BitAnd, 0); }
		public TypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExpressionContext typeExpression() throws RecognitionException {
		return typeExpression(0);
	}

	private TypeExpressionContext typeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeExpressionContext _localctx = new TypeExpressionContext(_ctx, _parentState);
		TypeExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_typeExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(466);
				symbol();
				setState(467);
				match(T__2);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 31981568L) != 0 || (((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 49153L) != 0) {
					{
					setState(468);
					typeExpression(0);
					setState(473);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(469);
						match(Comma);
						setState(470);
						typeExpression(0);
						}
						}
						setState(475);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(478);
				match(T__3);
				}
				break;
			case 2:
				{
				setState(480);
				symbol();
				setState(481);
				match(Less);
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 31981568L) != 0 || (((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 49153L) != 0) {
					{
					setState(482);
					typeExpression(0);
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(483);
						match(Comma);
						setState(484);
						typeExpression(0);
						}
						}
						setState(489);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(492);
				match(Grater);
				}
				break;
			case 3:
				{
				setState(494);
				symbol();
				setState(496);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(495);
					_la = _input.LA(1);
					if ( !(_la==Star || _la==Nullable) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(498);
				integer();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(507);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new TypeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_typeExpression);
						setState(501);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(502);
						_la = _input.LA(1);
						if ( !(_la==BitOr || _la==BitAnd) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(503);
						typeExpression(5);
						}
						break;
					case 2:
						{
						_localctx = new TypeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_typeExpression);
						setState(504);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(505);
						match(T__4);
						setState(506);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
	public static class TypeSuffixContext extends ParserRuleContext {
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(VenerParser.Tilde, 0); }
		public TerminalNode Act() { return getToken(VenerParser.Act, 0); }
		public TypeSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterTypeSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitTypeSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitTypeSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSuffixContext typeSuffix() throws RecognitionException {
		TypeSuffixContext _localctx = new TypeSuffixContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_la = _input.LA(1);
			if ( !(_la==Act || _la==Tilde) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(513);
			typeExpression(0);
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
	public static class AssignStatmentContext extends ParserRuleContext {
		public AssignStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatment; }
	 
		public AssignStatmentContext() { }
		public void copyFrom(AssignStatmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignVariableContext extends AssignStatmentContext {
		public TerminalNode Var() { return getToken(VenerParser.Var, 0); }
		public AssignLHSContext assignLHS() {
			return getRuleContext(AssignLHSContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode Flexible() { return getToken(VenerParser.Flexible, 0); }
		public AssignRHSContext assignRHS() {
			return getRuleContext(AssignRHSContext.class,0);
		}
		public AssignVariableContext(AssignStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterAssignVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitAssignVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitAssignVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignFunctionContext extends AssignStatmentContext {
		public TerminalNode Def() { return getToken(VenerParser.Def, 0); }
		public FunctionPatternContext functionPattern() {
			return getRuleContext(FunctionPatternContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public AssignRHSContext assignRHS() {
			return getRuleContext(AssignRHSContext.class,0);
		}
		public TerminalNode Set() { return getToken(VenerParser.Set, 0); }
		public TerminalNode Delay() { return getToken(VenerParser.Delay, 0); }
		public AssignFunctionContext(AssignStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterAssignFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitAssignFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitAssignFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignModifyContext extends AssignStatmentContext {
		public AssignLHSContext assignLHS() {
			return getRuleContext(AssignLHSContext.class,0);
		}
		public Mod_assignContext mod_assign() {
			return getRuleContext(Mod_assignContext.class,0);
		}
		public TerminalNode Set() { return getToken(VenerParser.Set, 0); }
		public AssignRHSContext assignRHS() {
			return getRuleContext(AssignRHSContext.class,0);
		}
		public AssignModifyContext(AssignStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterAssignModify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitAssignModify(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitAssignModify(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignValueContext extends AssignStatmentContext {
		public TerminalNode Val() { return getToken(VenerParser.Val, 0); }
		public AssignLHSContext assignLHS() {
			return getRuleContext(AssignLHSContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode Set() { return getToken(VenerParser.Set, 0); }
		public AssignRHSContext assignRHS() {
			return getRuleContext(AssignRHSContext.class,0);
		}
		public AssignValueContext(AssignStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterAssignValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitAssignValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignDeferContext extends AssignStatmentContext {
		public TerminalNode Def() { return getToken(VenerParser.Def, 0); }
		public AssignLHSContext assignLHS() {
			return getRuleContext(AssignLHSContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode Delay() { return getToken(VenerParser.Delay, 0); }
		public AssignRHSContext assignRHS() {
			return getRuleContext(AssignRHSContext.class,0);
		}
		public AssignDeferContext(AssignStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterAssignDefer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitAssignDefer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitAssignDefer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatmentContext assignStatment() throws RecognitionException {
		AssignStatmentContext _localctx = new AssignStatmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignStatment);
		int _la;
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new AssignValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				match(Val);
				setState(516);
				assignLHS();
				setState(517);
				blockStatement();
				}
				break;
			case 2:
				_localctx = new AssignVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				match(Var);
				setState(520);
				assignLHS();
				setState(521);
				blockStatement();
				}
				break;
			case 3:
				_localctx = new AssignDeferContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(523);
				match(Def);
				setState(524);
				assignLHS();
				setState(525);
				blockStatement();
				}
				break;
			case 4:
				_localctx = new AssignFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(527);
				match(Def);
				setState(528);
				functionPattern();
				setState(529);
				blockStatement();
				}
				break;
			case 5:
				_localctx = new AssignFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(531);
				functionPattern();
				setState(532);
				_la = _input.LA(1);
				if ( !(_la==Set || _la==Delay) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(533);
				assignRHS();
				}
				break;
			case 6:
				_localctx = new AssignModifyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(535);
				assignLHS();
				setState(536);
				mod_assign();
				setState(537);
				match(Set);
				setState(538);
				assignRHS();
				}
				break;
			case 7:
				_localctx = new AssignValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(540);
				assignLHS();
				setState(541);
				match(Set);
				setState(542);
				assignRHS();
				}
				break;
			case 8:
				_localctx = new AssignVariableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(544);
				assignLHS();
				setState(545);
				match(Flexible);
				setState(546);
				assignRHS();
				}
				break;
			case 9:
				_localctx = new AssignDeferContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(548);
				assignLHS();
				setState(549);
				match(Delay);
				setState(550);
				assignRHS();
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
	public static class AssignLHSContext extends ParserRuleContext {
		public AssignLHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignLHS; }
	 
		public AssignLHSContext() { }
		public void copyFrom(AssignLHSContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LHSMaybeSetterContext extends AssignLHSContext {
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public LHSMaybeSetterContext(AssignLHSContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterLHSMaybeSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitLHSMaybeSetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitLHSMaybeSetter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LHSTupleContext extends AssignLHSContext {
		public List<MaybeSymbolContext> maybeSymbol() {
			return getRuleContexts(MaybeSymbolContext.class);
		}
		public MaybeSymbolContext maybeSymbol(int i) {
			return getRuleContext(MaybeSymbolContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(VenerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VenerParser.Comma, i);
		}
		public LHSTupleContext(AssignLHSContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterLHSTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitLHSTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitLHSTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LHSSingleContext extends AssignLHSContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public LHSSingleContext(AssignLHSContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterLHSSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitLHSSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitLHSSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LHSMaybeIndexContext extends AssignLHSContext {
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public LHSMaybeIndexContext(AssignLHSContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterLHSMaybeIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitLHSMaybeIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitLHSMaybeIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignLHSContext assignLHS() throws RecognitionException {
		AssignLHSContext _localctx = new AssignLHSContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignLHS);
		int _la;
		try {
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				_localctx = new LHSSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				symbol();
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Act || _la==Tilde) {
					{
					setState(555);
					typeSuffix();
					}
				}

				}
				break;
			case 2:
				_localctx = new LHSTupleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				maybeSymbol();
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(559);
					match(Comma);
					setState(560);
					maybeSymbol();
					}
					}
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new LHSMaybeSetterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(566);
				symbols();
				}
				break;
			case 4:
				_localctx = new LHSMaybeIndexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(567);
				symbols();
				setState(568);
				index();
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
	public static class AssignRHSContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public AssignRHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignRHS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterAssignRHS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitAssignRHS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitAssignRHS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignRHSContext assignRHS() throws RecognitionException {
		AssignRHSContext _localctx = new AssignRHSContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignRHS);
		int _la;
		try {
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(575);
				match(T__0);
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & -1671870896664994902L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -9223354444534781977L) != 0 || _la==LogicNot || _la==Reciprocal) {
					{
					{
					setState(576);
					statement();
					}
					}
					setState(581);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(582);
				match(T__1);
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
	public static class ParameterContext extends ParserRuleContext {
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode Star() { return getToken(VenerParser.Star, 0); }
		public TerminalNode Keyword() { return getToken(VenerParser.Keyword, 0); }
		public TerminalNode Nullable() { return getToken(VenerParser.Nullable, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameter);
		try {
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(585);
					typeExpression(0);
					}
					break;
				}
				setState(588);
				symbol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(589);
					typeExpression(0);
					}
					break;
				}
				setState(592);
				symbol();
				setState(593);
				match(Star);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(596);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(595);
					typeExpression(0);
					}
					break;
				}
				setState(598);
				symbol();
				setState(599);
				match(Keyword);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(602);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(601);
					typeExpression(0);
					}
					break;
				}
				setState(604);
				symbol();
				setState(605);
				match(Nullable);
				setState(606);
				symbol();
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
	public static class FunctionPatternContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(VenerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VenerParser.Comma, i);
		}
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public FunctionPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterFunctionPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitFunctionPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitFunctionPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionPatternContext functionPattern() throws RecognitionException {
		FunctionPatternContext _localctx = new FunctionPatternContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionPattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			symbol();
			setState(611);
			match(T__2);
			setState(612);
			parameter();
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(613);
					match(Comma);
					setState(614);
					parameter();
					}
					} 
				}
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(620);
				match(Comma);
				}
			}

			setState(623);
			match(T__3);
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Act || _la==Tilde) {
				{
				setState(624);
				typeSuffix();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MaybeSymbolContext extends ParserRuleContext {
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public TerminalNode Suffix() { return getToken(VenerParser.Suffix, 0); }
		public MaybeSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybeSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterMaybeSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitMaybeSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitMaybeSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaybeSymbolContext maybeSymbol() throws RecognitionException {
		MaybeSymbolContext _localctx = new MaybeSymbolContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_maybeSymbol);
		int _la;
		try {
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Symbols:
			case TrueName:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				symbols();
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Act || _la==Tilde) {
					{
					setState(628);
					typeSuffix();
					}
				}

				}
				break;
			case Suffix:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(Suffix);
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
	public static class SymbolsContext extends ParserRuleContext {
		public SymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols; }
	 
		public SymbolsContext() { }
		public void copyFrom(SymbolsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaybeMethodContext extends SymbolsContext {
		public TerminalNode Symbols() { return getToken(VenerParser.Symbols, 0); }
		public MaybeMethodContext(SymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterMaybeMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitMaybeMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitMaybeMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MustMethodContext extends SymbolsContext {
		public TerminalNode TrueName() { return getToken(VenerParser.TrueName, 0); }
		public TerminalNode Dot() { return getToken(VenerParser.Dot, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public MustMethodContext(SymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterMustMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitMustMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitMustMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolsContext symbols() throws RecognitionException {
		SymbolsContext _localctx = new SymbolsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_symbols);
		try {
			setState(638);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Symbols:
				_localctx = new MaybeMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				match(Symbols);
				}
				break;
			case TrueName:
				_localctx = new MustMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				match(TrueName);
				setState(636);
				match(Dot);
				setState(637);
				symbol();
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
	public static class IfStatmentContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(VenerParser.If, 0); }
		public IfShortContext ifShort() {
			return getRuleContext(IfShortContext.class,0);
		}
		public IfSingleContext ifSingle() {
			return getRuleContext(IfSingleContext.class,0);
		}
		public IfNestedContext ifNested() {
			return getRuleContext(IfNestedContext.class,0);
		}
		public IfStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterIfStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitIfStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitIfStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatmentContext ifStatment() throws RecognitionException {
		IfStatmentContext _localctx = new IfStatmentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifStatment);
		try {
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				match(If);
				setState(641);
				ifShort();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				match(If);
				setState(643);
				ifSingle();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
				match(If);
				setState(645);
				ifNested();
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
	public static class IfShortContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public IfShortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifShort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterIfShort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitIfShort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitIfShort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfShortContext ifShort() throws RecognitionException {
		IfShortContext _localctx = new IfShortContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifShort);
		try {
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				condition();
				setState(649);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				condition();
				setState(652);
				blockStatement();
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
	public static class IfSingleContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockNonEndContext blockNonEnd() {
			return getRuleContext(BlockNonEndContext.class,0);
		}
		public TerminalNode Else() { return getToken(VenerParser.Else, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public IfSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSingle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterIfSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitIfSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitIfSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfSingleContext ifSingle() throws RecognitionException {
		IfSingleContext _localctx = new IfSingleContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ifSingle);
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				condition();
				setState(657);
				blockNonEnd();
				setState(658);
				match(Else);
				setState(659);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				condition();
				setState(662);
				blockNonEnd();
				setState(663);
				match(Else);
				setState(664);
				blockStatement();
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
	public static class IfNestedContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockNonEndContext blockNonEnd() {
			return getRuleContext(BlockNonEndContext.class,0);
		}
		public TerminalNode Else() { return getToken(VenerParser.Else, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ElseIfContext> elseIf() {
			return getRuleContexts(ElseIfContext.class);
		}
		public ElseIfContext elseIf(int i) {
			return getRuleContext(ElseIfContext.class,i);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ElifContext elif() {
			return getRuleContext(ElifContext.class,0);
		}
		public IfShortContext ifShort() {
			return getRuleContext(IfShortContext.class,0);
		}
		public IfNestedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNested; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterIfNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitIfNested(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitIfNested(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfNestedContext ifNested() throws RecognitionException {
		IfNestedContext _localctx = new IfNestedContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifNested);
		try {
			int _alt;
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				condition();
				setState(669);
				blockNonEnd();
				setState(671); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(670);
						elseIf();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(673); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(675);
				match(Else);
				setState(676);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				condition();
				setState(679);
				blockNonEnd();
				setState(681); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(680);
						elseIf();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(683); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(685);
				match(Else);
				setState(686);
				blockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(688);
				condition();
				setState(689);
				blockNonEnd();
				setState(693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(690);
						elseIf();
						}
						} 
					}
					setState(695);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(696);
				elif();
				setState(697);
				ifShort();
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
	public static class ElifContext extends ParserRuleContext {
		public TerminalNode ElseIf() { return getToken(VenerParser.ElseIf, 0); }
		public TerminalNode Else() { return getToken(VenerParser.Else, 0); }
		public TerminalNode If() { return getToken(VenerParser.If, 0); }
		public ElifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterElif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitElif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitElif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifContext elif() throws RecognitionException {
		ElifContext _localctx = new ElifContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_elif);
		try {
			setState(704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ElseIf:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				match(ElseIf);
				}
				break;
			case Else:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				match(Else);
				setState(703);
				match(If);
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
	public static class ElseIfContext extends ParserRuleContext {
		public ElifContext elif() {
			return getRuleContext(ElifContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockNonEndContext blockNonEnd() {
			return getRuleContext(BlockNonEndContext.class,0);
		}
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			elif();
			setState(707);
			condition();
			setState(708);
			blockNonEnd();
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
	public static class SwitchStatmentContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(VenerParser.Switch, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SwitchBodyContext switchBody() {
			return getRuleContext(SwitchBodyContext.class,0);
		}
		public SwitchStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterSwitchStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitSwitchStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitSwitchStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatmentContext switchStatment() throws RecognitionException {
		SwitchStatmentContext _localctx = new SwitchStatmentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_switchStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(Switch);
			setState(711);
			condition();
			setState(712);
			switchBody();
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
	public static class CaseBodyContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(VenerParser.Case, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(VenerParser.Colon, 0); }
		public BlockNonEndContext blockNonEnd() {
			return getRuleContext(BlockNonEndContext.class,0);
		}
		public TerminalNode Rule() { return getToken(VenerParser.Rule, 0); }
		public TerminalNode Default() { return getToken(VenerParser.Default, 0); }
		public TerminalNode Star() { return getToken(VenerParser.Star, 0); }
		public CaseBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterCaseBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitCaseBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitCaseBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBodyContext caseBody() throws RecognitionException {
		CaseBodyContext _localctx = new CaseBodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_caseBody);
		try {
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				match(Case);
				setState(715);
				expression(0);
				setState(716);
				match(Colon);
				setState(717);
				blockNonEnd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				expression(0);
				setState(720);
				match(Rule);
				setState(721);
				blockNonEnd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(723);
				match(Default);
				setState(724);
				match(Colon);
				setState(725);
				blockNonEnd();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(726);
				match(Case);
				setState(727);
				match(Star);
				setState(728);
				match(Colon);
				setState(729);
				blockNonEnd();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(730);
				match(Star);
				setState(731);
				match(Rule);
				setState(732);
				blockNonEnd();
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
	public static class SwitchBodyContext extends ParserRuleContext {
		public List<CaseBodyContext> caseBody() {
			return getRuleContexts(CaseBodyContext.class);
		}
		public CaseBodyContext caseBody(int i) {
			return getRuleContext(CaseBodyContext.class,i);
		}
		public SwitchBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterSwitchBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitSwitchBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitSwitchBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBodyContext switchBody() throws RecognitionException {
		SwitchBodyContext _localctx = new SwitchBodyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_switchBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(T__0);
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 576473976540790954L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -4611677222267390989L) != 0 || _la==Reciprocal) {
				{
				{
				setState(736);
				caseBody();
				}
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(742);
			match(T__1);
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
	public static class MatchStatmentContext extends ParserRuleContext {
		public TerminalNode Match() { return getToken(VenerParser.Match, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public MatchBodyContext matchBody() {
			return getRuleContext(MatchBodyContext.class,0);
		}
		public MatchStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterMatchStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitMatchStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitMatchStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchStatmentContext matchStatment() throws RecognitionException {
		MatchStatmentContext _localctx = new MatchStatmentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_matchStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(Match);
			setState(745);
			condition();
			setState(746);
			matchBody();
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
	public static class MatchBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public MatchBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterMatchBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitMatchBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitMatchBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchBodyContext matchBody() throws RecognitionException {
		MatchBodyContext _localctx = new MatchBodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_matchBody);
		try {
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				blockStatement();
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
	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_condition);
		try {
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				match(T__2);
				setState(754);
				expression(0);
				setState(755);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(VenerParser.Try, 0); }
		public List<BlockNonEndContext> blockNonEnd() {
			return getRuleContexts(BlockNonEndContext.class);
		}
		public BlockNonEndContext blockNonEnd(int i) {
			return getRuleContext(BlockNonEndContext.class,i);
		}
		public TryFinalContext tryFinal() {
			return getRuleContext(TryFinalContext.class,0);
		}
		public List<TerminalNode> Catch() { return getTokens(VenerParser.Catch); }
		public TerminalNode Catch(int i) {
			return getToken(VenerParser.Catch, i);
		}
		public List<TryCatchContext> tryCatch() {
			return getRuleContexts(TryCatchContext.class);
		}
		public TryCatchContext tryCatch(int i) {
			return getRuleContext(TryCatchContext.class,i);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tryStatement);
		int _la;
		try {
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				match(Try);
				setState(760);
				blockNonEnd();
				setState(763); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(761);
					match(Catch);
					setState(762);
					tryCatch();
					}
					}
					setState(765); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Catch );
				setState(767);
				tryFinal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				match(Try);
				setState(770);
				blockNonEnd();
				setState(771);
				match(Catch);
				setState(772);
				symbol();
				setState(773);
				blockNonEnd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(775);
				match(Try);
				setState(776);
				blockNonEnd();
				setState(777);
				match(Catch);
				setState(778);
				match(T__2);
				setState(779);
				symbol();
				setState(780);
				match(T__3);
				setState(781);
				blockNonEnd();
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
	public static class TryCatchContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public BlockNonEndContext blockNonEnd() {
			return getRuleContext(BlockNonEndContext.class,0);
		}
		public TryCatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterTryCatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitTryCatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitTryCatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchContext tryCatch() throws RecognitionException {
		TryCatchContext _localctx = new TryCatchContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_tryCatch);
		try {
			setState(793);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Pass:
			case Yield:
			case Await:
			case Break:
			case Throw:
			case TrueName:
			case Symbol:
				enterOuterAlt(_localctx, 1);
				{
				setState(785);
				symbol();
				setState(786);
				blockNonEnd();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(788);
				match(T__2);
				setState(789);
				symbol();
				setState(790);
				match(T__3);
				setState(791);
				blockNonEnd();
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
	public static class TryFinalContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(VenerParser.Final, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TryFinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryFinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterTryFinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitTryFinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitTryFinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryFinalContext tryFinal() throws RecognitionException {
		TryFinalContext _localctx = new TryFinalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_tryFinal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(Final);
			setState(796);
			blockStatement();
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
	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	 
		public ForStatementContext() { }
		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInLoopContext extends ForStatementContext {
		public TerminalNode For() { return getToken(VenerParser.For, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode In() { return getToken(VenerParser.In, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ForInLoopContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterForInLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitForInLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitForInLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ForStatementContext {
		public TerminalNode For() { return getToken(VenerParser.For, 0); }
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ForLoopContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_forStatement);
		try {
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				match(For);
				setState(799);
				match(T__2);
				setState(800);
				expressionStatement();
				setState(801);
				match(T__3);
				setState(802);
				blockStatement();
				}
				break;
			case 2:
				_localctx = new ForInLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				match(For);
				setState(805);
				symbol();
				setState(806);
				match(In);
				setState(807);
				expression(0);
				setState(808);
				blockStatement();
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
	public static class WhileStatmentContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(VenerParser.While, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public WhileStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterWhileStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitWhileStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitWhileStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatmentContext whileStatment() throws RecognitionException {
		WhileStatmentContext _localctx = new WhileStatmentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_whileStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(While);
			setState(813);
			condition();
			setState(814);
			blockStatement();
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
	public static class LetStatmentContext extends ParserRuleContext {
		public TerminalNode Let() { return getToken(VenerParser.Let, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public LetStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterLetStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitLetStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitLetStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStatmentContext letStatment() throws RecognitionException {
		LetStatmentContext _localctx = new LetStatmentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_letStatment);
		int _la;
		try {
			int _alt;
			setState(832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				match(Let);
				setState(820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(817);
						symbol();
						}
						} 
					}
					setState(822);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				setState(823);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				match(Let);
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 31981568L) != 0 || _la==TrueName || _la==Symbol) {
					{
					{
					setState(825);
					symbol();
					}
					}
					setState(830);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(831);
				blockStatement();
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
	public static class ClassExpressionContext extends ParserRuleContext {
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ClassEosContext classEos() {
			return getRuleContext(ClassEosContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public List<ClassControllerContext> classController() {
			return getRuleContexts(ClassControllerContext.class);
		}
		public ClassControllerContext classController(int i) {
			return getRuleContext(ClassControllerContext.class,i);
		}
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ClassExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterClassExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitClassExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitClassExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassExpressionContext classExpression() throws RecognitionException {
		ClassExpressionContext _localctx = new ClassExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_classExpression);
		int _la;
		try {
			int _alt;
			setState(887);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(834);
				emptyStatement();
				setState(836);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(835);
					classEos();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(838);
						classController();
						}
						} 
					}
					setState(843);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				setState(844);
				symbol();
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Act || _la==Tilde) {
					{
					setState(845);
					typeSuffix();
					}
				}

				setState(849);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(848);
					classEos();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(854);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(851);
						classController();
						}
						} 
					}
					setState(856);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				setState(857);
				symbol();
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Act || _la==Tilde) {
					{
					setState(858);
					typeSuffix();
					}
				}

				setState(861);
				blockStatement();
				setState(863);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(862);
					classEos();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(868);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(865);
						classController();
						}
						} 
					}
					setState(870);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				setState(871);
				symbol();
				setState(872);
				match(T__2);
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 31981568L) != 0 || (((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 49153L) != 0) {
					{
					{
					setState(873);
					parameter();
					}
					}
					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(879);
				match(T__3);
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Act || _la==Tilde) {
					{
					setState(880);
					typeSuffix();
					}
				}

				setState(883);
				blockStatement();
				setState(885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(884);
					classEos();
					}
					break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassStatementContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(VenerParser.Class, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ClassExtendContext classExtend() {
			return getRuleContext(ClassExtendContext.class,0);
		}
		public ClassTraitContext classTrait() {
			return getRuleContext(ClassTraitContext.class,0);
		}
		public List<ClassExpressionContext> classExpression() {
			return getRuleContexts(ClassExpressionContext.class);
		}
		public ClassExpressionContext classExpression(int i) {
			return getRuleContext(ClassExpressionContext.class,i);
		}
		public ClassStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterClassStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitClassStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitClassStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassStatementContext classStatement() throws RecognitionException {
		ClassStatementContext _localctx = new ClassStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_classStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(Class);
			setState(890);
			symbol();
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==Extend) {
				{
				setState(891);
				classExtend();
				}
			}

			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Act || _la==Tilde) {
				{
				setState(894);
				classTrait();
				}
			}

			setState(897);
			match(T__0);
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 30096753408L) != 0 || _la==TrueName || _la==Symbol) {
				{
				{
				setState(898);
				classExpression();
				}
				}
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(904);
			match(T__1);
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
	public static class ClassExtendContext extends ParserRuleContext {
		public TerminalNode Extend() { return getToken(VenerParser.Extend, 0); }
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(VenerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VenerParser.Comma, i);
		}
		public ClassExtendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classExtend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterClassExtend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitClassExtend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitClassExtend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassExtendContext classExtend() throws RecognitionException {
		ClassExtendContext _localctx = new ClassExtendContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_classExtend);
		int _la;
		try {
			setState(923);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Extend:
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				match(Extend);
				setState(908); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(907);
					symbol();
					}
					}
					setState(910); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 31981568L) != 0 || _la==TrueName || _la==Symbol );
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				match(T__2);
				setState(913);
				symbol();
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(914);
					match(Comma);
					setState(915);
					symbol();
					}
					}
					setState(920);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(921);
				match(T__3);
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
	public static class ClassTraitContext extends ParserRuleContext {
		public TerminalNode Act() { return getToken(VenerParser.Act, 0); }
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public TerminalNode Tilde() { return getToken(VenerParser.Tilde, 0); }
		public List<TerminalNode> Comma() { return getTokens(VenerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VenerParser.Comma, i);
		}
		public ClassTraitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTrait; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterClassTrait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitClassTrait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitClassTrait(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTraitContext classTrait() throws RecognitionException {
		ClassTraitContext _localctx = new ClassTraitContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_classTrait);
		int _la;
		try {
			setState(945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				match(Act);
				setState(927); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(926);
					symbol();
					}
					}
					setState(929); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 31981568L) != 0 || _la==TrueName || _la==Symbol );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(931);
				match(Tilde);
				setState(932);
				symbol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(933);
				match(Tilde);
				setState(934);
				match(T__2);
				setState(935);
				symbol();
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(936);
					match(Comma);
					setState(937);
					symbol();
					}
					}
					setState(942);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(943);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassControllerContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode Val() { return getToken(VenerParser.Val, 0); }
		public TerminalNode Var() { return getToken(VenerParser.Var, 0); }
		public TerminalNode Def() { return getToken(VenerParser.Def, 0); }
		public ClassControllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classController; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterClassController(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitClassController(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitClassController(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassControllerContext classController() throws RecognitionException {
		ClassControllerContext _localctx = new ClassControllerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_classController);
		try {
			setState(951);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Pass:
			case Yield:
			case Await:
			case Break:
			case Throw:
			case TrueName:
			case Symbol:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				symbol();
				}
				break;
			case Val:
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
				match(Val);
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(949);
				match(Var);
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 4);
				{
				setState(950);
				match(Def);
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
	public static class ClassEosContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(VenerParser.Semicolon, 0); }
		public TerminalNode Comma() { return getToken(VenerParser.Comma, 0); }
		public ClassEosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classEos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterClassEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitClassEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitClassEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassEosContext classEos() throws RecognitionException {
		ClassEosContext _localctx = new ClassEosContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classEos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			_la = _input.LA(1);
			if ( !(_la==Semicolon || _la==Comma) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TraitStatementContext extends ParserRuleContext {
		public TerminalNode Trait() { return getToken(VenerParser.Trait, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ClassExtendContext classExtend() {
			return getRuleContext(ClassExtendContext.class,0);
		}
		public ClassTraitContext classTrait() {
			return getRuleContext(ClassTraitContext.class,0);
		}
		public List<TraitExpressionContext> traitExpression() {
			return getRuleContexts(TraitExpressionContext.class);
		}
		public TraitExpressionContext traitExpression(int i) {
			return getRuleContext(TraitExpressionContext.class,i);
		}
		public TraitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterTraitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitTraitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitTraitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitStatementContext traitStatement() throws RecognitionException {
		TraitStatementContext _localctx = new TraitStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_traitStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(Trait);
			setState(956);
			symbol();
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==Extend) {
				{
				setState(957);
				classExtend();
				}
			}

			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Act || _la==Tilde) {
				{
				setState(960);
				classTrait();
				}
			}

			setState(963);
			match(T__0);
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 31981568L) != 0 || _la==TrueName || _la==Symbol) {
				{
				{
				setState(964);
				traitExpression();
				}
				}
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(970);
			match(T__1);
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
	public static class InterfaceStatementContext extends ParserRuleContext {
		public TerminalNode Interface() { return getToken(VenerParser.Interface, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public InterfaceExpressionContext interfaceExpression() {
			return getRuleContext(InterfaceExpressionContext.class,0);
		}
		public ClassExtendContext classExtend() {
			return getRuleContext(ClassExtendContext.class,0);
		}
		public ClassTraitContext classTrait() {
			return getRuleContext(ClassTraitContext.class,0);
		}
		public InterfaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterInterfaceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitInterfaceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitInterfaceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceStatementContext interfaceStatement() throws RecognitionException {
		InterfaceStatementContext _localctx = new InterfaceStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_interfaceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(Interface);
			setState(973);
			symbol();
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==Extend) {
				{
				setState(974);
				classExtend();
				}
			}

			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Act || _la==Tilde) {
				{
				setState(977);
				classTrait();
				}
			}

			setState(980);
			match(T__0);
			setState(981);
			interfaceExpression();
			setState(982);
			match(T__1);
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
	public static class StructureStatementContext extends ParserRuleContext {
		public TerminalNode Structure() { return getToken(VenerParser.Structure, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ClassExtendContext classExtend() {
			return getRuleContext(ClassExtendContext.class,0);
		}
		public ClassTraitContext classTrait() {
			return getRuleContext(ClassTraitContext.class,0);
		}
		public List<StructureExpressionContext> structureExpression() {
			return getRuleContexts(StructureExpressionContext.class);
		}
		public StructureExpressionContext structureExpression(int i) {
			return getRuleContext(StructureExpressionContext.class,i);
		}
		public StructureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterStructureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitStructureStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitStructureStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureStatementContext structureStatement() throws RecognitionException {
		StructureStatementContext _localctx = new StructureStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_structureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			match(Structure);
			setState(985);
			symbol();
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==Extend) {
				{
				setState(986);
				classExtend();
				}
			}

			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Act || _la==Tilde) {
				{
				setState(989);
				classTrait();
				}
			}

			setState(992);
			match(T__0);
			setState(996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 31981568L) != 0 || _la==TrueName || _la==Symbol) {
				{
				{
				setState(993);
				structureExpression();
				}
				}
				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(999);
			match(T__1);
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
	public static class EnumerateStatementContext extends ParserRuleContext {
		public Token e;
		public TerminalNode Enumerate() { return getToken(VenerParser.Enumerate, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ClassExtendContext classExtend() {
			return getRuleContext(ClassExtendContext.class,0);
		}
		public ClassTraitContext classTrait() {
			return getRuleContext(ClassTraitContext.class,0);
		}
		public List<EnumerateExpressionContext> enumerateExpression() {
			return getRuleContexts(EnumerateExpressionContext.class);
		}
		public EnumerateExpressionContext enumerateExpression(int i) {
			return getRuleContext(EnumerateExpressionContext.class,i);
		}
		public TerminalNode Plus() { return getToken(VenerParser.Plus, 0); }
		public TerminalNode Star() { return getToken(VenerParser.Star, 0); }
		public EnumerateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterEnumerateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitEnumerateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitEnumerateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerateStatementContext enumerateStatement() throws RecognitionException {
		EnumerateStatementContext _localctx = new EnumerateStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_enumerateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(Enumerate);
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star || _la==Plus) {
				{
				setState(1002);
				((EnumerateStatementContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Star || _la==Plus) ) {
					((EnumerateStatementContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1005);
			symbol();
			setState(1007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==Extend) {
				{
				setState(1006);
				classExtend();
				}
			}

			setState(1010);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Act || _la==Tilde) {
				{
				setState(1009);
				classTrait();
				}
			}

			setState(1012);
			match(T__0);
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 31981568L) != 0 || _la==TrueName || _la==Symbol) {
				{
				{
				setState(1013);
				enumerateExpression();
				}
				}
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1019);
			match(T__1);
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
	public static class TraitExpressionContext extends ParserRuleContext {
		public InterfaceExpressionContext interfaceExpression() {
			return getRuleContext(InterfaceExpressionContext.class,0);
		}
		public StructureExpressionContext structureExpression() {
			return getRuleContext(StructureExpressionContext.class,0);
		}
		public TraitExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterTraitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitTraitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitTraitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitExpressionContext traitExpression() throws RecognitionException {
		TraitExpressionContext _localctx = new TraitExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_traitExpression);
		try {
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1021);
				interfaceExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1022);
				structureExpression();
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
	public static class InterfaceExpressionContext extends ParserRuleContext {
		public InterfaceFunctionContext interfaceFunction() {
			return getRuleContext(InterfaceFunctionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(VenerParser.Colon, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public ClassEosContext classEos() {
			return getRuleContext(ClassEosContext.class,0);
		}
		public InterfaceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterInterfaceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitInterfaceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitInterfaceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceExpressionContext interfaceExpression() throws RecognitionException {
		InterfaceExpressionContext _localctx = new InterfaceExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_interfaceExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			interfaceFunction();
			setState(1026);
			match(Colon);
			setState(1027);
			typeExpression(0);
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semicolon || _la==Comma) {
				{
				setState(1028);
				classEos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceFunctionContext extends ParserRuleContext {
		public Token e;
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public InterfaceParametersContext interfaceParameters() {
			return getRuleContext(InterfaceParametersContext.class,0);
		}
		public TerminalNode Nullable() { return getToken(VenerParser.Nullable, 0); }
		public InterfaceFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterInterfaceFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitInterfaceFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitInterfaceFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceFunctionContext interfaceFunction() throws RecognitionException {
		InterfaceFunctionContext _localctx = new InterfaceFunctionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_interfaceFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			symbol();
			setState(1032);
			match(T__2);
			setState(1034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 31981568L) != 0 || (((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 49153L) != 0) {
				{
				setState(1033);
				interfaceParameters();
				}
			}

			setState(1036);
			match(T__3);
			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Nullable) {
				{
				setState(1037);
				((InterfaceFunctionContext)_localctx).e = match(Nullable);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceParametersContext extends ParserRuleContext {
		public List<TypeExpressionContext> typeExpression() {
			return getRuleContexts(TypeExpressionContext.class);
		}
		public TypeExpressionContext typeExpression(int i) {
			return getRuleContext(TypeExpressionContext.class,i);
		}
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(VenerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VenerParser.Comma, i);
		}
		public InterfaceParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterInterfaceParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitInterfaceParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitInterfaceParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceParametersContext interfaceParameters() throws RecognitionException {
		InterfaceParametersContext _localctx = new InterfaceParametersContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_interfaceParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			typeExpression(0);
			setState(1041);
			symbol();
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1042);
				match(Comma);
				setState(1043);
				typeExpression(0);
				setState(1044);
				symbol();
				}
				}
				setState(1050);
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
	public static class StructureExpressionContext extends ParserRuleContext {
		public Token e;
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode Colon() { return getToken(VenerParser.Colon, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode Nullable() { return getToken(VenerParser.Nullable, 0); }
		public ClassEosContext classEos() {
			return getRuleContext(ClassEosContext.class,0);
		}
		public StructureExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterStructureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitStructureExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitStructureExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureExpressionContext structureExpression() throws RecognitionException {
		StructureExpressionContext _localctx = new StructureExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_structureExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			symbol();
			setState(1052);
			((StructureExpressionContext)_localctx).e = match(Nullable);
			setState(1053);
			match(Colon);
			setState(1054);
			typeExpression(0);
			setState(1056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semicolon || _la==Comma) {
				{
				setState(1055);
				classEos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumerateExpressionContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ClassEosContext classEos() {
			return getRuleContext(ClassEosContext.class,0);
		}
		public TerminalNode Colon() { return getToken(VenerParser.Colon, 0); }
		public EnumerateNumberContext enumerateNumber() {
			return getRuleContext(EnumerateNumberContext.class,0);
		}
		public EnumerateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerateExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterEnumerateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitEnumerateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitEnumerateExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerateExpressionContext enumerateExpression() throws RecognitionException {
		EnumerateExpressionContext _localctx = new EnumerateExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_enumerateExpression);
		int _la;
		try {
			setState(1068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				symbol();
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semicolon || _la==Comma) {
					{
					setState(1059);
					classEos();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1062);
				symbol();
				setState(1063);
				match(Colon);
				setState(1064);
				enumerateNumber();
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semicolon || _la==Comma) {
					{
					setState(1065);
					classEos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumerateNumberContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public TerminalNode BitOr() { return getToken(VenerParser.BitOr, 0); }
		public EnumerateNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerateNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterEnumerateNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitEnumerateNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitEnumerateNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerateNumberContext enumerateNumber() throws RecognitionException {
		EnumerateNumberContext _localctx = new EnumerateNumberContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_enumerateNumber);
		try {
			setState(1075);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decimal:
			case DecimalBad:
			case Binary:
			case Octal:
			case Hexadecimal:
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				number();
				}
				break;
			case Pass:
			case Yield:
			case Await:
			case Break:
			case Throw:
			case TrueName:
			case Symbol:
				enterOuterAlt(_localctx, 2);
				{
				setState(1071);
				symbol();
				setState(1072);
				match(BitOr);
				setState(1073);
				symbol();
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
	public static class DataContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public SoltContext solt() {
			return getRuleContext(SoltContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_data);
		try {
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1077);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1078);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1079);
				special();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1080);
				symbol();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1081);
				symbols();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1082);
				list();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1083);
				dict();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1084);
				index();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1085);
				solt();
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
	public static class NumberContext extends ParserRuleContext {
		public ComplexContext complex() {
			return getRuleContext(ComplexContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public ByteInputContext byteInput() {
			return getRuleContext(ByteInputContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_number);
		try {
			setState(1092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088);
				complex();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
				decimal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1090);
				integer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1091);
				byteInput();
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
	public static class ByteInputContext extends ParserRuleContext {
		public TerminalNode Binary() { return getToken(VenerParser.Binary, 0); }
		public TerminalNode Octal() { return getToken(VenerParser.Octal, 0); }
		public TerminalNode Hexadecimal() { return getToken(VenerParser.Hexadecimal, 0); }
		public ByteInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byteInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterByteInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitByteInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitByteInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ByteInputContext byteInput() throws RecognitionException {
		ByteInputContext _localctx = new ByteInputContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_byteInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			_la = _input.LA(1);
			if ( !((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 7L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class IndexContext extends ParserRuleContext {
		public List<IndexValidContext> indexValid() {
			return getRuleContexts(IndexValidContext.class);
		}
		public IndexValidContext indexValid(int i) {
			return getRuleContext(IndexValidContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(VenerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VenerParser.Comma, i);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_index);
		int _la;
		try {
			setState(1122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(1096);
				match(T__4);
				setState(1097);
				indexValid();
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65929248L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 25166339L) != 0) {
					{
					{
					setState(1099);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1098);
						match(Comma);
						}
					}

					setState(1101);
					indexValid();
					}
					}
					setState(1106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1107);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(1109);
				match(T__6);
				setState(1110);
				indexValid();
				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65929248L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 25166339L) != 0) {
					{
					{
					setState(1112);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1111);
						match(Comma);
						}
					}

					setState(1114);
					indexValid();
					}
					}
					setState(1119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1120);
				match(T__6);
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
	public static class IndexValidContext extends ParserRuleContext {
		public IndexValidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexValid; }
	 
		public IndexValidContext() { }
		public void copyFrom(IndexValidContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Index000Context extends IndexValidContext {
		public TerminalNode Colon() { return getToken(VenerParser.Colon, 0); }
		public Index000Context(IndexValidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterIndex000(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitIndex000(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitIndex000(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Index011Context extends IndexValidContext {
		public List<TerminalNode> Colon() { return getTokens(VenerParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(VenerParser.Colon, i);
		}
		public List<IndexTermContext> indexTerm() {
			return getRuleContexts(IndexTermContext.class);
		}
		public IndexTermContext indexTerm(int i) {
			return getRuleContext(IndexTermContext.class,i);
		}
		public Index011Context(IndexValidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterIndex011(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitIndex011(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitIndex011(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Index110Context extends IndexValidContext {
		public List<IndexTermContext> indexTerm() {
			return getRuleContexts(IndexTermContext.class);
		}
		public IndexTermContext indexTerm(int i) {
			return getRuleContext(IndexTermContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(VenerParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(VenerParser.Colon, i);
		}
		public Index110Context(IndexValidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterIndex110(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitIndex110(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitIndex110(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Index001Context extends IndexValidContext {
		public TerminalNode Name() { return getToken(VenerParser.Name, 0); }
		public IndexTermContext indexTerm() {
			return getRuleContext(IndexTermContext.class,0);
		}
		public List<TerminalNode> Colon() { return getTokens(VenerParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(VenerParser.Colon, i);
		}
		public Index001Context(IndexValidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterIndex001(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitIndex001(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitIndex001(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Index100Context extends IndexValidContext {
		public IndexTermContext indexTerm() {
			return getRuleContext(IndexTermContext.class,0);
		}
		public TerminalNode Name() { return getToken(VenerParser.Name, 0); }
		public List<TerminalNode> Colon() { return getTokens(VenerParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(VenerParser.Colon, i);
		}
		public Index100Context(IndexValidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterIndex100(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitIndex100(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitIndex100(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Index111Context extends IndexValidContext {
		public List<IndexTermContext> indexTerm() {
			return getRuleContexts(IndexTermContext.class);
		}
		public IndexTermContext indexTerm(int i) {
			return getRuleContext(IndexTermContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(VenerParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(VenerParser.Colon, i);
		}
		public Index111Context(IndexValidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterIndex111(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitIndex111(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitIndex111(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Index010Context extends IndexValidContext {
		public List<TerminalNode> Colon() { return getTokens(VenerParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(VenerParser.Colon, i);
		}
		public IndexTermContext indexTerm() {
			return getRuleContext(IndexTermContext.class,0);
		}
		public Index010Context(IndexValidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterIndex010(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitIndex010(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitIndex010(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexTakeContext extends IndexValidContext {
		public IndexTermContext indexTerm() {
			return getRuleContext(IndexTermContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public IndexTakeContext(IndexValidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterIndexTake(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitIndexTake(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitIndexTake(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Index101Context extends IndexValidContext {
		public List<IndexTermContext> indexTerm() {
			return getRuleContexts(IndexTermContext.class);
		}
		public IndexTermContext indexTerm(int i) {
			return getRuleContext(IndexTermContext.class,i);
		}
		public TerminalNode Name() { return getToken(VenerParser.Name, 0); }
		public List<TerminalNode> Colon() { return getTokens(VenerParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(VenerParser.Colon, i);
		}
		public Index101Context(IndexValidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterIndex101(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitIndex101(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitIndex101(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexValidContext indexValid() throws RecognitionException {
		IndexValidContext _localctx = new IndexValidContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_indexValid);
		try {
			setState(1173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				_localctx = new IndexTakeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1126);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Pass:
				case Yield:
				case Await:
				case Break:
				case Throw:
				case Plus:
				case Minus:
				case Integer:
				case TrueName:
				case Symbol:
					{
					setState(1124);
					indexTerm();
					}
					break;
				case T__4:
					{
					setState(1125);
					list();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new Index000Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1128);
				match(Colon);
				}
				break;
			case 3:
				_localctx = new Index001Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1129);
				match(Name);
				setState(1130);
				indexTerm();
				}
				break;
			case 4:
				_localctx = new Index001Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1131);
				match(Colon);
				setState(1132);
				match(Colon);
				setState(1133);
				indexTerm();
				}
				break;
			case 5:
				_localctx = new Index010Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1134);
				match(Colon);
				setState(1135);
				indexTerm();
				setState(1137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1136);
					match(Colon);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new Index011Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1139);
				match(Colon);
				setState(1140);
				indexTerm();
				setState(1141);
				match(Colon);
				setState(1142);
				indexTerm();
				}
				break;
			case 7:
				_localctx = new Index100Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1144);
				indexTerm();
				setState(1145);
				match(Name);
				}
				break;
			case 8:
				_localctx = new Index100Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1147);
				indexTerm();
				setState(1148);
				match(Colon);
				setState(1150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1149);
					match(Colon);
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new Index101Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1152);
				indexTerm();
				setState(1153);
				match(Name);
				setState(1154);
				indexTerm();
				}
				break;
			case 10:
				_localctx = new Index101Context(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1156);
				indexTerm();
				setState(1157);
				match(Colon);
				setState(1158);
				match(Colon);
				setState(1159);
				indexTerm();
				}
				break;
			case 11:
				_localctx = new Index110Context(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1161);
				indexTerm();
				setState(1162);
				match(Colon);
				setState(1163);
				indexTerm();
				setState(1165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1164);
					match(Colon);
					}
					break;
				}
				}
				break;
			case 12:
				_localctx = new Index111Context(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1167);
				indexTerm();
				setState(1168);
				match(Colon);
				setState(1169);
				indexTerm();
				setState(1170);
				match(Colon);
				setState(1171);
				indexTerm();
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
	public static class IndexTermContext extends ParserRuleContext {
		public Token sign;
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode Plus() { return getToken(VenerParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(VenerParser.Minus, 0); }
		public IndexTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterIndexTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitIndexTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitIndexTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexTermContext indexTerm() throws RecognitionException {
		IndexTermContext _localctx = new IndexTermContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_indexTerm);
		int _la;
		try {
			setState(1180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Pass:
			case Yield:
			case Await:
			case Break:
			case Throw:
			case TrueName:
			case Symbol:
				enterOuterAlt(_localctx, 1);
				{
				setState(1175);
				symbol();
				}
				break;
			case Plus:
			case Minus:
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Plus || _la==Minus) {
					{
					setState(1176);
					((IndexTermContext)_localctx).sign = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==Plus || _la==Minus) ) {
						((IndexTermContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1179);
				integer();
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
	public static class DictContext extends ParserRuleContext {
		public List<KeyValueContext> keyValue() {
			return getRuleContexts(KeyValueContext.class);
		}
		public KeyValueContext keyValue(int i) {
			return getRuleContext(KeyValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(VenerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VenerParser.Comma, i);
		}
		public DictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitDict(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictContext dict() throws RecognitionException {
		DictContext _localctx = new DictContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_dict);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(T__0);
			setState(1184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 31981568L) != 0 || (((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 49401L) != 0) {
				{
				setState(1183);
				keyValue();
				}
			}

			setState(1190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1186);
					match(Comma);
					setState(1187);
					keyValue();
					}
					} 
				}
				setState(1192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			}
			setState(1194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1193);
				match(Comma);
				}
			}

			setState(1196);
			match(T__1);
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
	public static class KeyValueContext extends ParserRuleContext {
		public KeyValidContext key;
		public ElementContext value;
		public TerminalNode Colon() { return getToken(VenerParser.Colon, 0); }
		public KeyValidContext keyValid() {
			return getRuleContext(KeyValidContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			((KeyValueContext)_localctx).key = keyValid();
			setState(1199);
			match(Colon);
			setState(1200);
			((KeyValueContext)_localctx).value = element();
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
	public static class KeyValidContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public KeyValidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterKeyValid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitKeyValid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitKeyValid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValidContext keyValid() throws RecognitionException {
		KeyValidContext _localctx = new KeyValidContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_keyValid);
		try {
			setState(1205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				setState(1202);
				integer();
				}
				break;
			case Pass:
			case Yield:
			case Await:
			case Break:
			case Throw:
			case TrueName:
			case Symbol:
				enterOuterAlt(_localctx, 2);
				{
				setState(1203);
				symbol();
				}
				break;
			case StringEscapeBlock:
			case StringEscapeSingle:
			case StringLiteralBlock:
			case StringLiteralSingle:
			case StringEmpty:
				enterOuterAlt(_localctx, 3);
				{
				setState(1204);
				string();
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
	public static class ListContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(VenerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VenerParser.Comma, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(T__4);
			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -1671870896664994902L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -9223354444534781977L) != 0 || _la==LogicNot || _la==Reciprocal) {
				{
				setState(1208);
				element();
				}
			}

			setState(1215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1211);
					match(Comma);
					setState(1212);
					element();
					}
					} 
				}
				setState(1217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			setState(1219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1218);
				match(Comma);
				}
			}

			setState(1221);
			match(T__5);
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
	public static class ElementContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_element);
		try {
			setState(1226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1223);
				data();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1224);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1225);
				statement();
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
	public static class ComplexContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode Decimal() { return getToken(VenerParser.Decimal, 0); }
		public TerminalNode Integer() { return getToken(VenerParser.Integer, 0); }
		public ComplexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterComplex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitComplex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitComplex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexContext complex() throws RecognitionException {
		ComplexContext _localctx = new ComplexContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_complex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
			_la = _input.LA(1);
			if ( !(_la==Decimal || _la==Integer) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1229);
			symbol();
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
	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode Decimal() { return getToken(VenerParser.Decimal, 0); }
		public TerminalNode DecimalBad() { return getToken(VenerParser.DecimalBad, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_decimal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			_la = _input.LA(1);
			if ( !(_la==Decimal || _la==DecimalBad) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(VenerParser.Integer, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			match(Integer);
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
	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringEscapeBlockContext extends StringContext {
		public TerminalNode StringEscapeBlock() { return getToken(VenerParser.StringEscapeBlock, 0); }
		public StringEscapeBlockContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterStringEscapeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitStringEscapeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitStringEscapeBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralSingleContext extends StringContext {
		public TerminalNode StringLiteralSingle() { return getToken(VenerParser.StringLiteralSingle, 0); }
		public StringLiteralSingleContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterStringLiteralSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitStringLiteralSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitStringLiteralSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringEmptyContext extends StringContext {
		public TerminalNode StringEmpty() { return getToken(VenerParser.StringEmpty, 0); }
		public StringEmptyContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterStringEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitStringEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitStringEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringEscapeSingleContext extends StringContext {
		public TerminalNode StringEscapeSingle() { return getToken(VenerParser.StringEscapeSingle, 0); }
		public StringEscapeSingleContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterStringEscapeSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitStringEscapeSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitStringEscapeSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralBlockContext extends StringContext {
		public TerminalNode StringLiteralBlock() { return getToken(VenerParser.StringLiteralBlock, 0); }
		public StringLiteralBlockContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterStringLiteralBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitStringLiteralBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitStringLiteralBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_string);
		try {
			setState(1240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringEmpty:
				_localctx = new StringEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1235);
				match(StringEmpty);
				}
				break;
			case StringEscapeBlock:
				_localctx = new StringEscapeBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1236);
				match(StringEscapeBlock);
				}
				break;
			case StringEscapeSingle:
				_localctx = new StringEscapeSingleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1237);
				match(StringEscapeSingle);
				}
				break;
			case StringLiteralBlock:
				_localctx = new StringLiteralBlockContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1238);
				match(StringLiteralBlock);
				}
				break;
			case StringLiteralSingle:
				_localctx = new StringLiteralSingleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1239);
				match(StringLiteralSingle);
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
	public static class SpecialContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(VenerParser.True, 0); }
		public TerminalNode False() { return getToken(VenerParser.False, 0); }
		public TerminalNode Null() { return getToken(VenerParser.Null, 0); }
		public TerminalNode Nothing() { return getToken(VenerParser.Nothing, 0); }
		public SpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitSpecial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitSpecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_special);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			_la = _input.LA(1);
			if ( !((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 15L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class SymbolContext extends ParserRuleContext {
		public FlowControllerContext flowController() {
			return getRuleContext(FlowControllerContext.class,0);
		}
		public TerminalNode Symbol() { return getToken(VenerParser.Symbol, 0); }
		public TerminalNode TrueName() { return getToken(VenerParser.TrueName, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_symbol);
		try {
			setState(1247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Pass:
			case Yield:
			case Await:
			case Break:
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(1244);
				flowController();
				}
				break;
			case Symbol:
				enterOuterAlt(_localctx, 2);
				{
				setState(1245);
				match(Symbol);
				}
				break;
			case TrueName:
				enterOuterAlt(_localctx, 3);
				{
				setState(1246);
				match(TrueName);
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
	public static class SoltContext extends ParserRuleContext {
		public Token n;
		public SymbolContext id;
		public TerminalNode Sharp() { return getToken(VenerParser.Sharp, 0); }
		public TerminalNode Integer() { return getToken(VenerParser.Integer, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SoltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterSolt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitSolt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitSolt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoltContext solt() throws RecognitionException {
		SoltContext _localctx = new SoltContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_solt);
		try {
			setState(1255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1249);
				match(Sharp);
				setState(1251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1250);
					((SoltContext)_localctx).n = match(Integer);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1253);
				match(Sharp);
				setState(1254);
				((SoltContext)_localctx).id = symbol();
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
	public static class Add_opsContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(VenerParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(VenerParser.Minus, 0); }
		public Add_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterAdd_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitAdd_ops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitAdd_ops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_opsContext add_ops() throws RecognitionException {
		Add_opsContext _localctx = new Add_opsContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_add_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			_la = _input.LA(1);
			if ( !(_la==Plus || _la==Minus) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pre_opsContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(VenerParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(VenerParser.Minus, 0); }
		public TerminalNode BitNot() { return getToken(VenerParser.BitNot, 0); }
		public TerminalNode LogicNot() { return getToken(VenerParser.LogicNot, 0); }
		public TerminalNode Reciprocal() { return getToken(VenerParser.Reciprocal, 0); }
		public TerminalNode Increase() { return getToken(VenerParser.Increase, 0); }
		public Pre_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterPre_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitPre_ops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitPre_ops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pre_opsContext pre_ops() throws RecognitionException {
		Pre_opsContext _localctx = new Pre_opsContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_pre_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			_la = _input.LA(1);
			if ( !((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -4611677222334365693L) != 0 || _la==Reciprocal) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pst_opsContext extends ParserRuleContext {
		public TerminalNode Increase() { return getToken(VenerParser.Increase, 0); }
		public TerminalNode BitNot() { return getToken(VenerParser.BitNot, 0); }
		public TerminalNode DoubleBang() { return getToken(VenerParser.DoubleBang, 0); }
		public TerminalNode Decrease() { return getToken(VenerParser.Decrease, 0); }
		public Pst_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pst_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterPst_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitPst_ops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitPst_ops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pst_opsContext pst_ops() throws RecognitionException {
		Pst_opsContext _localctx = new Pst_opsContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_pst_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			_la = _input.LA(1);
			if ( !((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 655365L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bit_opsContext extends ParserRuleContext {
		public TerminalNode LeftShift() { return getToken(VenerParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(VenerParser.RightShift, 0); }
		public TerminalNode Exponent() { return getToken(VenerParser.Exponent, 0); }
		public TerminalNode Base() { return getToken(VenerParser.Base, 0); }
		public Bit_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterBit_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitBit_ops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitBit_ops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_opsContext bit_ops() throws RecognitionException {
		Bit_opsContext _localctx = new Bit_opsContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_bit_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			_la = _input.LA(1);
			if ( !((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 1140850691L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lgk_opsContext extends ParserRuleContext {
		public TerminalNode LogicAnd() { return getToken(VenerParser.LogicAnd, 0); }
		public TerminalNode LogicNot() { return getToken(VenerParser.LogicNot, 0); }
		public TerminalNode LogicOr() { return getToken(VenerParser.LogicOr, 0); }
		public TerminalNode LogicXor() { return getToken(VenerParser.LogicXor, 0); }
		public Lgk_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lgk_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterLgk_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitLgk_ops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitLgk_ops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lgk_opsContext lgk_ops() throws RecognitionException {
		Lgk_opsContext _localctx = new Lgk_opsContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_lgk_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			_la = _input.LA(1);
			if ( !((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 573441L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Cpr_opsContext extends ParserRuleContext {
		public TerminalNode Equal() { return getToken(VenerParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(VenerParser.NotEqual, 0); }
		public TerminalNode Equivalent() { return getToken(VenerParser.Equivalent, 0); }
		public TerminalNode NotEquivalent() { return getToken(VenerParser.NotEquivalent, 0); }
		public TerminalNode Grater() { return getToken(VenerParser.Grater, 0); }
		public TerminalNode GraterEqual() { return getToken(VenerParser.GraterEqual, 0); }
		public TerminalNode Less() { return getToken(VenerParser.Less, 0); }
		public TerminalNode LessEqual() { return getToken(VenerParser.LessEqual, 0); }
		public TerminalNode LogicAnd() { return getToken(VenerParser.LogicAnd, 0); }
		public TerminalNode LogicOr() { return getToken(VenerParser.LogicOr, 0); }
		public Cpr_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpr_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterCpr_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitCpr_ops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitCpr_ops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cpr_opsContext cpr_ops() throws RecognitionException {
		Cpr_opsContext _localctx = new Cpr_opsContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_cpr_ops);
		int _la;
		try {
			setState(1270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equivalent:
			case NotEquivalent:
			case Equal:
			case NotEqual:
				enterOuterAlt(_localctx, 1);
				{
				setState(1267);
				_la = _input.LA(1);
				if ( !((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 263L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case LessEqual:
			case Less:
			case GraterEqual:
			case Grater:
				enterOuterAlt(_localctx, 2);
				{
				setState(1268);
				_la = _input.LA(1);
				if ( !((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 51L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case LogicOr:
			case LogicAnd:
				enterOuterAlt(_localctx, 3);
				{
				setState(1269);
				_la = _input.LA(1);
				if ( !(_la==LogicOr || _la==LogicAnd) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
	public static class Pow_opsContext extends ParserRuleContext {
		public TerminalNode Power() { return getToken(VenerParser.Power, 0); }
		public TerminalNode Surd() { return getToken(VenerParser.Surd, 0); }
		public Pow_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterPow_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitPow_ops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitPow_ops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pow_opsContext pow_ops() throws RecognitionException {
		Pow_opsContext _localctx = new Pow_opsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_pow_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			_la = _input.LA(1);
			if ( !(_la==Power || _la==Surd) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Mul_opsContext extends ParserRuleContext {
		public TerminalNode Divide() { return getToken(VenerParser.Divide, 0); }
		public TerminalNode Modulo() { return getToken(VenerParser.Modulo, 0); }
		public TerminalNode Quotient() { return getToken(VenerParser.Quotient, 0); }
		public TerminalNode Multiply() { return getToken(VenerParser.Multiply, 0); }
		public TerminalNode Kronecker() { return getToken(VenerParser.Kronecker, 0); }
		public TerminalNode TensorProduct() { return getToken(VenerParser.TensorProduct, 0); }
		public Mul_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterMul_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitMul_ops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitMul_ops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_opsContext mul_ops() throws RecognitionException {
		Mul_opsContext _localctx = new Mul_opsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_mul_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			_la = _input.LA(1);
			if ( !(_la==Divide || _la==Multiply || (((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & 75L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_opsContext extends ParserRuleContext {
		public TerminalNode Concat() { return getToken(VenerParser.Concat, 0); }
		public TerminalNode LeftShift() { return getToken(VenerParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(VenerParser.RightShift, 0); }
		public TerminalNode Increase() { return getToken(VenerParser.Increase, 0); }
		public TerminalNode Map() { return getToken(VenerParser.Map, 0); }
		public List_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterList_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitList_ops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitList_ops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_opsContext list_ops() throws RecognitionException {
		List_opsContext _localctx = new List_opsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_list_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			_la = _input.LA(1);
			if ( !((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & 1065105L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Mod_assignContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(VenerParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(VenerParser.Minus, 0); }
		public TerminalNode Star() { return getToken(VenerParser.Star, 0); }
		public TerminalNode Divide() { return getToken(VenerParser.Divide, 0); }
		public Mod_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).enterMod_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenerListener ) ((VenerListener)listener).exitMod_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenerVisitor ) return ((VenerVisitor<? extends T>)visitor).visitMod_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mod_assignContext mod_assign() throws RecognitionException {
		Mod_assignContext _localctx = new Mod_assignContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_mod_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278);
			_la = _input.LA(1);
			if ( !((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 13510798882111493L) != 0) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 19:
			return typeExpression_sempred((TypeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 19);
		case 8:
			return precpred(_ctx, 18);
		case 9:
			return precpred(_ctx, 17);
		case 10:
			return precpred(_ctx, 14);
		case 11:
			return precpred(_ctx, 12);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeExpression_sempred(TypeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0091\u0501\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0001\u0000\u0005\u0000\u00b8\b\u0000\n\u0000\f\u0000"+
		"\u00bb\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u00c2\b\u0001\u0001\u0001\u0003\u0001\u00c5\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u00c9\b\u0001\u0001\u0001\u0003\u0001\u00cc"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u00d3\b\u0001\u0001\u0001\u0003\u0001\u00d6\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u00db\b\u0001\u0001\u0001\u0003\u0001"+
		"\u00de\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00e3\b"+
		"\u0001\u0001\u0001\u0003\u0001\u00e6\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u00ea\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00ee\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u00f2\b\u0001\u0003\u0001\u00f4\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u00f8\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ff\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0109\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0110\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0116\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u011b\b\u0005\u0001\u0005\u0003\u0005\u011e"+
		"\b\u0005\u0001\u0005\u0003\u0005\u0121\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0132"+
		"\b\t\n\t\f\t\u0135\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u013b\b"+
		"\n\n\n\f\n\u013e\t\n\u0001\n\u0001\n\u0001\n\u0003\n\u0143\b\n\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u0147\b\u000b\n\u000b\f\u000b\u014a\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u014e\b\u000b\u0001\u000b\u0004\u000b\u0151"+
		"\b\u000b\u000b\u000b\f\u000b\u0152\u0003\u000b\u0155\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u015a\b\f\n\f\f\f\u015d\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u016e\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u019b\b\r\n\r\f\r\u019e\t\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u01a3\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u01ad\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01b1\b"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u01b8\b\u000f\n\u000f\f\u000f\u01bb\t\u000f\u0001\u000f\u0003\u000f"+
		"\u01be\b\u000f\u0003\u000f\u01c0\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01c7\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u01d0\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u01d8\b\u0013\n\u0013\f\u0013\u01db\t\u0013"+
		"\u0003\u0013\u01dd\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u01e6\b\u0013\n\u0013"+
		"\f\u0013\u01e9\t\u0013\u0003\u0013\u01eb\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u01f1\b\u0013\u0001\u0013\u0003\u0013"+
		"\u01f4\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u01fc\b\u0013\n\u0013\f\u0013\u01ff\t\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0229\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u022d\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u0232\b\u0016\n\u0016\f\u0016\u0235\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u023b\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0242\b\u0017"+
		"\n\u0017\f\u0017\u0245\t\u0017\u0001\u0017\u0003\u0017\u0248\b\u0017\u0001"+
		"\u0018\u0003\u0018\u024b\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u024f"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0255"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u025b"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0261"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u0268\b\u0019\n\u0019\f\u0019\u026b\t\u0019\u0001\u0019\u0003\u0019"+
		"\u026e\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0272\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0276\b\u001a\u0001\u001a\u0003\u001a\u0279"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u027f"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0287\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u028f\b\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u029b\b\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0004\u001f\u02a0\b\u001f\u000b\u001f\f\u001f\u02a1"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0004\u001f\u02aa\b\u001f\u000b\u001f\f\u001f\u02ab\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u02b4"+
		"\b\u001f\n\u001f\f\u001f\u02b7\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u02bc\b\u001f\u0001 \u0001 \u0001 \u0003 \u02c1\b \u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u02de\b#\u0001$\u0001"+
		"$\u0005$\u02e2\b$\n$\f$\u02e5\t$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0003&\u02ef\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u02f6\b\'\u0001(\u0001(\u0001(\u0001(\u0004(\u02fc\b(\u000b"+
		"(\f(\u02fd\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0310\b(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u031a\b)\u0001"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0003+\u032b\b+\u0001,\u0001,\u0001,\u0001"+
		",\u0001-\u0001-\u0005-\u0333\b-\n-\f-\u0336\t-\u0001-\u0001-\u0001-\u0005"+
		"-\u033b\b-\n-\f-\u033e\t-\u0001-\u0003-\u0341\b-\u0001.\u0001.\u0003."+
		"\u0345\b.\u0001.\u0005.\u0348\b.\n.\f.\u034b\t.\u0001.\u0001.\u0003.\u034f"+
		"\b.\u0001.\u0003.\u0352\b.\u0001.\u0005.\u0355\b.\n.\f.\u0358\t.\u0001"+
		".\u0001.\u0003.\u035c\b.\u0001.\u0001.\u0003.\u0360\b.\u0001.\u0005.\u0363"+
		"\b.\n.\f.\u0366\t.\u0001.\u0001.\u0001.\u0005.\u036b\b.\n.\f.\u036e\t"+
		".\u0001.\u0001.\u0003.\u0372\b.\u0001.\u0001.\u0003.\u0376\b.\u0003.\u0378"+
		"\b.\u0001/\u0001/\u0001/\u0003/\u037d\b/\u0001/\u0003/\u0380\b/\u0001"+
		"/\u0001/\u0005/\u0384\b/\n/\f/\u0387\t/\u0001/\u0001/\u00010\u00010\u0004"+
		"0\u038d\b0\u000b0\f0\u038e\u00010\u00010\u00010\u00010\u00050\u0395\b"+
		"0\n0\f0\u0398\t0\u00010\u00010\u00030\u039c\b0\u00011\u00011\u00041\u03a0"+
		"\b1\u000b1\f1\u03a1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0005"+
		"1\u03ab\b1\n1\f1\u03ae\t1\u00011\u00011\u00031\u03b2\b1\u00012\u00012"+
		"\u00012\u00012\u00032\u03b8\b2\u00013\u00013\u00014\u00014\u00014\u0003"+
		"4\u03bf\b4\u00014\u00034\u03c2\b4\u00014\u00014\u00054\u03c6\b4\n4\f4"+
		"\u03c9\t4\u00014\u00014\u00015\u00015\u00015\u00035\u03d0\b5\u00015\u0003"+
		"5\u03d3\b5\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u00036\u03dc"+
		"\b6\u00016\u00036\u03df\b6\u00016\u00016\u00056\u03e3\b6\n6\f6\u03e6\t"+
		"6\u00016\u00016\u00017\u00017\u00037\u03ec\b7\u00017\u00017\u00037\u03f0"+
		"\b7\u00017\u00037\u03f3\b7\u00017\u00017\u00057\u03f7\b7\n7\f7\u03fa\t"+
		"7\u00017\u00017\u00018\u00018\u00038\u0400\b8\u00019\u00019\u00019\u0001"+
		"9\u00039\u0406\b9\u0001:\u0001:\u0001:\u0003:\u040b\b:\u0001:\u0001:\u0003"+
		":\u040f\b:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0005;\u0417\b;\n"+
		";\f;\u041a\t;\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u0421\b<\u0001"+
		"=\u0001=\u0003=\u0425\b=\u0001=\u0001=\u0001=\u0001=\u0003=\u042b\b=\u0003"+
		"=\u042d\b=\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u0434\b>\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u043f\b?\u0001"+
		"@\u0001@\u0001@\u0001@\u0003@\u0445\b@\u0001A\u0001A\u0001B\u0001B\u0001"+
		"B\u0003B\u044c\bB\u0001B\u0005B\u044f\bB\nB\fB\u0452\tB\u0001B\u0001B"+
		"\u0001B\u0001B\u0001B\u0003B\u0459\bB\u0001B\u0005B\u045c\bB\nB\fB\u045f"+
		"\tB\u0001B\u0001B\u0003B\u0463\bB\u0001C\u0001C\u0003C\u0467\bC\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0003C\u0472"+
		"\bC\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0003C\u047f\bC\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0003C\u048e\bC\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0003C\u0496\bC\u0001D\u0001D\u0003D\u049a"+
		"\bD\u0001D\u0003D\u049d\bD\u0001E\u0001E\u0003E\u04a1\bE\u0001E\u0001"+
		"E\u0005E\u04a5\bE\nE\fE\u04a8\tE\u0001E\u0003E\u04ab\bE\u0001E\u0001E"+
		"\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0003G\u04b6\bG\u0001"+
		"H\u0001H\u0003H\u04ba\bH\u0001H\u0001H\u0005H\u04be\bH\nH\fH\u04c1\tH"+
		"\u0001H\u0003H\u04c4\bH\u0001H\u0001H\u0001I\u0001I\u0001I\u0003I\u04cb"+
		"\bI\u0001J\u0001J\u0001J\u0001K\u0001K\u0001L\u0001L\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0003M\u04d9\bM\u0001N\u0001N\u0001O\u0001O\u0001O\u0003"+
		"O\u04e0\bO\u0001P\u0001P\u0003P\u04e4\bP\u0001P\u0001P\u0003P\u04e8\b"+
		"P\u0001Q\u0001Q\u0001R\u0001R\u0001S\u0001S\u0001T\u0001T\u0001U\u0001"+
		"U\u0001V\u0001V\u0001V\u0003V\u04f7\bV\u0001W\u0001W\u0001X\u0001X\u0001"+
		"Y\u0001Y\u0001Z\u0001Z\u0001Z\u0000\u0002\u001a&[\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u0000\u001b"+
		"\u0002\u0000\u000f\u000fCC\u0002\u000055[[\u0002\u0000\u0013\u0013\u0017"+
		"\u0017\u0002\u0000\u0015\u0016\u0018\u0018\u0002\u0000\u0013\u0013\u0015"+
		"\u0018\u0002\u0000\u000f\u000f\u001d\u001d\u0001\u0000\u001b\u001c\u0001"+
		"\u00009:\u0002\u0000##%%\u0002\u0000\t\t\u0019\u0019\u0002\u0000\u000f"+
		"\u000fAA\u0001\u0000GI\u0001\u0000AB\u0002\u0000EEJJ\u0001\u0000EF\u0001"+
		"\u0000SV\u0004\u0000ABll\u007f\u0080\u008a\u008a\u0004\u0000llnn}}\u007f"+
		"\u007f\u0003\u0000KLeeii\u0003\u0000mm{|\u0080\u0080\u0002\u0000vx~~\u0002"+
		"\u0000fgjk\u0001\u0000{|\u0001\u0000CD\u0004\u0000\r\u000eoprruu\u0005"+
		"\u0000eeiillssyy\u0003\u0000\r\r\u000f\u000fAB\u0599\u0000\u00b9\u0001"+
		"\u0000\u0000\u0000\u0002\u00f3\u0001\u0000\u0000\u0000\u0004\u00f7\u0001"+
		"\u0000\u0000\u0000\u0006\u00f9\u0001\u0000\u0000\u0000\b\u0115\u0001\u0000"+
		"\u0000\u0000\n\u0120\u0001\u0000\u0000\u0000\f\u0122\u0001\u0000\u0000"+
		"\u0000\u000e\u0126\u0001\u0000\u0000\u0000\u0010\u012a\u0001\u0000\u0000"+
		"\u0000\u0012\u012d\u0001\u0000\u0000\u0000\u0014\u0142\u0001\u0000\u0000"+
		"\u0000\u0016\u0154\u0001\u0000\u0000\u0000\u0018\u0156\u0001\u0000\u0000"+
		"\u0000\u001a\u016d\u0001\u0000\u0000\u0000\u001c\u01b0\u0001\u0000\u0000"+
		"\u0000\u001e\u01b2\u0001\u0000\u0000\u0000 \u01c6\u0001\u0000\u0000\u0000"+
		"\"\u01c8\u0001\u0000\u0000\u0000$\u01ca\u0001\u0000\u0000\u0000&\u01f3"+
		"\u0001\u0000\u0000\u0000(\u0200\u0001\u0000\u0000\u0000*\u0228\u0001\u0000"+
		"\u0000\u0000,\u023a\u0001\u0000\u0000\u0000.\u0247\u0001\u0000\u0000\u0000"+
		"0\u0260\u0001\u0000\u0000\u00002\u0262\u0001\u0000\u0000\u00004\u0278"+
		"\u0001\u0000\u0000\u00006\u027e\u0001\u0000\u0000\u00008\u0286\u0001\u0000"+
		"\u0000\u0000:\u028e\u0001\u0000\u0000\u0000<\u029a\u0001\u0000\u0000\u0000"+
		">\u02bb\u0001\u0000\u0000\u0000@\u02c0\u0001\u0000\u0000\u0000B\u02c2"+
		"\u0001\u0000\u0000\u0000D\u02c6\u0001\u0000\u0000\u0000F\u02dd\u0001\u0000"+
		"\u0000\u0000H\u02df\u0001\u0000\u0000\u0000J\u02e8\u0001\u0000\u0000\u0000"+
		"L\u02ee\u0001\u0000\u0000\u0000N\u02f5\u0001\u0000\u0000\u0000P\u030f"+
		"\u0001\u0000\u0000\u0000R\u0319\u0001\u0000\u0000\u0000T\u031b\u0001\u0000"+
		"\u0000\u0000V\u032a\u0001\u0000\u0000\u0000X\u032c\u0001\u0000\u0000\u0000"+
		"Z\u0340\u0001\u0000\u0000\u0000\\\u0377\u0001\u0000\u0000\u0000^\u0379"+
		"\u0001\u0000\u0000\u0000`\u039b\u0001\u0000\u0000\u0000b\u03b1\u0001\u0000"+
		"\u0000\u0000d\u03b7\u0001\u0000\u0000\u0000f\u03b9\u0001\u0000\u0000\u0000"+
		"h\u03bb\u0001\u0000\u0000\u0000j\u03cc\u0001\u0000\u0000\u0000l\u03d8"+
		"\u0001\u0000\u0000\u0000n\u03e9\u0001\u0000\u0000\u0000p\u03ff\u0001\u0000"+
		"\u0000\u0000r\u0401\u0001\u0000\u0000\u0000t\u0407\u0001\u0000\u0000\u0000"+
		"v\u0410\u0001\u0000\u0000\u0000x\u041b\u0001\u0000\u0000\u0000z\u042c"+
		"\u0001\u0000\u0000\u0000|\u0433\u0001\u0000\u0000\u0000~\u043e\u0001\u0000"+
		"\u0000\u0000\u0080\u0444\u0001\u0000\u0000\u0000\u0082\u0446\u0001\u0000"+
		"\u0000\u0000\u0084\u0462\u0001\u0000\u0000\u0000\u0086\u0495\u0001\u0000"+
		"\u0000\u0000\u0088\u049c\u0001\u0000\u0000\u0000\u008a\u049e\u0001\u0000"+
		"\u0000\u0000\u008c\u04ae\u0001\u0000\u0000\u0000\u008e\u04b5\u0001\u0000"+
		"\u0000\u0000\u0090\u04b7\u0001\u0000\u0000\u0000\u0092\u04ca\u0001\u0000"+
		"\u0000\u0000\u0094\u04cc\u0001\u0000\u0000\u0000\u0096\u04cf\u0001\u0000"+
		"\u0000\u0000\u0098\u04d1\u0001\u0000\u0000\u0000\u009a\u04d8\u0001\u0000"+
		"\u0000\u0000\u009c\u04da\u0001\u0000\u0000\u0000\u009e\u04df\u0001\u0000"+
		"\u0000\u0000\u00a0\u04e7\u0001\u0000\u0000\u0000\u00a2\u04e9\u0001\u0000"+
		"\u0000\u0000\u00a4\u04eb\u0001\u0000\u0000\u0000\u00a6\u04ed\u0001\u0000"+
		"\u0000\u0000\u00a8\u04ef\u0001\u0000\u0000\u0000\u00aa\u04f1\u0001\u0000"+
		"\u0000\u0000\u00ac\u04f6\u0001\u0000\u0000\u0000\u00ae\u04f8\u0001\u0000"+
		"\u0000\u0000\u00b0\u04fa\u0001\u0000\u0000\u0000\u00b2\u04fc\u0001\u0000"+
		"\u0000\u0000\u00b4\u04fe\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003\u0002"+
		"\u0001\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005\u0000\u0000\u0001\u00bd\u0001\u0001\u0000"+
		"\u0000\u0000\u00be\u00f4\u0003\u0004\u0002\u0000\u00bf\u00c2\u0003\b\u0004"+
		"\u0000\u00c0\u00c2\u0003\u0010\b\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c5\u0003\u0006\u0003\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00f4\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c9\u0003Z-\u0000\u00c7\u00c9\u0003*\u0015\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cc\u0003\u0006\u0003\u0000\u00cb\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00f4"+
		"\u0001\u0000\u0000\u0000\u00cd\u00d3\u0003D\"\u0000\u00ce\u00d3\u0003"+
		"8\u001c\u0000\u00cf\u00d3\u0003J%\u0000\u00d0\u00d3\u0003V+\u0000\u00d1"+
		"\u00d3\u0003X,\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d2\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d2\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d6\u0003\u0006\u0003\u0000\u00d5\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00f4\u0001"+
		"\u0000\u0000\u0000\u00d7\u00db\u0003$\u0012\u0000\u00d8\u00db\u0003h4"+
		"\u0000\u00d9\u00db\u0003^/\u0000\u00da\u00d7\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dc\u00de\u0003\u0006\u0003\u0000\u00dd"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u00f4\u0001\u0000\u0000\u0000\u00df\u00e3\u0003j5\u0000\u00e0\u00e3\u0003"+
		"l6\u0000\u00e1\u00e3\u0003n7\u0000\u00e2\u00df\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e6\u0003\u0006\u0003\u0000"+
		"\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e6\u00f4\u0001\u0000\u0000\u0000\u00e7\u00e9\u0003P(\u0000\u00e8\u00ea"+
		"\u0003\u0006\u0003\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00f4\u0001\u0000\u0000\u0000\u00eb\u00ed"+
		"\u0003\u001a\r\u0000\u00ec\u00ee\u0003\u0006\u0003\u0000\u00ed\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f4\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f1\u0003~?\u0000\u00f0\u00f2\u0003\u0006\u0003"+
		"\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00be\u0001\u0000\u0000"+
		"\u0000\u00f3\u00c1\u0001\u0000\u0000\u0000\u00f3\u00c8\u0001\u0000\u0000"+
		"\u0000\u00f3\u00d2\u0001\u0000\u0000\u0000\u00f3\u00da\u0001\u0000\u0000"+
		"\u0000\u00f3\u00e2\u0001\u0000\u0000\u0000\u00f3\u00e7\u0001\u0000\u0000"+
		"\u0000\u00f3\u00eb\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f4\u0003\u0001\u0000\u0000\u0000\u00f5\u00f8\u0003\u0006\u0003"+
		"\u0000\u00f6\u00f8\u0005\b\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u0005\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0005\t\u0000\u0000\u00fa\u0007\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0005\u000b\u0000\u0000\u00fc\u00fe\u0003\n\u0005\u0000\u00fd\u00ff"+
		"\u0007\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0001\u0000\u0000\u0000\u00ff\u0116\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0005\u000b\u0000\u0000\u0101\u0102\u0003\n\u0005\u0000\u0102\u0103\u0005"+
		"\n\u0000\u0000\u0103\u0104\u0003\u009eO\u0000\u0104\u0116\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0005\u000b\u0000\u0000\u0106\u0108\u0003\n\u0005"+
		"\u0000\u0107\u0109\u00055\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0003\u009eO\u0000\u010b\u0116\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0005\u000b\u0000\u0000\u010d\u010f\u0003\n\u0005\u0000\u010e\u0110"+
		"\u0007\u0001\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112"+
		"\u0003\u0012\t\u0000\u0112\u0116\u0001\u0000\u0000\u0000\u0113\u0114\u0005"+
		"\u000b\u0000\u0000\u0114\u0116\u0003\u008aE\u0000\u0115\u00fb\u0001\u0000"+
		"\u0000\u0000\u0115\u0100\u0001\u0000\u0000\u0000\u0115\u0105\u0001\u0000"+
		"\u0000\u0000\u0115\u010c\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000"+
		"\u0000\u0000\u0116\t\u0001\u0000\u0000\u0000\u0117\u0121\u0003\u009aM"+
		"\u0000\u0118\u0121\u0003\u009eO\u0000\u0119\u011b\u0003\f\u0006\u0000"+
		"\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u011e\u0003\u000e\u0007\u0000"+
		"\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0121\u00036\u001b\u0000\u0120"+
		"\u0117\u0001\u0000\u0000\u0000\u0120\u0118\u0001\u0000\u0000\u0000\u0120"+
		"\u011a\u0001\u0000\u0000\u0000\u0121\u000b\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0005;\u0000\u0000\u0123\u0124\u0003\u009eO\u0000\u0124\u0125\u0005"+
		"\u0010\u0000\u0000\u0125\r\u0001\u0000\u0000\u0000\u0126\u0127\u0005<"+
		"\u0000\u0000\u0127\u0128\u0003\u009eO\u0000\u0128\u0129\u0005\u0010\u0000"+
		"\u0000\u0129\u000f\u0001\u0000\u0000\u0000\u012a\u012b\u0005\f\u0000\u0000"+
		"\u012b\u012c\u0003\u009eO\u0000\u012c\u0011\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0005\u0001\u0000\u0000\u012e\u0133\u0003\u009eO\u0000\u012f\u0130"+
		"\u0005\u0019\u0000\u0000\u0130\u0132\u0003\u009eO\u0000\u0131\u012f\u0001"+
		"\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0136\u0001"+
		"\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u0137\u0005"+
		"\u0002\u0000\u0000\u0137\u0013\u0001\u0000\u0000\u0000\u0138\u013c\u0005"+
		"\u0001\u0000\u0000\u0139\u013b\u0003\u0002\u0001\u0000\u013a\u0139\u0001"+
		"\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f\u0001"+
		"\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0143\u0005"+
		"\u0002\u0000\u0000\u0140\u0141\u0005\u0011\u0000\u0000\u0141\u0143\u0003"+
		"\u001a\r\u0000\u0142\u0138\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000"+
		"\u0000\u0000\u0143\u0015\u0001\u0000\u0000\u0000\u0144\u0148\u0005\u0001"+
		"\u0000\u0000\u0145\u0147\u0003\u0002\u0001\u0000\u0146\u0145\u0001\u0000"+
		"\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014b\u0001\u0000"+
		"\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u0155\u0005\u0002"+
		"\u0000\u0000\u014c\u014e\u0005\u0011\u0000\u0000\u014d\u014c\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0001\u0000"+
		"\u0000\u0000\u014f\u0151\u0003\u0002\u0001\u0000\u0150\u014f\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0155\u0001\u0000"+
		"\u0000\u0000\u0154\u0144\u0001\u0000\u0000\u0000\u0154\u014d\u0001\u0000"+
		"\u0000\u0000\u0155\u0017\u0001\u0000\u0000\u0000\u0156\u015b\u0003\u001a"+
		"\r\u0000\u0157\u0158\u0005\u0019\u0000\u0000\u0158\u015a\u0003\u001a\r"+
		"\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000"+
		"\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000"+
		"\u0000\u015c\u0019\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0006\r\uffff\uffff\u0000\u015f\u016e\u0003\u001e\u000f"+
		"\u0000\u0160\u016e\u0003*\u0015\u0000\u0161\u0162\u0003\u009eO\u0000\u0162"+
		"\u0163\u0003\u009aM\u0000\u0163\u016e\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0003\u00a4R\u0000\u0165\u0166\u0003\u001a\r\r\u0166\u016e\u0001\u0000"+
		"\u0000\u0000\u0167\u016e\u0003~?\u0000\u0168\u0169\u0005\u0003\u0000\u0000"+
		"\u0169\u016a\u0003\u001a\r\u0000\u016a\u016b\u0005\u0004\u0000\u0000\u016b"+
		"\u016e\u0001\u0000\u0000\u0000\u016c\u016e\u0003\u001c\u000e\u0000\u016d"+
		"\u015e\u0001\u0000\u0000\u0000\u016d\u0160\u0001\u0000\u0000\u0000\u016d"+
		"\u0161\u0001\u0000\u0000\u0000\u016d\u0164\u0001\u0000\u0000\u0000\u016d"+
		"\u0167\u0001\u0000\u0000\u0000\u016d\u0168\u0001\u0000\u0000\u0000\u016d"+
		"\u016c\u0001\u0000\u0000\u0000\u016e\u019c\u0001\u0000\u0000\u0000\u016f"+
		"\u0170\n\u000b\u0000\u0000\u0170\u0171\u0003\u00a8T\u0000\u0171\u0172"+
		"\u0003\u001a\r\f\u0172\u019b\u0001\u0000\u0000\u0000\u0173\u0174\n\n\u0000"+
		"\u0000\u0174\u0175\u0003\u00aaU\u0000\u0175\u0176\u0003\u001a\r\u000b"+
		"\u0176\u019b\u0001\u0000\u0000\u0000\u0177\u0178\n\t\u0000\u0000\u0178"+
		"\u0179\u0003\u00acV\u0000\u0179\u017a\u0003\u001a\r\n\u017a\u019b\u0001"+
		"\u0000\u0000\u0000\u017b\u017c\n\b\u0000\u0000\u017c\u017d\u0003\u00ae"+
		"W\u0000\u017d\u017e\u0003\u001a\r\b\u017e\u019b\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\n\u0007\u0000\u0000\u0180\u0181\u0003\u00b0X\u0000\u0181"+
		"\u0182\u0003\u001a\r\b\u0182\u019b\u0001\u0000\u0000\u0000\u0183\u0184"+
		"\n\u0006\u0000\u0000\u0184\u0185\u0003\u00a2Q\u0000\u0185\u0186\u0003"+
		"\u001a\r\u0007\u0186\u019b\u0001\u0000\u0000\u0000\u0187\u0188\n\u0005"+
		"\u0000\u0000\u0188\u0189\u0003\u00b2Y\u0000\u0189\u018a\u0003\u001a\r"+
		"\u0006\u018a\u019b\u0001\u0000\u0000\u0000\u018b\u018c\n\u0013\u0000\u0000"+
		"\u018c\u018d\u0005[\u0000\u0000\u018d\u019b\u0003\u009eO\u0000\u018e\u018f"+
		"\n\u0012\u0000\u0000\u018f\u0190\u0005[\u0000\u0000\u0190\u019b\u0003"+
		"\u001e\u000f\u0000\u0191\u0192\n\u0011\u0000\u0000\u0192\u019b\u0003\u0084"+
		"B\u0000\u0193\u0194\n\u000e\u0000\u0000\u0194\u0195\u0005\n\u0000\u0000"+
		"\u0195\u019b\u0003&\u0013\u0000\u0196\u0197\n\f\u0000\u0000\u0197\u019b"+
		"\u0003\u00a6S\u0000\u0198\u0199\n\u0001\u0000\u0000\u0199\u019b\u0005"+
		"\u001c\u0000\u0000\u019a\u016f\u0001\u0000\u0000\u0000\u019a\u0173\u0001"+
		"\u0000\u0000\u0000\u019a\u0177\u0001\u0000\u0000\u0000\u019a\u017b\u0001"+
		"\u0000\u0000\u0000\u019a\u017f\u0001\u0000\u0000\u0000\u019a\u0183\u0001"+
		"\u0000\u0000\u0000\u019a\u0187\u0001\u0000\u0000\u0000\u019a\u018b\u0001"+
		"\u0000\u0000\u0000\u019a\u018e\u0001\u0000\u0000\u0000\u019a\u0191\u0001"+
		"\u0000\u0000\u0000\u019a\u0193\u0001\u0000\u0000\u0000\u019a\u0196\u0001"+
		"\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019e\u0001"+
		"\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001"+
		"\u0000\u0000\u0000\u019d\u001b\u0001\u0000\u0000\u0000\u019e\u019c\u0001"+
		"\u0000\u0000\u0000\u019f\u01a2\u0007\u0002\u0000\u0000\u01a0\u01a1\u0005"+
		"\u0003\u0000\u0000\u01a1\u01a3\u0005\u0004\u0000\u0000\u01a2\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01b1\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a5\u0007\u0003\u0000\u0000\u01a5\u01b1\u0003"+
		"\u001a\r\u0000\u01a6\u01a7\u0005\u0014\u0000\u0000\u01a7\u01b1\u0003\u0018"+
		"\f\u0000\u01a8\u01a9\u0005\u0014\u0000\u0000\u01a9\u01aa\u0005\u0003\u0000"+
		"\u0000\u01aa\u01ac\u0003\u0018\f\u0000\u01ab\u01ad\u0005\u0019\u0000\u0000"+
		"\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0005\u0004\u0000\u0000"+
		"\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u019f\u0001\u0000\u0000\u0000"+
		"\u01b0\u01a4\u0001\u0000\u0000\u0000\u01b0\u01a6\u0001\u0000\u0000\u0000"+
		"\u01b0\u01a8\u0001\u0000\u0000\u0000\u01b1\u001d\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b3\u00036\u001b\u0000\u01b3\u01bf\u0005\u0003\u0000\u0000\u01b4"+
		"\u01b9\u0003 \u0010\u0000\u01b5\u01b6\u0005\u0019\u0000\u0000\u01b6\u01b8"+
		"\u0003 \u0010\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001"+
		"\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bc\u01be\u0005\u0019\u0000\u0000\u01bd\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01c0\u0001"+
		"\u0000\u0000\u0000\u01bf\u01b4\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005"+
		"\u0004\u0000\u0000\u01c2\u001f\u0001\u0000\u0000\u0000\u01c3\u01c7\u0003"+
		"\u001a\r\u0000\u01c4\u01c7\u0003\u001e\u000f\u0000\u01c5\u01c7\u0003~"+
		"?\u0000\u01c6\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c7!\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c9\u0007\u0004\u0000\u0000\u01c9#\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cb\u0005\u001a\u0000\u0000\u01cb\u01cc\u0003\u009eO\u0000\u01cc\u01cd"+
		"\u0005\u0001\u0000\u0000\u01cd\u01cf\u0003&\u0013\u0000\u01ce\u01d0\u0005"+
		"\u0002\u0000\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d0%\u0001\u0000\u0000\u0000\u01d1\u01d2\u0006\u0013"+
		"\uffff\uffff\u0000\u01d2\u01d3\u0003\u009eO\u0000\u01d3\u01dc\u0005\u0003"+
		"\u0000\u0000\u01d4\u01d9\u0003&\u0013\u0000\u01d5\u01d6\u0005\u0019\u0000"+
		"\u0000\u01d6\u01d8\u0003&\u0013\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000"+
		"\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01dd\u0001\u0000\u0000\u0000"+
		"\u01db\u01d9\u0001\u0000\u0000\u0000\u01dc\u01d4\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000"+
		"\u01de\u01df\u0005\u0004\u0000\u0000\u01df\u01f4\u0001\u0000\u0000\u0000"+
		"\u01e0\u01e1\u0003\u009eO\u0000\u01e1\u01ea\u0005g\u0000\u0000\u01e2\u01e7"+
		"\u0003&\u0013\u0000\u01e3\u01e4\u0005\u0019\u0000\u0000\u01e4\u01e6\u0003"+
		"&\u0013\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e6\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000"+
		"\u0000\u0000\u01e8\u01eb\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000"+
		"\u0000\u0000\u01ea\u01e2\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005k\u0000"+
		"\u0000\u01ed\u01f4\u0001\u0000\u0000\u0000\u01ee\u01f0\u0003\u009eO\u0000"+
		"\u01ef\u01f1\u0007\u0005\u0000\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f4\u0003\u0098L\u0000\u01f3\u01d1\u0001\u0000\u0000\u0000\u01f3"+
		"\u01e0\u0001\u0000\u0000\u0000\u01f3\u01ee\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f4\u01fd\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f6\n\u0004\u0000\u0000\u01f6\u01f7\u0007\u0006\u0000\u0000\u01f7\u01fc"+
		"\u0003&\u0013\u0005\u01f8\u01f9\n\u0003\u0000\u0000\u01f9\u01fa\u0005"+
		"\u0005\u0000\u0000\u01fa\u01fc\u0005\u0006\u0000\u0000\u01fb\u01f5\u0001"+
		"\u0000\u0000\u0000\u01fb\u01f8\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001"+
		"\u0000\u0000\u0000\u01fe\'\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000"+
		"\u0000\u0000\u0200\u0201\u0007\u0007\u0000\u0000\u0201\u0202\u0003&\u0013"+
		"\u0000\u0202)\u0001\u0000\u0000\u0000\u0203\u0204\u0005 \u0000\u0000\u0204"+
		"\u0205\u0003,\u0016\u0000\u0205\u0206\u0003\u0014\n\u0000\u0206\u0229"+
		"\u0001\u0000\u0000\u0000\u0207\u0208\u0005!\u0000\u0000\u0208\u0209\u0003"+
		",\u0016\u0000\u0209\u020a\u0003\u0014\n\u0000\u020a\u0229\u0001\u0000"+
		"\u0000\u0000\u020b\u020c\u0005\"\u0000\u0000\u020c\u020d\u0003,\u0016"+
		"\u0000\u020d\u020e\u0003\u0014\n\u0000\u020e\u0229\u0001\u0000\u0000\u0000"+
		"\u020f\u0210\u0005\"\u0000\u0000\u0210\u0211\u00032\u0019\u0000\u0211"+
		"\u0212\u0003\u0014\n\u0000\u0212\u0229\u0001\u0000\u0000\u0000\u0213\u0214"+
		"\u00032\u0019\u0000\u0214\u0215\u0007\b\u0000\u0000\u0215\u0216\u0003"+
		".\u0017\u0000\u0216\u0229\u0001\u0000\u0000\u0000\u0217\u0218\u0003,\u0016"+
		"\u0000\u0218\u0219\u0003\u00b4Z\u0000\u0219\u021a\u0005#\u0000\u0000\u021a"+
		"\u021b\u0003.\u0017\u0000\u021b\u0229\u0001\u0000\u0000\u0000\u021c\u021d"+
		"\u0003,\u0016\u0000\u021d\u021e\u0005#\u0000\u0000\u021e\u021f\u0003."+
		"\u0017\u0000\u021f\u0229\u0001\u0000\u0000\u0000\u0220\u0221\u0003,\u0016"+
		"\u0000\u0221\u0222\u0005$\u0000\u0000\u0222\u0223\u0003.\u0017\u0000\u0223"+
		"\u0229\u0001\u0000\u0000\u0000\u0224\u0225\u0003,\u0016\u0000\u0225\u0226"+
		"\u0005%\u0000\u0000\u0226\u0227\u0003.\u0017\u0000\u0227\u0229\u0001\u0000"+
		"\u0000\u0000\u0228\u0203\u0001\u0000\u0000\u0000\u0228\u0207\u0001\u0000"+
		"\u0000\u0000\u0228\u020b\u0001\u0000\u0000\u0000\u0228\u020f\u0001\u0000"+
		"\u0000\u0000\u0228\u0213\u0001\u0000\u0000\u0000\u0228\u0217\u0001\u0000"+
		"\u0000\u0000\u0228\u021c\u0001\u0000\u0000\u0000\u0228\u0220\u0001\u0000"+
		"\u0000\u0000\u0228\u0224\u0001\u0000\u0000\u0000\u0229+\u0001\u0000\u0000"+
		"\u0000\u022a\u022c\u0003\u009eO\u0000\u022b\u022d\u0003(\u0014\u0000\u022c"+
		"\u022b\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d"+
		"\u023b\u0001\u0000\u0000\u0000\u022e\u0233\u00034\u001a\u0000\u022f\u0230"+
		"\u0005\u0019\u0000\u0000\u0230\u0232\u00034\u001a\u0000\u0231\u022f\u0001"+
		"\u0000\u0000\u0000\u0232\u0235\u0001\u0000\u0000\u0000\u0233\u0231\u0001"+
		"\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u023b\u0001"+
		"\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0236\u023b\u0003"+
		"6\u001b\u0000\u0237\u0238\u00036\u001b\u0000\u0238\u0239\u0003\u0084B"+
		"\u0000\u0239\u023b\u0001\u0000\u0000\u0000\u023a\u022a\u0001\u0000\u0000"+
		"\u0000\u023a\u022e\u0001\u0000\u0000\u0000\u023a\u0236\u0001\u0000\u0000"+
		"\u0000\u023a\u0237\u0001\u0000\u0000\u0000\u023b-\u0001\u0000\u0000\u0000"+
		"\u023c\u0248\u0003\u001a\r\u0000\u023d\u0248\u0003\u0018\f\u0000\u023e"+
		"\u0248\u0003\u0002\u0001\u0000\u023f\u0243\u0005\u0001\u0000\u0000\u0240"+
		"\u0242\u0003\u0002\u0001\u0000\u0241\u0240\u0001\u0000\u0000\u0000\u0242"+
		"\u0245\u0001\u0000\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0243"+
		"\u0244\u0001\u0000\u0000\u0000\u0244\u0246\u0001\u0000\u0000\u0000\u0245"+
		"\u0243\u0001\u0000\u0000\u0000\u0246\u0248\u0005\u0002\u0000\u0000\u0247"+
		"\u023c\u0001\u0000\u0000\u0000\u0247\u023d\u0001\u0000\u0000\u0000\u0247"+
		"\u023e\u0001\u0000\u0000\u0000\u0247\u023f\u0001\u0000\u0000\u0000\u0248"+
		"/\u0001\u0000\u0000\u0000\u0249\u024b\u0003&\u0013\u0000\u024a\u0249\u0001"+
		"\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024c\u0001"+
		"\u0000\u0000\u0000\u024c\u0261\u0003\u009eO\u0000\u024d\u024f\u0003&\u0013"+
		"\u0000\u024e\u024d\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0251\u0003\u009eO\u0000"+
		"\u0251\u0252\u0005\u000f\u0000\u0000\u0252\u0261\u0001\u0000\u0000\u0000"+
		"\u0253\u0255\u0003&\u0013\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0254"+
		"\u0255\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256"+
		"\u0257\u0003\u009eO\u0000\u0257\u0258\u0005\u001e\u0000\u0000\u0258\u0261"+
		"\u0001\u0000\u0000\u0000\u0259\u025b\u0003&\u0013\u0000\u025a\u0259\u0001"+
		"\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u025c\u0001"+
		"\u0000\u0000\u0000\u025c\u025d\u0003\u009eO\u0000\u025d\u025e\u0005\u001d"+
		"\u0000\u0000\u025e\u025f\u0003\u009eO\u0000\u025f\u0261\u0001\u0000\u0000"+
		"\u0000\u0260\u024a\u0001\u0000\u0000\u0000\u0260\u024e\u0001\u0000\u0000"+
		"\u0000\u0260\u0254\u0001\u0000\u0000\u0000\u0260\u025a\u0001\u0000\u0000"+
		"\u0000\u02611\u0001\u0000\u0000\u0000\u0262\u0263\u0003\u009eO\u0000\u0263"+
		"\u0264\u0005\u0003\u0000\u0000\u0264\u0269\u00030\u0018\u0000\u0265\u0266"+
		"\u0005\u0019\u0000\u0000\u0266\u0268\u00030\u0018\u0000\u0267\u0265\u0001"+
		"\u0000\u0000\u0000\u0268\u026b\u0001\u0000\u0000\u0000\u0269\u0267\u0001"+
		"\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026d\u0001"+
		"\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u026e\u0005"+
		"\u0019\u0000\u0000\u026d\u026c\u0001\u0000\u0000\u0000\u026d\u026e\u0001"+
		"\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0271\u0005"+
		"\u0004\u0000\u0000\u0270\u0272\u0003(\u0014\u0000\u0271\u0270\u0001\u0000"+
		"\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u02723\u0001\u0000\u0000"+
		"\u0000\u0273\u0275\u00036\u001b\u0000\u0274\u0276\u0003(\u0014\u0000\u0275"+
		"\u0274\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276"+
		"\u0279\u0001\u0000\u0000\u0000\u0277\u0279\u0005;\u0000\u0000\u0278\u0273"+
		"\u0001\u0000\u0000\u0000\u0278\u0277\u0001\u0000\u0000\u0000\u02795\u0001"+
		"\u0000\u0000\u0000\u027a\u027f\u0005W\u0000\u0000\u027b\u027c\u0005X\u0000"+
		"\u0000\u027c\u027d\u0005[\u0000\u0000\u027d\u027f\u0003\u009eO\u0000\u027e"+
		"\u027a\u0001\u0000\u0000\u0000\u027e\u027b\u0001\u0000\u0000\u0000\u027f"+
		"7\u0001\u0000\u0000\u0000\u0280\u0281\u0005&\u0000\u0000\u0281\u0287\u0003"+
		":\u001d\u0000\u0282\u0283\u0005&\u0000\u0000\u0283\u0287\u0003<\u001e"+
		"\u0000\u0284\u0285\u0005&\u0000\u0000\u0285\u0287\u0003>\u001f\u0000\u0286"+
		"\u0280\u0001\u0000\u0000\u0000\u0286\u0282\u0001\u0000\u0000\u0000\u0286"+
		"\u0284\u0001\u0000\u0000\u0000\u02879\u0001\u0000\u0000\u0000\u0288\u0289"+
		"\u0003N\'\u0000\u0289\u028a\u0003\u001a\r\u0000\u028a\u028f\u0001\u0000"+
		"\u0000\u0000\u028b\u028c\u0003N\'\u0000\u028c\u028d\u0003\u0014\n\u0000"+
		"\u028d\u028f\u0001\u0000\u0000\u0000\u028e\u0288\u0001\u0000\u0000\u0000"+
		"\u028e\u028b\u0001\u0000\u0000\u0000\u028f;\u0001\u0000\u0000\u0000\u0290"+
		"\u0291\u0003N\'\u0000\u0291\u0292\u0003\u0016\u000b\u0000\u0292\u0293"+
		"\u0005\'\u0000\u0000\u0293\u0294\u0003\u001a\r\u0000\u0294\u029b\u0001"+
		"\u0000\u0000\u0000\u0295\u0296\u0003N\'\u0000\u0296\u0297\u0003\u0016"+
		"\u000b\u0000\u0297\u0298\u0005\'\u0000\u0000\u0298\u0299\u0003\u0014\n"+
		"\u0000\u0299\u029b\u0001\u0000\u0000\u0000\u029a\u0290\u0001\u0000\u0000"+
		"\u0000\u029a\u0295\u0001\u0000\u0000\u0000\u029b=\u0001\u0000\u0000\u0000"+
		"\u029c\u029d\u0003N\'\u0000\u029d\u029f\u0003\u0016\u000b\u0000\u029e"+
		"\u02a0\u0003B!\u0000\u029f\u029e\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001"+
		"\u0000\u0000\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3\u02a4\u0005"+
		"\'\u0000\u0000\u02a4\u02a5\u0003\u001a\r\u0000\u02a5\u02bc\u0001\u0000"+
		"\u0000\u0000\u02a6\u02a7\u0003N\'\u0000\u02a7\u02a9\u0003\u0016\u000b"+
		"\u0000\u02a8\u02aa\u0003B!\u0000\u02a9\u02a8\u0001\u0000\u0000\u0000\u02aa"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ab"+
		"\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad"+
		"\u02ae\u0005\'\u0000\u0000\u02ae\u02af\u0003\u0014\n\u0000\u02af\u02bc"+
		"\u0001\u0000\u0000\u0000\u02b0\u02b1\u0003N\'\u0000\u02b1\u02b5\u0003"+
		"\u0016\u000b\u0000\u02b2\u02b4\u0003B!\u0000\u02b3\u02b2\u0001\u0000\u0000"+
		"\u0000\u02b4\u02b7\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6\u02b8\u0001\u0000\u0000"+
		"\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b8\u02b9\u0003@ \u0000\u02b9"+
		"\u02ba\u0003:\u001d\u0000\u02ba\u02bc\u0001\u0000\u0000\u0000\u02bb\u029c"+
		"\u0001\u0000\u0000\u0000\u02bb\u02a6\u0001\u0000\u0000\u0000\u02bb\u02b0"+
		"\u0001\u0000\u0000\u0000\u02bc?\u0001\u0000\u0000\u0000\u02bd\u02c1\u0005"+
		"(\u0000\u0000\u02be\u02bf\u0005\'\u0000\u0000\u02bf\u02c1\u0005&\u0000"+
		"\u0000\u02c0\u02bd\u0001\u0000\u0000\u0000\u02c0\u02be\u0001\u0000\u0000"+
		"\u0000\u02c1A\u0001\u0000\u0000\u0000\u02c2\u02c3\u0003@ \u0000\u02c3"+
		"\u02c4\u0003N\'\u0000\u02c4\u02c5\u0003\u0016\u000b\u0000\u02c5C\u0001"+
		"\u0000\u0000\u0000\u02c6\u02c7\u0005)\u0000\u0000\u02c7\u02c8\u0003N\'"+
		"\u0000\u02c8\u02c9\u0003H$\u0000\u02c9E\u0001\u0000\u0000\u0000\u02ca"+
		"\u02cb\u0005*\u0000\u0000\u02cb\u02cc\u0003\u001a\r\u0000\u02cc\u02cd"+
		"\u0005\u0011\u0000\u0000\u02cd\u02ce\u0003\u0016\u000b\u0000\u02ce\u02de"+
		"\u0001\u0000\u0000\u0000\u02cf\u02d0\u0003\u001a\r\u0000\u02d0\u02d1\u0005"+
		"-\u0000\u0000\u02d1\u02d2\u0003\u0016\u000b\u0000\u02d2\u02de\u0001\u0000"+
		"\u0000\u0000\u02d3\u02d4\u0005+\u0000\u0000\u02d4\u02d5\u0005\u0011\u0000"+
		"\u0000\u02d5\u02de\u0003\u0016\u000b\u0000\u02d6\u02d7\u0005*\u0000\u0000"+
		"\u02d7\u02d8\u0005\u000f\u0000\u0000\u02d8\u02d9\u0005\u0011\u0000\u0000"+
		"\u02d9\u02de\u0003\u0016\u000b\u0000\u02da\u02db\u0005\u000f\u0000\u0000"+
		"\u02db\u02dc\u0005-\u0000\u0000\u02dc\u02de\u0003\u0016\u000b\u0000\u02dd"+
		"\u02ca\u0001\u0000\u0000\u0000\u02dd\u02cf\u0001\u0000\u0000\u0000\u02dd"+
		"\u02d3\u0001\u0000\u0000\u0000\u02dd\u02d6\u0001\u0000\u0000\u0000\u02dd"+
		"\u02da\u0001\u0000\u0000\u0000\u02deG\u0001\u0000\u0000\u0000\u02df\u02e3"+
		"\u0005\u0001\u0000\u0000\u02e0\u02e2\u0003F#\u0000\u02e1\u02e0\u0001\u0000"+
		"\u0000\u0000\u02e2\u02e5\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000"+
		"\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000\u02e4\u02e6\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e6\u02e7\u0005\u0002"+
		"\u0000\u0000\u02e7I\u0001\u0000\u0000\u0000\u02e8\u02e9\u0005,\u0000\u0000"+
		"\u02e9\u02ea\u0003N\'\u0000\u02ea\u02eb\u0003L&\u0000\u02ebK\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ef\u0003\u001a\r\u0000\u02ed\u02ef\u0003\u0014\n"+
		"\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ee\u02ed\u0001\u0000\u0000"+
		"\u0000\u02efM\u0001\u0000\u0000\u0000\u02f0\u02f6\u0003\u001a\r\u0000"+
		"\u02f1\u02f2\u0005\u0003\u0000\u0000\u02f2\u02f3\u0003\u001a\r\u0000\u02f3"+
		"\u02f4\u0005\u0004\u0000\u0000\u02f4\u02f6\u0001\u0000\u0000\u0000\u02f5"+
		"\u02f0\u0001\u0000\u0000\u0000\u02f5\u02f1\u0001\u0000\u0000\u0000\u02f6"+
		"O\u0001\u0000\u0000\u0000\u02f7\u02f8\u0005.\u0000\u0000\u02f8\u02fb\u0003"+
		"\u0016\u000b\u0000\u02f9\u02fa\u0005/\u0000\u0000\u02fa\u02fc\u0003R)"+
		"\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000"+
		"\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000"+
		"\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff\u0300\u0003T*\u0000\u0300"+
		"\u0310\u0001\u0000\u0000\u0000\u0301\u0302\u0005.\u0000\u0000\u0302\u0303"+
		"\u0003\u0016\u000b\u0000\u0303\u0304\u0005/\u0000\u0000\u0304\u0305\u0003"+
		"\u009eO\u0000\u0305\u0306\u0003\u0016\u000b\u0000\u0306\u0310\u0001\u0000"+
		"\u0000\u0000\u0307\u0308\u0005.\u0000\u0000\u0308\u0309\u0003\u0016\u000b"+
		"\u0000\u0309\u030a\u0005/\u0000\u0000\u030a\u030b\u0005\u0003\u0000\u0000"+
		"\u030b\u030c\u0003\u009eO\u0000\u030c\u030d\u0005\u0004\u0000\u0000\u030d"+
		"\u030e\u0003\u0016\u000b\u0000\u030e\u0310\u0001\u0000\u0000\u0000\u030f"+
		"\u02f7\u0001\u0000\u0000\u0000\u030f\u0301\u0001\u0000\u0000\u0000\u030f"+
		"\u0307\u0001\u0000\u0000\u0000\u0310Q\u0001\u0000\u0000\u0000\u0311\u0312"+
		"\u0003\u009eO\u0000\u0312\u0313\u0003\u0016\u000b\u0000\u0313\u031a\u0001"+
		"\u0000\u0000\u0000\u0314\u0315\u0005\u0003\u0000\u0000\u0315\u0316\u0003"+
		"\u009eO\u0000\u0316\u0317\u0005\u0004\u0000\u0000\u0317\u0318\u0003\u0016"+
		"\u000b\u0000\u0318\u031a\u0001\u0000\u0000\u0000\u0319\u0311\u0001\u0000"+
		"\u0000\u0000\u0319\u0314\u0001\u0000\u0000\u0000\u031aS\u0001\u0000\u0000"+
		"\u0000\u031b\u031c\u00050\u0000\u0000\u031c\u031d\u0003\u0014\n\u0000"+
		"\u031dU\u0001\u0000\u0000\u0000\u031e\u031f\u00052\u0000\u0000\u031f\u0320"+
		"\u0005\u0003\u0000\u0000\u0320\u0321\u0003\u0018\f\u0000\u0321\u0322\u0005"+
		"\u0004\u0000\u0000\u0322\u0323\u0003\u0014\n\u0000\u0323\u032b\u0001\u0000"+
		"\u0000\u0000\u0324\u0325\u00052\u0000\u0000\u0325\u0326\u0003\u009eO\u0000"+
		"\u0326\u0327\u00051\u0000\u0000\u0327\u0328\u0003\u001a\r\u0000\u0328"+
		"\u0329\u0003\u0014\n\u0000\u0329\u032b\u0001\u0000\u0000\u0000\u032a\u031e"+
		"\u0001\u0000\u0000\u0000\u032a\u0324\u0001\u0000\u0000\u0000\u032bW\u0001"+
		"\u0000\u0000\u0000\u032c\u032d\u00053\u0000\u0000\u032d\u032e\u0003N\'"+
		"\u0000\u032e\u032f\u0003\u0014\n\u0000\u032fY\u0001\u0000\u0000\u0000"+
		"\u0330\u0334\u00056\u0000\u0000\u0331\u0333\u0003\u009eO\u0000\u0332\u0331"+
		"\u0001\u0000\u0000\u0000\u0333\u0336\u0001\u0000\u0000\u0000\u0334\u0332"+
		"\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000\u0000\u0335\u0337"+
		"\u0001\u0000\u0000\u0000\u0336\u0334\u0001\u0000\u0000\u0000\u0337\u0341"+
		"\u0003\u0002\u0001\u0000\u0338\u033c\u00056\u0000\u0000\u0339\u033b\u0003"+
		"\u009eO\u0000\u033a\u0339\u0001\u0000\u0000\u0000\u033b\u033e\u0001\u0000"+
		"\u0000\u0000\u033c\u033a\u0001\u0000\u0000\u0000\u033c\u033d\u0001\u0000"+
		"\u0000\u0000\u033d\u033f\u0001\u0000\u0000\u0000\u033e\u033c\u0001\u0000"+
		"\u0000\u0000\u033f\u0341\u0003\u0014\n\u0000\u0340\u0330\u0001\u0000\u0000"+
		"\u0000\u0340\u0338\u0001\u0000\u0000\u0000\u0341[\u0001\u0000\u0000\u0000"+
		"\u0342\u0344\u0003\u0004\u0002\u0000\u0343\u0345\u0003f3\u0000\u0344\u0343"+
		"\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000\u0000\u0345\u0378"+
		"\u0001\u0000\u0000\u0000\u0346\u0348\u0003d2\u0000\u0347\u0346\u0001\u0000"+
		"\u0000\u0000\u0348\u034b\u0001\u0000\u0000\u0000\u0349\u0347\u0001\u0000"+
		"\u0000\u0000\u0349\u034a\u0001\u0000\u0000\u0000\u034a\u034c\u0001\u0000"+
		"\u0000\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034c\u034e\u0003\u009e"+
		"O\u0000\u034d\u034f\u0003(\u0014\u0000\u034e\u034d\u0001\u0000\u0000\u0000"+
		"\u034e\u034f\u0001\u0000\u0000\u0000\u034f\u0351\u0001\u0000\u0000\u0000"+
		"\u0350\u0352\u0003f3\u0000\u0351\u0350\u0001\u0000\u0000\u0000\u0351\u0352"+
		"\u0001\u0000\u0000\u0000\u0352\u0378\u0001\u0000\u0000\u0000\u0353\u0355"+
		"\u0003d2\u0000\u0354\u0353\u0001\u0000\u0000\u0000\u0355\u0358\u0001\u0000"+
		"\u0000\u0000\u0356\u0354\u0001\u0000\u0000\u0000\u0356\u0357\u0001\u0000"+
		"\u0000\u0000\u0357\u0359\u0001\u0000\u0000\u0000\u0358\u0356\u0001\u0000"+
		"\u0000\u0000\u0359\u035b\u0003\u009eO\u0000\u035a\u035c\u0003(\u0014\u0000"+
		"\u035b\u035a\u0001\u0000\u0000\u0000\u035b\u035c\u0001\u0000\u0000\u0000"+
		"\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u035f\u0003\u0014\n\u0000\u035e"+
		"\u0360\u0003f3\u0000\u035f\u035e\u0001\u0000\u0000\u0000\u035f\u0360\u0001"+
		"\u0000\u0000\u0000\u0360\u0378\u0001\u0000\u0000\u0000\u0361\u0363\u0003"+
		"d2\u0000\u0362\u0361\u0001\u0000\u0000\u0000\u0363\u0366\u0001\u0000\u0000"+
		"\u0000\u0364\u0362\u0001\u0000\u0000\u0000\u0364\u0365\u0001\u0000\u0000"+
		"\u0000\u0365\u0367\u0001\u0000\u0000\u0000\u0366\u0364\u0001\u0000\u0000"+
		"\u0000\u0367\u0368\u0003\u009eO\u0000\u0368\u036c\u0005\u0003\u0000\u0000"+
		"\u0369\u036b\u00030\u0018\u0000\u036a\u0369\u0001\u0000\u0000\u0000\u036b"+
		"\u036e\u0001\u0000\u0000\u0000\u036c\u036a\u0001\u0000\u0000\u0000\u036c"+
		"\u036d\u0001\u0000\u0000\u0000\u036d\u036f\u0001\u0000\u0000\u0000\u036e"+
		"\u036c\u0001\u0000\u0000\u0000\u036f\u0371\u0005\u0004\u0000\u0000\u0370"+
		"\u0372\u0003(\u0014\u0000\u0371\u0370\u0001\u0000\u0000\u0000\u0371\u0372"+
		"\u0001\u0000\u0000\u0000\u0372\u0373\u0001\u0000\u0000\u0000\u0373\u0375"+
		"\u0003\u0014\n\u0000\u0374\u0376\u0003f3\u0000\u0375\u0374\u0001\u0000"+
		"\u0000\u0000\u0375\u0376\u0001\u0000\u0000\u0000\u0376\u0378\u0001\u0000"+
		"\u0000\u0000\u0377\u0342\u0001\u0000\u0000\u0000\u0377\u0349\u0001\u0000"+
		"\u0000\u0000\u0377\u0356\u0001\u0000\u0000\u0000\u0377\u0364\u0001\u0000"+
		"\u0000\u0000\u0378]\u0001\u0000\u0000\u0000\u0379\u037a\u00057\u0000\u0000"+
		"\u037a\u037c\u0003\u009eO\u0000\u037b\u037d\u0003`0\u0000\u037c\u037b"+
		"\u0001\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000\u037d\u037f"+
		"\u0001\u0000\u0000\u0000\u037e\u0380\u0003b1\u0000\u037f\u037e\u0001\u0000"+
		"\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000\u0380\u0381\u0001\u0000"+
		"\u0000\u0000\u0381\u0385\u0005\u0001\u0000\u0000\u0382\u0384\u0003\\."+
		"\u0000\u0383\u0382\u0001\u0000\u0000\u0000\u0384\u0387\u0001\u0000\u0000"+
		"\u0000\u0385\u0383\u0001\u0000\u0000\u0000\u0385\u0386\u0001\u0000\u0000"+
		"\u0000\u0386\u0388\u0001\u0000\u0000\u0000\u0387\u0385\u0001\u0000\u0000"+
		"\u0000\u0388\u0389\u0005\u0002\u0000\u0000\u0389_\u0001\u0000\u0000\u0000"+
		"\u038a\u038c\u00058\u0000\u0000\u038b\u038d\u0003\u009eO\u0000\u038c\u038b"+
		"\u0001\u0000\u0000\u0000\u038d\u038e\u0001\u0000\u0000\u0000\u038e\u038c"+
		"\u0001\u0000\u0000\u0000\u038e\u038f\u0001\u0000\u0000\u0000\u038f\u039c"+
		"\u0001\u0000\u0000\u0000\u0390\u0391\u0005\u0003\u0000\u0000\u0391\u0396"+
		"\u0003\u009eO\u0000\u0392\u0393\u0005\u0019\u0000\u0000\u0393\u0395\u0003"+
		"\u009eO\u0000\u0394\u0392\u0001\u0000\u0000\u0000\u0395\u0398\u0001\u0000"+
		"\u0000\u0000\u0396\u0394\u0001\u0000\u0000\u0000\u0396\u0397\u0001\u0000"+
		"\u0000\u0000\u0397\u0399\u0001\u0000\u0000\u0000\u0398\u0396\u0001\u0000"+
		"\u0000\u0000\u0399\u039a\u0005\u0004\u0000\u0000\u039a\u039c\u0001\u0000"+
		"\u0000\u0000\u039b\u038a\u0001\u0000\u0000\u0000\u039b\u0390\u0001\u0000"+
		"\u0000\u0000\u039ca\u0001\u0000\u0000\u0000\u039d\u039f\u00059\u0000\u0000"+
		"\u039e\u03a0\u0003\u009eO\u0000\u039f\u039e\u0001\u0000\u0000\u0000\u03a0"+
		"\u03a1\u0001\u0000\u0000\u0000\u03a1\u039f\u0001\u0000\u0000\u0000\u03a1"+
		"\u03a2\u0001\u0000\u0000\u0000\u03a2\u03b2\u0001\u0000\u0000\u0000\u03a3"+
		"\u03a4\u0005:\u0000\u0000\u03a4\u03b2\u0003\u009eO\u0000\u03a5\u03a6\u0005"+
		":\u0000\u0000\u03a6\u03a7\u0005\u0003\u0000\u0000\u03a7\u03ac\u0003\u009e"+
		"O\u0000\u03a8\u03a9\u0005\u0019\u0000\u0000\u03a9\u03ab\u0003\u009eO\u0000"+
		"\u03aa\u03a8\u0001\u0000\u0000\u0000\u03ab\u03ae\u0001\u0000\u0000\u0000"+
		"\u03ac\u03aa\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000\u0000"+
		"\u03ad\u03af\u0001\u0000\u0000\u0000\u03ae\u03ac\u0001\u0000\u0000\u0000"+
		"\u03af\u03b0\u0005\u0004\u0000\u0000\u03b0\u03b2\u0001\u0000\u0000\u0000"+
		"\u03b1\u039d\u0001\u0000\u0000\u0000\u03b1\u03a3\u0001\u0000\u0000\u0000"+
		"\u03b1\u03a5\u0001\u0000\u0000\u0000\u03b2c\u0001\u0000\u0000\u0000\u03b3"+
		"\u03b8\u0003\u009eO\u0000\u03b4\u03b8\u0005 \u0000\u0000\u03b5\u03b8\u0005"+
		"!\u0000\u0000\u03b6\u03b8\u0005\"\u0000\u0000\u03b7\u03b3\u0001\u0000"+
		"\u0000\u0000\u03b7\u03b4\u0001\u0000\u0000\u0000\u03b7\u03b5\u0001\u0000"+
		"\u0000\u0000\u03b7\u03b6\u0001\u0000\u0000\u0000\u03b8e\u0001\u0000\u0000"+
		"\u0000\u03b9\u03ba\u0007\t\u0000\u0000\u03bag\u0001\u0000\u0000\u0000"+
		"\u03bb\u03bc\u0005@\u0000\u0000\u03bc\u03be\u0003\u009eO\u0000\u03bd\u03bf"+
		"\u0003`0\u0000\u03be\u03bd\u0001\u0000\u0000\u0000\u03be\u03bf\u0001\u0000"+
		"\u0000\u0000\u03bf\u03c1\u0001\u0000\u0000\u0000\u03c0\u03c2\u0003b1\u0000"+
		"\u03c1\u03c0\u0001\u0000\u0000\u0000\u03c1\u03c2\u0001\u0000\u0000\u0000"+
		"\u03c2\u03c3\u0001\u0000\u0000\u0000\u03c3\u03c7\u0005\u0001\u0000\u0000"+
		"\u03c4\u03c6\u0003p8\u0000\u03c5\u03c4\u0001\u0000\u0000\u0000\u03c6\u03c9"+
		"\u0001\u0000\u0000\u0000\u03c7\u03c5\u0001\u0000\u0000\u0000\u03c7\u03c8"+
		"\u0001\u0000\u0000\u0000\u03c8\u03ca\u0001\u0000\u0000\u0000\u03c9\u03c7"+
		"\u0001\u0000\u0000\u0000\u03ca\u03cb\u0005\u0002\u0000\u0000\u03cbi\u0001"+
		"\u0000\u0000\u0000\u03cc\u03cd\u0005?\u0000\u0000\u03cd\u03cf\u0003\u009e"+
		"O\u0000\u03ce\u03d0\u0003`0\u0000\u03cf\u03ce\u0001\u0000\u0000\u0000"+
		"\u03cf\u03d0\u0001\u0000\u0000\u0000\u03d0\u03d2\u0001\u0000\u0000\u0000"+
		"\u03d1\u03d3\u0003b1\u0000\u03d2\u03d1\u0001\u0000\u0000\u0000\u03d2\u03d3"+
		"\u0001\u0000\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4\u03d5"+
		"\u0005\u0001\u0000\u0000\u03d5\u03d6\u0003r9\u0000\u03d6\u03d7\u0005\u0002"+
		"\u0000\u0000\u03d7k\u0001\u0000\u0000\u0000\u03d8\u03d9\u0005>\u0000\u0000"+
		"\u03d9\u03db\u0003\u009eO\u0000\u03da\u03dc\u0003`0\u0000\u03db\u03da"+
		"\u0001\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u03de"+
		"\u0001\u0000\u0000\u0000\u03dd\u03df\u0003b1\u0000\u03de\u03dd\u0001\u0000"+
		"\u0000\u0000\u03de\u03df\u0001\u0000\u0000\u0000\u03df\u03e0\u0001\u0000"+
		"\u0000\u0000\u03e0\u03e4\u0005\u0001\u0000\u0000\u03e1\u03e3\u0003x<\u0000"+
		"\u03e2\u03e1\u0001\u0000\u0000\u0000\u03e3\u03e6\u0001\u0000\u0000\u0000"+
		"\u03e4\u03e2\u0001\u0000\u0000\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000"+
		"\u03e5\u03e7\u0001\u0000\u0000\u0000\u03e6\u03e4\u0001\u0000\u0000\u0000"+
		"\u03e7\u03e8\u0005\u0002\u0000\u0000\u03e8m\u0001\u0000\u0000\u0000\u03e9"+
		"\u03eb\u0005=\u0000\u0000\u03ea\u03ec\u0007\n\u0000\u0000\u03eb\u03ea"+
		"\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000\u03ec\u03ed"+
		"\u0001\u0000\u0000\u0000\u03ed\u03ef\u0003\u009eO\u0000\u03ee\u03f0\u0003"+
		"`0\u0000\u03ef\u03ee\u0001\u0000\u0000\u0000\u03ef\u03f0\u0001\u0000\u0000"+
		"\u0000\u03f0\u03f2\u0001\u0000\u0000\u0000\u03f1\u03f3\u0003b1\u0000\u03f2"+
		"\u03f1\u0001\u0000\u0000\u0000\u03f2\u03f3\u0001\u0000\u0000\u0000\u03f3"+
		"\u03f4\u0001\u0000\u0000\u0000\u03f4\u03f8\u0005\u0001\u0000\u0000\u03f5"+
		"\u03f7\u0003z=\u0000\u03f6\u03f5\u0001\u0000\u0000\u0000\u03f7\u03fa\u0001"+
		"\u0000\u0000\u0000\u03f8\u03f6\u0001\u0000\u0000\u0000\u03f8\u03f9\u0001"+
		"\u0000\u0000\u0000\u03f9\u03fb\u0001\u0000\u0000\u0000\u03fa\u03f8\u0001"+
		"\u0000\u0000\u0000\u03fb\u03fc\u0005\u0002\u0000\u0000\u03fco\u0001\u0000"+
		"\u0000\u0000\u03fd\u0400\u0003r9\u0000\u03fe\u0400\u0003x<\u0000\u03ff"+
		"\u03fd\u0001\u0000\u0000\u0000\u03ff\u03fe\u0001\u0000\u0000\u0000\u0400"+
		"q\u0001\u0000\u0000\u0000\u0401\u0402\u0003t:\u0000\u0402\u0403\u0005"+
		"\u0011\u0000\u0000\u0403\u0405\u0003&\u0013\u0000\u0404\u0406\u0003f3"+
		"\u0000\u0405\u0404\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000"+
		"\u0000\u0406s\u0001\u0000\u0000\u0000\u0407\u0408\u0003\u009eO\u0000\u0408"+
		"\u040a\u0005\u0003\u0000\u0000\u0409\u040b\u0003v;\u0000\u040a\u0409\u0001"+
		"\u0000\u0000\u0000\u040a\u040b\u0001\u0000\u0000\u0000\u040b\u040c\u0001"+
		"\u0000\u0000\u0000\u040c\u040e\u0005\u0004\u0000\u0000\u040d\u040f\u0005"+
		"\u001d\u0000\u0000\u040e\u040d\u0001\u0000\u0000\u0000\u040e\u040f\u0001"+
		"\u0000\u0000\u0000\u040fu\u0001\u0000\u0000\u0000\u0410\u0411\u0003&\u0013"+
		"\u0000\u0411\u0418\u0003\u009eO\u0000\u0412\u0413\u0005\u0019\u0000\u0000"+
		"\u0413\u0414\u0003&\u0013\u0000\u0414\u0415\u0003\u009eO\u0000\u0415\u0417"+
		"\u0001\u0000\u0000\u0000\u0416\u0412\u0001\u0000\u0000\u0000\u0417\u041a"+
		"\u0001\u0000\u0000\u0000\u0418\u0416\u0001\u0000\u0000\u0000\u0418\u0419"+
		"\u0001\u0000\u0000\u0000\u0419w\u0001\u0000\u0000\u0000\u041a\u0418\u0001"+
		"\u0000\u0000\u0000\u041b\u041c\u0003\u009eO\u0000\u041c\u041d\u0005\u001d"+
		"\u0000\u0000\u041d\u041e\u0005\u0011\u0000\u0000\u041e\u0420\u0003&\u0013"+
		"\u0000\u041f\u0421\u0003f3\u0000\u0420\u041f\u0001\u0000\u0000\u0000\u0420"+
		"\u0421\u0001\u0000\u0000\u0000\u0421y\u0001\u0000\u0000\u0000\u0422\u0424"+
		"\u0003\u009eO\u0000\u0423\u0425\u0003f3\u0000\u0424\u0423\u0001\u0000"+
		"\u0000\u0000\u0424\u0425\u0001\u0000\u0000\u0000\u0425\u042d\u0001\u0000"+
		"\u0000\u0000\u0426\u0427\u0003\u009eO\u0000\u0427\u0428\u0005\u0011\u0000"+
		"\u0000\u0428\u042a\u0003|>\u0000\u0429\u042b\u0003f3\u0000\u042a\u0429"+
		"\u0001\u0000\u0000\u0000\u042a\u042b\u0001\u0000\u0000\u0000\u042b\u042d"+
		"\u0001\u0000\u0000\u0000\u042c\u0422\u0001\u0000\u0000\u0000\u042c\u0426"+
		"\u0001\u0000\u0000\u0000\u042d{\u0001\u0000\u0000\u0000\u042e\u0434\u0003"+
		"\u0080@\u0000\u042f\u0430\u0003\u009eO\u0000\u0430\u0431\u0005\u001b\u0000"+
		"\u0000\u0431\u0432\u0003\u009eO\u0000\u0432\u0434\u0001\u0000\u0000\u0000"+
		"\u0433\u042e\u0001\u0000\u0000\u0000\u0433\u042f\u0001\u0000\u0000\u0000"+
		"\u0434}\u0001\u0000\u0000\u0000\u0435\u043f\u0003\u0080@\u0000\u0436\u043f"+
		"\u0003\u009aM\u0000\u0437\u043f\u0003\u009cN\u0000\u0438\u043f\u0003\u009e"+
		"O\u0000\u0439\u043f\u00036\u001b\u0000\u043a\u043f\u0003\u0090H\u0000"+
		"\u043b\u043f\u0003\u008aE\u0000\u043c\u043f\u0003\u0084B\u0000\u043d\u043f"+
		"\u0003\u00a0P\u0000\u043e\u0435\u0001\u0000\u0000\u0000\u043e\u0436\u0001"+
		"\u0000\u0000\u0000\u043e\u0437\u0001\u0000\u0000\u0000\u043e\u0438\u0001"+
		"\u0000\u0000\u0000\u043e\u0439\u0001\u0000\u0000\u0000\u043e\u043a\u0001"+
		"\u0000\u0000\u0000\u043e\u043b\u0001\u0000\u0000\u0000\u043e\u043c\u0001"+
		"\u0000\u0000\u0000\u043e\u043d\u0001\u0000\u0000\u0000\u043f\u007f\u0001"+
		"\u0000\u0000\u0000\u0440\u0445\u0003\u0094J\u0000\u0441\u0445\u0003\u0096"+
		"K\u0000\u0442\u0445\u0003\u0098L\u0000\u0443\u0445\u0003\u0082A\u0000"+
		"\u0444\u0440\u0001\u0000\u0000\u0000\u0444\u0441\u0001\u0000\u0000\u0000"+
		"\u0444\u0442\u0001\u0000\u0000\u0000\u0444\u0443\u0001\u0000\u0000\u0000"+
		"\u0445\u0081\u0001\u0000\u0000\u0000\u0446\u0447\u0007\u000b\u0000\u0000"+
		"\u0447\u0083\u0001\u0000\u0000\u0000\u0448\u0449\u0005\u0005\u0000\u0000"+
		"\u0449\u0450\u0003\u0086C\u0000\u044a\u044c\u0005\u0019\u0000\u0000\u044b"+
		"\u044a\u0001\u0000\u0000\u0000\u044b\u044c\u0001\u0000\u0000\u0000\u044c"+
		"\u044d\u0001\u0000\u0000\u0000\u044d\u044f\u0003\u0086C\u0000\u044e\u044b"+
		"\u0001\u0000\u0000\u0000\u044f\u0452\u0001\u0000\u0000\u0000\u0450\u044e"+
		"\u0001\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000\u0000\u0451\u0453"+
		"\u0001\u0000\u0000\u0000\u0452\u0450\u0001\u0000\u0000\u0000\u0453\u0454"+
		"\u0005\u0006\u0000\u0000\u0454\u0463\u0001\u0000\u0000\u0000\u0455\u0456"+
		"\u0005\u0007\u0000\u0000\u0456\u045d\u0003\u0086C\u0000\u0457\u0459\u0005"+
		"\u0019\u0000\u0000\u0458\u0457\u0001\u0000\u0000\u0000\u0458\u0459\u0001"+
		"\u0000\u0000\u0000\u0459\u045a\u0001\u0000\u0000\u0000\u045a\u045c\u0003"+
		"\u0086C\u0000\u045b\u0458\u0001\u0000\u0000\u0000\u045c\u045f\u0001\u0000"+
		"\u0000\u0000\u045d\u045b\u0001\u0000\u0000\u0000\u045d\u045e\u0001\u0000"+
		"\u0000\u0000\u045e\u0460\u0001\u0000\u0000\u0000\u045f\u045d\u0001\u0000"+
		"\u0000\u0000\u0460\u0461\u0005\u0007\u0000\u0000\u0461\u0463\u0001\u0000"+
		"\u0000\u0000\u0462\u0448\u0001\u0000\u0000\u0000\u0462\u0455\u0001\u0000"+
		"\u0000\u0000\u0463\u0085\u0001\u0000\u0000\u0000\u0464\u0467\u0003\u0088"+
		"D\u0000\u0465\u0467\u0003\u0090H\u0000\u0466\u0464\u0001\u0000\u0000\u0000"+
		"\u0466\u0465\u0001\u0000\u0000\u0000\u0467\u0496\u0001\u0000\u0000\u0000"+
		"\u0468\u0496\u0005\u0011\u0000\u0000\u0469\u046a\u0005\u0012\u0000\u0000"+
		"\u046a\u0496\u0003\u0088D\u0000\u046b\u046c\u0005\u0011\u0000\u0000\u046c"+
		"\u046d\u0005\u0011\u0000\u0000\u046d\u0496\u0003\u0088D\u0000\u046e\u046f"+
		"\u0005\u0011\u0000\u0000\u046f\u0471\u0003\u0088D\u0000\u0470\u0472\u0005"+
		"\u0011\u0000\u0000\u0471\u0470\u0001\u0000\u0000\u0000\u0471\u0472\u0001"+
		"\u0000\u0000\u0000\u0472\u0496\u0001\u0000\u0000\u0000\u0473\u0474\u0005"+
		"\u0011\u0000\u0000\u0474\u0475\u0003\u0088D\u0000\u0475\u0476\u0005\u0011"+
		"\u0000\u0000\u0476\u0477\u0003\u0088D\u0000\u0477\u0496\u0001\u0000\u0000"+
		"\u0000\u0478\u0479\u0003\u0088D\u0000\u0479\u047a\u0005\u0012\u0000\u0000"+
		"\u047a\u0496\u0001\u0000\u0000\u0000\u047b\u047c\u0003\u0088D\u0000\u047c"+
		"\u047e\u0005\u0011\u0000\u0000\u047d\u047f\u0005\u0011\u0000\u0000\u047e"+
		"\u047d\u0001\u0000\u0000\u0000\u047e\u047f\u0001\u0000\u0000\u0000\u047f"+
		"\u0496\u0001\u0000\u0000\u0000\u0480\u0481\u0003\u0088D\u0000\u0481\u0482"+
		"\u0005\u0012\u0000\u0000\u0482\u0483\u0003\u0088D\u0000\u0483\u0496\u0001"+
		"\u0000\u0000\u0000\u0484\u0485\u0003\u0088D\u0000\u0485\u0486\u0005\u0011"+
		"\u0000\u0000\u0486\u0487\u0005\u0011\u0000\u0000\u0487\u0488\u0003\u0088"+
		"D\u0000\u0488\u0496\u0001\u0000\u0000\u0000\u0489\u048a\u0003\u0088D\u0000"+
		"\u048a\u048b\u0005\u0011\u0000\u0000\u048b\u048d\u0003\u0088D\u0000\u048c"+
		"\u048e\u0005\u0011\u0000\u0000\u048d\u048c\u0001\u0000\u0000\u0000\u048d"+
		"\u048e\u0001\u0000\u0000\u0000\u048e\u0496\u0001\u0000\u0000\u0000\u048f"+
		"\u0490\u0003\u0088D\u0000\u0490\u0491\u0005\u0011\u0000\u0000\u0491\u0492"+
		"\u0003\u0088D\u0000\u0492\u0493\u0005\u0011\u0000\u0000\u0493\u0494\u0003"+
		"\u0088D\u0000\u0494\u0496\u0001\u0000\u0000\u0000\u0495\u0466\u0001\u0000"+
		"\u0000\u0000\u0495\u0468\u0001\u0000\u0000\u0000\u0495\u0469\u0001\u0000"+
		"\u0000\u0000\u0495\u046b\u0001\u0000\u0000\u0000\u0495\u046e\u0001\u0000"+
		"\u0000\u0000\u0495\u0473\u0001\u0000\u0000\u0000\u0495\u0478\u0001\u0000"+
		"\u0000\u0000\u0495\u047b\u0001\u0000\u0000\u0000\u0495\u0480\u0001\u0000"+
		"\u0000\u0000\u0495\u0484\u0001\u0000\u0000\u0000\u0495\u0489\u0001\u0000"+
		"\u0000\u0000\u0495\u048f\u0001\u0000\u0000\u0000\u0496\u0087\u0001\u0000"+
		"\u0000\u0000\u0497\u049d\u0003\u009eO\u0000\u0498\u049a\u0007\f\u0000"+
		"\u0000\u0499\u0498\u0001\u0000\u0000\u0000\u0499\u049a\u0001\u0000\u0000"+
		"\u0000\u049a\u049b\u0001\u0000\u0000\u0000\u049b\u049d\u0003\u0098L\u0000"+
		"\u049c\u0497\u0001\u0000\u0000\u0000\u049c\u0499\u0001\u0000\u0000\u0000"+
		"\u049d\u0089\u0001\u0000\u0000\u0000\u049e\u04a0\u0005\u0001\u0000\u0000"+
		"\u049f\u04a1\u0003\u008cF\u0000\u04a0\u049f\u0001\u0000\u0000\u0000\u04a0"+
		"\u04a1\u0001\u0000\u0000\u0000\u04a1\u04a6\u0001\u0000\u0000\u0000\u04a2"+
		"\u04a3\u0005\u0019\u0000\u0000\u04a3\u04a5\u0003\u008cF\u0000\u04a4\u04a2"+
		"\u0001\u0000\u0000\u0000\u04a5\u04a8\u0001\u0000\u0000\u0000\u04a6\u04a4"+
		"\u0001\u0000\u0000\u0000\u04a6\u04a7\u0001\u0000\u0000\u0000\u04a7\u04aa"+
		"\u0001\u0000\u0000\u0000\u04a8\u04a6\u0001\u0000\u0000\u0000\u04a9\u04ab"+
		"\u0005\u0019\u0000\u0000\u04aa\u04a9\u0001\u0000\u0000\u0000\u04aa\u04ab"+
		"\u0001\u0000\u0000\u0000\u04ab\u04ac\u0001\u0000\u0000\u0000\u04ac\u04ad"+
		"\u0005\u0002\u0000\u0000\u04ad\u008b\u0001\u0000\u0000\u0000\u04ae\u04af"+
		"\u0003\u008eG\u0000\u04af\u04b0\u0005\u0011\u0000\u0000\u04b0\u04b1\u0003"+
		"\u0092I\u0000\u04b1\u008d\u0001\u0000\u0000\u0000\u04b2\u04b6\u0003\u0098"+
		"L\u0000\u04b3\u04b6\u0003\u009eO\u0000\u04b4\u04b6\u0003\u009aM\u0000"+
		"\u04b5\u04b2\u0001\u0000\u0000\u0000\u04b5\u04b3\u0001\u0000\u0000\u0000"+
		"\u04b5\u04b4\u0001\u0000\u0000\u0000\u04b6\u008f\u0001\u0000\u0000\u0000"+
		"\u04b7\u04b9\u0005\u0005\u0000\u0000\u04b8\u04ba\u0003\u0092I\u0000\u04b9"+
		"\u04b8\u0001\u0000\u0000\u0000\u04b9\u04ba\u0001\u0000\u0000\u0000\u04ba"+
		"\u04bf\u0001\u0000\u0000\u0000\u04bb\u04bc\u0005\u0019\u0000\u0000\u04bc"+
		"\u04be\u0003\u0092I\u0000\u04bd\u04bb\u0001\u0000\u0000\u0000\u04be\u04c1"+
		"\u0001\u0000\u0000\u0000\u04bf\u04bd\u0001\u0000\u0000\u0000\u04bf\u04c0"+
		"\u0001\u0000\u0000\u0000\u04c0\u04c3\u0001\u0000\u0000\u0000\u04c1\u04bf"+
		"\u0001\u0000\u0000\u0000\u04c2\u04c4\u0005\u0019\u0000\u0000\u04c3\u04c2"+
		"\u0001\u0000\u0000\u0000\u04c3\u04c4\u0001\u0000\u0000\u0000\u04c4\u04c5"+
		"\u0001\u0000\u0000\u0000\u04c5\u04c6\u0005\u0006\u0000\u0000\u04c6\u0091"+
		"\u0001\u0000\u0000\u0000\u04c7\u04cb\u0003~?\u0000\u04c8\u04cb\u0003\u001a"+
		"\r\u0000\u04c9\u04cb\u0003\u0002\u0001\u0000\u04ca\u04c7\u0001\u0000\u0000"+
		"\u0000\u04ca\u04c8\u0001\u0000\u0000\u0000\u04ca\u04c9\u0001\u0000\u0000"+
		"\u0000\u04cb\u0093\u0001\u0000\u0000\u0000\u04cc\u04cd\u0007\r\u0000\u0000"+
		"\u04cd\u04ce\u0003\u009eO\u0000\u04ce\u0095\u0001\u0000\u0000\u0000\u04cf"+
		"\u04d0\u0007\u000e\u0000\u0000\u04d0\u0097\u0001\u0000\u0000\u0000\u04d1"+
		"\u04d2\u0005J\u0000\u0000\u04d2\u0099\u0001\u0000\u0000\u0000\u04d3\u04d9"+
		"\u0005Q\u0000\u0000\u04d4\u04d9\u0005M\u0000\u0000\u04d5\u04d9\u0005N"+
		"\u0000\u0000\u04d6\u04d9\u0005O\u0000\u0000\u04d7\u04d9\u0005P\u0000\u0000"+
		"\u04d8\u04d3\u0001\u0000\u0000\u0000\u04d8\u04d4\u0001\u0000\u0000\u0000"+
		"\u04d8\u04d5\u0001\u0000\u0000\u0000\u04d8\u04d6\u0001\u0000\u0000\u0000"+
		"\u04d8\u04d7\u0001\u0000\u0000\u0000\u04d9\u009b\u0001\u0000\u0000\u0000"+
		"\u04da\u04db\u0007\u000f\u0000\u0000\u04db\u009d\u0001\u0000\u0000\u0000"+
		"\u04dc\u04e0\u0003\"\u0011\u0000\u04dd\u04e0\u0005Y\u0000\u0000\u04de"+
		"\u04e0\u0005X\u0000\u0000\u04df\u04dc\u0001\u0000\u0000\u0000\u04df\u04dd"+
		"\u0001\u0000\u0000\u0000\u04df\u04de\u0001\u0000\u0000\u0000\u04e0\u009f"+
		"\u0001\u0000\u0000\u0000\u04e1\u04e3\u0005Z\u0000\u0000\u04e2\u04e4\u0005"+
		"J\u0000\u0000\u04e3\u04e2\u0001\u0000\u0000\u0000\u04e3\u04e4\u0001\u0000"+
		"\u0000\u0000\u04e4\u04e8\u0001\u0000\u0000\u0000\u04e5\u04e6\u0005Z\u0000"+
		"\u0000\u04e6\u04e8\u0003\u009eO\u0000\u04e7\u04e1\u0001\u0000\u0000\u0000"+
		"\u04e7\u04e5\u0001\u0000\u0000\u0000\u04e8\u00a1\u0001\u0000\u0000\u0000"+
		"\u04e9\u04ea\u0007\f\u0000\u0000\u04ea\u00a3\u0001\u0000\u0000\u0000\u04eb"+
		"\u04ec\u0007\u0010\u0000\u0000\u04ec\u00a5\u0001\u0000\u0000\u0000\u04ed"+
		"\u04ee\u0007\u0011\u0000\u0000\u04ee\u00a7\u0001\u0000\u0000\u0000\u04ef"+
		"\u04f0\u0007\u0012\u0000\u0000\u04f0\u00a9\u0001\u0000\u0000\u0000\u04f1"+
		"\u04f2\u0007\u0013\u0000\u0000\u04f2\u00ab\u0001\u0000\u0000\u0000\u04f3"+
		"\u04f7\u0007\u0014\u0000\u0000\u04f4\u04f7\u0007\u0015\u0000\u0000\u04f5"+
		"\u04f7\u0007\u0016\u0000\u0000\u04f6\u04f3\u0001\u0000\u0000\u0000\u04f6"+
		"\u04f4\u0001\u0000\u0000\u0000\u04f6\u04f5\u0001\u0000\u0000\u0000\u04f7"+
		"\u00ad\u0001\u0000\u0000\u0000\u04f8\u04f9\u0007\u0017\u0000\u0000\u04f9"+
		"\u00af\u0001\u0000\u0000\u0000\u04fa\u04fb\u0007\u0018\u0000\u0000\u04fb"+
		"\u00b1\u0001\u0000\u0000\u0000\u04fc\u04fd\u0007\u0019\u0000\u0000\u04fd"+
		"\u00b3\u0001\u0000\u0000\u0000\u04fe\u04ff\u0007\u001a\u0000\u0000\u04ff"+
		"\u00b5\u0001\u0000\u0000\u0000\u009d\u00b9\u00c1\u00c4\u00c8\u00cb\u00d2"+
		"\u00d5\u00da\u00dd\u00e2\u00e5\u00e9\u00ed\u00f1\u00f3\u00f7\u00fe\u0108"+
		"\u010f\u0115\u011a\u011d\u0120\u0133\u013c\u0142\u0148\u014d\u0152\u0154"+
		"\u015b\u016d\u019a\u019c\u01a2\u01ac\u01b0\u01b9\u01bd\u01bf\u01c6\u01cf"+
		"\u01d9\u01dc\u01e7\u01ea\u01f0\u01f3\u01fb\u01fd\u0228\u022c\u0233\u023a"+
		"\u0243\u0247\u024a\u024e\u0254\u025a\u0260\u0269\u026d\u0271\u0275\u0278"+
		"\u027e\u0286\u028e\u029a\u02a1\u02ab\u02b5\u02bb\u02c0\u02dd\u02e3\u02ee"+
		"\u02f5\u02fd\u030f\u0319\u032a\u0334\u033c\u0340\u0344\u0349\u034e\u0351"+
		"\u0356\u035b\u035f\u0364\u036c\u0371\u0375\u0377\u037c\u037f\u0385\u038e"+
		"\u0396\u039b\u03a1\u03ac\u03b1\u03b7\u03be\u03c1\u03c7\u03cf\u03d2\u03db"+
		"\u03de\u03e4\u03eb\u03ef\u03f2\u03f8\u03ff\u0405\u040a\u040e\u0418\u0420"+
		"\u0424\u042a\u042c\u0433\u043e\u0444\u044b\u0450\u0458\u045d\u0462\u0466"+
		"\u0471\u047e\u048d\u0495\u0499\u049c\u04a0\u04a6\u04aa\u04b5\u04b9\u04bf"+
		"\u04c3\u04ca\u04d8\u04df\u04e3\u04e7\u04f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}