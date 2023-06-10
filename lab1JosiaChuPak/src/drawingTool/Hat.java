package drawingTool;

import java.awt.Color;

public class Hat {
	private int width;
	private int height;
	private int widthBottom;
	private int heightBottom;
	
	public Hat(int width, int height) {
		this.width = width * 6 / 10;
		this.height = height * 7 / 30;
		this.widthBottom = width * 9 / 10;
		this.heightBottom = height * 7 / 300;
	}
	
	public void drawAt(int x, int y) {
		Drawing.pen().setColor(Color.RED);
		Drawing.pen().fillRect(x - width / 4, y - height * 10 / 7, width, height); 
		Drawing.pen().fillRect(x - width / 2, y - height * 15 / 28, widthBottom , heightBottom);
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
