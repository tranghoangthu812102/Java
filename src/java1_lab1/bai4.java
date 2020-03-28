package java1_lab1;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c, delta,can;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap gia tri cua a: ");
		a = sc.nextDouble();
		System.out.print("Nhap gia tri cua b: ");
		b = sc.nextDouble();
		System.out.print("Nhap gia tri cua c: ");
		c = sc.nextDouble();
		delta = b * b - 4 * a *c;
		can = Math.sqrt(delta);
		System.out.printf("Gia tri cua can delta: %f ",can);
		
		
		
	}

}
