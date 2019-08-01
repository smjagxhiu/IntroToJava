package ch11_Drawing_In_Panels;


import javax.swing.*;
public class MyFrame {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("First Frame");
		frame.setVisible(true);
		frame.setSize(800,900);
		MyPanel panel = new MyPanel();
		frame.add(panel);

	}

}
