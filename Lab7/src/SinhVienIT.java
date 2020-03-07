
public class SinhVienIT extends SinhVienPoly {

	double diemJava, diemCss, diemHtml;
	public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss,double diemHtml) {
		super(hoTen, nganh);
		this.diemCss = diemCss;
		this.diemJava = diemJava;
		this.diemHtml = diemHtml;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDiem() {
		// TODO Auto-generated method stub
		
		return ((2*diemJava +diemJava +diemCss)/4);
	}
	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
	}
}
