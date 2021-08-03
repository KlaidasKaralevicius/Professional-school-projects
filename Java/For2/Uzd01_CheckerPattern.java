package For2;

import java.util.Scanner;

public class Uzd01_CheckerPattern {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
	      System.out.print("Enter the size: ");
	      int size = reader.nextInt();

	      for(int row = 1; row <= size; row++){
		       if(row % 2 == 0) {
			   System.out.print(" "); 
		       }
			for(int col = 1; col <= size; col++) {
			    System.out.print("# ");
			}
			System.out.println();
		}
			
		reader.close();
	}

}
