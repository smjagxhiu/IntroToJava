package ch11_Drawing_In_Panels;


import javax.swing.*;
import java.awt.*;
public class XDrawer extends JPanel{
	
	
	
	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		g.setColor(Color.white);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.black);
		g.drawLine(0, 0, width, height);
		g.drawLine(width, 0, 0, height);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Drawing X");
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setLocation(300, 300);
		frame.add(new XDrawer());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
