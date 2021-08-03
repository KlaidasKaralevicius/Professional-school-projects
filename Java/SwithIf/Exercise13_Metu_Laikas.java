package SwithIf;

import java.util.Scanner;

public class Exercise13_Metu_Laikas {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ivesti menesio numeri metuose: ");
		int month = reader.nextInt();
		
		System.out.println("Ivesta: " + month);

		switch(month) {
		case 1:
			System.out.println("Gauta: Sausis");
			break;
		case 2:
			System.out.println("Gauta: Vasaris");
			break;
		case 3:
			System.out.println("Gauta: Kovas");
			break;
		case 4:
			System.out.println("Gauta: Balandis");
			break;
		case 5:
			System.out.println("Gauta: Geguze");
			break;
		case 6:
			System.out.println("Gauta: Birzelis");
			break;
		case 7:
			System.out.println("Gauta: Liepa");
			break;
		case 8:
			System.out.println("Gauta: Rugpjutis");
			break;
		case 9:
			System.out.println("Gauta: Rugsejis");
			break;
		case 10:
			System.out.println("Gauta: Spalis");
			break;
		case 11:
			System.out.println("Gauta: Lapkritis");
			break;
		case 12:
			System.out.println("Gauta: Gruodis");
			break;
		default :
			System.out.println("Gauta: Tokio menesio nera");
		}
		
		reader.close();
	}

}
