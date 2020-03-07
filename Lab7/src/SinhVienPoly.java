
public abstract class SinhVienPoly {
	String hoTen, nganh;
	public SinhVienPoly(String hoTen,String nganh) {
		// TODO Auto-generated constructor stub
		this.hoTen = hoTen;
		this.nganh = nganh;
	}
	public abstract double getDiem();
	public String getHocLuc() {
		// TODO Auto-generated method stub
		if(getDiem()<5) {
			return "\nHoc Luc: yeu";
		}
		if(getDiem()>=5 && getDiem()<6.5) {

			return"\nHoc Luc: trung binh";
		}
		if(getDiem()>=6.5 && getDiem()<7.5) {

			return "\nHoc Luc: kha";
		}
		if(getDiem()>=7.5 && getDiem()<9) {

			return "\nHoc Luc: gioi";
		}
		if(getDiem()>=9) {

			return"\nHoc Luc: xuat sac";
		}
		else return "Chua co diem";
	}
	public void xuat() {
		// TODO Auto-generated method stub
		System.out.println("Thong tin sinh vien: ");
		System.out.println("Ho ten: " +hoTen);
		System.out.println("Nganh: " +nganh);
		System.out.println("Diem: " +getDiem());
		System.out.println(getHocLuc());

	}
}
