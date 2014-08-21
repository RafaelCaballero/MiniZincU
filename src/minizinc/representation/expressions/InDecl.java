/**
 * 
 */
package minizinc.representation.expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import transformation.ExprTransformer;
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
public class InDecl implements MiniZincRepresentation, SubExpressions, Cloneable {
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

	@Override
	public  InDecl clone() {
		InDecl r = null;
		List<ID> guardp=null;
		SetExpr setExprp= setExpr==null ? null : setExpr.clone();
		BoolExpr wherep = where ==null ? null : where.clone();
		if (guard!=null){
			guardp = new ArrayList<ID>();
			for (ID id:guard) 
				guardp.add(id.clone());			
		}
		r = new InDecl(guardp,setExprp,wherep);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((guard == null) ? 0 : guard.hashCode());
		result = prime * result + ((setExpr == null) ? 0 : setExpr.hashCode());
		result = prime * result + ((where == null) ? 0 : where.hashCode());
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
		InDecl other = (InDecl) obj;
		if (guard == null) {
			if (other.guard != null)
				return false;
		} else if (!guard.equals(other.guard))
			return false;
		if (setExpr == null) {
			if (other.setExpr != null)
				return false;
		} else if (!setExpr.equals(other.setExpr))
			return false;
		if (where == null) {
			if (other.where != null)
				return false;
		} else if (!where.equals(other.where))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		List<ID> guard2 = this.applyTransformerList(t, guard);
		SetExpr setExpr2 = this.applyTransformer(t, setExpr);
		BoolExpr where2 = this.applyTransformer(t, where);
		
		guard = guard2;
		setExpr = setExpr2;
		where = where2;
		
	}

}
