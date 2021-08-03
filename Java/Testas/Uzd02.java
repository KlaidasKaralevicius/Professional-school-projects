package Testas;

import java.util.Scanner;

public class Uzd02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ivesti puodeliu skaiciu: ");
		int p = input.nextInt();
		
		int pilna = p / 7;
		int liko = p % 7;
		
		System.out.println("Gauta: " + pilna + " pilnos dezes, nesupakuotu puodeliu skaicius " + liko);
		
		input.close();
	}

}
