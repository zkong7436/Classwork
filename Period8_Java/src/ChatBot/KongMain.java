package ChatBot;

import java.util.Scanner;

public class KongMain {
	
	static String response;
	static boolean inMainLoop;
	static Scanner input;
	static String user;
	static ChatBots school;
	
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
	
	public static String promptInput() {
		
		String userInput = input.nextLine();
		return userInput;
	}
	
	public static void promptForever() {
		inMainLoop = true;
		while(inMainLoop){
			print("Hi, "+user+". How are you?");
			response=promptInput();
			if(findKeyword(response, "good", 0)>=0){
				print("That's wonderful! So glad you feel good.");
			}else if(response.indexOf("school")>=0){
				print("School is great.");
				inMainLoop=false;
				school.talk();
			}else{
				print("I don't understand.");
			}
			
		}
	}

	public static int findKeyword(String searchString, String keyword, int startPsn) {
		
			searchString = searchString.trim();
			searchString = searchString.toLowerCase();
			keyword = keyword.toLowerCase();
			int psn = searchString.indexOf(0);
			
			while(psn>=0){
				String before = " ";
				String after = " ";
				//check if character in front exists
				if(psn > 0){
					before = searchString.substring(psn-1,  psn);
				}
				//check if there is a character after keyword
				if(psn+keyword.length() < searchString.length()){
					after = searchString.substring(psn + keyword.length(),psn + keyword.length()+1);
				}
			}
			return -1;
	}

	public static void createFields(){
		
		input = new Scanner(System.in);
		user = "";
		school = new KongSchool();
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
		String printString = "";
		int cutoff = 35;
		//check for words to add
		//LOW s has a length > 0
		while(s.length()>0){
			String cut="";
			String nextWord = "";
			//check to see if the next word will fit on the line
			//AND there must still be words to add
			while(cut.length()+nextWord.length()<cutoff && s.length()>0){
				//add the next word to the line
				cut += nextWord;
					
				s=s.substring(nextWord.length());
				
				//identify the following word without space
				int endOfWord=s.indexOf(" ");
				//if there are no more spaces this is the last word, so add the whole thing
				if(endOfWord == -1){
					endOfWord = s.length()-1;//-1 for index
				}
				
				nextWord = s.substring(0,endOfWord+1);
			}
			
			printString += cut+"\n";
		}
		
		System.out.print(printString);
	}
	
}