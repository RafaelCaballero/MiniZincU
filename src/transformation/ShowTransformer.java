/**
 * 
 */
package transformation;

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
 * Eliminate data definitions.
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
						transShow(v);											}
				}
			}
		}
		return r;
	}
	
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

		}
		return r;
	}

	private Expr sVar(VarDecl v, DataDef d, int l)  {
		Expr t = null;

			int n = d.getCons().size();
			t = sVari(d, v, l, 0, n);

		return t;
	}

	private Expr sVari(DataDef d, VarDecl v, int l, int i, int n)  {
		Expr t = null;
		DataCons c = d.getCons().get(i);
		int ms = c.getSubtypes()==null ? 0 : c.getSubtypes().size();
		Expr sThen;

		if (l == 0 && ms > 0) {
			if (i < n - 1)
				t = sVari(d, v, l, i + 1, n);
		} else {
			// obtaining sThen
			sThen = new StringC(c.getCons());
				if (ms != 0) {
					InfixExpr sAux = null;
					sThen = new InfixExpr("++", sThen, new StringC("("));
					for (int j = 0; j < ms; j++) {
						
						Type tipi = c.getSubtypes().get(j);
						String name = TransVar.newVarName(v.getID().print(), i + 1, j + 1);
						
						// associated variable
						VarDecl newVar;
						if (tipi instanceof TypeID) {
							TypeID tid = (TypeID) tipi;
							// is this type a data type?
							DataDef def = m.getDataByName(tid.getId().print());
							if (def==null) {
								// it is not a data name
								newVar = new VarDecl(tipi,name);
							} else { // a recursive type 
								TypeUnion tu = new TypeUnion(tid.getId(),l);
								newVar = new VarDecl(tu,name);
							}

						Expr term = transShow(newVar);
						if (term != null) {

							sAux = new InfixExpr("++", sThen, new InfixExpr("++",
									new StringC(" "), term));
							if (j < ms - 1)
								sThen = new InfixExpr("++", sAux, new StringC(","));
							else
								sThen = sAux;
						}
					}
					sThen = new InfixExpr("++", sThen, new StringC(")"));

				}
			} // end obtaining sThen

			// if condition
			// first fix(v)
			PredOrUnionExpr fix = new PredOrUnionExpr(new ID("fix"),
					                                  Arrays.asList(v.getID()));
			IntC ti = new IntC(i + 1);
			InfixExpr cond = new InfixExpr("=", fix, ti);

			if (i == n - 1) {
				t = new IfS(cond, sThen, new StringC(""));
			} else {
				Expr ts = sVari(d, v, l, i + 1, n);
				if (ts == null)
					t = new IfS(cond, sThen, new StringC(""));
				else
					t = new IfS(cond, sThen, ts);
			}
		}
		return t;

	}

	
}
