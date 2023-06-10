package drawingTool;

import java.awt.Color;

public class InnerFace {
	private int width;
	private int height;
	
	public InnerFace(int width, int height) {
		this.width = width * 19 / 20;
		this.height = height / 4;
	}
	
	public void drawAt(int x, int y) {
		Drawing.pen().setColor(Color.WHITE);
		Drawing.pen().fillOval(x - width * 5 / 19, y - height * 2 / 15, width, height);
	}

}
