package day3;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		int sum=0;
		
		for(num=1;num<=10;num++){
			if(num % 2==0){
				sum+= num;
			}
			
		}			
		System.out.println("1부터 10까지의 짝의합 :" +sum);
		
		
		for(num=2,sum=0;num<=10;num+=2){
			sum += num;
		}
		System.out.println("방법2 :1부터 10까지의 짝의합 :" +sum);
	
		for(num=1,sum=0; num<=5;num++){
			sum+=num*2;
		}
		System.out.println("방법3 :1부터 10까지의 짝의합 :" +sum);
	}

}

