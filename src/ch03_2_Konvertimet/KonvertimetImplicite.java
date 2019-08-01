package ch03_2_Konvertimet;

public class KonvertimetImplicite {
	public static void main(String[] args) {
		double d = 14.6;
		String s = d + "";
		System.out.println(s);
		char c = 'A';
		s = s + c; // s += c;
		System.out.println(s);
		boolean b = true;
		s = s + " " + b; // s += " " + b;
		System.out.println(s);
		s = s + 7 / 2 + 3 % 5; // s += 7/2+3%5;
		System.out.println(s);
		s = s + " " + (7 / 2 + 3 % 5); // s += (7/2 +3%5);
		System.out.println(s);
	}

}