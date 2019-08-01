package ch09_loops;

public class Figura {

	public static void main(String[] args) {
		
		int n = 7;
		String charToPrint = "*";
		String space = " ";
		// a)
		for (int i = 0; i < n;i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(charToPrint);
			System.out.println();
		}
		System.out.println();
		//b)
		for (int i = n -1; i >= 0; i--) {
			for (int j = 0; j <= i; j++)
				System.out.print(charToPrint);
		System.out.println();
		}
		System.out.println();
		for (int i = n-1; i >= 0;i--) {
			for (int j = 0; j < i; j++)
				System.out.print(space);
			for (int k = 0; k < n-i; k++)
				System.out.print(charToPrint);
			System.out.println();
		}
		
		System.out.println();
		for (int row = 0,number_spaces = n-1; row <n;row++,number_spaces--) {
			for (int j = 0; j < number_spaces; j++)
				System.out.print(space);
			for (int k = 0; k <= row; k++)
				System.out.print(charToPrint + charToPrint);
			System.out.println();
		}
	}

}
