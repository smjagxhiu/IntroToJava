package ch05_StringsAndBooleans;

public class FunksionetEStringjeve {
	public static void main(String[] args) {
		String t = "abc ";
		String u = "ab";
		// Funksioni equals(String other)
		boolean b = t.equals(u); // false
		System.out.println(b);
		char c1 = u.charAt(1); // b
		char c2 = t.charAt(1); // b
		// Krahasimi 'A' == 'a' => false
		boolean b2 = (c1 == c2); // true
		System.out.println(b2);
		int i1 = u.length();
		int i2 = t.length();
		boolean b3 = (i1 == i2);// false
		System.out.println(i2 - i1);
		System.out.println(b3);
		System.out.println(u + 'c'); // abc
		String t2 = t.trim(); // "abc"
		System.out.println(t + 'd'); // abc d
		System.out.println(t2 + 'd'); // abcd
		System.out.println(t.toUpperCase());
		System.out.println(t.toLowerCase());
		System.out.println(t);// "abc "

	}

}