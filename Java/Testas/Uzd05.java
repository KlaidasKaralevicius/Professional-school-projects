package Testas;

import java.util.Scanner;

public class Uzd05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ivesti keturzenkli skaiciu: ");
		int sk = input.nextInt();
		
		int sum = (sk / 1000) + (sk % 1000 / 100) + (sk % 1000 % 100 / 10) + (sk % 10); 
		
		System.out.println("Ivesta: " + sk);
		System.out.println("Gauta: " + sum);
		
		input.close();
	}

}
