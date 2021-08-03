package KTU;

import java.util.Scanner;

public class Uzd_0_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Puodeliu, kuriuos reik supakuoti, skaicius: ");
		int m = input.nextInt();

		int pak = m / 3; 
		int liko = m % 3;
		
		System.out.println("Pilnu dezuciu skaicius: " + pak);
		System.out.println("Nepakuotu puodeliu skaicius: " + liko); 
		
		input.close();
	}

}
