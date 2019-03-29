package day4;

//역 삼각형

public class Exam3 {

	public static void main(String[] args) {
		
		int i;	//줄
		int j;	//*갯수
		int num =5;
		
		          
		
		for(i=1; i<= num; i++){
			for(j=1; j<=i-1; j++){
				System.out.print(" ");
			}
			
			for(j=1; j<=2*(num-i)+1 ;j++){
					    System.out.print("*");
			}
			System.out.println();
			
		}
	
		for(i=5; i>=1;i--){
			for(j=1;j<=num-1;j++){
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++){
				System.out.print("*");
		}
		System.out.println();
		}
	
	
	
	
	}

	
}
