package day5;

public class ArrayExam04 {

	public static void main(String[] args) {
		//배열 검색
		
		int []arr= new int[5];
		for(int i=0 ; i<arr.length;i++){
			arr[i]=i;
		}
		int search =5;
		//현재 배열에는 0 1 2 3 4 가 들어가있다.
		/* 배열에 있는 모든 값을 확인하여 배열의 값과 검색 값이 같으면 반복문을 종료
		    없으면 계속진행
		 */
		//변수 search의 값이 배열 arr에 있는지 없는지 나타내는변수
		boolean find= false;
		for(int i=0 ; i<arr.length;i++){
			if(arr[i] ==search){
				find = true;
				
				break;
			}
		
		}
		if(find){
			System.out.println("배열에는 "+search+"가 있습니다.");
		}else{
			System.out.println("배열에는 "+search+"가 없습니다.");
		}
	}
	

}
