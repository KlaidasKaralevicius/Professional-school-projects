package ReturnMetodai;

import java.util.Scanner;

public class Uzd_05 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Ivesti naturalu skaiciu: ");
		int n = reader.nextInt();

		System.out.println("Ivesti sekos skaicius: ");

		int count = 0;
		
		while (true) {
			int number = reader.nextInt();
			if (doubleNumbers(n, number) == 2) {
				count++;
			}
			if (number == 0) {
				break;
			}
		}

		System.out.println("Ie�komas kiekis lygus: " + count);
		
		reader.close();
	}
	
	private static int doubleNumbers(int n, int number) {
		int sameNumbers = 0;
		int count = 0;
		while (number > 0) {
			sameNumbers = number % 10; 
			if (sameNumbers == n) {
				count++;
			}
			number /= 10;
		}
		
		return count;
	}

}
