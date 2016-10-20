package introductionB;

import java.util.Scanner;

public class Quiz1 {
	static Scanner input = new Scanner(System.in);
	
	public static String waitForEntry(){
		return input.nextLine();
	}
	
	//1 point visibility private
	//1 point for data type declaration (throughout)
	private static String username = "test_user";
	private static String password = "test";

	//1 point correct method
	public static void main(String[] args) {
		
		//1 point for asking username once
		System.out.println("Please enter your username.");
		//1 point for comparing strings
		if(waitForEntry().equals(username)){
			verifyPassword();
		}else{
			System.out.println("Unknown username, please contact the network administrator.");
		}
	}

	private static void verifyPassword() {
		System.out.println("Please enter your password.");
		//1 point using waitForEntry() correctly
		int attempts = 3;
		boolean inLoop = true;
		while (inLoop){
			if(waitForEntry().equals(password)){
				System.out.println("Congratulations! You've logged in.");
				inLoop = false;
			}else if((attempts-1)==0){
				//.5 invalid pass
				System.out.println("Invalid password.");
				//.5 point MAX 3 tries
				inLoop = false;
			}else{
				//.5 tries is changing
				attempts--;
				//.5 printing the correct num
				System.out.println("You have "+attempts+" more attempt(s).");
			}
		}
	}
}
