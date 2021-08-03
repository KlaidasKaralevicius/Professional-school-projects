package If;

import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the first number: ");
		int FirstNum = reader.nextInt();
		
		System.out.println("Type the second number: ");
		int SecondNum = reader.nextInt();
        
		if(FirstNum > SecondNum) {
			System.out.println("Greate number: " + FirstNum);
		}else if (FirstNum < SecondNum){
			System.out.println("Greate number: " + SecondNum);
		}else {
			System.out.println("The numbers are equal!");
		}
		
        reader.close();
    }
}
