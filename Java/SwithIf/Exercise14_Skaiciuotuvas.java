package SwithIf;

import java.util.Scanner;

public class Exercise14_Skaiciuotuvas {
	
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ivesti 2 skaicius ir veiksmo zenkla: ");
		int a = reader.nextInt();
		int b = reader.nextInt();
		String action = reader.nextLine();
		
		System.out.println("Ivesta: " + a + ", " + b + ", " + action);
		
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		double div = a / b;
		
		
		switch (action) {
		case " +":
			System.out.println("Gauta: " + a + " + " + b + " = " + sum);
			break;
		case " -":
			System.out.println("Gauta: " + a + " - " + b + " = " + sub);
			break;
		case " *":
			System.out.println("Gauta: " + a + " * " + b + " = " + mul);
			break;
		case " /":
			System.out.println("Gauta: " + a + " / " + b + " = " + div);
			break;
		default:
			System.out.println("Gauta: No match");
		}
		
		reader.close();
	}
}
