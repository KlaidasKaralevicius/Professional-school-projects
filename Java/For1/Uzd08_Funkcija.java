package For1;

public class Uzd08_Funkcija {

	public static void main(String[] args) {
		
		System.out.println("Gauta: ");
		
		double y;

		for (int i = -10; i <= 10; i++) {
			y = 7 * Math.pow(i, 2) + 5 * i - 3;
			System.out.printf("Kai x = " + i + ", tai y = %.0f ", y);
			System.out.println("");
		}
	}

}
