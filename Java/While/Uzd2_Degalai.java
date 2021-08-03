package While;

import java.util.Scanner;

public class Uzd2_Degalai {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Iveskite kuro bako talpa: ");
        int t = reader.nextInt();

        System.out.print("Iveskite kuro sanaudas n: ");
        int n = reader.nextInt();
        
        int kiek = 0;
		
        while (t > 0) {
        	if (kiek % 2 == 0) {
        		t = t - 2 * n;
        	} else {
        		t = t - n;
        	}
        	kiek++;
        }
        
        System.out.println("Keliauti bus galima " + kiek + " dienu/(as)/(a).");
        
		reader.close();
	}

}
