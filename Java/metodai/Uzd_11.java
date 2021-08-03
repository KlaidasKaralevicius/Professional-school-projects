package metodai;

import java.util.Scanner;

public class Uzd_11 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Ivesti masyvo ilgi, intervalo pradzia ir pabaiga tarp kurio ribu bus sukurtos masyvo reiksmes: ");
		int n = reader.nextInt();
		int min = reader.nextInt();
		int max = reader.nextInt();

		int[] arrB = metodai.createArray(n, min, max);

		int count = 0;
		int sum = 0;

		for (int i = 0; i < arrB.length; i++) {
			if (arrB[i] % 3 == 0) {
				count++;
				sum += arrB[i];
			}
		}

		System.out.print("Masyvo reiksmes: ");
		metodai.printArray(arrB);
		System.out.println("Masyve yra " + count + " skaiuciu kurie dalinasi is 3, o ju suma = " + sum);

		reader.close();
	}

}
