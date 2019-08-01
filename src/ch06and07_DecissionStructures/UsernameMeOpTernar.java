package ch06and07_DecissionStructures;
import javax.swing.JOptionPane;

public class UsernameMeOpTernar {

	public static void main(String[] args) {
		
		
		String emri = JOptionPane.showInputDialog("Shtype emrin: ");
		String mbiemri = JOptionPane.showInputDialog("Shtype mbiemrin: ");
		int n = mbiemri.length();
		String username = (n > 5) ? emri.charAt(0) + mbiemri.substring(n - 5, n) 
				: emri.charAt(0) + mbiemri;
		JOptionPane.showMessageDialog(null,"Username eshte "+ username);
	}

}
