package day3;    //최대공약수 출력하는방법

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
			int i, gcd=1;
			int num1=8; //입력값 1 
			int num2=12; //입력값 2
			
			/*num1 = scan.nextInt();
			num2 = scan.nextInt();         입력수넣기*/
			
			//최대공약수 num1
			for(i=1;i<=num1;i++){
				//i가 num1의 약수이(고) i가 num2의 약수이면
				if(num1 % i ==0 && num2 %i ==0 )
				{
					gcd =i;     	//gcd에 i를 저장한다.
					
				}  
										
			}
			System.out.println(num1+"과 "+num2+"의 최대 공약수 : "+gcd); //1,2,4 누적저장되는데 마지막4가출력
			
			
	}		

}
