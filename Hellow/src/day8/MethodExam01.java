package day8;

public class MethodExam01 {

	public static void main(String[] args) {
		/* 기능:  두 정수의 합을 알려주는 메소드
		   매개변수: int   a,b
		   리턴타입: int
		   메소드명 :sum
		 */
		int a= sum(1,3);							//4 sum의값을 a에 저장하고
		System.out.println(a);					//5 	a를 출력을 한다
	}
		public static int sum(int num1, int num2){   //1   두 정수를 입력받기위해 num1,2를 선언
			int res = num1 + num2;					//2 int res를 만들고  num1과 2의 합을 res에 저장
			
			return res;	//res를빼고 num1 +num2;로적어서 바로올려줄수도있다.//3 res에 저장된값을 위로 올려줌
			
			}
	
	
	
}
