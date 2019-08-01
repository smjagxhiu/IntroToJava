package ch06and07_DecissionStructures;
import java.util.Scanner;

public class KrahasimiIStringjeve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Stringu i pare: ");
		String s1 = in.nextLine();
		System.out.print("Stringu i dyte: ");
		String s2 = in.nextLine();
		if (s1.compareTo(s2) == 0) 
			System.out.printf("%s dhe %s jane stringje te njejta%n",s1,s2);
		else if (s1.compareTo(s2) < 0) 
			System.out.printf("%s me reditje alfabetike vjen para %s%n", s1,s2);
		else 
			System.out.printf("%s me reditje alfabetike vjen para %s%n", s2,s1);
			
	}// end of main
}
