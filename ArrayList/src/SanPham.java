
public class SanPham {
	// Định nghĩa các thuộc tính
	int maSP;
	String tenSP;
	String loaiSP;
	String anhSP;
	//Hàm tạo
	
	public SanPham() {
		super();
	}
	public SanPham(int _maSP, String _tenSP, String _loaiSP, String _anhSP) {
		this.maSP= _maSP;
		this.tenSP= _tenSP;
		this.loaiSP= _loaiSP;
		this.anhSP= _anhSP;
	}
	public int getMaSP() {
		return maSP;
	}
	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getLoaiSP() {
		return loaiSP;
	}
	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}
	public String getAnhSP() {
		return anhSP;
	}
	public void setAnhSP(String anhSP) {
		this.anhSP = anhSP;
	}
	
	@Override
	public String toString() {
	    return "MaSP=" + maSP + ", TenSP=" + tenSP + ", LoaiSP=" + loaiSP + ", AnhSP=" + anhSP + "";
	}

	
}
