
public class SinhVienBiz extends SinhVienPoly{

	double diemMarketing, diemSales;
	public SinhVienBiz(String hoTen, String nganh,double diemMarketing,double diemSales) {
		super(hoTen, nganh);
		// TODO Auto-generated constructor stub
		this.diemMarketing= diemMarketing;
		this.diemSales = diemSales;
	}

	@Override
	public double getDiem() {
		// TODO Auto-generated method stub
		return ((2* diemMarketing +diemSales)/3);
	}

}
