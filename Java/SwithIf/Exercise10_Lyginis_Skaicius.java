package SwithIf;

import java.util.Scanner;

public class Exercise10_Lyginis_Skaicius {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ivesti 3 skaicius: ");
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();

		System.out.println("Ivesta: " + a + ", " + b + ", " + c);

		if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0 ) {
			System.out.println("Gauta: Taip");
		} else {
			System.out.println("Gauta: Ne");
		}
		
		reader.close();
	}

}
