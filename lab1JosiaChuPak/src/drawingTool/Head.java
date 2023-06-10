package drawingTool;

import java.awt.Color;

public class Head {
	// All composite below
	private Face face;
	private Eyes eyes;                
	private Ears ears;
	
	public Head(int torsoWidth, int torsoHeight) {
		face = new Face(torsoWidth, torsoHeight);
		eyes = new Eyes(torsoWidth, torsoHeight);
		ears = new Ears(torsoWidth, torsoHeight);
	}
	
	public void draw(int x, int y, Color color) {
		ears.drawAt(x, y, color);
		face.draw(x, y, color);
		eyes.draw(x, y);
	}
	
}
