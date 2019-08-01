package ch06and07_DecissionStructures;

import javax.swing.*;

public class GUIInputOutput {

	public static void main(String[] args) {
		
		
		String text = JOptionPane.showInputDialog("Type anything: ");
		System.out.println("You typed: " + text);
		JOptionPane.showMessageDialog(null,"You typed: " + text);
		
		String text2 = JOptionPane.showInputDialog("Type a number: ");
		int num = Integer.parseInt(text2);
		JOptionPane.showMessageDialog(null,
				String.format("You typed the %d number.", num) );
	}

}
