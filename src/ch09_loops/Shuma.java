package ch09_loops;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Shuma {

	
	
	public static int sumOfOddN2(int n) {
		int sum = 0;
		int counter = 1;
		while (counter <= 2 * n - 1) {
			if (counter % 2 == 1) sum += counter;
			counter++;
		}
		System.out.println("Numri i iterimeve: " + counter);
		return sum;
	}
	
	public static int sumOfOddN(int n) {
		int sum = 0;
		int counter = 1;
		while (counter <= 2 * n - 1) {
			sum += counter; // sum = sum + counter
			counter += 2; // counter = counter + 2
		}
		System.out.println("Numri i iterimeve: " + counter/2);
		return sum;
	}
	
	
	
	public static void printSumOfN() {
		int n = Integer.parseInt(
				JOptionPane.showInputDialog("Type a number greater then 3!") );
		if ( n < 3) {
			JOptionPane.showMessageDialog(null,"Inputi jo valid");
			System.err.println("Inputi jo valid");
			System.exit(0);
		}
			
		int sum = 0;
		int counter = 1;
		while (counter <= n) {
			sum += counter; // sum = sum + counter;
			counter++;
		}
		String message = String.format("1 + 2 + ... + %d = %d",n,sum);
		System.out.println(message);
		JOptionPane.showMessageDialog(null,message);
	}
	
	public static int sumOfN(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i;
		return sum;
	}
	
	public static void main(String[] args) {
		//printSumOfN();
		int n = 10;
		System.out.printf("1 + 3 + ... + %d = %d %n",2* n - 1,sumOfOddN(n) );
		System.out.printf("1 + 3 + ... + %d = %d %n",2* n - 1,sumOfOddN2(n) );
		System.out.println("Shuma e numrave eshte " + sumOfN(n));
	}

}
