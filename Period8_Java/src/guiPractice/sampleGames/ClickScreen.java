package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Visible;

public class ClickScreen extends Screen implements MouseMotionListener, MouseListener{

	private ClickableGraphic click;
	
	public ClickScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		click = new ClickableGraphic(90, 90, .75, "resources/sampleImages/0e9.jpg");
		click.setAction(new Action(){
			public void act(){
				click.setX(click.getX()+10);
				MouseFollower.game.setScreen(MouseFollower.click);
			}
		});
		viewObjects.add(click);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(click.isHovered(e.getX(), e.getY())){
			click.act();
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public MouseListener getMouseListener(){
		return this;
	}
}
