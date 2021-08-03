package While;

import java.util.Scanner;

public class Uzd6_Skaiciuotuvas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Iveskite veiksma: ");
		int move = reader.nextInt();
		
		int sum = 0;
		int sub = 0;
		int mult = 0;
		int max = 0;
		int min = 0;			
		
		int number = reader.nextInt();
		
		while (true) {
			switch (move) {
			case 1:
				sum = sum + number; 
				break;
			case 2:
				sub = sub + number;
				break;
			case 3:
				mult = mult + number;
				break;
			case 4:
				if (number > max)
				max = number;
				break;
			case 5:
				if (number < min)
					min = number;
				break;
			default:
				System.out.println("Error");
			}
			number = reader.nextInt();
			if (number == 0) {
				break;
			}
		}
		
		switch (move) {
		case 1:
			System.out.println("sum: " + sum);
			break;
		case 2:
			System.out.println("sub: " + sub);
			break;
		case 3:
			System.out.println("mult: " + mult);
			break;
		case 4:
			System.out.println("max: " + max);
			break;
		case 5:
			System.out.println("min: " + min);
			break;
		}
		
		reader.close();
	}

}
