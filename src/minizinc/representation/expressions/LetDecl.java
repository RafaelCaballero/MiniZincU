/**
 * 
 */
package minizinc.representation.expressions;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.DeclContext;
import minizinc.antlr4.MiniZincGrammarParser.LetDeclContext;
import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.Parsing;
import minizinc.representation.SubExpressions;
import minizinc.representation.statement.Decl;
import minizinc.representation.statement.Statement;
import minizinc.representation.statement.Constraint;
import minizinc.representation.statement.decls.ParDecl;
import minizinc.representation.statement.decls.VarDecl;

/**
 * Represents let declarations. Grammar: <br>
 * letDecl : decl | constraint;
 * 
 * @author rafa
 *
 */
public class LetDecl implements MiniZincRepresentation, SubExpressions,
		Cloneable {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return statement.print();
	}

	/**
	 * Variable and parameter declarations, including possible initializations.<br>
	 * Grammar<br>
	 * decl : vardecl | pardecl;<br>
	 * 
	 * @param ctx
	 * @return
	 */
	public static LetDecl decl(DeclContext ctx) {
		LetDecl t = null;
		if (Parsing.has(ctx.vardecl())) {
			t = new LetDecl(VarDecl.vardecl(ctx.vardecl()));
		} else if (Parsing.has(ctx.pardecl())) {
			t = new LetDecl(ParDecl.pardecl(ctx.pardecl()));
		} else {
			Parsing.error("Error in decl " + ctx.getText());
		}
		return t;
	}

	/**
	 * Let declarations. Grammar:<br>
	 * letDecl : decl | constraint;
	 * 
	 * @param ctx
	 * @return
	 */
	public static LetDecl letDecl(LetDeclContext ctx) {
		LetDecl t = null;
		if (Parsing.has(ctx.decl())) {
			t = decl(ctx.decl());

		} else if (Parsing.has(ctx.constraint())) {

		} else {
			Parsing.error("Error in letDecl " + ctx.getText());
		}
		return t;
	}

	@Override
	public LetDecl clone() {
		LetDecl r = null;
		if (statement instanceof Decl) {
			Decl statementp = statement == null ? null : ((Decl) statement)
					.clone();
			r = new LetDecl(statementp);
		}
		if (statement instanceof Constraint) {
			Constraint statementp = statement == null ? null
					: ((Constraint) statement).clone();
			r = new LetDecl(statementp);
		}

		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((statement == null) ? 0 : statement.hashCode());
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
		LetDecl other = (LetDecl) obj;
		if (statement == null) {
			if (other.statement != null)
				return false;
		} else if (!statement.equals(other.statement))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		Statement statement2 = this.applyTransformer2(t, statement);
		statement = statement2;

	}
	
	public Statement getStatement() {
		return statement;
	}

}
