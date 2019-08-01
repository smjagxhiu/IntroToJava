package ch03_TypeDouble;

import java.util.*;

public class BeriTima {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Sa euro? ");// prompt
		int euro = in.nextInt();
		System.out.print("Sa cent? ");
		int cent = in.nextInt();
		int parate = euro * 100 + cent;
		System.out.printf("50-centeshe = %d%n", parate / 50);
		parate = parate % 50;
		// parate %= 50;
		System.out.printf("20 centeshe = %d%n", parate / 20);
		parate = parate % 20;
		System.out.printf("10 centeshe = %d%n", parate / 10);
		parate = parate % 10;
		System.out.printf("5 centeshe = %d%n", parate / 5);
		parate = parate % 5;
		System.out.printf("qindarka = %d%n", parate);
	}

}