/**
 * 
 */
package transformation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import minizinc.representation.Parsing;
import minizinc.representation.DataDef.DataCons;
import minizinc.representation.DataDef.DataConsData;
import minizinc.representation.expressions.And;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.InfixExpr;
import minizinc.representation.expressions.IntC;
import minizinc.representation.expressions.PredOrUnionExpr;
import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.DataDef;
import minizinc.representation.statement.decls.VarDecl;
import minizinc.representation.types.Type;
import minizinc.representation.types.TypeID;
import minizinc.representation.types.TypeUnion;

/**
 * Transforms equalities involving data variables or data terms. 
 * @author rafa
 *
 */
public class DataEqualTransformer {
	protected SplitModel m;


	/**
	 * 
	 */
	public DataEqualTransformer(SplitModel m) {
		this.m = m;
	}
	
	/**
	 * v1 = v2.
	 * @param dataExprTransformer 
	 * @param v1
	 * @param v2
	 * @return The translation of this expression.
	 */
	public Expr trEqual(DataExprTransformer dataExprTransformer, VarDecl v1, VarDecl v2) {
		Expr r=null;
		TypeUnion t1 = null;
		TypeUnion t2 = null;
		if (v1.getDeclType() instanceof TypeUnion) 
			t1 = (TypeUnion) v1.getDeclType();
		if (v2.getDeclType() instanceof TypeUnion) 
			t2 = (TypeUnion) v2.getDeclType();

		if (t1!=null && t2!=null && t1.getId().equals(t2.getId())) {	
			List<VarDecl> lv1 = getVars(v1);
			List<VarDecl> lv2 = getVars(v2);
			HashMap<String, VarDecl> hm1=getHash(lv1);
			HashMap<String, VarDecl> hm2=getHash(lv2);
		
			List<Expr> eqs = new ArrayList<Expr>();
			HashMap<String, VarDecl> map;
		


			for (Map.Entry<String, VarDecl> entry : hm1.entrySet()) {
				String s = entry.getKey();
				VarDecl vd1 = entry.getValue();
				VarDecl vd2 = hm2.get(s);
				if (vd2 != null) {
					InfixExpr i = new InfixExpr("==", vd1.getID(), vd2.getID() );
					eqs.add(i);
				}
			}
		
			if (!(eqs==null || eqs.size()==0))
				// finally, the conjunction of all the equalities is the solution
				r = new InfixExpr("/\\",eqs);
		}
		return r;
	}

	private String getPath(VarDecl v) {
		String r=null;
		if (v!=null) {
			String s = v.getID().print();
			int ini = s.indexOf("_");
			if (ini!=-1) 				
					r = s.substring(ini+1);
			else 
				r = "";
		}
		return r;
	}
	
	private HashMap<String, VarDecl> getHash(List<VarDecl> l) {	
			HashMap<String, VarDecl> r = new HashMap<String, VarDecl>();
			String s;
			for (VarDecl v:l) {
				s = getPath(v);
				if (s!=null)
				   r.put(s, v);
			}
				
			return r;
	
	}
	/**
	 * List of variables associated to the transformation of a union variable.
	 * If it is not a union variable it returns the empty list.
	 * @param x The variable.
	 * @return List of associated variable.
	 */
	public List<VarDecl> getVars(VarDecl v) {
		List<VarDecl> r = new ArrayList<VarDecl>();
		getVars(r,v);
		return r;
	}
	
	public void getVars(List<VarDecl> r, VarDecl v) {				
		 r.add(v);		 
		if (v!=null && v.getDeclType() instanceof TypeUnion) {
				// get the data and call to sVar
				TypeUnion t = (TypeUnion) v.getDeclType();
				String typename = t.getId().print();

				DataDef d = m.getDataByName(typename);
				if (d == null)
					Parsing.error("Unexpected union type name " + typename);
				else {
					int level = v.getLevel();
					sVar(r,v,d,level);
				}
		} 
	}

	private void sVar(List<VarDecl> r, VarDecl v, DataDef d, int level) {
		int n = d.getCons().size();
		for (int i=0; i<n; i++)
		   sVari(r, d, v, level, i, n);
	

	}

