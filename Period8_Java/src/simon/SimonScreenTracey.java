package simon;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiPractice.components.Action;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;
import guiPractice.sampleGames.ClickableScreen;

public class SimonScreenTracey extends ClickableScreen implements Runnable {

	private TextLabel label;
	private ButtonInterfaceTracey[] button;
	private ProgressInterfaceTracey progress;
	private ArrayList<MoveInterfaceTracey> sequence;
	
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	
	public SimonScreenTracey(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		final ButtonInterfaceTracey b = getAButton();
		b.highlight();

	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		
		addButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceTracey>();
		//add 2 moves to start
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);


	}

	private MoveInterfaceTracey randomMove() {
		ButtonInterfaceTracey b;
		//code that randomly selects a ButtonInterfaceTracey
		return getMove(b);
	}

	private ProgressInterfaceTracey getProgress() {
		/**
		Placeholder until partner finishes implementation of ProgressInterface
		*/
		return null;
	}

	private void addButtons() {
		int numberOfButtons = 3;
		Color[] colors = {Color.blue, Color.red, Color.black};
		for(int i=0; i<=numberOfButtons; i++){
			ButtonInterfaceTracey b = getAButton();
			b.setColor(colors[i]);
			b.setX(160 + (int)(100*Math.cos(i*2*Math.PI/(numberOfButtons))));
			b.setY(200 - (int)(100*Math.sin(i*2*Math.PI/(numberOfButtons))));
			b.setAction(new Action(){
				public void act(){
					if(acceptingInput){
						
					}
				}
			});
			Thread blink = new Thread(new Runnable(){

				public void run(){
				}

			});
		}
	}
	
}
