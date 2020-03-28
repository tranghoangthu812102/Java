package baitapslide;

public class cau1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] data = {78,65,78,21,93,45,33,55,22,81};
			int sum = 0;
			int min = data[0];
			int max = data[0];
			for(int i = 0; i< data.length;i++)
			{
				sum +=data[i];
				if(data[i]<min)
					min = data[i];
				if(data[i] > max)
					max = data[i];
			}
			float TB;
			TB =  (float) sum/10.0f;
			System.out.println("Tong la: " + sum);
			System.out.println("TB la: " + TB);
			System.out.println("So nho nhat la: " + min);
			System.out.println("so Lon nhat la " + max);
			
			
			
	}

}
