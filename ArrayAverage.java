package assignment;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers= {5, 10, 15, 20, 25,30};
		
		double sum= 0;
		for (int num : numbers) {
			sum+= num;
		}
		double average = sum/numbers.length;
		System.out.println("The total average is " +average);
	}
	
}





