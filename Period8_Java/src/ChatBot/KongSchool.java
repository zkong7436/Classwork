package ChatBot;

public class KongSchool implements ChatBots{

	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public void talk() {
		inSchoolLoop=true;
		while(inSchoolLoop){
			KongMain.print("(Type quick to go back)");
			//static call on promptInput method from KongMain class
			schoolResponse = KongMain.promptInput();
			if(schoolResponse.indexOf("quit")>=0){
				inSchoolLoop = false;
				KongMain.promptForever();
			}
			KongMain.print("That's my favorite part about school.");
		}
		
	}
	
}
