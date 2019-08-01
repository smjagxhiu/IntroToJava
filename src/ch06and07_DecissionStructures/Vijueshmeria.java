package ch06and07_DecissionStructures;
import java.util.Scanner;

public class Vijueshmeria {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Piket: ");
		int piket = in.nextInt();
		System.out.print("Vijueshmeria: ");
		boolean vijueshmeria = in.nextBoolean();
		if (piket >= 50) {
			if (vijueshmeria) {
				System.out.println(
						"Studenti ka ardhur vazhdimisht ne ushtrime");
				System.out.println(
						"Ka plotesuar te dy kushtet per note kaluese");
			}// end of if (vijueshmeria)
			else {
				System.out.println("Studenti edhe pse ka pike te mjaftueshme "
						+ ", nuk ka plotesuar kushtin e vijuesmerise.");
			}// end of else
		}// end of if (piket >= 50)
		else {
			System.out.println("Studenti nuk ka plotesuar kushtin e pikeve");
		}
	} // end of main

}
