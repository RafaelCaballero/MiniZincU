package minizinc.representation.statement;

import minizinc.antlr4.MiniZincGrammarParser.StatContext;
import minizinc.representation.MiniZincRepresentation;
import static minizinc.representation.Parsing.has;
import static minizinc.representation.Parsing.error;
import minizinc.representation.SubExpressions;


public abstract class Statement implements MiniZincRepresentation, SubExpressions {
	private TStatement type;

	public Statement(TStatement type) {
		this.type = type;
	}

	
	/**
	 * @return the type
	 */
	public TStatement getType() {
		return type;
	}
	
	/**
	 * Parses a MiniZinc statement and returns a new object that represents the particular
	 * statement.
	 * <p>
	 * MiniZinc grammar for statements:<br>
	 * stat: data  // union types<br>
     *| extended // extended types<br>
     *| constraint<br>
     *| decl<br>
     *| solve<br>
     *| output<br>
     *| predicate<br>
     *| function<br>
     *| include<br>
     *| init<br>
	 * @param ctx The context.
	 * @return A new statement.
	 */
	public static Statement statement(StatContext ctx) {
		Statement r = null;
		if (has(ctx.data()))
			r = DataDef.data(ctx.data());
		else if (has(ctx.extended()))
			r = Extended.extended(ctx.extended());
		else if (has(ctx.constraint()))
			r = Constraint.constraint(ctx.constraint());
		else if (has(ctx.decl()))
			r = Decl.decl(ctx.decl());
		else if (has(ctx.solve()))
			r = Solve.solve(ctx.solve());
		else if (has(ctx.output()))
		else if (has(ctx.predicate()))
		else if (has(ctx.function()))
		else if (has(ctx.include()))
		else if (has(ctx.init()))
		else 
			error("Unknown statement: "+ctx.getText());
			
			
		return r;
	}


	
}
