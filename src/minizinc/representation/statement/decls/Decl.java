/**
 * 
 */
package minizinc.representation.statement.decls;

import java.util.ArrayList;
import java.util.List;

import minizinc.representation.Typeable;
import minizinc.representation.expressions.Expr;
import minizinc.representation.statement.Statement;

/**
 * Variable and parameter declarations, including possible initializations.<br>
 * Grammar<br>
 * decl : vardecl | pardecl;<br>
 *
 * This abstract class contains the initialization expression, which can be null.
 * @author rafa
 *
 */
public abstract class Decl extends Statement implements Typeable {
	protected Expr e;
	
	/* (non-Javadoc)
	 * @see minizinc.expressions.SubExpressions#subexpressions()
	 */
	public List<Expr> subexpressions() {
		List<Expr> t = new ArrayList<Expr>();
		if (e!=null) 
			t.add(e);
		return t;
	}
	
	/**
	 * Indicates if the declaration includes an initialization.
	 * @return true if the declaration is initialized, false otherwise.
	 */
	public boolean initialized() {
		return e!=null;
	}

}
