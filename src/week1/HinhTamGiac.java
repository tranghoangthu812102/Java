package week1;

import java.util.Scanner;

public class HinhTamGiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int h, m;
			System.out.println("Hay nhap chieu cao h :");
			Scanner sc = new Scanner(System.in);
			h = sc.nextInt();
			
			for ( int i = 0 ; i < h; i++)
			{
				for(int j = 0; j < 2*h ; j ++)
					if(j >= (h-1-i) && j <= (h-1+i))
					System.out.print("*");
					else 
				     System.out.print(" ");	
					System.out.println();
					
			}
			System.out.println();
			System.out.println("Hay nhap chieu cao m :");
			Scanner sc1 = new Scanner(System.in);
			m = sc1.nextInt();
			
			for ( int i = 0 ; i < m; i++)
			{
				for(int j = 0; j < i ; j ++)
					System.out.print("*");
					System.out.println();
			}
			sc1.close();
			sc.close();
			}
			
	}
