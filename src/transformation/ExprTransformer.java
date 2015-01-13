/**
 * 
 */
package transformation;

import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.RbracketExpr;

/**
 * A model transformer is a model that includes a model transformation.
 * 
 * @author rafa
 *
 */
public interface ExprTransformer {

	/**
	 * The transformation. Transforms the The previous value of the output
	 * model, if exists, is lost. The input model is not modified.
	 */
	public Expr transform(Expr input);

	public default Expr withoutBrackets(Expr input) {
		Expr r = input;

		while (r instanceof RbracketExpr) {
			r = ((RbracketExpr) r).getExprInside();
		}
		return r;
	}

}
