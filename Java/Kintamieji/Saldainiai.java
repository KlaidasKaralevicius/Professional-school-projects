package Kintamieji;

import java.util.Scanner;

public class Saldainiai {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
	System.out.print("�vesti devintok� ir saldaini� skai�i�: ");	
	int n = reader.nextInt();
	int m = reader.nextInt();

	int s = m / n;
	int k = m % n;
	reader.close();
	
	System.out.println("�vesta: n = " + n + ", m = " + m);
	System.out.println("Gauta: s = " + s + ", k = " + k);
	}

}