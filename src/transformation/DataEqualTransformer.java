/**
 * 
 */
package transformation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import minizinc.representation.Parsing;
import minizinc.representation.DataDef.DataCons;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.InfixExpr;
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
	
	public Expr equalVars(VarDecl v1, VarDecl v2) {
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
}
