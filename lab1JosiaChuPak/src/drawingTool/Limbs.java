package drawingTool;

import java.awt.Color;

public class Limbs {
	// All composite below
	private Arms arms;
	private Legs legs;
	private Tail tail;
	
	public Limbs(int torsoWidth, int torsoHeight) {
		arms = new Arms(torsoWidth, torsoHeight);
		legs = new Legs(torsoWidth, torsoHeight);
		tail = new Tail(torsoWidth, torsoHeight);
	}
	
	public void draw(int x, int y, Color color) {
		arms.drawAt(x, y, color);
		tail.drawAt(x, y, color);
		legs.drawAt(x, y, color);
	}
	
	public int getArmWidth() {
		return arms.getWidth();
	}
	
	public int getLegHeight() {
		return legs.getHeight();
	}
}
