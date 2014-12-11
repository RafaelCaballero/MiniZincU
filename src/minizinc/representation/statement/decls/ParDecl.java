/**
 * 
 */
package minizinc.representation.statement.decls;

import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.DimensionsContext;
import minizinc.antlr4.MiniZincGrammarParser.ParameterContext;
import minizinc.antlr4.MiniZincGrammarParser.PardeclContext;
import minizinc.antlr4.MiniZincGrammarParser.TypenameContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.statement.Decl;
import minizinc.representation.statement.TStatement;
import minizinc.representation.types.Type;
import minizinc.representation.types.TypeArray;

/**
 * Represents a variable declaration, maybe including an initialization.
 * Grammar:<br>
 * vardecl : (var | vararray) ('=' expr)?;
 * 
 * @author rafa
 *
 */
public class ParDecl extends Decl {

	public ParDecl(Type partype, ID id) {
		super(TStatement.PARDECL, partype, id);
	}

	public ParDecl(Type partype, ID id, Expr expr) {
		super(TStatement.PARDECL, partype, id, expr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		String s = null;
		if (declType.type() == TypeName.ARRAY) {
			TypeArray at = (TypeArray) declType;
			s = at.printDimensions() + " " + at.printBase() + ':' + id.print();
		} else
			s = declType.print() + ':' + id.print();
		s += super.print();
		return s;
	}

	/**
	 * Obtaining the Java representation of a parameter declaration.<br>
	 * Grammar:<br>
	 * pardecl : parameter | pararray; pararray : 'array' dimensions 'of'
	 * parameter; parameter : 'par'? typename ':' ID ('=' expr)?;
	 * 
	 * @param ctx
	 *            the context
	 * @return Java representation as VarDecl
	 */
	public static ParDecl pardecl(PardeclContext ctx) {

		ParDecl t = null;
		ParameterContext pctx = null;
		DimensionsContext dctx = null;

		if (Parsing.has(ctx.pararray())) {
			dctx = ctx.pararray().dimensions();
			pctx = ctx.pararray().parameter();
		} else if (Parsing.has(ctx.parameter())) {
			pctx = ctx.parameter();
		} else
			Parsing.error("Error in pardecl " + ctx.getText());

		// if no Parsing.error Parsing.has been found...
		if (pctx != null) {
			if (Parsing.hasTerminal(pctx.ID())) {
				// parameter name
				ID id = ID.IDTerm(pctx.ID());

				// obtain the type
				Type vt = null;
				TypenameContext tctx = pctx.typename();
				Type base = Type.typename(tctx);
				if (dctx != null) {
					List<Type> dim = getDimensions(dctx);
					vt = new TypeArray(dim, base);
				} else
					vt = base;

				if (Parsing.has(pctx.expr())) {
					Expr e = Expr.expr(pctx.expr());
					t = new ParDecl(vt, id, e);

				} else
					t = new ParDecl(vt, id);

			} else
				Parsing.error("Error in pardecl;  no id found "
						+ pctx.getText());

		}
		return t;
	}

	@Override
	public ParDecl clone() {
		ParDecl r = null;
		Type declTypep = declType == null ? null : declType.clone();
		ID idp = id == null ? null : id.clone();
		Expr exprp = expr == null ? null : expr.clone();
		r = new ParDecl(declTypep, idp, exprp);
		return r;
	}

}
