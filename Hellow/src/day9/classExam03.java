package day9;

public class classExam03 {

	public static void main(String[] args) {
		
		Tv t1= new Tv();
		t1.printChannel();
		t1.printVolumn();
		
		Tv t2= new Tv(100,15);
		t2.printChannel();
		t2.printVolumn();
		
		
		//t3를 생성해서 t2의 값으로 초기화 (즉 t3에 t2가 정보가있음)
		Tv t3= new Tv(t2);
		System.out.println("t3");
		t3.printChannel();
		t3.printVolumn();
		t3.volumnDonw();
		System.out.println("t3 소리줄이기 실행후 t3");
		t3.printVolumn();
		System.out.println("t3 소리줄이기 실행후 t2");
		t2.printVolumn();
		
		
		
		
		//t4를 생성하지않고 t3의 다른이름으로 t4를 라부른다
		Tv t4= t3;
		System.out.println("t3 소리줄이기 실행후 t4");
		t4.printVolumn();

			}

}
