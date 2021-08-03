package metodai;

import java.util.Scanner;

public class Uzd_07 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Ivesti 5 pirmo masyvo elementus");

		int[] arr1;
		int[] arr2;
		int[] arrSum;
		arr1 = new int[5];
		arr2 = new int[5];
		arrSum = new int[5];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = reader.nextInt();
		}

		System.out.println("Ivesti 5 antro masyvo elementus");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = reader.nextInt();
		}

		System.out.println("Dvieju masyvu elementu sumos");
		for (int i = 0; i < arrSum.length; i++) {
			System.out.print(arr1[i] + arr2[i] + " ");
		}
		reader.close();
	}

}
