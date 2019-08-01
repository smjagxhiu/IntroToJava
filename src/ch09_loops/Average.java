package ch09_loops;
import javax.swing.JOptionPane;

public class Average {
	
	public static double avgWithDefinitiveLoop(int n) {
		double sum = 0;
		int counter = 1;
		while (counter <= n) {	
			double points = Double.parseDouble(
					JOptionPane.showInputDialog("Test grade "+counter+": ") );
			sum += points;
			counter++;
		}
		return sum/n;
	}
	
	public static double avgWithInDefinitiveLoop() {
		double sum = 0;
		int flag = -1;
		int no_tests = 0;
		int no_failed_students = 0;
		double max = 0, min = 100;
		double points = Double.parseDouble(JOptionPane.showInputDialog(
				"Test 1: negative value to stop the cycle."));
		while (points > flag) {
			if (points >= max)
				max = points;
			if (points < min)
				min= points;
			sum += points;
			no_tests++;
			if (points < 51)
				no_failed_students++;
			points = Double.parseDouble(JOptionPane.showInputDialog(
					"Test " + (no_tests + 1) + 
					": negative value to stop the cycle."));
		}
		if (no_tests > 0) {
			System.out.println("Number of tests: " + no_tests);
			System.out.printf("Number of students that failed %d %n", 
					no_failed_students);
			System.out.printf("Number of students that passed %d %n", 
					no_tests - no_failed_students);
			System.out.printf("Max points = %.2f %n", max);
			System.out.printf("Min points = %.2f %n", min);
			return sum /  no_tests;
		}
		else {
			System.out.println("No tests.");
			max = min = 0;
			return 0;
		}
	}

}
