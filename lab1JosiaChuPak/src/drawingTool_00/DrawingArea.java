package drawingTool_00;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawingArea extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Drawing.set(g);
		
		int[] x = {200,100,100,200,300,300};
		int[] y = {100,200,300,400,300,200};
		 
		Drawing.pen().drawString("Hello World", 400, 400);
		Drawing.pen().drawPolygon(x,y, 6);
	}
}
