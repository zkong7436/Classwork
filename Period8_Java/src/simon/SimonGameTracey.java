package simon;

import guiPractice.GUIApplication;
import wackAMole.WhackAMoleGame;
import wackAMole.WhackAMoleScreen;

public class SimonGameTracey extends GUIApplication {

	public SimonGameTracey() {
		
	}

	@Override
	protected void initScreen() {
		SimonScreenTracey sim = new SimonScreenTracey(getWidth(), getHeight());
		setScreen(sim);
	}

	public static void main(String[] args) {
		SimonGameTracey game = new SimonGameTracey();
		Thread app = new Thread(game);
		app.start();
	}

}
