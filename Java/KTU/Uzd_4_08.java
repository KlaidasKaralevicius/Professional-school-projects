package KTU;

import java.util.Scanner;

public class Uzd_4_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Keliems draugams Linas nori dovanoti atvirukus? ");
		int m = input.nextInt();
		
		System.out.print("Kiek rusiu atvirkuku yra parduotuveje: ");
		int n = input.nextInt();
		
		int number = 0;
		int kiek = 0;
		
		while (n > 0) {
			number++;
			System.out.print("Kiek yra " + number + " rusies atviruku? ");
			int k = input.nextInt();
			if (k >= m) {
				kiek++;
			}
			n--;
		}
		
		System.out.print(kiek + " rusiu atviruku uztektu visiems Lino draugams.");
				
		input.close();
	}

}
