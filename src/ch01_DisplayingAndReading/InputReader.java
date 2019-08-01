package ch01_DisplayingAndReading;

import java.util.*;
public class InputReader {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type your name: ");//prompt
		String name = in.nextLine();
		System.out.print("Type your age: ");
		int age = in.nextInt();
		//System.out.println("Your name is "+name +
		//	" and you are " + age + " old.");
		System.out.printf(
		"Your name is %s and you are %d old.%n",
			name,age);
		//System.out.format = System.out.printf
	}
}

