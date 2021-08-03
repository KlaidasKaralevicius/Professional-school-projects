package If;

import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String username1 = "alex";
        String password1 = "mightyducks";
        String username2 = "emily";
        String password2 = "cat";
     	
     	System.out.println("Type your username: ");
     	String username = reader.nextLine();
		
		System.out.println("Type your password: ");
		String password = reader.nextLine();

		if(username1.equals(username) &&  password1.equals(password)) {
			System.out.println("You are now logged to the system!");
		}else if(username2.equals(username) &&  password2.equals(password)) {
			System.out.println("You are now logged to the system!");
		}else {
			System.out.println("Your username or password was invalid!");
		}
		
        reader.close();
    }
}
