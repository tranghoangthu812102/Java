package java1_lab1;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,v,v2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap do dai canh a: ");
		a = sc.nextDouble();
		v = a * a *a ;
		v2 = Math.pow(a, 3);
		System.out.printf("The tich hinh lap phuong: %.2f",v);
		System.out.println();
		System.out.printf("The tich hinh lap phuong: %.2f", v2);
	}

}
