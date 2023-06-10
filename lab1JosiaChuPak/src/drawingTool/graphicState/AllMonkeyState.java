package drawingTool.graphicState;

import java.awt.Color;

import drawingTool.Scene;

public class AllMonkeyState extends State{
	private static AllMonkeyState instance;
	
	private AllMonkeyState(Scene scene) {
		this.scene = scene;
		//allMonkeys = this; I DON'T SEE WHY THIS IS NECESSARY?
	}

	// Singleton instantiates the sole instance of this state
	public static AllMonkeyState getInstance(Scene scene) {
		if (instance == null) {
			instance = new AllMonkeyState(scene);
		}
		return instance;
	}
	
	@Override
	public State setBlackMonkeys() {
		scene.removeAllObjects();
		scene.generateMonkeys(Color.BLACK);
		return BlackMonkeyState.getInstance(scene); // returns the instance of the BlackMonkeyState
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
