package ch06and07_DecissionStructures;
import java.util.Scanner;

public class OretDheMinutatNeSekonda2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Oret: ");
		int h = in.nextInt();
		System.out.print("Minutat: ");
		int min = in.nextInt();
		if (h >= 0) {
			if (min >= 0 && min <60) {
				int sekondat = h * 60 * 60 + min * 60; 
				System.out.printf("%d ore dhe %d minuta bejne %d %n", 
						h,min,sekondat);
			} else System.out.println("Minutat duhet te jene prej 0 deri 59");
		} else System.out.println("Oret duhet te jene > 0");
		
		
	}

}
