package drawingTool;

import java.awt.Color;

public class Arms {
	private int width;
	private int height;
	
	public Arms(int width, int height) {
		this.width = width * 2;
		this.height = height / 10;
	}
	
	public void drawAt(int x, int y, Color color) {
		Drawing.pen().setColor(color);
		Drawing.pen().fillOval(x + width/4, y + height*10/3, width, height); // right arm
		Drawing.pen().fillOval(x - width, y + height*10/3, width, height); // left arm
	}
	
	public int getWidth() {
		return width;
	}
}


