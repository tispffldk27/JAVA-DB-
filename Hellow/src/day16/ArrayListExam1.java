package day16;

import java.util.ArrayList;
import java.util.Scanner;



public class ArrayListExam1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(10);		//list.add(new Integer(10)); //익명개체  재사용불가능
		list.add(5);
		list.add(1);
		/*for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
			//순서대로 출력된다..
		
		}*/
		ArrayList<Point> pList = new ArrayList<Point>();
		Point pt= new Point();
		char mode ='y';
		Scanner scan= new Scanner(System.in);
		do{
			System.out.println("이동할 좌표를 입력하세요 (예 : 1 2 )");
			int x= scan.nextInt();
			int y= scan.nextInt();
			pt.move(x,y);
			System.out.println("이동한 현재좌표 : "+pt);
			pList.add(new Point(pt));
			System.out.println("더 하시겠습니까??(y or n)");
			mode = scan.next().charAt(0);
		}while(mode !='n');
			for(int i=0; i<list.size(); i++){
			System.out.println(pList.get(i));
		
		}
	}

}
class Point{
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void move(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void move(Point p){ 				
		move(p.x,p.y);
	}
	public Point(){							
		move(0,0);
	}
	public Point(int x,int y){
		move(x,y);
	}
	public Point(Point p){
		move(p);
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	/* 객체가 어느 그룹에 속해있는지 알려주는 메소드
		Point클래스에서는 x,y의 값이 같다는 다른 객체이더라도
		같은 그룹에 속하기 때문에 검색을 빠르게 할 수 있다.
	 */
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	//두 객체가 같은 객체로 판별할 것이지를 결정하는 메소드
	@Override
	public boolean equals(Object obj) {	
		//주소가 같은경우면 당연히 본인이기 떄문에 같은 객체
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())		//클레스 이름은 가져옴
			return false;
		Point other = (Point) obj;
		//Point 클래스에서 같은 객체는 x와y가 같은경우이다로 설정함
		if (x != other.x)				//x,y가 같은지 않같은지 확인하는 문법
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}

	
	

