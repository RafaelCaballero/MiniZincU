/**
 * 
 */
package minizinc.representation.expressions;

import java.util.ArrayList;
import java.util.List;

import minizinc.representation.TypeName;

/**
 * Grammar:
 * minusExpr      :  '-'  arithExpr ;
 *
 * @author rafa
 *
 */
public class MinusArithExpr extends ArithExpr {
	private Expr expr;
	/**
	 * Constructor
	 */
	public MinusArithExpr(Expr expr) {
		this.expr = expr;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return "-" + expr.print();

	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		List<Expr> l = new ArrayList<Expr>();
		l.add(expr);
		return l;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		return expr.type();
	}

}
