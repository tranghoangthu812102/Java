package java1_lab3;

import java.util.Scanner;

import week2.inPutStr;

public class bai4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap So hoc sinh: ");
		int n = sc.nextInt();
		String[] hoTen = new String[n];
		double[] diemTb = new double[n];
		for(int i = 0; i< n; i++)
		{
			System.out.println("Nhap Ho va ten: ");
			sc.next();
			 hoTen[i] = sc.next();
			System.out.println("Nhap Diem: ");
			 diemTb[i] = sc.nextDouble();
		}
		for(int i = 0; i< n; i++)
		{
			if(diemTb[i] < 5)
			{
				System.out.println("Hoc sinh:" + hoTen[i]);
				System.out.println("Diem:" + diemTb[i]);
				System.out.println("Hoc luc: Yeu");	
			}
			else if(5 <= diemTb[i] && diemTb[i]< 6.5)
			{
				System.out.println("Hoc sinh:" + hoTen[i]);
				System.out.println("Diem:" + diemTb[i]);
				System.out.println("Hoc luc: Trung binh");	
			}
			else if(6.5 <= diemTb[i] && diemTb[i]< 7.5)
			{
				System.out.println("Hoc sinh:" + hoTen[i]);
				System.out.println("Diem:" + diemTb[i]);
				System.out.println("Hoc luc: Kha");	
			}
			else if(7.5 <= diemTb[i] && diemTb[i]< 9)
			{
				System.out.println("Hoc sinh:" + hoTen[i]);
				System.out.println("Diem:" + diemTb[i]);
				System.out.println("Hoc luc: gioi");	
			}
			else 
			{
				System.out.println("Hoc sinh:" + hoTen[i]);
				System.out.println("Diem:" + diemTb[i]);
				System.out.println("Hoc luc: Xuat sac");	
			}
		}
		Sapxep(diemTb);
		System.out.println("Danh sach hoc sinh sap xep theo diem tang dan:");
		for(int i=0; i< n; i++)
		{
			System.out.printf("%s:  %f", hoTen[i],diemTb[i]);
		}
		
	}
	public static void Sapxep(double[] diemTb) {
		double temp = diemTb[0];
		for(int i = 0; i< diemTb.length-1; i++)
		{
			for(int j= i+1; j< diemTb.length; j++)
			{
				if(diemTb[i] > diemTb[j] )
				{
					
					temp = diemTb[j];
					diemTb[j] = diemTb[i];
					diemTb[i] = temp;	
				}
			}
		}
	}
	
		
		
	
	
}
