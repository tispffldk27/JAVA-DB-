package day8;
/*
   public : 접근제한자
   	클래스에 public을 붙일수 있는 경우는 단 하나이다.
   	클래스명과 파일명이 일치하는 경우에만 public을 붙일수 있다.
   	
   	접근제한자 - default
 	접근제한자 default는 default라는 키워드를 쓴 것이 아니라 클래슨 ㅏ메소드에
 	접근제한자를 명시하지않는 경우를 default라 한다.
 	default는 같은 패키지 안에서만 접근 가능하다.   (맨위에 day8에서만 불러올수있음)
 	
 	접근제한자 -  private
 	일반적으로 맴버 메소드나 맴버 변수에 붙이고
 	(해당 맴버 메소드를 포함하는 클레스)을 제외한 다른 클래스에서 사용 할 수 없다.
 */
public class ClassExam01 {

	public static void main(String[] args) {
		Tv t = new Tv();				//객체 선언                  t라는 객체를 선언함.
		t = new Tv();			//Tv()라는 생성자를 호출해서 객체를 생성
		t.printvolumn();
		t.volumnDown();
		t.printvolumn();
		
	}

}

class Tv{
	//일반적으로 맴버 변수는 접근제한자를 private(사생활)로 설정하여
	//맴버 변수를 직접 수정할 수 없게 하고, 맴버 메소드를 통해 수정하도록 한다
	//맴버 변수 : 부품 , 요소
	
	private int channel;
	private int volumn;
	private final int 	MAX_CHANNEL = 100;
	private final int 	MAX_VOLUMN  = 100;

	
	
	
	//맴버 메소드 : 기능
	//일반적으로 맴버 메소드는 접근제한자를 public로 많이한다.
	
	/*기능  : 맴버변수 volumn의 크기를 하나 증가하는 메소드
	  매개변수: 없다 - void(써도되고 안써도된다)
	  리턴타입: 없다 - void(써야한다)
	  메소드명:volumnUp
	*/
	public void volumnUp(){															//볼륨에 관한것
		if(MAX_VOLUMN > volumn)
			volumn++; } 			
	public void volumnDown(){		
		if(volumn >  0)
		volumn--; 
	}
	public void printvolumn(){	System.out.println(volumn); }  
	
	
	public void channelUp(){															//채널에 관한것
		if(MAX_CHANNEL > channel)
			channel++; } 			
	public void channelDown(){		
		if(channel >  0)
			channel--; 
	}
	public void printchannel(){	System.out.println(channel); } 
	
	
	public void setChannel(int ch){
			channel= ch;
	}
	
	
	
	
	
	
	
	
	//볼륨 업
	//볼륨 다운
	//채널 업
	//채널 다운
	//채널변경
	
	
	
}