/**
 * 
 */
package minizinc.representation.expressions.sets;

import java.util.ArrayList;
import java.util.List;

import minizinc.representation.expressions.Expr;

/**
 * Represents a MiniZinc set expression expressed as an infix operator.<br>
 * Grammar: setExpr infixSetOp setExpr <br>
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

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return e1.print() + " "+op+" "+e2.print();
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		List<Expr> l = new ArrayList<Expr>();
		l.add(e1);
		l.add(e2);
		return l;
	}

	
	/**
	 * Represents a MiniZinc set expression expressed as an infix operator.<br>
	 * Grammar: setExpr infixSetOp setExpr <br>
	 * @param op The operator
	 * @param s1 First operand
	 * @param s2 Second operand
	 * @return
	 */
	public static InfixSetOp infixSetOp(String op, SetExpr s1, SetExpr s2) {
		InfixSetOp r = new InfixSetOp(op,s1,s2);
		return r;
	}


}
