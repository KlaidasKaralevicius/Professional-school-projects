package KTU;

import java.util.Scanner;

public class Uzd_2_04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Ivesti kainas a ir b: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		System.out.print("Ivesti kiekius n1, n2 ir n3: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();

		System.out.print("Ivesti bandeles kaina: ");
		double k = input.nextDouble();

		double price; 
		
		if (k <= a) {
			price = k * n1;
			System.out.printf("Uz bandeles bus sumoketa: %.2f Lt.", price);
		}else if (k >= a && k <= b) {
			price = k * n2;
			System.out.printf("Uz bandeles bus sumoketa: %.2f Lt.", price);
		}else {
			price = k * n3;
			System.out.printf("Uz bandeles bus sumoketa: %.2f Lt.", price);
		}

		input.close();
	}

}
