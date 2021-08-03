package SwithIf;

import java.util.Scanner;

public class Exercise12_Oru_Stebejimas {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ivesti kodo skaiciu: ");
		int code = reader.nextInt();

		System.out.println("Ivesta: " + code);
		
		switch (code) {
		case 1:
			System.out.println("Ivesta: Sauleta");
			break;
		case 2:
			System.out.println("Gauta: Lietinga");
			break;
		case 3:
			System.out.println("Gauta: Vejuota");
			break;
		case 4:
			System.out.println("Gauta: Sniegas");
			break;
		default :
			System.out.println("Gauta: Tokio kodo nera");
		}
		
		reader.close();
	}

}
