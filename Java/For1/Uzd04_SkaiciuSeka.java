package For1;

import java.util.Scanner;

public class Uzd04_SkaiciuSeka {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Iveskita: ");
        int a = reader.nextInt();

        System.out.print("Gauta: ");
        
        for (int i = 1; i <= a; i++) {
        	System.out.print(i + " ");
        }
        
		reader.close();
	}

}
