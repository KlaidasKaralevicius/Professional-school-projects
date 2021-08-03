package For1;

import java.util.Scanner;

public class Uzd06_Vardas {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Ivesta: ");
        int n = reader.nextInt();
        
        System.out.print("Gauta: ");
        
        for (int i = 1; i <= n; i++) {
        	System.out.print("Klaidas ");
        }
        
		reader.close();
	}

}
