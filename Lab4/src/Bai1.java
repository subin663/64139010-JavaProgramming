import java.util.Scanner;

public class Bai1 {

	public static class SanPham {
		String tenSP;
		double donGia;
		double giamGia;
		public SanPham(String tSP, double dGia, double gGia) {
			this.tenSP=tSP;
			this.donGia=dGia;
			this.giamGia=gGia;
		}
		public SanPham() {
			
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
		}
		public double getGiamGia() {
			return giamGia;
		}
		public void setGiamGia(double giamGia) {
			this.giamGia = giamGia;
		}
		public double getThueNhapKhau() {
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
			System.out.print("Sản phẩm "+getTenSP()+" có giá: "+getDonGia()+ " sau khi giảm còn: "+ ((getDonGia()-getGiamGia())));
		}
		
	}
    public static void main(String[] args) {
    	SanPham sp=new SanPham();
    	sp.Nhap();
    	sp.Xuat();
    }
}
