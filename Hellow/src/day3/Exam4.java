package day3;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
	
		
		int i, lcm=1;
		int num1=10; //입력값 1 
		int num2=15; //입력값 2
		
		//num1 = scan.nextInt();
		//num2 = scan.nextInt();         
		int tmp;
		if(num2>num1){
			//두 수를 바꾼다 
			tmp= num1;
			num1= num2;
			num2= tmp;
		}
		
		for(i=num1;i<=num1*num2;i+=num1){
				if(i % num2 ==0 ){
				lcm = i;
				break;
			}
		}
		System.out.println(num1+"과 "+num2+"의 최소 공약수 : "+lcm); //
	}
}
			
			
			
			
		
	


