/**
 * 
 */
package minizinc.representation.expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		 List<Expr> r = new ArrayList<Expr>();
		 branches.forEach(x->x.subexpressions().forEach(y->r.add(y)));
		 return r;
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

}
