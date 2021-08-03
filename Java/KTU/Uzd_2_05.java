package KTU;

import java.util.Scanner;

public class Uzd_2_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Iveskite klasiu vidurkius: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		
		double max = Math.max(a, Math.max(b, Math.max(c, d)));
		
		if (max == a) {
			System.out.println("Didziausias vidurkis: " + a);
			System.out.print("Kitu klasiu vidurkiai skiriasi: " + (a - b) + ", " + (a - c) + ", " + (a - d));
		} else if (max == b) {
			System.out.println("Didziausias vidurkis: " + b);
			System.out.print("Kitu klasiu vidurkiai skiriasi: " + (b - a) + ", " + (b - c) + ", " + (b - d));
		} else if(max == c) {
			System.out.println("Didziausias vidurkis: " + c);
			System.out.print("Kitu klasiu vidurkiai skiriasi: " + (c - a) + ", " + (c - b) + ", " + (c - d));
		}else {
			System.out.println("Didziausias vidurkis: " + d);
			System.out.print("Kitu klasiu vidurkiai skiriasi: " + (d - a) + ", " + (d - b) + ", " + (d - c));
		}
		
		input.close();
	}

}
