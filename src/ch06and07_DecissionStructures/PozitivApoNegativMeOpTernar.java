package ch06and07_DecissionStructures;

import java.util.*;
public class PozitivApoNegativMeOpTernar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Numri: ");
		int num = in.nextInt();
		String answer;
		/*if (num >= 0)
			answer = String.format(
					"Numri %d eshte %s.", num,"pozitiv");
		else answer = String.format("Numri %d eshte %s.", num,"negativ");
		System.out.println(answer);*/
		
		answer = (num >= 0) ? "pozitiv" : "negativ";
		System.out.printf("Numri %d eshte %s.", num,answer);
		
	}

}
