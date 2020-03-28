package week1;

import javax.swing.JOptionPane;

public class TongHaiSo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strSo1, strSo2;
		String strHienThi = "Tong hai so ";
		
		strSo1 = JOptionPane.showInputDialog(null,
				"Hay nhap do thi 1: ","nhap so thu nhat",
				JOptionPane.INFORMATION_MESSAGE);
		strHienThi += strSo1 + " va ";
		
		strSo2 = JOptionPane.showInputDialog(null, 
				"Hay nhap so thu 2: ","Nhap so thu hai",
				JOptionPane.INFORMATION_MESSAGE);
		
		strHienThi += strSo2;
		
		int Tong = Integer.parseInt(strSo1) + Integer.parseInt(strSo2);
		strHienThi += " la " + String.valueOf(Tong);
		JOptionPane.showMessageDialog(null, strHienThi,
				"Hien thi hai so",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);

}
}
