package week1;
import java.util.*;
public class tong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so thu nhat: ");
		int a = sc.nextInt();
		System.out.println("Nhap vao so thu hai: ");
		int b = sc.nextInt();
		int tong = a + b;
		int hieu = a - b;
		int tich = a * b;
		
		double thuong = (double) a / b;
		System.out.println("Tong hai so: " + tong);
		System.out.println("Hieu hai so: " + hieu);
		System.out.println("Tich hai so: " + tich);
		System.out.println("Thuong hai so: " + thuong);
		sc.close();
		}
}
