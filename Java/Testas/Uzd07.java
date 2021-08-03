package Testas;

import java.util.Scanner;

public class Uzd07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ivesti Mato, Domo ir Tomo   ugius centimetrais: ");
		int MatasU1 = input.nextInt();
		int DomasU1 = input.nextInt();
		int TomasU1 = input.nextInt();
		
		System.out.println("Ivesta: " + MatasU1 + ", " + DomasU1 + ", " + TomasU1 + ".");
		
		if (MatasU1 > DomasU1 && MatasU1 > TomasU1) {
			System.out.println("Gauta: Matas auksciausias.");
		} else if (DomasU1 > MatasU1 && DomasU1 > TomasU1) {
			System.out.println("Gauta: Domas auksciausias.");
		}else if (TomasU1 > DomasU1 && TomasU1 > MatasU1) {
			System.out.println("Gauta: Tomo auksciausias.");
		}else if (MatasU1 == DomasU1 && MatasU1 == TomasU1) {
			System.out.println("Gauta: Visu ugis vienodas.");
		}else if (MatasU1 == DomasU1 && MatasU1 > TomasU1) {
			System.out.println("Gauta: Mato ir Domo ugiai yra lygus ir jie yra auksciausi.");
		}else if (MatasU1 == TomasU1 && MatasU1 > DomasU1) {
			System.out.println("Gauta: Mato ir Tomo ugiai yra lygus ir jie yra auksciausi.");
		} else {
			System.out.println("Gauta: Domo ir Tomo ugiai yra lygus ir jie yra auksciausi.");
		}
			
		input.close();
	}

}
