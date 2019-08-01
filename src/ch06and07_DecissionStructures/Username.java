package ch06and07_DecissionStructures;

import java.util.*;

public class Username {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Emri: ");
		String emri = in.nextLine();
		System.out.print("Mbiemri: ");
		String mbiemri = in.nextLine();
		char e = emri.charAt(0);
		int n = mbiemri.length();
		// String m = mbiemri.substring(0,5); 5 shkronjat e para
		String m = mbiemri;
		if (n >= 5)
			m = mbiemri.substring(n - 5, n);
		// else m = mbiemri;
		String username = e + m;
		System.out.println("Username i gjeneruar eshte: " + username);

	}// end of main()
}// end of class