package day16;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);     //ArrayList에 5,4,2,0,1,3
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		//생성자 오버로딩을 사용: 매개변수가 List인 경우
		ArrayList list2 = new ArrayList(list1.subList(1, 4));  //sublist란 부분리스트
		print(list1,list2);
		
		Collections.sort(list1);				//sort는 정렬을 하는것
		Collections.sort(list2);
		//list2가 list1의 부분집합인지 물어보는것
		System.out.println("list.containsAll(list2) :" +list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A"); 		//insert 3번지의 값을  밀어버리고 A란 값을 추가한것
		print(list1,list2);
		list2.set(3,"AA");		//update 3번지의 값을 덮어쓰기하는것
		print(list1,list2);
		//겹치지 않는 내용이 있어서 삭세가 되면 true , 삭제가 안되면 false  
		//list 1을 기준으로 list2
		System.out.println("list1.retaintALL(list2): "+list1.retainAll(list2));
		print(list1,list2);
		
		//0번지부터 시작을하면 remove()에 의해 삭제가 되면  확인해야하는 내용이 있는 번지가 변경이 되어 확인하지않는
		//원소가 생길수 있기 때문에 거꾸로 확인해야한다.
		
		for(int i=list2.size()-1; i>=0; i--){ 		//거꿀로 작업을해야한다 번지수가 삭제됨
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1,list2);
	
	}
	static void print(ArrayList list1,ArrayList list2){
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}
}
