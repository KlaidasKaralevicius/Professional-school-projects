package For2;

import java.util.Scanner;

public class Uzd02_TriangularPatternX {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	      System.out.print("Enter the size: ");
	      int size = input.nextInt();

	      int i;
	      int j;
	      
	      for (i = 1; i <= size; i++) // Did�janti tvarka
	      {
	          for (j = 1; j <= i; j++)
	          {
	              System.out.print("# ");
	          }
	          System.out.println();
	      }
	      
	      System.out.println();
	      
	      for (i = size; i >= 1; i--) // Ma��janti tvarka
	      {
	          for (j = i; j >= 1; j--)
	          {
	              System.out.print("# ");
	          }
	          System.out.println();
	      }
	      
	      System.out.println();
	      
	      for (i = 1; i <= size; i++) // Atvirk�tin� ma��janti tvarka
	      {
	              for (j = 1; j <= size; j++)
	              {
	            	  if (j < i) {
	            		  System.out.print(" ");
	            		  System.out.print(" ");
	            	  }else {
	            		  System.out.print("# ");
	            	  }  
	              }
	          System.out.println();
	      }
	      
	      System.out.println();
	      
	      for (i = 1; i <= size; i++) // Atvirk�tin� did�janti tvarka
	      {
	          for (j = size; j >= 1; j--)
	          {
	        	  if (j > i) {
	        		  System.out.print(" ");
	        	  }else {
	        		  System.out.print("#");
	        	  }
	        	  System.out.print(" ");
	          }
	          System.out.println();
	      }
	      
	      input.close();
	}
}
