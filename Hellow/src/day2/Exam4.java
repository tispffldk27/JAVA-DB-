package day2;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		 Scanner scan =new Scanner(System.in);
		 // 2의 배수이면 2배수출력
		 // 3의배수면 3배수
		 //6배수면 배수
		 //2,3,6의 배수가아니면 ㅏㅇ니라고
		 //num = 6 => 6의배수입니다
		 
		 int num;
		 num = scan.nextInt();
		 
		 if(num %2 == 0 && num % 3 !=0){
			 System.out.println(+num+"는 2의배수");
			 
		 }else if(num % 3 ==0 && num % 2 !=0){
			 System.out.println(+num+"는 3의배수");
		 }else if(num % 6 ==0){
			 System.out.println(+num+"는 6의 배수");
		 }else{
			 System.out.println(num+"는 2,3,6의 배수가 아닙니다");
		 }
		 
		 
		 
		
		 
	
	}


}
