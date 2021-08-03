package Kintamieji;

import java.util.Scanner;

public class Filmas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
	System.out.print("�vesti filmo prad�ios laik� ir filmo trukm�: ");	
	int h = reader.nextInt();
	int min = reader.nextInt();
	int h1 = reader.nextInt();
	int min1 = reader.nextInt();
	
	int EndH = (h * 60 + h1 * 60 + min + min1 + 30) / 60;
	int EndMin = min + min1 + 30;
	if (EndMin > 60) {
		EndMin = EndMin - 60;
	}
	reader.close();

	System.out.println("�vesta: Filmo prad�ia " + h + ":" + min + ", trukm�" + h1 + ":" + min1);
	System.out.println("Gauta: Filmas pasibaigs " + EndH + ":" + EndMin);
	}

}
