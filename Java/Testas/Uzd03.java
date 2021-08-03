package Testas;

import java.util.Scanner;

public class Uzd03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ivesti skaiciu: ");
		int x = input.nextInt();

		double y = 16 * Math.pow(x, 4) + 2 * x; 
		
		System.out.println("Gauta: y = " + y);
		
		input.close();
	}

}
