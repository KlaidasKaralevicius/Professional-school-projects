package Testas3;

import java.util.Arrays;
import java.util.Scanner;

public class metodai {
	//read grades
		public static double[] readGrades(int n) {
			Scanner reader = new Scanner(System.in);
			
			double[] grades = new double[n];

			for (int i = 0; i < n; i++) {
				grades[i] = reader.nextDouble();
			}
			System.out.print("Jusu numatomi pazymiai - ");
			printGrades(grades);
			reader.close();
			return grades;
		}
		// random number
		public static double randomNumber(int min, int max) {
			return (int) ((Math.random() * (max - min) + min));
		}
		//random grades
		public static double[] randomGrades(int n, int min, int max) {
			double[] arr = new double[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = randomNumber(min, max);
			}
			return arr;
		}
		//print grades
		public static void printGrades(double[] arr) {
			System.out.print("[");
			for (int i = 0; i < arr.length; i++) {
				if (i < arr.length - 1) {
					System.out.print(arr[i] + ", ");
				}
				if (i == arr.length - 1) {
					System.out.print(arr[i] + "]");
				}
			}
		}
		//average
		public static double getAvg(double[] arr) {
			double sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			double average = sum / arr.length;
			System.out.println(average);
			return average;
			
		}
		//max
		public static double getMax(double[] arr) {
			double max = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			System.out.println(max);
			return max;
		}
		//min
		public static double getMin(double[] arr) {
			double min = 10;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < min) {
					min = arr[i];
				}
			}
			System.out.println(min);
			return min;
		}
		//mediana
		public static double getMediana(double[] arr) {
			Arrays.sort(arr);
			double mediana;
			if (arr.length % 2 == 0) {
			    mediana = ((double)arr[arr.length/2] + (double)arr[arr.length/2 - 1])/2;
			}else {
			    mediana = (double) arr[arr.length/2];
			}
			System.out.println(mediana);
			return mediana;
		}
		//percent
		public static double getPercent(double[] arr) {
			double sum = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 3) {
					sum++;
				}
			}
			double percent = sum / arr.length * 100;
			System.out.println(percent + " %");
			return percent;
		}
		//histogram
		public static void printHistogram(double[] arr) {
			for (int i = 1; i <= 10; i++) {
				System.out.print(i + ":");
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] == i) {
						System.out.print("* ");
					}
				}
				System.out.println();
			}
	
		}
		//saulys
		public static int target(int n, int x0, int y0) {
			Scanner reader = new Scanner(System.in);
			System.out.println("Iveskite pataikymo tasko x ir y koordinates: ");
			
			double center = Math.sqrt(Math.pow(x0, 2) + Math.pow(y0, 2));
			int sum = 0;
			int tempSum = 0;
			
			for (int i = 0; i < n; i++) {
				int x = reader.nextInt();
				int y = reader.nextInt();
				double hit = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
				if (hit - center <= 5) {
					sum += 10;
					tempSum = 10;
				} else if (hit - center > 5 && hit - center <= 10) {
					sum += 5;
					tempSum = 5;
				} else {
					tempSum = 0;
				}
				System.out.println("Pataikyta " + hit + " cm nuo centro, gauti taskai - " + tempSum);
			}
			System.out.println("Bendra tasku suma = " + sum);
			reader.close();
			return sum;
			
		}
		
}
