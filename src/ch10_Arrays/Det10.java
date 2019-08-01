package ch10_Arrays;

public class Det10 {

	public static void main(String[] args) {
		int n = 4;
		// a)
		int[][] m1 = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j <= i; j++)
				m1[i][j] = j + 1;
		Det9.print(m1);
		System.out.println();
		// b)
		int c = 0;
		int[][] m2 = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				m2[i][j] = j + 1 + c;
			}
			c++;
		}
		Det9.print(m2);
		System.out.println();
		// c)
		int[][] m3 = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if ((i + j) % 2 == 0)
					m3[i][j] = 1;
		Det9.print(m3);
	}

}
