package VidiniaiMetodai1;

import java.util.Scanner;

public class Uzd_04 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Input a year: ");
		int year = reader.nextInt();

		leapYear(year);

		reader.close();
	}

	public static void leapYear(int year) {

		if (year % 400 == 0 && year % 100 == 0) {
			System.out.println("true");
		} else if (year % 400 != 100 && year % 400 != 200 && year % 400 != 300 && year % 4 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
