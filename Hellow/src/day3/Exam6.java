package day3;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");*/
			int i;	//줄
			int j;	//*갯수
			int num; //공백
			int cnt;
			          
			
			for(i=1; i<=6	; i++){
				for(num=1; num<=6-i ;num++){
						System.out.print(" ");
			    	}for(j=1 ; j<=2*i-1	; j++)
			    				    		
			    	{
			    		
			    		System.out.print("*");
				
				}
				System.out.println();
			}
			
	}

}
