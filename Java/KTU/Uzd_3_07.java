package KTU;

import java.util.Scanner;

public class Uzd_3_07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Kiek kartu sokinejo: ");
		int m = input.nextInt();
		
		int number = 0;
		int sum = 0;
		
		for (int i = 1; i <= m; i++) {
			number++;
			System.out.print("Kiek susokinejo kartu " + number + " bandymu: ");
			int k = input.nextInt();
			sum = sum + k;
		}

		int vid = sum / number;
		
		System.out.println("Is viso: " + sum);
		System.out.println("Vidutiniskai: " + vid);
		
		input.close();
	}

}
