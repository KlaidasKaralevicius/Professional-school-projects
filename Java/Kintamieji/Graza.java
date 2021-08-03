package Kintamieji;

import java.util.Scanner;

public class Graza {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
	System.out.print("�vesti centus: ");	
	int ct = reader.nextInt();
	
	int eg = ct / 100;
	int ctg = ct % 100;
	reader.close();
	
	System.out.println("�vesta: " + ct + " ct");
	System.out.println("Gauta: " + eg + " Eur ir " + ctg + " ct");
	}

}
