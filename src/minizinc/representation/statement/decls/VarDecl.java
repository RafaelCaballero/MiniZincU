/**
 * 
 */
package minizinc.representation.statement.decls;

import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.DimensionsContext;
import minizinc.antlr4.MiniZincGrammarParser.TypenameContext;
import minizinc.antlr4.MiniZincGrammarParser.VarContext;
import minizinc.antlr4.MiniZincGrammarParser.VardeclContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;
import minizinc.representation.expressions.ArithExpr;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.IntC;
import minizinc.representation.expressions.Operand;
import minizinc.representation.statement.Decl;
import minizinc.representation.statement.TStatement;
import minizinc.representation.types.Type;
import minizinc.representation.types.TypeArray;
import minizinc.representation.types.TypeUnion;

/**
 * Represents a variable declaration, maybe including an initialization.
 * Grammar:<br>
 * vardecl : (var | vararray) ('=' expr)?;
 * 
 * @author rafa
 *
 */
public class VarDecl extends Decl {

	public VarDecl(Type vartype, String id) {
		super(TStatement.VARDECL, vartype, new ID(id));
	}

	public VarDecl(Type vartype, ID id) {
		super(TStatement.VARDECL, vartype, id);
	}

	public VarDecl(Type vartype, ID id, Expr expr) {
		super(TStatement.VARDECL, vartype, id, expr);
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
			s = at.printDimensions() + " var " + at.printBase() + ':'
					+ id.print();
		} else
			s = "var " + declType.print() + ':' + id.print();
		s += super.print();
		return s;
	}

	/**
	 * Obtaining the Java representation of a variable declaration.<br>
	 * Grammar:<br>
	 * vardecl : (var | vararray) ('=' expr)?;
	 * 
	 * @param ctx
	 *            the context
	 * @return Java representation as VarDecl
	 */
	public static VarDecl vardecl(VardeclContext ctx) {
		VarDecl t = null;
		VarContext vctx = null;
		DimensionsContext dctx = null;

		if (Parsing.has(ctx.vararray())) {
			dctx = ctx.vararray().dimensions();
			vctx = ctx.vararray().var();
		} else if (Parsing.has(ctx.var())) {
			vctx = ctx.var();
		} else
			Parsing.error("Error in vardecl " + ctx.getText());

		// if no Parsing.error Parsing.has been found...
		if (vctx != null) {
			if (Parsing.hasTerminal(vctx.ID())) {
				// variable name
				ID id = ID.IDTerm(vctx.ID());

				// obtain the type
				Type vt = null;
				TypenameContext tctx = vctx.typename();
				Type base = Type.typename(tctx);
				if (dctx != null) {
					List<Type> dim = getDimensions(dctx);
					vt = new TypeArray(dim, base);
				} else
					vt = base;

				if (Parsing.has(ctx.expr())) {
					Expr e = Expr.expr(ctx.expr());
					t = new VarDecl(vt, id, e);

				} else
					t = new VarDecl(vt, id);

			} else
				Parsing.error("Error in vardecl;  no id found "
						+ vctx.getText());

		}
		return t;
	}

	@Override
	public VarDecl clone() {
		VarDecl r = null;
		Type declTypep = declType == null ? null : declType.clone();
		ID idp = id == null ? null : id.clone();
		Expr exprp = expr == null ? null : expr.clone();
		r = new VarDecl(declTypep, idp, exprp);
		return r;
	}

	/**
	 * This method is only valid for union variable declarations
	 * 
	 * @return
	 */
	public int getLevel() {
		int r = -1;
		if (declType instanceof TypeUnion) {
			TypeUnion t = (TypeUnion) declType;
			// get the expression indicating the level
			ArithExpr e = t.getE();
			// at the moment only integer constants are allowed
			if (e instanceof Operand) {
				Expr exp = ((Operand) e).getExpr();
				if (exp instanceof IntC) {
					r = ((IntC) exp).get();
				}
			}

		}
		return r;
	}

	/**
	 * A new level for the variable. Only applicable to union types
	 * 
	 * @param level
	 *            The level
	 */
	public void setLevel(int level) {
		if (declType instanceof TypeUnion) {
			TypeUnion t = (TypeUnion) declType;
			t.setE(new Operand(new IntC(level)));

		}

	}

}
