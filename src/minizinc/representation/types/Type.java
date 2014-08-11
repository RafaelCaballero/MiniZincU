package minizinc.representation.types;

import minizinc.antlr4.MiniZincGrammarParser.TypenameContext;
import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.Parsing;
import minizinc.representation.Typeable;
import minizinc.representation.expressions.ID;

public abstract class Type implements MiniZincRepresentation, Typeable {

	/**
	 * Obtains the representation of a type name as an element of class {@link Type}
	 * typename : rint
     *    | rbool
     *    | rfloat 
     *    | ID		// for extension types or sets as ranges
     *    | typedata
     *    | range
     *    | typeset
     *     ;
	 * @param ctx The context
	 * @return The Java representation as an object of class  {@link Type} of the typename.
	 */
	public static Type typename(TypenameContext ctx) {
		Type t=null;
		if (Parsing.hasTerminal(ctx.ID())) {
			// type can be a range represented by a set or an extension		
			ID id = ID.IDTerm(ctx.ID());
			t = new TypeID(id);			
		} 
		else if (Parsing.has(ctx.rint()))
			t = new Rint();
		else if (Parsing.has(ctx.rfloat()))
			t = new Rfloat();
		else if (Parsing.has(ctx.rbool()))
			t = new Rbool();
		else if (Parsing.has(ctx.typedata())) 
			t = TypeUnion.typedata(ctx.typedata());
		else if (Parsing.has(ctx.typeset())) 
			t = TypeSet.typeset(ctx.typeset());
		else if (Parsing.has(ctx.range())) 
			t = TypeRange.range(ctx.range());
		else			
			Parsing.error("Error in typename " + ctx.getText());

		return t;
	}


}
