package day8;

public class MethodExam03 {

	public static void main(String[] args) {
		/* 기능: 단(구구단)을 출력하는 기능
		   매개변수: int num1 (
		   리턴타입: void (for문으로 반복제한둠)
		   메소드명 :printMultiTable    
		 */
		printMultiTable(4);
	
	}

	public static void printMultiTable(int num1){
		
		for(int i=1;i<=9;i++){				//뒷자리
			System.out.println(num1+"X"+i+"="+num1*i);
			
			
		}
	}
}

