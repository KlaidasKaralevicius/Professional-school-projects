package KTU;

import java.util.Scanner;

public class Uzd_2_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Kiek sveria varle? ");
		int m = input.nextInt();

		System.out.print("Kiek varliu norima stebeti? ");
		int n = input.nextInt();
		
		if (m * n >= 5000) {
			System.out.print("Varliu stebejimui pakanka");
		}else {
			System.out.print("Varliu stebejimui per mazai");
		}
		
		input.close();
	}

}
