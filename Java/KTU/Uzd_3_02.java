package KTU;

import java.util.Scanner;

public class Uzd_3_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Iveskite zingsniu kieki iki mokyklos: ");
		int n = input.nextInt();

		int clap = 0;
		int snap = 0;
		
		for (int i = 1; i <= n; i++) {
			if (i % 10 == 0) {
				clap++;
			} 
			if (i % 5 == 0 && i % 10 != 0) {
				snap++;
			}
		}
		
		System.out.println("Suplojimu bus: " + clap);
		System.out.println("Spragtelejimu bus: " + snap);
		
		input.close();
	}

}
