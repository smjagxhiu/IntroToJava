package ch09_loops;

public class Produkti {
	
	public static long calc(int a, int b, int n) {
		int y = a;
		long p = 1;
		for (int i = 1; i <= n + 1; i++) {
			if (i == 3)
				continue;
			p *= (a * i + b);
		}
		return y + p;
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int n =10;
		System.out.printf(
				"y = %d %n", calc(a,b,n) );

	}

}
