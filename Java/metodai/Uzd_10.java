package metodai;

import java.util.Scanner;

public class Uzd_10 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Ivesti masyvo ilgi, intervalo pradzia ir pabaiga tarp kurio ribu bus sukurtos masyvo reiksmes: ");
		int n = reader.nextInt();
		int min = reader.nextInt();
		int max = reader.nextInt();

		int[] arrA = metodai.createArray(n, min, max);

		int count = 0;

		for (int i = 0; i < arrA.length; i++) {
			if (arrA[i] == 0) {
				count++;
			}
		}

		System.out.print("Masyvo reiksmes: ");
		metodai.printArray(arrA);
		System.out.println("Masyve yra " + count + " nuliai.");

		reader.close();
	}
}
