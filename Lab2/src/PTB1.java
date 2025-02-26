/**
BÀI 1 (2 ĐIỂM) 
Viết chương trình cho phép giải phương trình bậc nhất trong đó các hệ số a và b 
nhập từ bàn phím 
ax+b=0
 **/
import java.util.Scanner;
public class PTB1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Vui lòng nhập a: ");
		double a=sc.nextDouble();
		System.out.print("Vui lòng nhập b: ");
		double b=sc.nextDouble();
		if (a==0) {
			if (b==0) {
				System.out.print("Phương trình có vô số nghiệm !");
			}
			else {
				System.out.print("Phương trình vô nghiệm");
			}
		}
		else {
			System.out.print("Nghiệm của phương trình là : x = -b/a = "+(-b/a));
		}
	}
}
