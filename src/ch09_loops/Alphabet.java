package ch09_loops;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Alphabet {

	public static void main(String[] args) {
		
		for (char c = 'a'; c <= 'z';c++ )
			System.out.print(c);
		System.out.println();
		for (char c = 'z'; c >= 'a';c--)
			System.out.print(c);
		System.out.println();
		
		String s = "HelloWorld";
		for (int i = 0;i <s.length(); i++)
			System.out.print(s.charAt(i) + " ");
		System.out.println();
	}

}
