/**
 * 
 */
package minizinc.representation.expressions;

import java.util.List;

import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.SubExpressions;
import minizinc.representation.statement.Statement;
import minizinc.representation.statement.constraint.Constraint;
import minizinc.representation.statement.decls.Decl;

/**
 * Represents let declarations. 
 * Grammar: <br>
 * letDecl : decl | constraint; 
 * @author rafa
 *
 */
public class LetDecl   implements MiniZincRepresentation, SubExpressions{
	private Statement statement;
	
	/**
	 * Constructor: this let declaration is a variable declaration 
	 */
	public LetDecl(Decl st) {
		statement = st;
	}
	/**
	 * Constructor: this let declaration is a constraint declaration 
	 */
	public LetDecl(Constraint cte) {
		statement = cte;
	}

	/* (non-Javadoc)
	 * @see minizinc.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return statement.print();
	}

	/* (non-Javadoc)
	 * @see minizinc.expressions.Expr#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		return statement.subexpressions();
	}


}
