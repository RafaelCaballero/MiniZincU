/**
 * 
 */
package minizinc.representation.expressions;

import transformation.ExprTransformer;
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
	 * @param source
	 *            The expression found between round brackets
	 */
	public RbracketExpr(Expr source) {
		e = source;

	}

	@Override
	public String print() {
		return "(" + e.print() + ")";
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
	 * Expression between round brackets : '(' ArtihExpr ')';
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

	@Override
	public RbracketExpr clone() {
		RbracketExpr r = null;
		Expr ep = e == null ? null : e.clone();
		r = new RbracketExpr(ep);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((e == null) ? 0 : e.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RbracketExpr other = (RbracketExpr) obj;
		if (e == null) {
			if (other.e != null)
				return false;
		} else if (!e.equals(other.e))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		Expr e2 = this.applyTransformer(t, e);
		e = e2;

	}
	
	public Expr getExprInside() {
		return e;
	}
	
	/* (non-Javadoc)
	 * @see minizinc.representation.expressions.Expr#simplify()
	 */
	@Override
	public Expr simplify() {
		Expr r = this;
		Expr es = e.simplify();
		if (isBasic(es))
			r = es;
		else 
			if (!e.equals(es)) {
				r = new RbracketExpr(es);
			}
		return r;
	}


}
