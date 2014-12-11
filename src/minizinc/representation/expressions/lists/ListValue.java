/**
 * 
 */
package minizinc.representation.expressions.lists;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.ListValueContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.*;

/**
 * A list value. Grammar:<br>
 * listValue : stringExpr | ID | ifExpr | arrayaccess | predOrUnionExpr;
 * 
 * @author rafa
 *
 */
public class ListValue extends ListExpr {
	protected Expr e;

	/**
	 * A String literal is a valid list
	 * 
	 * @param e
	 *            A string literal
	 */
	public ListValue(StringC e) {
		this.e = e;
	}

	/**
	 * An Id can be a list.
	 * 
	 * @param e
	 *            An id representing a list
	 */
	public ListValue(ID e) {
		this.e = e;
	}

	/**
	 * An If expression can be a list.
	 * 
	 * @param e
	 *            An if expression representing a list
	 */
	public ListValue(IfS e) {
		this.e = e;
	}

	/**
	 * An arrayaccess can be a list.
	 * 
	 * @param e
	 *            An ArrayAccess representing a list
	 */
	public ListValue(ArrayAccess e) {
		this.e = e;
	}

	/**
	 * An function can return a list.
	 * 
	 * @param e
	 *            An ArrayAccess representing a list
	 */
	public ListValue(PredOrUnionExpr e) {
		this.e = e;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		// TODO Auto-generated method stub
		return e.print();
	}

	public Expr getExpr() {
		return e;
	}

	/**
	 * Grammar:<br>
	 * listValue : stringExpr | ID | ifExpr | arrayaccess | predOrUnionExpr ;
	 */
	public static ListExpr listValue(ListValueContext lvc) {
		ListExpr t = null;

		if (Parsing.has(lvc.stringExpr())) {
			t = new ListValue(StringC.stringExpr(lvc.stringExpr()));
		} else if (Parsing.hasTerminal(lvc.ID())) {
			t = new ListValue(ID.IDTerm(lvc.ID()));
		} else if (Parsing.has(lvc.ifExpr())) {
			t = new ListValue(IfS.ifExpr(lvc.ifExpr()));
		} else if (Parsing.has(lvc.arrayaccess())) {
			t = new ListValue(ArrayAccess.arrayaccess(lvc.arrayaccess()));
		} else if (Parsing.has(lvc.predOrUnionExpr())) {
			t = new ListValue(PredOrUnionExpr.predOrUnionExpr(lvc
					.predOrUnionExpr()));
		} else
			Parsing.error("listValue:  " + lvc.toString());

		return t;
	}

	@Override
	public ListValue clone() {
		ListValue r = null;
		if (e instanceof StringC) {
			StringC ep = e == null ? null : ((StringC) e).clone();
			r = new ListValue(ep);
		}
		if (e instanceof ID) {
			ID ep = e == null ? null : ((ID) e).clone();
			r = new ListValue(ep);
		}
		if (e instanceof IfS) {
			IfS ep = e == null ? null : ((IfS) e).clone();
			r = new ListValue(ep);
		}
		if (e instanceof ArrayAccess) {
			ArrayAccess ep = e == null ? null : ((ArrayAccess) e).clone();
			r = new ListValue(ep);
		}

		if (e instanceof PredOrUnionExpr) {
			PredOrUnionExpr ep = e == null ? null : ((PredOrUnionExpr) e)
					.clone();
			r = new ListValue(ep);
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
		ListValue other = (ListValue) obj;
		if (e == null) {
			if (other.e != null)
				return false;
		} else if (!e.equals(other.e))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		Expr e2 = this.applyTransformer(t, e);

		e = e2;

	}

}
