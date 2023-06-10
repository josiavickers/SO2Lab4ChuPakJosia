package drawingTool;

import java.awt.Color;

public class BowlingBall extends OvalObject{
	
	public BowlingBall(int width, int height) {
		super(width / 2, height / 6);
	}
	
	// Method Overriding
	@Override
	public void drawAt(int x, int y) {
		int xShift = getWidth() * 2;
		int yShift = getWidth() * 17 / 2;
		super.drawAt(x + xShift, y + yShift);
		
		// add three bowling bowl holes
		int width = getWidth() / 5;
		int height = getHeight() / 5;
		Drawing.pen().setColor(Color.WHITE);
		Drawing.pen().fillOval(x + xShift * 14 / 13, y + yShift + height / 2, width, height);
		Drawing.pen().fillOval(x + xShift * 17 / 13, y + yShift + height / 2, width, height);
		Drawing.pen().fillOval(x + xShift * 7 / 6, y + yShift + height * 2, width, height);
	}
}
