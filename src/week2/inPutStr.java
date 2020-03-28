package week2;

import java.util.*;
public class inPutStr {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("---------BAI 1.1---------- ");
				System.out.println("Nhap mot dong chu: ");
				String s = sc.nextLine();
				System.out.println("Dong vua nhap: " + s);
			System.out.println("---------BAI 1.2---------- ");
				System.out.println("Nhap so thu nhat: ");
				int a = sc.nextInt();
				System.out.println("Nhap so thu hai: ");
				int b = sc.nextInt();
				int tong = a + b;
				System.out.println("Ket qua: " + tong);
			System.out.println("---------BAI 1.3---------- ");
				System.out.println("Nhap so nguyen: ");
				int c = sc.nextInt();
				System.out.println("Nhap so thuc: ");
				float f = sc.nextFloat();
				System.out.println("Nhap so thuc: ");
				double d = sc.nextDouble();
				System.out.printf("Cac so vua nhap: %d; %.2f; %.2f ",c,f,d );
				
			

	}

}
