package Testas3;

import java.util.Scanner;

public class saulys {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Iveskite taikinio centro x0 ir y0 koordinates: ");
		int x0 = reader.nextInt();
		int y0 = reader.nextInt();
		
		System.out.print("Kiek kartu saulys sove i taikiny: ");
		int n = reader.nextInt();
		
		metodai.target(n, x0, y0);
		
		reader.close();
	}

}
