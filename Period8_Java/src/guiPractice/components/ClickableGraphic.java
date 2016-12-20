package guiPractice.components;

public class ClickableGraphic extends Graphic {

	private Action action;
	
	public ClickableGraphic(int x, int y, double scale, String imageLocation, Action action) {
		super(x, y, scale, imageLocation);
		this.action = action;
	}

	public ClickableGraphic(int x, int y, int w, int h, String imageLocation, Action action) {
		super(x, y, w, h, imageLocation);
		this.action = action;
	}

}
