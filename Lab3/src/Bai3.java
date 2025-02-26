/**Viết chương trình nhập mảng số nguyên từ bàn phím. 
✓ Sắp xếp và xuất mảng vừa nhập ra màn hình. 
✓ Xuất phần tử có giá trị nhỏ nhất ra màn hình 
✓ Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3
 * 
 */

/**
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Nhập số lượng phần tử của mảng
		System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = sc.nextInt();
        // Khởi tạo mảng
        int[] arr = new int[n];
        NhapMang(arr,n,sc);
        XuatMang(arr,n,sc);
        System.out.println();
        SapXep(arr,n);
		System.out.println("Mảng sau khi sắp xếp. ");
        XuatMang(arr,n,sc);
        System.out.println();
        MinIndex(arr,n);
        System.out.println();
        avg3(arr,n);
        
	}
	public static void NhapMang(int arr[],int n, Scanner sc) {
		System.out.println("Vui lòng nhập các phần tử trong mảng");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	}
	
	public static void SapXep(int arr[], int n) {
		for (int i=0;i<n-1;i++) {
			for (int j=i+1;j<n;j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void XuatMang(int arr[], int n, Scanner sc) {
		System.out.print("Các phần tử của mảng là: ");
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			
		}
	}
	
	public static void MinIndex(int arr[], int n) {
		int index=arr[0];
		for (int i=0;i<n;i++) {
			if (arr[i]<index) {
				index=arr[i];
			}
		}
		System.out.print("Giá trị nhỏ nhất là: "+index);
	}
	
	public static void avg3(int arr[], int n) {
		int temp=0;
		int dem=0;
		for (int i=0;i<n;i++) {
			if (arr[i]%3==0) {
				temp+=arr[i];
				dem++;
			}
		}
		if (temp>0) {

			System.out.print("Trung bình các phần tử chia hết cho 3 là: "+(double)temp/dem);
		}
		else {
			System.out.print("Không có phần tử nào chia hết cho 3");
		}
	}

	
	
}
