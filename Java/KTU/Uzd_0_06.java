package KTU;

import java.util.Scanner;

public class Uzd_0_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Trapecijos ilgesniojo pagrindo ilgis: ");
		int a = input.nextInt();

		System.out.println("Trapecijos trumpesniojo pagrindo ilgis: ");
		int b = input.nextInt();
		
		System.out.println("Trapecijos aukstines ilgis: ");
		int h = input.nextInt();
		
		int plotas = (a + b) / 2 * h;
				
		System.out.println("Trapecijos plotas: " + plotas);
		
		input.close();
	}

}
