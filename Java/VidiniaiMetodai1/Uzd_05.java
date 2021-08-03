package VidiniaiMetodai1;

import java.util.Scanner;

public class Uzd_05 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Input side-1: ");
		int a = reader.nextInt();

		System.out.print("Input side-2: ");
		int b = reader.nextInt();

		System.out.print("Input side-3: ");
		int c = reader.nextInt();

		Area(a, b, c);

		reader.close();
	}

	public static void Area(double a, double b, double c) {

		double semiP = (a + b + c) / 2;
		double triangleArea = Math.sqrt(semiP * (semiP - a) * (semiP - b) * (semiP - c));
		System.out.println("The area of the triangle is " + triangleArea);
	}
}
