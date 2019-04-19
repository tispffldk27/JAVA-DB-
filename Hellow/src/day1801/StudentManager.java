package day1801;

import java.util.Scanner;



public class StudentManager {
	
	private UniversityStudent std[];      //학생들 정보를 담을 배열 				
	private int count;			//현재 저장된 학생수
	private final int MIN_STUDENT_COUNT =300;
	
	public StudentManager(){
		std= new UniversityStudent[MIN_STUDENT_COUNT];
	}
	public StudentManager(int stuedentCnt){
		if(stuedentCnt >= MIN_STUDENT_COUNT )
			std= new UniversityStudent[stuedentCnt];
		else
			std= new UniversityStudent[MIN_STUDENT_COUNT];	
	
	}      
	/*학생정보 추가
	 	매개변수 : 학생정보 =>Student s
	 	리턴타입 : void
	 	메소드명 : insert
	*/
	public void insert(UniversityStudent s){
		//std[??]:Student 클래스의 객체는 초기에 선언만 되어있음
		//insert 기능에서 객체정보를 추가하려면 갱체를 생성한 후
		//매개변수의 값을 복사해야함
		
		//학년,반,번호로 검색해서 해당 학생 정보가 없으면 학생 정보 추가
		//있으면 아무것도 안함
		if(search(s.getGrade(),s.getClassNum(),s.getNum())==-1){
		
			std[count++]= new UniversityStudent(s);
		//std[count]= new Student(s);
		//count++;
		}
	}
	
	
	/*학생정보 출력
 	매개변수 : 없다 =>멤버로 값을 알고 있기 때문에
 	리턴타입 : void =없다
 	메소드명 : print
	 */
	public void print(){
		for(int i=0; i<count ; i++){
			System.out.println(std[i]);
		}
	}
	
	/*학생정보 검색==> 정보를 수정&삭제하기 위해서 정보가 있는지없는지 알아야하기떄문
	 	기능: 학생정보 검색해서 없으면 -1를  있으면 배열에 위치한 번지를 알려주는 기능
		매개변수:학년 , 반 ,번호 = > int grade,int classNum , int num
		리턴타입:-1또는 번지=>int
		메소드명: search
	*/
	private int search(int grade,int classNum, int num){
		for(int i=0; i<count ; i++){
			if(std[i].getGrade() == grade && 
					std[i].getClassNum() == classNum &&
					std[i].getNum() == num){
				return i;
			}
		}
		return -1;
	}
	/*학생정보  수정
		기능: 학생정보를 배열에서 수정
		매개변수: 학생정보 =>Student s
		리턴타입: 없다 void
		메소드명 modify
	*/
	public void modify(UniversityStudent s){ 
		//검색했을때 해당 정보가 있는번지
		int searchIndex = search(s.getGrade(),s.getClassNum(),s.getNum());  
		if(searchIndex != -1){  //찾았으면
			std[searchIndex] = new UniversityStudent(s); 		
			//std[searchIndex]에  new를 선언해서 새로운 복사생성자를 불러와서 연결
		}
		
	}
	/*학생정보  삭제
	 기능: 배열에서 학생정보 삭제
	 매개변수: 학생정보 => Student s
	 리턴타입: void 없다
	메소드명:	 delete
	*/
	public void delete(UniversityStudent s){
		int searchIndex = search(s.getGrade(),s.getClassNum(),s.getNum());  
		if(searchIndex != -1){   //찾았으면
			//배열을 밀기
			for(int i=searchIndex;i<count-1;i++){
			std[i]= std[i+1];
			}
			std[count-1]=null;
			//현재 저장된 갯수를 하나 감수
			count--;
		}
	}
	
	public void printMenu(){
		System.out.println("------------------");
		System.out.println("1. 학생정보추가");
		System.out.println("2. 학생정보수정");
		System.out.println("3. 학생정보삭제");
		System.out.println("4. 학생정보출력");
		System.out.println("5. 종료");
		System.out.print("메뉴를 선택하세요 :");
	}
	
	/*기능 Scanner가 주어지면 검색을 위한 학생의 정보를 콘솔을 통해
	    입력받아 학생 객체를 만들어 돌려주는기능
	매개변수 : Scanner Scan
	리턴타입 : 학생객체 =>Student
	메소드명 : inputStudent
	*/
	
	public UniversityStudent inputStudent(Scanner scan){
		UniversityStudent s =  inputSearchStudent(scan);
		System.out.println("이름 : ");
		s.setName(scan.next());
		System.out.println("국어   : ");
		s.setKor(scan.nextInt());
		System.out.println("영어   : ");
		s.setEng(scan.nextInt());
		System.out.println("수학   : ");
		s.setMath(scan.nextInt());
		
	 	return s;
	}
	/*기능: Scanner가 주어지면  학생의 정보를 콘솔을 통해    입력받아 학생 객체를 만들어 돌려주는기능
	매개변수 : Scanner Scan
	리턴타입 : 학생객체 =>Student
	메소드명 : inputSearchStudent
	*/
	public UniversityStudent inputSearchStudent(Scanner scan){
		UniversityStudent s= new UniversityStudent();
		
		System.out.println("학년 : ");
		s.setGrade(scan.nextInt());
		System.out.println("반   : ");
		s.setClassNum(scan.nextInt());
		System.out.println("번호   : ");
	 	s.setNum(scan.nextInt());
	 	
	 	
		return s;
	}
	
	
}
