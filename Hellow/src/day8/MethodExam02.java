package day8;

public class MethodExam02 {

	public static void main(String[] args) {
		/* 기능:  두 정수의 산술 연산 결과를 알려주는  메소드
		   매개변수: int   a,int b  char ch
		   리턴타입: double
		   메소드명 :calc    (계산하다의 약자?)
		 */
		double res=calc(3,4,'%');
		System.out.println(calc(3,4,'%'));
		System.out.println(res);
		
	}

		public static double calc(int num1, int num2 ,char ch){
			double res=0.0;					//<<<<이거
			switch(ch){
			case '+': res=num1+num2;  break;
			// case '+' return num1+num2;
			case '-': res=num1-num2;  break;
			// case '-' return num1-num2;
			case '*': res=num1*num2;  break;
			// case '*' return num1*num2;
			case '/': res=num1/(double)num2;  break;
			// case '/' return num1/(double)num2;
			case '%': res=num1%num2;  break;
			// case '%' return num1%num2;			
			default : res =0.0;					//default 에  res=0.0을 줘두됨.. 그럼 위에 빼도됌 double res=0.0;
			//default: return 0.0;
			}
			return res;
		}
	
	
}
