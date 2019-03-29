package day4;
//소수 짜는방법

public class Exam4 {

	public static void main(String[] args) {
		
		int num =7;
		int i, cnt=0;
		for(num=1;num<=100;num++){
			for(i=1,cnt=0 ; i <=num ; i++){
				if(num % i ==0){
					cnt++;
				}
			}
			if(cnt ==2){
				System.out.print(num+" ");
		}
		}
		System.out.println( );

 }
}