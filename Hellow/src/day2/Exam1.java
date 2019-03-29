package day2;

import java.util.Scanner;

public class Exam1 {
//홀짝
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num ;
		num = scan.nextInt();
		if ( num % 2 == 0){
			System.out.println("짝수");
		}
		if ( num % 2 ==1 ){
			System.out.println("홀수");
		}

	}

}
