package Testas2;

public class Uzd04 {

	public static void main(String[] args) {

		int a = 10; // pradinis intervalo skaicius
		int b = 95; // galinis intervalo skaicius

		for (int i = a; i <= b; i += 5) { // ciklas veikia kol pradinis skaicius nepasieks galinio didejant po 5
			System.out.printf(i + " "); // isvedami intervalo skaiciai dalus is 5
		}

	}

}
