package ch03_TypeDouble;

import java.util.*;

public class Sfera {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Rrezja: ");
		double r = in.nextDouble();
		in.close();
		double A = Math.PI * Math.pow(r, 2);
		double V = 4.0 / 3 * Math.PI * Math.pow(r, 3);
		System.out.printf("Siperfaqja eshte %.3f dhe vellimi eshte %.2f", A, V);
	}

}