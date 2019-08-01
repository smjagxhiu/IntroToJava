package ch09_loops;


public class Factoriel {
	
	public static long f(int n) {
		if (n < 0) return 0;
		if (n == 0) return 1;
		
		long f = 1;
		for (int i = 1; i <= n; i++)
			f *= i;
		return f;
	}

	public static void main(String[] args) {
		int n = 56;
		System.out.printf("%d! = %d %n", n, f(n));

	}

}
