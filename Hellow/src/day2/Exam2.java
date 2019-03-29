package day2;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num ;
		System.out.println("나이를 입력하세요");
		num = scan.nextInt();
		
		if ( num >= 20){
			System.out.println("성인");
		}
		//위의 조건식이 거짓이면 
		else {
			System.out.println("청소년");
		}

	}

}
