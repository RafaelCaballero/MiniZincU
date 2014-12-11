/**
 * 
 */
package transformation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import minizinc.representation.Parsing;
import minizinc.representation.SubExpressions;
import minizinc.representation.expressions.ID;
import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.DataDef;
import minizinc.representation.statement.Decl;
import minizinc.representation.statement.Function;
import minizinc.representation.statement.Predicate;
import minizinc.representation.statement.Procedure;
import minizinc.representation.statement.QualName;
import minizinc.representation.types.Type;
import minizinc.representation.types.TypeID;
import minizinc.representation.types.TypeUnion;

/**
 * Transformer that eliminates the data statements
 * 
 * @author rafa
 *
 */
public class TransRecursiveModel extends SplitModel {

	/**
	 * predicates in the model including union types (usually using case
	 * statements).
	 */
	protected Set<String> recpred;
	/**
	 * functions in the model including recursive calls (usually using case
	 * statements)
	 */
	protected Set<String> recfunc;

	/*
	 * protected HashMap<String, List<Integer>> unionpred; protected
	 * HashMap<String, List<Integer>> unionfunc;
	 */

	/**
	 * complete constructor
	 */

	public TransRecursiveModel(SplitModel sp) {
		super(sp.getData(), sp.getConstraint(), sp.getDecl(), sp.getExtended(),
				sp.getFunction(), sp.getInclude(), sp.getInit(),
				sp.getOutput(), sp.getPredicate(), sp.getSolve());
		recpred = new HashSet<String>();
		recfunc = new HashSet<String>();

		/*
		 * unionpred = new HashMap<String, List<Integer>>(); unionfunc = new
		 * HashMap<String, List<Integer>>();
		 */
		transformRecursive();
	}

	private void transformRecursive() {

		// first complete recpred, unionpred, recfunc, unionfunc
		getUnionProcs();

		// now unfold the calls to this predicates/functions.
		UnionTransformer det = new UnionTransformer(this, recpred, recfunc);
		applyTransformer(det, constraint);
		applyTransformer(det, decl);
		/*
		 * TODO applyTransformer(det,function); applyTransformer(det,predicate);
		 */
		applyTransformer(det, init);
		applyTransformer(det, output);
		applyTransformer(det, solve);

		// remove the definitions of the recursive functions/predicates
		if (recfunc != null && recfunc.size() > 0) {
			// first get the positions of all the functions
			List<Integer> li = recfunc.stream()
					.map(name -> getFunctionPosByName(name)).sorted()
					.collect(Collectors.toList());
			// remove then starting by the last one
			for (int i = this.recfunc.size() - 1; i >= 0; i--) {
				int pos = li.get(i);			
				function.remove(pos);
			}
		}

		if (recpred != null && recpred.size() > 0) {
			// get the position of all the predicates
			List<Integer> li = recpred.stream()
					.map(name -> getPredicatePosByName(name)).sorted()
					.collect(Collectors.toList());
			// remove then starting by the last one
			for (int i = this.recpred.size() - 1; i >= 0; i--){
				int pos = li.get(i);			
				predicate.remove(pos);
			}
				

		}

	}

	
	private void getUnionProcs() {

		// local vars. used to traverse the list of predicates and functions
		Predicate p;
		Function f;

		// first get a list of recursive predicates and predicates with union
		// parameters

		if (predicate != null && predicate.size() > 0)
			for (int i = 0; i < predicate.size(); i++) {
				p = predicate.get(i);
				checkrecursivity(recpred, p, p.getName(), null, i, p.getDecls());
			}

		if (function != null && function.size() > 0)
			for (int i = 0; i < function.size(); i++) {
				f = function.get(i);
				checkrecursivity(recfunc, f, null, f.getName(), i, f.getDecls());
			}

		// find the transitive closure of the functions/predicates calling
		// any function in unionpred or unionfunc
		int np = recpred == null ? 0 : recpred.size();
		int nf = recfunc == null ? 0 : recfunc.size();
		if (np != 0 || nf != 0) {
			// fix point reached when npnew==np && nfnew==nf
			int npnew;
			int nfnew;
			do {
				if (predicate != null && predicate.size() > 0)
					for (int i = 0; i < predicate.size(); i++) {
						p = predicate.get(i);
						if (checkIndirectRecursivity(recpred, recfunc, p)) {
							recpred.add(p.getQualName().print());
						}

					}

				for (int i = 0; i < function.size(); i++) {
					f = function.get(i);
					if (checkIndirectRecursivity(recpred, recfunc, f)) {
						recpred.add(f.getQualName().print());
					}

				}

				npnew = recpred == null ? 0 : recpred.size();
				nfnew = recfunc == null ? 0 : recfunc.size();
			} while (np != npnew || nf != nfnew);
		}

	}

