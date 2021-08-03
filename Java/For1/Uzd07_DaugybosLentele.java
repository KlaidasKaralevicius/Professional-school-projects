package For1;

import java.util.Scanner;

public class Uzd07_DaugybosLentele {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);

		System.out.print("Ivesta: ");
        int a = reader.nextInt();
		
        System.out.println("Gauta: ");
               
        for (int i = 1; i < 10; i++) {
        	System.out.println(a + " * " + i + " = " + a * i);
        }
        
		reader.close();
	}

}
