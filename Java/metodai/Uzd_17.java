package metodai;

import java.util.Scanner;

public class Uzd_17 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print(
				"Ivesti masyvo ilgi, intervalo pradzia ir pabaiga tarp kurio ribu bus sukurtos masyvo reiksmes: ");
		int n = reader.nextInt();
		int min = reader.nextInt();
		int max = reader.nextInt();
		
		int [] arrQ = metodai.createArray(n, min, max);
		
		System.out.print("Masyvo reiksmes: ");
		metodai.printArray(arrQ);
		
		int[] arrY;
		arrY = new int[n+1];

		System.out.print("Ivesti skaiciaus vieta pries kuri norite ivesti nauja reiksme ir kokia: ");
		int k = reader.nextInt();
		int x = reader.nextInt();
		
		for (int i = 0; i < arrY.length; i++) {
			if (i == k - 1) {
				arrY[i] = x;
			} else if(i > k - 1) {
				arrY[i] = arrQ[i-1];
			} else {
				arrY[i] = arrQ[i];
			}
		}
		
		System.out.print("Pakeistas masyvas: ");
		metodai.printArray(arrY);
		
		reader.close();
	}

}
