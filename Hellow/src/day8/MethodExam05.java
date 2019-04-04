package day8;								//재귀호출

public class MethodExam05 {

	public static void main(String[] args) {
		//java.lang.StackOverflowError  라는 오류가 발생함         이런내용이면 재귀호출을 했다는것 
		
		
		System.out.println(factorial(5));
	
	}

	/* 기능: 정수 num이 주어지면 정수 num!을 알려주는 메소드
	   매개변수:int num 
	   리턴타입: num! = int
	   메소드명 : factorial
	 */
	public static int factorial(int num){
		if (num==1 || num==0)
			return 1;
		if(num < 0 )			//num 이 0보다 작으면
			return -1;
		return factorial(num-1)*num;		//재귀호출
		
	}
	
		//잘못된 재귀메소드 예제
	public static void print(){
		System.out.println("Hellow");
		print();
	}
	
}
