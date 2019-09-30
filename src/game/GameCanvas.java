package game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class GameCanvas extends Canvas {
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image img = tk.getImage("res/foto9.jpg");
		{
			int x = 0;
			int y = 0;
			int w = 200;
			int h = 200;
			int sx = 0;
			int sy = 0;
			g.drawImage(img, x,y,x+w,y+h,
					sx,sy,sx+w,sy+h, this);
			}
			{
			int x = 0+200;
			int y = 0;
			int w = 200;
			int h = 200;
			int sx = 0;
			int sy = 0+200;
			g.drawImage(img, x,y,x+w,y+h,
					sx,sy,sx+w,sy+h,this);
			}
			{
			int x = 0;
			int y = 200;
			int w = 200;
			int h = 200;
			int sx = 200;
			int sy = 0;
			g.drawImage(img, x,y,x+w,y+h,
					sx,sy,sx+w,sy+h, this);
			}
			{
			int x = 200;
			int y = 200;
			int w = 200;
			int h = 200;
			int sx = 200;
			int sy = 200;
			g.drawImage(img, x,y,x+w,y+h,
					sx,sy,sx+w,sy+h, this);
			}

	}
}
