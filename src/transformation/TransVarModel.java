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
 * @author rafa
 *
 */
public class TransVarModel extends SplitModel implements Cloneable{
	protected List<TransVar> l;
	
	 /**
	  * complete constructor
	  */
	 public TransVarModel(SplitModel sp, List<TransVar> l ) {
		 super(sp.getData(),sp.getConstraint(),sp.getDecl(),sp.getExtended(),
				 sp.getFunction(),sp.getInclude(),sp.getInit(),sp.getOutput(),
				 sp.getPredicate(),sp.getSolve());
		 this.l = l;		 
	 }

	 public TransVarModel(SplitModel sp ) {
		 super(sp.getData(),sp.getConstraint(),sp.getDecl(),sp.getExtended(),
				 sp.getFunction(),sp.getInclude(),sp.getInit(),sp.getOutput(),
				 sp.getPredicate(),sp.getSolve());
		 l = new ArrayList<TransVar>();
		 transvar();
	 }
	 
	 
	 /**
	 * Variable declarations of union types are transformed.
	 */
	private void transvar() {
		
		// observe that the index is increased manually because the current element can be removed
		 for (int i=0; i< decl.size(); ) {
			 // at the moment only var declarations are considered
			 Decl x = decl.get(i);
			 if (x instanceof VarDecl && ((VarDecl)x).getDeclType() instanceof TypeUnion) {
				 VarDecl v = (VarDecl) x;
				 TransVar tv = new TransVar(v,this);
				 if (tv.getCtr().equals(new Constraint(new BoolC(true)))){
					 i++;
				 } else
				 {
					 decl.remove(i);
					 for (VarDecl nv:tv.getVar()) 
						 decl.add(nv);
					 // now the constraints
					 constraint.add(tv.getCtr());
					 // the initialization constraint is optional, check if exists
					 if (tv.getInit()!=null)
						 constraint.add(tv.getCtr());
						 
					 l.add(tv);
				 }
				 
			 } else // check the next declaration
				 i++;
		 }
	 }

	 public TransVarModel clone() {
		 TransVarModel r = null;
		 SplitModel sp = super.clone();
		 List<TransVar> lp=null;
		 if (l!=null) {
			 lp = new ArrayList<TransVar>();
			 for (TransVar x:l)
				 lp.add(x.clone());
		 }
		 r = new TransVarModel(sp,lp);
		 return r;
	 }

}
