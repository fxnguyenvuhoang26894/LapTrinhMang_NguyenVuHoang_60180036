package Lab5;


public class SanPham{
	private String tenSp;
	private double donGia;
	
	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public SanPham(String tenSp, double donGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
	}

	public void xuat() {
		System.out.println("Thong tin san pham: \n");
		System.out.println("Ten san pham: " + tenSp);
		System.out.println("Don gia: " + donGia);
	}
}