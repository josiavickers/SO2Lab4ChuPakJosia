package drawingTool;

public class Accessories {
	// All aggregates below
	private Hat hat;
	private Shoes shoes;
	private RugbyBall rugbyBall; 
	private BowlingBall bowlingBall;
	
	public Accessories(int torsoWidth, int torsoHeight) {
		hat = new Hat(torsoWidth, torsoHeight);
		shoes = new Shoes(torsoWidth, torsoHeight);
		rugbyBall = new RugbyBall(torsoWidth, torsoHeight);
		bowlingBall = new BowlingBall(torsoWidth, torsoHeight);
	}
	
	public void draw(int x, int y) {
		hat.drawAt(x, y);
		shoes.drawAt(x, y);
		rugbyBall.drawAt(x, y);
		bowlingBall.drawAt(x, y);
	}
	
	public int getHatWidth() {
		return hat.getWidth();
	}
	
	public int getHatHeight() {
		return hat.getHeight();
	}
	
	public int getShoeHeight() {
		return shoes.getHeight();
	}
}
