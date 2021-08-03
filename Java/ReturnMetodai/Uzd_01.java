package ReturnMetodai;

import java.util.Scanner;

public class Uzd_01 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Ivesti sekos pradzia ir pabaiga: ");
		int n = reader.nextInt();
		int m = reader.nextInt();
		
		int count = 0;

		for (int i = n; i <= m; i++) {
			if (i % sumOfArray(i) == 0) {
				count++;
			}
		}
		System.out.println(count);
		
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
