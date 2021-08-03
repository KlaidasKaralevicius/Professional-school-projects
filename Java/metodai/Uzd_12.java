package metodai;

import java.util.Scanner;

public class Uzd_12 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Ivesti masyvo ilgi, intervalo pradzia ir pabaiga tarp kurio ribu bus sukurtos masyvo reiksmes: ");
		int n = reader.nextInt();
		int min = reader.nextInt();
		int max = reader.nextInt();

		int[] arrC = metodai.createArray(n, min, max);

		System.out.print("Masyvo reiksmes: ");
		metodai.printArray(arrC);

		System.out.print("Ivesti norimo pakeisti skaiciaus i 100 vieta masyvo eileja: ");
		int k = reader.nextInt();

		arrC[k - 1] = 100;

		System.out.print("Pakeistas masyvas: ");
		metodai.printArray(arrC);

		reader.close();
	}

}
