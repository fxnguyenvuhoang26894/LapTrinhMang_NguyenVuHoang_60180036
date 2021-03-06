package oop;
import java.util.Scanner;

//bai 1, 3 & 4. tao class SanPham
public class SanPham{
	private String tenSp;
	private double donGia;
	private double giamGia;
	
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

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	//bo sung 2 ham tao
	public SanPham() {}
	
	public SanPham(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	public SanPham(String tenSp, double donGia) {
		this(tenSp,donGia,0);
	}

	private double getThueNhapKhau() {
		return donGia *0.1;
	}
	public void nhap() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap ten san pham: ");
		tenSp = scanner.nextLine();
		System.out.println("Nhap don gia: ");
		donGia = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Nhap muc giam gia: ");
		giamGia = scanner.nextDouble();
		scanner.close();
	}
	public void xuat() {
		System.out.println("Thong tin san pham: \n");
		System.out.println("Ten san pham: " + tenSp);
		System.out.println("Don gia: " + donGia);
		System.out.println("Muc giam gia: " + giamGia);
		System.out.println("Thue nhap khau: " + getThueNhapKhau());
	}
}