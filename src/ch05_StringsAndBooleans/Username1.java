package ch05_StringsAndBooleans;

import java.util.*;

/**
 * Gjenero username-in duke mare shkronjen e pare te emrit dhe shkronjen e dtyte
 * te mbiemrit dhe vitin e lindjes
 */
public class Username1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Emri: ");
		String emri = in.nextLine();
		System.out.print("Mbiemri: ");
		String mbiemri = in.nextLine();
		System.out.print("Viti i lidjes: ");
		int viti = in.nextInt();
		String username = "" + emri.charAt(0) + mbiemri.charAt(2) + viti;
		System.out.printf("Useri me emrin %s %s i lindur me %d ka username-in: %s%n", emri, mbiemri, viti, username);
	}

}