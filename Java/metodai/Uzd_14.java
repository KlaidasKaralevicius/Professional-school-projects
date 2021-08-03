package metodai;

import java.util.Scanner;

public class Uzd_14 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print(
				"Ivesti masyvo ilgi, intervalo pradzia ir pabaiga tarp kurio ribu bus sukurtos masyvo reiksmes: ");
		int n = reader.nextInt();
		int min = reader.nextInt();
		int max = reader.nextInt();

		int[] arrF = metodai.createArray(n, min, max);

		System.out.print("Masyvo reiksmes: ");
		metodai.printArray(arrF);

		System.out.print("Ivesti kokius 2 masyvo elementus sukeisti vietomis: ");
		int k = reader.nextInt();
		int m = reader.nextInt();

		int temp1 = 0;
		int temp2 = 0;

		for (int i = 0; i < arrF.length; i++) {
			if (arrF[i] == arrF[k - 1]) {
				temp1 = arrF[i];
			}
			if (arrF[i] == arrF[m - 1]) {
				temp2 = arrF[i];
			}
		}

		for (int i = 0; i < arrF.length; i++) {
			arrF[k - 1] = temp2;
			arrF[m - 1] = temp1;
		}

		System.out.print("Masyvas su sukeistomis reiksmemis: ");
		metodai.printArray(arrF);

		reader.close();
	}

}
