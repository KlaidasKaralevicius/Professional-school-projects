package KTU;

import java.util.Scanner;

public class Uzd_2_07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Iveskite uzduoties varianta. ");
		int variantas = input.nextInt();

		System.out.print("Iveskite a reiksme. ");
		int a = input.nextInt();

		System.out.print("Iveskite b reiksme. ");
		int b = input.nextInt();

		int x;
		
		if (variantas == 1) {
			x = a * b + 3;
			System.out.print("Atsakymas: x = " + x);
		}else if (variantas == 2) {
			x = a + b;
			System.out.print("Atsakymas: x = " + x);
		}else {
			x = a - b;
			System.out.print("Atsakymas: x = " + x);
		}
		
		input.close();
	}

}
