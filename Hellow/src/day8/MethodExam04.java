package day8;

import java.util.Scanner;

public class MethodExam04 {

	public static void main(String[] args) {
		/* 기능: start~end출력하는 기능 조절
		   매개변수: int star, int end
		   리턴타입: void (for문으로 반복제한둠)
		   메소드명 :start ,  
		 */
		printMultiTables(2,4);
		
	}

	public static void printMultiTable(int num1){
		
		for(int i=1;i<=9;i++){				// 뒷자리 					// 
			System.out.println(num1+"X"+i+"="+num1*i);
		}

	}	
			
		public static void printMultiTables(int start ,int end){ //앞자리 ~ 뒷자리까지
			for( ;start<=end;start++){				
				printMultiTable(start);
			}
		}
	
		/* 메소드에서 리턴 값이 있을때 구현시 유의사항
		   조건문을 통해 return하는경우나
		    반복문안에서 return을 할경우 조심해야한다
		    조건문을 통해 return할 경우 조건문이 거짓인 경우를고려해야한다
		    반복문안에서 return을 할 경우 반복문 조건이 거짓이되어 반복문이 실행되지 않을 경우를 고려해야한다.
		 */
		public static int test1(){
			int r=0;
			for(int i=1; i<=9;i++){
				r+=i;
				if(r>50){
					return r;
				}
				
			//반복문이 무조건 실행되서 리턴이 되는 경우라 하더라도 자바 컴파일러는
			//세세한 내용까지 검사하지 않기 때문에 반복문이 종료 됐을 경우 리던도 설정 해주어야한다.
				return 0;
			}
							
			public static int test(int num){			//점심시간이후 괄호문제인가?
				if(num>=0) return 1;
				else return -1;
				
			}
			
		
		
		
		
		}

	
	
	}


