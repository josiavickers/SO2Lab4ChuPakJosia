package drawingTool.graphicState;

import drawingTool.Scene;

public abstract class State {
	protected Scene scene;
	
	/* I DON'T SEE WHY THIS IS NECESSARY?
	protected static BlackMonkeyState blackMonkeys;
	protected static GreenMonkeyState greenMonkeys;
	protected static PinkMonkeyState pinkMonkeys;
	protected static AllMonkeyState allMonkeys;
	protected static NoMonkeyState noMonkeys; */
	
	public abstract State setBlackMonkeys();
	public abstract State setGreenMonkeys();
	public abstract State setPinkMonkeys();
	public abstract State setAllMonkeys();
	public abstract State setNoMonkeys();
}
