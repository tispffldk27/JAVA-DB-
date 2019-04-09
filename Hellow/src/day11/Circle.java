package day11;



public class Circle extends Shape {
	public double getRadius(){
		return getWidth()/2;
	}
	public double getArea(){
		return getRadius()*getRadius()*Math.PI;
	}
	
	@Override
	public void print(){
		System.out.println("=====================");
		System.out.println("중심점 : ");
		getCenter().print();
		System.out.println("반지름 : "+getRadius());
		System.out.println("넓이 : "+getArea());
		System.out.println("=====================");
	}
	
	public void resiez(double r){
		setWidth(r*2);
		setHeight(r*2);
	}
	public Circle(){}
	public Circle(int x, int y, int r){
		super(x,y,r*2,r*2);
	}
	
	
	
	
}
