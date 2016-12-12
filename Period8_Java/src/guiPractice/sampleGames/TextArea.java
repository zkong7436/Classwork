package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import guiPractice.components.Component;

public class TextArea extends Component{
	
	private String text;
	private String font;
	private int size;

	public TextArea(int x, int y, int w, int h, String text) {
		super(x, y, w, h);
		this.text = text;
		font = "Helvetica";
		size = 20;
		update();
	}

	public void setText(String s){
		this.text = s;
	}
	
	public void setFont(String font){
		this.font = font;
	}
	
	public void setSize(int size){
		this.size = size;
	}
	
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		if(text != null){
			String[] words = text.split(" ");
			int placeholder = 0;
			int limit = 70;
			ArrayList<String> newln = new ArrayList<String>();
			while(){
				
			}
		}
	}
}
