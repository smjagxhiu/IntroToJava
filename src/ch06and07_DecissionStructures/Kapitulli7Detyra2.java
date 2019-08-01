package ch06and07_DecissionStructures;

public class Kapitulli7Detyra2 {

	public static void main(String[] args) {

		int x = 9, y = 11;
		// a)
		if (x < 10) {
			if (y > 10) {
				System.out.println("*****");
			}
		} else {
			System.out.println("#####");
			System.out.println("$$$$$");
		}

		System.out.println("\n\n\n");

		// b)
		if (x < 10) {
			if (y > 10) {
				System.out.println("*****");
			}
			else {
				System.out.println("#####");
			}
		}
		System.out.println("$$$$$");

	}

}
