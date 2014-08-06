/**
 * 
 */
package minizinc.representation.expressions;

import java.util.Arrays;
import java.util.List;

import minizinc.representation.TypeName;

/**
 * A round bracket expression
 * 
 * @author rafa
 *
 */
public class RbracketExpr extends Expr {
	private Expr e;
	/**
	 * @param source The expression found between round brackets
	 */
	public RbracketExpr(Expr source) {
		e = source;

	}


	@Override
	public String print() {
		return "("+e.print()+")";
	}

	@Override
	public List<Expr> subexpressions() {
		return Arrays.asList(e);
	}


	@Override
	public TypeName type() {
		return e.type();
	}


}
