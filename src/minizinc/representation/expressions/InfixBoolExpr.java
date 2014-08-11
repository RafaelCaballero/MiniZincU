/**
 * 
 */
package minizinc.representation.expressions;

import java.util.Arrays;
import java.util.List;


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
	 * Constructor for infix boolean expressio e1 op e2
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

	@Override
	public List<Expr> subexpressions() {
		return Arrays.asList(e1,e2);
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


}
