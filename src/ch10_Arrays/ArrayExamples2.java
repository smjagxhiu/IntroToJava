package ch10_Arrays;

// Detyrat 2 dhe 4 kapitulli 10
public class ArrayExamples2 {

	public static void main(String[] args) {
		
		int[] power_of_two = new int[10];
		for (int i = 0; i < power_of_two.length; i++)
			power_of_two[i] = (int)Math.pow(2, i);
		
		for (int i = 0; i < power_of_two.length; i++) {
			if (i == 5)
				continue;
			System.out.print(power_of_two[i] + " ");
		} //- nuk mund te behet me for-each
		System.out.println();
		//for each
		for (int num : power_of_two)
			System.out.print(num + " ");
		System.out.println();
		
		double[] reciprocals = new double[10];
		for (int i = 0; i < reciprocals.length; i++)
			reciprocals[i] = 1.0/i;
		
		for (double num : reciprocals)
			System.out.printf("%.3f ",num);
		System.out.println();
	}

}
