package drawingTool;

public class Eyes {
	// All composite below
	private Pupils pupils;
	private Eyebrows eyebrows;
	
	public Eyes(int torsoWidth, int torsoHeight) {
		pupils = new Pupils(torsoWidth, torsoHeight);
		eyebrows = new Eyebrows(torsoWidth, torsoHeight);
	}
	
	public void draw(int x, int y) {
		eyebrows.drawAt(x, y);
		pupils.drawAt(x, y);
	}

}
