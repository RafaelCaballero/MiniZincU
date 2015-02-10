/**
 * 
 */
package transformation;

import java.util.ArrayList;
import java.util.List;

import minizinc.representation.expressions.And;
import minizinc.representation.expressions.ArithExpr;
import minizinc.representation.expressions.BoolC;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.InfixArithBoolExpr;
import minizinc.representation.expressions.InfixExpr;
import minizinc.representation.expressions.Operand;
import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.Constraint;
import minizinc.representation.statement.Decl;
import minizinc.representation.statement.Output;
import minizinc.representation.statement.decls.VarDecl;
import minizinc.representation.types.Type;

/**
 * Transformer that eliminates the data statements
 * 
 * @author rafa
 *
 */
public class SimplifyModel extends SplitModel {

	/**
	 * complete constructor
	 */

	public SimplifyModel(SplitModel sp) {
		super(sp.getComment(), sp.getData(), sp.getConstraint(), sp.getDecl(),
				sp.getExtended(), sp.getFunction(), sp.getInclude(), sp
						.getInit(), sp.getOutput(), sp.getPredicate(), sp
						.getSolve());
		simplifyConstraints();
	}

	private void simplifyConstraints() {
		

		boolean simplified; 
		boolean assign;
		BoolC isTrue = new BoolC(true); // to check if any constraint is true
		do {
			simplified = assign = false;
			// 	first simplify constraints and remove those which are equal to true
			// 	remove true constraints values
			
			for (int nc = constraint==null ? 0 : constraint.size();   nc>=1; nc--) {
				Constraint c = constraint.get(nc-1);
				if (c.simplify())
					simplified=true;
				if (c.getExpr().equals(isTrue)) {
					constraint.remove(nc-1);
					simplified = true;
				}	
			
			}

			// is there any var assignment?
		    assign = varAssignments();
		} while (simplified || assign);

		


		//SimpExprTransformer det = new SimpExprTransformer(this);
//		applyTransformer(det, constraint);
	}

	/**
	 * Looks for constraints that correspond to variable assignments and unfold
	 * them eliminating the variable declaration.
	 * 
	 * @return true if some constraint corresponds to a variable assignment
	 */
	private boolean varAssignments() {
		boolean assign = false;
		if (constraint != null)
			for (int i = 0; i < constraint.size(); i++) {
				Constraint c = constraint.get(i);
				Expr e = c.getExpr();
				if (varAssignment(e))
					assign = true;
			}

		return assign;
	}

	private boolean varAssignment(Expr e) {
		boolean assign = false;
		Expr e2 = Expr.unwrap(e);
		if (e2 instanceof And) {
			And eand = (And) e2;
			List<Expr> le = eand.getE();
			if (le != null) {
				for (int j = 0; j < le.size(); j++) {
					Expr argj = le.get(j);
					if (varAssignment(Expr.unwrap(argj)))
						assign = true;
				}
			}
		} else
			assign = assign || checkAssignment(e2);

		return assign;
	}

	private boolean checkAssignment(Expr e) {
		boolean assign = false;

		ID id = null;
		Expr e2 = null;

		// an equality as an InfixExpr
		if (e instanceof InfixExpr) {
			InfixExpr ie = (InfixExpr) e;
			String op = ie.getOp().getInfixSetOp();
			List<Expr> lie = ie.getE();
			if (op != null && (op.equals("==") || op.equals("="))
					&& lie != null && lie.size() == 2) {
				Expr e1 = lie.get(0);
				e2 = lie.get(1);
				if (e1 instanceof ID)
					id = (ID) e1;
			}

		}

		// an equality as an InfixArithBoolExpr
		if (e instanceof InfixArithBoolExpr) {
			InfixArithBoolExpr ie = (InfixArithBoolExpr) e;
			String op = ie.getOp();
			if (op.equals("=") || op.equals("==")) {
				ArithExpr e1 = ie.getE1();
				e2 = ie.getE2();
				if (e1 instanceof Operand
						&& ((Operand) e1).getExpr() instanceof ID) {
					id = (ID) ((Operand) e1).getExpr();

				}
			}
		}

		if (e instanceof ID) {
			id = (ID) e;
			e2 = new BoolC(true);
		}

		// if we have an ID check if this is a union variable
		if (id != null && e2 != null && Expr.isBasic(Expr.unwrap(e2))) {
			VarDecl v = this.getVarByName(id);
			this.removeVarDecl(v);
			if (v != null) {
				// i--;
				// constraint.remove(i);
				replaceSubst(v, e2);
				assign = true;
			}
		}

		return assign;

	}

	/**
	 * @param dec
	 * @param e2
	 */
	private void replaceSubst(Decl dec, Expr e2) {
		List<Decl> decls = new ArrayList<Decl>();
		List<Expr> largs = new ArrayList<Expr>();
		decls.add(dec);
		largs.add(e2);
		Substitution subst = new Substitution(decls, largs);
		for (Constraint c : constraint) {
			c.subexpressions(subst);
		}

		for (Output o : output) {
			o.subexpressions(subst);
		}

	}
}
