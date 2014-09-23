/**
 * 
 */
package transformation;

import java.util.ArrayList;
import java.util.List;

import transformation.pattern.PatternMatching;
import minizinc.representation.expressions.And;
import minizinc.representation.expressions.BoolC;
import minizinc.representation.expressions.BoolVal;
import minizinc.representation.expressions.CaseExpr;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.Imply;
import minizinc.representation.expressions.InfixBoolExpr;
import minizinc.representation.expressions.PredOrUnionExpr;
import minizinc.representation.expressions.cases.Branch;
import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.decls.VarDecl;

/**
 * Transforms case expressions 
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
		Expr id = e.getId();
		boolean ok = true;
		
		// check if the case argument is a variable
		VarDecl vd = null;
		if (id!=null && id instanceof ID) {
			vd = m.getVarByName( (ID) id); 
		}
		
		List<Expr> le = new ArrayList<Expr>(lb.size());
		for (Branch b:lb) {
			Expr bt = transform(id, vd, b);
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
	 * @param id Case expression. Currently just an identifier corresponding to a variable declaration.
	 * @param v The variable declaration.
	 * @param b The case branch.
	 * @return Its transformation.
	 */
	private Expr transform(Expr id, VarDecl v, Branch b) {
		Expr r = null;
		Expr expr = b.getExpr();
		PredOrUnionExpr ped = b.getPattern();
		ID cte = b.getIdpattern();
		
		
		if (cte!=null) {
			// this is just transformed as the transformation of
			// 'id==cte -> expr'
			DataExprTransformer eqTr = new DataExprTransformer(m);
			// the expression id == cte is constructed and transformed
			BoolVal bv1 = new BoolVal(cte);
			BoolVal bv2 = new BoolVal((ID)id);
			InfixBoolExpr iexpr = new InfixBoolExpr("=",bv1,bv2);
			Expr cond = eqTr.transform(iexpr);
			r = createImplication(cond,expr);						
		} else {
			// ped is a pattern 
			PatternMatching pm = new PatternMatching(m,v,ped);
			if (pm.fail())
				r = new BoolC(true);
			else {
				Substitution s = pm.getSubstitution();
				Expr exprSubs = expr.applyTransformer(s, expr);
				Expr cond = pm.getMatchingExpression();
				r = new Imply(cond,exprSubs);
				
			}
				
		}
		
		
		
		return r;
	}
	
	
	/**
	 * Creates a -> b.
	 * @param a The if expression.
	 * @param b The then expression.
	 */
	private Imply createImplication(Expr a, Expr b) {
		Imply  r = new Imply(a,b);
		return r;
	}
}
