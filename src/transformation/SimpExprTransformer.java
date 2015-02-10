/**
 * 
 */
package transformation;

import java.util.List;

import minizinc.representation.DataDef.DataConsData;
import minizinc.representation.expressions.BoolC;
import minizinc.representation.expressions.BoolExpr;
import minizinc.representation.expressions.BoolVal;
import minizinc.representation.expressions.CaseExpr;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.InfixArithExpr;
import minizinc.representation.expressions.InfixBoolExpr;
import minizinc.representation.expressions.InfixExpr;
import minizinc.representation.expressions.NotBoolExpr;
import minizinc.representation.expressions.PredOrUnionExpr;
import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.decls.VarDecl;
import minizinc.representation.types.TypeUnion;

/**
 * Transforms expressions in constraint statements
 * 
 * @author rafa
 *
 */
public class SimpExprTransformer implements ExprTransformer {
	protected SplitModel m;

	public SimpExprTransformer(SplitModel m) {
		this.m = m;
	}

	public Expr transform(Expr e) {
		Expr r = null;

		return r;
	}

}
