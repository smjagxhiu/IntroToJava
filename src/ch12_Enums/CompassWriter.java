package ch12_Enums;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Calendar;

import javax.swing.*;

public class CompassWriter extends JPanel {
	
	private Compass2 currentBearing;
	private int width,height;
	private Font font = new Font("Serif",Font.BOLD,16);
	
	public CompassWriter(Compass2 currentBearing) {
		this.currentBearing = currentBearing;
		width = height = 300;
		JFrame f = new JFrame("Compass");
		f.setSize(width, height);
		f.setVisible(true);
		f.add(this);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.black);
		int angle = 90 - currentBearing.grade;
		int leftEdge = 50;
		int top = 50;
		int diameter = 100;
		int xNorth = leftEdge + diameter /2;
		int yNorth = top - font.getSize()/2;
		int xSouth = xNorth;
		int ySouth = top + diameter + font.getSize();
		
		g.setFont(font);
		int strWidth = g.getFontMetrics().stringWidth("W");
		g.setColor(Compass2.NORTH.color);
		g.drawString("N", xNorth, yNorth);
		g.setColor(Compass2.SOUTH.color);
		g.drawString("S", xSouth, ySouth);
		int xWest = leftEdge - strWidth;
		int yWest = top + (diameter)/2;
		int xEast = leftEdge + diameter + strWidth/2;
		int yEast = yWest;
		g.setColor(Compass2.WEST.color);
		g.drawString("W", xWest, yWest);
		g.setColor(Compass2.EAST.color);
		g.drawString("E", xEast, yEast);
		g.setColor(Color.black);
		g.drawOval(leftEdge, top, diameter, diameter);
		g.setColor(currentBearing.color);
		g.fillArc(leftEdge + 5, top + 5 , diameter - 10, diameter-10,
				angle,-6);
	}

	public static void main(String[] args) {
		new CompassWriter(Compass2.NORTH);

	}

}
