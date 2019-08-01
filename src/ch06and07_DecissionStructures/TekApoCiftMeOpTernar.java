package ch06and07_DecissionStructures;
import javax.swing.JOptionPane;

public class TekApoCiftMeOpTernar {

	public static void main(String[] args) {
		
		int num = Integer.parseInt( 
				JOptionPane.showInputDialog("Shtype nje numer: "));
		String answer = num % 2 == 1 ? "tek" : "cift";
		JOptionPane.showMessageDialog(null,
				String.format("Numri %d eshte %s", num,answer) );

	}

}
