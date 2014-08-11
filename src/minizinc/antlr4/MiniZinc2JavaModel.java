package minizinc.antlr4;

import minizinc.antlr4.MiniZincGrammarParser.ListExprContext;
import minizinc.representation.model.*;
import minizinc.representation.statement.Output;

import org.antlr.v4.runtime.misc.NotNull;

public class MiniZinc2JavaModel extends MiniZincGrammarBaseListener {

	private Model model;
	private MiniZincGrammarParser parser;

	public MiniZinc2JavaModel(MiniZincGrammarParser parser, Model m) {
		this.parser = parser;
		this.model = m;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * Do nothing; everything has been done by each statement
	 * </p>
	 * <p>
	 * Model m has already all the information
	 * </p>
	 */
	@Override
	public void exitModel(@NotNull MiniZincGrammarParser.ModelContext ctx) {
		model = Model.model(ctx);
	}

	public Model getModel() {
		return model;
	}
	
}
