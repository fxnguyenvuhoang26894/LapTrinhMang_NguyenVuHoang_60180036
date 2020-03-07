import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bai1();
		bai2();
		bai3();
		bai4();
		scanner.close();
	}
	public static void bai1() {
		System.out.println("Nhap vao mot so nguyen: ");
		int N = scanner.nextInt();
		boolean ok = true;
		for(int i=2; i < N-1; i++){ // N là số nhập từ bàn phím
		if(N % i == 0){
		ok = false;
		break;
		}
		i++;
		}
		if(ok) 
			System.out.println("so nguyen cua nhap vao la so nguyen to ");
		else
			System.out.println("so nguyen cua nhap vao khong la so nguyen to ");

	}
	public static void bai2()
	{
		for(int i=1; i<=9;i++) {
		for(int j=1; j<=10;j++){
			System.out.printf("%d x %d = %d",i,j,i*j);
			System.out.print("\t");
			}
		System.out.println();
		}
	}
	public static void bai3() {
		
		//sap xep mang
		int a[] = new int[5];
		System.out.println("Nhap 5 phan tu lan luot: ");
		for (int i=0; i<5; i++)
		{
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		
		System.out.println("mang cac phan tu sau sap xep: ");
		for (int i=0; i<5; i++)
		{
			System.out.println(a[i]);
		}
		
		//tim so nho nhat
		int min = a[0];
		for (int i=1; i<5; i++) {
			min = Math.min(min, a[i]);
		}
		System.out.println("Phan tu nho nhat trong mang: "+ min);
		
		//tinh trung binh cong nhung so chia het cho 3
		int sum=0, count=0;
		for (int i=0; i<5; i++)
		{
			if(a[i]%3==0) {
				sum += a[i];
				count++;
			}
		}
		System.out.println("Trung binh cong cac so chia het cho 3 trong mang:" + (float)sum/count);
	}
	public static void bai4() {
		System.out.println("Nhap so luong sinh vien = ");
		int n=scanner.nextInt();
		scanner.nextLine();
		String[] A=new String[n];
		int B[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("- Nhap thong tin sinh vien thu "+i+" : ");
			System.out.println("Ho ten sv: ");
			A[i]=scanner.nextLine();
			System.out.println("Diem : ");
			B[i]=scanner.nextInt();	
			scanner.nextLine();
		}
		
		for(int i=0;i<n;i++) {
			if(B[i]<5) {
				System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\nHoc Luc: yeu");
			}
			if(B[i]>=5 && B[i]<6.5) {

				System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\nHoc Luc: trung binh");
			}
			if(B[i]>=6.5 && B[i]<7.5) {

				System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\nHoc Luc: kha");
			}
			if(B[i]>=7.5 && B[i]<9) {

				System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\nHoc Luc: gioi");
			}
			if(B[i]>=9) {

				System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\nHoc Luc: xuat sac");
			}
		} 
		
		// sap xep sinh vien theo tang dan diem
		String tamA;
		int tamB;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(B[i]>B[j]) {
					tamA = A[i];
					A[i] = A[j];
					A[j] = tamA;
					tamB = B[i];
					B[i] = B[j];
					B[j] = tamB;
				}
			}		
		}
		System.out.println("\nDanh sach sv sau khi sap xep: ");
		for(int i=0;i<n;i++) {
			System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]);
		}
	}
}


