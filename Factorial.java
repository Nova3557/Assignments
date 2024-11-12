package assignment;


public class Factorial {

	public static void main(String[] args) {
		
		//5! = 5 * (4 * 3 * 2 * 1) = 120
		System.out.println(factorial(5));
	}
	
	public static int factorial(int a) {
		if(a == 1) {
			System.out.println("factorial(" + a + ") = 1");
			return 1;
		} else {
			System.out.println("factorial(" + a + ") = " + a + " * factorial(" + (a - 1) + ")");
			return a * factorial(a - 1);
		}
	}

}




