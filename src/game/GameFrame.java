package game;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class GameFrame extends Frame {
	
	//private Fighter fighter;
	
	private Canvas canvas;
	
	
	public GameFrame() {
		setSize(600,600);
		//canvas = new GameCanvas();
//		canvas = new PuzzleCanvas();
		canvas = new PuzzleCanvas();
		this.add(canvas);
		//fighter = new Fighter();
		setVisible(true);
	}


}
 
