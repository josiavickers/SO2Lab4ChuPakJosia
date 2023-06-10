package drawingTool;

import java.awt.Color;

public class Eyebrows {
	private int width;
	private int height;
	
	public Eyebrows(int width, int height) {
		this.width = width / 4;
		this.height = height / 15;
	}
	
	public void drawAt(int x, int y) {
		Drawing.pen().setColor(Color.DARK_GRAY);
		Drawing.pen().fillOval(x + width, y - height * 3 / 8, width, height);
		Drawing.pen().fillOval(x - width / 3, y - height * 3 / 8, width, height);
		Drawing.pen().setColor(Color.WHITE);
		Drawing.pen().fillOval(x + width, y + height * 15 / 300, width, height);
		Drawing.pen().fillOval(x - width / 3, y + height * 15 / 300, width, height); 
	}
}
