/**
 * 
 */
package transformation;

import minizinc.representation.model.SplitModel;

/**
 * @author rafa
 *
 */
public class TransShowModel extends SplitModel {

	/**
	 * complete constructor
	 */

	public TransShowModel(SplitModel sp) {
		super(sp.getData(), sp.getConstraint(), sp.getDecl(), sp.getExtended(),
				sp.getFunction(), sp.getInclude(), sp.getInit(),
				sp.getOutput(), sp.getPredicate(), sp.getSolve());
		transformShow();
	}

	private void transformShow() {
		ShowTransformer st = new ShowTransformer(this);
		for (int i = 0; i < output.size(); i++) {

			output.get(i).subexpressions(st);

		} // for
	}

}
