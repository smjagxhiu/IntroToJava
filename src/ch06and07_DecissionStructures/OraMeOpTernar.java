package ch06and07_DecissionStructures;
import java.util.Scanner;

public class OraMeOpTernar {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Oret: ");
		int h = in.nextInt();
		System.out.print("Minutat: ");
		int min = in.nextInt();
		String result = h < 0 || h > 24 || min < 0 || min >= 60 ? 
				"ERROR: Input not valid" : 
					(h >= 13 ? h-12 : h == 0 ? 12 : h) + ":" +  
				(min < 10 ? "0" :"") + min + ( h > 12 ? " p.m" : " a.m") ;
		System.out.println(result);

	}

}
