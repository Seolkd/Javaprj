package game.shooting;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ShootingCanvas extends Canvas implements MouseListener, KeyListener {
	private Fighter fighter;
	private Enermy enermy;

//	private int x;
//	private int y;
//	private Image img;
//	private int xEnmy;
//	private int yEnmy;
//	private Image imgEnmy;
	public ShootingCanvas() {
		addMouseListener(this);
		addKeyListener(this);
		fighter = new Fighter();
		enermy = new Enermy();
		
		new Thread(()-> {
			while(true) {
				try {
					fighter.update();
					Thread.sleep(17);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
			repaint();
			}
		}).start();
	//	x=100;
	//	y=100;
	//	Toolkit tk = Toolkit.getDefaultToolkit();
	//	img = tk.getImage("res/fighter.png");
	//	imgEnmy = tk.getImage("res/enemy.png");
	}

	@Override
	public void paint(Graphics g) {

		fighter.draw(g, this);
		enermy.draw(g, this);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// System.out.printf("(%d,%d)\n",e.getX(),e.getY());
		fighter.move(e.getX(), e.getY());
//		fighter.setX(e.getX());
//		fighter.setY(e.getY());
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {

		switch (e.getKeyCode()) {
		case 37:
			fighter.setX(-3);
			break;
		case 38:
			fighter.setY(-3);
			break;
		case 39:
			fighter.setX(+3);
			break;
		case 40:
			fighter.setY(+3);
			break;
		}

		repaint();

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
