/**
Viết chương trình cho phép giải phương trình bậc hai trong đó các hệ số a, b và c 
nhập từ bàn phím 
ax^2+bx+c=0
 * 
 */
import java.util.Scanner;
import java.lang.Math;
public class PTB2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Vui lòng nhập a: ");
		double a=sc.nextDouble();
		System.out.print("Vui lòng nhập b: ");
		double b=sc.nextDouble();
		System.out.print("Vui lòng nhập c: ");
		double c=sc.nextDouble();
		if (a==0) {
			System.out.print("Nghiệm của phương trình là: "+"x = -c/b = "+(-c/b));
		}else {
			double delta=(b*b)-4*a*c;
			System.out.println("Delta của phương trình là: "+delta);
			if (delta<0) {
				System.out.print("Phương trình vô nghiệm !");
			}
			else if (delta==0) {
				System.out.print("Phương trình có nghiệm kép x = -b/2a"+(-b/(2*a)));
			}
			else {
				System.out.println("Phương trình có 2 nghiệm phân biệt !");
				double x1=((-b-Math.sqrt(delta))/(2*a));
				double x2=((-b+Math.sqrt(delta))/(2*a));
				System.out.println("x1 = "+x1);
				System.out.println("x2 = "+x2);
			}
		}
	}

}
