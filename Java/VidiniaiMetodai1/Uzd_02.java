package VidiniaiMetodai1;

import java.util.Scanner;

public class Uzd_02 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Input the first number: ");
	      double a = reader.nextInt();

	      System.out.print("Input the second number: ");
	      double b = reader.nextInt();

	      System.out.print("Input the third number: ");
	      double c = reader.nextInt();
	      
	      Avg(a, b, c);
		
		reader.close();
	}
	public static void Avg(double a, double b,double c) {
		
		double average = (a + b + c) / 3;
		System.out.println("The average value is " + average);
	}
}
