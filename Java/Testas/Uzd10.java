package Testas;

import java.util.Scanner;

public class Uzd10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ivesti metus ir menesi skaiciais: ");
		int year = input.nextInt();
		int month = input.nextInt();
		
		switch(month) {
		case 1:
			System.out.println("Gauta: 31");
			break;
		case 2:
			if (year % 2 == 0) {
				System.out.println("Gauta: 29");
			}else {
				System.out.println("Gauta: 28");
			}
			break;
		case 3:
			System.out.println("Gauta: 31");
			break;
		case 4:
			System.out.println("Gauta: 30");
			break;
		case 5:
			System.out.println("Gauta: 31");
			break;
		case 6:
			System.out.println("Gauta: 30");
			break;
		case 7:
			System.out.println("Gauta: 31");
			break;
		case 8:
			System.out.println("Gauta: 31");
			break;
		case 9:
			System.out.println("Gauta: 30");
			break;
		case 10:
			System.out.println("Gauta: 31");
			break;
		case 11:
			System.out.println("Gauta: 30");
			break;
		case 12:
			System.out.println("Gauta: 31");
			break;
		default :
			System.out.println("Gauta: Tokio menesio nera");
		}
			
		input.close();
	}

}
