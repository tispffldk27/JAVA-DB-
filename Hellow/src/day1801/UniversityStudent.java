package day1801;



public class UniversityStudent {
	private String name;   					//학생이름  String(클래스같은개념?)안에 name
	private int grade;						//학생 학년
	private int classNum;					//학생 반
	private int num;						//학생 번호
	private double kor;						//국어
	private double eng;						//영어
	private double math;					//수학
	private Gender gender;					//성별
	private Major major;					//학과
	
		
	public Gender getGender() {
		return gender;
	}
	public Major getMajor() {
		return major;
		
		
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public int getNum() {
		return num;
	}
	public double getKor() {
		return kor;
	}
	public double getEng() {
		return eng;
	}
	public double getMath() {
		return math;
	}
	public void setName(String name) {
		if(name.length()<=5)   //이름이 5글자를 넘기지않게한것 lenght()는 글자수를알려주는것?
		//name =name ;           매개변수 = 매개변수;
		/* 멤버변수 name에 매개변수 name을 저장해라 라고 하였으나
		 	우선순위가 멤버변수보다 매개변수 또는 지역변수가 크기때문에
		 	위에 주석처리한 코드는 의미가없어진다.
		 	매개변수 또는 지역변수의 이름이 멤버 변수와 동일한경우
		 	멤버변수와 매개변수(지역변수)를 구분하기위해  this.을 앞에 붙인다.
		 	this : 나(현재클래스)
		 	.  : 멤버 변수나 멤버 메소드를 호출하는 연산자로 클래스나 객체명 다음에온다.
		 	this. 하면 현재클레스에서 호출한다 란뜻
		 */
			
			
			
			
		this.name = name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public void setKor(double kor) {					//setKor,Ent,Math수정
		if(kor>=0 && kor<=100)							//0에서 100점으로 점수설정 
		this.kor = kor;
	}
	public void setEng(double eng) {
		if(eng>=0 && eng<=100)
		this.eng = eng;
	}
	public void setMath(double math) {
		if(math>=0 && math<=100)
		this.math = math;
	}
	/*생성자 : 객체를 만들 때(new 연산자를 호출한 시점) 멤버 변수를 원하는 값으로 초기화 하고싶을때
		        생성자를 구현을 해준다.
		        생성자를 하나도 구현하지 않으면 기본 생성자가 자동으로 만들어진다.
		        단, 생성자가 하나라도 구현되어 있으면 기본 생성자가 자동으로 만들어지지 않는다.
	*/
	public UniversityStudent(){
		init();
		gender = Gender.MALE;
		major = Major.NONE;
		
	}
	//값을 직접 입력받았을경우 init에 저렇게 저장?
	public UniversityStudent(String name,int grade , int classNum, int num,double kor, double eng, double math){
		init(name,grade,classNum,num,kor,eng,math,gender,major);
	}
	//복사생성자
	public UniversityStudent(UniversityStudent s){    //s에다가 name,grade,classNum을 입력
		init(s.name,s.grade,s.classNum,s.num,s.kor,s.eng,s.math,s.gender,s.major);
	} 
	
	
	
	//멤버 변수를 초기화 하는 메소드
	public void init(){
			init("",1,1,1,0,0,0,gender,major);
	}
	
	public void init(String name,int grade , int classNum, int num,double kor, double eng, double math,Gender gender,Major major){
		this.setName(name);
		this.setGrade(grade);
		this.setClassNum(classNum);     
		this.setNum(num);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
		this.setGender(gender);
		this.setMajor(major);
		
		
	}
	
	
		
		
		
	
	//전체값을 출력하기위해 toString을 호출하면
	@Override
	public String toString() {
		return "Student [이름=" + name + ", 학년=" + grade + ", 반" + classNum + ", 번호=" + num + ", 국어=" + kor
				+ ", 영어=" + eng + ", 수학=" + math + " 성별=" + gender + " 학과=" + major + "] ";
	}
	
	

	

	

	
	
	





}
