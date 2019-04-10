package day12;					//중요하다 ★★★ 많이기억해두자

public class ClassExam {
	public static int MAX_STUDENT_COUNT=300; //최대학생 300명
	
	public static void main(String[] args) {
		
		StudentManager stdMng = new StudentManager(MAX_STUDENT_COUNT);
		 //new Student("홍길동",1,1,1,100,90,80);
		  // :객체를 생성했는데 이름이 없다 = 익명객체
	
		stdMng.insert(new Student("홍길동",1,1,1,100,90,80));
	
		stdMng.print();
		System.out.println("------------------------------");
		
		stdMng.modify(new Student("유관순",1,1,1,100,100,100));
		stdMng.print();
		System.out.println("------------------------------");
		
		stdMng.print();
		stdMng.delete(new Student("홍길동",1,1,1,0,0,0));
		stdMng.print();
		
	
	}
	public static void printMenu(){
		System.out.println("1. 학생정보추가");
		System.out.println("2. 학생정보수정");
		System.out.println("3. 학생정보삭제");
		System.out.println("4. 학생정보출력");
		System.out.println("5. 종료");
		System.out.print("메뉴를 선택하세요 :");
	}

	
}

	
	
