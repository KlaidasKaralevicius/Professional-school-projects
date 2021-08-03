package KTU;

import java.util.Scanner;

public class Uzd_3_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Iveskite draugu sugalvotus skaicius: ");

		int ats = 0;
		
		for (int i = 10; i >= 1; i--) {
			int n = input.nextInt();
			if (n % 2 == 0) {
				ats++;
			}
		}
		
		if (ats == 0) {
			System.out.print("Atsakymas: Nera");
		} else {
			System.out.print("Atsakymas: " + ats);
		}
		
		input.close();
	}

}
