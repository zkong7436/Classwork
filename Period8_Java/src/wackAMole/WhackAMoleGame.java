package wackAMole;

import guiPractice.GUIApplication;
import guiPractice.sampleGames.MouseFollower;

public class WhackAMoleGame extends GUIApplication{

	public WhackAMoleGame() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initScreen() {
		WhackAMoleScreen wams = new WhackAMoleScreen(getWidth(), getHeight());
		setScreen(wams);
	}
	
	public static void main(String[] args){
		WhackAMoleGame game = new WhackAMoleGame();
		Thread app = new Thread(game);
		app.start();
	}

}
