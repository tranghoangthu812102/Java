package baitapslide;

import java.util.Scanner;
import java.util.ArrayList;

public class thuvien {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int choice;
				String ten;
			    ArrayList<String> list = new ArrayList<String>(100);
			    
			  do {
					System.out.println();
					System.out.println("+--------MAIN MENU-------+");
					System.out.println("1. Show library information");
					System.out.println("2. Add new book ");
					System.out.println("3. find book");
					System.out.println("4. Exit");
					System.out.println("+------------------------+");
					System.out.print("Chon chuc nang: ");
					choice = sc.nextInt();
					ten = sc.nextLine();
					System.out.println();
					switch (choice) {
					case 1: {
						System.out.println("Show library information: ");
				        for (int i = 0; i < list.size(); i++) 
				            System.out.println(list.get(i));
							break;
					 }
					case 2:{
						
						System.out.print("Nhap ten sach: ");
						ten = sc.nextLine();
						if (list.size() < 100)
							list.add(ten);
						else 
							System.out.println("List full");
				        break;
					}
					case 3:{
						System.out.print("Nhap ten sach: ");
						ten = sc.nextLine();
						 System.out.println(list.contains(ten));
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


