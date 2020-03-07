import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Lab7 {

	public static void main(String[] args) {
		// Bai 1
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap chieu dai chu nhat");
		int d = scanner.nextInt();
		System.out.println("Nhap chieu rong chu nhat");
		int r = scanner.nextInt();
		ChuNhat cNhat = new ChuNhat(d, r);
		System.out.println("Nhap canh hinh vuong");
		int c = scanner.nextInt();
		Vuong vuong = new Vuong(c);
		cNhat.xuat();
		vuong.xuat();
		
		
		//bai 4
		ArrayList<SinhVienPoly> sv = new ArrayList<SinhVienPoly>();
		int so = 0;
		while(true && so != 5) {
		System.out.println("1. Nhap danh sach sinh vien: ");
		System.out.println("2. xuat thong tin danh sach sinh vien");
		System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
		System.out.println("4. Sap xep danh sach sinh vien theo diem");
		System.out.println("5. Ket thuc");
		System.out.println("\nMoi nhap lua chon cua ban");
		so = scanner.nextInt();
		scanner.nextLine();
		switch(so) {
			case 1: Nhap(sv);
					break;
			case 2: Xuat(sv);
					break;
			case 3: SVGioi(sv);
					break;
			case 4: SapXep(sv);
					break;
			}
		}

		
		scanner.close();
		
	}
	public static void Nhap(ArrayList<SinhVienPoly> sv) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ho ten sinh vien: ");
		String hoTen = scanner.nextLine();
		System.out.println("Nhap nganh hoc sinh vien (IT || Biz) : ");
		String nganh = scanner.nextLine();
		if(nganh.equals("IT"))
		{
			System.out.println("Nhap diem mon java: ");
			double diemJava = scanner.nextDouble();
			System.out.println("Nhap diem mon java: ");
			double diemCss = scanner.nextDouble();
			System.out.println("Nhap diem mon java: ");
			double diemHtml = scanner.nextDouble();
			SinhVienIT svIt = new SinhVienIT(hoTen, nganh, diemJava, diemCss, diemHtml);
			sv.add(svIt);
		}
		if(nganh.equals("Biz"))
		{
			System.out.println("Nhap diem mon marketing: ");
			double diemMarketing = scanner.nextDouble();
			System.out.println("Nhap diem mon Sales: ");
			double diemSales = scanner.nextDouble();
			SinhVienBiz svBiz = new SinhVienBiz(hoTen, nganh, diemMarketing, diemSales);
			sv.add(svBiz);
		}
		scanner.close();
	}
	public static void Xuat(ArrayList<SinhVienPoly> sv) {
		for (SinhVienPoly sinhVienPoly : sv) {
			sinhVienPoly.xuat();
		}
	}
	public static void SVGioi(ArrayList<SinhVienPoly> sv) {
		for (SinhVienPoly sinhVienPoly : sv) {
			if(sinhVienPoly.getDiem()>=7.5 && sinhVienPoly.getDiem()<9)
				sinhVienPoly.xuat();
		}
	}
	public static void SapXep(ArrayList<SinhVienPoly> sv) {
		System.out.println("Sap xep danh sach sinh vien theo diem: ");
		Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>() {
			@Override
			public int compare(SinhVienPoly s1, SinhVienPoly s2) {
				// TODO Auto-generated method stub
				if(s1.getDiem()<s2.getDiem()) 
					return 1;
				else if(s1.getDiem()<s2.getDiem()) 
					return -1;
				else return 0;
				}
				};
		Collections.sort(sv,comp);
		for (SinhVienPoly sinhVienPoly : sv) {
			sinhVienPoly.xuat();
		}

	}

}
