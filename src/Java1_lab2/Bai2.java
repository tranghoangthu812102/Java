package Java1_lab2;

import java.util.Scanner;
public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println();
			System.out.println("+----------MENU----------+");
			System.out.println("1. Giai phuong trinh bac 1");
			System.out.println("2. Giai phuong trinh bac 2");
			System.out.println("3. Tinh tien dien");
			System.out.println("4. Ket thuc!!!");
			System.out.println("+------------------------+");
			System.out.print("Chon chuc nang: ");
			choice = sc.nextInt();
			System.out.println();
			switch (choice) {
			case 1: {
				double a,b,x;
				System.out.print("Nhap gia tri cua a: ");
				a = sc.nextDouble();
				System.out.print("Nhap gia tri cua b: ");
				b = sc.nextDouble();
				
				if(a == 0 && b == 0)
					System.out.println("Phuong trinh vo so nghiem");
				else if (a == 0 && b != 0)
				{
					System.out.println("Phuong trinh vo nghiem");
				}
				else {
					x = -b / a;
					System.out.printf("Nghiem cua phuong trinh la %.2fx+%.2f = 0 la: %f",a,b,x);
					System.out.println();
				}
					break;
			 }
			case 2:{
				double k,l,h,delta,can,nghiem,nghiem1,nghiem2;
				System.out.print("Nhap gia tri cua k: ");
				k = sc.nextDouble();
				System.out.print("Nhap gia tri cua l: ");
				l = sc.nextDouble();
				System.out.print("Nhap gia tri cua h: ");
				h = sc.nextDouble();
				delta = l * l - 4 * k * h;
				can = Math.sqrt(delta);
				if(delta < 0)
					System.out.println("Phuong trinh vo nghiem");
				else if (delta == 0) {
					nghiem = -l/(2*k);
					System.out.printf("Phuong trinh nghiem kep: %.2f ", nghiem);
				}
				else {
					nghiem1 = (-l + can)/(2*k);
					nghiem2 = (-l - can)/(2*k);
					System.out.printf("Phuong trinh co hai nghiem phan biet la : %.2f va %.2f ", nghiem1,nghiem2);
				}
				
				break;
			}
			case 3:{
				int So,Tien;
				System.out.print("Nhap so dien su dung: ");
				So = sc.nextInt();
				if(So < 50)
					Tien = So * 1000;
				else {
					Tien = 50 * 1000 + (So - 50) * 1200;
				}
				System.out.printf("So tien phai thanh toan la : %d", Tien);
				
				break;
			}
			case 4:{
				System.out.println("Ket thuc chuong trinh!!!");
				System.out.println("TAM BIET BAN");
				break;
			}
			default:
				System.out.println("Error!!");
				System.out.println("Hay chon lai");
				
			}
		   
	       }while(choice!= 4);

	}
}
