package game.role;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Missile {
	private int x;
	private int y;
	
	private static final int OFFSET_LEFT;
	private static final int OFFSET_TOP;
	private static final int OFFSET_POS;
	

	private double vy;
	
	private Image img;
	static {
		OFFSET_LEFT=10;
		OFFSET_TOP=20;
		OFFSET_POS=40;
	}
	public Missile(int x, int y) {//생성자로 넘겨받는 값을 대입하라
		this.x=x;
		this.y=y-OFFSET_POS;
		vy=0;
		Toolkit tk = Toolkit.getDefaultToolkit(); 
		img = tk.getImage("res/missile.png");
		
	}

	public void draw(Graphics g, RoleCanvas roleCanvas) {
		g.drawImage(img,x-OFFSET_LEFT,y-OFFSET_LEFT,roleCanvas);
		//g.drawRect(x-10,y-20,20,40);
	}
	public void update() {
		vy=vy+0.3;
		y= (int)(y-vy);
	}


}
