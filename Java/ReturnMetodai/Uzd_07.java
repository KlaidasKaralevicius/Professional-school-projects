package ReturnMetodai;

import java.util.Scanner;

public class Uzd_07 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Ivesti intervalo pradzia ir pabaiga (intervalo skaiciai negali buti mazesne nei 9): ");
		int a = reader.nextInt();
		int b = reader.nextInt();
		
		if (a <= 9) {
			System.out.print("Intervalo skaiciai negali buti mazesni nei 9, prasome reiksmes ivesti is naujo: ");
			a = reader.nextInt();
			b = reader.nextInt();
		}
		
		System.out.print("Ivesti naturalu skaiciu: ");
		int k = reader.nextInt();
		
		int count = 0; 
		
		for (int i = a; i <=b; i++) {
			if (numberSum(i, k) == 1) {
				count++;
			}
		}
		
		System.out.println("Intervale [" + a + "; " + b + "] yra " + count + " skaiciai, kuriu pirmo ir paskutinio skaitmenu suma lygi " + k);
		
		reader.close();
	}

	private static int numberSum(int x, int k) {
		
		int count = 0;
		
		int lastNumber = x % 10; 
		int firstNumber = 0;
		
		while (x > 0) {
			x /= 10;
			
			if (x > 0) {
				firstNumber = x;
			}
		}
		
		if (lastNumber + firstNumber == k) {
			count = 1;
		}
		
		return count;
	}

}
