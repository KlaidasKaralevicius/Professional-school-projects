package ReturnMetodai;

import java.util.Scanner;

public class Uzd_03 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Ivesti sekos pradzia ir pabaiga: ");
		int n = reader.nextInt();
		int m = reader.nextInt();
		
		for (int i = n; i <= m; i++) {
			System.out.println(reverse(i));
		}
		
		reader.close();
	}
	
	private static int reverse(int number) {
		int reverseNum = 0;
		while (number != 0) {
			reverseNum *= 10;
			reverseNum += number % 10;
			number /= 10;
		}
		
		return reverseNum;
	}
	
}
