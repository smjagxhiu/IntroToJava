package ch03_TypeDouble;

import java.util.*;

public class FahrenheitNeCelsius {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Grade Fahrenheit: ");
		double f = in.nextDouble();
		double c = 5.0 / 9 * (f - 32);
		System.out.printf("Per %.2f grade fahrenheit kemi %.2f grade celsius%n", f, c);
	}
}