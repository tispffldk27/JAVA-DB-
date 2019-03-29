package day3;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		//두 수가 서로소인지 판별하세요 
		//서로소란 두 수의 최대 공약수가 1인 두 사이의 관계를 말함
		Scanner scan = new Scanner(System.in);
	
		
		int i, gcd=1;
		int num1; //입력값 1 
		int num2; //입력값 2
		
		//num1 = scan.nextInt();
		//num2 = scan.nextInt();         
		
		//최대공약수 num1
		for(i=1;i<=num1;i++){
			//i가 num1의 약수이(고) i가 num2의 약수이면
			if(num1 % i ==0 && num2 %i ==0 ){
				gcd =i;     	//gcd에 i를 저장한다.
				
			}if(gcd ==1){
					System.out.println(num1+"과 "+num2+"서로소 관계 "+gcd);  
				}else{
					System.out.println(num1+"과 "+num2+"서로소 관계가아님 "+gcd); 	
				}
			
			
		}
	
		
	}

}
