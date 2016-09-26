package introduction;

import java.util.Scanner;

public class Practice {

	static Scanner input;
	static String user;
	
	public static void main(String[] args) {
		//demonstrateStringMethod();
		createFields();
		promptName();
		promptForever();
	}
	
	public static void promptName(){
		
		print("Enter your name");
		user = input.nextLine();
		print("Glad to meet you, "+user+". For the rest of time, I will call you, "+user+". "
				+"You may call me Computer. We should become friends.");
	}
	
	public static void promptInput() {
		
		print("Please type something, "+user);
		String userInput = input.nextLine();
		print("Congratulations! you typed: "+userInput);
	}
	
	public static void promptForever() {
		while(true){
			promptInput();
		}
	}

	public static void createFields(){
		
		input = new Scanner(System.in);
	}
	
	
	
	
	
	
	
	
	
	public static void demonstrateStringMethod(){
		String text1 = new String("Hello world");
		String text2 = "Hello world"; //same as above
		
		if(text1.equals(text2)){
			print("These strings are equal!!");
		}
		
		print(text1);
		print(text2);

		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		
		if(word1.compareTo(word2) < 0){
			print( "word1 comes before word2");
		}
		
	}
	
	public static void print(String s){
		String printString = s;
		int cutoff = 20;
		if(printString.length() > cutoff){
			for(int i=0; i*cutoff < s.length(); i++){
				printString += getCut(s, cutoff, i+1)+"\n";
			}
		}
		System.out.println(printString);
	}
	
	private static String getCut(String s, int cutoff, int cut){
		int cutIndex = cut * cutoff;
		if(cutIndex > s.length())cutIndex = s.length();
		String currentCut = s.substring(0, cutIndex);
		int indexOfLastSpace = currentCut.length()-1;
		for(int i = currentCut.length()-1 ; i>=0; i--){
			String letter = currentCut.substring(i, i+1);
			if(letter.equals(" ")){
				indexOfLastSpace = i;
				break;
			}
		}
		 
		currentCut = currentCut.substring(0, indexOfLastSpace);
		return currentCut;
		
	}
	
}
