package ch02_ArythmeticAndVariables;

public class InkrementiDheDekrementi {
	public static void main(String[] args) {
		int i = 12;
		int j;
		j = i++; // j = 12; i = 13;
		System.out.printf("%c = %d, %c = %d %n", 'i', i, 'j', j);

		int k = 17;
		int m = ++k; // k = 18, m = 18
		System.out.printf("%c = %d, %c = %d %n", 'k', k, 'm', m);

		j = i--; // j = 13, i = 12
		System.out.printf("%c = %d, %c = %d %n", 'i', i, 'j', j);

		k = --m; // m = 17, k = 17
		System.out.printf("%c = %d, %c = %d %n", 'k', k, 'm', m);
	}
}