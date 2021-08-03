package For1;

import java.util.Scanner;

public class Uzd09_Restoranas {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Iveskite intervalo pradzia: ");
        int a = reader.nextInt();

        System.out.print("Iveskite intervalo pabaiga: ");
        int b = reader.nextInt();

        int kiek = 0;
        
        for (int i = a; i <= b; i++) {
        	if (i % 6 == 0) {
        		kiek++;
        	}
        }
        
        System.out.print("GAUTA: Reikalingu marskineliu skaicius: " + kiek);
		
		reader.close();
	}

}
