package ch06and07_DecissionStructures;
import java.util.Scanner;

public class OretDheMinutatNeSekonda {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Oret: ");
		int h = in.nextInt();
		System.out.print("Minutat: ");
		int min = in.nextInt();
		if (h >= 0) {
			if (min >= 0) {
				if (min <= 59) {
					int sekondat = h * 60 * 60 + min * 60; 
					System.out.printf("%d ore dhe %d minuta bejne %d %n", 
							h,min,sekondat);
				}// end of if if (min <= 59)
				else System.out.println("Minutat duhet te jene < 60");
			}// end of if  (min >= 0) 
			else System.out.println("Minutat duhet te jene > 0");
		}// end of if (h >= 0)
		else System.out.println("Oret duhet te jene > 0");
	}

}
