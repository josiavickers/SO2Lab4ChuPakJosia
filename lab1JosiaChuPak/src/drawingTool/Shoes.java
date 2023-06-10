package drawingTool;

import java.awt.Color;

public class Shoes {
	private int width;
	private int height;
		
	public Shoes(int width, int height) {
		this.width = width * 7 / 10;
		this.height = height / 10;
	}
		
	public void drawAt(int x, int y) {
		Drawing.pen().setColor(Color.RED);
		Drawing.pen().fillOval(x + width * 5 / 14, y + height * 31 / 2, width, height);
		Drawing.pen().fillOval(x - width * 5 / 7, y + height * 31 / 2, width, height);
	}
	
	public int getHeight() {
		return height;
	}
}