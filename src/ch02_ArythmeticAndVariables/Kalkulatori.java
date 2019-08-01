package ch02_ArythmeticAndVariables;

import java.util.*;

public class Kalkulatori {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type first number: ");
		int n1 = in.nextInt();
		System.out.print("Type second number: ");
		int n2 = in.nextInt();
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2)); // provo pa kllapa
		System.out.printf("%d - %d = %d%n", n1, n2, n1 - n2);
		System.out.printf("%d * %d = %d %n", n1, n2, n1 * n2);
		System.out.printf("%d / %d = %d %n", n1, n2, n1 / n2);
		System.out.printf("%d %% %d = %d %n", n1, n2, n1 % n2);
	}
}