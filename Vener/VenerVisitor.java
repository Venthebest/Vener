// Generated from java-escape by ANTLR 4.11.1
package Ven;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VenerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VenerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VenerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(VenerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(VenerParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(VenerParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(VenerParser.EosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModuleModify}
	 * labeled alternative in {@link VenerParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleModify(VenerParser.ModuleModifyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModuleAlias}
	 * labeled alternative in {@link VenerParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleAlias(VenerParser.ModuleAliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModuleSymbol}
	 * labeled alternative in {@link VenerParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleSymbol(VenerParser.ModuleSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModuleSymbols}
	 * labeled alternative in {@link VenerParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleSymbols(VenerParser.ModuleSymbolsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModuleResolve}
	 * labeled alternative in {@link VenerParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleResolve(VenerParser.ModuleResolveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#moduleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleName(VenerParser.ModuleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#moduleLanguage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleLanguage(VenerParser.ModuleLanguageContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#moduleScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleScope(VenerParser.ModuleScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#exportStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatment(VenerParser.ExportStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#idTuples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdTuples(VenerParser.IdTuplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(VenerParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#blockNonEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockNonEnd(VenerParser.BlockNonEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(VenerParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PriorityExpression}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriorityExpression(VenerParser.PriorityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataLiteral}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataLiteral(VenerParser.DataLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionApply}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionApply(VenerParser.FunctionApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLike(VenerParser.BinaryLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicLike(VenerParser.LogicLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodApply}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodApply(VenerParser.MethodApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexApply}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexApply(VenerParser.IndexApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareLike(VenerParser.CompareLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusLike(VenerParser.PlusLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SlotCatch}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlotCatch(VenerParser.SlotCatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerLike(VenerParser.PowerLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeConversion}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConversion(VenerParser.TypeConversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ControlExpression}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlExpression(VenerParser.ControlExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrefixExpression}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpression(VenerParser.PrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignApply}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignApply(VenerParser.AssignApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SpecialString}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialString(VenerParser.SpecialStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixExpression}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(VenerParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplyLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyLike(VenerParser.MultiplyLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetterApply}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetterApply(VenerParser.GetterApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLike(VenerParser.ListLikeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#controlFlow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlFlow(VenerParser.ControlFlowContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(VenerParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(VenerParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#flowController}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlowController(VenerParser.FlowControllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#typeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStatement(VenerParser.TypeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#typeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExpression(VenerParser.TypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#typeSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSuffix(VenerParser.TypeSuffixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignValue}
	 * labeled alternative in {@link VenerParser#assignStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignValue(VenerParser.AssignValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignVariable}
	 * labeled alternative in {@link VenerParser#assignStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVariable(VenerParser.AssignVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignDefer}
	 * labeled alternative in {@link VenerParser#assignStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignDefer(VenerParser.AssignDeferContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignFunction}
	 * labeled alternative in {@link VenerParser#assignStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignFunction(VenerParser.AssignFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignModify}
	 * labeled alternative in {@link VenerParser#assignStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignModify(VenerParser.AssignModifyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LHSSingle}
	 * labeled alternative in {@link VenerParser#assignLHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLHSSingle(VenerParser.LHSSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LHSTuple}
	 * labeled alternative in {@link VenerParser#assignLHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLHSTuple(VenerParser.LHSTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LHSMaybeSetter}
	 * labeled alternative in {@link VenerParser#assignLHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLHSMaybeSetter(VenerParser.LHSMaybeSetterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LHSMaybeIndex}
	 * labeled alternative in {@link VenerParser#assignLHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLHSMaybeIndex(VenerParser.LHSMaybeIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#assignRHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignRHS(VenerParser.AssignRHSContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(VenerParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#functionPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPattern(VenerParser.FunctionPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#maybeSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaybeSymbol(VenerParser.MaybeSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MaybeMethod}
	 * labeled alternative in {@link VenerParser#symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaybeMethod(VenerParser.MaybeMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MustMethod}
	 * labeled alternative in {@link VenerParser#symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustMethod(VenerParser.MustMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#ifStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatment(VenerParser.IfStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#ifShort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfShort(VenerParser.IfShortContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#ifSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSingle(VenerParser.IfSingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#ifNested}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNested(VenerParser.IfNestedContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#elif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif(VenerParser.ElifContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#elseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIf(VenerParser.ElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#switchStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatment(VenerParser.SwitchStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#caseBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBody(VenerParser.CaseBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#switchBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBody(VenerParser.SwitchBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#matchStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchStatment(VenerParser.MatchStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#matchBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchBody(VenerParser.MatchBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(VenerParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(VenerParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#tryCatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatch(VenerParser.TryCatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#tryFinal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryFinal(VenerParser.TryFinalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link VenerParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(VenerParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInLoop}
	 * labeled alternative in {@link VenerParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInLoop(VenerParser.ForInLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#whileStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatment(VenerParser.WhileStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#letStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStatment(VenerParser.LetStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#classExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExpression(VenerParser.ClassExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#classStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStatement(VenerParser.ClassStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#classExtend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExtend(VenerParser.ClassExtendContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#classTrait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTrait(VenerParser.ClassTraitContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#classController}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassController(VenerParser.ClassControllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#classEos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassEos(VenerParser.ClassEosContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#traitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraitStatement(VenerParser.TraitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#interfaceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceStatement(VenerParser.InterfaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#structureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureStatement(VenerParser.StructureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#enumerateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerateStatement(VenerParser.EnumerateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#traitExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraitExpression(VenerParser.TraitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#interfaceExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceExpression(VenerParser.InterfaceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#interfaceFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceFunction(VenerParser.InterfaceFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#interfaceParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceParameters(VenerParser.InterfaceParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#structureExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureExpression(VenerParser.StructureExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#enumerateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerateExpression(VenerParser.EnumerateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#enumerateNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerateNumber(VenerParser.EnumerateNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(VenerParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(VenerParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#byteInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByteInput(VenerParser.ByteInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(VenerParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexTake}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexTake(VenerParser.IndexTakeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Index000}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex000(VenerParser.Index000Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Index001}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex001(VenerParser.Index001Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Index010}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex010(VenerParser.Index010Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Index011}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex011(VenerParser.Index011Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Index100}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex100(VenerParser.Index100Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Index101}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex101(VenerParser.Index101Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Index110}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex110(VenerParser.Index110Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Index111}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex111(VenerParser.Index111Context ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#indexTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexTerm(VenerParser.IndexTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#dict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict(VenerParser.DictContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#keyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValue(VenerParser.KeyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#keyValid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValid(VenerParser.KeyValidContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(VenerParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(VenerParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#complex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex(VenerParser.ComplexContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(VenerParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(VenerParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringEmpty}
	 * labeled alternative in {@link VenerParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringEmpty(VenerParser.StringEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringEscapeBlock}
	 * labeled alternative in {@link VenerParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringEscapeBlock(VenerParser.StringEscapeBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringEscapeSingle}
	 * labeled alternative in {@link VenerParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringEscapeSingle(VenerParser.StringEscapeSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteralBlock}
	 * labeled alternative in {@link VenerParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralBlock(VenerParser.StringLiteralBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteralSingle}
	 * labeled alternative in {@link VenerParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralSingle(VenerParser.StringLiteralSingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial(VenerParser.SpecialContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(VenerParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#solt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolt(VenerParser.SoltContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#add_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_ops(VenerParser.Add_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#pre_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_ops(VenerParser.Pre_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#pst_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPst_ops(VenerParser.Pst_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#bit_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_ops(VenerParser.Bit_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#lgk_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLgk_ops(VenerParser.Lgk_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#cpr_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpr_ops(VenerParser.Cpr_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#pow_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow_ops(VenerParser.Pow_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#mul_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_ops(VenerParser.Mul_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#list_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_ops(VenerParser.List_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenerParser#mod_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod_assign(VenerParser.Mod_assignContext ctx);
}