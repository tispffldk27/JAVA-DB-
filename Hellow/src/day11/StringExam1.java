package day11;						//문자열 찾기

import java.util.Scanner;

public class StringExam1 {

	public static void main(String[] args) {
		
		
		
		Scanner scan =new Scanner(System.in);
		String str ="";
	
		System.out.print("문자열을 입력하세요.");
		
		str = scan.nextLine();
		System.out.print("찾을 문자열을 입력하세요 : ");
		String search = scan.nextLine();
		
		if(str.contains(search)){
			System.out.print(str+"에는 "+search+"가 있습니다");
		}else{
			System.out.print(str+"에는 "+search+"가 없습니다");
		}
		if(str.indexOf(search)>=0){
			System.out.print(str+"에는 "+search+"가 있습니다");
		}else{
			System.out.print(str+"에는 "+search+"가 없습니다");
		}
			
		
	
		
		scan.close();
	}

}
