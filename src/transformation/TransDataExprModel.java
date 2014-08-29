/**
 * 
 */
package transformation;


import minizinc.representation.model.SplitModel;


/**
 * Transformer that eliminates the data statements
 * @author rafa
 *
 */
public class TransDataExprModel extends SplitModel {



	 /**
	  * complete constructor
	  */

	 public TransDataExprModel(SplitModel sp ) {
		 super(sp.getData(),sp.getConstraint(),sp.getDecl(),sp.getExtended(),
				 sp.getFunction(),sp.getInclude(),sp.getInit(),sp.getOutput(),
				 sp.getPredicate(),sp.getSolve());
		 transformExpr();
	 }
	 
	 

	
	private void transformExpr() {
		DataExprTransformer det = new DataExprTransformer(this);
		applyTransformer(det,constraint);
		applyTransformer(det,decl);
		applyTransformer(det,function);
		applyTransformer(det,predicate);
		applyTransformer(det,init);
		applyTransformer(det,output);
		applyTransformer(det,solve);
		
		
	}
	

	


}
