package Path;

import java.util.ArrayList;


public class Path {
	 private ArrayList<Integer> p=null;

	/**
	 * @return the path
	 */
	public ArrayList<Integer> getP() {
		return p;
	}

	/**
	 * @param p the path to set
	 */
	public void setP(ArrayList<Integer> p) {
		this.p = p;
	}

	/**
	 * @return a string representation of the path
	 */
	@Override 
	public String toString() {
		String s = "";
		
		if (p!=null)
			for (Integer i:p) s += "_"+i;
		
		return s;
	}


	
}
