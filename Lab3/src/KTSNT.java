/**BÀI 1 (2 ĐIỂM) 
Viết chương trình nhập một số nguyên từ bàn phím và cho biết số đó có phải là số 
nguyên tố hay không (số nguyên tố là số chỉ chia hết cho 1 và chính nó).
 * 
 */

/**
 * 
 */
import java.util.Scanner;
import java.lang.Math;
public class KTSNT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Vui lòng nhập 1 số nguyên: ");
		int n=sc.nextInt();
		if (laSNT(n)) {
			System.out.print(n+" là số nguyên tố.");
		}else {
			System.out.print(n+ " không phải là số nguyên tố.");
		}

	}
	// Hàm kiểm tra số nguyên tố
    public static boolean laSNT(int n) {
        if (n < 2) return false; 

        // Kiểm tra từ 2 đến căn bậc hai của n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; 
        }
        return true;
    }

}
