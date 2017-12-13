package primaryjavapros;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y, temp;
		
		System.out.println("Enter x and Y");
		Scanner in = new Scanner(System.in);
		
		
		x = in.nextInt();
		y = in.nextInt();
		System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
		
		
		x= x+y;//1+2=3
		y= x-y; //
		x=x-y;
		
		System.out.println("after Swapping\nx = "+x+"\ny = "+y);

	
	}

}
