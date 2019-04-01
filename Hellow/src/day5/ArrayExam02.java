package day5;

public class ArrayExam02 {

	public static void main(String[] args) {
		/* 7개를 저장할 수 있는 정수형 배열을 생성하고
		 * 0번지에는 0 ~6번지에서 6
		 */

		
		int [] arr ;
		arr = new int[7];
		int i=0;
	
		for(i=0; i<arr.length ;i++){
			
		
			
			arr[i]=	(int) (1+45*Math.random());	
			System.out.println(arr[i]);
	
		}

		
		
	}
	

	
	
}
