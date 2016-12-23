package wackAMole;

import java.util.ArrayList;

import guiPractice.components.Action;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;
import guiPractice.sampleGames.ClickableScreen;

public class WhackAMoleScreen extends ClickableScreen implements Runnable{
	
	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	
	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 60.0;
		Thread play = new Thread(this);
		play.start();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		moles = new ArrayList<MoleInterface>();
//		player = getAPlayer();
		label = new TextLabel(getWidth()/2-60, getHeight()/2-30, 120, 60, "Ready...");
		timeLabel = new TextLabel(getWidth()/2-60, 50, 120, 60, "");
		viewObjects.add(label);
//		viewObjects.add(player);
		viewObjects.add(timeLabel);
		
	}


	public void update(){
		super.update();
	}
	
	private void changeText(String s){
		try{
			Thread.sleep(1000);
			label.setText(s);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void run() {
		changeText("Set...");
		changeText("GO!");
		changeText("");
		timeLabel.setText(""+timeLeft);
		while(timeLeft > 0){
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			timeLeft -= .1;
			timeLabel.setText(""+(int)(timeLeft*10)/10.0);
			disappearMoles();
			addNewMoles();
		}
		
	}
	
	private void addNewMoles() {
		//probability of mole appearing depends on time left
		double prob=.2+.1*(30.0-timeLeft)/30;
		if(Math.random()<prob){
			final MoleInterface mole = getAMole();
			mole.setAppearanceTime((int)(500+Math.random()*2000));
			mole.setAction(new Action(){
				public void act(){
					player.increaseScore(1);
					//remove mole from viewObjects
					remove(mole);
					//remove it from mole database
					moles.remove(mole);
				}
			});
			//add mole to visible
			addObject(mole);
			//add mole to mole list
			moles.add(mole);
		}
	}

	private void disappearMoles(){
		//each mole has a "clock"
		//when the clock counts down to 0
		//it disappears
		for(int i=0; i<moles.size(); i++){
			MoleInterface n = moles.get(i);
			n.setAppearanceTime(n.getAppearanceTime()-100);
			if(n.getAppearanceTime()<=0){
				//remove from viewObjects
				remove(n);
				//remove it from mole database
				moles.remove(i);
				i--;//compensate for i++
			}
		}
	}
	
	public static void main(String[] args){
		
	}
	
	/**
	*to implement later, after Character Team implements PlayerInterface
	*this is a placeholder because early in the game design process, the player
	*arent't designed yet, so we use this method later, once we learn how to 
	*create a Player
	*/
	private PlayerInterface getAPlayer() {
	 return new Player(20,20);
	}

	/**
	*to implement later, after EnemyTeam implements MoleInterface
	*this is a placeholder because early in the game design process, the player
	*arent't designed yet, so we use this method later, once we learn how to 
	*create a Mole
	*/
	private MoleInterface getAMole() {
	return new Mole((int)(getWidth()*Math.random())-100, (int)(getHeight()*Math.random())-100);
	}

	
}
