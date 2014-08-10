package minizinc.representation.statement;

import minizinc.representation.MiniZincRepresentation;
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

	
}
