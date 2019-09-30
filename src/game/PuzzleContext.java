package game;

public class PuzzleContext {
	private static PuzzleCanvas2 canvas;

	public static PuzzleCanvas2 getCanvas() {
		return canvas;
	}

	public static void setCanvas(PuzzleCanvas2 canvas) {
		if(PuzzleContext.canvas==null)
		PuzzleContext.canvas = canvas;
	}
	
	
}
