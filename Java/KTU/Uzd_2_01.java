package KTU;

import java.util.Scanner;

public class Uzd_2_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Is kokio aukscio soka parasiutininkas? ");
		double h = input.nextDouble();

		System.out.print("Per kiek sekundziu issiskleide jo parasiutas? ");
		double t = input.nextDouble();
		
		double time = Math.sqrt(2 * h / 9.8);

		if (t < time) {
			System.out.println("Parasiutas issiskleis");
		}else {
			System.out.println("Parasiutas neissiskleis");
		}
		
		input.close();
	}

}
