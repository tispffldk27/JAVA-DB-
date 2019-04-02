package day6;

public class method05 {

	public static void main(String[] args) {
		
		int num1=7, num2=14;
		
		if(isComprime(num1,num2)){					//참과거짓 불러오는 
			System.out.println("두 수는 서로소");
		}else{
			System.out.println("두 수는 서로소 아님");
		}
	}	
		
		
	public static boolean isComprime(int num1, int num2){ 			//참과 거짓     위에서 num1,2불러옴
		
		if(gcd(num1,num2) ==1){			return true;
		}else 							return false;
		
		}
	
	
	
	
	public static 	int gcd(int num1,int num2){					//gcd에서 대입?계산하는과정 위에서 num1,2불러옴
		
		int gcdNum =1;								//서로소 판별하는 소스?
		for(int i=1; i<num1; i++){
			if(num1%i==0 && num2% i==0){
				gcdNum =i;
			}
		} 
		
		return gcdNum;
	}
	

	/* 기능 : 두 정수가 주어지면 서로소인지 아닌지를 참 또는 거짓으로 알려주는 메소드
	   매개변수: 두 정수 => int num1 ,num2
	   리턴타입: 참또는 거짓 => boolean
	   매소드명: isCoprime
	 
	 */
}

