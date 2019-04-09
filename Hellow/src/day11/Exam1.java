package day11;

public class Exam1 {

	public static void main(String[] args) {
		try{
		Shape s= new Shape();
		s.print();
		Shape.printCount();
		Circle c= new Circle(5,5,5);
		
		c.print();
		c.move(3,3);
		c.print();
		c.resiez(10);
		c.print();
		Circle.printCount();
		//자식 클레스를 부모 클레스로 변환할 때에는 자동 형변환이 가능하다.
		Shape s2= c;
		Shape.printCount();
		//부모클래스를 자식클래스로 변활할때에는 명시적형변환을 해야한다.
		//조건부로 가능 => 조건을 만족하지 않으면 사용할때
		//ClassCassException이 발생할 수있다
		//클래스형변환에러로 변환은 했지만 사용할 수없는 정보가 있어서 사용하지못하는경우
		//Circle c2 = (Circle)s;    //실행시 에러발생
		//c2.print();
		Shape s3= new Circle();
		Shape.printCount();
		Circle c3 = (Circle)s3;
		c3.print();
		Circle.printCount();
		
		System.out.println(s2);
	}catch(NullPointerException e){
		System.out.println("객체를 생성하고 사용하세요.");
	}catch(Exception e){
		System.out.println("예외 발생!!");
	
	}finally{
		System.out.println("프로그램종료");
	}
		
	}
}

