package guiPractice.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel implements Clickable{

	private Color color;
	private Action action;
	
	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text);
		this.color = color;
		this.action = action;
	}
	
	public void update(Graphics2D g) {
		g = clear();//clears image and gets new graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.green);
		if(getText() != null){
			g.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 35);
			g.setColor(Color.black);
			g.drawRoundRect(0, 0, getWidth(), getHeight(), 25, 35);
			g.setFont(new Font(font,Font.PLAIN, size));
			g.drawString(text, 4, getHeight()-5);
		}
	}

	@Override
	public boolean isHovered(int x, int y) {
		if(x > getX() && x < getX()+getWidth()){
			if(y > getY() && y < getY()+getHeight()){
				return true;
			}
		}
		return false;
	}

	@Override
	public void act() {
		
	}


}
