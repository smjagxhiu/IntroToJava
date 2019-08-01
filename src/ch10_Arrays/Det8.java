package ch10_Arrays;

public class Det8 {

	public static void main(String[] args) {
		String[][] m = new String[5][7];
		for (int i = 0; i < m.length; i++) 
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = String.format("Element %d %d", i,j);
				if (j !=  m[i].length - 1)
					m[i][j] += ",  ";
			}
				
		
		for (String[] rows : m) {
			for (String s : rows)
				System.out.print(s);
			System.out.println();
		}
	}

}
