/*Viết chương trình nhập một số nguyên từ bàn phím và xem số đó có phải là số nguyên tố không?*/
package java1_lab3;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhap gia tri cua so n: ");
		n = sc.nextInt();
		if(n>0) {
			if(KiemTra(n) == 1)
				System.out.println( n+ " la so nguyen to");
			else
				System.out.println(n + " khong la so nguyen to");
			
		}
	}
	public static  int KiemTra(int n){
		int dem =0;
		for(int i =1 ; i <= n ; i++)
		{
			if(n % i == 0)
				dem ++;	
		}
		if(dem == 2)
			return 1;
		else {
			return 0;
		}
		
	}
	

}
