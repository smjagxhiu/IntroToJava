package ch06and07_DecissionStructures;
import java.util.Scanner;

// Me cka fillon karakteri i pare i stringut: shkronje te madhe, vogel, numer apo karakter tjeter.
public class FirstCharacter {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("String: ");
		String line = in.nextLine().trim();
		char first = line.charAt(0);
		// char first = in.nextLine().trim().charAt(0);
		if (first >= 65 && first <= 90)
			System.out.println("Stringu fillon me shkronje te madhe. ");
		else if (first >= 97 && first <= 122)
			System.out.println("Stringu fillon me shkronje te vogel");
		else if (first >= 48 && first <= 57)
			System.out.println("Stringu fillon me shifer");
		else
			System.out.println("Stringu fillon me ndonje karakter tjeter.");

		/*
		 * if (first >= 65) { if (first <= 90)
		 * System.out.println("Stringu fillon me shkronje te madhe. "); } else if (first
		 * >= 97) { if (first <= 122)
		 * System.out.println("Stringu fillon me shkronje te vogel"); }...
		 */
	}

}
