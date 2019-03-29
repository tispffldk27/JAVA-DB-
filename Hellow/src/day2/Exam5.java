package day2;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		 Scanner scan =new Scanner(System.in);
		 //조건문 학점..  
		 int num;
		 num = scan.nextInt();
		 
		 if(num >=90 && num <=100 ){
			 System.out.println(+num+"는 A");
		 }else if(num >=80 && num <90){
			 System.out.println(+num+"는 B");
		 }else if(num >=70 && num <80){
			 System.out.println(+num+"는 C");
		 }else if(num >=60 && num <70){
			 System.out.println(+num+"는 D");
		 }else if(num >=0 && num <60){
			 System.out.println(+num+"는 F");
		 }else if(num <0 || num <100){
			 System.out.println(+num+"잘못된 점수입니다");	 
		 		 
		 }else{
			 System.out.println(num+"잘못된 점수");
		 }
		 scan.close();
		 
	}

}
