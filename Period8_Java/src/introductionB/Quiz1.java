package introductionB;

import java.util.Scanner;

public class Quiz1 {
	static Scanner input = new Scanner(System.in);
	
	public static String waitForEntry(){
		return input.nextLine();
	}
	
	//1 point visibility private
	private static String username = "test_user";
	private static String password = "test";

	public static void main(String[] args) {
		
		System.out.println("Please enter your username.");
		if(waitForEntry().equals(username)){
			verifyPassword();
		}else{
			System.out.println("Invalid username, blah blah blah.");
		}
	}

	private static String verifyPassword() {
		System.out.println("Please enter your password.");
		int attempts = 3;
		boolean inLoop = true;
		while (inLoop){
			if(waitForEntry().equals(password)){
				
			}
		}
		return null;
	}
}
