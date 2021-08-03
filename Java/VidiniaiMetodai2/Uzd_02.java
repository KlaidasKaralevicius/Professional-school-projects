package VidiniaiMetodai2;

import java.util.Scanner;

public class Uzd_02 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int sto = 0;
        int dydis = 0;
		
		System.out.println("Pasigaminkite pica: ");
		System.out.print("Picos tipas - storapade ar plonapade: ");
		String type = reader.nextLine();
		if (type.equals("storapade")) {
            sto = 200;
        } else if (type.equals("plonapade")) {
            sto = 150;
        }
		
		System.out.println();
		
		System.out.print("Picos dydis - 20cm, 30cm, 50cm: ");
		int size = reader.nextInt();
		
		System.out.println();
		
		System.out.println("Ingredientai: ");
		System.out.println("1. Suris");
		System.out.println("2. Kumpis");
		System.out.println("3. Desra");
		System.out.println("4. Pomidorai");
		System.out.println("5. Pievagrybiai");
		System.out.println("6. Alyvuoges");
		System.out.println("7. Marinuoti argukeliai");
		
		System.out.println();
		
		System.out.println("Kiek reikia ingredientu? ");
		int amount = Integer.parseInt(reader.nextLine());
		
		System.out.println();
		
		System.out.print("Iveskite ingredientus vieonoje eiluteja: ");
		String ingredient = reader.nextLine();
		
		System.out.println("Uzsakyta pica: ");
		System.out.println(type + ", " + size + "cm, ingredientai: " + ingredient);
		System.out.println();
		System.out.print("Kaina: ");
		printPizzaPrice(sto, dydis, amount);
		
		reader.close();
	}

	private static void printPizzaPrice(int type, int size, int amount) {
        double suma = type + size + amount * 50;
        System.out.printf("%.2f", suma / 100);
    }

}
