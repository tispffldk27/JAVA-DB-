package day2;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		 Scanner scan =new Scanner(System.in);
		 //���ǹ� ����..  
		 int num;
		 num = scan.nextInt();
		 
		 if(num >=90 && num <=100 ){
			 System.out.println(+num+"�� A");
		 }else if(num >=80 && num <90){
			 System.out.println(+num+"�� B");
		 }else if(num >=70 && num <80){
			 System.out.println(+num+"�� C");
		 }else if(num >=60 && num <70){
			 System.out.println(+num+"�� D");
		 }else if(num >=0 && num <60){
			 System.out.println(+num+"�� F");
		 }else if(num <0 || num <100){
			 System.out.println(+num+"�߸��� �����Դϴ�");	 
		 		 
		 }else{
			 System.out.println(num+"�߸��� ����");
		 }
		 scan.close();
		 
	}

}
