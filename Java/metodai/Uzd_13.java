package metodai;

import java.util.Scanner;

public class Uzd_13 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Ivesti masyvo ilgi, intervalo pradzia ir pabaiga tarp kurio ribu bus sukurtos masyvo reiksmes: ");
		int n = reader.nextInt();
		int min = reader.nextInt();
		int max = reader.nextInt();

		int[] arrD = metodai.createArray(n, min, max);
		
		System.out.print("Masyvo reiksmes: ");
		metodai.printArray(arrD);
		
		int count = 0;
		
		for (int i = 0; i < arrD.length; i++){
            if (arrD[i] > 0) {
            	count++;
            }
        }
		
		int m = 0;
		int[] arrE = new int[count];
		
        for (int i = 0; i < arrD.length; i++){
            if (arrD[i] > 0) {
            	arrE[m]=arrD[i];
                ++m;
            }
        }

		System.out.print("Masyvo teigiamos reiksmes: ");
		metodai.printArray(arrE);
		
		reader.close();
	}

}
