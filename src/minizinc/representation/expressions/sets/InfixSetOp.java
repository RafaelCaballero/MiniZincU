/**
 * 
 */
package minizinc.representation.expressions.sets;

import transformation.ExprTransformer;

/**
 * Represents a MiniZinc set expression expressed as an infix operator.<br>
 * Grammar: setExpr infixSetOp setExpr <br>
 * 
 * @author rafa
 *
 */
public class InfixSetOp extends SetExpr {
	protected SetExpr e1;
	protected SetExpr e2;
	protected String op;

	/**
	 * Constructor.
	 * 
	 */
	public InfixSetOp(String op, SetExpr e1, SetExpr e2) {
		this.op = op;
		this.e1 = e1;
		this.e2 = e2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return e1.print() + " " + op + " " + e2.print();
	}

	/**
	 * Represents a MiniZinc set expression expressed as an infix operator.<br>
	 * Grammar: setExpr infixSetOp setExpr <br>
	 * 
	 * @param op
	 *            The operator
	 * @param s1
	 *            First operand
	 * @param s2
	 *            Second operand
	 * @return
	 */
	public static InfixSetOp infixSetOp(String op, SetExpr s1, SetExpr s2) {
		InfixSetOp r = new InfixSetOp(op, s1, s2);
		return r;
	}

	@Override
	public InfixSetOp clone() {
		InfixSetOp r = null;
		SetExpr e1p = e1 == null ? null : e1.clone();
		SetExpr e2p = e2 == null ? null : e2.clone();
		;
		String opp = op;
		r = new InfixSetOp(opp, e1p, e2p);
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
		InfixSetOp other = (InfixSetOp) obj;
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
		SetExpr e1p = this.applyTransformer2(t, e1);
		SetExpr e2p = this.applyTransformer2(t, e2);

		e1 = e1p;
		e2 = e2p;

	}

}
