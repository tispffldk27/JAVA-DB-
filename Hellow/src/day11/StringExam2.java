package day11;						//문자열 교체하기

import java.util.Scanner;

public class StringExam2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str ="";
	
		System.out.print("문자열을 입력하세요.");
		str = scan.nextLine();
				
		System.out.print("교체될 문자열을 입력하세요 : ");
		String search = scan.nextLine();
				
		System.out.print("교체할 문자열을 입력하세요 : ");
		String reSearch = scan.nextLine();			
				
		
		String newStr =""; 							//선생님이한거
		newStr = str.replaceAll(search, reSearch);
		if(newStr==str){
			System.out.print("교체될 문자열이 없습니다.");
		}else{
			System.out.print("교체된 문자열 :  "+newStr);
		}
		
		/* 내가한거
		if(str.contains(search)){
			System.out.print(str.replace(search, reSearch));
		}else{
			System.out.print("교체될 문자열이 없습니다.");
		}
		*/
			
		
	
		
		scan.close();
	}

}
