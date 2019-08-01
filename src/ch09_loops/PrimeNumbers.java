package ch09_loops;

public class PrimeNumbers {
	
	public static boolean isPrime(int n) {
		if (n > 2 && n % 2 == 0)
			return false;
		int upperLimit = (int)Math.sqrt(n) + 1;
		for (int i = 3; i <= upperLimit; i+=2) 
			if (n % i == 0)
				return false;
		return true;
	}
	
	public static void printUpTo(int n) {
		for (int i = 2; i <= n; i++)
			if (isPrime(i))
				System.out.print(i + " ");
		System.out.println();
	}
	
	public static void printUpTo2(int n) {
		for (int i = 2; i <= n; i++) {
			if (!isPrime(i))
				continue;
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void printOddNumbers(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)
				continue;
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int n = 97;
		if (isPrime(n))
			System.out.printf("%d eshte numer i thjeshte %n",n);
		else System.out.printf("%d nuk eshte numer i thjeshte %n",n);
		n = 100;
		printUpTo(n);
	}

}