	private void sVari(List<VarDecl> r, DataDef d, VarDecl v, int l, int i, int n) {
		DataCons c = d.getCons().get(i);
		int ms = c.getSubtypes()==null ? 0 : c.getSubtypes().size();
		 
		if (!(l == 0 && ms > 0)) {
			// each parameter of constructor i has its own variable
			for (int j = 0; j < ms; j++) {
				// get the type of the j-th argument
				Type tipi = c.getSubtypes().get(j);
				
				// name of the variable that corresponds to argument j of constructor at position i
				String name = TransVar.newVarName(v.getID().print(), i + 1, j + 1);
				
				// associated variable
				VarDecl newVar =  new VarDecl(tipi,name);

				
				if (tipi instanceof TypeID) {
					TypeID tid = (TypeID) tipi;
					// is this type a data type?
					DataDef def = m.getDataByName(tid.getId().print());
					if (def!=null) {
	                    // a recursive type
						TypeUnion tu = new TypeUnion(tid.getId(),l-1);
						// the type must include the leel, therefore we generate again the declaration
						newVar = new VarDecl(tu,name);
					}
				}
				// in any case transform the variable
				getVars(r,newVar);
			}
		}
	} // end method

	/** 
	* v = c, with v a data variable, c a constructor.
	 * @param dataExprTransformer 
	* @return Transformation of this equality, null if the data are not compatible.
	*/
	public Expr trEqual(DataExprTransformer dataExprTransformer, VarDecl v1, DataConsData d2) {
		Expr r=null;
		TypeUnion t1 = null;
		
		String s2 = d2.getDef().getDataName();
		if (v1.getDeclType() instanceof TypeUnion) 
			t1 = (TypeUnion) v1.getDeclType();
		
		// the same type
		if (t1!=null && s2!=null && t1.getId().print().equals(s2)) {
			r = varEqualCons(v1,d2);
		}

         
		return r;
	}

	private Expr varEqualCons(VarDecl v1, DataConsData d2) {
		return new InfixExpr("=", v1.getID(), new IntC(d2.getPosition()) );
	}
	/** 
	* v = c(t1....tn), with v a data variable, c a constructor.
	* @return Transformation of this equality, null if the data are not compatible.
	*/
	public Expr trEqual(DataExprTransformer tr, VarDecl v1, PredOrUnionExpr ped2) {
		Expr r=null;
		TypeUnion t1 = null;
		if (v1.getDeclType() instanceof TypeUnion) { 
			t1 = (TypeUnion) v1.getDeclType();
			List<VarDecl> lv1 = getVars(v1);
			DataDef d = m.getDataByName(t1.getId().print());
			if (d!=null) {
				// constructor data
			   DataConsData da = d.getDataByConsName(ped2.getId().print());
			   if (da!=null) {
				   Expr r1 = varEqualCons(v1,da);
				   List<Expr> andList = new ArrayList<Expr>();
				   if (r1!=null)
				      andList.add(r1);
				   // now get all the variables that are first level descendants
				   // of v1 when it takes the value of the constructor in da
				   String prefix = v1.getID().print()+"_"+da.getPosition()+"_";
				   boolean letsgo = true; // becomes false is some argument cannot be transformed
				   for (VarDecl aux:lv1) {
					   String s = aux.getID().print(); 
					   if (s.startsWith(prefix) && !s.substring(prefix.length()).contains("_")) {
						   // a first level child found
						   String order = s.substring(prefix.length());
						   int norder = Integer.parseInt(order);
						   // the variable indexes start at 1, but Java lists at 0!
						   Expr enorder= ped2.getArgs().get(norder-1);
						   Expr rnorder = tr.transformEqual("=", aux, enorder);
						   if (rnorder != null)
						      andList.add(rnorder);
						   else 
							   letsgo = false;
					   }
					   
				   }
				   
				   // every ok? then create the result.
				   if (letsgo && andList!=null) 
					   if (andList.size()==1)
						   r = andList.get(0);
					   else 
						   r = new And(andList);
			   }
			}
		}	
		return r;
	}

	public Expr trEqual(DataExprTransformer dataExprTransformer,DataConsData d1, DataConsData d2) {
		Expr r=null;
		String s1 = d1.getDef().getDataName();
		String s2 = d2.getDef().getDataName();
		if (s1.equals(s2)) 
			r = new InfixExpr("=",new IntC(d1.getPosition()), new IntC(d2.getPosition()));
		
		return r;
	}

	public Expr trEqual(DataExprTransformer tr, PredOrUnionExpr ped1,
			PredOrUnionExpr ped2) {
		// TODO Auto-generated method stub
		return null;
	}
}
