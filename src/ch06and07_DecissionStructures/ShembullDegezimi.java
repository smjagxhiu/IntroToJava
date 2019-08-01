package ch06and07_DecissionStructures;

import java.util.*;

public class ShembullDegezimi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Piket: ");
		int piket = in.nextInt();
		System.out.printf("Filan Fisteku ka %d pike %n ", piket);
		if (piket > 50) {
			System.out.println("Filan Fisteku ka kaluar provimin.");
		}
		System.out.println("Programi perfundoj.");

	}
}