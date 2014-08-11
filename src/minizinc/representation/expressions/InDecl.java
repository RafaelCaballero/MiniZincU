/**
 * 
 */
package minizinc.representation.expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import minizinc.antlr4.MiniZincGrammarParser.InDeclContext;
import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.Parsing;
import minizinc.representation.SubExpressions;
import minizinc.representation.expressions.sets.SetExpr;

/**
 * Represents MiniZinc declarations used in guards.<br>
 * Grammar:<br>
 * {@code inDecl : Guard 'in' setExpr whereCond?;} <br><br>
 * 
 * @author rafa
 *
 */
public class InDecl implements MiniZincRepresentation, SubExpressions {
	/*
	 * Non-empty list of identifiers
	 */
	protected List<ID> guard;
	protected SetExpr setExpr;
	protected BoolExpr where;
	/**
	 * Constructor for in decl without where section 
	 */
	public InDecl(List<ID> guard, SetExpr setExpr) {
		this.guard = guard;
		this.setExpr = setExpr;
		where = null;
	}

	/**
	 * Constructor for in decl with where section 
	 */
	public InDecl(List<ID> guard, SetExpr setExpr, BoolExpr where) {
		this.guard = guard;
		this.setExpr = setExpr;
		this.where = where;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		List<Expr> r = new ArrayList<Expr>();
		r.add(setExpr);
		if (where != null) r.add(where);
		return r;
	}
	
	/**
	 * Indicates if the declaration contains a where section.
	 * @return true if there is a where section, false otherwise
	 */
	public boolean hasWhere() {
		return where != null;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		// first the variables
		String s  = printList(guard);
		// now the 'in'
		s += " in "+setExpr.print();
		if (where != null)
			s += " where "+where.print();
		
		return s;
	}
	
	/*
	 * A 'in' declaration.
	 *  * Grammar:<br>
	 * {@code inDecl : Guard 'in' setExpr whereCond?;} <br><br> 
	 * @param cxt the context
	 * @return The Java representation
	 */
	public static InDecl inDecl(InDeclContext ctx) {
		InDecl t = null;
		if (Parsing.has(ctx.setExpr())){
			List<ID> ids = ctx.ID().stream().map(x->ID.IDTerm(x)).collect(Collectors.toList());
			SetExpr sexpr  = SetExpr.setExpr(ctx.setExpr());
			if (Parsing.has(ctx.whereCond())) {
				BoolExpr bexpr = BoolExpr.boolExpr(ctx.whereCond().boolExpr());
				t = new InDecl(ids,sexpr,bexpr);
			} else
				t = new InDecl(ids,sexpr);
		}	
		else
				Parsing.error("inDecl " + ctx.getText());
		
		return t;
	}


}
