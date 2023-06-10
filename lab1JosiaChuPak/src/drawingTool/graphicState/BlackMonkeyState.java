package drawingTool.graphicState;

import java.awt.Color;

import drawingTool.Scene;

public class BlackMonkeyState extends State{
	private static BlackMonkeyState instance;
	
	private BlackMonkeyState(Scene scene) {
		this.scene = scene;
		//blackMonkeys = this;
	}

	public static BlackMonkeyState getInstance(Scene scene) {
		if (instance == null) {
			instance = new BlackMonkeyState(scene);
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
