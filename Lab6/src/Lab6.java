import java.util.ArrayList;
import java.util.Scanner;

public class Lab6 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//bai1
		System.out.println("Nhap ho va ten:");
		String hoTen = scanner.nextLine();
		System.out.println(hoTen.substring(0,hoTen.indexOf(" ")).toUpperCase() + 
							hoTen.substring(hoTen.indexOf(" "),hoTen.lastIndexOf(" ")) +
							hoTen.substring(hoTen.lastIndexOf(" "),hoTen.length()).toUpperCase());
		
		//bai2
		ArrayList<SanPham> list= new ArrayList<SanPham>();
		SanPham sPham = new SanPham();
		for (int i = 0; i<5; i++)
		{			
			sPham.nhap(scanner);
			list.add(sPham);
		}
		
		for (SanPham sanPham : list) {
			if (sanPham.getHang().equals("Nokia")) {
				sanPham.xuat();
			}
		}
		
		//bai 3
		
		
		scanner.close();
		
		
	}
	
}
