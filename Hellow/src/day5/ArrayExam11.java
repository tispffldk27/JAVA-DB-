package day5;

public class ArrayExam11 {

	public static void main(String[] args) {
		// 버블정렬 :단순하고 효율이 가장 안좋다.
		
		int [] arr = new int[]{1,3,5,7,9,2,4,6,8};
		//반복 횟수: 배열의 크기 -1
		for(int i=0; i<arr.length-1;i++){
			for(int j=0 ; j<arr.length-1-i ; j++){
				if(arr[j] > arr[j+1]){ 			//큰숫자를 뒤로보내고싶으면 >  작은숫자를 보내고싶으면<
					int tmp = arr[j];
					   arr[j]=arr[j+1];
					   arr[j+1] = tmp;
				}
			}
		}for(int i=0;i<arr.length; i++){
		System.out.println(arr[i]+ "");
	}
 
	}
}
