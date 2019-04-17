package day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NumberBaseallExam {

	public static void main(String[] args) {
	//List<Integer>list =LottoExam.Ran
		/* 1. com 번호를 생성 => List =>앞에 사용했던 randomArr()		//list에 랜덤값있고
		 * 2. 반복문{
		 * 3. 숫자를 3개 입력받아 List에 저장한다						//이것도 list에 저장
		 * 4. 스트라이크 갯수 계산 => 새로운 메소드 추가
		 * 5. 볼 갯수 계산=> countList()를 통해 계산후 4에서 구한 스트레이갯수를 빼면 볼의 갯수가된다
		 * 6.출력
		 
		 */
		List<Integer> com= LottoExam.randomArr(1, 9, 3);
		List<Integer> user= new LinkedList<Integer>();
		System.out.println(com);
		int strike=0;
		int ball=0;
		Scanner scan = new Scanner(System.in);
		while(strike<3){
			//매번 입력받은 값들을 리스트에 그냥 추가하면 3개가 넘어가기 때문에
			//입력 받기전에 리스트를 비워줘야한다.
			user.clear();
			user = inputNums(scan);
			
			strike= getStrike(com, user);
			ball = LottoExam.countList(com, user)-strike;
			print(strike,ball);
			
		}
		System.out.println("정답입니다.!!");
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}
	public static int getStrike(List<Integer>com,List<Integer>user){
			int count=0;
			for(int i=0; i<com.size(); i++){
			//List.get()은 객체를 반환하기 때문에 com.get(i)==user.get(i)
			//로 작성하면 두 객체의 주소가 같은지를 확인하기 때문에 우리가 원하는 값이 같은지를 확인하지않는다
			// 그래서 equalse를 통해 값이 같은지를 확인한다
				if(com.get(i).equals(user.get(i)))
					count++;
			}
			return count;
		
		}
		public static void print(int strike,int ball){
			if(strike !=0)
				System.out.print(strike+ "S");
			if(ball !=0)
				System.out.print(ball +"B");
			if(strike==0 && ball==0)
				System.out.print("3OUT");
			System.out.println();
		}
		public static List<Integer> inputNums(Scanner scan){
			Set<Integer> set = new HashSet<Integer>();
			while(set.size()<3){
				int num = scan.nextInt();
				set.add(num);
			}
			Iterator<Integer> it= set.iterator();
			List<Integer> list = new LinkedList<Integer>();
			while(it.hasNext()){
				list.add(it.next());
			}
			return list;
		}
	
	
}
