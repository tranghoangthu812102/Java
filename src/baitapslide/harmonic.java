package baitapslide;

import java.util.Scanner;

public class harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int  n;
		float S = 0;
		System.out.print("Nhap gia tri cua n: ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++){
           
                  S= S + (float)1/i;
            }
      }
		//System.out.printf("Sum: %f" ,S);
		

	}


