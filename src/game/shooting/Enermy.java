package game.shooting;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Enermy {
		private int ex;
		private int ey;
		private Image eImg;
	
	
	
	public Enermy() {
		ex=0;
		ey=0;
		Toolkit tk = Toolkit.getDefaultToolkit();
		eImg = tk.getImage("res/enemy.png");

	}
	public void draw(Graphics g, ShootingCanvas shootingCanvas) {
		
		g.drawImage(eImg, ex, ey, shootingCanvas);
	}
}
