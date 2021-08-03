package KTU;

import java.util.Scanner;

public class Uzd_2_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Iveskite a reiksme. ");
		int a = input.nextInt();
		
		System.out.print("Iveskite b reiksme. ");
		int b = input.nextInt();
		
		System.out.print("Iveskite c reiksme. ");
		int c = input.nextInt();
		

		if (a % 3 == 0) {
			System.out.print("Atsakymas: " + a);
		} else if (b % 3 == 0) {
			System.out.print("Atsakymas: " + b);
		} else if (c % 3 == 0) {
			System.out.print("Atsakymas: " + c);
		} else {
			System.out.print("Atsakymas: nera");
		}
		
		input.close();
	}

}
