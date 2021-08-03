package SwithIf;

import java.util.Scanner;

public class Exercise8_Trizenklis {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ivesti skaiciu: ");
		int number = reader.nextInt();

		System.out.println("Ivesta: " + number);

		
		if (100 <= number && number <= 1000) {
			System.out.println("Gauta: Taip");
		} else {
			System.out.println("Gauta: Ne");
		}
		reader.close();
	}
}
