package day17;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		Set s= new HashSet();
		
		for (int i= 0; s.size()<6; i++){
			int num =(int)(Math.random()*45)+1;
			s.add(new Integer(num));
		}
		List list = new LinkedList(s);
		Collections.sort(list);
		System.out.println(list);
		}
	

}
