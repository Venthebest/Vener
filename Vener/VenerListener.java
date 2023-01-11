// Generated from java-escape by ANTLR 4.11.1
package Ven;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VenerParser}.
 */
public interface VenerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VenerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(VenerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(VenerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(VenerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(VenerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(VenerParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(VenerParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(VenerParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(VenerParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModuleModify}
	 * labeled alternative in {@link VenerParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterModuleModify(VenerParser.ModuleModifyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModuleModify}
	 * labeled alternative in {@link VenerParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitModuleModify(VenerParser.ModuleModifyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModuleAlias}
	 * labeled alternative in {@link VenerParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterModuleAlias(VenerParser.ModuleAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModuleAlias}
	 * labeled alternative in {@link VenerParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitModuleAlias(VenerParser.ModuleAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModuleSymbol}
	 * labeled alternative in {@link VenerParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterModuleSymbol(VenerParser.ModuleSymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModuleSymbol}
	 * labeled alternative in {@link VenerParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitModuleSymbol(VenerParser.ModuleSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModuleSymbols}
	 * labeled alternative in {@link VenerParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterModuleSymbols(VenerParser.ModuleSymbolsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModuleSymbols}
	 * labeled alternative in {@link VenerParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitModuleSymbols(VenerParser.ModuleSymbolsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModuleResolve}
	 * labeled alternative in {@link VenerParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterModuleResolve(VenerParser.ModuleResolveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModuleResolve}
	 * labeled alternative in {@link VenerParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitModuleResolve(VenerParser.ModuleResolveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void enterModuleName(VenerParser.ModuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void exitModuleName(VenerParser.ModuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#moduleLanguage}.
	 * @param ctx the parse tree
	 */
	void enterModuleLanguage(VenerParser.ModuleLanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#moduleLanguage}.
	 * @param ctx the parse tree
	 */
	void exitModuleLanguage(VenerParser.ModuleLanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#moduleScope}.
	 * @param ctx the parse tree
	 */
	void enterModuleScope(VenerParser.ModuleScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#moduleScope}.
	 * @param ctx the parse tree
	 */
	void exitModuleScope(VenerParser.ModuleScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#exportStatment}.
	 * @param ctx the parse tree
	 */
	void enterExportStatment(VenerParser.ExportStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#exportStatment}.
	 * @param ctx the parse tree
	 */
	void exitExportStatment(VenerParser.ExportStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#idTuples}.
	 * @param ctx the parse tree
	 */
	void enterIdTuples(VenerParser.IdTuplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#idTuples}.
	 * @param ctx the parse tree
	 */
	void exitIdTuples(VenerParser.IdTuplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(VenerParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(VenerParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#blockNonEnd}.
	 * @param ctx the parse tree
	 */
	void enterBlockNonEnd(VenerParser.BlockNonEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#blockNonEnd}.
	 * @param ctx the parse tree
	 */
	void exitBlockNonEnd(VenerParser.BlockNonEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(VenerParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(VenerParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PriorityExpression}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPriorityExpression(VenerParser.PriorityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PriorityExpression}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPriorityExpression(VenerParser.PriorityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DataLiteral}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDataLiteral(VenerParser.DataLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DataLiteral}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDataLiteral(VenerParser.DataLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionApply}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionApply(VenerParser.FunctionApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionApply}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionApply(VenerParser.FunctionApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLike(VenerParser.BinaryLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLike(VenerParser.BinaryLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicLike(VenerParser.LogicLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicLike(VenerParser.LogicLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodApply}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodApply(VenerParser.MethodApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodApply}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodApply(VenerParser.MethodApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexApply}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexApply(VenerParser.IndexApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexApply}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexApply(VenerParser.IndexApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareLike(VenerParser.CompareLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareLike(VenerParser.CompareLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusLike(VenerParser.PlusLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusLike(VenerParser.PlusLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SlotCatch}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSlotCatch(VenerParser.SlotCatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SlotCatch}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSlotCatch(VenerParser.SlotCatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerLike(VenerParser.PowerLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerLike(VenerParser.PowerLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeConversion}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeConversion(VenerParser.TypeConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeConversion}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeConversion(VenerParser.TypeConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ControlExpression}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterControlExpression(VenerParser.ControlExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ControlExpression}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitControlExpression(VenerParser.ControlExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrefixExpression}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpression(VenerParser.PrefixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrefixExpression}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpression(VenerParser.PrefixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignApply}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignApply(VenerParser.AssignApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignApply}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignApply(VenerParser.AssignApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpecialString}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSpecialString(VenerParser.SpecialStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpecialString}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSpecialString(VenerParser.SpecialStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixExpression}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(VenerParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixExpression}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(VenerParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyLike(VenerParser.MultiplyLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyLike(VenerParser.MultiplyLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetterApply}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGetterApply(VenerParser.GetterApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetterApply}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGetterApply(VenerParser.GetterApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListLike(VenerParser.ListLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListLike}
	 * labeled alternative in {@link VenerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListLike(VenerParser.ListLikeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#controlFlow}.
	 * @param ctx the parse tree
	 */
	void enterControlFlow(VenerParser.ControlFlowContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#controlFlow}.
	 * @param ctx the parse tree
	 */
	void exitControlFlow(VenerParser.ControlFlowContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(VenerParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(VenerParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(VenerParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(VenerParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#flowController}.
	 * @param ctx the parse tree
	 */
	void enterFlowController(VenerParser.FlowControllerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#flowController}.
	 * @param ctx the parse tree
	 */
	void exitFlowController(VenerParser.FlowControllerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#typeStatement}.
	 * @param ctx the parse tree
	 */
	void enterTypeStatement(VenerParser.TypeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#typeStatement}.
	 * @param ctx the parse tree
	 */
	void exitTypeStatement(VenerParser.TypeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpression(VenerParser.TypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpression(VenerParser.TypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#typeSuffix}.
	 * @param ctx the parse tree
	 */
	void enterTypeSuffix(VenerParser.TypeSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#typeSuffix}.
	 * @param ctx the parse tree
	 */
	void exitTypeSuffix(VenerParser.TypeSuffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignValue}
	 * labeled alternative in {@link VenerParser#assignStatment}.
	 * @param ctx the parse tree
	 */
	void enterAssignValue(VenerParser.AssignValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignValue}
	 * labeled alternative in {@link VenerParser#assignStatment}.
	 * @param ctx the parse tree
	 */
	void exitAssignValue(VenerParser.AssignValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignVariable}
	 * labeled alternative in {@link VenerParser#assignStatment}.
	 * @param ctx the parse tree
	 */
	void enterAssignVariable(VenerParser.AssignVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignVariable}
	 * labeled alternative in {@link VenerParser#assignStatment}.
	 * @param ctx the parse tree
	 */
	void exitAssignVariable(VenerParser.AssignVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignDefer}
	 * labeled alternative in {@link VenerParser#assignStatment}.
	 * @param ctx the parse tree
	 */
	void enterAssignDefer(VenerParser.AssignDeferContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignDefer}
	 * labeled alternative in {@link VenerParser#assignStatment}.
	 * @param ctx the parse tree
	 */
	void exitAssignDefer(VenerParser.AssignDeferContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignFunction}
	 * labeled alternative in {@link VenerParser#assignStatment}.
	 * @param ctx the parse tree
	 */
	void enterAssignFunction(VenerParser.AssignFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignFunction}
	 * labeled alternative in {@link VenerParser#assignStatment}.
	 * @param ctx the parse tree
	 */
	void exitAssignFunction(VenerParser.AssignFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignModify}
	 * labeled alternative in {@link VenerParser#assignStatment}.
	 * @param ctx the parse tree
	 */
	void enterAssignModify(VenerParser.AssignModifyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignModify}
	 * labeled alternative in {@link VenerParser#assignStatment}.
	 * @param ctx the parse tree
	 */
	void exitAssignModify(VenerParser.AssignModifyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LHSSingle}
	 * labeled alternative in {@link VenerParser#assignLHS}.
	 * @param ctx the parse tree
	 */
	void enterLHSSingle(VenerParser.LHSSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LHSSingle}
	 * labeled alternative in {@link VenerParser#assignLHS}.
	 * @param ctx the parse tree
	 */
	void exitLHSSingle(VenerParser.LHSSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LHSTuple}
	 * labeled alternative in {@link VenerParser#assignLHS}.
	 * @param ctx the parse tree
	 */
	void enterLHSTuple(VenerParser.LHSTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LHSTuple}
	 * labeled alternative in {@link VenerParser#assignLHS}.
	 * @param ctx the parse tree
	 */
	void exitLHSTuple(VenerParser.LHSTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LHSMaybeSetter}
	 * labeled alternative in {@link VenerParser#assignLHS}.
	 * @param ctx the parse tree
	 */
	void enterLHSMaybeSetter(VenerParser.LHSMaybeSetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LHSMaybeSetter}
	 * labeled alternative in {@link VenerParser#assignLHS}.
	 * @param ctx the parse tree
	 */
	void exitLHSMaybeSetter(VenerParser.LHSMaybeSetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LHSMaybeIndex}
	 * labeled alternative in {@link VenerParser#assignLHS}.
	 * @param ctx the parse tree
	 */
	void enterLHSMaybeIndex(VenerParser.LHSMaybeIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LHSMaybeIndex}
	 * labeled alternative in {@link VenerParser#assignLHS}.
	 * @param ctx the parse tree
	 */
	void exitLHSMaybeIndex(VenerParser.LHSMaybeIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#assignRHS}.
	 * @param ctx the parse tree
	 */
	void enterAssignRHS(VenerParser.AssignRHSContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#assignRHS}.
	 * @param ctx the parse tree
	 */
	void exitAssignRHS(VenerParser.AssignRHSContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(VenerParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(VenerParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#functionPattern}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPattern(VenerParser.FunctionPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#functionPattern}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPattern(VenerParser.FunctionPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#maybeSymbol}.
	 * @param ctx the parse tree
	 */
	void enterMaybeSymbol(VenerParser.MaybeSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#maybeSymbol}.
	 * @param ctx the parse tree
	 */
	void exitMaybeSymbol(VenerParser.MaybeSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MaybeMethod}
	 * labeled alternative in {@link VenerParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterMaybeMethod(VenerParser.MaybeMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MaybeMethod}
	 * labeled alternative in {@link VenerParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitMaybeMethod(VenerParser.MaybeMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MustMethod}
	 * labeled alternative in {@link VenerParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterMustMethod(VenerParser.MustMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MustMethod}
	 * labeled alternative in {@link VenerParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitMustMethod(VenerParser.MustMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#ifStatment}.
	 * @param ctx the parse tree
	 */
	void enterIfStatment(VenerParser.IfStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#ifStatment}.
	 * @param ctx the parse tree
	 */
	void exitIfStatment(VenerParser.IfStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#ifShort}.
	 * @param ctx the parse tree
	 */
	void enterIfShort(VenerParser.IfShortContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#ifShort}.
	 * @param ctx the parse tree
	 */
	void exitIfShort(VenerParser.IfShortContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#ifSingle}.
	 * @param ctx the parse tree
	 */
	void enterIfSingle(VenerParser.IfSingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#ifSingle}.
	 * @param ctx the parse tree
	 */
	void exitIfSingle(VenerParser.IfSingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#ifNested}.
	 * @param ctx the parse tree
	 */
	void enterIfNested(VenerParser.IfNestedContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#ifNested}.
	 * @param ctx the parse tree
	 */
	void exitIfNested(VenerParser.IfNestedContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#elif}.
	 * @param ctx the parse tree
	 */
	void enterElif(VenerParser.ElifContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#elif}.
	 * @param ctx the parse tree
	 */
	void exitElif(VenerParser.ElifContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void enterElseIf(VenerParser.ElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void exitElseIf(VenerParser.ElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#switchStatment}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatment(VenerParser.SwitchStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#switchStatment}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatment(VenerParser.SwitchStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#caseBody}.
	 * @param ctx the parse tree
	 */
	void enterCaseBody(VenerParser.CaseBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#caseBody}.
	 * @param ctx the parse tree
	 */
	void exitCaseBody(VenerParser.CaseBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#switchBody}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBody(VenerParser.SwitchBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#switchBody}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBody(VenerParser.SwitchBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#matchStatment}.
	 * @param ctx the parse tree
	 */
	void enterMatchStatment(VenerParser.MatchStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#matchStatment}.
	 * @param ctx the parse tree
	 */
	void exitMatchStatment(VenerParser.MatchStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#matchBody}.
	 * @param ctx the parse tree
	 */
	void enterMatchBody(VenerParser.MatchBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#matchBody}.
	 * @param ctx the parse tree
	 */
	void exitMatchBody(VenerParser.MatchBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(VenerParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(VenerParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(VenerParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(VenerParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#tryCatch}.
	 * @param ctx the parse tree
	 */
	void enterTryCatch(VenerParser.TryCatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#tryCatch}.
	 * @param ctx the parse tree
	 */
	void exitTryCatch(VenerParser.TryCatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#tryFinal}.
	 * @param ctx the parse tree
	 */
	void enterTryFinal(VenerParser.TryFinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#tryFinal}.
	 * @param ctx the parse tree
	 */
	void exitTryFinal(VenerParser.TryFinalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link VenerParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(VenerParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link VenerParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(VenerParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInLoop}
	 * labeled alternative in {@link VenerParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInLoop(VenerParser.ForInLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInLoop}
	 * labeled alternative in {@link VenerParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInLoop(VenerParser.ForInLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#whileStatment}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatment(VenerParser.WhileStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#whileStatment}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatment(VenerParser.WhileStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#letStatment}.
	 * @param ctx the parse tree
	 */
	void enterLetStatment(VenerParser.LetStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#letStatment}.
	 * @param ctx the parse tree
	 */
	void exitLetStatment(VenerParser.LetStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#classExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassExpression(VenerParser.ClassExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#classExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassExpression(VenerParser.ClassExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#classStatement}.
	 * @param ctx the parse tree
	 */
	void enterClassStatement(VenerParser.ClassStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#classStatement}.
	 * @param ctx the parse tree
	 */
	void exitClassStatement(VenerParser.ClassStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#classExtend}.
	 * @param ctx the parse tree
	 */
	void enterClassExtend(VenerParser.ClassExtendContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#classExtend}.
	 * @param ctx the parse tree
	 */
	void exitClassExtend(VenerParser.ClassExtendContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#classTrait}.
	 * @param ctx the parse tree
	 */
	void enterClassTrait(VenerParser.ClassTraitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#classTrait}.
	 * @param ctx the parse tree
	 */
	void exitClassTrait(VenerParser.ClassTraitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#classController}.
	 * @param ctx the parse tree
	 */
	void enterClassController(VenerParser.ClassControllerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#classController}.
	 * @param ctx the parse tree
	 */
	void exitClassController(VenerParser.ClassControllerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#classEos}.
	 * @param ctx the parse tree
	 */
	void enterClassEos(VenerParser.ClassEosContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#classEos}.
	 * @param ctx the parse tree
	 */
	void exitClassEos(VenerParser.ClassEosContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#traitStatement}.
	 * @param ctx the parse tree
	 */
	void enterTraitStatement(VenerParser.TraitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#traitStatement}.
	 * @param ctx the parse tree
	 */
	void exitTraitStatement(VenerParser.TraitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#interfaceStatement}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceStatement(VenerParser.InterfaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#interfaceStatement}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceStatement(VenerParser.InterfaceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#structureStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructureStatement(VenerParser.StructureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#structureStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructureStatement(VenerParser.StructureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#enumerateStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnumerateStatement(VenerParser.EnumerateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#enumerateStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnumerateStatement(VenerParser.EnumerateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#traitExpression}.
	 * @param ctx the parse tree
	 */
	void enterTraitExpression(VenerParser.TraitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#traitExpression}.
	 * @param ctx the parse tree
	 */
	void exitTraitExpression(VenerParser.TraitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#interfaceExpression}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceExpression(VenerParser.InterfaceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#interfaceExpression}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceExpression(VenerParser.InterfaceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#interfaceFunction}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceFunction(VenerParser.InterfaceFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#interfaceFunction}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceFunction(VenerParser.InterfaceFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#interfaceParameters}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceParameters(VenerParser.InterfaceParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#interfaceParameters}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceParameters(VenerParser.InterfaceParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#structureExpression}.
	 * @param ctx the parse tree
	 */
	void enterStructureExpression(VenerParser.StructureExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#structureExpression}.
	 * @param ctx the parse tree
	 */
	void exitStructureExpression(VenerParser.StructureExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#enumerateExpression}.
	 * @param ctx the parse tree
	 */
	void enterEnumerateExpression(VenerParser.EnumerateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#enumerateExpression}.
	 * @param ctx the parse tree
	 */
	void exitEnumerateExpression(VenerParser.EnumerateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#enumerateNumber}.
	 * @param ctx the parse tree
	 */
	void enterEnumerateNumber(VenerParser.EnumerateNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#enumerateNumber}.
	 * @param ctx the parse tree
	 */
	void exitEnumerateNumber(VenerParser.EnumerateNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(VenerParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(VenerParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(VenerParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(VenerParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#byteInput}.
	 * @param ctx the parse tree
	 */
	void enterByteInput(VenerParser.ByteInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#byteInput}.
	 * @param ctx the parse tree
	 */
	void exitByteInput(VenerParser.ByteInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(VenerParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(VenerParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexTake}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 */
	void enterIndexTake(VenerParser.IndexTakeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexTake}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 */
	void exitIndexTake(VenerParser.IndexTakeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Index000}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 */
	void enterIndex000(VenerParser.Index000Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Index000}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 */
	void exitIndex000(VenerParser.Index000Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Index001}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 */
	void enterIndex001(VenerParser.Index001Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Index001}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 */
	void exitIndex001(VenerParser.Index001Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Index010}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 */
	void enterIndex010(VenerParser.Index010Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Index010}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 */
	void exitIndex010(VenerParser.Index010Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Index011}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 */
	void enterIndex011(VenerParser.Index011Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Index011}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 */
	void exitIndex011(VenerParser.Index011Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Index100}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 */
	void enterIndex100(VenerParser.Index100Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Index100}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 */
	void exitIndex100(VenerParser.Index100Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Index101}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 */
	void enterIndex101(VenerParser.Index101Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Index101}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 */
	void exitIndex101(VenerParser.Index101Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Index110}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 */
	void enterIndex110(VenerParser.Index110Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Index110}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 */
	void exitIndex110(VenerParser.Index110Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Index111}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 */
	void enterIndex111(VenerParser.Index111Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Index111}
	 * labeled alternative in {@link VenerParser#indexValid}.
	 * @param ctx the parse tree
	 */
	void exitIndex111(VenerParser.Index111Context ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#indexTerm}.
	 * @param ctx the parse tree
	 */
	void enterIndexTerm(VenerParser.IndexTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#indexTerm}.
	 * @param ctx the parse tree
	 */
	void exitIndexTerm(VenerParser.IndexTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#dict}.
	 * @param ctx the parse tree
	 */
	void enterDict(VenerParser.DictContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#dict}.
	 * @param ctx the parse tree
	 */
	void exitDict(VenerParser.DictContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void enterKeyValue(VenerParser.KeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void exitKeyValue(VenerParser.KeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#keyValid}.
	 * @param ctx the parse tree
	 */
	void enterKeyValid(VenerParser.KeyValidContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#keyValid}.
	 * @param ctx the parse tree
	 */
	void exitKeyValid(VenerParser.KeyValidContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(VenerParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(VenerParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(VenerParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(VenerParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#complex}.
	 * @param ctx the parse tree
	 */
	void enterComplex(VenerParser.ComplexContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#complex}.
	 * @param ctx the parse tree
	 */
	void exitComplex(VenerParser.ComplexContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(VenerParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(VenerParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(VenerParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(VenerParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringEmpty}
	 * labeled alternative in {@link VenerParser#string}.
	 * @param ctx the parse tree
	 */
	void enterStringEmpty(VenerParser.StringEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringEmpty}
	 * labeled alternative in {@link VenerParser#string}.
	 * @param ctx the parse tree
	 */
	void exitStringEmpty(VenerParser.StringEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringEscapeBlock}
	 * labeled alternative in {@link VenerParser#string}.
	 * @param ctx the parse tree
	 */
	void enterStringEscapeBlock(VenerParser.StringEscapeBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringEscapeBlock}
	 * labeled alternative in {@link VenerParser#string}.
	 * @param ctx the parse tree
	 */
	void exitStringEscapeBlock(VenerParser.StringEscapeBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringEscapeSingle}
	 * labeled alternative in {@link VenerParser#string}.
	 * @param ctx the parse tree
	 */
	void enterStringEscapeSingle(VenerParser.StringEscapeSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringEscapeSingle}
	 * labeled alternative in {@link VenerParser#string}.
	 * @param ctx the parse tree
	 */
	void exitStringEscapeSingle(VenerParser.StringEscapeSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteralBlock}
	 * labeled alternative in {@link VenerParser#string}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralBlock(VenerParser.StringLiteralBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteralBlock}
	 * labeled alternative in {@link VenerParser#string}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralBlock(VenerParser.StringLiteralBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteralSingle}
	 * labeled alternative in {@link VenerParser#string}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralSingle(VenerParser.StringLiteralSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteralSingle}
	 * labeled alternative in {@link VenerParser#string}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralSingle(VenerParser.StringLiteralSingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#special}.
	 * @param ctx the parse tree
	 */
	void enterSpecial(VenerParser.SpecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#special}.
	 * @param ctx the parse tree
	 */
	void exitSpecial(VenerParser.SpecialContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(VenerParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(VenerParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#solt}.
	 * @param ctx the parse tree
	 */
	void enterSolt(VenerParser.SoltContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#solt}.
	 * @param ctx the parse tree
	 */
	void exitSolt(VenerParser.SoltContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#add_ops}.
	 * @param ctx the parse tree
	 */
	void enterAdd_ops(VenerParser.Add_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#add_ops}.
	 * @param ctx the parse tree
	 */
	void exitAdd_ops(VenerParser.Add_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#pre_ops}.
	 * @param ctx the parse tree
	 */
	void enterPre_ops(VenerParser.Pre_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#pre_ops}.
	 * @param ctx the parse tree
	 */
	void exitPre_ops(VenerParser.Pre_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#pst_ops}.
	 * @param ctx the parse tree
	 */
	void enterPst_ops(VenerParser.Pst_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#pst_ops}.
	 * @param ctx the parse tree
	 */
	void exitPst_ops(VenerParser.Pst_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#bit_ops}.
	 * @param ctx the parse tree
	 */
	void enterBit_ops(VenerParser.Bit_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#bit_ops}.
	 * @param ctx the parse tree
	 */
	void exitBit_ops(VenerParser.Bit_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#lgk_ops}.
	 * @param ctx the parse tree
	 */
	void enterLgk_ops(VenerParser.Lgk_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#lgk_ops}.
	 * @param ctx the parse tree
	 */
	void exitLgk_ops(VenerParser.Lgk_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#cpr_ops}.
	 * @param ctx the parse tree
	 */
	void enterCpr_ops(VenerParser.Cpr_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#cpr_ops}.
	 * @param ctx the parse tree
	 */
	void exitCpr_ops(VenerParser.Cpr_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#pow_ops}.
	 * @param ctx the parse tree
	 */
	void enterPow_ops(VenerParser.Pow_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#pow_ops}.
	 * @param ctx the parse tree
	 */
	void exitPow_ops(VenerParser.Pow_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#mul_ops}.
	 * @param ctx the parse tree
	 */
	void enterMul_ops(VenerParser.Mul_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#mul_ops}.
	 * @param ctx the parse tree
	 */
	void exitMul_ops(VenerParser.Mul_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#list_ops}.
	 * @param ctx the parse tree
	 */
	void enterList_ops(VenerParser.List_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#list_ops}.
	 * @param ctx the parse tree
	 */
	void exitList_ops(VenerParser.List_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VenerParser#mod_assign}.
	 * @param ctx the parse tree
	 */
	void enterMod_assign(VenerParser.Mod_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link VenerParser#mod_assign}.
	 * @param ctx the parse tree
	 */
	void exitMod_assign(VenerParser.Mod_assignContext ctx);
}