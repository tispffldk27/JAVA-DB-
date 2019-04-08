package day10;

public class InheritanceExam1 {

	public static void main(String[] args) {
		Rect c= new Rect(5,5,6,5);
		c.print();
		Rect r= new Rect(5,5,6,4);	
		r.print();
		r.resize(2,1);
		r.print();
		
		Shape s1= new Rect();
		Shape s2= new Circle();
		Shape s3 =new Shape();
		if(s1 instanceof Rect){
			Rect r1= (Rect)s1;
			r.print();
		}
		if(s3 instanceof Rect){
			System.out.println("객체 s1은 Rect로 형변환이가능");
		
		
		}
	}

}
