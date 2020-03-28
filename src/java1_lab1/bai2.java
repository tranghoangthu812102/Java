//Viet chuong trinh nhap tu ban phim hai canh cua hinh chu nhat
//Tinh va xuat chu vi, dien tich, canh nho cua hinh chu nhat
package java1_lab1;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a , b,c,s,min;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap do dai canh a: ");
		a = sc.nextDouble();
		System.out.print("Nhap do dai canh b: ");
		b = sc.nextDouble();
		c = (a + b) * 2;
		s = a * b;
		min = Math.min(a, b);
		System.out.printf("Chu vi hinh chu nhat: %.2f",c);
		System.out.println();
		System.out.printf("Dien tich hinh chu nhat: %.2f", s);
		System.out.println();
		System.out.printf("Canh nho hon la: %.2f ", min);
		
		
		
		

	}

}
