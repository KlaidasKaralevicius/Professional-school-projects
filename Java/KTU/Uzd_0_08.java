package KTU;

import java.util.Scanner;

public class Uzd_0_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Automobiliu skaicius: ");
		int k = input.nextInt();

		System.out.println("I kelta telpa automobiliu: ");
		int m = input.nextInt();
		
		int kart = k / m;
		int liko = k % m;
		
		System.out.println("Perkels per kartu: " + kart);
		System.out.println("Liks neperkelta: " + liko);
		
		input.close();
	}

}
