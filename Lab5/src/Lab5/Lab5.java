package Lab5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Lab5 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list =new ArrayList<String>();
		ArrayList<SanPham> listSp =new ArrayList<SanPham>();
		//
		bai1();
		//bai 2
		menu2(list);	
		//bai 3
		menu3(listSp);
		
	}

	//bai 1
	public static void bai1() {
		ArrayList<Double> list =new ArrayList<Double>();
		System.out.print("Nhap vao mot day so thuc");
		while(true){
			Double x = scanner.nextDouble();
			scanner.nextLine();
			list.add(x);
			System.out.print("Nhap them (Y/N)");
			if(scanner.nextLine().equals("N")||scanner.nextLine().equals("n")){
			break;
			}
			System.out.print("day so thuc: ");
			for(Double y: list) 
				System.out.print(y+"\t");
			}
	}
	
	public static void menu2(ArrayList<String> list) {
		
		int so = 0;
		while(true && so!=5) {
		System.out.println("1. Nhap danh sach ho va ten: ");
		System.out.println("2. Xuat danh sach");
		System.out.println("3. Xuat danh sach ngau nhien");
		System.out.println("4. Sap xep giam dan va xuat danh sach");
		System.out.println("5. Tim va xoa ho ten nhap tu ban phim");
		System.out.println("6. Ket thuc");
		System.out.println("\nMoi nhap lua chon cua ban");
		so = scanner.nextInt();
		switch(so) {
		case 1: nhap(list);
		case 2: xuat(list);
		case 3: xuatNgauNhien(list);
		case 4: sapxep(list);
		case 5: xoa(list);
		}
		}
	}
	public static void nhap(ArrayList<String> list) {
		System.out.println("- Nhap thong tin sinh vien: ");
		while(true) {
		System.out.println("Ho ten sv: ");
		list.add(scanner.nextLine());
		System.out.print("Nhap them (Y/N)");
		if(scanner.nextLine().equals("N")||scanner.nextLine().equals("n"))
		break;
		}
	}
	public static void xuat(ArrayList<String> list) {
		System.out.println("day ho ten cac sinh vien: ");
		for(String y: list) 
			System.out.println(y);
	}
	public static void xuatNgauNhien(ArrayList<String> list) {
		Collections.shuffle(list);
		System.out.println("day ho ten cac sinh vien ngau nhien: ");
		for(String y: list) 
			System.out.println(y);
	}
	//sap xep giam dan
	public static void sapxep(ArrayList<String> list) {
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println("day ho ten cac sinh vien giam dan: ");
		for(String y: list) 
			System.out.println(y);
	}
	public static void xoa(ArrayList<String> list) {
		System.out.println("Nhap ho ten sinh vien muon xoa: ");
		String a = scanner.nextLine();
		for(String y: list) 
			if(y==a)
			list.remove(y);
		System.out.println("Day ho ten sau khi xoa: ");
		for(String y: list) 
			System.out.println(y);
	}
	public static void menu3(ArrayList<SanPham> listSp) {
		// TODO Auto-generated method stub
		int so = 0;
		while(true && so != 5) {
		System.out.println("1. Nhap danh sach san pham: ");
		System.out.println("2. Sap xep giam dan theo gia va xuat ra man hinh");
		System.out.println("3. Tim va xoa san pham theo ten");
		System.out.println("4. Xuat gia trung binh cua cac san pham");
		System.out.println("5. Ket thuc");
		System.out.println("\nMoi nhap lua chon cua ban");
		so = scanner.nextInt();
		scanner.nextLine();
		switch(so) {
			case 1: nhapSp(listSp);
					break;
			case 2: sapXep(listSp);
					break;
			case 3: xoaSp(listSp);
					break;
			case 4: xuatTbSp(listSp);
					break;
			}
		}
	}
	private static void xuatTbSp(ArrayList<SanPham> listSp) {
		// TODO Auto-generated method stub
		
		int count =0, sum = 0;
		
		for(SanPham y: listSp) {
			sum += y.getDonGia();
			count ++;
		}
		System.out.println("Gia trung binh cua cac san pham: " + (float)sum/count);

	}
	private static void xoaSp(ArrayList<SanPham> listSp) {
		// TODO Auto-generated method stub
		System.out.println("Nhap ten san pham muon xoa: ");
		String xoa = scanner.nextLine();
		for(SanPham y: listSp) {
			if(xoa.equals(y.getTenSp())) {
			listSp.remove(y);
			}
		}
		System.out.println("DS cac san pham sau khi xoa: ");
		for(SanPham y: listSp) 
			y.xuat();
	}
	private static void sapXep(ArrayList<SanPham> listSp) {
		// TODO Auto-generated method stub
		System.out.println("day cac san pham giam dan theo gia: ");
		
		Comparator<SanPham> comp = new Comparator<SanPham>() {
			@Override
			public int compare(SanPham o1, SanPham o2) {
			if(o1.getDonGia()<o2.getDonGia()) 
				return 1;
			else if(o1.getDonGia()>o2.getDonGia()) 
				return -1;
			else return 0;
			}
			};
			Collections.sort(listSp,comp);
			for(SanPham y: listSp) 
				y.xuat();
	}
	private static void nhapSp(ArrayList<SanPham> listSp) {
		// TODO Auto-generated method stub
		System.out.println("- Nhap thong tin san pham: ");
		while(true) {
		System.out.println("Ten San pham: ");
		String ten = scanner.nextLine();
		System.out.println("Gia San pham: ");
		Double gia =scanner.nextDouble();
		listSp.add( new SanPham(ten,gia));
		System.out.print("Nhap them (Y/N)");
		if(scanner.nextLine().equals("N")||scanner.nextLine().equals("n"))
		break;
		}
	}

}
