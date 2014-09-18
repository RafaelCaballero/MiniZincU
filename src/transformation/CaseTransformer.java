/**
 * 
 */
package transformation;

import java.util.ArrayList;
import java.util.List;

import minizinc.representation.expressions.And;
import minizinc.representation.expressions.CaseExpr;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.PredOrUnionExpr;
import minizinc.representation.expressions.cases.Branch;
import minizinc.representation.model.SplitModel;

/**
 * Transforms equalities involving data variables or data terms. 
 * @author rafa
 *
 */
public class CaseTransformer {
	protected SplitModel m;
	protected CaseExpr e;


	/**
	 * 
	 */
	public CaseTransformer(SplitModel m, CaseExpr e) {
		this.m = m;
		this.e = e;
	}
	
	/**
	 * 
	 * @return The transformation of the case expression
	 */
	public Expr transform() {
		Expr r=null;
		List<Branch> lb = e.getBranches();
		ID id = e.getId();
		boolean ok = true;
		
		List<Expr> le = new ArrayList<Expr>(lb.size());
		for (Branch b:lb) {
			Expr bt = transform(id, b);
			if (bt!=null)
			   le.add(bt);
			else ok = false;
		}
		
		if (ok)
			r = new And(le);
		return r;
	}

	/**
	 * Transforms a case branch.
	 * @param id Case expression. Currently just an identifier.
	 * @param b The case branch.
	 * @return Its transformation.
	 */
	private Expr transform(ID id, Branch b) {
		Expr r = null;
		Expr expr = b.getExpr();
		PredOrUnionExpr ped = b.getPattern();
		ID cte = b.getIdpattern();
		
		if (cte!=null) {
			// this is just transformed as the transformation of
			// 'id==cte -> expr'
			
		} else {
			
		}
		
		
		
		return r;
	}
}
