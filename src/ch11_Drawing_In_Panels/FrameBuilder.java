package ch11_Drawing_In_Panels;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FrameBuilder {
	
	public static JFrame build(int width, int height,String title) {
		JFrame f = new JFrame();
		f.setTitle(title);
		Dimension frameDimensions = 
				new Dimension(width,height);
		f.setSize(frameDimensions);
		f.setVisible(true);
		f.setResizable(false);
		Dimension screenDimensions = Toolkit.getDefaultToolkit().getScreenSize();
		Point p = new Point( (screenDimensions.width - width)/2, 
				(screenDimensions.height - height)/2 );
		f.setLocation(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return f;
	}
}