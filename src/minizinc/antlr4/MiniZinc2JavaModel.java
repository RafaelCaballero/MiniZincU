package minizinc.antlr4;



import minizinc.representation.model.Model;

import org.antlr.v4.runtime.misc.NotNull;

public class MiniZinc2JavaModel extends MiniZincGrammarBaseListener {

	private Model model;
	@SuppressWarnings("unused")
	private MiniZincGrammarParser parser;

	public MiniZinc2JavaModel(MiniZincGrammarParser parser) {
		this.parser = parser;
		this.model = null;
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
