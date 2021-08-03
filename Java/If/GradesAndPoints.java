package If;

import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the points [0-60]: ");
		int Points = reader.nextInt();
        
		if(Points >= 50 && Points <= 60) {
			System.out.println("Grade: 5");
		}else if (Points >= 45 && Points <= 49){
			System.out.println("Grade: 4");
		}else if (Points >= 40 && Points <= 44){
			System.out.println("Grade: 3");
		}else if (Points >= 35 && Points <= 39){
			System.out.println("Grade: 2");
		}else if (Points >= 30 && Points <= 34){
			System.out.println("Grade: 1");
		}else {
			System.out.println("Failed");
		}
		
        reader.close();
    }
}
