package ch03_TypeDouble;

import java.util.*;

//import java.util.Scanner;
public class EkKuadratik {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Koeficienti a: ");
		int a = in.nextInt();
		System.out.print("Koeficienti b: ");
		int b = in.nextInt();
		System.out.print("Koeficienti c: ");
		int c = in.nextInt();
		double d = b * b - 4 * a * c;
		double x1 = (-b + Math.sqrt(d)) / (2 * a);
		double x2 = (-b - Math.sqrt(d)) / (2 * a);
		System.out.printf("x1 = %.2f dhe x2 = %.2f %n", x1, x2);
		in.close();

	}

}