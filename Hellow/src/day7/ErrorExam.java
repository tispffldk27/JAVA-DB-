package day7;

public class ErrorExam {

	public static void main(String[] args) {
		// 에러내용: The local variable *** may not have been initialized
		// 에러원인: 지역변수를 초기화 하지않고 사용하는경우
		// 해결방법: 해당 지역변수를 초기화한다
		
		//int num;
		//System.out.println(num);
	
		
		// 에러내용: java.lang.ArrayIndexOutOfBoundsException: 5
		// 에러원인: 배열의 유효하지 않는 번지로 접근하는경우
		// 해결방법: 배열의 유효로 번지로 접근한다
		int []arr = new int[5];
		//arr[5] =1; //에러발생코드4

		
		
		
		// 에러내용: java.lang.Error: Unresolved compilation problem: 
		// 에러원인: }실수
		// 해결방법: }의 짝을 맞춘다
		
		for(int i=0; i<5; i++){ //에러코드 발생 5 (괄호 닫는거뺌)
			
		

	
	
	
	}

}
