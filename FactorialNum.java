package assignment;

import java.io.InputStream;
import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		System.out.println("Enter the number: ");
		Scanner num = new Scanner (System.in);
		number = num.nextInt();
		int answer = factorial (number);
		System.out.println("Factorial of " + number + " is " + answer);

	}
	
	
	static int factorial( int a) {
		if (a==1)
			return 1;
		
		return a * factorial( a-1);
	}

}
