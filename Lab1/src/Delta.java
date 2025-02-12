import java.util.Scanner;
public class Delta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Vui long nhap he so a, b va c cua pt bac 2: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int delta = b * b - 4 * a * c;
        System.out.println("Delta của phương trình là: " + delta);
        //Kiểm tra và tính căn delta nếu có thể
        if (delta >= 0) {
            double sqrtDelta = Math.sqrt(delta);
            System.out.println("Căn Delta là: " + sqrtDelta);
        } else {
            System.out.println("Delta âm, không thể lấy căn bậc hai.");
        }
		sc.close();
	}

}
