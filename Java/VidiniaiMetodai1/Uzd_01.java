package VidiniaiMetodai1;

import java.util.Scanner;

public class Uzd_01 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Input the first number: ");
	      double a = reader.nextInt();

	      System.out.print("Input the second number: ");
	      double b = reader.nextInt();

	      System.out.print("Input the third number: ");
	      double c = reader.nextInt();
	      
	      Min(a, b, c);
		
		reader.close();
	}
	public static void Min(double a, double b,double c) {
		
		double minimum = Math.min(a, Math.min(b, c));
		System.out.println("The smalles value is " + minimum);
	}
}
