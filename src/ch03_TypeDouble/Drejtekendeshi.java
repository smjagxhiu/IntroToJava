package ch03_TypeDouble;

import java.util.*;

public class Drejtekendeshi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Brinja a(meter): ");
		double a = in.nextDouble();
		System.out.print("Brinja b (meter): ");
		double b = in.nextDouble();
		double p = 2 * (a + b);
		double s = a * b;
		double d = Math.sqrt(a * a + b * b);
		System.out.printf("Diagonalja = %.2f, perimetri = %.2f, syprina = %.2f%n", d, p, s);
	}

}
