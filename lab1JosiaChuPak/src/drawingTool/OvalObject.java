package drawingTool;

import java.awt.Color;

public class OvalObject {

	private int width;
	private int height;
	
	public OvalObject(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void drawAt(int x, int y) {
		Drawing.pen().setColor(Color.BLUE);
		Drawing.pen().fillOval(x, y, width, height);
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
