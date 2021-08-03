package KTU;

import java.util.Scanner;

public class Uzd_0_03 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Kiek yra monetu po 5 ct? ");
		double a = reader.nextInt();

		System.out.println("Kiek yra monetu po 20 ct? ");
		double b = reader.nextInt();
		
		System.out.println("Kiek yra monetu po 2 Lt? ");
		double c = reader.nextInt();
		
		double sum = a / 20 + b / 5 + c * 2;
		
		System.out.println("Taupykleje yra " + sum + " Lt.");
		
		reader.close();
	}

}
