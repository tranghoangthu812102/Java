package week1;

import javax.swing.JOptionPane;
public class BTVN2{
  public static void main(String[] args){
	String strSo1;
	String strLuachon = "tong la: ";
 	double iLuaChon, id = 0;
  	do {
  	strSo1 = JOptionPane.showInputDialog(null,
  				"Nhap so thuc",JOptionPane.INFORMATION_MESSAGE);
  	iLuaChon = JOptionPane.showConfirmDialog(null,
  			"Ban co muon nhap tiep khong?");
  	id += Double.parseDouble(strSo1);
  	if (iLuaChon == JOptionPane.NO_OPTION)
  		break;
  	} while(iLuaChon == JOptionPane.YES_OPTION);
  	strLuachon += id;
  	JOptionPane.showMessageDialog(null,"Cac so ban da chon " + strLuachon);
  	System.exit(0);
  }
}
