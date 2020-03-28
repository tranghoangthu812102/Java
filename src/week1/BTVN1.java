package week1;

import javax.swing.JOptionPane;
public class BTVN1 {
   public static void main(String[] args){
		String a, b, c, x= ":";
		double a1, b1, c1, x1 , x2, delta;
		a = JOptionPane.showInputDialog(null,
				"Nhap he so thu nhat",JOptionPane.INFORMATION_MESSAGE);
	 	b = JOptionPane.showInputDialog(null,
				"Nhap he so thu hai",JOptionPane.INFORMATION_MESSAGE);
	 	c = JOptionPane.showInputDialog(null,
				"Nhap he so thu ba",JOptionPane.INFORMATION_MESSAGE);
	 	a1 = Double.parseDouble(a);
	 	b1 = Double.parseDouble(b);
	 	c1 = Double.parseDouble(c);
	 	delta = b1*b1 - 4*a1*c1;
	 	if(a1==0) {
		 	if(b1==0) {
		 		if(c1!=0)
		 			JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem");
		 		else JOptionPane.showMessageDialog(null, "Phuong trinh vo so nghiem");
		 	}
		 	else { 
		 		x1 = -c1/b1;
		 		x += x1; 
		 		JOptionPane.showMessageDialog(null, "Nghiem la " + x );
		 	}
	 }
	 	else {
	 		if (delta == 0) {
	 			x1 = -b1/2*a1;
	 			x += x1;
	 			JOptionPane.showMessageDialog(null, "Nghiem kep" + x);
	 		}
	 		if (delta < 0) {
	 			JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem");
	 		}
	 		if(delta>0) {
	 			x1 = (-b1 + Math.sqrt(delta))/(2*a1);
	 			x2 = (-b1 - Math.sqrt(delta))/(2*a1);
	 			x += x1 + "va" + x2;
	 			JOptionPane.showMessageDialog(null, "Nghiem la " + x );
	 		}
	  	}
	  	System.exit(0);
	  }
	}


