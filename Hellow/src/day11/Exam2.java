package day11;							//try ,catch

public class Exam2 {

	public static void main(String[] args) {
		int num1=1,num2=0;
		int res;
		int arr[] =new int[10];
		try{
			//예외상황이 발생할 수 있는 코드
			//ArithmeticException가 발생 할 수 있따
			
			//arr[10]= 0;
			
			
			res=num1/num2;			//ArithmeticException이 발생 할 수 있다.
			System.out.println(res);
		}
		//try문에서 ArithmeticException이 발생하면
		//아래 catch문을 실행하고 다음 코드를 실행해라.
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			System.out.println("연산예외발생!!!");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열 예외 발생!");
		}catch(Exception e){								//Exception 은 else로 보면된다 이셉션!
			System.out.println("예외발생!!");
		}
		System.out.println("프로그램종료!!");
		
	
	}
	

}

	
	


