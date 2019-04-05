package day9;

import java.util.Scanner;

//다른패키지에 있는 public 클래스를 사용하려면
//import 패키지.클래스명;
//을 선언해야 해당 클래스를 사용할 수 있따.
public class classExam01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//int num = scan.nextInt(); 			//nextInt();는 Scanner 클래스의 맴버 메소드
		//char ch = scan.next().charAt(0);    //charAt();는 String클래스의 맴버 메소드
		scan.close();  								//.앞에있으면 자료형이다?
		
		Tv tv= new Tv();
		tv.printChannel();
		
		Tv tv2 = new Tv();					// tv , tv2는   Tv에서 정보를 불러오는데
		tv2.printChannel();					
		
		Tv tv3 = tv;				
		//tv랑 tv3끼리 연결 정보공유
		
		System.out.println(tv.BRAND);
		
	}

}
