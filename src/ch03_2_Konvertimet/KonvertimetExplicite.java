package ch03_2_Konvertimet;

import java.util.*;

public class KonvertimetExplicite {
	public static void main(String[] args) {
		System.out.print("Integer i: ");
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		System.out.print("Double d: ");
		double d = in.nextDouble();
		byte b = (byte) i;
		System.out.println("Byte b : " + b);
		b = (byte) d;
		System.out.println("Byte b : " + b);

		b = (byte) 178;
		System.out.println("Byte b : " + b);

		i = 10;
		char c = 'A';
		char c2 = (char) (i + c);
		System.out.println("Character c2 = " + c2);

		String s1 = "32456";
		int i2 = Integer.parseInt(s1);
		String s2 = "34.567";
		double d2 = Double.parseDouble(s2);
		System.out.println(s1 + s2);
		System.out.println(i2 + d2);
		String s3 = "1234a";
		// i2 = Integer.parseInt(s3); Exception = Gabim gjate ekzekutimit

	}
}