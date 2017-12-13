package primaryjavapros;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original, reverse ="";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		original = in.nextLine();
		int lenght = original.length();
		
		for (int i = lenght-1; i >=0; i--) 
			
			reverse = reverse +original.charAt(i);
		System.out.println("Reverse String is " + reverse);
			
		
	}
}
