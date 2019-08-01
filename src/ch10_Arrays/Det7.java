package ch10_Arrays;

public class Det7 {

	public static void main(String[] args) {

		int[][] m = new int[12][14];
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length;j++)
				m[i][j] = i * j;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length;j++)
				System.out.print(m[i][j] + "\t");		
			System.out.println();
		}
			
	}

}
