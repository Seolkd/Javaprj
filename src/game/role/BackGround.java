package game.role;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class BackGround {
	private int x;
	private int y;
	private int y2;
	private Image img;
	
	public BackGround() {
		x=0;
		y=0;
		Toolkit tk = Toolkit.getDefaultToolkit(); //이미지 그리는 api
		img = tk.getImage("res/space.jpg"); // 
		
	}

	public void draw(Graphics g, RoleCanvas roleCanvas) {
		y2=y-1200;
		g.drawImage(img, x,y,(x+720),(y+1200),0,0,360,1200,roleCanvas);
		g.drawImage(img, x,y2,(x+720),(y2+1200),0,0,360,1200,roleCanvas);
		
		
		
	}

	public void update() {
	//y의값이 1200이 되면 y를 0으로 보낸다.
		if(y>1200) { y=0;}
		y++;
	//y2의 값이 1200이 되면 y2를 0으로 보낸다.
		if(y2>1200) { y2=0;}
		y2++;
	}
}
