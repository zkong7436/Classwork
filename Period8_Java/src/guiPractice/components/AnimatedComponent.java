package guiPractice.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * @author Student8
 *
 */
public class AnimatedComponent extends MovingComponent{

	private ArrayList<BufferedImage> frame; //the images that can be displayed
	private ArrayList<Integer> times; //the time each image is displayed
	private long displayTime; //the time when the last image switched
	private int currentFrame; //the frame that is currently being displayed
	private boolean repeat;

	public static final int REFRESH_RATE = 20;

	public AnimatedComponent(int x, int y, int w, int h) {
		super(x, y, w, h);
		frame = new ArrayList<BufferedImage>();
		times = new ArrayList<Integer>();
		currentFrame = 0;
		repeat = true;
	}

	public void setRepeat(boolean b){
		repeat = b;
	}

	public boolean isRepeat() {
		return repeat;
	}

	public boolean isAnimated(){
		return true;
	}

	public void addFrame(BufferedImage image, Integer time){
		frame.add(image);
		times.add(time);
	}

	public void checkBehaviors(){
		//this would be where you add restrictions to the components's location
	}

	public void drawImage(Graphics2D g) {
		long currentTime = System.currentTimeMillis();
		/*
		 * check if it's time to change the frame
		 * AND there should be same number of frames as times
		 * AND check that there are images to be drawn
		 */
		if(frame != null && frame.size()>0 && 
				frame.size() == times.size() &&
				currentTime - displayTime > times.get(currentFrame)){
			//update is occurring so update the displayeTime
			displayTime = currentTime;
			//increase currentFrame
			currentFrame = (currentFrame+1)%frame.size();
			if(currentFrame == 0 && !repeat){
				setRunning(false);
				return;
			}
			//clear previous image
			g = clear();
			BufferedImage newFrame = frame.get(currentFrame);
			//use the scaled image method to fit the image
			g.drawImage(newFrame, 0, 0, getWidth(), getHeight(), 0, 0, newFrame.getWidth(), newFrame.getHeight(), null);
			
		}
	}

}