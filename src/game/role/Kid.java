package game.role;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Kid {
	private int x;
	private int y;
	
	private int vx;
	private int vy;
	
	private int w;
	private int h;	
	
	private static final int OFFSET_LEFT;
	private static final int OFFSET_TOP;
	
	private Image img;
	private int imgIndex;
	
	private int timeForReady = 0;
	
	static {
		OFFSET_LEFT=32;
		OFFSET_TOP=32;
	}
		
	public Kid() {
		x=320;
		y=600;
		w=h=64;
		vx=0;
		vy=0;
		
		Toolkit tk = Toolkit.getDefaultToolkit(); //이미지 그리는 api
		img = tk.getImage("res/flight.png"); // 
		imgIndex = 3;
	}


	public void update() {
	x+=vx;
	y+=vy;
	if(timeForReady>0)
		timeForReady--;
//	float w = dx-this.x;
//	float h = dy-this.y;
//	float d = (float)Math.sqrt(w*w+h*h);
//	vx = (int) ((w/d)*10);
//	vy = (int) ((h/d)*10);
	}


	public void draw(Graphics g, RoleCanvas roleCanvas) {
		int sx = imgIndex*w;
		g.drawImage(img, x-OFFSET_LEFT,
					y-OFFSET_TOP,
					x+w-OFFSET_LEFT,
					y+h-OFFSET_TOP,
					0+sx, 0, 0+w+sx, h, roleCanvas);
	//	g.drawRect(x-32,y-32,w,h);
		
	}


	public void move(Direction direction) {
		switch(direction) {
		case LEFT:
			//만약 이미지 인덱스가 ?값이상이면
			if(imgIndex>0) {
				imgIndex--;
				vx--;
				//imgindex=0 && imgDelayCount%3==0;
			}	
			break;
		case RIGHT:
			if(imgIndex<6) {
				imgIndex++;
				vx++;
			}	
			break;
		case UP:
			if(vy>-3) vy--;
			break;
		case DOWN:
			if(vy<3) vy++;
			break;
		}
		
	}


	
	public void stop(Direction direction) {
		switch(direction) {
		case LEFT:
			
		break;
		case RIGHT:
			
		break;
		case UP:
			
		break;
		case DOWN:
			
		break;
	}

	}


	public Missile fire() {
		if(timeForReady == 0) {
		Missile missiles = new Missile(x,y);
		timeForReady = 15;
		return missiles;
	}
		return null;
}
}
