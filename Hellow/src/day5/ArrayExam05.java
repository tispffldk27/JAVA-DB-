package day5;

public class ArrayExam05 {

	public static void main(String[] args) {
		
		
		
		
							//199페이지처럼 로또 번호뽑기
		int [] arr ;
		arr = new int[7];
		int i=0;
			for(i=0; i<arr.length ;){
				int r =	(int) (Math.random()*(7-1+1))+1;	
				boolean find= false;
				for(int j=0 ; j<arr.length;j++){
					if(arr[j] == r){
						find = true;
						break;
					}
				
				}
				if(!find){ 				//find== false
					arr[i] = r;
					i++;
				}			
			}
			for(int k=0 ; k<arr.length ; k++){
				System.out.println(arr[k]);
			}
		}


	}

