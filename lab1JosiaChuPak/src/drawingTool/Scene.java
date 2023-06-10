package drawingTool;

import drawingTool.graphicState.*;
import java.awt.Color;
import java.util.ArrayList;
/*
import java.util.Arrays;
import java.util.Collections; 
*/

public class Scene {
	private static State graphicState;
	private ArrayList<LocatedRectangle> sceneObjects = null; // programming to an interface
	
	public Scene() {
		graphicState = AllMonkeyState.getInstance(this);
		sceneObjects = new ArrayList<LocatedRectangle>();
	}
	
	public void draw() {
		for (LocatedRectangle o : sceneObjects) {
			if (o.getClass() == Monkey.class) {
				((Monkey)o).draw(); 
			} 
		}
	}
	
	private boolean addObject(LocatedRectangle newObject) {
		boolean intersection = false;
		
		for (LocatedRectangle m : sceneObjects) {
			intersection = intersection || m.intersects(newObject);
		}
		if (!intersection) {
			sceneObjects.add(newObject);
			return true;
		} else {
			return false;
		}
	}
	
	public void setBlackMonkeys() {
		graphicState = graphicState.setBlackMonkeys();
	}
	
	public void setGreenMonkeys() {
		graphicState = graphicState.setGreenMonkeys();
	}
	
	public void setPinkMonkeys() {
		graphicState = graphicState.setPinkMonkeys();
	}
	
	public void setAllMonkeys() {
		graphicState = graphicState.setAllMonkeys();
	}
	
	public void setNoMonkeys() {
		graphicState = graphicState.setNoMonkeys();
	}
	
	public void generateMonkeys() {
		for (int i = 0; i < 100; i++) {
			int x = RandomNumber.between(0, 1200);
			int y = RandomNumber.between(0, 700);
			int k = RandomNumber.between(1, 2);
			
			LocatedRectangle aMonkey = new Monkey(x, y, k, randomColor());
			addObject(aMonkey);
		} 
	}
	
	public void generateMonkeys(Color color) {
		for (int i = 0; i < 100; i++) {
			int x = RandomNumber.between(0, 1200);
			int y = RandomNumber.between(0, 700);
			int k = RandomNumber.between(1, 2);
			
			LocatedRectangle aMonkey = new Monkey(x, y, k, color);
			addObject(aMonkey);
		} 
	}
	
	public void removeAllObjects() {
		sceneObjects.removeAll(sceneObjects);
	}
	
	public Color randomColor() {
		int k = RandomNumber.between(0, 2);
		
		switch(k) {
		case 0:
			return Color.BLACK;
		case 1:
			return Color.PINK;
		default:
			return Color.GREEN;
		}
	}
	
	/* 
	public void removePinkMonkeys() {
		ArrayList<LocatedRectangle> temp = new ArrayList<>(); // to temp store objects
		
		for (int i = 0; i < sceneObjects.size(); i++) {
			if (((Monkey)sceneObjects.get(i)).getColor() == Color.PINK && sceneObjects.get(i).getClass() == Monkey.class) {
				temp.add(sceneObjects.get(i));
			}
		}
		
		for (LocatedRectangle o : temp) {
			sceneObjects.remove(o);
		}
	} */
	 
}


