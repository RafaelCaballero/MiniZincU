/**
 * 
 */
package minizinc.representation.expressions;

import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.ExprContext;
import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.Parsing;
import minizinc.representation.SubExpressions;
import minizinc.representation.Typeable;

/**
 * Java representation of general expressions in MiniZinc.
 * It is an abstract class. All the particular expressions extend this class.
 * 
 * @author rafa
 *
 */
public abstract class Expr implements MiniZincRepresentation, SubExpressions, Typeable {
	

	/**
	 * Checking if an expression is atomic. Examples of atomic subexpressions are
	 * integers, variables, ....
	 * @return true if this is an atomic subexpression
	 */
	public boolean atomic() {
		List<? extends Expr> l =  subexpressions();
		return l ==null || l.size()==0;
	}
	
	@Override
	public String toString() {
		return print();
	}
	
	
	/**
	 * Parses an expression 
	 * Grammar for expressions:
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
			t = boolComplexExpr(ctx.boolComplexExpr());
		} else if (Parsing.has(ctx.arithComplexExpr())) {
			t = arithComplexExpr(ctx.arithComplexExpr());
		} else if (Parsing.has(ctx.setExpr())) {
			t = setExpr(ctx.setExpr());
		} else if (Parsing.has(ctx.listExpr())) {
			t = listExpr(ctx.listExpr());
		} else if (Parsing.has(ctx.infixOp())) {
			ExprContext e0 = ctx.expr(0);
			ExprContext e1 = ctx.expr(1);
			Expr t0 = expr(e0);
			Expr t1 = expr(e1);
			t = infixExpr(t0, t1, ctx.infixOp());
		} else if (Parsing.has(ctx.ifExpr())) {
			t = ifExpr(ctx.ifExpr());
		} else if (Parsing.has(ctx.letExpr())) {
			t = letExpr(ctx.letExpr());
		} else if (Parsing.has(ctx.predOrUnionExpr())) {
			t = predOrUnionExpr(ctx.predOrUnionExpr());
		} else if (Parsing.has(ctx.stringExpr())) {
			t = stringExpr(ctx.stringExpr());
		} else if (Parsing.has(ctx.caseExpr())) {
			t = caseExpr(ctx.caseExpr());
		} else if (Parsing.hasTerminal(ctx.BOOL())) {
			t = BOOLTerm(ctx.BOOL());
		} else if (Parsing.has(ctx.real())) {
			t = realTerm(ctx.real());
		} else if (Parsing.has(ctx.integer())) {
			t = integerTerm(ctx.integer());
		} else if (Parsing.hasTerminal(ctx.ID())) {
			t = IDTerm(ctx.ID());
		} else if (ctx.toString().equals("_")) {
			t = IDTerm("_");
		} else
			Parsing.error("expr:  " + ctx.toString());
		return t;
	}

	
}
