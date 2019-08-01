package ch06and07_DecissionStructures;
import javax.swing.JOptionPane;

public class EkKuadratikMeOpTernar {

	public static void main(String[] args) {
		double a = Double.parseDouble( 
				JOptionPane.showInputDialog("Koeficienti a: "));
		double b = Double.parseDouble( 
				JOptionPane.showInputDialog("Koeficienti b: "));
		double c = Double.parseDouble( 
				JOptionPane.showInputDialog("Koeficienti c: "));
		double D = b * b - 4 * a * c;
		
		 String zgjidhjet = D > 0 ?  String.format("%.2f %.2f", 
				 (-b + Math.sqrt(D)) / (2 * a) , (-b - Math.sqrt(D)) / (2 * a))  :
					 D == 0 ? -b/(2*a) +"" : "nuk ka zgjidhje.";
		 
		 JOptionPane.showMessageDialog(null,"Zgjidhjet e Ek. " + zgjidhjet);
	}

}
