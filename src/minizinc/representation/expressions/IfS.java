package minizinc.representation.expressions;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.*;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;

public class IfS extends Expr {
	private Expr Cond;
	private Expr Exp1;
	private Expr Exp2;

	/**
	 * Used only for pretty printing
	 */
	private static int countspc = 0;

	public IfS(Expr cond, Expr exp1, Expr exp2) {
		Cond = cond;
		Exp1 = exp1;
		Exp2 = exp2;
	}

	/*
	 * @Override public Term simplify() { Term condp = Cond.simplify(); Term
	 * exp1p = Exp1.simplify(); Term exp2p = Exp2.simplify(); return new
	 * IfS(condp, exp1p, exp2p); }
	 */

	public Expr getCond() {
		return Cond;
	}

	public void setCond(Expr cond) {
		Cond = cond;
	}

	public Expr getExp1() {
		return Exp1;
	}

	public void setExp1(Expr exp1) {
		Exp1 = exp1;
	}

	public Expr getExp2() {
		return Exp2;
	}

	public void setExp2(Expr exp2) {
		Exp2 = exp2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Cond == null) ? 0 : Cond.hashCode());
		result = prime * result + ((Exp1 == null) ? 0 : Exp1.hashCode());
		result = prime * result + ((Exp2 == null) ? 0 : Exp2.hashCode());
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
		IfS other = (IfS) obj;
		if (Cond == null) {
			if (other.Cond != null)
				return false;
		} else if (!Cond.equals(other.Cond))
			return false;
		if (Exp1 == null) {
			if (other.Exp1 != null)
				return false;
		} else if (!Exp1.equals(other.Exp1))
			return false;
		if (Exp2 == null) {
			if (other.Exp2 != null)
				return false;
		} else if (!Exp2.equals(other.Exp2))
			return false;
		return true;
	}

	@Override
	public String print() {
		int n = countspc;
		String s = print(n);
		countspc = n;
		return s;
	}

	@Override
	public String print(int n) {
		return nSpc(n) + "if (" + Cond.print() + ") \n" + nSpc(n) + "then \n"
				+ Exp1.print(n + 5) + "\n" + nSpc(n) + "else \n"
				+ Exp2.print(n + 5) + "\n" + nSpc(n) + "endif";

	}

	/**
	 * Returns the type of the if statement. Observe that both the then and the
	 * else must have the same type, but we don't check that and simply return
	 * the if part.
	 * 
	 * @return The type of the Then Expression
	 */
	@Override
	public TypeName type() {
		return Exp1.type();
	}

	/**
	 * ifExpr : 'if' bodyIf ;
	 * 
	 * @param ctx
	 *            the expression context
	 * @return Term representing the if expression
	 */
	public static IfS ifExpr(IfExprContext ctx) {
		IfS t = null;
		if (Parsing.has(ctx.bodyIf())) {
			t = bodyIf(ctx.bodyIf());
		} else
			Parsing.error("ifExpr:  " + ctx.toString());
		return t;
	}

	/**
	 * bodyIf : expr 'then' expr (elseS | elseifS) ;
	 * 
	 * @param ctx
	 *            the expression context
	 * @return Term representing the if expression
	 */
	private static IfS bodyIf(BodyIfContext ctx) {
		IfS t = null;
		ExprContext e0 = ctx.expr(0);
		ExprContext e1 = ctx.expr(1);
		Expr t0 = expr(e0);
		Expr t1 = expr(e1);

		if (Parsing.has(ctx.elseS())) {
			t = elseS(t0, t1, ctx.elseS());
		} else if (Parsing.has(ctx.elseifS())) {
			t = elseifS(t0, t1, ctx.elseifS());
		} else
			Parsing.error("bodyIf:  " + ctx.toString());
		return t;
	}

	/**
	 * elseS : 'else' expr 'endif';
	 * 
	 * @param t0
	 *            : if condition
	 * @param t1
	 *            : then expression
	 * @param ctx
	 *            : expression context
	 * @return Term representing the elseS expression
	 */
	private static IfS elseS(Expr t0, Expr t1, ElseSContext ctx) {
		IfS t = null;
		if (Parsing.has(ctx.expr())) {
			Expr t2 = expr(ctx.expr());
			t = new IfS(t0, t1, t2);
		} else
			Parsing.error("elseS " + ctx.toString());
		return t;
	}

	/**
	 * elseifS : 'elseif' bodyIf;
	 * 
	 * @param t0
	 *            if condition
	 * @param t1
	 *            then expression
	 * @param ctx
	 *            expression context
	 * @return Term representing the elseifS expression
	 */
	private static IfS elseifS(Expr t0, Expr t1, ElseifSContext ctx) {
		IfS t = null;
		if (Parsing.has(ctx.bodyIf())) {
			Expr t2 = bodyIf(ctx.bodyIf());
			t = new IfS(t0, t1, t2);
		} else
			Parsing.error("elseifS " + ctx.toString());
		return t;
	}

	@Override
	public IfS clone() {
		IfS r = null;
		Expr Condp = Cond == null ? null : Cond.clone();
		Expr Exp1p = Exp1 == null ? null : Exp1.clone();
		Expr Exp2p = Exp2 == null ? null : Exp2.clone();
		;
		r = new IfS(Condp, Exp1p, Exp2p);
		return r;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		Expr Condp = this.applyTransformer(t, Cond);
		Expr Exp1p = this.applyTransformer(t, Exp1);
		Expr Exp2p = this.applyTransformer(t, Exp2);

		Cond = Condp;
		Exp1 = Exp1p;
		Exp2 = Exp2p;

	}

}
