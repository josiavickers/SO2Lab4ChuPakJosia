package drawingTool;

import java.awt.Color;

public class Monkey implements LocatedRectangle{
	private Head head; // composite
	private Torso torso; // composite
	private Limbs limbs; // composite
	private Accessories accessories; // aggregate
	
	private int x;
	private int y;
	
	private int torsoWidth;
	private int torsoHeight;
	private Color color;
	
	/**
	 * aaa
	 * @param x
	 * @param y
	 * @param k
	 */
	public Monkey(int x, int y, int k) {
		this(x, y, k, Color.BLACK);
	}
	
	public Monkey(int x, int y, int k, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
		torsoWidth = 25 * k;
		torsoHeight = 75 * k;
		head = new Head(torsoWidth, torsoHeight);
		torso = new Torso(torsoWidth, torsoHeight);
		limbs = new Limbs(torsoWidth, torsoHeight);
		accessories = new Accessories(torsoWidth, torsoHeight);
	}
	
	public void draw() {
		limbs.draw(x, y, color);
		torso.drawAt(x, y, color);
		head.draw(x, y, color);
		accessories.draw(x, y);
		
		//TO VISUALISE THE MONKEY'S BOUNDING RECTANGLE
		//Drawing.pen().setColor(Color.RED);
		//Drawing.pen().drawRect(getX(), getY(), getWidth(), getHeight());
		
	}
	
	/*
	public void draw(int dotSize) { // overloaded method
		limbs.draw(x, y);
		torso.drawAt(x, y, dotSize); // dotSize should be getTorsoWidth()/5
		head.draw(x, y);
		accessories.draw(x, y);
		
		// TO VISUALISE THE MONKEY'S BOUNDING RECTANGLE
		//Drawing.pen().setColor(Color.RED);
		//Drawing.pen().drawRect(getX(), getY(), getWidth(), getHeight());
		
	}
	*/

	public int getTorsoWidth() {
		return torsoWidth;
	}
	
	@Override
	public int getX() {
		return x - limbs.getArmWidth(); // top left corner of monkey's bounding rectangle
	}

	@Override
	public int getY() {
		return y - 3 * accessories.getHatHeight() / 2; // top left corner of monkey's bounding rectangle
	}

	@Override
	public int getWidth() {
		return accessories.getHatWidth() + limbs.getArmWidth() * 2;
	}

	@Override
	public int getHeight() {
		return torso.getHeight() + accessories.getShoeHeight() + limbs.getLegHeight() + accessories.getHatHeight();
	}
	
	public Color getColor() {
		return this.color;
	}
}
