/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class DTB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ: ");
        String ho = sc.nextLine();
        System.out.print("Nhập tên: ");
        String ten = sc.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        double diemtb = sc.nextDouble();
        
        System.out.println("Họ: " + ho + " Tên: " + ten + " Điểm TB: " + diemtb);
        sc.close();
	}

}
