package ch03_TypeDouble;

public class KlasaMath {
	public static void main(String[] args) {
		double x = 2.4;
		double y = 4;
		System.out.printf("sqrt(%.1f) = %.2f %n", x, Math.sqrt(x));
		System.out.printf("%.1f ^ %.1f = %.2f %n ", x, y, Math.pow(x, y));
		System.out.printf("log10(%.1f) = %.2f %n", x, Math.log10(x));
		System.out.printf("Round(%.1f) = %d %n", x, Math.round(x));
		System.out.printf("Floor(%.1f) = %.1f%n", x, Math.floor(x));
		System.out.printf("Ceil(%.1f) = %.1f%n", x, Math.ceil(x));
		System.out.printf("Random number between 0 and 1: %.6f %n", Math.random());
		System.out.printf("PI = %.7f %n", Math.PI);
		System.out.printf("e = %.7f %n", Math.E);

	}

}