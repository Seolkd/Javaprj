package game.shooting;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Fighter {
	
	private int x;
	private int y;
	private Image img;
	private int vx;
	private int vy;
	private int dx;
	private int dy;
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x +=x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y +=y;
	}


	public Fighter() {
		x=100;
		y=100;
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/fighter.png");

	}

	public void draw(Graphics g, ShootingCanvas shootingCanvas) {
	
		g.drawImage(img, x, y, shootingCanvas);
	}
	public void move(int x, int y) {
		dx = x;
		dy = y;
//		vx = (dx-this.x)/15;
//		vy = (dy-this.y)/15;
		float w = dx-this.x;
		float h = dy-this.y;
		float d = (float)Math.sqrt(w*w+h*h);
		vx = (int) ((w/d)*10);
		vy = (int) ((h/d)*10);
//		this.x = dx;
//		this.y = dy;
	}
	public void update() {
		x+=vx;
		y+=vy;
		if ((dx+30)>=x && (dy+30)>=y && (dx-30)<=x && (dy-30)<=y ) {
			vx=0;
			vy=0;
		}
	}
}
