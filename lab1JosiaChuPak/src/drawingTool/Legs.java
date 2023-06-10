package drawingTool;

import java.awt.Color;

public class Legs {
	private int width;
	private int height;
	
	public Legs(int width, int height) {
		this.width = (width * 3) / 10;
		this.height = (height * 4) / 6;
	}
	
	public void drawAt(int x, int y, Color color) {
		Drawing.pen().setColor(color);
		Drawing.pen().fillOval(x - width*5/9, y + 27*height/20, width, height); 
		Drawing.pen().fillOval(x + width*10/9, y + 27*height/20, width, height); 
	}
	
	public int getHeight() {
		return height;
	}
}
