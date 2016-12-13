package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{

	private TextLabel label;
	private TextArea paragraph;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}
	
 
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40, 45, 760, 40, "Sample text");
		paragraph = new TextArea(40,85,558,500,"This is a whole paragraph. Notice how as the paragraph gets to the edge of the page, a new line is.");
		viewObjects.add(paragraph);
		viewObjects.add(label);
		
	}


	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseMoved(MouseEvent m) {
		label.setText("Mouse at " + m.getX() + ", "+m.getY());
		update();
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}

}
