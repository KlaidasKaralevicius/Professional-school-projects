package KTU;

import java.util.Scanner;

public class Uzd_0_01 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Kiek pamoku yra pirmadieni? ");
		int a = reader.nextInt();
		
		System.out.println("Kiek pamoku yra antradieni? ");
		int b = reader.nextInt();
		
		System.out.println("Kiek pamoku yra treciadieni? ");
		int c = reader.nextInt();
		
		System.out.println("Kiek pamoku yra ketvirtadieni? ");
		int d = reader.nextInt();
		
		System.out.println("Kiek pamoku yra penktadieni? ");
		int e = reader.nextInt();
		
		int sum = a + b + c + d + e;
		int time = sum * 60;
		
		System.out.println("Pamoku skaicius: " + sum);
		System.out.println("Tai sudaro minuciu: " + time);

		reader.close();
	}

}
