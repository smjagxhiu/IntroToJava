package ch10_Arrays;

public class GoldBach {
	
	public static boolean isPrime(int n) {
		if (n % 2 == 0)
			return false;
		for (int i = 3; i <= (int)Math.sqrt(n);i += 2)
			if (n % i == 0)
				return false;
		return true;
	}
	
	public static int[] getPrimeNumbersUpTo(int n) {
		int[] temp = new int[n];
		int count = 0;
		for (int num = 2; num <n; num++)
			if (isPrime(num)) {
				temp[count] = num;
				count++;
			}
		int[] arr = new int[count];
		for (int i = 0; i < count; i++)
			arr[i] = temp[i];
		temp = null;
		return arr;
		
	}
	
	
	public static int[] goldbach(int num) {
		if (num % 2 == 1)
			return new int[2];
		int res[] = new int[2];
		int[] primes = getPrimeNumbersUpTo(num);
		for (int i = 0; i < primes.length - 1; i++)
			for (int j = i; j < primes.length; j++)
				if (primes[i] + primes[j] == num) 
					return new int[] {primes[i],primes[j]};		
		return res;
	}

	public static void main(String[] args) {
		int n = 8;
		int[] twoNums = goldbach(n);
		System.out.printf("%d + %d = %d %n", twoNums[0],twoNums[1],n);
	}

}
