package KTU;

import java.util.Scanner;

public class Uzd_4_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Iveskite suma: ");
		
		int did = 0;
		int number = 0;
		int sum = 0;
		
		while (true) {
			int a = input.nextInt();
			if (a > 100) {
				did++;
			}
			sum = sum + a; 
			if (a == 0) {
				break;
			}
			number++;
		}
		
		int vid = sum / number;
		
		System.out.println("1. " + did);
		System.out.println("2. " + vid);
		System.out.println("3. "+ number);
		
		input.close();
	}

}
