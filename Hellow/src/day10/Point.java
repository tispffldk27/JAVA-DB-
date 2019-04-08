package day10;

//이차원에서 한 점을 나타내는 클래스
public class Point {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void print(){
		System.out.println("("+x+","+y+")");
	}
	public void move(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void move(Point p){ 				//메소드 호출        /Point p라는 객체
		move(p.x,p.y);
	}
	public Point(){							//생성자
		move(0,0);
	}
	public Point(int x,int y){
		move(x,y);
	}
	public Point(Point p){
		move(p);
	}




}
