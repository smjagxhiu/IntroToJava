package ch03_TypeDouble;

import java.util.*;

public class CelsiusNeFahrenheit {
	public static void main(String[] args) {
		System.out.print("Grade Celsius: ");
		Scanner in = new Scanner(System.in);
		double c = in.nextDouble();
		double f = 9.0 / 5 * c + 32;
		System.out.printf("Per %.2f grade celsius kemi %.2f grade fahrenheit", c, f);
	}
}
