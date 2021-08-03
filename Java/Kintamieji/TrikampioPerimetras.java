package Kintamieji;

import java.util.Scanner;

public class TrikampioPerimetras {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
	System.out.println("�veskite kra�tin� a: ");	
	int a = reader.nextInt();
	
	System.out.println("�veskite kra�tin� b: ");	
	int b = reader.nextInt();
	
	System.out.println("�veskite kra�tin� c: ");	
	int c = reader.nextInt();
	
	reader.close();
	
	int perimetras = a + b + c;
	System.out.print("Trikampio perimetras: " + perimetras);
	}

}
 