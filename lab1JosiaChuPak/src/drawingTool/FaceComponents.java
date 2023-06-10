package drawingTool;

import java.awt.Color;

public class FaceComponents {
	
	// All composite below
	private MainFace mainFace;
	private InnerFace innerFace;
	private TopInnerFace topInnerFace;
	
	public FaceComponents(int torsoWidth, int torsoHeight) {
		mainFace = new MainFace(torsoWidth, torsoHeight);
		innerFace = new InnerFace(torsoWidth, torsoHeight);
		topInnerFace = new TopInnerFace(torsoWidth, torsoHeight);
	}
	
	public void draw(int x, int y, Color color) {
		mainFace.drawAt(x, y, color);
		innerFace.drawAt(x, y);
		topInnerFace.drawAt(x, y);
	}
}
