package ch10_Arrays;
import java.math.BigInteger;

public class RandomArray {
	
	// array with random numbers
	public static int[] generate(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int)Math.round(Math.random() * 100);
		return arr;
	}
	
	public static void print(int[] arr) {
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();
	}
	
	public static BigInteger product(int[] arr) {
		
		BigInteger product = new BigInteger("1");
		for (int num: arr) {
			product = product.multiply(new BigInteger(num + ""));
		}
		return product;
	}
	// sum(), max()
	
	public static double avg(int[] arr) {
		int sum = 0;
		for (int num : arr)
			sum += num;
		return (double)sum/arr.length;
	}
	
	public static int min(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (arr[i] <= min)
				min = arr[i];
		return min;
	}

	public static void main(String[] args) {
		int[] arr = new int[20];
		print(arr);
		arr = generate(arr);
		print(arr);
		BigInteger p = product(arr);
		System.out.println("Product is "+p.toString() );
		System.out.println("Avg is "+ avg(arr));
		System.out.println("Min is "+ min(arr));
	}

}
