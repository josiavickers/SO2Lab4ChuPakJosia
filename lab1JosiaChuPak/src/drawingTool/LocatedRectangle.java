package drawingTool;

public interface LocatedRectangle {
	
	public int getX();
	public int getY();
	public int getWidth();
	public int getHeight();
	
	public default boolean intersects(LocatedRectangle other) {
		return !doesNotIntersect(other, 0);
	}	
	
	public default boolean intersects(LocatedRectangle other, int margin) {
		return !doesNotIntersect(other, margin);
	}
	
	private boolean doesNotIntersect(LocatedRectangle other, int margin) {
		return 	leftOf(other, margin) || rightOf(other, margin) || 
				above(other, margin) || below(other, margin);
	}
	
	private boolean leftOf(LocatedRectangle other, int margin){
		return this.getX() + this.getWidth() + margin <= other.getX();
	}
	
	private boolean rightOf(LocatedRectangle other, int margin){
		return this.getX() >= other.getX() + other.getWidth() + margin;
	}
	
	private boolean above(LocatedRectangle other, int margin) {
		return this.getY() + this.getHeight() + margin <= other.getY();
		
	}
	
	private boolean below(LocatedRectangle other, int margin) {
		return this.getY() >= other.getY() + other.getHeight() + margin;
	}
}
