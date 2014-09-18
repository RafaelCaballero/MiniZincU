/**
 * 
 */
package transformation;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import minizinc.representation.Parsing;
import minizinc.representation.SubExpressions;
import minizinc.representation.expressions.ID;
import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.DataDef;
import minizinc.representation.statement.Decl;
import minizinc.representation.statement.Function;
import minizinc.representation.statement.Predicate;
import minizinc.representation.statement.QualName;
import minizinc.representation.types.Type;
import minizinc.representation.types.TypeID;
import minizinc.representation.types.TypeUnion;


/**
 * Transformer that eliminates the data statements
 * @author rafa
 *
 */
public class TransRecursiveModel extends SplitModel {
	protected List<Integer> recpred;
	protected List<Integer> recfunc;
	protected HashMap<String, List<Integer>> unionpred;
	protected HashMap<String, List<Integer>> unionfunc;


	 /**
	  * complete constructor
	  */

	 public TransRecursiveModel(SplitModel sp ) {
		 super(sp.getData(),sp.getConstraint(),sp.getDecl(),sp.getExtended(),
				 sp.getFunction(),sp.getInclude(),sp.getInit(),sp.getOutput(),
				 sp.getPredicate(),sp.getSolve());
		 recpred = new ArrayList<Integer>();
		 recfunc = new ArrayList<Integer>();
		 
		 
		 unionpred = new HashMap<String, List<Integer>>();
		 unionfunc = new HashMap<String, List<Integer> >();
		 transformRecursive();
	 }
	 
	 

	
	private void transformRecursive() {
		
		
		// first get a list of recursive predicates and predicates with union parameters

		Predicate p;
		if (predicate != null && predicate.size()>0)
			for (int i =0; i<predicate.size(); i++){
				p = predicate.get(i);
				checkrecursivity(recpred, unionpred, p,  p.getName(),null,i, p.getDecls());
			}
		
		Function f;
		if (function != null && function.size()>0 )
			for (int i=0; i<function.size();i++) {
				f = function.get(i);
				checkrecursivity(recfunc, unionfunc, f, null,f.getName(),i, f.getDecls());
					}
		
		// now unfold the calls to this predicates/functions.
		

		RecTransformer det = new RecTransformer(this,recpred,unionpred,recfunc,unionfunc);
		applyTransformer(det,constraint);
		applyTransformer(det,decl);
		/*
		applyTransformer(det,function);
		applyTransformer(det,predicate);
		*/
		applyTransformer(det,init);
		applyTransformer(det,output);
		applyTransformer(det,solve);
				
	}
	
	private void checkrecursivity(List<Integer>rec, HashMap<String, List<Integer>> lunion, SubExpressions expr, ID id, 
			QualName qn, int i, List<Decl> ld) {
		RecGetter rg = id!=null ?  new RecGetter(id) :  new RecGetter(qn);
		expr.subexpressions(rg);
		if (rg.isRec){
			rec.add(i);
			//System.out.println("Recursive function "+f.getName());
		}
		List<Integer> li = getUnionDecls(ld);
		if (li!=null) {
			// the first element is the position of the function in the list of functions
			li.add(0,i);
			lunion.put(id !=null ? id.print() : qn.print(), li);
		
		}


	}
	private List<Integer> getUnionDecls(List<Decl> ld) {
		
		List<Integer> r = null;
		Decl d;
		for (int i=0; i< ld.size(); i++) {
			d = ld.get(i);
			Type tdecl = d.getDeclType();
			if (d!=null && tdecl instanceof TypeUnion) {
				// get the data and call to sVar
				TypeUnion t = (TypeUnion) d.getDeclType();
				String typename = t.getId().print();

				DataDef dd = this.getDataByName(typename);
				if (dd == null)
					Parsing.error("Unexpected union type name in predicate/function declaration" + typename);
				else {
					if (r==null)
					   r = new ArrayList<Integer>();
					r.add(i);
				}
			} else if (d!=null && tdecl instanceof TypeID) {
				// get the data and call to sVar
				TypeID t = (TypeID) d.getDeclType();
				String typename = t.getId().print();

				DataDef dd = this.getDataByName(typename);
				if (dd != null) {
					if (r==null)
					   r = new ArrayList<Integer>();
					r.add(i);
				}
			}
		} // for
			
		return r;
		
	}
}
