package While;

import java.util.Scanner;

public class Uzd4_Knyga {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Iveskite knygos skyriu skaiciu: ");
        int m = reader.nextInt();

        double mm = m;
        int sk_d = 1;
        int d = 0;
        
        while (m > 0) {
        	m = m - sk_d;
        	sk_d++;
        	d++;
        }
        
        double avg = mm / d;
                
        System.out.println("Tadas visa knyga perskaitys per " + d + " dienas (-u).");
        System.out.printf("Tadas vidutiniskai per diena perskaite %.2f skyrius (-u).", avg);
		
		reader.close();
	}

}
