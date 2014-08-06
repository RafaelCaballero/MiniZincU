package minizinc.expressions;

public abstract class BoolExpr extends Expr {


	@Override
	public Type type() {

		return Type.BOOL;
	}

}
