package game.role;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class RoleCanvas extends Canvas implements MouseListener, KeyListener {

	private Kid kid;
	private BackGround bg;
	private List<Missile> missile;
//	private ObjectList missile;
	private int cnt;
	private Enermy enermy;

	public RoleCanvas() {
		enermy = new Enermy();
		kid = new Kid();
		bg = new BackGround();
		//missiles = new Missile[100];
		missile = new ArrayList<>();
		cnt = 0;

		addMouseListener(this);
		addKeyListener(this);

		new Thread(() -> {
			while (true) {
				try {
					bg.update();
					kid.update();
//					for (int i = 0; i < 100; i++) {
//						if (missiles[i] != null) {
//							missiles[i].update();
//						}
//					}
//					for(Object o : missile) {
//						((Missile)o).update();
//					
//					}
//					for (int i = 0; i < missile.size(); i++) {
//						(missile.get(i)).update();
						for(Missile m : missile) m.update();
//						((Missile)missile.get(i)).update();
					
					Thread.sleep(17);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				repaint();
			}
		}).start();
	}

	@Override
	public void paint(Graphics g) { // Graphics 도화지는 윈도우거나 비트맵이거나
		Image bufImage = createImage(this.getWidth(), this.getHeight());
		Graphics g2 = bufImage.getGraphics();
		bg.draw(g2, this);
		kid.draw(g2, this);
		enermy.draw(g2, this);
//		for(Object o : missile) {
//			((Missile)o).draw(g2,this);
//		}	
//		for (int i = 0; i < missile.size(); i++) {
//			((Missile)missile.get(i)).draw(g2,this);
//		}
		for (int i = 0; i < missile.size(); i++) {
			Missile m = missile.get(i);
//			Missile m = (Missile)missile.get(i);
			m.draw(g2,this);
		}

//		for (int i = 0; i < 100; i++) {
//			if (missiles[i] != null) {
//				missiles[i].draw(g2, this);
//			}
//		}

		g.drawImage(bufImage, 0, 0, this);

	}
	
	public void update(Graphics g) {
		paint(g);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			kid.move(Direction.LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			kid.move(Direction.RIGHT);
			break;
		case KeyEvent.VK_UP:
			kid.move(Direction.UP);
			break;
		case KeyEvent.VK_DOWN:
			kid.move(Direction.DOWN);
			break;
		case KeyEvent.VK_SPACE:
//			if(cnt<=99)missiles[cnt]  = kid.fire();
//			cnt++;
//			if(cnt>100) cnt = 0;
//			missiles = null;
//			missiles = new Missile[100];
			Missile missiles =kid.fire();
			if(missiles != null)
				missile.add(missiles);
			
			
			break;
		}
		}
	

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			kid.stop(Direction.LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			kid.stop(Direction.RIGHT);
			break;
		case KeyEvent.VK_UP:
			kid.stop(Direction.UP);
			break;
		case KeyEvent.VK_DOWN:
			kid.stop(Direction.DOWN);
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) { }

	@Override
	public void mouseClicked(MouseEvent arg0) {	}

	@Override
	public void mouseEntered(MouseEvent arg0) {	}

	@Override
	public void mouseExited(MouseEvent arg0) { }

	@Override
	public void mousePressed(MouseEvent arg0) {	}

	@Override
	public void mouseReleased(MouseEvent arg0) { }
}
