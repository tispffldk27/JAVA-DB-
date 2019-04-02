package day6;

public class method01 {

	public static void main(String[] args) {
		
//		기능 : 두 정수의 합을 알려주는 메소드
//		입력 : 이 기능을 실행할 때 필요한 정보, 두 정수=>int num1,num2
//		출력 : 이 기능을 실행하고 나서 알려주는 정보 => int 
//		이름 : sum
//
//		메소드 선언 방법
//		출력 이름(입력){
//			구현;
//		}
//		리턴타입 메소드명(매개변수){
//			구현;
		// ★★★ sum()메소드가 printSum()메소드보다 재사용성이 높다 ★★★		
		System.out.println(sum(1,2));
		printSum(1,2);
	}
	public static int sum(int num1,int num2){
			int res= num1+num2;              //num1+num2를 res에 저장하여
			return res;		   				 //res를 출력
		}
	

	/*
	  기능 : 두 수의 합을 콘솔에 출력하는 기능
	  입력 : 두 정수 => int num1, int num2;
	  출력 : 없다 -> void
	  이름 : printSum
	 */

	public static void printSum(int num1,int num2){
		System.out.println(num1+num2);
		
		
	}
	
}
