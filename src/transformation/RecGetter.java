/**
 * 
 */
package transformation;


/**
 * Detects if a predicate or function is recuersive
 */
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.InfixExpr;
import minizinc.representation.expressions.InfixOp;
import minizinc.representation.expressions.PredOrUnionExpr;
import minizinc.representation.statement.QualName;

/**
 * A model transformer is a model that includes a model transformation.
 * @author rafa
 *
 */
public class  RecGetter implements ExprTransformer {
	protected QualName qn;
	protected boolean isRec;
	

	public RecGetter(QualName qn) {
		this.qn = qn;
		this.isRec = false;
	}

	public RecGetter(ID name) {
		this.qn = new QualName(name);
		this.isRec=false;
	}

	/**
	 * This expression is called only for elements inside the method(function/predicate) 
	 * If a recursive call is found {@link isRec} is changed to true.
	 * If {@link isRec} is already true do nothing.
	 */
	public  Expr transform(Expr input) {		
		
		if (!isRec && input instanceof PredOrUnionExpr) {
			ID checkqn = ((PredOrUnionExpr) input).getId();
			QualName idqn = new QualName(checkqn);
			if (idqn.equals(qn)) 
				isRec=true;
		}
		
		if (!isRec && input instanceof InfixExpr) {
			InfixOp op = ((InfixExpr) input).getOp();
			QualName idqn = new QualName(op);
			if (idqn.equals(qn)) 
				isRec=true;
		}
		return null;
	}


}
