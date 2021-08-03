package For1;

import java.util.Scanner;

public class Uzd05_Intervalas {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);

		System.out.print("Ivesti intervalo pradzia: ");
        int a = reader.nextInt();
        
        System.out.print("Ivesti intervalo pabaiga: ");
        int b = reader.nextInt();
        
        for (int i = a; i <= b; i++) {
        	System.out.print(i + " ");
        }
        
		reader.close();
	}

}
