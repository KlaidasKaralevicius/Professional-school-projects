package Testas;

import java.util.Scanner;

public class Uzd09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ivesti Isvykimo valanda ir minute, ir ivesti keliones trukme valandomis ir minutemis: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		
		int v = (a * 60 + c * 60 + b + d) / 60;
		int m = b + d;
		if (m > 60) {
			m = m - 60;}
		if (v > 24) {
			v = v - 24;}
		
		
		System.out.println("Gauta: " + v + " val. " + m + " min.");
		
		input.close();
	}

}
