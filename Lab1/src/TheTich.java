import java.util.Scanner;

public class TheTich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Vui lòng nhập cạnh hình lập phương: ");
		int a=sc.nextInt();
		System.out.print("Thể tích hình lập phương là: "+(Math.pow(a,3)));
		sc.close();
	}

}
