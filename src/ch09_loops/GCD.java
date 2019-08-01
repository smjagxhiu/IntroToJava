package ch09_loops;

public class GCD {
	
	public static int find(int p, int q) {
		
		while(q != 0) {
			int temp = p;
			p = q;
			q= temp % q;
		}
		return p;
	}

	public static void main(String[] args) {
		
		int p = 66, q = 99;
		System.out.printf("GCD(%d, %d) = %d %n", p,q,
				find(p,q));

	}

}
