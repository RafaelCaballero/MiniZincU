/**
 * 
 */
package minizinc.representation.expressions;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.OperandContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;

/**
 * operand : ID | integer | real | arrayaccess | ifExpr | letExpr | '('arithExpr
 * ')' | predOrUnionExpr ;
 *
 * @author rafa
 *
 */
public class Operand extends ArithExpr {
	protected Expr e;

	/**
	 * An ID is an operand
	 */
	public Operand(ID e) {
		this.e = e;
	}

	/**
	 * An arithmetic expression between brackets is an operand
	 */
	public Operand(ArithExpr e) {
		this.e = e;
	}

	public Operand(IntC e) {
		this.e = e;
	}

	public Operand(FloatC e) {
		this.e = e;
	}

	public Operand(ArrayAccess e) {
		this.e = e;
	}

	public Operand(IfS e) {
		this.e = e;
	}

	public Operand(RbracketExpr e) {
		this.e = e;
	}

	public Operand(LetExpr e) {
		this.e = e;
	}

	public Operand(PredOrUnionExpr e) {
		this.e = e;
	}

	public Expr getExpr() {
		return e;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return e.print();
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		Expr ep = applyTransformer(t, e);
		if (ep != null)
			e = ep;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Parses an arithmetic expression operand.
	 * 
	 * @param ctx
	 * @return
	 */
	public static Operand operand(OperandContext ctx) {
		Operand op = null;
		if (Parsing.hasTerminal(ctx.ID())) {
			op = new Operand(ID.IDTerm(ctx.ID()));
		} else if (Parsing.has(ctx.integer()))
			op = new Operand(IntC.integerTerm(ctx.integer()));
		else if (Parsing.has(ctx.real()))
			op = new Operand(FloatC.realTerm(ctx.real()));
		else if (Parsing.has(ctx.arrayaccess()))
			op = new Operand(ArrayAccess.arrayaccess(ctx.arrayaccess()));
		else if (Parsing.has(ctx.ifExpr()))
			op = new Operand(IfS.ifExpr(ctx.ifExpr()));
		else if (Parsing.has(ctx.letExpr()))
			op = new Operand(LetExpr.letExpr(ctx.letExpr()));
		else if (Parsing.has(ctx.arithExpr())) {
			RbracketExpr re = RbracketExpr.rbracketArithExpr(ctx.arithExpr());
			op = new Operand(re);
		} else if (Parsing.has(ctx.predOrUnionExpr()))
			op = new Operand(PredOrUnionExpr.predOrUnionExpr(ctx
					.predOrUnionExpr()));
		return op;
	}

	@Override
	public Operand clone() {
		Operand r = null;
		if (e instanceof ID) {
			ID exprp = e == null ? null : ((ID) e).clone();
			r = new Operand(exprp);
		}
		if (e instanceof ArithExpr) {
			ArithExpr exprp = e == null ? null : ((ArithExpr) e).clone();
			r = new Operand(exprp);
		}
		if (e instanceof IntC) {
			IntC exprp = e == null ? null : ((IntC) e).clone();
			r = new Operand(exprp);
		}
		if (e instanceof FloatC) {
			FloatC exprp = e == null ? null : ((FloatC) e).clone();
			r = new Operand(exprp);
		}
		if (e instanceof ArrayAccess) {
			ArrayAccess exprp = e == null ? null : ((ArrayAccess) e).clone();
			r = new Operand(exprp);
		}
		if (e instanceof IfS) {
			IfS exprp = e == null ? null : ((IfS) e).clone();
			r = new Operand(exprp);
		}
		if (e instanceof RbracketExpr) {
			RbracketExpr exprp = e == null ? null : ((RbracketExpr) e).clone();
			r = new Operand(exprp);
		}
		if (e instanceof LetExpr) {
			LetExpr exprp = e == null ? null : ((LetExpr) e).clone();
			r = new Operand(exprp);
		}

		if (e instanceof PredOrUnionExpr) {
			PredOrUnionExpr exprp = e == null ? null : ((PredOrUnionExpr) e)
					.clone();
			r = new Operand(exprp);
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
		Operand other = (Operand) obj;
		if (e == null) {
			if (other.e != null)
				return false;
		} else if (!e.equals(other.e))
			return false;
		return true;
	}

	public boolean isBasic() {
		return Expr.isBasic(e);
	}

	@Override
	public Expr simplify() {
		return e.simplify();
	}
}
