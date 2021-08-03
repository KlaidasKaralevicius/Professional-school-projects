package Testas;

import java.util.Scanner;

public class Uzd06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ivesti tris skaiciu: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		System.out.println("Ivesta: " + a + ", " + b + ", " + c + ".");
		
		if (a < b && a < c) {
			System.out.println("Gauta: " + a);
		} else if (b < a && b < c) {
			System.out.println("Gauta: " + b);
		} else {
			System.out.println("Gauta: " + c);
		}
		
		input.close();
	}

}
