package ch06and07_DecissionStructures;

import java.util.*;

public class PozitivApoNegativ {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Numri: ");
		int num = in.nextInt();
		if (num >= 0)
			System.out.printf("Numri %d eshte %s%n", num, "pozitiv");
		else
			System.out.printf("Numri %d eshte %s%n", num, "negativ");
	}
}