package ReturnMetodai;

import java.util.Scanner;

public class Uzd_04 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Ivesti naturalu skaiciu: ");
		int n = reader.nextInt();

		System.out.println("Ivesti sekos skaicius: ");

		int count = 0;
		
		while (true) {
			int number = reader.nextInt();
			if (sumOfArray(number) == n) {
				count++;
			}
			if (number == 0) {
				break;
			}
		}

		System.out.println("Ie�komas kiekis lygus: " + count);
		
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
