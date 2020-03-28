package week1;

import javax.swing.JOptionPane;
public class BTVN3{
  public static void main(String[] args){
	String thang, nam;
 	int a, b;
 	nam = JOptionPane.showInputDialog(null,
 			"Hay nhap nam: ","NAM", JOptionPane.INFORMATION_MESSAGE);
 	thang = JOptionPane.showInputDialog(null,
 			"Hay nhap thang: ","THANG", JOptionPane.INFORMATION_MESSAGE);
 	a = Integer.parseInt(thang);
 	b = Integer.parseInt(nam)%4;
 	switch (a) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		JOptionPane.showMessageDialog(null, "Thang " + thang + " nam " + nam + " co 31 ngay.");
		break;
	case 2:
		if(b==0)
			JOptionPane.showMessageDialog(null, "Thang " + thang + " nam " + nam + " co 29 ngay.");
		else JOptionPane.showMessageDialog(null, "Thang " + thang + " nam " + nam + " co 28 ngay.");
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		JOptionPane.showMessageDialog(null, "Thang " + thang + " nam " + nam + " co 30 ngay.");
		break;
	default:
		break;
	}
  }
}
