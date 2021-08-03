package If;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
		int Num = reader.nextInt();
        
		if(Num%2 == 0) {
			System.out.println("Number " + Num + " is even.");
		}else {
			System.out.println("Number " + Num + " is odd.");
		}
		
        reader.close();
    }
}
