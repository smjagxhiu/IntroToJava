package ch05_StringsAndBooleans;

import java.util.*;

public class OpRelacional {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Numri 1: ");
		double num1 = in.nextDouble();
		System.out.print("Numri 2: ");
		double num2 = in.nextDouble();
		System.out.printf("%.2f %s %.2f = %b %n", num1, "==", num2, num1 == num2);
		System.out.printf("%.2f %s %.2f = %b %n", num1, "!=", num2, num1 != num2);
		System.out.printf("%.2f %c %.2f = %b %n", num1, '<', num2, num1 < num2);
		System.out.printf("%.2f %c %.2f = %b %n", num1, '>', num2, num1 > num2);
		System.out.printf("%.2f %s %.2f = %b %n", num1, "<=", num2, num1 <= num2);
		System.out.printf("%.2f %s %.2f = %b %n", num1, ">=", num2, num1 >= num2);
	}
}