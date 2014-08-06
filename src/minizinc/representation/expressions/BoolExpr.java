package minizinc.representation.expressions;

import minizinc.representation.TypeName;

public abstract class BoolExpr extends Expr {


	@Override
	public TypeName type() {

		return TypeName.BOOL;
	}

}
