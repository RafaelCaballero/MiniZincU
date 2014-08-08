/**
 * 
 */
package minizinc.representation.expressions;

import java.util.List;

import minizinc.representation.TypeName;
import minizinc.representation.expressions.lists.ListExpr;

/**
 * Representation of a MiniZinc integer constant
 * @author rafa
 *
 */
public class IntC extends Expr {
	protected int value;
	/**
	 * Constructs the representation of a MiniZinc String constant.
	 */
	public IntC(int value) {
		this.value = value;
	}
	public int get() {
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
		return TypeName.INT;
	}

	
}
