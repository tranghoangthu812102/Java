package baitapslide;



public class TestMyDate {

	
		public static void main(String[] args) {
			myDate[] myDates = new myDate[5];
			myDates[0] = new myDate(2,6,2020); 
			myDates[1] = new myDate(7,8,2020); 
			myDates[2] = new myDate(1,2,2020); 
			myDates[3] = new myDate(3,6,2020); 
			myDates[4] = new myDate(9,4,2020); 
			
			DateUtils dateUtils = new DateUtils();
			dateUtils.SortDate(myDates);
			for(int i =0 ;i <5 ;i ++) {
				myDates[i].print(2);
			}
		}
	}


