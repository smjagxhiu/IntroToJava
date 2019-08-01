package ch09_loops;

public class Trigonometry {
	
	
	public static double sin(double x) {
		double sum = 0;
		int sign = 1;
		for(int i = 1; i <= 19; i = i + 2) {
			long f = Factoriel.f(i);
			sum += Math.pow(x, i)/f * sign;
			sign  *= -1;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		double res1 = Math.sin(Math.PI/2);
		System.out.printf("Math.sin(%.2f) = %.2f%n",
				3 * Math.PI/2, res1);
		double res2 = sin(Math.PI/2);
		System.out.printf("Trigonometry.sin(%.2f) = %.2f%n",
				3 * Math.PI/2, res2);

	}

}
