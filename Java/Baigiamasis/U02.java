package Baigiamasis;

import java.util.Scanner;

public class U02 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Iveskite deziu skaiciu: ");
		int a = reader.nextInt();
		System.out.print("Iveskite knygu skaiciu: ");
		int b = reader.nextInt();
		System.out.print("Iveskite, kelios knygos telpa i deze: ");
		int c = reader.nextInt();

		if (b <= a * c) {
			System.out.println("Knygos telpa i dezes.");
		} else {
			System.out.println("Knygos netelpa i dezes.");
			System.out.println("I dezes netilpo " + (b - a * c) + " knygos/-a/-u.");
		}

		reader.close();
	}

}
