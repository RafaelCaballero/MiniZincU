package minizinc.representation.statement;

import minizinc.antlr4.MiniZincGrammarParser.StatContext;
import minizinc.representation.MiniZincRepresentation;
import static minizinc.representation.Parsing.has;
import static minizinc.representation.Parsing.error;
import minizinc.representation.SubExpressions;

public abstract class Statement implements MiniZincRepresentation,
		SubExpressions, Cloneable {
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
	 * Parses a MiniZinc statement and returns a new object that represents the
	 * particular statement.
	 * <p>
	 * MiniZinc grammar for statements:<br>
	 * stat: data // union types<br>
	 * | extended // extended types<br>
	 * | constraint<br>
	 * | decl<br>
	 * | solve<br>
	 * | output<br>
	 * | predicate<br>
	 * | function<br>
	 * | include<br>
	 * | init<br>
	 * 
	 * @param ctx
	 *            The context.
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
			r = Output.output(ctx.output());
		else if (has(ctx.predicate()))
			r = Predicate.predicate(ctx.predicate());
		else if (has(ctx.function()))
			r = Function.function(ctx.function());
		else if (has(ctx.include()))
			r = Include.include(ctx.include());
		else if (has(ctx.init())) {
			r = Init.init(ctx.init());
		} else
			error("Unknown statement: " + ctx.getText());

		return r;
	}

	@Override
	public String toString() {
		return print();
	}

	@Override
	public abstract Statement clone();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Statement other = (Statement) obj;
		if (type != other.type)
			return false;
		return true;
	}

}
