package day16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackQueueEx {

	public static void main(String[] args) {
		Stack st=  new Stack();
		/*   Queue : 인터페이스
		     Queue라는 인터페이스를 구현한 클래스를(LinkedList) 이용하여
		     Queue 인터페이스의 객체를 생성할 수 있다.
		 */
		
		Queue q= new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= stack =");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}
}
