/**
 * 
 */
package transformation;

/**
 * Detects if a predicate or function is recuersive
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import minizinc.representation.expressions.CaseExpr;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.InfixExpr;
import minizinc.representation.expressions.InfixOp;
import minizinc.representation.expressions.PredOrUnionExpr;
import minizinc.representation.statement.QualName;

/**
 * This a special transformer because it only detects if a method either
 * <ol>
 * <li>includes call to a list of selected methods in its body/declarations.
 * After checking this with method {@link transform}
 * <li>Includes a case statement
 * </ol>
 * 
 * @author rafa
 *
 */
public class CallGetter implements ExprTransformer {
	protected Set<QualName> qn;
	protected boolean isCalled;

	public CallGetter(QualName qn) {
		this.qn = new HashSet<QualName>();
		this.qn.add(qn);
		this.isCalled = false;
	}

	public CallGetter(ID name) {
		this.qn = new HashSet<QualName>();
		this.qn.add(new QualName(name));
		this.isCalled = false;
	}

	public CallGetter(Set<String> qs) {

		this.qn = new HashSet<QualName>();
		qs.forEach(s -> qn.add(new QualName(new ID(s))));
		this.isCalled = false;
	}

	/**
	 * Checks if the last expression evaluated contains any call to any
	 * method/function in {@link isRec}
	 * 
	 * @return true if the expression includes a call to any of the methods,
	 *         false otherwise
	 */
	public boolean includesCall() {
		return isCalled;
	}

	/**
	 * This expression is called only for elements inside the
	 * method(function/predicate)- If:
	 * <ul>
	 * <li>Any function/predicate in {@link qn} is called
	 * </ul>
	 * is found {@link isCalled} is changed to true. If {@link isCalled} is
	 * already true do nothing.
	 * 
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * transformation.ExprTransformer#transform(minizinc.representation.expressions
	 * .Expr)
	 */
	public Expr transform(Expr input) {

		if (!isCalled) {
			QualName idqn = null;

			// two cases, 1) predicate or unions and 2) functions expressions
			if (input instanceof PredOrUnionExpr) {
				ID checkqn = ((PredOrUnionExpr) input).getId();
				idqn = new QualName(checkqn);
			}

			if (input instanceof InfixExpr) {
				InfixOp op = ((InfixExpr) input).getOp();
				idqn = new QualName(op);
			}

			if (qn != null && qn.contains(idqn))
				isCalled = true;
			else if (input instanceof CaseExpr)
				isCalled = true;
		}
		// always return null to avoid modifications
		return null;
	}

}
