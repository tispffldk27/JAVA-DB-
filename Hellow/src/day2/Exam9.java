package day2;
/* �Ҽ� : ����� 1 �� �ڱ��ڽŸ� �ִ¼� ,����� 2���μ�
 * ��� : �ڽź��� �۰ų� ���� ���߿��� ������ �������� 0�μ�
 * 4�� ��� : 1,2,4
 * 
 * num:�Է¹�������
 * cnt: ����ǰ���
 * i: �ݺ������� ����� ����
 * �ݺ�Ƚ�� : i�� 1���� mum���� �۰ų� ���� �� 1������ �����Ѵ�
 * ���๮ -i�� num�� ����̸� ����� ������ �ϳ�����
 * �ݺ��� ������ ����� ������ 2���̸� �Ҽ���� ���
 * 2���� �ƴϸ� �Ҽ��� �ƴ��̶� ���
 * 
 * 
 */
import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
			Scanner scan =new Scanner(System.in);
	
			int num;
			int i;
			int cnt; //����� ����
			num = scan.nextInt();
			//�ݺ�Ƚ�� : i�� 1���� mum���� �۰ų� ���� �� 1������ �����Ѵ�
			for( i=1,cnt=0 ; i<=num ; i++){ 
				if(num % i ==0 ){
					cnt++;
				}
			    }if(cnt ==2 ){
					System.out.println(num+"�� �Ҽ�");
				}else{
					System.out.println(num+"�� �Ҽ����ƴմϴ�");
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
		
			
			
			
			
			
	


