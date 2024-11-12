package assignment;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = { 35, 78, 54, 67, 98, 12};
		int max = numbers [0];
		for (int n : numbers) {
			if (max<n) {
				max=n;
			}
		}
		System.out.println("The maximum number is " +max);

	}

}
