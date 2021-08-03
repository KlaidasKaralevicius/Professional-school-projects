package Kintamieji;

import java.util.Scanner;

public class OroUostas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
	System.out.print("�vesti l�ktuvo pakilimo laik� ir skryd�io trukm�: ");	
	int h = reader.nextInt();
	int min = reader.nextInt();
	int truk = reader.nextInt();
	
	int h1 = (h * 60 + min + truk) / 60;
	int min1 = min + truk;
	if (min1 > 60) {
		min1 = min1 - 60;
	}
	reader.close();
	
	System.out.println("�vesta: h = " + h + ", min = " + min + ", truk = " + truk);
	System.out.println("Gauta: h1 = " + h1 + ", min1 = " + min1);
	}

}
