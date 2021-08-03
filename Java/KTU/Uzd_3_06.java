package KTU;

import java.util.Scanner;

public class Uzd_3_06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Iveskite kauliuku kieki: ");
		int n = input.nextInt();
		
		int number = 0;
		int sum = 0;
		
		int max = n * 6;
		
		for (int i = 1; i <= n; i++) {
			number++;
			System.out.print(number +"-o kauliuko tasku kiekis: ");
			int points = input.nextInt();
			sum = sum + points;
		}
		
		double vid = sum / (double)number;
		
		System.out.println("Is viso galima buvo surinkti tasku: " + max);
		System.out.println("Tomas is viso surinko: " + sum + " tasku");
		System.out.printf("Jo tasku vidurkis: %.1f", vid);
		System.out.println();
		
		if (sum > max / 2) {
			System.out.println("Loterija laimeta.");
		}else {
			System.out.println("Loterija pralaimeta.");
		}
		
		input.close();
	}

}
