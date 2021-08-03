package KTU;

import java.util.Scanner;

public class Uzd_4_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Sukauptas riesutu kiekis X = ");
		int X = input.nextInt();
		
		System.out.print("Voveriuku skaicius V = ");
		int V = input.nextInt();
		
		int K = 0;
		
		while (X > 0) {
			X = X - (V + 1) * 3;
			K++;
		}
		
		System.out.println("Riesutu sukaupta " + K + " dienoms");
		
		if (K >= 92) {
			System.out.println("Riesutu uzteks visai ziemai");
		}else {
			System.out.println("Riesutu neuzteks visai ziemai");
		}
		
		input.close();
	}

}
