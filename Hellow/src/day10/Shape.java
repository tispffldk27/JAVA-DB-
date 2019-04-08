package day10;

public class Shape {							//Shape 도형
	protected Point center;  //중심
	protected int width;		//가로
	protected int height;		//세로
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getWieth() {
		return width;
	}
	public void setWieth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void print(){
		System.out.print("중심점 : ");
		center.print();
		System.out.println("가로:   "+width);
		System.out.println("세로:   "+height);
	}
	public Shape(){
		center = new Point();
	}
	public Shape(int x, int y, int width, int height){
		center= new Point(x,y);
		this.width = width; this.height =height;
	}



}

	
