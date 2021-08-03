package metodai;

import java.util.Scanner;

public class Uzd_20 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print(
				"Ivesti masyvo ilgi, intervalo pradzia ir pabaiga tarp kurio ribu bus sukurtos masyvo reiksmes: ");
		int n = reader.nextInt();
		int min = reader.nextInt();
		int max = reader.nextInt();
		
		int [] arrR = metodai.createArray(n, min, max);
		
		double suma = 0;
		
		System.out.print("Masyvo reiksmes: ");
		metodai.printArray(arrR);
		
		System.out.println("Maziausias skaicius: " + metodai.minArr(arrR));
		System.out.println("Didziausias skaicius: " + metodai.maxArr(arrR));
		
		for (int i = 0; i < arrR.length; i++) {
			suma +=arrR[i];
		}
		
		suma = suma - metodai.minArr(arrR) - metodai.maxArr(arrR); 
		double avg = suma / 6;
		
		System.out.println("Vidurkis atmetus min ir max: " + (double)avg);
		
		reader.close();
	}

}
