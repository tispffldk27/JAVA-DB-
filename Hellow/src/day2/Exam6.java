package day2;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int num ;
		num = scan.nextInt();
		
		switch(num){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일");
			break;
		case 2:
			System.out.println("28일");
			break;
		
			
		default:
			System.out.println("잘못 입력하셨습니다");
				}
	}

}
