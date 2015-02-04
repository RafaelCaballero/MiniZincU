/**
 * 
 */
package minizinc.representation.expressions;

import transformation.ExprTransformer;

/**
 * A bool expression of the form e1 op e2, with e1 and e2 arithmetic expressions
 * and op a relational operator (<,<=...).
 * 
 * @author rafa
 *
 */
public class InfixArithBoolExpr extends BoolExpr {
	private ArithExpr e1;
	private ArithExpr e2;
	private String op;

	public InfixArithBoolExpr(String op, ArithExpr t0, ArithExpr t1) {
		this.e1 = t0;
		this.e2 = t1;
		this.op = op;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return e1.print() + " " + op + " " + e2.print();
	}

	/**
	 * Arithmetic infix expression as a bool expression
	 * 
	 * @param t0
	 *            First operand
	 * @param t1
	 *            Second operand
	 * @param op
	 *            Operator
	 * @return InfixArithComplexBoolExpr representation
	 */

	public static InfixArithBoolExpr infixArithBoolExpr(ArithExpr t0,
			ArithExpr t1, String op) {
		return new InfixArithBoolExpr(op, t0, t1);
	}

	@Override
	public InfixArithBoolExpr clone() {
		InfixArithBoolExpr r = null;
		ArithExpr e1p = e1 == null ? null : e1.clone();
		ArithExpr e2p = e2 == null ? null : e2.clone();
		String opp = op;
		r = new InfixArithBoolExpr(opp, e1p, e2p);
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
		InfixArithBoolExpr other = (InfixArithBoolExpr) obj;
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
		ArithExpr e1p = this.applyTransformer2(t, e1);
		ArithExpr e2p = this.applyTransformer2(t, e2);
		e1 = e1p;
		e2 = e2p;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.expressions.Expr#simplify()
	 */
	@Override
	public Expr simplify() {
		Expr r = this;
		if (e1 != null && e2 != null) {
			Expr e1s = e1.simplify();
			Expr e2s = e2.simplify();
			if (e1s != null && e2s != null && !e1s.equals(e1)
					|| !e2s.equals(e2)) {
				if (e1s instanceof ArithExpr && e2s instanceof ArithExpr) {
					r = new InfixArithBoolExpr(op, (ArithExpr) e1s,
							(ArithExpr) e2s);
					r = r.simplify();
				}
			}
			r = simplifyOp(r, op, e1s, e2s);
		}
		return r;
	}

	public static Expr simplifyOp(Expr ri, String op, Expr e1s, Expr e2s) {
		Expr r = ri;

		//  a=a becomes true
		if (e1s!=null && e2s!=null && e1s.equals(e2s) && (op.equals("=") || op.equals("==")))
			r = new BoolC(true);
		else 	
		if ((e1s instanceof BoolC) && ((BoolC) e1s).getValue()) {
			r = e2s;
		} else if (Expr.isBasic(e1s) && Expr.isBasic(e2s))
			if ((e1s instanceof IntC && e2s instanceof IntC) || 
				 (e1s instanceof BoolC && e2s instanceof BoolC) ||
				 (e1s instanceof FloatC && e2s instanceof FloatC)) {
				if (op.equals("=") || op.equals("==")) {
					r = new BoolC(e1s.equals(e2s));
				} else if (op.equals("!="))
					r = new BoolC(!e1s.equals(e2s));
				else if (op.equals(">") || op.equals("<") || op.equals(">=")
						|| op.equals("<=") || op.equals("+") || op.equals("-")
						|| op.equals("*")) {
					// unfold operands
					if (e1s instanceof Operand)
						e1s = ((Operand) e1s).getExpr();
					if (e2s instanceof Operand)
						e2s = ((Operand) e2s).getExpr();

					if (e1s instanceof IntC && e2s instanceof IntC) {
						int e1v = ((IntC) e1s).get();
						int e2v = ((IntC) e2s).get();
						switch (op) {
						case ">":
							r = new BoolC(e1v > e2v);
							break;
						case "<":
							r = new BoolC(e1v < e2v);
							break;
						case ">=":
							r = new BoolC(e1v >= e2v);
							break;
						case "<=":
							r = new BoolC(e1v <= e2v);
							break;
						case "+":
							r = new IntC(e1v + e2v);
							break;
						case "-":
							r = new IntC(e1v - e2v);
							break;
						case "*":
							r = new IntC(e1v * e2v);
							break;
						}
					}
				}
			}
		return r;
	}

	/**
	 * @return The expression operand as a String
	 */
	public String getOp() {
		return op;
	}

	public ArithExpr getE1() {
		return e1;
	}

	public ArithExpr getE2() {
		return e2;
	}

}
