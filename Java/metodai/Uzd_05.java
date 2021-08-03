package metodai;

import java.util.Scanner;

public class Uzd_05 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("Ivesti skaiciu - ");
		int number = reader.nextInt();

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + number + " ");
		}
		reader.close();
	}

}
