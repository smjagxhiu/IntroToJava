package ch02_ArythmeticAndVariables;

import java.util.*;

public class Total {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Sa Gjsyma? ");
		int gjysma = in.nextInt();
		System.out.print("Sa Njezeta? ");
		int njezeta = in.nextInt();
		System.out.print("Sa dhjeta? ");
		int dhjeta = in.nextInt();
		System.out.print("Sa pesa? ");
		int pesa = in.nextInt();
		System.out.print("Sa qindarka? ");
		int qindarka = in.nextInt();
		System.out.println("Per keto grupe monedhash kemi:");
		System.out.printf("Gjysma = %d%n", gjysma);
		System.out.printf("Njezeta = %d%n", njezeta);
		System.out.printf("Dhjeta = %d%n", dhjeta);
		System.out.printf("Pesa = %d%n", pesa);
		System.out.printf("Qindarka = %d%n", qindarka);
		int total = (gjysma * 50) + (njezeta * 20) + (dhjeta * 10) + (pesa * 5) + qindarka;
		System.out.printf("Shuma totale eshte %d cente.%n", total);
	}
}