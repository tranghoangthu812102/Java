package week1;

import javax.swing.JOptionPane;
public class Option{
  public static void main(String[] args){
  	int iLuaChon;
  	//String strLuaChon;
  	
  	iLuaChon = JOptionPane.showConfirmDialog(null,
  			"Co loi xay ra. Co muon tiep tuc?", "Loi",
  			JOptionPane.YES_NO_OPTION, 
  			JOptionPane.ERROR_MESSAGE);


  	JOptionPane.showMessageDialog(null,"Ban da chon " + iLuaChon);
  	System.exit(0);
  }
}