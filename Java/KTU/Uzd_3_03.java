package KTU;

import java.util.Scanner;

public class Uzd_3_03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Iveskite, kiek snaigiu nukrito per pirmaja sekunde ir kiek sekundziu snigo: ");
		int s = input.nextInt();
		int n = input.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum = sum + s;
			s = s * 2;
		}
		
		System.out.println(sum);
		
		input.close();
	}

}
