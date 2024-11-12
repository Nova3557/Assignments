package assignment;

public class FindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num = {17, 10, 17, 20, 9};
		int min =num[0];
		
		for (int i=1; i<num.length; i++) {
			if (num [i] < min) {
				min = num[i];
				
			}
		}
		System.out.println("The minimum number is " +min);

	}

}
