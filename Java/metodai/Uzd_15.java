package metodai;

import java.util.Scanner;

public class Uzd_15 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.print(
				"Ivesti masyvo ilgi, intervalo pradzia ir pabaiga tarp kurio ribu bus sukurtos masyvo reiksmes: ");
		int n = reader.nextInt();
		double min = reader.nextDouble();
		double max = reader.nextDouble();
		
		double [] prekes = metodai.createArray(n, min, max);
		double[] afterPrekes;
		afterPrekes = new double[n];
		double[] diffPrekes;
		diffPrekes = new double[n];
		
		System.out.print("Prekiu kainos: ");
		metodai.printArray(prekes);
		
		System.out.println();
		
		System.out.print("Kiek procentu brangs prekes: ");
		int percent = reader.nextInt();
		
		metodai.average(prekes);
		
		for (int i = 0; i < prekes.length; i++) {
			if (prekes[i] < metodai.average(prekes)) {
				afterPrekes[i] += prekes[i] + prekes[i] / (100 * percent);
			} else {
				afterPrekes[i] = prekes[i];
			}
		}
		
		System.out.println("Prekiu kainos po pabranginimo: ");
		metodai.printArray(afterPrekes);
		System.out.println();
		
		for (int i = 0; i < afterPrekes.length; i++) {
			diffPrekes[i] = afterPrekes[i] - prekes[i];
		}
		
		System.out.println("Prekiu kainu skirtumas po pabrangimo: ");
		metodai.printArray(diffPrekes);
		
		reader.close();
	}

}
