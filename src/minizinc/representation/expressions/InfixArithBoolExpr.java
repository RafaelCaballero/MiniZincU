/**
 * 
 */
package minizinc.representation.expressions;

import java.util.Arrays;
import java.util.List;

/**
 * A bool expression of the form e1 op e2, with e1 and e2 arithmetic expressions and op 
 * a relational operator (<,<=...).
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

	/* (non-Javadoc)
	 * @see minizinc.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return e1.print() + " "+op+" "+e2.print();
	}

	/* (non-Javadoc)
	 * @see minizinc.expressions.Expr#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		return Arrays.asList(e1,e2);
	}
	
	/**
	 * Arithmetic infix expression as a  bool expression
	 * 
	 * @param t0
	 *            First operand
	 * @param t1
	 *            Second operand
	 * @param op
	 *            Operator
	 * @return InfixArithComplexBoolExpr representation
	 */

	public static InfixArithBoolExpr infixArithBoolExpr(ArithExpr t0, ArithExpr t1, String op) {
		return new InfixArithBoolExpr(op, t0, t1);
	}

	

}
