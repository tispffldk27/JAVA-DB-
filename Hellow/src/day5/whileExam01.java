package day5;

public class whileExam01 {

	public static void main(String[] args) {
		/*
		 * for(1초기화;2.5조건식; 4.7증감연산{
		 * 		3.6실행문;
		 * }
		 * 
		 * 1.5초기화;
		 * while(2.5.8조건식){
		 * 		3.6실행문;
		 * 		4.7증감연산
		 * }
		 * 
		 * 
		 * 
		 * 무한루프
		 * for ( ;  ; ){
		 * 		실행문;
		 * }
		 * 
		 * while(true){				168p 예제참조
		 * 		실행문;
		 * }
		 * 
		 */

		int i,sum;
		i=1;
		sum=0;
		while( i<=10){
			sum+=i;
			i++;
		}
			System.out.println(sum);
	}

}
