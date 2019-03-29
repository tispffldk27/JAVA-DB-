package day4;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		
		for(i=2;i<=100;i+=2){
			
			System.out.print(i+" ");
		}
		for(i=1;i<=100;i++){
			if(i%2==0){
				System.out.println(i+" ");
			}
		}
		for(i=1;i<=100;i++){
			if(i%2==1){
				continue;
			}
		}
		for(i=1;i<=50;i++){
			System.out.println(i*2+" ");
	}
	}
}
