package day6;

public class method07 {

	public static void main(String[] args) {
		int max =45 , min =1;
		int [] arr= new int [7];          //int []arr= null; 이면 배열생성에 실패
		int [] arr2= new int[6];
		if(createRandarr(min, max, arr)){
			printArr(arr);
		}else{
			System.out.println("배열 생성에 실패");
		}
		if(createRandarr(min, max, arr2)){
			printArr(arr2);
		}else{
			System.out.println("배열 생성에 실패");
		}
	}

	public static int random (int min, int max){
				if(min>max){
					int tmp= min;
						min=max;
						max=tmp;
				}
			return (int)(Math.random()*(max-min+1)+min);		 //return 에 랜덤함수로 출력도가능   
	}

	/*  기능: 배열에 검색 숫자가 있는지 없는지 확인하는 메소드
	 	매개변수: 검색숫자,배열=>int[] arr,int uum
	 	리턴타입: 있는지(true), 없는지(false)=>boolean 
	 	메소드명: contain
	 */
	public static boolean contain(int []arr , int num, int cnt){
		if(arr== null){           //null 은 엇는것
			return false;
		}
		if(cnt>arr.length){
			cnt = arr.length;
		}
		for(int i=0; i<cnt; i++){
			if(arr[i]== num){
				return true;
			}
		}
		return false;
	}
	/* 기능 : 최소값 최대값 배열이 주어지면 중복되지 않는 랜덤한 수(min~max)로 배열을 채우는 메소드
	  매개변수: 최소값 , 최댓값 ,배열 => int min , int max ,int []arr
	  리턴타입: boolean(배열을 채웠는지 못채웠는지 여부)
	 메소드명 : createRandarr()
	 */
	public static boolean createRandarr(int min, int max, int []arr){
		if(arr==null){
			return false;
		}
		if(max-min+1 < arr.length){
			return false;
		}
		int cnt =0;
		while(cnt <arr.length){
			int r= random(min,max);
			if(!contain(arr, r, cnt)){			//arr에 r이없으면
				arr[cnt]=r; 			//crr[ant]에 r을추가하고
				cnt++;					//cnt를 하나추가해라
			}
		}
		return true;
	}
	/* 기능 배열이 주어지면 배열의 모든 원소값을 콘솔에 출력하는데모드
	   매개변수 : 배열 => int []arr
	   리턴타입 : 없다 => void
	  매소드명 :printArr
	 */
	public static void printArr(int []arr){
		System.out.print("[ ");
		for(int tmp:arr){
			System.out.print(tmp+"  ");
		}
		System.out.print("] \n");
	}

}




/*
최소값 min과 최대값 (max)가 주어지면 최솟값과 최대값 사이의 임의정수를알려주는메소드

매개변수: int min ,int max , 
리턴타입
메소드명:random
*/