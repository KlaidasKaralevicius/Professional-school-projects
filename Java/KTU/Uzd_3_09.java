package KTU;

import java.util.Scanner;

public class Uzd_3_09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Kiek buvo pirkiniu: ");
		int n = input.nextInt();
		
		int number = 0;
		int sum = 0;
		
		int mass = 0;
		
		for (int i = 1; i <= n; i++) {
			number++;
			System.out.print("Iveskite " + number + " pirkinio kaina ir svori: ");
			int ct = input.nextInt();
			int g = input.nextInt();
			sum = sum + ct;
			mass = mass + g;
		}
		
		int vid = sum / number;
		
		System.out.println("Pirkinio vidutine kaina: " + (vid / 100) + " Lt " + (vid % 100) + " ct.");
		
		if (mass < 5000 ) {
			System.out.println("Petriukas gales parnesti pirkinius.");
		} else {
			System.out.println("Petriukas negales parnesti pirkiniu.");
		}
		
		input.close();
	}

}
