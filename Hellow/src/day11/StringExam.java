package day11;					//글자 틀린거 비교해서 찾는것

public class StringExam {

	public static void main(String[] args) {
		String str1 ="Hello", str2="Hello";
		boolean cmp = str1 == str2;
		System.out.println(cmp);
		cmp = str1 != (str2="Hello ") ;
		System.out.println(cmp);
		cmp = str1 != (str2="Hello 1");
		System.out.println(cmp);
		System.out.println(str1.equals(str2));
	}
	

}

