package minizinc.representation.DataDef;

import java.util.ArrayList;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.ConstrContext;
import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.ID;
import minizinc.representation.types.Type;

/* 
 * Represents a data constructor with its parameters.<br>
 * Grammar:<br>
 * constr: scons | tcons; <br>
 * scons: ID ; <br>
 * tcons: ID '('typename (','typename)*')' ; <br>
 * 
 * Important: the equality uses only the name of the constructor, not is subtypes 
 */
public class DataCons implements MiniZincRepresentation, Cloneable {
	private ID cons;
	private List<Type> subtypes;

	public DataCons(ID cons) {
		this.cons = cons;
		this.subtypes = null;
		;
	}

	public void add(Type t) {
		subtypes.add(t);
	}

	public DataCons(ID cons, List<Type> subtypes) {
		this.cons =  cons;
		this.subtypes = subtypes;
	}

	public DataCons(String consName) {
		this.cons =  ID.IDTerm(consName);
		this.subtypes = null;
		
	}

	@Override
	public String print() {
		String s = "";
		if (subtypes != null) 
			s = printList(subtypes);
		if (s.equals(""))
			s = cons.print();
		else
			s = cons.print() + "(" + s + ")";
		return s;
	}

	public ID getID() {
		return cons;
	}
	/**
	 * A constructor without arguments
	 */
	public boolean isConstant() {
		return subtypes==null || subtypes.size()==0; 
	}
	
	/**
	 * Constructor identifier.
	 * @return Constructor identifier as a String.
	 */
	public String getCons() {
		return cons.print();
	}

	public List<Type> getSubtypes() {
		return subtypes;
	}

	public void setSubtypes(List<Type> subtypes) {
		this.subtypes = subtypes;
	}



	/**
	 * List of arguments in a data definition constraint. 
	 * @param ctx
	 * @return
	 */
	public static DataCons tcons(ConstrContext ctx) {
		DataCons r = null;
		ID cons=null;
		List<Type> l = new ArrayList<Type>(); 
		if (Parsing.has(ctx.scons())) {
			if (Parsing.hasTerminal(ctx.scons().ID())) {
				cons = ID.IDTerm(ctx.scons().ID());
			} else
				Parsing.error("ID constructor missing (scons) "+ctx.getText()) ;
		} if (Parsing.has(ctx.tcons())) {
			if (Parsing.hasTerminal(ctx.tcons().ID())) {
				cons = ID.IDTerm(ctx.tcons().ID());				
				ctx.tcons().typename().forEach(x -> l.add(Type.typename(x)));
			} else
				Parsing.error("ID constructor missing (tcons) "+ctx.getText()) ;			
		}
		
		// if there is no error
		if (cons!=null  )
			// no arguments
			if (l==null || l.size()==0)
				r = new DataCons(cons);
			else // arguments
				r = new DataCons(cons,l);
		
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cons == null) ? 0 : cons.hashCode());
		result = prime * result
				+ ((subtypes == null) ? 0 : subtypes.hashCode());
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
		DataCons other = (DataCons) obj;
		if (cons == null) {
			if (other.cons != null)
				return false;
		} else if (!cons.equals(other.cons))
			return false;
		if (subtypes == null) {
			if (other.subtypes != null)
				return false;
		} else if (!subtypes.equals(other.subtypes))
			return false;
		return true;
	}

	@Override
	public DataCons clone() { 
		DataCons r = null;
		ID consp = cons == null ? null : cons.clone();
		
		List<Type> subtypesp = null;
		if (subtypes!= null) {
			subtypesp = new ArrayList<Type>();
			for (Type s:subtypes) 
				subtypesp.add(s.clone());
			
		}
		r = new DataCons(consp,subtypesp);
		return r;
	}
	
	@Override
	public String toString() {
		return print();
	}

}
