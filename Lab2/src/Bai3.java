/**BÀI 3 (2 ĐIỂM) 
Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện theo 
phương pháp lũy tiến 
✓ Nếu số điện sử dụng từ 0 đến 50 thì giá mỗi số điện là 1000 
✓ Nếu số điện sử dụng trên 50 thì giá mỗi số điện vượt hạn mức là 1200
Cách giải
✓ Nếu số điện sử dụng < 50: tien = soDien*1000 
✓ Ngược lại: tien = 50*1000 + (soDien - 50)*1200 
 * 
 */

import java.util.Scanner;
public class Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Vui lòng nhập vào số điện đã sử dụng: ");
		double sDien=sc.nextDouble();
		double tien=0;
		if (sDien<=50) {
			tien=sDien*1000;
		}else {
			tien=50*1000+(sDien-50)*1200;
		}
		System.out.print("Số tiền điện đã sử dụng hàng tháng là: "+tien);
	}

}
