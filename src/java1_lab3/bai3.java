/*Nhap mang so nguyen tuw ban phim
 1.Sap xep xuat mang vua nhap ra man hinh
 2.Xuat phan tu co gia tri nho nhat ra man hinh
 3.Tinh va xuat ra man hinh trung binh cong cua cac phan tu chia het cho 3*/
package java1_lab3;


import java.util.Arrays;
import java.util.Scanner;


public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Nhap so phan tu cua mang a: ");
		n = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0; i <n; i++)
		{
			System.out.printf("a[%d] = ", i);
			a[i] = sc.nextInt();
		}
		System.out.printf("1.Mang a[%d]: ", n);
		for(int j= 0 ; j< n ; j++)
		{
			Arrays.sort(a);
			System.out.print(a[j] + " ");
		}
		System.out.println("");
			
		System.out.println("2.Gia tri nho nhat cua mang la: " + a[0]);
		for(int i=0; i<n ; i++)
		{
			int dem = 0;
			if(a[i]%3 == 0)
			{	
				dem++;
				if(dem > 0)
					{
						int  sum = 0;
						double Tb;
						sum += a[i];
						Tb = (double) sum / dem;
						System.out.println("3.Gia tri TB cua cac phan tu chia het cho 3: " + Tb);	
					}
					
				else
					System.out.println("3.Mang khong co phan tu chia het cho 3");	
			}
		}
			
	}
}


