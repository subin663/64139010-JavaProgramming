/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Bai3 {

	/**
	 * @param args
	 */
	public static class SanPham {
		String tenSP;
		double donGia;
		double giamGia;
		public SanPham(String tSP, double dGia, double gGia) {
			this.tenSP=tSP;
			this.donGia=dGia;
			this.giamGia=gGia;
		}
		public SanPham(String tSP, double dGia) {
			this.tenSP=tSP;
			this.donGia=dGia;
			this.giamGia=0;
		}
		public String getTenSP() {
			return tenSP;
		}
		public void setTenSP(String tenSP) {
			this.tenSP = tenSP;
		}
		public double getDonGia() {
			return donGia;
		}
		public void setDonGia(double donGia) {
			this.donGia = donGia;
			
			//
		}
		public double getGiamGia() {
			return giamGia;
		}
		public void setGiamGia(double giamGia) {
			this.giamGia = giamGia; 
		}
		private double getThueNhapKhau() {
			return (donGia*10/100);
		}
		public void Nhap() {
			Scanner sc=new Scanner(System.in);
			System.out.print("Vui lòng nhập tên sản phẩm: ");
			setTenSP(sc.nextLine());
			System.out.print("Vui lòng nhập giá sản phẩm: ");
			setDonGia(sc.nextDouble());
			System.out.print("Vui lòng nhập giá giảm sản phẩm: ");
			setGiamGia(sc.nextDouble());
		}
		public void Xuat() {
			double thueNhapKhau = getThueNhapKhau();
			System.out.println(getTenSP()+" có giá: "+getDonGia()+ " sau khi giảm còn: "+ ((getDonGia()-getGiamGia()))+". Thuế: "+thueNhapKhau);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1=new SanPham("Bánh gạo", 20000);
		SanPham sp2=new SanPham("Nước cam", 25000,5000);
		sp1.Xuat();
		sp2.Xuat();

	}

}
