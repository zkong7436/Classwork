package guiPractice.sampleGames;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Graphic;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class MyScreen extends Screen {

	private TextLabel label;
	private Graphic picture;

	public MyScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40, 45, 760, 40, "WUT UPPPPPPPP");
		picture = new Graphic(75,75,.75,"resources/sampleImages/0e9.jpg");
		viewObjects.add(label);
		viewObjects.add(picture);
		
	}

}
