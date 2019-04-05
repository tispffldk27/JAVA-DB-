package day9;

public class Tv {							//Tv라는 설계도 
	//일반 맴버 변수,객체 맴버 변수
	private int channel;   
	private int volumn;
	private final int MAX_CHANNEL = 500;
	private final int MAX_VOLUMN = 100;
	
	//클래스 맴버 변수     static이 붙음
	public static final String BRAND = "삼성";
	
	//일반 맴버 메소드, 객체 맴버 메소드
	public void channelUP(){
		if(channel <MAX_CHANNEL) 		//채널이 맥스보다 작으면 	
		channel++;						//++ 증가
	}
	public void channelDown(){
		if(channel>1)					//채널1번으로 설정
			channel--;
	}
	public void setChannel(int ch){ 		//직접 채널번호를 입력하는경우
		if(ch==0)					//ch가 0이면 (채널이 0이면)
			channel =1;				//1로 하겠다..
		else if(ch >MAX_CHANNEL)   //ch가 맥스채널보다 크다면
			channel = MAX_CHANNEL;  //맥스채널인 500값으로 고정
		else
			channel =ch;
	}
	public void volumnUP(){
		if(MAX_VOLUMN > volumn)
			volumn++;
	}
	
	public void volumnDonw(){
		if(volumn >0)
			volumn--;
	}
	
	public void printVolumn(){
		System.out.println("현재 소리크기:  "+volumn);
	}
	public void printChannel(){
		System.out.println("현재 채널번호:  "+channel);
		/*객체 맴버 메소드에서 클래스 멤버 변수 또는 클래스 멤버 메소드 사용할 수 있다
		 System.out.println(BRAND);
		*/
	}
	
		
	public static void printBrand(){
		System.out.println("Tv 브랜드 :"+BRAND);
		/*클래스 멤버 메소드에는 클래스 멤버 변수는 사용 가능하지만
			객체 멤버 변수는 사용할 수 없다.
		   System.out.println(channel);
		 */
	}
	//맴버 메소드는 원하는 시점에서 호출이 가능하지만
	//생성자는 객체를 생성할때에만 호출한다.
	//객체 맴버 변수를 초기화
	//생성자가 없을때 기본생성자가 컴파일러에 의해 자동으로 추가된다.
	//기본 생성자 없이 다른 생성자를 만들고 기본생성자를 호출하면 에러가 난다.
	public Tv() {
		this(1,10);
		//channel =1;
		//volumn =10;
		
		
	}
	public Tv(int ch, int volumn){ 				//채널이랑 볼륨 입력값이 맥스값인 500보다 크게 들어왔을경우
		setChannel(ch);						//기존에 만들어둔 setChannel을 호출해서 처리하게끔 한다
		if(volumn > MAX_VOLUMN)					// 볼륨통제는 한게없엇으므로 여기서 입력
			this.volumn = MAX_VOLUMN;			//★★★this. 매개변수로 바꿔줄수있따. ★★★
		else 
			this.volumn =volumn;
	
	}
	//복사 생성자라고 불림
	public Tv(Tv stv){
		this(stv.channel,stv.volumn);    //아래 82,83줄소스를 한줄로 요약가능
		/*
		  channel=stv.channel;
		  volumn=stv.volumn; 
		*/
	}
	
	
	
}
