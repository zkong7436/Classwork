package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class MyScreen extends Screen implements MouseMotionListener, MouseListener{

	private TextLabel label;
	private Graphic picture;
	private Button pepe;

	public MyScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40, 45, 760, 40, "WUT UPPPPPPPP");
		picture = new Graphic(75,75,.75,"resources/sampleImages/0e9.jpg");
		pepe = new Button(50,50,100,60,"Pepe",Color.GRAY, new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.coordScreen);
			}
		});
		viewObjects.add(label);
		viewObjects.add(picture);
		viewObjects.add(pepe);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(pepe.isHovered(e.getX(), e.getY())){
			pepe.act();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public MouseListener getMouseListener(){
		return this;
	}

}
