package game.role;

import java.awt.Canvas;
import java.awt.Frame;
//singletone
//1.전역적으로 아무곳에서나 쉽게 이 객체를 사용할 수 있어야 한다.
//2.절대로 이 객체는 두 번 이상 생성되어서는 안된다.

public class GameFrame extends Frame {
	private Canvas introCanvas;
	private Canvas canvas;

	private static GameFrame frame;
	public static GameFrame getInstance() {
		
		if(frame==null)
			frame = new GameFrame();
		
		return frame;
	}
	
	public void change() {
		remove(introCanvas);
		add(canvas);
		setVisible(true);
		canvas.setFocusable(true);
		canvas.requestFocus();
	}
	
	private GameFrame() {
		setSize(720,800);
		
		canvas = new RoleCanvas();
		introCanvas = new IntroCanvas();
		this.add(introCanvas);
		//this.add(canvas);
		introCanvas.setFocusable(true);
		introCanvas.requestFocus();
		addWindowListener(new GameWindowListener());
		setVisible(true);
		}
}
