package ChatBot;

public class KongHello implements ChatBots {
	private String helloResponse;
	private boolean inHelloLoop;
	
	private String[] calmResponse = {"We already said hello. Let's move this conversation along.", "You said hello already. Did you forget?"};
	private String[] angryResponse = {"Okay seriously. Stop saying hi.", "What is wrong with you and saying hello?"};
	
	private int helloCount;
	
	public KongHello(){
		helloCount = 0;
	}
	
	public void talk(){
		inHelloLoop = true;
		while (inHelloLoop){
			helloCount++;
			printResponse();
			helloResponse = KongMain.promptInput();
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				KongMain.promptForever();
			}
		}
	}
	
	private void printResponse(){
		if(helloCount > 4){
			int responseSelection = (int)(Math.random() * angryResponse.length);
			KongMain.print(angryResponse[responseSelection]);
		}else{
			int responseSelection = (int)(Math.random() * calmResponse.length);
			KongMain.print(calmResponse[responseSelection]);
		}
	}
	
	public boolean isTriggered(String userInput){
		String[] greeting = {"hello","hey","hi"};
		for (int j=0; j<greeting.length;j++){
			if(KongMain.findKeyword(userInput, greeting[j], 0) >= 0){
				return true;
			}
		}
		return false;
	}
}
