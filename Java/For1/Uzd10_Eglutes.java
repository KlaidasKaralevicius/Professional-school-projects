package For1;

import java.util.Scanner;

public class Uzd10_Eglutes {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Kiek egluciu atvezta? ");
        int n = reader.nextInt();
        
        int sum = 0;
        int e;

        for (int i = 1; i <= n; i++) {
        	System.out.print("Iveskite " + i + " eglutes auksti: ");
        	e = reader.nextInt();
        	sum = sum + e;
        }
        
        double avg = (double) sum / n;
        
        System.out.print("GAUTA:  Eglutes aukscio vidurkis: " + avg + " cm");
		
		reader.close();
	}

}
