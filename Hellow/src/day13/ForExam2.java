package day13;

public class ForExam2 {
		
	public static void main(String[] args) {
		int arr[] = new int[]{1,3,5,7,9,2,4,6,8};
		
		//for(int i=0;i<arr.length;i++){ 		내가한것
		//	System.out.print(arr[i]+" ");
		/*
		 
		 */
		//1다음 배열의 모든값을 출력하는 코드를 작성하세요
		for(int tmp :arr){
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		
		//2. 위에 배열에서 짝수 번지에 있는 값을 출력하세요      
		for(int i=0;i<arr.length;i+=2){	
			System.out.print(arr[i]+" ");
		}		
		System.out.println();
		
		
		
		//3. 위에 배열에서 가장 큰 수를 출력하세요.
		int max = arr[0];
		for(int tmp :arr){
			if(max<tmp){
				max = tmp;
			}
		}
		System.out.println("배열의 최댓값 : "+max);
				
				
			
		
		
		
		
				
		
		
		
	
		
		
	}

}
