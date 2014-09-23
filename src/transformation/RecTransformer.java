/**
 * 
 */
package transformation;


import java.util.HashMap;
import java.util.List;

import minizinc.representation.Parsing;
import minizinc.representation.expressions.CaseExpr;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.PredOrUnionExpr;
import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.Decl;
import minizinc.representation.statement.Function;
import minizinc.representation.statement.Predicate;

/**
 * A model transformer is a model that includes a model transformation.
 * @author rafa
 *
 */
public class  RecTransformer implements ExprTransformer {
	protected SplitModel m;
	protected List<Integer> recpred;
	protected List<Integer> recfunc;
	protected HashMap<String, List<Integer>> unionpred;
	protected HashMap<String, List<Integer>> unionfunc;


	public RecTransformer(SplitModel m, List<Integer> recpred, HashMap<String, List<Integer>> unionpred,
			                            List<Integer> recfunc,HashMap<String, List<Integer>> unionfunc) {
		this.m = m;
		this.recpred = recpred;
		this.unionpred = unionpred;
		this.recfunc = recfunc;
		this.unionfunc = unionfunc;
	}


	/**
	 * If the expression is an application, it returns the body of the predicate with the arguments substituted by
	 * the call values. 
	 * The body of the predicate is cloned, so it can be used again.
	 * 
	 */
	public  Expr transform(Expr input) {
		Expr r = null;
		
	
		// applications occur as PredOrUnion objects
		if (input !=null && input instanceof PredOrUnionExpr) {
			boolean isRecPred = false; // becomes true if the expression is the call to a predicate with union args.
			boolean isRecFunc = false; // becomes true if the expression is the call to a function with union args.
			PredOrUnionExpr apply = (PredOrUnionExpr)input;
			String name = apply.getId().print();
			List<Integer> li =  null;
			// if there are union predicates look for it
			if (unionpred!=null)  {
				li = unionpred.get(name);
				if (li!=null) 
					isRecPred = true;
			}
			// can it be a call to a function with a union argument?
			if (!isRecPred && unionfunc != null) {
				li = unionfunc.get(name);
			    if (li!=null)
			    	isRecFunc = true;
			}
			
			if (li!=null) {

				List<Decl> ldecl;
				if (isRecPred) {
					// get the predicate definition
					Predicate p = m.getPredicate().get(li.get(0));
					// we work with a copy of the body...yes, I am afraid I am using clone
					r = p.getBody().clone();
					ldecl = p.getDecls();
				} else  {
					// get the predicate definition
					Function f = m.getFunction().get(li.get(0));
					// we work with a copy of the body...yes, I am afraid I am using clone
					r = f.getBody().clone();
					ldecl = f.getDecls();
				}
				int nargs = ldecl.size();
					
				List<Expr> largs = apply.getArgs();
				if (largs.size() != nargs)
					Parsing.error(" number of arguments in call does not match predicate definition ("+input.print()+")");
				else {					
					// create the substitution
					Substitution s = new Substitution(ldecl,largs);
					// apply the substitution
					r.subexpressions(s);

					// if r is a CaseExpr now we need to replace the local variable to avoid infinity recursive calls 
					if (r instanceof CaseExpr) {
						CaseTransformer ct = new CaseTransformer(m, (CaseExpr) r);
						r = ct.transform();
					}
					
					// now eliminate the calls in the predicate definition
					r.subexpressions(this);
				}
			}
			
		}
		return r;
	}


}
