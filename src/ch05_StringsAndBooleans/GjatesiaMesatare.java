package ch05_StringsAndBooleans;

import java.util.*;

/** Gjeje gjatesine mesatare te 4 stringjeve */
public class GjatesiaMesatare {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("String 1: ");
		String s1 = in.nextLine();
		System.out.print("String 2: ");
		String s2 = in.nextLine();
		System.out.print("String 3: ");
		String s3 = in.nextLine();
		System.out.print("String 4: ");
		String s4 = in.nextLine();
		int total = s1.length() + s2.length() + s3.length() + s4.length();
		System.out.printf("Per stringjet %s, %s, %s, %s; gjatesia mesatare eshte %.2f karaktere %n", s1, s2, s3, s4,
				total / 4.0);
	}
}