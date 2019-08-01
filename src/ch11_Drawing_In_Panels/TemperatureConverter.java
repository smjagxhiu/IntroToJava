package ch11_Drawing_In_Panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TemperatureConverter extends JPanel {
	
	private String stringToDraw;
	private int width,height;
	private Font font = new Font("Arial",Font.ITALIC, 28);
	
	
	public TemperatureConverter(double c) {
		width = 800;
		height = 600;
		setString(c);
		JFrame frame = new JFrame("Temp converter");
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.add(this);
		frame.setResizable(false);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.black);
		g.setFont(font);
		int y = (height-font.getSize())/2;
		int stringWidth = g.getFontMetrics().stringWidth(stringToDraw);
		int x = (width - stringWidth)/2;
		g.drawString(stringToDraw, x, y);
	}
	
	public void setString(double c) {
		stringToDraw = String.format(
				"Per %.2f shkalle celsius kemi %.2f shkalle fahrenhit %n", 
				c, celsiusToFahrenheit(c));
		repaint();
	}
	
	public static double celsiusToFahrenheit(double c) {
		return 9.0/5.0 * c + 32;
	}

	public static void main(String[] args) {
		TemperatureConverter tc = new TemperatureConverter(0);
		String tempStr = JOptionPane.showInputDialog("Cnvert temp");
		while ( !tempStr.trim().equalsIgnoreCase("q") ) {
			double c = Double.parseDouble(tempStr);	
			tc.setString(c);
			tempStr = JOptionPane.showInputDialog("Convert Another Temp ");			
		}	
	}
	
	
}
