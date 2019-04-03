package day7;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		//4. 콘솔을 통해 3개의 정수를 입력받아 배열을 저장하는코드를작성
		//방법1
		Scanner scan= new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int []arr= new int[3];
		arr[0]= num1;
		arr[1]= num2;
		arr[2]= num3;
		
		for(int tmp:arr)
			System.out.print(tmp+" ");
		System.out.println();
		//방법2
		arr[0]=scan.nextInt();
		arr[1]=scan.nextInt();
		arr[2]=scan.nextInt();
		for(int tmp:arr)
			System.out.print(tmp+" ");
		System.out.println();
		//방법3
		
		for(int i= 0 ; i<arr.length;i++)
			arr[i]=scan.nextInt();
				for(int tmp:arr)
			System.out.print(tmp+" ");
		System.out.println();
		scan.close();
	
	}

}
