package drawingTool;

import java.awt.Color;

public class Ears {
	private int width;
	private int height;
	private int width2;
	private int height2;
	
	public Ears(int width, int height) {
		this.width = width / 2;
		this.height = height / 6;
		this.width2 = this.width - this.width / 4;
		this.height2 = this.height - this.width / 4;
	}
	
	public void drawAt(int x, int y, Color color) {
		Drawing.pen().setColor(color);
		Drawing.pen().fillOval(x - this.width, y - height * 3 / 10, width, height); // outer ear left
		Drawing.pen().fillOval(x + width * 4 / 5, y - height * 3 / 10, width, height); // outer ear right
		Drawing.pen().setColor(Color.WHITE);
		Drawing.pen().fillOval(x - width * 4 / 5, y - height * 6 / 25, width2, height2); // inner ear left
		Drawing.pen().fillOval(x + width * 4 / 5, y - height * 6 / 25, width2, height2); // inner ear right
	}
}
