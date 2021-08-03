package Baigiamasis;

public class Metodai {
	// geriausias ivertinimas
	public static int gautiGeriausiaIvertinima(int p1, int p2, int p3) {

		int max = Math.max(p1, Math.max(p2, p3));
		return max;
	}

	// mokymosi laikas
	public static int gautiTrukmeMinutemis(int a1, int b1, int a2, int b2) {

		int total = 0;

		total = (a2 * 60 + b2) - (a1 * 60 + b1);

		return total;
	}

	// ispausdinti laika string formatu
	public static void gautiLaikoFormata(int sum) {

		int hours = sum / 60;
		int min = sum % 60;

		String time = hours + " val. " + min + " min.";

		System.out.println(time);
	}
	
}
