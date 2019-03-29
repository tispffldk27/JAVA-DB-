package day4;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num1,num2;
		char op;
		 
		num1 = scan.nextInt();
		op =scan.next().charAt(0);  //연산자를 입력받는것
		num2 = scan.nextInt();

			

		switch(op){  					 //op를 적은건 char op에 저장후 입력시 불려오기위함
		case '+':
			System.out.println(" " + num1 +op+num2+"="+(num1+num2));
			break;
		case '-':
			System.out.println(" " + num1 +op+num2+"="+(num1-num2));
			break;
		case '*':
			System.out.println(" " + num1 +op+num2+"="+(num1*num2));
			break;
		case '/':
			switch(num2){
			case 0:
				System.out.println("0으로 나눌 수 없습니다");
				break;
			 default:
					System.out.println(" " + num1 +op+num2+"="+((double)num1/num2));
			
		
			
			}
			default:
				System.out.println(op+"는 잘못된 산술 연산자 입니다.");
		
		}	
		
		
	}
		
		
		
		
		
}
	


