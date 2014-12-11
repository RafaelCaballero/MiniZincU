package minizinc.representation.statement;

import transformation.ExprTransformer;

public class Comment extends Statement {
	protected String msg;

	public Comment(String msg) {
		super(TStatement.COMMENT);
		this.msg = msg;
	}

	@Override
	public String print() {
		return "% " + msg + "\n";
	}

	@Override
	public Comment clone() {
		return new Comment(msg);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((msg == null) ? 0 : msg.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		if (msg == null) {
			if (other.msg != null)
				return false;
		} else if (!msg.equals(other.msg))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		// no subexpressions

	}

}
