package SwithIf;

import java.util.Scanner;

public class Exercise7_Kampas {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ivesti kampa laipsniais: ");
		int kampas = reader.nextInt();

		System.out.println("Ivesta: " + kampas);
		
		switch (kampas) {
		case 90:
			System.out.println("Gauta: Statusis");
			break;
		case 180:
			System.out.println("Gauta: Istiestinis");
			break;
		case 360:
			System.out.println("Gauta: Pilnutinis");
			break;
		default:
			if (kampas < 0) {
				System.out.println("Gauta: Kampo dydis turi buti teigiamas skaicius");
			} else {
				System.out.println("Gauta: Pavadinimo nera");
			}
			
		}
		reader.close();
	}

}
