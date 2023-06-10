package drawingTool;

import java.awt.Color;

public class Torso {

	private int width;
	private int height;
	
	public Torso(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void drawAt(int x, int y, Color color) {
		Drawing.pen().setColor(color);
		Drawing.pen().fillOval(x - width / 4, y, width, height); 
	}
	
	/*
	public void drawAt(int x, int y, int dotSize) { // overloaded method
		Drawing.pen().setColor(Color.BLACK);
		Drawing.pen().fillOval(x - width / 4, y, width, height);

		// add polka dots
		Drawing.pen().setColor(Color.YELLOW);
		Drawing.pen().fillOval(x, y + height / 4, dotSize, dotSize);
		Drawing.pen().fillOval(x, y + height / 2, dotSize, dotSize);
		Drawing.pen().fillOval(x + width / 3, y + height / 3, dotSize, dotSize);
	}
	*/
	
	public int getHeight() {
		return height;
	}
}
