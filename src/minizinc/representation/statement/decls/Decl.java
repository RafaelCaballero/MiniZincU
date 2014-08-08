/**
 * 
 */
package minizinc.representation.statement.decls;

import java.util.ArrayList;
import java.util.List;

import minizinc.representation.TypeName;
import minizinc.representation.Typeable;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.statement.Statement;
import minizinc.representation.types.Type;

/**
 * Variable and parameter declarations, including possible initializations.<br>
 * Grammar<br>
 * decl : vardecl | pardecl;<br>
 * In both cases the structure is similar: a type, an id and a possible initialization.
 *
 * This abstract class contains the initialization expression, which can be null.
 * @author rafa
 *
 */
public abstract class Decl extends Statement implements Typeable {
	/**
	 *  type of the declared var or par.
	 */
	protected Type declType;
	/**
	 * Identifier of the declared var or par
	 */
	protected ID id;
	/**
	 * Possible initialization
	 */
	protected Expr expr;
	
	/**
	 * Constructor for variable declarations including initializations 
	 */
	public Decl(Type decltype,ID id,Expr expr) {
		this.declType = decltype;
		this.id = id;
		this.expr = expr;		
	}

	/**
	 * Constructor for variable declarations without initializations 
	 */
	public Decl(Type decltype,ID id) {
		this.declType = decltype;
		this.id = id;
		this.expr = null;		
	}

	
	/* (non-Javadoc)
	 * @see minizinc.expressions.SubExpressions#subexpressions()
	 */
	public List<Expr> subexpressions() {
		List<Expr> t = new ArrayList<Expr>();
		if (expr!=null) 
			t.add(expr);
		return t;
	}
	
	/**
	 * Indicates if the declaration includes an initialization.
	 * @return true if the declaration is initialized, false otherwise.
	 */
	public boolean initialized() {
		return expr!=null;
	}
	
	@Override
	public TypeName type() {
		return declType.type();
	}
	
	public Type getType() {
		return declType;
	}


}
