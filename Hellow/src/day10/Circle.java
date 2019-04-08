package day10;

public class Circle extends Shape {
	private int radius;  			//반지름

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override                       //오버라이딩한 표시
	public void print(){
		System.out.print("중심점 : ");
		center.print();
		System.out.println("반지름:   "+radius);
		
	}
	public Circle(){
		
	}
	public Circle(int x, int y ,int r){
		super(x,y,r,r); 			//super는 부모클레스를 뜻함 자동생성됨
		radius=r;
	}
}
