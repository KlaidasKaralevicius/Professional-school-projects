package Kintamieji;

import java.util.Scanner;

public class Kilometrai_metrai {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("�vesti kilometrus.");
		
	System.out.print("�vesta: ");	
	int km = reader.nextInt();
	 
	int m = km * 1000;
	reader.close();
	
	System.out.print("Gauta: " + m);
	}

}