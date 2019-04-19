package day18;

public class EnumExam3{
	
	public static void main(String[] args){
		
		UniversityStudent std1 = new UniversityStudent(Gender.MALE,Grade.ETC,Major.COMPUTER,"민관홍",15422054);
		System.out.println(std1);
		std1.setUniversityName("그린");
		std1.setAverage(4.5);
		System.out.println(std1);
	}

	
	
}