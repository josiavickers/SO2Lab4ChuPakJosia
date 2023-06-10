package drawingTool;

import java.awt.Color;

public class Face {
	
	// All composite below
	private FaceComponents faceComponents;
	private Mouth mouth;
	private Nose nose;
	
	public Face(int torsoWidth, int torsoHeight) {
		faceComponents = new FaceComponents(torsoWidth, torsoHeight);
		mouth = new Mouth(torsoWidth, torsoHeight);
		nose = new Nose(torsoWidth, torsoHeight);
	}
	
	public void draw(int x, int y, Color color) {
		faceComponents.draw(x, y, color);
		mouth.drawAt(x, y); 
		nose.drawAt(x, y);
	}
}
