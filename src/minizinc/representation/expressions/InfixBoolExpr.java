/**
 * 
 */
package minizinc.representation.expressions;

import transformation.ExprTransformer;

/**
 * BoolComplexExprssion as a Infix boolean expression
 * 
 * @author rafa
 *
 */
public class InfixBoolExpr extends BoolExpr {

	/**
	 * left operand
	 */
	private BoolExpr e1;
	/**
	 * operator (optionally qualified)
	 */
	private String op;
	/*
	 * right operand
	 */
	private BoolExpr e2;

	/**
	 * Constructor for infix boolean expression e1 op e2
	 * 
	 * @param op
	 *            operator
	 * @param e1
	 *            left operand
	 * @param e2
	 *            right operand
	 */
	public InfixBoolExpr(String op, BoolExpr e1, BoolExpr e2) {
		this.op = op;
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	public String print() {
		String s1 = isBasic(e1) ? e1.print() : "(" + e1.print() + ")";
		String s2 = isBasic(e2) ? e2.print() : "(" + e2.print() + ")";
		return s1 + " " + op + " " + s2;

	}

	/**
	 * Boolean infix expression
	 * 
	 * @param t0
	 *            First operand
	 * @param t1
	 *            Second operand
	 * @param op
	 *            Operator
	 * @return Term representation
	 */
	public static InfixBoolExpr infixBoolExpr(BoolExpr t0, BoolExpr t1,
			String op) {
		return new InfixBoolExpr(op, t0, t1);
	}

	@Override
	public InfixBoolExpr clone() {
		InfixBoolExpr r = null;
		BoolExpr e1p = e1 == null ? null : e1.clone();
		BoolExpr e2p = e2 == null ? null : e2.clone();
		String opp = op;
		r = new InfixBoolExpr(opp, e1p, e2p);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((e1 == null) ? 0 : e1.hashCode());
		result = prime * result + ((e2 == null) ? 0 : e2.hashCode());
		result = prime * result + ((op == null) ? 0 : op.hashCode());
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
		InfixBoolExpr other = (InfixBoolExpr) obj;
		if (e1 == null) {
			if (other.e1 != null)
				return false;
		} else if (!e1.equals(other.e1))
			return false;
		if (e2 == null) {
			if (other.e2 != null)
				return false;
		} else if (!e2.equals(other.e2))
			return false;
		if (op == null) {
			if (other.op != null)
				return false;
		} else if (!op.equals(other.op))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		BoolExpr e1p = this.applyTransformer2(t, e1);
		BoolExpr e2p = this.applyTransformer2(t, e2);

		e1 = e1p;
		e2 = e2p;

	}

	/**
	 * @return the e1
	 */
	public BoolExpr getE1() {
		return e1;
	}

	/**
	 * @return the op
	 */
	public String getOp() {
		return op;
	}

	/**
	 * @return the e2
	 */
	public BoolExpr getE2() {
		return e2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.expressions.Expr#simplify()
	 */
	@Override
	public Expr simplify() {
		Expr r = this;

		// if the operator is and / or then rely on this classes for
		// simplification
		if (op.equals("/\\")) {
			And eAnd = new And(e1, e2);
			r = eAnd.simplify();
		} else if (op.equals("\\/")) {
			Or eOr = new Or(e1, e2);
			r = eOr.simplify();
		} else if (op.equals("->")) {
			Imply eImply = new Imply(e1, e2);
			r = eImply.simplify();
		} else {

			// in principle only the subexpressions can be simplified
			Expr e1s = e1.simplify();
			Expr e2s = e2.simplify();
			if (!e1s.equals(e1) || !e2s.equals(e2))
				r = new InfixExpr(op, e1s, e2s);

		}
		return r;
	}

}
