package day3;    //�ִ����� ����ϴ¹��

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
			int i, gcd=1;
			int num1=8; //�Է°� 1 
			int num2=12; //�Է°� 2
			
			/*num1 = scan.nextInt();
			num2 = scan.nextInt();         �Է¼��ֱ�*/
			
			//�ִ����� num1
			for(i=1;i<=num1;i++){
				//i�� num1�� �����(��) i�� num2�� ����̸�
				if(num1 % i ==0 && num2 %i ==0 )
				{
					gcd =i;     	//gcd�� i�� �����Ѵ�.
					
				}  
										
			}
			System.out.println(num1+"�� "+num2+"�� �ִ� ����� : "+gcd); //1,2,4 ��������Ǵµ� ������4�����
			
			
	}		

}
