/**
 * 
 */
package minizinc.representation.expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.CaseExprContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;
import minizinc.representation.expressions.cases.Branch;

/**
 * Represents a case expression. Used for union/data types.
 * Grammar:
 * caseExpr   : 'case' ID 'of' (caseBranch ';')+ 'endcase';
 * caseBranch : predOrUnionExpr '-->' expr;  
 * 
 * @author rafa
 *
 */
public class CaseExpr extends Expr {
	protected ID id;
	protected List<Branch> branches;
	/**
	 * 
	 */
	public CaseExpr(ID id, List<Branch> branches) {
		this.id = id;
		this.branches = branches;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return "case "+id.print()+" of "+ printList(";",branches)+ " endcase";
	}

	/* (non-Javadoc)
	 * @see minizinc.expressions.Expr#subexpressions()
	 */
	@Override
	public void subexpressions(ExprTransformer t) {
		List<Branch> branches2 = applyTransformerList2(t,branches);
		ID id2 = applyTransformer2(t,id);
		this.branches = branches2;
		this.id = id2;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		TypeName t =null;
		// we return the type of the expression in the first branch 
		if (branches!=null && branches.size()>0) 
			t = branches.get(0).type();
		
		return t;
	}

	public static CaseExpr caseExpr(CaseExprContext ctx) {
		CaseExpr r = null;
		if (Parsing.hasTerminal(ctx.ID())) {
			if (ctx.caseBranch().size()>0) {
				ID id =  ID.IDTerm(ctx.ID());
				List<Branch> l = ctx.caseBranch().stream().map(x->Branch.branch(x)).collect(Collectors.toList());
				r = new CaseExpr(id,l);
			} else 
				Parsing.error("caseExpr, no branches "+ctx.getText());
		} else 
			Parsing.error("caseExpr missing ID "+ctx.getText());
			
		return r;
	}

	@Override
	public CaseExpr clone() {
		CaseExpr r = null;
		ID idp = id==null ? null : id.clone();
		List<Branch> branchesp = null;
		if (branches!=null) {
			branchesp = new ArrayList<Branch>();
			for (Branch b:branches)
				branchesp.add(b.clone());
		}
		r = new CaseExpr(idp,branchesp);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((branches == null) ? 0 : branches.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		CaseExpr other = (CaseExpr) obj;
		if (branches == null) {
			if (other.branches != null)
				return false;
		} else if (!branches.equals(other.branches))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
