package day2;

import java.util.Scanner;
//min~max ������ ������ �������� �����ϴ��ڵ�
public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int min = 1;
		int max = 3; 
		
			//min~max ������ ������ �������� �����ϴ��ڵ�
			//com�� ����(1) ����(2) ��(3)�߿��� �������� �ϳ� ����
		int com = (int)(Math.random() * (max-min +1) + min) ;
		int user = 0;
		System.out.print("<����(1) ����(2) ��(3)�� �ϳ��� �Է��Ͻÿ�: >\n");
		user = scan.nextInt();
		System.out.println(com) ;
		
		switch (user - com){
		case 2: case -1:
				System.out.println("����� �����ϴ�.");
				break;
		case 1: case -2:
			System.out.println("����� �����ϴ�.");
			break;
		case 0: 
			System.out.println("�����ϴ�.");
			
		}
		//System.out.println( com+"��ǻ�ʹ� ");
	}

}
