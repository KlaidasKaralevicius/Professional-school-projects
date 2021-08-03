package Kintamieji;

import java.util.Scanner;

public class NezinoKampoDidumas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("�vesti du �inomus kampus.");
		
	System.out.print("�vesta: ");	
	int pirmas = reader.nextInt();
	int antras = reader.nextInt();
	
	int x = 180 - pirmas - antras; 
	reader.close();
	
	System.out.print("Gauta: " + x);
	}

}
