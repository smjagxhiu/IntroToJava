package ch11_Drawing_In_Panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClockRenderer extends JPanel {
	
	private final int width = 400, height = 400;
	
	public ClockRenderer() {
		JFrame f = new JFrame("Clock Renderer");
		f.setSize(width, height);
		f.setVisible(true);
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		// rrethi me diameter 100px
				// left_edge = 20px
				//top = 50px;
				// akrepi i oeve 10px me i shkurte me trashesi 6px
				// akrepi i oeve 50px me i shkurte me trshesi -8px
		g.setColor(Color.white);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.black);
		//GregorianCalendar c = new GregorianCalendar();
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR);
		int minutes = c.get(Calendar.MINUTE);
		int seconds = c.get(Calendar.SECOND);
		//int hourAngle = 90 - hour * 30;
		int hourAngle = 90 - (int)((hour + (minutes/60.0)) * 30);
		int minuteAngle = 90 - minutes * 6;
		int secondAngle = 90 - seconds * 6;
		int leftEdge = 20;
		int top = 50;
		int diameter = 100;
		g.drawOval(leftEdge, top, diameter, diameter);
		g.setColor(Color.BLUE);
		g.fillArc(leftEdge + 5, top + 5 , diameter - 10, diameter-10,
				minuteAngle,6);
		g.setColor(Color.RED);
		g.fillArc(leftEdge + 25, top + 25 , diameter - 50, diameter-50,
				hourAngle,-8);
		g.setColor(Color.GREEN);
		g.fillArc(leftEdge + 5, top + 5 , diameter - 10, diameter-10,
				secondAngle,5);
		String timeStr = String.format("%02d:%02d:%02d", hour,minutes,seconds);
		g.setColor(Color.black);
		g.setFont(new Font("Arial",Font.BOLD,18));
		g.drawString(timeStr, leftEdge + 10, top + diameter + 30);
		System.out.println(timeStr);
	}
	
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			repaint();
		}
	}

	public static void main(String[] args) {
		ClockRenderer cr = new ClockRenderer();
		cr.run();
	}

}
