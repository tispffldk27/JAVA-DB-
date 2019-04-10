package day12;

public class StudentManager {
		
		private Student std[];      //학생들 정보를 담을 배열 				
		private int count;			//현재 저장된 학생수
		private final int MIN_STUDENT_COUNT =300;
		
		public StudentManager(){
			std= new Student[MIN_STUDENT_COUNT];
		}
		public StudentManager(int stuedentCnt){
			if(stuedentCnt >= MIN_STUDENT_COUNT )
				std= new Student[stuedentCnt];
			else
				std= new Student[MIN_STUDENT_COUNT];	
		
		}
		/*학생정보 추가
		 	매개변수 : 학생정보 =>Student s
		 	리턴타입 : void
		 	메소드명 : insert
		*/
		public void insert(Student s){
			//std[??]:Student 클래스의 객체는 초기에 선언만 되어있음
			//insert 기능에서 객체정보를 추가하려면 갱체를 생성한 후
			//매개변수의 값을 복사해야함
			std[count++]= new Student(s);
			//std[count]= new Student(s);
			//count++;
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
		public void modify(Student s){ 
			//검색했을때 해당 정보가 있는번지
			int searchIndex = search(s.getGrade(),s.getClassNum(),s.getNum());  
			if(searchIndex != -1){
				std[searchIndex] = new Student(s); 		
				//std[searchIndex]에  new를 선언해서 새로운 복사생성자를 불러와서 연결
			}
			
		}
		/*학생정보  삭제
		 기능: 배열에서 학생정보 삭제
		 매개변수: 학생정보 => Student s
		 리턴타입: void 없다
		메소드명:	 delete
		*/
		public void delete(Student s){
			int searchIndex = search(s.getGrade(),s.getClassNum(),s.getNum());  
			if(searchIndex != -1){
				//배열을 밀기
				for(int i=searchIndex;i<count-1;i++){
				std[i]= std[i+1];
				}
				std[count-1]=null;
				//현재 저장된 갯수를 하나 감수
				count--;
			}
		}
		
		
		
		
		
		
		
}
