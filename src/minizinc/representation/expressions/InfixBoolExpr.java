/**
 * 
 */
package minizinc.representation.expressions;


import transformation.ExprTransformer;


/**
 * BoolComplexExprssion as a Infix boolean expression
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
	 * @param op operator
	 * @param e1 left operand
	 * @param e2 right operand
	 */
	public InfixBoolExpr(String op, BoolExpr e1, BoolExpr e2) {
		this.op = op;
		this.e1 = e1;
		this.e2 = e2;
	}


	@Override
	public String print() {
		// TODO Auto-generated method stub
		return e1.toString()+" "+op+" "+e2.toString();

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
	public static InfixBoolExpr infixBoolExpr(BoolExpr  t0, BoolExpr t1, String op) {
		return new InfixBoolExpr(op, t0, t1);
	}


	@Override
	public InfixBoolExpr clone() {
		InfixBoolExpr r = null;
		BoolExpr e1p = e1==null? null : e1.clone();
		BoolExpr e2p = e2==null ? null : e2.clone();
		String opp=op;
		r = new InfixBoolExpr(opp,e1p,e2p);	
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
		 BoolExpr e1p = this.applyTransformer(t, e1);
		 BoolExpr e2p = this.applyTransformer(t, e2) ;
		 
		 e1 = e1p;
		 e2 = e2p;

		
	}


}
