/**
 * 
 */
package minizinc.representation.expressions;

import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.BoolValContext;
import minizinc.representation.Parsing;

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

	
	public Expr getExpr(Expr e) {
		return e;
	}

	@Override
	public String print() {
		return e.print();
	}

	@Override
	public List<Expr> subexpressions() {
		return e.subexpressions();
	}
	

	/**
	 * Grammar:<br>
	 * boolVal : | '(' boolExpr ')' | ID | BOOL | arrayaccess | ifExpr | letExpr
	 * | predOrUnionExpr ;
	 *
	 * @param ctx
	 *            Grammar context
	 * @return BoolVal representation
	 */
	public static BoolVal boolVal(BoolValContext ctx) {
		BoolVal t = null;
		if (Parsing.has(ctx.boolExpr())) {
			RbracketExpr r = RbracketExpr.rbracketBoolExpr(ctx.boolExpr()); 
			t = new BoolVal(r);
		} else if (Parsing.hasTerminal(ctx.ID())) {
			ID id = ID.IDTerm(ctx.ID());
			t = new BoolVal(id);
		} else if (Parsing.hasTerminal(ctx.BOOL())) {
			BoolC bc = BoolC.BOOLTerm(ctx.BOOL());
			t = new BoolVal(bc);
		} else if (Parsing.has(ctx.arrayaccess())) {
			t = new BoolVal(ArrayAccess.arrayaccess(ctx.arrayaccess()));
		} else if (Parsing.has(ctx.ifExpr())) {
			IfS  i = IfS.ifExpr(ctx.ifExpr());
			t = new BoolVal(i);
		} else if (Parsing.has(ctx.letExpr())) {
			t = new BoolVal(LetExpr.letExpr(ctx.letExpr()));
		} else if (Parsing.has(ctx.predOrUnionExpr())) {
			t = new BoolVal(PredOrUnionExpr.predOrUnionExpr(ctx.predOrUnionExpr()));
		}
		else
			Parsing.error("boolVal " + ctx.getText());
		return t;
	}


}
