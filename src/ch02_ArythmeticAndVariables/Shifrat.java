package ch02_ArythmeticAndVariables;

import java.util.*;

/**
 * Njenumer 4 shifror psh 4321 ndaje me hapsira 4 3 2 1 Perdore tipin int
 */
public class Shifrat {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Numri 4 shifror: ");
		int num = in.nextInt(); // 4321
		int s1 = num / 1000; // 4
		num = num % 1000; // 321
		int s2 = num / 100; // 3
		num = num % 100; // 21
		int s3 = num / 10; // 2
		num = num % 10; // 1
		System.out.printf("%d %d %d %d %n", s1, s2, s3, num);

	}

}