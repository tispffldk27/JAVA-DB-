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
		System.out.println("1���� 10������ ¦���� :" +sum);
		
		
		for(num=2,sum=0;num<=10;num+=2){
			sum += num;
		}
		System.out.println("���2 :1���� 10������ ¦���� :" +sum);
	
		for(num=1,sum=0; num<=5;num++){
			sum+=num*2;
		}
		System.out.println("���3 :1���� 10������ ¦���� :" +sum);
	}

}

