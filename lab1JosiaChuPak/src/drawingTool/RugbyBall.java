package drawingTool;

public class RugbyBall extends OvalObject{

	public RugbyBall(int height, int width) {
		super(width / 3, height / 2);
	}
	
	// Method Overriding
	@Override
	public void drawAt(int x, int y) {
		int xShift = getHeight() * 3;
		int yShift = getHeight() * 17 / 2;
		super.drawAt(x - xShift, y + yShift);
	}
}
