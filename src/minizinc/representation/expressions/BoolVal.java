/**
 * 
 */
package minizinc.representation.expressions;

import java.util.List;

/**
 * Atomic bool value. It is an abstract class that combines the union given by the following grammar:<br>
 * boolVal : | '(' boolExpr ')' | ID | BOOL | arrayaccess | ifExpr | letExpr
 * | predOrUnionExpr | guardExpr ;
 * @author rafa
 *
 */
public  class BoolVal extends BoolExpr {	
	private Expr e;
	
	public BoolVal(RbracketExpr expr) {
		e = expr;
	}
	
	public BoolVal(ID expr) {
		e = expr;
	}

	public BoolVal(BoolC expr) {
		e = expr;
	}
	public BoolVal(ArrayAccess expr) {
		e = expr;
	}
	public BoolVal(IfS expr) {
		e = expr;
	}
	public BoolVal(LetExpr expr) {
		e = expr;
	}
	public BoolVal(PredOrUnionExpr expr) {
		e = expr;
	}
	public BoolVal(GuardExpr expr) {
		e = expr;
	}

	
	public Expr getExpr(Expr e) {
		return e;
	}
	

}
