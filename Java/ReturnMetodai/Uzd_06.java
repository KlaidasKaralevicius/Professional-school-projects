package ReturnMetodai;

import java.util.Scanner;

public class Uzd_06 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Ivesti intervalo pradzia ir pabaiga: ");
		int a = reader.nextInt();
		int b = reader.nextInt();
		
		System.out.print("Ivesti dalikli: ");
		int k = reader.nextInt();
		
		int count = 0;
		
		for (int i = a; i <= b; i++) {
			if (numberDivider(i, k) == 1) {
				count++;
			}
		}
		
		System.out.println("Intervale [" + a + "; " + b + "] yra " + count + " skaiciai, kurie turi " + k + " daliklius.");
		
		reader.close();
	}

	private static int numberDivider(int x, int k) {
		int result = 0;
		int count = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				count++;
			}
		}
		if (count == k) {
			result = 1;
		}
		return result;
	}

}
