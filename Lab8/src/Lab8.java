import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap 2 so: ");
		double a = scanner.nextInt();
		double b = scanner.nextInt();
		System.out.println("Tong 2 so: ");
		System.out.println(XPoly.sum(a,b));
		System.out.println("So nho nhat: ");
		System.out.println(XPoly.min(a,b));
		System.out.println("so lon nhat: ");
		System.out.println(XPoly.max(a,b));
		System.out.println("Nhap 1 chuoi: ");
		String s = "nguyen vu hoang";
		System.out.println(XPoly.TOUPPERFIRSTCHAR(s));
		scanner.close();
	}
}
