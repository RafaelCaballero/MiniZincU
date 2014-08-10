/**
 * 
 */
package minizinc.representation.expressions.lists;

import java.util.List;

import minizinc.representation.expressions.*;

/**
 * A list value. Grammar:<br>
 * listValue : stringExpr | ID | ifExpr | arrayaccess ;
 * @author rafa
 *
 */
public class ListValue extends ListExpr {
	protected Expr e;
	/**
	 * A String literal is a valid list
	 * @param e A string literal
	 */
	public ListValue(StringC e) {
		this.e = e;
	}
	/**
	 * An Id can be a list.
	 * @param e An id representing a list 
	 */
	public ListValue(ID e) {
		this.e = e;
	}
	/**
	 * An If expression can be a list.
	 * @param e An if expression representing a list 
	 */
	public ListValue(IfS e) {
		this.e = e;
	}
	/**
	 * An arrayaccess can be a list.
	 * @param e An ArrayAccess representing a list 
	 */
	public ListValue(ArrayAccess e) {
		this.e = e;
	}

	

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		// TODO Auto-generated method stub
		return e.print();
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		return e.subexpressions();
	}
	
	public Expr getExpr() {
		return e;
	}

}
