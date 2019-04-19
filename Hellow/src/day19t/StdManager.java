package day19t;

import java.awt.event.ItemEvent;
import java.util.*;

import day19.Std;

public class StdManager {
			
	private HashSet<Std> list = new HashSet<Std>();
	
	public boolean insert(Std s){
		
	  Std tmp = new Std(s);
	  return list.add(tmp);
	}
	
	public Std search(Std s){
		Iterator<Std> it = list.iterator();
		while(it.hasNext()){
			Std tmp= (Std)it.next();
			if(tmp.equals(s))
				return tmp;
		}
				return null;
	}
	public boolean delete(Std s){
	
		Std tmp=search(s);
		return list.remove(tmp);
	}


	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
}