	/**
	 * Add new procedures that call to predicates/functions with union types
	 * 
	 * @param l
	 *            List of procedures
	 */
	private void checkIndirect(List<Procedure> l) {
		if (l != null && l.size() > 0)
			for (int i = 0; i < l.size(); i++) {
				Procedure p = l.get(i);
				if (checkIndirectRecursivity(recpred, recfunc, p)) {
					recpred.add(p.getQualName().print());
				}

			}

	}

	/**
	 * Check indirect calls to functions containing unions
	 * 
	 * @param unionpred
	 *            List of names of predicates that need to be unfolded
	 * @param unionfunc
	 *            List of names of functions that need to be unfolded
	 * 
	 * @param expr
	 *            the definition of the current function/predicate
	 * @return true if expr contains a procedure that needs unfolding
	 */
	private boolean checkIndirectRecursivity(Set<String> unionpred,
			Set<String> unionfunc, SubExpressions expr) {
		boolean result = false;
		// get the list of procedures already included to detect call to them
		Set<String> ql = new HashSet<String>();
		if (unionpred != null)
			ql.addAll(unionpred);
		if (unionfunc != null)
			ql.addAll(unionfunc);
		CallGetter rg = new CallGetter(ql);
		expr.subexpressions(rg);
		result = rg.isCalled;

		return result;
	}

	/**
	 * @param rec
	 *            List of recursive predicates/functions at the moment. Must
	 *            exist.
	 * @param lunion
	 *            Hashmap of the form name -> l, indicate that the
	 *            predicate/function with name "name" is accessing to the list l
	 *            of recursive functions/predicates
	 * @param p
	 *            the definition of the current function/predicate
	 * @param id
	 *            name of the current function/predicate. Null if the name is
	 *            qualified. If it is different from null then {@link qn} must
	 *            be null.
	 * @param qn
	 *            qualified name of the function/predicate, or null if the name
	 *            is not qualified If it is different from null then {@link id}
	 *            must be null.
	 * @param i
	 *            Position of the function/predicate in the list if
	 *            functions/predicate
	 * @param ld
	 *            Local declarations in the predicate/function body
	 */
	private void checkrecursivity(Set<String> rec, Procedure p, ID id,
			QualName qn, int i, List<Decl> ld) {
		CallGetter rg = id != null ? new CallGetter(id) : new CallGetter(qn);
		p.subexpressions(rg);
		if (rg.isCalled) {
			rec.add(p.getQualName().print());
			// System.out.println("Recursive function "+f.getName());
		}
		List<Integer> li = getUnionDecls(ld);
		if (li != null) {
			rec.add(p.getQualName().print());
		}

	}

	private List<Integer> getUnionDecls(List<Decl> ld) {

		List<Integer> r = null;
		Decl d;
		for (int i = 0; i < ld.size(); i++) {
			d = ld.get(i);
			Type tdecl = d.getDeclType();
			if (d != null && tdecl instanceof TypeUnion) {
				// get the data and call to sVar
				TypeUnion t = (TypeUnion) d.getDeclType();
				String typename = t.getId().print();

				DataDef dd = this.getDataByName(typename);
				if (dd == null)
					Parsing.error("Unexpected union type name in predicate/function declaration"
							+ typename);
				else {
					if (r == null)
						r = new ArrayList<Integer>();
					r.add(i);
				}
			} else if (d != null && tdecl instanceof TypeID) {
				// get the data and call to sVar
				TypeID t = (TypeID) d.getDeclType();
				String typename = t.getId().print();

				DataDef dd = this.getDataByName(typename);
				if (dd != null) {
					if (r == null)
						r = new ArrayList<Integer>();
					r.add(i);
				}
			}
		} // for

		return r;

	}
}
