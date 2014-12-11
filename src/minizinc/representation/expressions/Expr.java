/**
 * 
 */
package minizinc.representation.expressions;

import minizinc.antlr4.MiniZincGrammarParser.ExprContext;
import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.Parsing;
import minizinc.representation.SubExpressions;
import minizinc.representation.Typeable;
import minizinc.representation.expressions.lists.ListExpr;
import minizinc.representation.expressions.sets.SetExpr;

/**
 * Java representation of general expressions in MiniZinc. It is an abstract
 * class. All the particular expressions extend this class.
 * 
 * @author rafa
 *
 */
public abstract class Expr implements MiniZincRepresentation, SubExpressions,
		Typeable, Cloneable {

	@Override
	public String toString() {
		return print();
	}

	/**
	 * Parses an expression Grammar for expressions:
	 * <p>
	 * expr:
	 * </p>
	 * rbracketExpr<br>
	 * | boolComplexExpr<br>
	 * | arithComplexExpr<br>
	 * | setExpr <br>
	 * | listExpr<br>
	 * | expr infixOp expr<br>
	 * | ifExpr <br>
	 * | letExpr <br>
	 * | guardExpr<br>
	 * | predOrUnionExpr<br>
	 * | stringExpr<br>
	 * | caseExpr <br>
	 * | BOOL<br>
	 * | real<br>
	 * | integer<br>
	 * | ID<br>
	 * | '_'<br>
	 * 
	 * @param ctx
	 *            expression context
	 * @return Term representing the expression
	 */
	public static Expr expr(ExprContext ctx) {
		Expr t = null;
		if (Parsing.has(ctx.rbracketExpr())) {
			t = RbracketExpr.rbracketExpr(ctx.rbracketExpr());
		} else if (Parsing.has(ctx.boolComplexExpr())) {
			t = BoolComplexExpr.boolComplexExpr(ctx.boolComplexExpr());
		} else if (Parsing.has(ctx.arithComplexExpr())) {
			t = ArithExpr.arithComplexExpr(ctx.arithComplexExpr());
		} else if (Parsing.has(ctx.setExpr())) {
			t = SetExpr.setExpr(ctx.setExpr());
		} else if (Parsing.has(ctx.listExpr())) {
			t = ListExpr.listExpr(ctx.listExpr());
		} else if (Parsing.has(ctx.infixOp())) {
			ExprContext e0 = ctx.expr(0);
			ExprContext e1 = ctx.expr(1);
			Expr t0 = expr(e0);
			Expr t1 = expr(e1);
			t = InfixExpr.infixExpr(t0, t1, ctx.infixOp());
		} else if (Parsing.has(ctx.ifExpr())) {
			t = IfS.ifExpr(ctx.ifExpr());
		} else if (Parsing.has(ctx.letExpr())) {
			t = LetExpr.letExpr(ctx.letExpr());
		} else if (Parsing.has(ctx.predOrUnionExpr())) {
			t = PredOrUnionExpr.predOrUnionExpr(ctx.predOrUnionExpr());
		} else if (Parsing.has(ctx.caseExpr())) {
			t = CaseExpr.caseExpr(ctx.caseExpr());
		} else if (Parsing.hasTerminal(ctx.BOOL())) {
			t = BoolC.BOOLTerm(ctx.BOOL());
		} else if (Parsing.has(ctx.real())) {
			t = FloatC.realTerm(ctx.real());
		} else if (Parsing.has(ctx.integer())) {
			t = IntC.integerTerm(ctx.integer());
		} else if (Parsing.hasTerminal(ctx.ID())) {
			t = ID.IDTerm(ctx.ID());
		} else if (ctx.getText().equals("_")) {
			t = ID.IDTerm("_");
		} else
			Parsing.error("expr:  " + ctx.getText());
		return t;
	}

	@Override
	public abstract Expr clone();

	@Override
	public abstract boolean equals(Object e);

	@Override
	public abstract int hashCode();

	public Expr simplify() {
		return this;
	}
}
