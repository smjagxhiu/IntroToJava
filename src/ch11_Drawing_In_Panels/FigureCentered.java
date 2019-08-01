package ch11_Drawing_In_Panels;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FigureCentered extends JPanel {
	
	private int rectWidth;
	private int rectHeight;
	private int width,height;
	private int diameter;
	
	public FigureCentered(int width, int height) {
		this.width = width;
		this.height = height;
		this.rectWidth = width / 2;
		this.rectHeight = height / 2;
		this.diameter = (int) (rectWidth * 0.4);
		JFrame frame = new JFrame("Figure Centered");
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		width = getWidth();
		height = getHeight();
		this.rectWidth = width / 2;
		this.rectHeight = height / 2;
		this.diameter = (int) (rectWidth * 0.4);
		g.fillRect(0,0,width, height);
		g.setColor(Color.orange);
		int xRect = (width - rectWidth) / 2; 
		int yRect = (height - rectHeight) / 2;
		g.drawRect(xRect,yRect,rectWidth,rectHeight);
		int xOval = xRect + rectWidth - diameter;
		int yOval = yRect + rectHeight - diameter;
		g.setColor(Color.red);
		g.fillOval(xOval,yOval,diameter,diameter);
	}

	public static void main(String[] args) {
		new FigureCentered(600,400);
	}

}
