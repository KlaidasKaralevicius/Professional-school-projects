package SwithIf;

import java.util.Scanner;

public class Exercise11_Tik_Vienas {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ivesti 3 skaicius: ");
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();

		System.out.println("Ivesta: " + a + ", " + b + ", " + c);
		
		if (a > 100 && b > 100) {
			System.out.println("Gauta: Daugiau nei vienas trizenklis");
		} else if (b > 100 && c > 100) {
			System.out.println("Gauta: Daugiau nei vienas trizenklis");
		}else if (a > 100 && c > 100) {
			System.out.println("Gauta: Daugiau nei vienas trizenklis");
		}else {
			System.out.println("Gauta: Tik vienas trizenklis");
		}
		
		reader.close();
	}

}
