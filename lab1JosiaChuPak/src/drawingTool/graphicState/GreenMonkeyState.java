package drawingTool.graphicState;

import java.awt.Color;

import drawingTool.Scene;

public class GreenMonkeyState extends State{
	private static GreenMonkeyState instance;
	
	private GreenMonkeyState(Scene scene) {
		this.scene = scene;
		//greenMonkeys = this;
	}

	public static GreenMonkeyState getInstance(Scene scene) {
		if (instance == null) {
			instance = new GreenMonkeyState(scene);
		}
		return instance;
	}
	
	@Override
	public State setBlackMonkeys() {
		scene.removeAllObjects();
		scene.generateMonkeys(Color.BLACK);
		return BlackMonkeyState.getInstance(scene);
	}

	@Override
	public State setGreenMonkeys() {
		scene.removeAllObjects();
		scene.generateMonkeys(Color.GREEN);
		return GreenMonkeyState.getInstance(scene);
	}

	@Override
	public State setPinkMonkeys() {
		scene.removeAllObjects();
		scene.generateMonkeys(Color.PINK);
		return PinkMonkeyState.getInstance(scene);
	}

	@Override
	public State setAllMonkeys() {
		scene.removeAllObjects();
		scene.generateMonkeys();
		return AllMonkeyState.getInstance(scene);
	}

	@Override
	public State setNoMonkeys() {
		scene.removeAllObjects();
		return NoMonkeyState.getInstance(scene);
	}
}
