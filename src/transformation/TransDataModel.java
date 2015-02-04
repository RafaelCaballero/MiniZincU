/**
 * 
 */
package transformation;

import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.Comment;

/**
 * Transformer that eliminates the data statements
 * 
 * @author rafa
 *
 */
public class TransDataModel extends SplitModel {

	/**
	 * complete constructor
	 */

	public TransDataModel(SplitModel sp) {
		super(sp.getComment(), sp.getData(), sp.getConstraint(), sp.getDecl(),
				sp.getExtended(), sp.getFunction(), sp.getInclude(), sp
						.getInit(), sp.getOutput(), sp.getPredicate(), sp
						.getSolve());
		transformData();
	}

	private void transformData() {
		if (data != null && data.size() > 0) {
			this.add(new Comment("Data definitions: "));
			for (int i = 0; i < data.size(); i++)
				this.add(new Comment(data.get(i).print()));
			this.add(new Comment("------------------ "));
			data.clear();
		}
	}

}
