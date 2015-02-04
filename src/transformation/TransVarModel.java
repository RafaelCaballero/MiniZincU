/**
 * 
 */
package transformation;

import java.util.ArrayList;
import java.util.List;

import minizinc.representation.expressions.BoolC;
import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.Constraint;
import minizinc.representation.statement.Decl;
import minizinc.representation.statement.decls.VarDecl;
import minizinc.representation.types.TypeUnion;

/**
 * A model which already has removed the data definition variables
 * 
 * @author rafa
 *
 */
public class TransVarModel extends SplitModel {
	protected List<TransVar> l;

	/**
	 * complete constructor
	 */
	public TransVarModel(SplitModel sp, List<TransVar> l) {
		super(sp.getComment(), sp.getData(), sp.getConstraint(), sp.getDecl(),
				sp.getExtended(), sp.getFunction(), sp.getInclude(), sp
						.getInit(), sp.getOutput(), sp.getPredicate(), sp
						.getSolve());
		this.l = l;
	}

	public TransVarModel(SplitModel sp) {
		super(sp.getComment(), sp.getData(), sp.getConstraint(), sp.getDecl(),
				sp.getExtended(), sp.getFunction(), sp.getInclude(), sp
						.getInit(), sp.getOutput(), sp.getPredicate(), sp
						.getSolve());
		l = new ArrayList<TransVar>();
		transvar();
	}

	/**
	 * Variable declarations of union types are transformed.
	 */
	private void transvar() {

		// observe that the index is increased manually because the current
		// element can be removed
		for (int i = 0; i < decl.size();) {
			// at the moment only var declarations are considered
			Decl x = decl.get(i);
			if (x instanceof VarDecl
					&& ((VarDecl) x).getDeclType() instanceof TypeUnion) {
				VarDecl v = (VarDecl) x;
				TransVar tv = new TransVar(v, this);
				if (tv.getCtr().equals(new Constraint(new BoolC(true)))) {
					i++;
				} else {
					comment.add(tv.c);
					decl.remove(i);
					decl.addAll(tv.getVar());
					decl.addAll(tv.getVarb());
					constraint.addAll(tv.getCtr());
					// the boolean variable that represents all the constraints
					// is the last constraint that remains to be added
					if (tv.getVarb() != null && tv.getVarb().size() > 0) {
						Constraint c = new Constraint(tv.getVarb().get(0)
								.getID());
						constraint.add(c);
					}

					l.add(tv);

				}

			} else
				// check the next declaration
				i++;
		}
	}

}
