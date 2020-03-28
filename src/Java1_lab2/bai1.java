package Java1_lab2;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int So,Tien;
		System.out.print("Nhap so dien su dung: ");
		So = sc.nextInt();
		if(So < 50)
			Tien = So * 1000;
		else {
			Tien = 50 * 1000 + (So - 50) * 1200;
		}
		System.out.printf("So tien phai thanh toan la : %d", Tien);
		
		

	}

}
