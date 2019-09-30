package game.shooting;

import java.awt.Canvas;
import java.awt.Frame;

import game.role.RoleCanvas;

public class GameFrame extends Frame {
	
	//private Fighter fighter;
	
	private Canvas canvas;
	
	
	public GameFrame() {
		setSize(600,600);

		canvas = new ShootingCanvas();
		this.add(canvas);
		canvas.setFocusable(true);
		canvas.requestFocus();
		addWindowListener(new GameWindowListener());
		//fighter = new Fighter();
		setVisible(true);
	}


}
 
