package SwithIf;

import java.util.Scanner;

public class Exercise6_Skaicius {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ivesti skaiciu: ");
		int number = reader.nextInt();
		
		System.out.println("Ivesta: " + number);
		
		if (number > 0) {
			System.out.println("Gauta: Teigiamas");
		} else if (number < 0) {
			System.out.println("Gauta: Neigiamas");
		} else {
			System.out.println("Gauta: Nulis");
		}

		reader.close();
	}

}
