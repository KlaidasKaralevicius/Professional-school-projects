package KTU;

import java.util.Scanner;

public class Uzd_2_06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Ivesti kiek kiekvienos rusies pauksciu liko ziemoti: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int temp;
		
		if (a < b)
		{
		    temp = a;
		    a = b;
		    b = temp;
		}
		
		if (b < c)
		{
		    temp = b;
		    b = c;
		    c = temp;
		}
		
		if (a < b)
		{
		    temp = a;
		    a = b;
		    b = temp;
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("Skirtumas tarp didziausio ir maziausio kiekio: " + (a-c));
		
		input.close();
	}

}
