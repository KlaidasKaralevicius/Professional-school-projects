package KTU;

import java.util.Scanner;

public class Uzd_4_07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int number = 0;
		int allow = 0;
		
		while (true) {
			System.out.print("Iveskite kiek balu gavo mokinys: ");
			int points = input.nextInt();
			if (points >= 5) {
				allow++;
			}
			if (points == 0) {
				break;
			}
			number++;
		}
		
		System.out.print("I karnavala ejo " + number + " mokiniai, pateko " + allow);

		input.close();
	}

}
