package Kintamieji;

import java.util.Scanner;

public class Savaites {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
	System.out.print("�vesti dienas: ");	
	int dienos = reader.nextInt();
	
	System.out.println("�vesta: " + dienos + " dien�");
	
	int sav = dienos / 7;
	reader.close();
	
	System.out.println("Gauta: " + sav + " savait�s");
	}

}