package ch06and07_DecissionStructures;
import javax.swing.JOptionPane;

public class Username2MeOpTernar {

	public static void main(String[] args) {
		
		
		String emriDheMbiemri = JOptionPane.showInputDialog(
				"Shtype emrin dhe mbiemrin: ");
		int n = emriDheMbiemri.length();
		int indexOfSpace = emriDheMbiemri.indexOf(" ");
		System.out.println(indexOfSpace);
		String mbiemri = emriDheMbiemri.substring(indexOfSpace+1,n).trim();
		n = mbiemri.length();
		String username = (n > 5) ? emriDheMbiemri.charAt(0) 
				+ mbiemri.substring(n - 5, n) 
			: emriDheMbiemri.charAt(0) + mbiemri;
		JOptionPane.showMessageDialog(null,"Username eshte "+ username);

	}

}
