package KTU;

import java.util.Scanner;

public class Uzd_10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Kiek sausainiu gauna Marius? ");
		int n = input.nextInt();
		
		System.out.println("Po kiek saldainiu suvalgo? ");
		int a = input.nextInt();
		
		System.out.println("Kelios dienos liko iki Kaledu? ");
		int k = input.nextInt();
		
		int d = (n * k - a * k) / a;
		int s = (n * k - a * k) % a;
		
		System.out.println("Marius dovanas paruos " + d + " draugu.");
		System.out.println("Supakavus dovanas liks " + s + " saldainiai.");

		input.close();
	}

}
