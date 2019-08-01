package ch10_Arrays;

public class Det9 {

	// right click the code editor -> Run as -> Run Configuration
		// Arguments Tab, under the program arguments write one string that is number
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int[][] m1 = new int[n][n];
		int count = 1;
		for (int i = 0; i < m1.length; i++)
			for (int j = 0; j < m1[i].length; j++)
				m1[i][j] = count++;
		print(m1);
		System.out.println();
		int[][] m2 = new int[n][n];
		count = n * n - 1;
		for (int i = 0; i < m2.length; i++)
			for (int j = 0; j < m2[i].length; j++)
				m2[i][j] = count--;
		print(m2);
		System.out.println();
		m1 = new int[n][n];
		for (int num = 0; num < n * n; num++) {
			int row = num/n;
			int col = num%n;
			m1[row][col] = num +1;
		}
		print(m1);
		System.out.println();
		m2 = new int[n][n];
		for (int num = 0; num < n * n; num++) {
			int row = num/n;
			int col = num%n;
			m2[row][col] = n * n - num - 1;
		}
		print(m2);
	}
	
	public static void print(int[][] m) {
		for (int[] rows : m) {
			for (int num : rows)
				System.out.print(num + "\t");
			System.out.println();
		}
	}

}
