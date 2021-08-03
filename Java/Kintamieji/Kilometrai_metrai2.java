package Kintamieji;

import java.util.Scanner;

public class Kilometrai_metrai2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
	System.out.println("�vesti kilometrus ir metrus: ");	
		
	int km = reader.nextInt();
	int m = reader.nextInt();

	int metrai = km * 1000 + m;
	reader.close();
	
	System.out.println("�vesta: " + km + " km ir " + m + " m");
	System.out.println("Gauta: " + metrai);
	}

}
