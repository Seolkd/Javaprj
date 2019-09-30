package game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Puzzle {
	
	private int x;
	private int y;
	private int w;
	private int h;
	private int sx;
	private int sy;
	Image img;
	
	public Puzzle () {
		w = 200;
		h = 200;
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/foto9.jpg");
	}

	public void setPos(int i) {
		x = (i % 3) * 200;
		y = (i / 3) * 200;
	}

	public void setSrc(int i) {
		sx = (i % 3) * 200;
		sy = (i / 3) * 200;
		
	}

	public void draw(Graphics g, PuzzleCanvas puzzleCanvas) {
		g.drawImage(img, x, y, x + w, y + h, sx, sy, sx + w, sy + h, puzzleCanvas);
		
	}


}
