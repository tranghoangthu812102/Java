package week1;

import javax.swing.*;
public class HelloNameDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result;
		result = JOptionPane.showInputDialog("Hay nhap ten ban: ");
		JOptionPane.showMessageDialog(null, "Xin chao" + result + "!");
		System.exit(0);

	}

}
