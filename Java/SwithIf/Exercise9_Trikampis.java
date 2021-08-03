package SwithIf;

import java.util.Scanner;

public class Exercise9_Trikampis {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ivesti 3 krastiniu ilgius: ");
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();

		int dviKrast = a * a + b * b;
		
		System.out.println("Ivesta: " + a + ", " + b + ", " + c);
		
		if (dviKrast == c * c) {
			System.out.println("Gauta: Galima sudaryti trikampi");
		} else {
			System.out.println("Gauta: Negalima sudaryti trikampio");
		}
		
		reader.close();
	}
}
