package day2;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		 Scanner scan =new Scanner(System.in);
		 // 2�� ����̸� 2������
		 // 3�ǹ���� 3���
		 //6����� ���
		 //2,3,6�� ������ƴϸ� �����϶��
		 //num = 6 => 6�ǹ���Դϴ�
		 
		 int num;
		 num = scan.nextInt();
		 
		 if(num %2 == 0 && num % 3 !=0){
			 System.out.println(+num+"�� 2�ǹ��");
			 
		 }else if(num % 3 ==0 && num % 2 !=0){
			 System.out.println(+num+"�� 3�ǹ��");
		 }else if(num % 6 ==0){
			 System.out.println(+num+"�� 6�� ���");
		 }else{
			 System.out.println(num+"�� 2,3,6�� ����� �ƴմϴ�");
		 }
		 
		 
		 
		
		 
	
	}


}
