package KTU;

import java.util.Scanner;

public class Uzd_0_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Kiek sausainiu iskepe Tautvydas? ");
		int a = input.nextInt();

		System.out.println("Keli draugai dar atsinese po tiek pat sausainiu? ");
		int b = input.nextInt();
		
		System.out.println("Kiek zmoniu is viso dalyvavo sventeje? ");
		int c = input.nextInt();
		
		int dal = (a + b * a) / c;
		int liko = (a + b * a) % c;
		
		System.out.println("Kiekvienas sventes dalyvis gavo po " + dal + " sausainius");
		System.out.println("Tautvydui papildomai atiteko " + liko + " sausainiai");
		
		input.close();
	}

}
