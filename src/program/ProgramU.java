package program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import datatypes.Tunion;

public class ProgramU extends Program{
	private List<SDataDef> data= new ArrayList<SDataDef>();
	private List<Tunion> union= new ArrayList<Tunion>();

	@Override
	public  String toString(){
		String s ="";
		Iterator<SDataDef> it = data.iterator();
		while(it.hasNext())
			s += it.next()+"\n";
		s+="\n";
		s+= super.toString();
		
		return s;
	}

	public List<SDataDef> getData() {
		return data;
	}
	public List<Tunion> getUnion() {
		return union;
	}

	public SDataDef getDataByName(String name) {
		SDataDef result = null;
		for (SDataDef j:data) {
			if (j.getDataName().getName().equals(name)) result = j;
			
		}
		
		return result;
	}
	
	public Tunion getUnionByName(String name) {
		Tunion result = null;
		for (Tunion j:union) {
			if (j.getName().equals(name)) result = j;
			
		}
		
		return result;
	}	
	
	}
	