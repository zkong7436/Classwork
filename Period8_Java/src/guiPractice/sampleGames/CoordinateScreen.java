package guiPractice.sampleGames;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen {

	private TextLabel label;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}
 
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40, 45, 760, 40, "Sample text");
		paragraph = new TextArea(40,85,760,500,"This is a whole paragraph. Notice how as the paragraph gets to the edge of the page, a new line is.");
		viewObjects.add(label);
		
	}

}
