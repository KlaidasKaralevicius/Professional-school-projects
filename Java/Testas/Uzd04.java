package Testas;

import java.util.Scanner;

public class Uzd04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ivesti Lt ir ct: ");
		int Lt = input.nextInt();
		int ct = input.nextInt();

		int penkiasdesimt = (Lt * 100 + ct) / 50; 
		int dvidesimt = (Lt * 100 + ct) % 50 / 20;
		int desimt = (Lt * 100 + ct) % 20 / 10;
		int penki = (Lt * 100 + ct) % 10 / 5;
		int du = (Lt * 100 + ct) % 5 / 2;
		int vienas = (Lt * 100 + ct) % 5 % 2;
		
		System.out.println("50 ct - " + penkiasdesimt);
		System.out.println("20 ct - " + dvidesimt);
		System.out.println("10 ct - " + desimt);
		System.out.println("5 ct - " + penki);
		System.out.println("2 ct - " + du);
		System.out.println("1 ct - " + vienas);
		
		input.close();
	}

}
