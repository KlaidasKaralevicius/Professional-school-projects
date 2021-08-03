package Testas3;

import java.util.Scanner;

public class pazymiai {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Iveskite kiek pazymiu turi gauti mokinys: ");
		int n = reader.nextInt();
		int a = 1;
		int b = 10;

		System.out.print("Kokie sie pazymiai bus jusu nuomone (1-10): ");
		metodai.readGrades(n);
		
		System.out.println();
		System.out.print("Random pazymis, kurio mums nereikes, bet tegul buna - " + metodai.randomNumber(a, b));
		System.out.println();
		
		System.out.print("Mokinio gauti pazymiai - ");
		double[] arr = metodai.randomGrades(n, a, b); 
		metodai.printGrades(arr);

		System.out.println();
		
		System.out.print("Mokinio pazymiu vidurkis - ");
		metodai.getAvg(arr); 
		System.out.print("Didziausias mokinio pazymis - ");
		metodai.getMax(arr); 
		System.out.print("Maziausias mokinio pazymis - ");
		metodai.getMin(arr); 
		System.out.print("Mokinio pazymiu mediana - ");
		metodai.getMediana(arr);
		System.out.print("Teigiamu pazymiu procentas (4 ir daugiau) - ");
		metodai.getPercent(arr); 
		System.out.println("Mokinio pazymiu histograma:");
		metodai.printGrades(arr);
		System.out.println();
		metodai.printHistogram(arr);

		reader.close();
	}

}
