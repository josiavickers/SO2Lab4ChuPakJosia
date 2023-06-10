package drawingTool;

import java.awt.Color;

public class Pupils {

	private int width;
	private int height;
	
	public Pupils(int width, int height) {
		this.width = width / 10;
		this.height = height / 30;
	}
	
	public void drawAt(int x, int y) {
		Drawing.pen().setColor(Color.BLUE);
		Drawing.pen().fillOval(x + width / 2, y + height / 2, width, height); 
		Drawing.pen().fillOval(x + width * 5 / 2, y + height / 2, width, height); 
	}
}
