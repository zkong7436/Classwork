package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class MouseFollower extends GUIApplication {

	private CoordinateScreen coordScreen;
	
	public static void maint(String[] args){
		new MouseFollower();
	}
	@Override
	protected void initScreen() {
		coordScreen = new CoordinateScreen(getWidth(),getHeight());
		setScreen(coordScreen);
	}

}
