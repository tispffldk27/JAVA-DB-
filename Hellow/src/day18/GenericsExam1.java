package day18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GenericsExam1 {  			//제네릭 클레스

	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();
		Box<String> box2 = new Box<String>();		//형변환을 자동으로해줌
		Box<Object>  box3 = new Box<Object>();
		
		//왼쪽에 인터페이스명,오른쪽에는 왼쪽에 있는 인터페이를 구현한 클래스
		//인터페이스<Integer> test = new 클래스<Integer>();
		//인쪽에 부모클래스 ,오른쪽에는 자식클레스
		//부모클래스<Integer> test2 = new 자식클래스<Integer>();
		
		Set<Integer> set = new HashSet<Integer>();
		Box<Integer> b= new Box<Integer>();
		b.add(10);
		b.add(20);
		System.out.println(b);
		System.out.println(b.size());
	}

}
class Box<T>{					//제네릭클레스
	ArrayList<T> list = new ArrayList<T>();
	void add(T item)	{list.add(item);	}
	T get(int i)		{return list.get(i);}
	ArrayList<T>getList(){return list;}
	int size()			{return list.size();}
	public String toString() {return list.toString();}
}


