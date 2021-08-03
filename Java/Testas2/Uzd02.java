package Testas2;

public class Uzd02 {

	public static void main(String[] args) {

		int a = -20; // pradinis intervalo skaicius
		int b = -5; // galinis intervalo skaicius

		while (a <= b) { // ciklas veikia kol intervalo pradzios kintamasis nesusilygins su galiniu
			System.out.printf(a + " "); // isvedami intervalo skaiciai eiluteje su tarpu
			a++; // didinamas intervalo skaicius
		}

	}

}
