package VidiniaiMetodai1;

import java.util.Scanner;

public class Uzd_03 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Input an integer: ");
	      int a = reader.nextInt();

	      Sum(a);
	      
		reader.close();
	}
public static void Sum(int a ) {
		
		int suma = a % 10 + a / 10;
		System.out.println("The sum is " + suma);
	}

}
