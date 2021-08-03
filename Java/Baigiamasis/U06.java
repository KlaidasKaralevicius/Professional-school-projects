package Baigiamasis;

import java.util.Scanner;

public class U06 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Kiek kartu mokesi per diena: ");
		int n = reader.nextInt();

		System.out.println("Ivesti kiekvieno karto pradzios valanda ir minute, ir pabaigos valanda ir minute: ");

		int sum = 0;

		for (int i = 0; i < n; i++) {

			int Aval = reader.nextInt();
			int Amin = reader.nextInt();
			int Bval = reader.nextInt();
			int Bmin = reader.nextInt();
			sum += Metodai.gautiTrukmeMinutemis(Aval, Amin, Bval, Bmin);
		}

		Metodai.gautiLaikoFormata(sum);

		reader.close();
	}

}
