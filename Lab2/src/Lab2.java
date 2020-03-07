import java.util.Scanner;

public class Lab2 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		bai1();
		bai2();
		bai3();
		bai4();
		scanner.close();
	}
	public static void bai1() {
		// giải phương trình bậc 1
				
				System.out.println("Giai phuong trinh bac nhat");
				System.out.println("Nhap he so a:");
				int a = scanner.nextInt();
				System.out.println("Nhap he so b:");
				int b = scanner.nextInt();
				if(a==0) {
					if(b==0) {
						System.out.println("Phuong trinh co vo so nghiem");
					}
					else {
						System.out.println("Phuong trinh vo nghiem");
					}
				}
				else {
					System.out.printf("Phuong trinh co nghiem:" + (float)-b/a);
				}
	}
	public static void bai2() {
		//giải phuong trình bậc 2
				System.out.println("\nNhap cac he so phuong trinh bac 2 lan luot la:");
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				int z = scanner.nextInt();
				if(x==0) {
					if(y==0) {
						System.out.println("Phuong trinh co vo so nghiem");
					}
					else {
						System.out.println("Phuong trinh vo nghiem");
					}
				}
				else {
					double delta = Math.pow(y, 2) * 4 *x *z;
					if(delta<0) 
						System.out.println("Phuong trinh vo nghiem");
					else if(delta==0) 
						System.out.printf("Phuong trinh co nghiem kep" + (float)-y/(2*x));
					else
						System.out.println("Phuong trinh co 2 nghiem:" + (float)(-y+Math.sqrt(delta))/(2*x)
											+" va "+ (float)(-y+Math.sqrt(delta))/(2*x));
				}
	}
	public static void bai3() {
		// tính tiền điện theo số điện của mỗi tháng
				System.out.println("Nhap so dien thang nay: ");
				int soDien = scanner.nextInt();
				double tien;
				if(soDien < 50)
					tien = soDien * 1000;
				else
					tien = soDien *1000 +(soDien  -50) *1200;
				System.out.println("Tien dien thang nay: " + tien);
	}
	public static void bai4() {
		//tao menu
		System.out.println("+-------------------------------+ ");
		System.out.println("1. Giai phuog trinh bac nhat");
		System.out.println("2. Giai phuong trinh bac hai");
		System.out.println("3. Tinh tien dien");
		System.out.println("4. Ket thuc");
		System.out.println("+-------------------------------+");
		System.out.println("nhap so chuong trinh ban muon thuc hien");
		int so = scanner.nextInt();
		switch(so) {
			case 1: bai1();
					break;
			case 2: bai2();
					break;
			case 3: bai3();
					break;
			case 4: System.exit(0);
					
		}
	}
}
