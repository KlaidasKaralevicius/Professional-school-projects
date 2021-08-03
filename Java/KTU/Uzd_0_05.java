package KTU;

import java.util.Scanner;

public class Uzd_0_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sienos ilgis metrais ");
		int a = input.nextInt();

		System.out.println("Sienos aukstis metrais ");
		int h = input.nextInt();
		
		System.out.println("Plytos kaina Lt ");
		double k = input.nextDouble();
		
		int sum = (a * 5) * (h * 10);
		double kaina = sum * k;
		
		System.out.println("Plytu kiekis: " + sum);
		System.out.printf("Plytos kainuos %.2f Lt", kaina);
		
		input.close();
	}

}
