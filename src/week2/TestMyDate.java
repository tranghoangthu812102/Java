package week2;

import week2.MyDate;
public class TestMyDate {
	public static void main(String[] args) {
		//Goi ham khoi tao khong tham so
		MyDate obj1 = new MyDate();
		obj1.hienThi();

		//Goi ham khoi tao 3 tham so
		MyDate obj2 = new MyDate(12, 12, 2007);
		obj2.hienThi();

		MyDate obj3 = new MyDate();
		obj3.nhap();
		obj3.hienThi();
	}
}
