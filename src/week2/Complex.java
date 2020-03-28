package week2;

import java.util.Scanner;

public class Complex {
	private double phan_thuc;
	private double phan_ao;
	//Viet cac thuoc tinh Get,Set cho complex de dam bao tinh dong goi
	public double getPhan_thuc() {
		return phan_thuc;
	}

	public void setPhan_thuc(double phan_thuc) {
		this.phan_thuc = phan_thuc;
	}

	public double getPhan_ao() {
		return phan_ao;
	}

	public void setPhan_ao(double phan_ao) {
		this.phan_ao = phan_ao;
	}
	//Khoi tao khong co tham so
	public Complex(){
		super();
		this.phan_thuc= 0.0;
		this.phan_ao = 0.0;
	}
	//Khoi tao co tham so
	public Complex(double a,double b) {
		setPhan_thuc(a);
		setPhan_ao(b);
	}
	//Viet phuong thuc nhap vao mot so phuc tu ban phim
	public void Nhap(Complex cmp){
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap phan thuc: ");
//		a = sc.nextDouble();
		setPhan_thuc(sc.nextDouble());
		System.out.print("Nhap phan ao: ");
//		b = sc.nextDouble();	
		setPhan_ao(sc.nextDouble());
	}
	public Complex congHaiSoPhuc(Complex cmp1,Complex cmp2) {
		Complex tong = new Complex(cmp1.phan_thuc+cmp2.phan_thuc,cmp1.phan_ao+cmp2.phan_ao);
		return tong;
	}
	public Complex truHaiSoPhuc(Complex cmp1,Complex cmp2) {
		Complex hieu = new Complex(cmp1.phan_thuc-cmp2.phan_thuc,cmp1.phan_ao-cmp2.phan_ao);
		return hieu;
	}
	public Complex nhanHaiSoPhuc(Complex cmp1,Complex cmp2) {
		Complex tich = new Complex(cmp1.phan_thuc*cmp2.phan_thuc -
				cmp1.phan_ao*cmp2.phan_ao,
				cmp1.phan_thuc*cmp2.phan_ao + 
				cmp2.phan_thuc*cmp1.phan_ao);
		return tich;
	}
	public Complex chiaHaiSoPhuc(Complex cmp1,Complex cmp2) {
		double mau = cmp2.phan_thuc * cmp2.phan_thuc + cmp2.phan_ao * cmp2.phan_ao;
		Complex thuong = new Complex((cmp1.phan_thuc*cmp2.phan_thuc+cmp1.phan_ao*cmp2.phan_ao)/mau,
				(cmp2.phan_thuc*cmp1.phan_ao - cmp1.phan_thuc*cmp2.phan_ao)/mau);
		return thuong;
	}
	public static void inSoPhuc(Complex cmp) {
		System.out.println("(" + cmp.phan_thuc +") + ("+ cmp.phan_ao +")i");
	}
	
	public static void main(String[] args) {
		Complex obj1 = new Complex();
		inSoPhuc(obj1);
		
		obj1.Nhap(obj1);
		inSoPhuc(obj1);
		
		Complex obj2 = new Complex();
		obj2.Nhap(obj2);
		inSoPhuc(obj2);
		
		Complex obj3 = new Complex();
		obj3 = obj3.congHaiSoPhuc(obj1, obj2);
		System.out.print("Tong: "); obj3.inSoPhuc(obj3);
		obj3 = obj3.truHaiSoPhuc(obj1, obj2);
		System.out.print("Hieu: "); obj3.inSoPhuc(obj3);
		obj3 = obj3.nhanHaiSoPhuc(obj1, obj2);
		System.out.print("Tich: "); obj3.inSoPhuc(obj3);
		obj3 = obj3.chiaHaiSoPhuc(obj1, obj2);
		System.out.print("Thuong: "); obj3.inSoPhuc(obj3);
	}
	
}