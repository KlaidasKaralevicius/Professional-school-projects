package metodai;

import java.util.Scanner;

public class Uzd_21 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);

		System.out.print("Ivesti kiek studentu laike egzaminus: ");
		int n = reader.nextInt();
		
		int [] pazymiai = metodai.createArray(n, 1, 10);
		
		System.out.print("Visu laikiusiu studentu egzaminu rezultatai: ");
		metodai.printArray(pazymiai);
		
		int failed = 0;
		int sum = 0;
		
		for (int i = 0; i < pazymiai.length; i++) {
			if (pazymiai[i] >= 4) {
				sum += pazymiai[i];
			} else {
				failed++;
			}
		}
		
		System.out.println(failed + " neislaike egzaminu.");
		
		double avg = sum / n;
		
		System.out.printf("Pazangiu studentu pazymiu vidurkis: %.2f", avg);
		
		reader.close();
	}

}
