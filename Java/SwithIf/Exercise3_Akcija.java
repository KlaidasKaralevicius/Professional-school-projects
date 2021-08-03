package SwithIf;

import java.util.Scanner;

public class Exercise3_Akcija {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ivesti prekes kaina ir perkamu prekiu kieki: ");
		double k = reader.nextDouble();
		int vnt = reader.nextInt();
		double sum;
		
		System.out.println("Ivesta: k = " + k + " ir vnt = " + vnt);
		
		if (vnt > 3) {
			sum = vnt * k * 0.8;
			System.out.printf("Gauta: Suma su nuolaida: %.2f", sum);
		} else {
			sum = vnt * k;
			System.out.printf("Gauta: Suma (be nuolaidos): %.2f", sum);
		}
		
		reader.close();
	}
}
