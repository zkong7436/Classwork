package wackAMole;

import guiPractice.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {

	private int appearanceTime;

	public Mole(int x, int y) {
		super(x, y, .50, "resources/sampleImages/European-Mole-Talpa-Europaea.jpg");
	}

	@Override
	public int getAppearanceTime() {
		return appearanceTime;
	}

	@Override
	public void setAppearanceTime(int i) {
		this.appearanceTime = i;
		
	}

}
