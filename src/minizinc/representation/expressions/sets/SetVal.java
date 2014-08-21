/**
 * 
 */
package minizinc.representation.expressions.sets;

import minizinc.antlr4.MiniZincGrammarParser.SetValContext;
import minizinc.representation.Parsing;

/**
 * A set value. Grammar:<br>
 * setVal : bracketExpr | range | guardedSet ;
 * @author rafa
 *
 */
public abstract class SetVal extends SetExpr {

	/**
	 * Set values. Grammar:
	 * setVal : bracketExpr | range | guardedSet ;<br>
	 * bracketExpr : '{' '}' | '{'  commaList '}';<br>
	 * @param ctx
	 * @return
	 */
	public static SetVal setVal(SetValContext ctx) {		
		SetVal t=null;
		
		if (Parsing.has(ctx.bracketExpr())) 
			t = BracketExpr.bracketExpr(ctx.bracketExpr());
		else if (Parsing.has(ctx.range())) 
			t = RangeSetVal.rangeSetVal(ctx.range());
		else if (Parsing.has(ctx.guardedSet())) {
			t = GuardedSet.guardedSet(ctx.guardedSet());
		} else 
			Parsing.error("setVal " + ctx.getText());
		
		return t;
	}

	@Override
	public abstract SetVal clone();

}
