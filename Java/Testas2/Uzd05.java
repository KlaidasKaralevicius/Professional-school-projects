package Testas2;

import java.util.Scanner;

public class Uzd05 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Ivesti korteliu skaiciu: ");
		int n = reader.nextInt(); // korteliu skaicius

		System.out.println("Ivesti abieju zaideju kortelese esancius skaicius: ");

		int maxSum = 0; // didziausias rezultatas
		int a1 = 0; // didziausio rezultato pirmos korteles skaicius
		int b1 = 0; // didziausio rezultato atros korteles skaicius

		for (int i = 0; i < n / 2; i++) { // ciklas vyks kol liks korteles
			int a = reader.nextInt(); // pirmo zaidejo korteles skaicius
			int b = reader.nextInt(); // antro zaidejo korteles skaicius
			if (a + b > maxSum) {
				maxSum = a + b;
				a1 = a;
				b1 = b;
			} // jeigu rezultatas didesnis uz pries tai maximalu rezultata issaugomas max
				// rezultatas ir jo demenys
		}

		System.out.println(maxSum + " " + a1 + " " + b1); // isvedamas max rezultatas ir jo demenys

		if (a1 > b1) {
			System.out.println("1");
		} else if (a1 < b1) {
			System.out.println("2");
		} else {
			System.out.println("1 2");
		} // isvedamas nugaletojas, arba 2 nugaletojai jei buvo lygiosios

		reader.close();
	}

}
