package game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

public class PuzzleCanvas2 extends Canvas {
	private Puzzle1 puzzle;

	public PuzzleCanvas2() {
		PuzzleContext.setCanvas(this);
		puzzle = new Puzzle1(2);
	}

	@Override
	public void paint(Graphics g) {

		puzzle.paint(g);
	}
}
