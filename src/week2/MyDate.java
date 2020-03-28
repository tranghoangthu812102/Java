package week2;

import javax.swing.JOptionPane;
import java.util.Calendar;

public class MyDate {

   private int ngay; // 1-31
   private int thang; // 1-12
   private int nam;

   // Ham khoi tao khong tham so
   public MyDate()
   {
	Calendar cal = Calendar.getInstance(); // Ngay thang nam hien tai

	setNgay(cal.get(Calendar.DAY_OF_MONTH));
	setThang(cal.get(Calendar.MONTH) + 1);
	setNam(cal.get(Calendar.YEAR));
   }

    // Ham khoi tao 3 tham so ngay, thang va nam
    public MyDate(int d, int m, int y)
    {
	 setNgay(d);
	 setThang(m);
	 setNam(y);
    }

    public void setNgay(int ng){
	 ngay = ng;
    }

    public void setThang(int th){
      thang = th;
    }

    public void setNam(int n){
      nam = n;
    }

    public int getNgay(){
	 return ngay;
    }

    public int getThang(){
	 return thang;
    }

    public int getNam(){
	 return nam;
    }

    public void nhap(){
	  String strNgay, strThang, strNam;
	  int iNgay, iThang, iNam;

	  do{
	     strNgay = JOptionPane.showInputDialog(null,"Nhap ngay: ",JOptionPane.INFORMATION_MESSAGE);

		iNgay = Integer.parseInt(strNgay);
	  } while (iNgay < 1 || iNgay > 32);

	  setNgay(iNgay);

	  do{
	     strThang = JOptionPane.showInputDialog(null,"Nhap thang: ",JOptionPane.INFORMATION_MESSAGE);

		iThang = Integer.parseInt(strThang);
	  } while (iThang < 1 || iThang > 12);

	  setThang(iThang);

	  do{
	     strNam = JOptionPane.showInputDialog(null,"Nhap nam: ",JOptionPane.INFORMATION_MESSAGE);

		iNam = Integer.parseInt(strNam);
	  } while (iNam < 0);

	  setNam(iNam);
   }

   public void hienThi(){
  	  Calendar cal = Calendar.getInstance();
  	  cal.set(getNam(), getThang() - 1, getNgay());

 	  JOptionPane.showMessageDialog(null,((cal.get(Calendar.DAY_OF_WEEK)==1)?"Chu nhat":"Thu " + cal.get(Calendar.DAY_OF_WEEK))
		  	  		+ ", ngay " + getNgay() + "/" + getThang() + "/" + getNam());
   }
}
