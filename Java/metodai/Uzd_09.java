package metodai;

import java.util.Scanner;

public class Uzd_09 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Ivesti intervalo pradzia ir pabaiga: ");
		int a = reader.nextInt();
		int b = reader.nextInt();
		
		System.out.println("Sugeneruotas skaicius is intervalo [" + a + ", " + b + "]: " + random(a, b));
		
		System.out.println("-------------------------------------");
		
		System.out.println("Ivesti masyvo dydi, pradzia ir pabaiga:");
		int n = reader.nextInt(); 
		a = reader.nextInt();
		b = reader.nextInt();
		
		while (b - a >= n) {
			System.out.println("Masyvo talpa mazesne, nei duoto intervalo dydis, prasome ivesti didesni intervalo pradzios skaiciu "
			+ "arba mazesni intervalo pabaigos skaiciu:");
			System.out.println("Masyvo dydis - " + n);
			a = reader.nextInt();
			b = reader.nextInt();

		}
		
		System.out.println("Masyvo skaiciai: ");
		
		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
	
		reader.close();
	}

	private static int random(int a, int b) {
		
		int randomInt = (int)(Math.random() * (b - a) + a);

		return randomInt;
	}

}
