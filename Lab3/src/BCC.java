/**BÀI 2 (2 ĐIỂM) 
Viết chương trình xuất ra màn hình bảng cửu chương
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class BCC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Vui lòng nhập bảng cửu chương muốn in từ 1 tới 9: ");
		int x=sc.nextInt();
		for (int i=1;i<=9;i++) {
			System.out.println("2 x "+i+" = "+(x*i));
		}
	}

}
