/**
 * 
 */
package minizinc.representation.expressions;

import java.util.Arrays;
import java.util.List;

import terms.Term;

/**
 * BoolComplexExprssion as a Infix boolean expression
 * @author rafa
 *
 */
public class InfixComplexBoolExpr extends BoolComplexExpr {
	
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
	public InfixComplexBoolExpr(String op, BoolExpr e1, BoolExpr e2) {
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

}
