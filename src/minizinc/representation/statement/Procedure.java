package minizinc.representation.statement;

import java.util.List;

import minizinc.representation.expressions.Expr;

/**
 * Used as common class for Function and Predicate
 * 
 * @author rafa
 *
 */
public abstract class Procedure extends Statement {
	/**
	 * The body of the procedure
	 */
	protected Expr expr;
	/**
	 * Input arguments
	 */
	protected List<Decl> decls;

	/**
	 * This class will never be instantiated
	 */
	public Procedure(TStatement type) {
		super(type);
	}

	public List<Decl> getDecls() {
		return decls;
	}

	public Expr getBody() {
		return expr;
	}

	public abstract QualName getQualName();

}
