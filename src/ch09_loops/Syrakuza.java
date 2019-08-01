package ch09_loops;

public class Syrakuza {
	
	public static void print(int x) {
		if (x <= 0) {
			System.err.printf(
					"%d is not a valid input for this sequence%n",x);
			//System.exit(0);
			return;
		}
		String res = x+ " ";
		while(x != 1) {
			if (x % 2 == 0)
				x = x/2;
			else x = 3 * x + 1;
			res += x + " ";
		}
		System.out.println("Sequence: " + res);
		// String res = "";
		// for ( ; x != 1; x = x%2==0?x/2:3*x+1 )
			//res += x + " ";
		
	}

	public static void main(String[] args) {
		int x = 5;
		print(x);
		System.out.println("Program terminated normally");
	}

}
