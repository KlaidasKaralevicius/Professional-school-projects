package While;

import java.util.Scanner;

public class Uzd3_Saldainiai {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Petriukas gavo saldainiu: ");
        int n = reader.nextInt();
		
        System.out.print("Per diena suvalge: ");
        int x = reader.nextInt();
        
        int kiek = 0;
        int liko = 0;
        
        n = n - x;

        while (n > 0) {
        	System.out.print("Per diena suvalge: ");
            x = reader.nextInt();
            n = n - x;
            if (n < 0) {
            	liko = liko + x + n;
            }
            kiek++;
        }

        System.out.println("Petriukui saldainiu uzteks " + kiek + " dienoms ir jam liks " + liko + " saldainiai.");
              
		reader.close();
	}
}

