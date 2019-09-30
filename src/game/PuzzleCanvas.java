package game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

public class PuzzleCanvas extends Canvas {
	private int[] pos = new int[9];
	private Puzzle[] puzzles;

	public PuzzleCanvas() {

		for (int i = 0; i < pos.length; i++)
			pos[i] = i;
		puzzles = new Puzzle[9];
		
		Random rand = new Random();

		int temp;

		for (int i = 0; i < 10; i++) {
			int p1 = rand.nextInt(9);
			int p2 = rand.nextInt(9);
			temp = pos[p1];
			pos[p1] = pos[p2];
			pos[p2] = temp;
		}
		for (int i = 0; i < pos.length; i++)
			System.out.printf("[%d]", pos[i]);
		
		for (int i = 0; i < 9; i++) {
			Puzzle puzzle = new Puzzle();
			
			puzzle.setPos(i);
			
			puzzle.setSrc(pos[i]);
			
			puzzles[i] = puzzle;
		}
	}

	@Override
	public void paint(Graphics g) {


		
		for (int i = 0; i < 9; i++) {
			puzzles[i].draw(g, this);
			

		}

	}
}
