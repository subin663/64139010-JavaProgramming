import java.util.Scanner;
public class ChuViDT {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Vui long nhap chieu dai: ");
		int CD=sc.nextInt();
		System.out.print("Vui long nhap chieu rong: ");
		int CR=sc.nextInt();
		System.out.println("Chu vi hinh chu nhat la: "+((CD+CR)*2));
		System.out.println("Dien tich hinh chu nhat la: "+(CD*CR));
		System.out.print("Canh nho hinh chu nhat la: "+ CR);
		sc.close();
	}

}
