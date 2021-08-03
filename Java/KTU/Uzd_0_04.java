package KTU;

import java.util.Scanner;

public class Uzd_0_04 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Koks automobilio greitis? ");
		double v = reader.nextInt();
		
		double s = 264 / v * 60 * 60 / 1000;
		
		System.out.printf("Automobilis tuneli pravaziuos per %.2f s", s);
		
		reader.close();
	}

}
