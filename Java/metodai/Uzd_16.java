package metodai;

import java.util.Scanner;

public class Uzd_16 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print(
				"Ivesti masyvo ilgi, intervalo pradzia ir pabaiga tarp kurio ribu bus sukurtos masyvo reiksmes: ");
		int n = reader.nextInt();
		int min = reader.nextInt();
		int max = reader.nextInt();
		
		int [] arrG = metodai.createArray(n, min, max);
		
		System.out.print("Masyvo reiksmes: ");
		metodai.printArray(arrG);
		
		int[] arrH;
		arrH = new int[n-1];

		System.out.print("Ivesti elemento vieta kuri noretumete pasalinti: ");
		int k = reader.nextInt();
		
		for (int i = 0; i < arrH.length; i++) {
			if (i >= k - 1) {
				arrH[i] = arrG[i+1];
			} else {
				arrH[i] = arrG[i];
			}
		}
		
		System.out.print("Pakeistas masyvas: ");
		metodai.printArray(arrH);
		
		reader.close();
	}

}
