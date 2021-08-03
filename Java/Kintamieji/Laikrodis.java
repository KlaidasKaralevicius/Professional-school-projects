package Kintamieji;

import java.util.Scanner;

public class Laikrodis {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
	System.out.print("�vesti valand�, minut� ir sekund�: ");	
	int h = reader.nextInt();
	int m = reader.nextInt();
	int s = reader.nextInt();
	
	int h1 = (h * 60 * 60 + m * 60 + s + 5) / 60 / 60 % 60; 
    int m1 = (m * 60 + s) / 60 % 60;
    int s1 = s + 5;
    if (s1 > 59) {
    	s1 = s1 - 60;
    	m1 = m1 + 1;
    }
    if (m1 > 59) {
    	m1 = m1 - 60;
    }
	reader.close();
	
	System.out.printf("�vesta: %02d:%02d:%02d", h, m, s);
	System.out.println();
	System.out.printf("Gauta: %02d:%02d:%02d", h1, m1, s1);
	}

}
