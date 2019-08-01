package ch02_ArythmeticAndVariables;

import java.util.*;

public class DivByZero {
	public static void main(String[] args) {
		int x = 15;
		Scanner in = new Scanner(System.in);
		System.out.print("y (int) = ");
		int y = in.nextInt();
		System.out.print("y (double) = ");
		double y1 = in.nextDouble();
		System.out.printf("%d/%d = %d %n", x, y, x / y);
		System.out.printf("%d/%.1f = %.1f %n", x, y1, x / y1);

	}

}