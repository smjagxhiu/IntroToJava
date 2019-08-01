package ch06and07_DecissionStructures;

import java.util.*;

public class OretNeSekonda {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Oret: ");
		int oret = in.nextInt();
		if (oret >= 0) {
			int sekondat = oret * 60 * 60;
			System.out.printf("%d ore bejne %d sekonda.%n", oret, sekondat);
		} // end of if
		else
			System.out.printf("Oret %d jane negative. Duhet te jene pozitive.%n", oret);
		// DSH: Programi lexon nese user dershiron oret te konvertoj ne sekonda
		// apo minuta
	}// end of main()
}// end of class