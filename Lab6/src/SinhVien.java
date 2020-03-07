import java.util.Scanner;

public class SinhVien {
	String hoTen;
	String email;
	String soDt;
	String CMND;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSoDt() {
		return soDt;
	}
	public void setSoDt(String soDt) {
		this.soDt = soDt;
	}
	public String getCMND() {
		return CMND;
	}
	public void setCMND(String cMND) {
		CMND = cMND;
	}
	public void nhap(Scanner scanner) {
		System.out.println("Nhap ten sinh vien: ");
		setHoTen(scanner.nextLine());
		System.out.println("Nhap email: ");
		setEmail(scanner.nextLine());
		System.out.println("Nhap so dien thoai: ");
		setSoDt(scanner.nextLine());
		System.out.println("Nhap CMND: ");
		setCMND(scanner.nextLine());
	}
}
