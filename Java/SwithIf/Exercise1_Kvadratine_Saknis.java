package SwithIf;

import java.util.Scanner;

public class Exercise1_Kvadratine_Saknis {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
        System.out.println("Ivesti neneigiama skaiciu: ");
		int sk = reader.nextInt();
		
		double sqrt = 0;
		
		if (sk >= 0) {
			sqrt = sqrt + Math.sqrt(sk);
		} else {
			System.out.println("Saknies istraukti negalima, nes ivestas neigiamas skaicius.");
		}
		
		System.out.println("Ivesta: " + sk);
		System.out.printf("Gauta: %.2f", sqrt);
		
		reader.close();
	}

}
