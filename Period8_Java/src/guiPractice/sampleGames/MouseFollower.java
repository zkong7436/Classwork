package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class MouseFollower extends GUIApplication {

	private CoordinateScreen coordScreen;
	public static MyScreen myScreen;
	public static MouseFollower game;
	
	public static void main(String[] args){
		game = new MouseFollower();
		Thread app = new Thread(game);
		app.start();
	}
	@Override
	protected void initScreen() {
		coordScreen = new CoordinateScreen(getWidth(),getHeight());
		myScreen = new MyScreen(getWidth(),getHeight());
		setScreen(coordScreen);
	}

}
