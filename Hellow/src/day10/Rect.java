package day10;

public class Rect extends Shape {
	private int area;
	
	
	public int getArea() {
		return area;
	}
	
	
	public Rect(){}
	public Rect(int x, int y , int w, int h){
		super(x,y,w,h);
		area = w *h;								//네모사이즈
	}
	@Override
	public void print(){							//네모출력
		super.print();
		System.out.println("넓이 :"+area);
	}
	public void resize(int width, int height){		//크기재설정
		this.width = width;
		this.height= height;
		area = width * height;
		
	}
}
