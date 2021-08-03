package ReturnMetodai;

import java.util.Scanner;

public class Uzd_02 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Ivesti sekos pradzia ir pabaiga: ");
		int n = reader.nextInt();
		int m = reader.nextInt();

		int sum = 0;

		for (int i = n; i <= m; i++) {
			sum += sumOfArray(i);
		}
		System.out.println(sum);
		
		reader.close();
	}

	private static int sumOfArray(int number) {
		int numberSum = 0;
		while (number > 0) {
			numberSum += (number % 10);
			number /= 10;
		}
		return numberSum;
	}

}
