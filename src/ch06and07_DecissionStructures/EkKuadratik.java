package ch06and07_DecissionStructures;
import java.util.Scanner;

public class EkKuadratik {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Koeficienti a: ");
		double a = in.nextDouble();
		System.out.print("Koeficienti b: ");
		double b = in.nextDouble();
		System.out.print("Koeficienti c: ");
		double c = in.nextDouble();
		double D = b * b - 4 * a * c;
		System.out.println("Vlera e diskriminantes: D = "+D);
		if (D == 0) {
			double x = -b / (2 * a);
			System.out.println("Ekuacioni ka nje zgjidhje: "+ x);
		} else if (D > 0) {
			double x1 = (-b + Math.sqrt(D)) / (2* a);
			double x2 = (-b - Math.sqrt(D)) / (2* a);
			System.out.printf("Ekuacioni ka dy zgjidhje: %.2f dhe %.2f%n", 
					x1,x2);
		} else  //if(D < 0)
			System.out.println("Ekuacioni nuk asnje zgjidhje.");
		
	}

}
