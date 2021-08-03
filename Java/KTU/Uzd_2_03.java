package KTU;

import java.util.Scanner;

public class Uzd_2_03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Kokius pazymius gavo Petriukas? ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		
		double vid = (a + b + c + d + e) / 5; 

		if (vid > 9) {
			System.out.print("Petriukas gaus tris saldainius");
		} else if (vid >= 7 && vid <= 9) {
			System.out.print("Petriukas gaus du saldainius");
		}else {
			System.out.print("Petriukas gaus viena saldaini");
		}
		
		input.close();
	}

}
