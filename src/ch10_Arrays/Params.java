package ch10_Arrays;

public class Params {

	public static void main(String[] args) {
		
		int sum = sum(new int[] {3,5,6,7,2,6});
		System.out.println(sum);
		sum = sum(2,3,6,10,6,23);
		System.out.println(sum);
		sum = sum();
		System.out.println(sum);
	}
	
	public static int sum(int... params) {
		int sum = 0;
		for (int num : params)
			sum += num;
		return sum;
	}

}
