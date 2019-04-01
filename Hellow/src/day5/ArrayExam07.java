package day5;

public class ArrayExam07 {

	public static void main(String[] args) {
		// abcd...z
		int numA='a';
		int numB='b';
		//문자 a에 대한 유니코드 정수값
		System.out.println(numA);
		//문자 b에 대한 유니코드 정수값
		System.out.println(numB);
				numA ='A';
				numB ='B';
				//문자 a에 대한 유니코드 정수값
				System.out.println(numA);
				//문자 b에 대한 유니코드 정수값
				System.out.println(numB);
		
			int num=100; //'d'
			System.out.println((char)num);
			//97이 a라는것을 이용하여 a~z까지 출력하는 예제
			for(int i=97; i<=97+25; i++){
				System.out.print((char)i);
			}
			System.out.println();
			for(int i='a'; i<='z'; i++){
				System.out.print((char)i);
			}
			System.out.println();
			for(int i=0; i<=25; i++){
				System.out.print((char)('a'+i));
			}
		
		
	}

}
