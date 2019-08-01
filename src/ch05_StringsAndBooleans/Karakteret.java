package ch05_StringsAndBooleans;

public class Karakteret {
	public static void main(String[] args) {
		int i = 10;
		char ch = 65;
		char cH = 'B';
		char k1 = ch++; // k1 = 'A', ch = 'B'
		char k2 = ++cH; // cH = 'C', k2 = 'C'
		System.out.println(i + "i"); // 10i
		System.out.println("CH" + ch + cH);// CHBC
		System.out.println(k1); // A
		System.out.println(ch + i); // 76
		char k3 = (char) (i + cH);
		System.out.println(k3);
		int j = ch - i;
		System.out.println(j);
		// char is signed
		// char k4 = -15; nuk kompajlohet

	}
}