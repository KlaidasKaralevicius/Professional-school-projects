package Baigiamasis;

import java.util.Scanner;

public class U05 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Gauti pazymiai: ");
		int p1 = reader.nextInt();
		int p2 = reader.nextInt();
		int p3 = reader.nextInt();

		System.out.println("Geriausias ivertinimas: " + Metodai.gautiGeriausiaIvertinima(p1, p2, p3));

		reader.close();
	}

}
