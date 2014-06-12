package terms;

import java.util.List;

import Path.Path;

public class SPredicate extends PredicateCall {
	public SPredicate(String name, List<Term> args) {
		super(name, args);		
	}


	public SPredicate(String name) {
		super(name);		
	}


	@Override
	public boolean standardPred() {
		return true;
	}


	@Override
	public Path getPath() {
		// TODO Auto-generated method stub
		return null;
	}

    


}
