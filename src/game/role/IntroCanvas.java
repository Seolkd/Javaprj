package game.role;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class IntroCanvas extends Canvas implements KeyListener{

	@Override
	public void paint(Graphics g) {
		Font font = new Font("Gothic", Font.BOLD, 32);
		g.setColor(Color.BLUE);
		g.setFont(font);
		g.drawString("Press any key", 250,400);
		
		addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//캔버스를 전환하는 코드를 작성.
		GameFrame
			.getInstance()
			.change();
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}
	
}
