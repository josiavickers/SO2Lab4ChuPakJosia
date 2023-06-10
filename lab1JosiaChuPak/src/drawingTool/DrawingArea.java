/**
 * Provides a panel on which an object of class "Graphics" can draw.
 * 
 * @author Björn Gottfried
 * @version 1.0
 * @runsWith JAVA 1.8
 * 
 * In this file, you have to add two lines of code:
 * 		+ instantiate one object of your domain class
 * 		+ call its drawAt-method
 */

package drawingTool;

import javax.swing.JPanel;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class DrawingArea extends JPanel { // JPanel is like a whiteboard you can draw on
	private Scene scene; // property to store Scene
	
	public DrawingArea() {
		scene = new Scene();
	}
	@Override
	protected void paintComponent(Graphics g) { // paintComponent() sees what's instantiated in it 
		// and paints those to screen when draw() is called
		// paintComponent() is called whenever changes are made e.g. user resizes screen with mouse
		// never call paintComponent() yourself! Instead, repaint() can be used
		super.paintComponent(g);
		Drawing.set(g);
		
		scene.draw();
	}
	
	public Scene getScene() {
		return this.scene;
	}
}