package KTU;

import java.util.Scanner;

public class Uzd_3_04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Kiek egluciu atvezta? ");
		int n = input.nextInt();

		int e;
		int number = 0;
		double vid = 0;
		
		for (int i = 1; i <= n; i++) {
			number++;
			System.out.print("Iveskite " + number + " eglutes auksti: ");
			e = input.nextInt();
			vid = vid + e;			
		}
		
		vid = vid / number;
		
		System.out.println("Eglutes aukscio vidurkis: " + vid + " cm");

		input.close();
	}

}
