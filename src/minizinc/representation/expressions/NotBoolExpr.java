/**
 * 
 */
package minizinc.representation.expressions;

import java.util.Arrays;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.ExprContext;
import minizinc.antlr4.MiniZincGrammarParser.NotExprContext;
import minizinc.representation.Parsing;

/**
 * BoolComplexExprssion as a not(e) expression
 * @author rafa
 *
 */
public class NotBoolExpr extends BoolExpr {
	
	private Expr e;

	

	/**
	 * Constructor for not(e)
	 * @param e the negated expression
	 */
	public NotBoolExpr (Expr e) {
		this.e = e;
	}


	@Override
	public String print() {
		return "not (" + e + ")";

	}

	@Override
	public List<Expr> subexpressions() {
		return Arrays.asList(e);
	}
	
	/**
	 * Grammar: <br>
	 * notExpr : 'not' expr ;
	 * 
	 * @param ctx
	 *            Grammar context
	 * @return NotBoolExpr representation
	 */
	public static NotBoolExpr notBoolExpr(NotExprContext ctx) {
		NotBoolExpr t = null;
		ExprContext e0 = ctx.expr();
		if (e0 != null) {
			t = new NotBoolExpr(expr(e0));
		} else
			Parsing.error("notBoolExpr " + ctx.toString());

		return t;
	}




}
