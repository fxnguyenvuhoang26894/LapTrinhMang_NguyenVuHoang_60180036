package oop;
public class Lab4 {

	public static void main(String[] args) {
		// bai 2. tao 2 doi tuong sp1 va sp2
		SanPham sp1 =new SanPham();
		SanPham sp2 =new SanPham();
		sp1.nhap();
		sp2.nhap();
		sp1.xuat();
		sp2.xuat();
		
		//bai 3. su dung ham tao
		SanPham sp3 =new SanPham("Ban",100000,0.3);
		SanPham sp4 =new SanPham("ghe",50000);
		sp3.xuat();
		sp4.xuat();
	}
}

