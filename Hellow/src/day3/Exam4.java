package day3;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
	
		
		int i, lcm=1;
		int num1=10; //�Է°� 1 
		int num2=15; //�Է°� 2
		
		//num1 = scan.nextInt();
		//num2 = scan.nextInt();         
		int tmp;
		if(num2>num1){
			//�� ���� �ٲ۴� 
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
		System.out.println(num1+"�� "+num2+"�� �ּ� ����� : "+lcm); //
	}
}
			
			
			
			
		
	


