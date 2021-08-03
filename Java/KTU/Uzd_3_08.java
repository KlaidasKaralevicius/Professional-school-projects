package KTU;

import java.util.Scanner;

public class Uzd_3_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Kiek dalyvavo begiku: ");
		int n = input.nextInt();
		
		int number = 0;
		int sum = 0;
		int max = 0;
		
		for (int i = 1; i <= n; i++) {
			number++;
			System.out.print("Iveskite " + number + " begiko laika: ");
			int k = input.nextInt();
			sum = sum + k;
			if (k > max) {
				max = k;
			}
		}

		int vid = sum / number;
		
		System.out.println("Greiciausio begiko laikas: " + max + " sek.");
		System.out.println("Jis buvo " + (max - vid) + " sek geresnis uz vidurki. ");
		
		input.close();
	}

}
