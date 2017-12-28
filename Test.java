
import java.util.Scanner;
/**
打印如下图形:
    *
   ***
  *****
 *******
*********
*/

public class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// 控制行数
		for(int i=1;i<=5;i++){
			// 控制每行打印的内容
			// 打印空格
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			// 打印*
			for(int k =1;k<=2*i-1;k++){
				System.out.print("*");
			}
			// 每输出完一行换行
			System.out.println();
		}
	
	}
}