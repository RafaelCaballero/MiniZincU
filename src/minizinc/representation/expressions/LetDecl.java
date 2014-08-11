/**
 * 
 */
package minizinc.representation.expressions;

import java.util.List;

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
	
	/**
     * Variable and parameter declarations, including possible initializations.<br>
     * Grammar<br>
     * decl : vardecl | pardecl;<br>
	 * @param ctx
	 * @return
	 */
	public static LetDecl decl(DeclContext ctx) {
		LetDecl t =null;
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





}
