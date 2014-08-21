/**
 * 
 */
package transformation;

import minizinc.representation.expressions.*;

/**
 * A model transformer is a model that includes a model transformation.
 * In fact the model does not transform itself but generates its transformation.
 * @author rafa
 *
 */
public interface ExprTransformer  {
	

	/**
	 * The transformation. Transforms the 
	 * The previous value of the output model, if exists, is lost.
	 * The input model is not modified.
	 */
	public <T extends Expr> T transform(T e);

}
