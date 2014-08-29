/**
 * 
 */
package minizinc.representation.expressions.cases;


import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.CaseBranchContext;
import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.Parsing;
import minizinc.representation.SubExpressions;
import minizinc.representation.TypeName;
import minizinc.representation.Typeable;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.PredOrUnionExpr;

/**
 * A case expression branch. With grammar
 * caseBranch : predOrUnionExpr '-->' expr;  
 * @author rafa
 *
 */
public class Branch implements SubExpressions, MiniZincRepresentation, Typeable, Cloneable {
	protected PredOrUnionExpr pattern;
	protected ID idpattern;
	protected Expr expr;
	
	/**
	 * complete constructor
	 */
	public Branch(PredOrUnionExpr pattern,ID idpattern,Expr expr){
		this.pattern = pattern;
		this.idpattern = idpattern;
		this.expr = expr;
	}
	/**
	 * Constructor with pattern of the form cons(arg1...argn)
	 */
	public Branch(PredOrUnionExpr pattern, Expr expr) {
		this.expr = expr;
		this.pattern = pattern;
		this.idpattern = null;
	}

	/**
	 * Constructor with pattern a constant
	 */
	public Branch(ID id, Expr expr) {
		this.expr = expr;
		this.pattern = null;
		this.idpattern = id;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return pattern.print()+"-->" + expr.print();
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public void subexpressions(ExprTransformer t) {
		 PredOrUnionExpr pattern2 = this.applyTransformer2(t, pattern);
		 ID idpattern2 = this.applyTransformer2(t, idpattern);
		 Expr expr2 = this.applyTransformer(t, expr);
		 this.pattern = pattern2;
		 this.idpattern = idpattern2;
		 this.expr = expr2;
		

	}

	@Override
	public TypeName type() {
		return expr.type();
	}

	public PredOrUnionExpr getPattern() {
		return pattern;
	}

	public Expr getExpr() {
		return expr;
	}

	public static Branch branch(CaseBranchContext ctx) {
		Branch r = null;
		if (Parsing.has(ctx.predOrUnionExpr()) && Parsing.has(ctx.expr()) ) {
			PredOrUnionExpr p = PredOrUnionExpr.predOrUnionExpr(ctx.predOrUnionExpr());
			Expr expr = Expr.expr(ctx.expr());
			r = new Branch(p,expr);
		} if (Parsing.hasTerminal(ctx.ID()) && Parsing.has(ctx.expr()) ) { 
			ID id =  ID.IDTerm(ctx.ID());
			Expr expr = Expr.expr(ctx.expr());
			r = new Branch(id,expr);
		}
		else
			Parsing.error("Branch "+ctx.getText());
		return r;
	}
	
	@Override
	public Branch clone(){
		Branch r=null;
		PredOrUnionExpr patternp = pattern==null ? null : pattern.clone();
		ID idpatternp = idpattern==null ? null : idpattern.clone();
		Expr exprp = expr==null ? null : expr.clone();
		r = new Branch(patternp,idpatternp,exprp);
		return r;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expr == null) ? 0 : expr.hashCode());
		result = prime * result
				+ ((idpattern == null) ? 0 : idpattern.hashCode());
		result = prime * result + ((pattern == null) ? 0 : pattern.hashCode());
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
		Branch other = (Branch) obj;
		if (expr == null) {
			if (other.expr != null)
				return false;
		} else if (!expr.equals(other.expr))
			return false;
		if (idpattern == null) {
			if (other.idpattern != null)
				return false;
		} else if (!idpattern.equals(other.idpattern))
			return false;
		if (pattern == null) {
			if (other.pattern != null)
				return false;
		} else if (!pattern.equals(other.pattern))
			return false;
		return true;
	}

}
