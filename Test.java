
import java.util.Scanner;
/**
��ӡ����ͼ��:
    *
   ***
  *****
 *******
*********
*/

public class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// ��������
		for(int i=1;i<=5;i++){
			// ����ÿ�д�ӡ������
			// ��ӡ�ո�
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			// ��ӡ*
			for(int k =1;k<=2*i-1;k++){
				System.out.print("*");
			}
			// ÿ�����һ�л���
			System.out.println();
		}
	
	}
}