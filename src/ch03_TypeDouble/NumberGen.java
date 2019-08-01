package ch03_TypeDouble;

import java.util.*;

public class NumberGen {
	public static void main(String[] args) {
		System.out.print("Max: ");
		Scanner in = new Scanner(System.in);
		int max = in.nextInt();
		// Math.random() kthen nje numer double te rastesishem nga 0 deri 1
		int random = (int) (Math.random() * max); // [0,max-1]
		System.out.printf("Numri i gjenruar nga %d deri %d eshte %d%n", 0, max - 1, random);
		random = (int) Math.round(Math.random() * max); // [0.max]
		System.out.printf("Numri i gjenruar nga %d deri %d eshte %d%n", 0, max, random);
		System.out.print("Min: ");
		int min = in.nextInt();
		random = min + (int) (Math.random() * (max - min));
		System.out.printf("Numri i gjenruar nga %d deri %d eshte %d%n", min, max, random);
	}
}