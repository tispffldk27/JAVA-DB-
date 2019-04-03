package day7;

public class Exam {

	public static void main(String[] args) {
	

	
		
	
	}
	/* 기능 : 배열을 num로 초기화하는 메소드
	  매개변수: 배열, num=> int[] arr, int num
	 리턴타입 : 없다 => void
	 메소드명 : initArr
	 */
	public static void initArr(int[] arr, int num){ //초기화 한다 initArr라고함
		 arr= new int[10];
		for(int i=0 ; i<arr.length; i++){
			arr[i] = num;
		}
		
	}
	public static void printArr(int[] arr){ 
		for(int tmp:arr){
			System.out.println(tmp+ " ");
		}
	
		System.out.println();
	
	
}
}