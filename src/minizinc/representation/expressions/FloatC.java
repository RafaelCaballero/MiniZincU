/**
 * 
 */
package minizinc.representation.expressions;

import java.util.List;

import minizinc.representation.TypeName;
import minizinc.representation.expressions.lists.ListExpr;

/**
 * Representation of a MiniZinc float constant
 * @author rafa
 *
 */
public class FloatC extends Expr {
	protected double value;
	/**
	 * Constructs the representation of a MiniZinc String constant.
	 */
	public FloatC(double value) {
		this.value = value;
	}
	public double get() {
		return value;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return value+"";
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		return null;
	}
	@Override
	public TypeName type() {
		// TODO Auto-generated method stub
		return TypeName.FLOAT;
	}

	
}