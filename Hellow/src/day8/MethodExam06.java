package day8;

public class MethodExam06 {

	public static void main(String[] args) {
		
		
		printMultiTables();
			
	}

	public static void printMultiTable(int num1){
		
		for(int i=1;i<=9;i++){				// 뒷자리 					 
			System.out.println(num1+"X"+i+"="+num1*i);
		}

	}	
			
	public static void printMultiTables(int start ,int end){ //앞자리 ~ 뒷자리까지
		for( ;start<=end;start++){				
			printMultiTable(start);
			
		}
	}
			/*
			 	기능: 구구단 전체 (2단~9단)이 출력되는기능
			 
			 
			 */
	public static void printMultiTables(){
			printMultiTables(2,9);
		
		}
			
}
		

	
	
	
	
	
	
	
	

	
		
		