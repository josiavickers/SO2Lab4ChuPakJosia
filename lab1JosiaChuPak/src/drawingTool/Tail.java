package drawingTool;

import java.awt.Color;

public class Tail {

	private int width;
	private int height;
	
	public Tail(int width, int height) {
		this.width = width * 2;
		this.height = (height * 4) / 60;
	}
	
	public void drawAt(int x, int y, Color color) {
		Drawing.pen().setColor(color);
		Drawing.pen().fillOval(x, y + height*10, width, height); 
	}
}
