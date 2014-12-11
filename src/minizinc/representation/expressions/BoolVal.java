/**
 * 
 */
package minizinc.representation.expressions;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.BoolValContext;
import minizinc.representation.Parsing;

/**
 * Atomic bool value. It is an abstract class that combines the union given by
 * the following grammar:<br>
 * boolVal : | '(' boolExpr ')' | ID | BOOL | arrayaccess | ifExpr | letExpr |
 * predOrUnionExpr | guardExpr ;
 * 
 * @author rafa
 *
 */
public class BoolVal extends BoolExpr {
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

	public Expr getExpr() {
		return e;
	}

	@Override
	public String print() {
		return e.print();
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		Expr ep = applyTransformer(t, e);
		if (ep != null)
			e = ep;
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
			IfS i = IfS.ifExpr(ctx.ifExpr());
			t = new BoolVal(i);
		} else if (Parsing.has(ctx.letExpr())) {
			t = new BoolVal(LetExpr.letExpr(ctx.letExpr()));
		} else if (Parsing.has(ctx.predOrUnionExpr())) {
			t = new BoolVal(PredOrUnionExpr.predOrUnionExpr(ctx
					.predOrUnionExpr()));
		} else
			Parsing.error("boolVal " + ctx.getText());
		return t;
	}

	@Override
	public BoolExpr clone() {
		BoolVal r = null;
		if (e instanceof RbracketExpr) {
			RbracketExpr ep = (e == null ? null : ((RbracketExpr) e).clone());
			r = new BoolVal(ep);
		}
		if (e instanceof ID) {
			ID ep = (e == null ? null : ((ID) e).clone());
			r = new BoolVal(ep);
		}
		if (e instanceof BoolC) {
			BoolC ep = (e == null ? null : ((BoolC) e).clone());
			r = new BoolVal(ep);
		}
		if (e instanceof ArrayAccess) {
			ArrayAccess ep = (e == null ? null : ((ArrayAccess) e).clone());
			r = new BoolVal(ep);
		}
		if (e instanceof IfS) {
			IfS ep = (e == null ? null : ((IfS) e).clone());
			r = new BoolVal(ep);
		}
		if (e instanceof LetExpr) {
			LetExpr ep = (e == null ? null : ((LetExpr) e).clone());
			r = new BoolVal(ep);
		}
		if (e instanceof PredOrUnionExpr) {
			PredOrUnionExpr ep = (e == null ? null : ((PredOrUnionExpr) e)
					.clone());
			r = new BoolVal(ep);
		}
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((e == null) ? 0 : e.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoolVal other = (BoolVal) obj;
		if (e == null) {
			if (other.e != null)
				return false;
		} else if (!e.equals(other.e))
			return false;
		return true;
	}

	/**
	 * @return the e
	 */
	public Expr getE() {
		return e;
	}

}
