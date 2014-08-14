package minizinc.representation.solve;

import minizinc.antlr4.MiniZincGrammarParser.ModeAnnotationContext;
import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.Parsing;
import minizinc.representation.SubExpressions;

public abstract class ModeAnnotation implements MiniZincRepresentation, SubExpressions {

	
	public static ModeAnnotation modeannotation(ModeAnnotationContext ctx) {
		ModeAnnotation r = null;
			if (Parsing.has(ctx.intS())) 
				r = Selection.selection("int_search",ctx.intS().restS());
			else if (Parsing.has(ctx.boolS())) 
				r = Selection.selection("bool_search",ctx.boolS().restS());
			else if (Parsing.has(ctx.setS()))
				r = Selection.selection("set_search",ctx.setS().restS());
			else if (Parsing.has(ctx.seqS())) 			
				r = SetqS.setS(ctx.seqS());
			else	
				Parsing.error("Annotation with unexpected mode "+ctx.getText());
			
		return r;
	}

	@Override
	public String toString(){
		return print();
	}


}
