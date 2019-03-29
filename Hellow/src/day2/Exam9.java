package day2;
/* 소수 : 약수가 1 과 자기자신만 있는수 ,약수가 2개인수
 * 약수 : 자신보다 작거나 같은 수중에서 나누어 나머지가 0인수
 * 4의 약수 : 1,2,4
 * 
 * num:입력받은정수
 * cnt: 약수의갯수
 * i: 반복문에서 사용할 변수
 * 반복횟수 : i는 1부터 mum보다 작거나 같을 때 1가지씩 증가한다
 * 실행문 -i가 num의 약수이면 약수의 갯수를 하나증가
 * 반복문 종료후 약수의 갯수가 2개이면 소수라고 출력
 * 2개가 아니면 소수가 아님이라 출력
 * 
 * 
 */
import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
			Scanner scan =new Scanner(System.in);
	
			int num;
			int i;
			int cnt; //약수의 갯수
			num = scan.nextInt();
			//반복횟수 : i는 1부터 mum보다 작거나 같을 때 1가지씩 증가한다
			for( i=1,cnt=0 ; i<=num ; i++){ 
				if(num % i ==0 ){
					cnt++;
				}
			    }if(cnt ==2 ){
					System.out.println(num+"는 소수");
				}else{
					System.out.println(num+"는 소수가아닙니다");
				}
			}
	 
}
			
			
			
			
			
			
			
			
			
			/*int i ;
			int num=7 ;
			int total ;
			
			for(i=1; i<=9 ; i++){
				System.out.println( num+  " X " +i+" = "+ num*i);
					
				total = i *num;
				System.out.println(total);
			}
			
			*/
		
			
			
			
			
			
	


