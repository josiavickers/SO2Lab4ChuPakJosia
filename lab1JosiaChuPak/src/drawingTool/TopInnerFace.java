package drawingTool;

import java.awt.Color;

public class TopInnerFace {
	private int width;
	private int height;
	
	public TopInnerFace(int width, int height) {
		this.width = width * 2 / 5;
		this.height = height / 5;
	}
	
	public void drawAt(int x, int y) {
		Drawing.pen().setColor(Color.WHITE);
		Drawing.pen().fillOval(x - width * 5 / 14, y - height / 3, width, height);
		Drawing.pen().fillOval(x + width * 5 / 14, y - height / 3, width, height);
	}
}
