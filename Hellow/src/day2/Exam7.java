package day2;

import java.util.Scanner;
//min~max 사이의 정수를 랜덤으로 생성하는코드
public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int min = 1;
		int max = 3; 
		
			//min~max 사이의 정수를 랜덤으로 생성하는코드
			//com이 가위(1) 바위(2) 보(3)중에서 랜덤으로 하나 선택
		int com = (int)(Math.random() * (max-min +1) + min) ;
		int user = 0;
		System.out.print("<가위(1) 바위(2) 보(3)중 하나를 입력하시오: >\n");
		user = scan.nextInt();
		System.out.println(com) ;
		
		switch (user - com){
		case 2: case -1:
				System.out.println("당신이 졌습니다.");
				break;
		case 1: case -2:
			System.out.println("당신이 졌습니다.");
			break;
		case 0: 
			System.out.println("비겼습니다.");
			
		}
		//System.out.println( com+"컴퓨터는 ");
	}

}
