package KTU;

import java.util.Scanner;

public class Uzd_0_02 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Kiek zuvu gyvena akvariume? ");
		int a = reader.nextInt();
		
		System.out.println("Kiek zuvu idedama i akvariuma kiekviena diena? ");
		int b = reader.nextInt();
		
		System.out.println("Kiek dienu praejo? ");
		int n = reader.nextInt();
		
		int sum = a + b * n;
		
		System.out.println("Po " + n + " dienu akvariume gyvens " + sum + " zuvu.");

		reader.close();
	}

}
