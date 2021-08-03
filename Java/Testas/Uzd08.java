package Testas;

import java.util.Scanner;

public class Uzd08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ivesti tris koeficientus: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int D = b * b - 4 * a * c;
		int x = - b / (2 * a);
		double x1 = (- b + Math.sqrt(D)) / (2 * a);
		double x2 = (- b - Math.sqrt(D)) / (2 * a);
		
		System.out.println("Ivesta: " + a + ", " + b + ", " + c);
		
		if (D < 0) {
			System.out.println("Gauta: Sprendimu nera, nes D neigiamas.");
		} else if (D == 0) {
			System.out.println("Gauta: x = " + x);
		} else {
			System.out.println("Gauta: x1 = " + x1 + ", x2 = " + x2);
		}
		
		input.close();
	}

}
