package day3;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		//�� ���� ���μ����� �Ǻ��ϼ��� 
		//���μҶ� �� ���� �ִ� ������� 1�� �� ������ ���踦 ����
		Scanner scan = new Scanner(System.in);
	
		
		int i, gcd=1;
		int num1; //�Է°� 1 
		int num2; //�Է°� 2
		
		//num1 = scan.nextInt();
		//num2 = scan.nextInt();         
		
		//�ִ����� num1
		for(i=1;i<=num1;i++){
			//i�� num1�� �����(��) i�� num2�� ����̸�
			if(num1 % i ==0 && num2 %i ==0 ){
				gcd =i;     	//gcd�� i�� �����Ѵ�.
				
			}if(gcd ==1){
					System.out.println(num1+"�� "+num2+"���μ� ���� "+gcd);  
				}else{
					System.out.println(num1+"�� "+num2+"���μ� ���谡�ƴ� "+gcd); 	
				}
			
			
		}
	
		
	}

}
