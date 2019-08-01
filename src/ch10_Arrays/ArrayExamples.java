package ch10_Arrays;

public class ArrayExamples {

	public static void main(String[] args) {
		
		int[] a1 = {12,30,50,90};
		System.out.println(a1[1]);
		a1[1] = 22;
		System.out.println(a1[1]);
		//a1[5] = 100; ganim gjate ekzekutimit
		for (int index = 0; index < a1.length; index++) {
			int num = a1[index];
			System.out.print(num + " ");
		}
		System.out.println();
		
		boolean[] a2 = new boolean[3];
		a2[0] = true;
		a2[1] = false;
		a2[2] = false;
		for (int index = 0; index < a2.length; index++) {
			boolean b = a2[index];
			System.out.print(b + " ");
		}
		System.out.println();
		
		int n = 'z' - 'a' + 1;
		char[] a3 = new char[n];
		for (int index = 0; index < a3.length; index++) {
			a3[index] = (char) ('a' + index);
		}
		for (int i = 0; i < a3.length; i++)
			System.out.print(a3[i]);
		System.out.println();
		
	}
	

}
