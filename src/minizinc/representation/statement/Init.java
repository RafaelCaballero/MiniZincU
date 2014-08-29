/**
 * 
 */
package minizinc.representation.statement;


import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.InitContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;

/**
 * Represents a MiniZinc initialization, with grammar:
 * init : ID '=' expr; 
 * @author rafa
 *
 */
public class Init extends Statement {
	protected ID id;
	protected  Expr expr;
	/**
	 * @param type
	 */
	public Init(ID id, Expr expr) {
		super(TStatement.INIT);
		this.id = id;
		this.expr = expr;
		
	}
	
	public ID getID() {
		return id;
	}
	
	public Expr getExpr() {
		return expr;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return id.print()+"="+expr.print();
	}


	public static Init init(InitContext ctx) {
		Init r = null;
		if (Parsing.hasTerminal(ctx.ID()) && Parsing.has(ctx.expr())) {
			ID id = ID.IDTerm(ctx.ID());
			Expr expr = Expr.expr(ctx.expr());
			r = new Init(id,expr);
		} else
			Parsing.error("Init "+ctx.getText());
		return r;
	}

	@Override
	public Init clone() {
		Init r = null;
		ID idp = id==null ? null : id.clone();;
		Expr exprp = expr==null ? null : expr.clone();	
		r = new Init(idp,exprp);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((expr == null) ? 0 : expr.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Init other = (Init) obj;
		if (expr == null) {
			if (other.expr != null)
				return false;
		} else if (!expr.equals(other.expr))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		ID id2 = this.applyTransformer2(t, id);
		Expr expr2 = this.applyTransformer(t, expr);
		
		id = id2;
		expr = expr2;
		
		
	}

}
