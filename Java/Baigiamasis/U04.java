package Baigiamasis;

import java.util.Scanner;

public class U04 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Iveskite intervalo pradzia: ");
		int a = reader.nextInt();
		System.out.print("Iveskite intervalo pabaiga: ");
		int b = reader.nextInt();

		int sum = 0;

		for (int i = a; i <= b; i++) {
			if (i % 6 == 0) {
				sum++;
			}
		}

		System.out.print("Reikalingas marskineliu skaicius: " + sum);

		reader.close();
	}

}
