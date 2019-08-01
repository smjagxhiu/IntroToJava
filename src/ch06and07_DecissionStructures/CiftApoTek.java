package ch06and07_DecissionStructures;

import java.util.*;

public class CiftApoTek {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Numri: ");
		int num = in.nextInt();
		if (num % 2 == 0)
			System.out.printf("Numri %d eshte %s %n", num, "cift");
		else
			System.out.printf("Numri %d eshte %s %n", num, "tek");
	}
}