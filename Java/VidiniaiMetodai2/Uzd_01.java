package VidiniaiMetodai2;

import java.util.Scanner;

public class Uzd_01 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("�veskite duomenis (m, s, p): ");

		int p = 0, s = 0, m = 0;
		
		String tara = reader.nextLine();
		
		while (true) {
			tara = reader.nextLine();
			if (tara.equals("0")) {
				break;
			}
			if (tara.equals("m")) {
				m++;
			}else if (tara.equals("s")) {
				s++;
			} else if (tara.equals("p")) {
				p++;
			} else {
				System.out.println("Netinkama tara");
			}
		}
	
		System.out.println("Informacija: ");
		printInfo(m, s, p);
		printTotal(m, s, p);
		System.out.println();
		printMax(m, s, p);
		reader.close();
	}

	private static void printMax(int m, int s, int p) {
		int max = Math.max(m, Math.max(s, p));
		if (m == max) {
			System.out.println("Metaliniu pakuo�i� priimta daugiausiai");
		} else if (s == max) {
			System.out.println("Stikliniu pakuo�i� priimta daugiausiai");
		} else {
			System.out.println("Plastikini� pakuo�i� priimta daugiausiai");
		}
	}

	private static void printTotal(int m, int s, int p) {
		double sum = (m + s + p);
		double money = sum * 0.1;
		if (money >= 1) {
			System.out.printf("Gr��inamas u�statas: %.0f Eur %.0f ct.", money / 1, money % 1 * 100);
		} else {
			System.out.printf("Gr��inamas u�statas: %.02f Eur.", money);
		}
	}

	private static void printInfo(int m, int s, int p) {
		System.out.println("Metalini�: " + m + ". Stiklini�: " + s + ". Plastikini�: " + p + ".");
	}
	

}
