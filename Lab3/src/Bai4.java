/**Viết chương trình nhập 2 mảng họ tên và điểm của sinh viên.
 * 
 */

/**
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		// Nhập số lượng phần tử của mảng
		System.out.print("Nhập số lượng sinh viên: ");
		
        int n = sc.nextInt();
        sc.nextLine();
        // Khởi tạo mảng
        String[] sv = new String[n];
        double[] diem = new double [n];
        NhapMang(sv,diem,n,sc);
        XuatMang(sv,diem,n);
	}
    public static void NhapMang(String sv[], double diem[], int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập họ tên sinh viên thứ " + (i + 1) + ": ");
            sv[i] = sc.nextLine(); // Nhập họ tên

            System.out.print("Nhập điểm của sinh viên " + sv[i] + ": ");
            diem[i] = sc.nextDouble();
            sc.nextLine(); // Đọc bỏ dòng trống để tránh lỗi trôi lệnh
        }
    }	

	   public static void XuatMang(String sv[], double diem[], int n) {
		   for (int i=0;i<n;i++) {
			   System.out.print("Họ tên sinh viên thứ "+(i+1)+" là: "+sv[i]+", ");
			   if (diem[i]<5) {
				   System.out.print("Học lực yếu.");
			   }
			   else if (diem[i]>=5 && diem[i]< 6.5) {
				   System.out.print("Học lực trung bình.");
			   }
			   else if (diem[i]>=6.5 && diem[i]<7.5) {
				   System.out.print("Học lực khá.");
			   }
			   else if (diem[i]>=7.5 && diem[i]<9) {
				   System.out.print("Học lực giỏi.");
			   }else {
				   System.out.print("Học lực xuất sắc.");
			   }
			   System.out.println();
		   }
	   }
	   

}
