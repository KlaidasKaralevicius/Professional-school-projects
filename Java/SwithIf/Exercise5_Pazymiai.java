package SwithIf;

import java.util.Scanner;

public class Exercise5_Pazymiai {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ivesti pazymi: ");
		int mark = reader.nextInt();

		System.out.println("Ivesta: " + mark);
		
		switch(mark) {
		case 10:
		System.out.println("Gauta: Puikiai");
		break;
		case 9: 
		System.out.println("Gauta: Labai gerai");
		break;
		case 8:
		System.out.println("Gauta: Gerai");
		break;
		case 7:
		System.out.println("Gauta: Vidutiniskai");
		break;
		default :
		System.out.println("Gauta: Reikia daugiau pastangu");
		break;
		}
		
		reader.close();
	}

}
