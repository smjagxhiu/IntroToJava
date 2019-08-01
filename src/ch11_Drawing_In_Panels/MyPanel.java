package ch11_Drawing_In_Panels;


import javax.swing.JPanel;
import java.awt.*;

public class MyPanel  extends JPanel{
	public MyPanel() {
		
	}
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		int width = getWidth();
		int height = getHeight();
		int yOffset = 60;
		g.fillRect(0, 0, width, height);
		g.setColor(Color.red);
		g.drawString("Hello World",30 , yOffset);
		g.setColor(Color.black);
		yOffset += 20;
		g.drawRect(30, yOffset,300,200);
		g.setColor(new Color(170,100,100));
		g.fillRect(30, yOffset,300,200);
		g.setColor(Color.yellow);
		yOffset += 220;
		g.fillOval(30, yOffset, 300, 200);
		yOffset += 220;
		g.setColor(Color.black);
		g.drawLine(30, yOffset, 330, yOffset);
		g.setColor(Color.blue);
		yOffset += 20;
		g.fillArc(30,yOffset,150,150,90,-10);
		yOffset += 160;
		g.fillRoundRect(30, yOffset, 300, 200, 30, 30);
	}
	
	
	
	
	
	

}
