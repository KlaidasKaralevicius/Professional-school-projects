package SwithIf;

import java.util.Scanner;

public class Exercise2_Kvadratas {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ivesti degtuku skaiciu: ");
		int n = reader.nextInt();

		System.out.println("Ivesta: " + n);
		
		if (n % 4 == 0) {
			System.out.println("Gauta: Kvadrata sudaryti galima.");
		} else {
			System.out.println("Gauta: Kvadrato sudaryti negalima.");
		}
		
		reader.close();
	}
}
