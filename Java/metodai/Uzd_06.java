package metodai;

import java.util.Scanner;

public class Uzd_06 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Ivesti 6 masyvo elementus");

		int[] array;
		array = new int[6];
		for (int i = 0; i < array.length; i++) {
			array[i] = reader.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		reader.close();
	}

}
