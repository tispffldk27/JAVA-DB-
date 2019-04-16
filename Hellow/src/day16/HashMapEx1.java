package day16;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap map = new HashMap(); 			//map에 아이디 비번 저장
		map.put("myid", "1234");
		map.put("asdf", "1111");
		//key 값이 중복됬을 때 value를 어떻게 처리할 것인가?
		//key 값이 중복되면 value의 갚을 덮어쓴다
		map.put("asdf", "1234");
		
		Scanner s= new Scanner(System.in); 		//스캐너
		
		while(true){
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id : ");
			String id= s.nextLine().trim(); 		//trim() 공백열없애주는것..
			
			System.out.print("password: ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)){
				System.out.println("입력하신 id는 존재하지않습니다"+ " 다시입력해주세요.");
				continue;
			} else {
				if(!(map.get(id)).equals(password)){
					System.out.println("비밀번호가 일치하지않습니다. 다시입력해주세요");
				}else{
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			}
			
		}
	}

}
