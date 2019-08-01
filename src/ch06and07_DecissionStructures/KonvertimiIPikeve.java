package ch06and07_DecissionStructures;
import java.util.Scanner;

public class KonvertimiIPikeve {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Piket (0.100): ");
		double piket = in.nextDouble();
		char nota;
		/*
		 * if (piket > 60 && piket < 70) { nota = 'D'; } else { if (piket >= 70 && piket
		 * < 80) { nota = 'C'; } else { if (piket >= 80 && piket < 90) { nota = 'B'; }
		 * else { if (piket >= 90) { nota = 'A'; } else { nota = 'F'; } } } }
		 */

		if (piket > 60 && piket < 70)
			nota = 'D';
		else if (piket >= 70 && piket < 80)
			nota = 'C';
		else if (piket >= 80 && piket < 90)
			nota = 'B';
		else if (piket >= 90)
			nota = 'A';
		else
			nota = 'F';

		System.out.printf("%.1f pike rezulton ne noten %c %n", piket, nota);

		// int x;
		// System.out.println(x + 4 * 3);
	}

}
