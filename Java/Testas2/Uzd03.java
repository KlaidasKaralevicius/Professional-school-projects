package Testas2;

import java.util.Scanner;

public class Uzd03 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Ivesti darugu skaiciu ir pirma sugalvota skaiciu: ");
		int n = reader.nextInt(); // dalyvaujanciu draugu skaicius
		int s = reader.nextInt(); // pirmo draugo sugalvotas skaicius

		System.out.println("Ivesti norima pakeisti skaiciu ir kokiu skaiciumi norima pakeisti: ");

		int i = 0; // cikle naudojamas kintamasis
		n = n - 1; // pradedama nuo atro zaidejo nes pirmas skaiciaus nekeicia
		int start = s; // issaugomas pradinis skaicius

		while (n > i) { // ciklas veiks kol liks nepasisake draugai
			int sk = reader.nextInt(); // skaicius kuri nori pakeisti zaidejas
			int psk = reader.nextInt(); // kokiumi skaiciumi nori pakeisti pasirinkta skaciu
			if (sk == 1) {
				s = s - (s / 1000 * 1000) + (psk * 1000);
			} else if (sk == 2) {
				s = s - (s / 100 % 10 * 100) + (psk * 100);
			} else if (sk == 3) {
				s = s - (s / 10 % 10 * 10) + (psk * 10);
			} else {
				s = s - (s % 10) + psk;
			} // issirenka koki skaiciu norima keisti ir ji pakeiciame
			n--;
		}

		int rez = s - start; // pradinio ir galutinio skaiciaus skirtumas

		System.out.println(Math.abs(rez)); // isvedamass rezultatas absoliuciu dydziu

		reader.close();
	}

}
