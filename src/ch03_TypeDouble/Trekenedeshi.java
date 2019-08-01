package ch03_TypeDouble;

import java.util.*;

public class Trekenedeshi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c, h, p, s;
		System.out.print("Brinja a: ");
		a = in.nextDouble();
		System.out.print("Brinja b: ");
		b = in.nextDouble();
		System.out.print("Brinja c: ");
		c = in.nextDouble();
		System.out.print("Lartesia h: ");
		h = in.nextDouble();
		p = a + b + c;
		s = b * h / 2;
		System.out.printf("Perimetri eshte %.2f dhe syprina eshte %.3f %n", p, s);
	}
}