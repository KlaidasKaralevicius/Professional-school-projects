package metodai;

import java.util.Scanner;

public class Uzd_19 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print(
				"Ivesti masyvo ilgi, intervalo pradzia ir pabaiga tarp kurio ribu bus sukurtos masyvo reiksmes: ");
		int n = reader.nextInt();
		int min = reader.nextInt();
		int max = reader.nextInt();
		
		int [] arrZ = metodai.createArray(n, min, max);
		
		System.out.print("Masyvo reiksmes: ");
		metodai.printArray(arrZ);
		
		System.out.print("Masyvo max reiksme: " + metodai.maxArr(arrZ));
		System.out.println();
		System.out.print("Max reiksmes indeksas masyve: " + metodai.maxArrIndex(arrZ));
		System.out.println();
		System.out.print("Masyvo min reiksme: " + metodai.minArr(arrZ));
		System.out.println();
		System.out.print("Min reiksmes indeksas masyve: " + metodai.minArrIndex(arrZ));
		
		reader.close();
	}

}
