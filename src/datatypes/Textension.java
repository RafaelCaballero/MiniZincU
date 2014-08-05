package datatypes;

import terms.StringC;
import terms.Term;

public class Textension extends Type {
	private String name;

	public Textension(String name) {
		super(TType.EXTENSION);
		this.name = name;
	}

	@Override
	public String rhsString() {
		return name;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean basic() {
		return false;
	}

	@Override
	public Term zero() {
		return new StringC("Error");
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}

		Textension c = (Textension) obj;
		return name != null && c.name != null && name.equals(c.name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

}
