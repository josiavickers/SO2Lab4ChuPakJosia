package drawingTool;

import java.awt.Color;

public class MainFace {
	private int width;
	private int height;
	
	public MainFace(int width, int height) {
		this.width = width * 9 / 10;
		this.height = height * 7 / 30;
	}
	
	public void drawAt(int x, int y, Color color) {
		Drawing.pen().setColor(color);
		Drawing.pen().fillOval(x - width * 20 / 63, y - height * 15 / 28, width, height); // top part
		Drawing.pen().fillOval(x - width * 10 / 27, y - height * 15 / 77, width + width / 5, height + height / 5); // bottom part
	}

}
