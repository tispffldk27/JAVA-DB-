package day3;

public class Exam7 {

	public static void main(String[] args) {

			int i;	//ÁÙ
			int j;	//*°¹¼ö
			int num =6; 
			          
			
			for(i=1; i<=6	; i++){
				for(j=1; j<=i-1; j++){
					System.out.print(" ");
				}
				
				for(j=1; j<=num+-i ;j++){
						    System.out.print("*");
				}
				System.out.println();
			}
	}
}		
	



