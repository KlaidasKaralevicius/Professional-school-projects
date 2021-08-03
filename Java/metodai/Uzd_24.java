package metodai;

import java.util.Scanner;

public class Uzd_24 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print(
				"Ivesti masyvo ilgi, intervalo pradzia ir pabaiga tarp kurio ribu bus sukurtos masyvo reiksmes: ");
		int n = reader.nextInt();
		int min = reader.nextInt();
		int max = reader.nextInt();
		
		int [] arrS = metodai.createArray(n, min, max);
		
		System.out.print("Masyvo reiksmes: ");
		metodai.printArray(arrS);
		
		System.out.print("Pirmo neigiamo skaiciaus indeksas masyve: ");
		
		for (int i = 0; i < arrS.length; i++) {
			if (arrS[i] < 0) {
				System.out.println(i);
				break;
			}
		}

		reader.close();
	}

}
