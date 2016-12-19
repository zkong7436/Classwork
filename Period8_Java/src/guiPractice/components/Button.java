package guiPractice.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;

import org.w3c.dom.events.EventTarget;
import org.w3c.dom.events.MouseEvent;
import org.w3c.dom.views.AbstractView;

public class Button extends TextLabel implements Clickable, MouseListener, MouseEvent{

	private Color color;
	private Action action;
	
	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text);
		this.color = color;
		this.action = action;
		update();
	}
	
	public Color getColor(){
		return color;
	}
	
	public void setColor(Color c){
		color = c;
		update();
	}
	
	public void update(Graphics2D g) {
		g = clear();//clears image and gets new graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(color);
		g.fillRoundRect(0, 0, getWidth()-1, getHeight(), 25, 35);
		g.setColor(Color.black);
		g.drawRoundRect(0, 0, getWidth(), getHeight(), 25, 35);
		g.setFont(new Font(getFont(),Font.PLAIN, getSize()));
		FontMetrics fm = g.getFontMetrics();
		
		if(getText() != null){
			g.setColor(Color.white);
			String t = getText();
			int cutoff = t.length();
			while(cutoff>0 && fm.stringWidth(t)>getWidth()){
				cutoff--;
				t = t.substring(0, cutoff);
			}
			g.drawString(t, (getWidth()-fm.stringWidth(t))/2, (getHeight()+fm.getHeight()-fm.getDescent())/2);
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

	@Override
	public int getDetail() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AbstractView getView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initUIEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, AbstractView viewArg,
			int detailArg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getBubbles() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getCancelable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EventTarget getCurrentTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public short getEventPhase() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EventTarget getTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getTimeStamp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initEvent(String eventTypeArg, boolean canBubbleArg, boolean cancelableArg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preventDefault() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopPropagation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getAltKey() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public short getButton() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getClientX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getClientY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getCtrlKey() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getMetaKey() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EventTarget getRelatedTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getScreenX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getScreenY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getShiftKey() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void initMouseEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, AbstractView viewArg,
			int detailArg, int screenXArg, int screenYArg, int clientXArg, int clientYArg, boolean ctrlKeyArg,
			boolean altKeyArg, boolean shiftKeyArg, boolean metaKeyArg, short buttonArg, EventTarget relatedTargetArg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		if(this.isHovered(e.getX(), e.getY())){
			this.act();
		}
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public MouseListener getMouseListener() {
		return this;
	}
}
