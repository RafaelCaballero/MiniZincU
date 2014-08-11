/**
 * 
 */
package minizinc.representation.expressions;

import java.util.Arrays;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.ArithExprContext;
import minizinc.antlr4.MiniZincGrammarParser.BoolExprContext;
import minizinc.antlr4.MiniZincGrammarParser.ExprContext;
import minizinc.antlr4.MiniZincGrammarParser.RbracketExprContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;

/**
 * A round bracket expression
 * 
 * @author rafa
 *
 */
public class RbracketExpr extends Expr {
	private Expr e;
	/**
	 * @param source The expression found between round brackets
	 */
	public RbracketExpr(Expr source) {
		e = source;

	}


	@Override
	public String print() {
		return "("+e.print()+")";
	}

	@Override
	public List<Expr> subexpressions() {
		return Arrays.asList(e);
	}


	@Override
	public TypeName type() {
		return e.type();
	}

	/**
	 * Expression between round brackets rbracketExpr : '(' expr ')';
	 * 
	 * @param ctx
	 *            grammar context
	 * @return Representation of expr as a round bracket expression
	 */
	public static RbracketExpr rbracketExpr(RbracketExprContext ctx) {
		RbracketExpr t = null;
		if (Parsing.has(ctx.expr())) {
			ExprContext e = ctx.expr();
			t = new RbracketExpr(Expr.expr(e));
		} else
			Parsing.error("rbracketExpr " + ctx.getText());
		return t;
	}
	
	/**
	 * Expression between round brackets rbracketBoolExpr : '(' boolExpr ')';
	 * 
	 * @param ctx
	 *            grammar context
	 * @return Representation of expr as a round bracket expression
	 */
	public static RbracketExpr rbracketBoolExpr(BoolExprContext ctx) {
		RbracketExpr t = null;
		t = new RbracketExpr(BoolExpr.boolExpr(ctx));
		return t;
	}

	
	/**
	 * Expression between round brackets  : '(' ArtihExpr ')';
	 * 
	 * @param ctx
	 *            grammar context
	 * @return Representation of expr as a round bracket expression
	 */
	public static RbracketExpr rbracketArithExpr(ArithExprContext ctx) {
		RbracketExpr t = null;
		t = new RbracketExpr(ArithExpr.arithExpr(ctx));
		return t;
	}


}
