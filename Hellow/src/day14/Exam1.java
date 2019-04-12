package day14;

public class Exam1 {

	public static void main(String[] args) {
		int num=0;
		try{
			num=1/0;
		}catch(ArithmeticException e){
			System.out.println("계산관련 예외가 발생했습니다.");
			e.printStackTrace();
				
		}catch(Exception e){				//캐치  이셉션 e는 맨마지막에 와야한다. 최종클래스가 Exception이라.
											//위에서 아래로 실행되다보니 이셉션이 젤 마지막에 써야한다.
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println(num);
	}
	public static double calc(double num1,double num2,char op) 
			throws Exception,ArithmeticException{
		double res =0.0;
		if((op== '/'|| op=='%') &&num2==0.0) 
			throw new ArithmeticException("0으로 나눌수 없습니다.");
		switch(op){
		case '+': res= num1 + num2 ; break;
		case '-': res= num1 - num2 ; break;
		case '*': res= num1 * num2 ; break;
		case '/': res= num1 / num2 ; break;
		case '%': res= num1 % num2 ; break;
		default :
			throw new Exception("잘못된 연산자입니다.");
		}
		return res;
	}
}
