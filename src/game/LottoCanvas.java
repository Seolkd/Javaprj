package game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class LottoCanvas extends Canvas {
	static int[]lotto = new int[] {1,3,5,9,10,12};
	
	public LottoCanvas() {
		
	}

	@Override
	public void paint(Graphics g) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image img = tk.getImage("res/cards.png");

		for (int i = 0; i < 6; i++) {
			int x = (i*62);
			int y = 0;
			int w = 62;
			int h = 82;
			int sx = (lotto[i] * 62)-62;
			g.drawImage(img, x, y, x + w, y + h, 
					sx, y, sx + w, y + h, this);
		}

	}
}
