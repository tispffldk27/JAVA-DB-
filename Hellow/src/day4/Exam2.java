package day4;

public class Exam2 {

	public static void main(String[] args) {
		
		int num1=8 ,num2=12;
		int i;
		int gcd=1;
		
		System.out.print(num1+" 과 "+num2+"의 공약수 :");
		for(i=1; i<=num1 ; i++){
			if(num1 % i==0 && num2 % i==0){
				gcd=i;
				System.out.print(i+ " ");
		}
	}
			System.out.println();
			System.out.println(num1+" 과 "+num2+"의 최대공약수 :"+gcd);
	}
}
