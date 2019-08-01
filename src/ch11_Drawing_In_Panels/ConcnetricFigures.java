package ch11_Drawing_In_Panels;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConcnetricFigures extends JPanel {
	
	public static final int BOX = 0;
	public static final int RINGS = 1;
	
	private int width,height, size, numberOfRep;
	private Color c = Color.black;
	private int mode;
	
	public ConcnetricFigures(int mode,int size, int repetions) {
		if (mode == RINGS)
			this.mode = mode;
		else this.mode = BOX;
		if (size < 400)
			this.size = 400;
		else this.size = size;
		if (repetions < 4)
			numberOfRep = 4;
		else numberOfRep = repetions;
		width = height = size + 100;
		JFrame f = FrameBuilder.build(width,height,"Bulls Eye");
		f.add(this);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, width, height);
		int xOffset = (width - size) / 2;
		int yOffset = (height - size) / 2;
		for (int i = 0; i < numberOfRep; i++) {
			paintFigure(g,i,xOffset,yOffset,30);
		}
	}
	
	private void paintFigure(Graphics g, int i,int x, int y, 
			int diff) {
		c = c.equals(Color.black) ? Color.red : Color.black;
		g.setColor(c);
		x += diff * i;
		y += diff * i;
		int w = size - (diff * 2 * i);
		int h = size - (diff * 2 * i);
		if (mode == BOX)
			g.fillRect( x, y, w, h);
		else g.fillOval( x, y, w, h);
	}

	public static void main(String[] args) {
		String message = String.format(		
				"Type %d for box, or %d for rings",
				ConcnetricFigures.BOX, ConcnetricFigures.RINGS);
		int mode = Integer.parseInt(JOptionPane.showInputDialog(message));
		new ConcnetricFigures(mode,500, 9);

	}

}
