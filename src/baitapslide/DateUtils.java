package baitapslide;

public class DateUtils {
	
	public int CompareDate(myDate data1, myDate data2) {
		if(data1.getYear() > data2.getYear())
			return 1;
		else if(data1.getYear() == data2.getYear())
			if(data1.getMonth() > data2.getMonth())
				return 1;
			else if(data1.getMonth() ==  data2.getMonth())
				if(data1.getDay() > data2.getDay())
					return 1;
				else if (data1.getDay() == data2.getDay())
					return 0;
				else 
					return -1;
			else 
				return -1;
		else 
			return -1;
	}
	
	public void SortDate(myDate[] mydate) {
		for(int i = 0 ; i< mydate.length -1 ; i++) 
			for(int j = i+1; j < mydate.length ; j++) {
				if(CompareDate(mydate[i], mydate[j])==1) {
					myDate tmp = mydate[i];
					mydate[i] = mydate[j];
					mydate[j] = tmp;
				}		
			}
	}

}