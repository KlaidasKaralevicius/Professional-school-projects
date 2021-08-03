package SwithIf;

import java.util.Scanner;

public class Exercise4_Vairuotojas {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ivesti kiek reik pervezti deziu ir kiek ju telpa i masina:");
		int n = reader.nextInt();
		int m = reader.nextInt();

		int k= 0;
		System.out.println("Ivesta: n = " + n + ", m = " + m);
		
		if (n % m == 0) {
			k = n / m; 
			System.out.println("Gauta: k = " + k);
		} else {
			k = n / m + 1;
			System.out.println("Gauta: k = " + k);
		}
		
		reader.close();
	}

}
