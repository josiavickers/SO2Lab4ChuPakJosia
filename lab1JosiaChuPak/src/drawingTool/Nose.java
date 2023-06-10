package drawingTool;

import java.awt.Color;

public class Nose {

	private int width;
	private int height;
	
	public Nose(int width, int height) {
		this.width = width / 10;
		this.height = height / 30;
	}
	
	public void drawAt(int x, int y) {
		Drawing.pen().setColor(Color.RED);
		Drawing.pen().fillOval(x + width * 5 / 3, y + height * 3 / 2, width, height); 
	}
}
