package assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "mommy";
		
		String reverse = " ";
		
		for (int i = a.length()-1; i>=0; i--) {
			reverse += a.charAt(i);
			System.out.println(reverse);
			
		}
		boolean palindrome = true;
		for (int i =0; i<a.length(); i++){
			System.out.println(i);
		}
		

	}

}
