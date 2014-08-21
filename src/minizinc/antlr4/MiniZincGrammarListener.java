package minizinc.antlr4;
// Generated from MiniZincGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniZincGrammarParser}.
 */
public interface MiniZincGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#boolComplexExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolComplexExpr(@NotNull MiniZincGrammarParser.BoolComplexExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#boolComplexExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolComplexExpr(@NotNull MiniZincGrammarParser.BoolComplexExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#setS}.
	 * @param ctx the parse tree
	 */
	void enterSetS(@NotNull MiniZincGrammarParser.SetSContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#setS}.
	 * @param ctx the parse tree
	 */
	void exitSetS(@NotNull MiniZincGrammarParser.SetSContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#opOrID}.
	 * @param ctx the parse tree
	 */
	void enterOpOrID(@NotNull MiniZincGrammarParser.OpOrIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#opOrID}.
	 * @param ctx the parse tree
	 */
	void exitOpOrID(@NotNull MiniZincGrammarParser.OpOrIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#rint}.
	 * @param ctx the parse tree
	 */
	void enterRint(@NotNull MiniZincGrammarParser.RintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#rint}.
	 * @param ctx the parse tree
	 */
	void exitRint(@NotNull MiniZincGrammarParser.RintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#nonEmptyListElems}.
	 * @param ctx the parse tree
	 */
	void enterNonEmptyListElems(@NotNull MiniZincGrammarParser.NonEmptyListElemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#nonEmptyListElems}.
	 * @param ctx the parse tree
	 */
	void exitNonEmptyListElems(@NotNull MiniZincGrammarParser.NonEmptyListElemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#boolVal}.
	 * @param ctx the parse tree
	 */
	void enterBoolVal(@NotNull MiniZincGrammarParser.BoolValContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#boolVal}.
	 * @param ctx the parse tree
	 */
	void exitBoolVal(@NotNull MiniZincGrammarParser.BoolValContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(@NotNull MiniZincGrammarParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(@NotNull MiniZincGrammarParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#arithOp}.
	 * @param ctx the parse tree
	 */
	void enterArithOp(@NotNull MiniZincGrammarParser.ArithOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#arithOp}.
	 * @param ctx the parse tree
	 */
	void exitArithOp(@NotNull MiniZincGrammarParser.ArithOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(@NotNull MiniZincGrammarParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(@NotNull MiniZincGrammarParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#maximize}.
	 * @param ctx the parse tree
	 */
	void enterMaximize(@NotNull MiniZincGrammarParser.MaximizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#maximize}.
	 * @param ctx the parse tree
	 */
	void exitMaximize(@NotNull MiniZincGrammarParser.MaximizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(@NotNull MiniZincGrammarParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(@NotNull MiniZincGrammarParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#qualArithOp}.
	 * @param ctx the parse tree
	 */
	void enterQualArithOp(@NotNull MiniZincGrammarParser.QualArithOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#qualArithOp}.
	 * @param ctx the parse tree
	 */
	void exitQualArithOp(@NotNull MiniZincGrammarParser.QualArithOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(@NotNull MiniZincGrammarParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(@NotNull MiniZincGrammarParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull MiniZincGrammarParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull MiniZincGrammarParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#infixOp}.
	 * @param ctx the parse tree
	 */
	void enterInfixOp(@NotNull MiniZincGrammarParser.InfixOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#infixOp}.
	 * @param ctx the parse tree
	 */
	void exitInfixOp(@NotNull MiniZincGrammarParser.InfixOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#simpleNonEmptyList}.
	 * @param ctx the parse tree
	 */
	void enterSimpleNonEmptyList(@NotNull MiniZincGrammarParser.SimpleNonEmptyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#simpleNonEmptyList}.
	 * @param ctx the parse tree
	 */
	void exitSimpleNonEmptyList(@NotNull MiniZincGrammarParser.SimpleNonEmptyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull MiniZincGrammarParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull MiniZincGrammarParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#rbool}.
	 * @param ctx the parse tree
	 */
	void enterRbool(@NotNull MiniZincGrammarParser.RboolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#rbool}.
	 * @param ctx the parse tree
	 */
	void exitRbool(@NotNull MiniZincGrammarParser.RboolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#boolS}.
	 * @param ctx the parse tree
	 */
	void enterBoolS(@NotNull MiniZincGrammarParser.BoolSContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#boolS}.
	 * @param ctx the parse tree
	 */
	void exitBoolS(@NotNull MiniZincGrammarParser.BoolSContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#tcons}.
	 * @param ctx the parse tree
	 */
	void enterTcons(@NotNull MiniZincGrammarParser.TconsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#tcons}.
	 * @param ctx the parse tree
	 */
	void exitTcons(@NotNull MiniZincGrammarParser.TconsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#inDecl}.
	 * @param ctx the parse tree
	 */
	void enterInDecl(@NotNull MiniZincGrammarParser.InDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#inDecl}.
	 * @param ctx the parse tree
	 */
	void exitInDecl(@NotNull MiniZincGrammarParser.InDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#multiDimList}.
	 * @param ctx the parse tree
	 */
	void enterMultiDimList(@NotNull MiniZincGrammarParser.MultiDimListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#multiDimList}.
	 * @param ctx the parse tree
	 */
	void exitMultiDimList(@NotNull MiniZincGrammarParser.MultiDimListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#toR}.
	 * @param ctx the parse tree
	 */
	void enterToR(@NotNull MiniZincGrammarParser.ToRContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#toR}.
	 * @param ctx the parse tree
	 */
	void exitToR(@NotNull MiniZincGrammarParser.ToRContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#onesection}.
	 * @param ctx the parse tree
	 */
	void enterOnesection(@NotNull MiniZincGrammarParser.OnesectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#onesection}.
	 * @param ctx the parse tree
	 */
	void exitOnesection(@NotNull MiniZincGrammarParser.OnesectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#fromR}.
	 * @param ctx the parse tree
	 */
	void enterFromR(@NotNull MiniZincGrammarParser.FromRContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#fromR}.
	 * @param ctx the parse tree
	 */
	void exitFromR(@NotNull MiniZincGrammarParser.FromRContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void enterSetExpr(@NotNull MiniZincGrammarParser.SetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void exitSetExpr(@NotNull MiniZincGrammarParser.SetExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#qualName}.
	 * @param ctx the parse tree
	 */
	void enterQualName(@NotNull MiniZincGrammarParser.QualNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#qualName}.
	 * @param ctx the parse tree
	 */
	void exitQualName(@NotNull MiniZincGrammarParser.QualNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#predOrUnionExpr}.
	 * @param ctx the parse tree
	 */
	void enterPredOrUnionExpr(@NotNull MiniZincGrammarParser.PredOrUnionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#predOrUnionExpr}.
	 * @param ctx the parse tree
	 */
	void exitPredOrUnionExpr(@NotNull MiniZincGrammarParser.PredOrUnionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(@NotNull MiniZincGrammarParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(@NotNull MiniZincGrammarParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(@NotNull MiniZincGrammarParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(@NotNull MiniZincGrammarParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(@NotNull MiniZincGrammarParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(@NotNull MiniZincGrammarParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#idexpr}.
	 * @param ctx the parse tree
	 */
	void enterIdexpr(@NotNull MiniZincGrammarParser.IdexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#idexpr}.
	 * @param ctx the parse tree
	 */
	void exitIdexpr(@NotNull MiniZincGrammarParser.IdexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#extended}.
	 * @param ctx the parse tree
	 */
	void enterExtended(@NotNull MiniZincGrammarParser.ExtendedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#extended}.
	 * @param ctx the parse tree
	 */
	void exitExtended(@NotNull MiniZincGrammarParser.ExtendedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#letExpr}.
	 * @param ctx the parse tree
	 */
	void enterLetExpr(@NotNull MiniZincGrammarParser.LetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#letExpr}.
	 * @param ctx the parse tree
	 */
	void exitLetExpr(@NotNull MiniZincGrammarParser.LetExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#constrainchoice}.
	 * @param ctx the parse tree
	 */
	void enterConstrainchoice(@NotNull MiniZincGrammarParser.ConstrainchoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#constrainchoice}.
	 * @param ctx the parse tree
	 */
	void exitConstrainchoice(@NotNull MiniZincGrammarParser.ConstrainchoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#constr}.
	 * @param ctx the parse tree
	 */
	void enterConstr(@NotNull MiniZincGrammarParser.ConstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#constr}.
	 * @param ctx the parse tree
	 */
	void exitConstr(@NotNull MiniZincGrammarParser.ConstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#typedata}.
	 * @param ctx the parse tree
	 */
	void enterTypedata(@NotNull MiniZincGrammarParser.TypedataContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#typedata}.
	 * @param ctx the parse tree
	 */
	void exitTypedata(@NotNull MiniZincGrammarParser.TypedataContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#arithComplexExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithComplexExpr(@NotNull MiniZincGrammarParser.ArithComplexExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#arithComplexExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithComplexExpr(@NotNull MiniZincGrammarParser.ArithComplexExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(@NotNull MiniZincGrammarParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(@NotNull MiniZincGrammarParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#elseifS}.
	 * @param ctx the parse tree
	 */
	void enterElseifS(@NotNull MiniZincGrammarParser.ElseifSContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#elseifS}.
	 * @param ctx the parse tree
	 */
	void exitElseifS(@NotNull MiniZincGrammarParser.ElseifSContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#setVal}.
	 * @param ctx the parse tree
	 */
	void enterSetVal(@NotNull MiniZincGrammarParser.SetValContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#setVal}.
	 * @param ctx the parse tree
	 */
	void exitSetVal(@NotNull MiniZincGrammarParser.SetValContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#minimize}.
	 * @param ctx the parse tree
	 */
	void enterMinimize(@NotNull MiniZincGrammarParser.MinimizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#minimize}.
	 * @param ctx the parse tree
	 */
	void exitMinimize(@NotNull MiniZincGrammarParser.MinimizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull MiniZincGrammarParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull MiniZincGrammarParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(@NotNull MiniZincGrammarParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(@NotNull MiniZincGrammarParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull MiniZincGrammarParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull MiniZincGrammarParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#varmark}.
	 * @param ctx the parse tree
	 */
	void enterVarmark(@NotNull MiniZincGrammarParser.VarmarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#varmark}.
	 * @param ctx the parse tree
	 */
	void exitVarmark(@NotNull MiniZincGrammarParser.VarmarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#rfloat}.
	 * @param ctx the parse tree
	 */
	void enterRfloat(@NotNull MiniZincGrammarParser.RfloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#rfloat}.
	 * @param ctx the parse tree
	 */
	void exitRfloat(@NotNull MiniZincGrammarParser.RfloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#guardedList}.
	 * @param ctx the parse tree
	 */
	void enterGuardedList(@NotNull MiniZincGrammarParser.GuardedListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#guardedList}.
	 * @param ctx the parse tree
	 */
	void exitGuardedList(@NotNull MiniZincGrammarParser.GuardedListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#intS}.
	 * @param ctx the parse tree
	 */
	void enterIntS(@NotNull MiniZincGrammarParser.IntSContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#intS}.
	 * @param ctx the parse tree
	 */
	void exitIntS(@NotNull MiniZincGrammarParser.IntSContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(@NotNull MiniZincGrammarParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(@NotNull MiniZincGrammarParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpr(@NotNull MiniZincGrammarParser.CaseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpr(@NotNull MiniZincGrammarParser.CaseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#extendsmark}.
	 * @param ctx the parse tree
	 */
	void enterExtendsmark(@NotNull MiniZincGrammarParser.ExtendsmarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#extendsmark}.
	 * @param ctx the parse tree
	 */
	void exitExtendsmark(@NotNull MiniZincGrammarParser.ExtendsmarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(@NotNull MiniZincGrammarParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(@NotNull MiniZincGrammarParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#rbracketExpr}.
	 * @param ctx the parse tree
	 */
	void enterRbracketExpr(@NotNull MiniZincGrammarParser.RbracketExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#rbracketExpr}.
	 * @param ctx the parse tree
	 */
	void exitRbracketExpr(@NotNull MiniZincGrammarParser.RbracketExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#pardecl}.
	 * @param ctx the parse tree
	 */
	void enterPardecl(@NotNull MiniZincGrammarParser.PardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#pardecl}.
	 * @param ctx the parse tree
	 */
	void exitPardecl(@NotNull MiniZincGrammarParser.PardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#typename}.
	 * @param ctx the parse tree
	 */
	void enterTypename(@NotNull MiniZincGrammarParser.TypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#typename}.
	 * @param ctx the parse tree
	 */
	void exitTypename(@NotNull MiniZincGrammarParser.TypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(@NotNull MiniZincGrammarParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(@NotNull MiniZincGrammarParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterDimensions(@NotNull MiniZincGrammarParser.DimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitDimensions(@NotNull MiniZincGrammarParser.DimensionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull MiniZincGrammarParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull MiniZincGrammarParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(@NotNull MiniZincGrammarParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(@NotNull MiniZincGrammarParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#commaList}.
	 * @param ctx the parse tree
	 */
	void enterCommaList(@NotNull MiniZincGrammarParser.CommaListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#commaList}.
	 * @param ctx the parse tree
	 */
	void exitCommaList(@NotNull MiniZincGrammarParser.CommaListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#restS}.
	 * @param ctx the parse tree
	 */
	void enterRestS(@NotNull MiniZincGrammarParser.RestSContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#restS}.
	 * @param ctx the parse tree
	 */
	void exitRestS(@NotNull MiniZincGrammarParser.RestSContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#twosections}.
	 * @param ctx the parse tree
	 */
	void enterTwosections(@NotNull MiniZincGrammarParser.TwosectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#twosections}.
	 * @param ctx the parse tree
	 */
	void exitTwosections(@NotNull MiniZincGrammarParser.TwosectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull MiniZincGrammarParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull MiniZincGrammarParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#pararray}.
	 * @param ctx the parse tree
	 */
	void enterPararray(@NotNull MiniZincGrammarParser.PararrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#pararray}.
	 * @param ctx the parse tree
	 */
	void exitPararray(@NotNull MiniZincGrammarParser.PararrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#vararray}.
	 * @param ctx the parse tree
	 */
	void enterVararray(@NotNull MiniZincGrammarParser.VararrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#vararray}.
	 * @param ctx the parse tree
	 */
	void exitVararray(@NotNull MiniZincGrammarParser.VararrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#qualBoolOp}.
	 * @param ctx the parse tree
	 */
	void enterQualBoolOp(@NotNull MiniZincGrammarParser.QualBoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#qualBoolOp}.
	 * @param ctx the parse tree
	 */
	void exitQualBoolOp(@NotNull MiniZincGrammarParser.QualBoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithExpr(@NotNull MiniZincGrammarParser.ArithExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithExpr(@NotNull MiniZincGrammarParser.ArithExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#oneDimList}.
	 * @param ctx the parse tree
	 */
	void enterOneDimList(@NotNull MiniZincGrammarParser.OneDimListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#oneDimList}.
	 * @param ctx the parse tree
	 */
	void exitOneDimList(@NotNull MiniZincGrammarParser.OneDimListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(@NotNull MiniZincGrammarParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(@NotNull MiniZincGrammarParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#optimize}.
	 * @param ctx the parse tree
	 */
	void enterOptimize(@NotNull MiniZincGrammarParser.OptimizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#optimize}.
	 * @param ctx the parse tree
	 */
	void exitOptimize(@NotNull MiniZincGrammarParser.OptimizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull MiniZincGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull MiniZincGrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void enterCaseBranch(@NotNull MiniZincGrammarParser.CaseBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void exitCaseBranch(@NotNull MiniZincGrammarParser.CaseBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#letDecl}.
	 * @param ctx the parse tree
	 */
	void enterLetDecl(@NotNull MiniZincGrammarParser.LetDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#letDecl}.
	 * @param ctx the parse tree
	 */
	void exitLetDecl(@NotNull MiniZincGrammarParser.LetDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#arithOp2}.
	 * @param ctx the parse tree
	 */
	void enterArithOp2(@NotNull MiniZincGrammarParser.ArithOp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#arithOp2}.
	 * @param ctx the parse tree
	 */
	void exitArithOp2(@NotNull MiniZincGrammarParser.ArithOp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#listExpr}.
	 * @param ctx the parse tree
	 */
	void enterListExpr(@NotNull MiniZincGrammarParser.ListExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#listExpr}.
	 * @param ctx the parse tree
	 */
	void exitListExpr(@NotNull MiniZincGrammarParser.ListExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#scons}.
	 * @param ctx the parse tree
	 */
	void enterScons(@NotNull MiniZincGrammarParser.SconsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#scons}.
	 * @param ctx the parse tree
	 */
	void exitScons(@NotNull MiniZincGrammarParser.SconsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(@NotNull MiniZincGrammarParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(@NotNull MiniZincGrammarParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#guardedSet}.
	 * @param ctx the parse tree
	 */
	void enterGuardedSet(@NotNull MiniZincGrammarParser.GuardedSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#guardedSet}.
	 * @param ctx the parse tree
	 */
	void exitGuardedSet(@NotNull MiniZincGrammarParser.GuardedSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull MiniZincGrammarParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull MiniZincGrammarParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#solve}.
	 * @param ctx the parse tree
	 */
	void enterSolve(@NotNull MiniZincGrammarParser.SolveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#solve}.
	 * @param ctx the parse tree
	 */
	void exitSolve(@NotNull MiniZincGrammarParser.SolveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull MiniZincGrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull MiniZincGrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#infixSetOp}.
	 * @param ctx the parse tree
	 */
	void enterInfixSetOp(@NotNull MiniZincGrammarParser.InfixSetOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#infixSetOp}.
	 * @param ctx the parse tree
	 */
	void exitInfixSetOp(@NotNull MiniZincGrammarParser.InfixSetOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#varchoice}.
	 * @param ctx the parse tree
	 */
	void enterVarchoice(@NotNull MiniZincGrammarParser.VarchoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#varchoice}.
	 * @param ctx the parse tree
	 */
	void exitVarchoice(@NotNull MiniZincGrammarParser.VarchoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#modeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterModeAnnotation(@NotNull MiniZincGrammarParser.ModeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#modeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitModeAnnotation(@NotNull MiniZincGrammarParser.ModeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#postExt}.
	 * @param ctx the parse tree
	 */
	void enterPostExt(@NotNull MiniZincGrammarParser.PostExtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#postExt}.
	 * @param ctx the parse tree
	 */
	void exitPostExt(@NotNull MiniZincGrammarParser.PostExtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#typeset}.
	 * @param ctx the parse tree
	 */
	void enterTypeset(@NotNull MiniZincGrammarParser.TypesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#typeset}.
	 * @param ctx the parse tree
	 */
	void exitTypeset(@NotNull MiniZincGrammarParser.TypesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull MiniZincGrammarParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull MiniZincGrammarParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#simpleList}.
	 * @param ctx the parse tree
	 */
	void enterSimpleList(@NotNull MiniZincGrammarParser.SimpleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#simpleList}.
	 * @param ctx the parse tree
	 */
	void exitSimpleList(@NotNull MiniZincGrammarParser.SimpleListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#bodyIf}.
	 * @param ctx the parse tree
	 */
	void enterBodyIf(@NotNull MiniZincGrammarParser.BodyIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#bodyIf}.
	 * @param ctx the parse tree
	 */
	void exitBodyIf(@NotNull MiniZincGrammarParser.BodyIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull MiniZincGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull MiniZincGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#arrayaccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayaccess(@NotNull MiniZincGrammarParser.ArrayaccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#arrayaccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayaccess(@NotNull MiniZincGrammarParser.ArrayaccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(@NotNull MiniZincGrammarParser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(@NotNull MiniZincGrammarParser.BoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#seqS}.
	 * @param ctx the parse tree
	 */
	void enterSeqS(@NotNull MiniZincGrammarParser.SeqSContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#seqS}.
	 * @param ctx the parse tree
	 */
	void exitSeqS(@NotNull MiniZincGrammarParser.SeqSContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(@NotNull MiniZincGrammarParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(@NotNull MiniZincGrammarParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#satisfy}.
	 * @param ctx the parse tree
	 */
	void enterSatisfy(@NotNull MiniZincGrammarParser.SatisfyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#satisfy}.
	 * @param ctx the parse tree
	 */
	void exitSatisfy(@NotNull MiniZincGrammarParser.SatisfyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#listExtended}.
	 * @param ctx the parse tree
	 */
	void enterListExtended(@NotNull MiniZincGrammarParser.ListExtendedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#listExtended}.
	 * @param ctx the parse tree
	 */
	void exitListExtended(@NotNull MiniZincGrammarParser.ListExtendedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#bracketExpr}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpr(@NotNull MiniZincGrammarParser.BracketExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#bracketExpr}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpr(@NotNull MiniZincGrammarParser.BracketExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#preExt}.
	 * @param ctx the parse tree
	 */
	void enterPreExt(@NotNull MiniZincGrammarParser.PreExtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#preExt}.
	 * @param ctx the parse tree
	 */
	void exitPreExt(@NotNull MiniZincGrammarParser.PreExtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#listValue}.
	 * @param ctx the parse tree
	 */
	void enterListValue(@NotNull MiniZincGrammarParser.ListValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#listValue}.
	 * @param ctx the parse tree
	 */
	void exitListValue(@NotNull MiniZincGrammarParser.ListValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#elseS}.
	 * @param ctx the parse tree
	 */
	void enterElseS(@NotNull MiniZincGrammarParser.ElseSContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#elseS}.
	 * @param ctx the parse tree
	 */
	void exitElseS(@NotNull MiniZincGrammarParser.ElseSContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#whereCond}.
	 * @param ctx the parse tree
	 */
	void enterWhereCond(@NotNull MiniZincGrammarParser.WhereCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#whereCond}.
	 * @param ctx the parse tree
	 */
	void exitWhereCond(@NotNull MiniZincGrammarParser.WhereCondContext ctx);
}