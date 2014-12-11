/**
 * 
 */
package minizinc.representation.statement;

import java.util.ArrayList;
import java.util.List;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.PredicateContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;

/**
 * Represents a predicate definition. Grammar:<br>
 * predicate : 'predicate' ID'(' (decl(','decl)*)? ')' '=' expr;
 * 
 * @author rafa
 *
 */
public class Predicate extends Procedure {
	protected ID id;

	/**
	 * @param type
	 */
	public Predicate(ID id, List<Decl> decls, Expr expr) {
		super(TStatement.PREDICATE);
		this.id = id;
		this.decls = decls;
		this.expr = expr;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return "predicate " + id.print() + "(" + printList(decls) + ")" + "=\n"
				+ expr.print();
	}

	public ID getName() {
		return id;
	}

	/**
	 * 
	 * @return Predicate name as a qualified name
	 */
	public QualName getQualName() {
		return new QualName(id);
	}

	public static Predicate predicate(PredicateContext ctx) {
		Predicate r = null;
		List<Decl> decls = new ArrayList<Decl>();
		// just to check if the grammar has changed
		if (Parsing.hasTerminal(ctx.ID()) && Parsing.has(ctx.expr())) {
			ID id = ID.IDTerm(ctx.ID());
			Expr expr = Expr.expr(ctx.expr());
			// now the list of local declarations
			ctx.decl().stream().allMatch(x -> decls.add(Decl.decl(x)));
			r = new Predicate(id, decls, expr);
		} else
			Parsing.error("predicate : " + ctx.getText());
		return r;
	}

	@Override
	public Predicate clone() {
		Predicate r = null;
		ID idp = id == null ? null : id.clone();
		List<Decl> declsp = null;
		Expr exprp = expr == null ? null : expr.clone();
		if (decls != null) {
			declsp = new ArrayList<Decl>();
			for (Decl d : decls) {
				declsp.add(d.clone());
			}
		}
		// TODO Auto-generated method stub
		r = new Predicate(idp, declsp, exprp);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((decls == null) ? 0 : decls.hashCode());
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
		Predicate other = (Predicate) obj;
		if (decls == null) {
			if (other.decls != null)
				return false;
		} else if (!decls.equals(other.decls))
			return false;
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
		List<Decl> decls2 = this.applyTransformerList2(t, decls);
		Expr expr2 = this.applyTransformer(t, expr);

		id = id2;
		decls = decls2;
		expr = expr2;

	}

}
