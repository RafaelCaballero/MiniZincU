/**
 * 
 */
package transformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import minizinc.representation.Parsing;
import minizinc.representation.DataDef.DataCons;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.IfS;
import minizinc.representation.expressions.InfixExpr;
import minizinc.representation.expressions.IntC;
import minizinc.representation.expressions.PredOrUnionExpr;
import minizinc.representation.expressions.StringC;
import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.DataDef;
import minizinc.representation.statement.decls.VarDecl;
import minizinc.representation.types.Type;
import minizinc.representation.types.TypeID;
import minizinc.representation.types.TypeUnion;


/**
 * Transforms show of data variables
 * @author rafa
 *
 */
public class ShowTransformer implements ExprTransformer {
	protected SplitModel m;

	public ShowTransformer(SplitModel m) {
		this.m = m;
	}

	@Override
	public Expr transform(Expr e) {
		Expr r = null;
		// show appears as a "predicateorunion" element
		if (e instanceof PredOrUnionExpr) {
			PredOrUnionExpr po = (PredOrUnionExpr) e;
			if (po.getId().print().toLowerCase().equals("show")) {
				// show must have only one argument, which must be a variable name
				List<Expr> la = po.getArgs();
				if (la!=null && la.size()==1) {
					if (la.get(0) instanceof ID) {
						ID id = (ID) la.get(0);
						// get the variable declaration and check if it is a data
						VarDecl v = m.getVarByName(id);
						r = transShow(v);		
					}
				}
			}
		}
		return r;
	}
	
	
	/**
	 * Transforms show(v) with v a variable
	 * @param v The variable
	 * @param e The whole expression show(v)
	 * @return The transformed expression.
	 */
	private Expr transShow(VarDecl v) {
		Expr r=null;
		if (v!=null && v.getDeclType() instanceof TypeUnion) {
			// get the data and call to sVar
			TypeUnion t = (TypeUnion) v.getDeclType();
			String typename = t.getId().print();

			DataDef d = m.getDataByName(typename);
			if (d == null)
				Parsing.error("Unexpected union type name " + typename);
			else {
				int level = v.getLevel();
				r = sVar(v,d,level);
			}
		} else
			r = new PredOrUnionExpr("show",Arrays.asList(v.getID()));
		return r;
	}

	

	

		private IfS  sVar(VarDecl v, DataDef d, int l)  {
		IfS t = null;

		int n = d.getCons().size();
		t = sVari(d, v, l, 0, n);

		return t;
	}

		private IfS  sVari(DataDef d, VarDecl v, int l, int i, int n)  {
			IfS t = null;	
			DataCons c = d.getCons().get(i);
			int ms = c.getSubtypes()==null ? 0 : c.getSubtypes().size();
			 
			if (l == 0 && ms > 0) {
				if (i < n - 1)
					t = sVari(d, v, l, i + 1, n);
			} else {
				// obtaining sThen
				Expr sThen = then(v,l, i,ms,c);

				// if condition
				// first fix(v)
				PredOrUnionExpr fix = new PredOrUnionExpr(new ID("fix"),
						                                  Arrays.asList(v.getID()));
				IntC ti = new IntC(i + 1);
				InfixExpr cond = new InfixExpr("=", fix, ti);

				if (i == n - 1) {
					t = new IfS(cond, sThen, new StringC("\"\""));
				} else {
					Expr ts = sVari(d, v, l, i + 1, n);
					if (ts == null)
						t = new IfS(cond, sThen, new StringC("\"\""));
					else
						t = new IfS(cond, sThen, ts);
				}
			}
			
			return t;
		}

	
	/**
	 * Shows are transformed into sentences of the form
	 * {@code if (fix(x)==i) then sThen else sElse}, one for each constructor {@code ci}.
	 * This method constructor the sThen sentence for the constructor ci
	 * @param v  The variable we are transforming
	 * @param l the level of the declaration
	 * @param i The position of the constructor we are transforming (following textual order in the data definition) 
	 * @param ms The arity of the constructor ci
	 * @param ci The constructor for which we are building a then sentence
	 * @return An expression that corresponds to the then sentence of this constructor 
	 */
	private Expr then(VarDecl v, int l, int i, int ms, DataCons c) {
		Expr r = null;
		StringC cis = new StringC("\""+c.getCons()+"\"");
		if (ms==0)
			r = cis;
		else {
			// cis++”(” ++
			//sVar (t i 1 , x i1 , l − 1, 1) ++”, ” ++ . . . ++
			// sVar (t im i , x im i , l − 1, 1) ++”)”
			
			// the result is a list of concatenated expressions
			List<Expr> li = new ArrayList<Expr>();
			
			// first element cis
			li.add(cis);
			// second element "'('"
			li.add(new StringC("\"(\""));

			// now the args
			addArgs(li,v,l,i,ms,c);
			
			// last element "')'"
			li.add(new StringC("\")\""));

			// build result 
			r = new InfixExpr("++",li);
		}
		
		return r;
	}
	
	/**
	 * Adds the elements sVar (t i 1 , x i1 , l − 1, 1) to the list of expressions l
	 * @param li The list were the elements are added. Already initialized.
	 * @param v The variable we are transforming
	 * @param l The level of the declaration
	 * @param i The index of the constructor in the datatype.
	 * @param ms Number of arguments in the constructor
	 * @param c The constructor
	 */
	private void addArgs(List<Expr> li, VarDecl v, int l, int i, int ms, DataCons c) {
		
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
					
					// ?? should not be l-1
					TypeUnion tu = new TypeUnion(tid.getId(),l-1);
					// the type must include the leel, therefore we generate again the declaration
					newVar = new VarDecl(tu,name);
				}
			}
			// in any case transform the variable
			Expr term = transShow(newVar);
			if (term != null) { 
			   	li.add(term);
			   	// the comma separator
			    if (j!=ms-1)
			    	li.add(new StringC("\", \""));
			}
			
		} // end for
		
	} // end method

	
}
