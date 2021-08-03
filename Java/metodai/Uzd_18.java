package metodai;

import java.util.Scanner;

public class Uzd_18 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print(
				"Ivesti masyvo ilgi, intervalo pradzia ir pabaiga tarp kurio ribu bus sukurtos masyvo reiksmes: ");
		int n = reader.nextInt();
		int min = reader.nextInt();
		int max = reader.nextInt();
		
		int [] arrT = metodai.createArray(n, min, max);
		int[] arrNew = new int[n];

		int j = 0;
        
        System.out.print("Masyvo reiksmes: ");
		metodai.printArray(arrT);
		
		for (int i = 0; i < arrT.length; i++) {
			if (arrT[i] < 0) {
				arrNew[j] = arrT[i];
				j++;
			}
		}
		
		for (int i = 0; i < arrT.length; i++) {
			if (arrT[i] == 0) {
				arrNew[j] = arrT[i];
				j++;
			}
		}
		
		for (int i = 0; i < arrT.length; i++) {
			if (arrT[i] > 0) {
				arrNew[j] = arrT[i];
				j++;
			}
		}
		
		System.out.print("Sortiruoto masyvo reiksmes: ");
		metodai.printArray(arrNew);
		
		reader.close();
	}

}
