package assignment;

public class FindMax1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] values = {23, 45, 34, 19, 76, 80};
		int max = 0;
		
		for (int i =0; i<values.length; i++) {
			if (values [i] > max) {
				max = values [i];
			}
		}
		System.out.println("The max value is " +max);
		

	}

}
