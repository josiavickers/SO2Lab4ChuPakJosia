package drawingTool;

import java.awt.Color;

public class Mouth {
	private int width;
	private int height;
	
	public Mouth(int width, int height) {
		this.width = width * 3 / 10;
		this.height = height / 10;
	}
	
	public void drawAt(int x, int y) {
		Drawing.pen().setColor(Color.BLUE);
		Drawing.pen().fillOval(x + width / 5, y + height * 8 / 10, width, height);
		Drawing.pen().setColor(Color.WHITE);
		Drawing.pen().fillRect(x + width / 5, y + height / 2, width, height);
	}

}
