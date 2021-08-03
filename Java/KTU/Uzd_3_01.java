package KTU;

import java.util.Scanner;

public class Uzd_3_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Iveskite intervalo pradzia: ");
		int a = input.nextInt();

		System.out.print("Iveskite intervalo pabaiga: ");
		int b = input.nextInt();

		int kiek = 0;
		
		for (int i = a; i <= b; i++) {
			if (i % 6 == 0) {
				kiek++;
			}
		}
		
		System.out.print("Reikalingu marskineliu kiekis: " + kiek);
		
		input.close();
	}

}
